import sys
from Analizador import Analizador
try:
    import pygtk
    pygtk.require("2.0")
except:
    print("Error")
    pass
try:
    import gtk
    import gtk.glade
except:
    print("Error")
    sys.exit(1)
    
class VentanaPrincipal:

    def __init__(self):
        filename = "./VentanaPrincipal.glade"
        self.builder = gtk.Builder()
        self.builder.add_from_file(filename)
        self.builder.connect_signals(self)
        self.window = self.builder.get_object("window")
        self.window.show()
        self.window.set_title("Airi")
        self.filename = None
        self.getComponent("input_textview").place_cursor_onscreen()
        
        
    def getComponent(self,name):
        return self.builder.get_object(name)


    def on_nuevo_mitem_activate(self, menuitem, data=None):
    
        if self.check_for_save(): self.on_guardar_mitem_activate(None, None)
        
        # clear editor for a new file
        buff = self.getComponent("input_textview").get_buffer()
        buff.set_text("")
        buff.set_modified(False)
        self.filename = None
        #self.reset_default_status()
    
   
    def on_abrir_mitem_activate(self, menuitem, data=None):
        self.getComponent("spinner1").start()
        if self.check_for_save(): self.on_guardar_mitem_activate(None, None)
        filename = self.get_open_filename()
        if filename: self.load_file(filename)
        self.getComponent("spinner1").stop()
    
    

    def on_window_delete_event(self, widget, event, data=None):
        self.getComponent("spinner1").start()
        if self.check_for_save(): self.on_guardar_mitem_activate(None, None)
        self.getComponent("spinner1").stop()
        return False # Propogate event   
       
       
    def on_guardar_mitem_activate(self, menuitem, data=None):
        self.getComponent("spinner1").start()
        if self.filename == None: 
            filename = self.get_save_filename()
            if filename: self.write_file(filename)
        else: self.write_file(None)
        self.getComponent("spinner1").stop()
        
        
        
    def write_file(self, filename):
        # add Saving message to status bar and ensure GUI is current
        if filename:
            pass 
            #self.statusbar.push(self.statusbar_cid, "Saving %s" % filename)
        else:
            pass
            #self.statusbar.push(self.statusbar_cid, "Saving %s" % self.filename)
            
        while gtk.events_pending(): gtk.main_iteration()
        
        try:
            buff = self.getComponent("input_textview").get_buffer()
            self.getComponent("input_textview").set_sensitive(False)
            text = buff.get_text(buff.get_start_iter(), buff.get_end_iter())
            self.getComponent("input_textview").set_sensitive(True)
            buff.set_modified(False)
            if filename: fout = open(filename, "w")
            else: fout = open(self.filename, "w")
            fout.write(text)
            fout.close()
            if filename: self.filename = filename

        except:
            # error writing file, show message to user
            self.error_message ("No se ha podido guardar el archivo: %s" % filename)
 
        
        
    def check_for_save (self):
        ret = False
        buff = self.getComponent("input_textview").get_buffer()
        if buff.get_modified():
            message = "Desea guardar sus cambios?"
            dialog = gtk.MessageDialog(self.window,
                                       gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                                       gtk.MESSAGE_QUESTION, gtk.BUTTONS_YES_NO, 
                                       message)
            dialog.set_title("Guardar?")
            if dialog.run() == gtk.RESPONSE_NO: ret = False
            else: ret = True
            dialog.destroy()
        
        return ret        
        
        
    def get_save_filename(self):
        filename = None
        chooser = gtk.FileChooserDialog("Guardar archivo...", self.window,
                                        gtk.FILE_CHOOSER_ACTION_SAVE,
                                        (gtk.STOCK_CANCEL, gtk.RESPONSE_CANCEL, 
                                         gtk.STOCK_SAVE, gtk.RESPONSE_OK))
        
        response = chooser.run()
        if response == gtk.RESPONSE_OK: filename = chooser.get_filename()
        chooser.destroy()
        return filename
        
          
    def load_file(self, filename):
        while gtk.events_pending(): gtk.main_iteration()
        try:
            fin = open(filename, "r")
            text = fin.read()
            fin.close()
            self.getComponent("input_textview").set_sensitive(False)
            buff = self.getComponent("input_textview").get_buffer()
            buff.set_text(text)
            buff.set_modified(False)
            self.getComponent("input_textview").set_sensitive(True)
            self.filename = filename
        except:
            self.error_message ("No se ha podido abrir el archivo: %s" % filename)
        self.getComponent("spinner1").stop()
        
        
    def get_open_filename(self):
        filename = None
        chooser = gtk.FileChooserDialog("Abrir Archivo...", self.window,
                                        gtk.FILE_CHOOSER_ACTION_OPEN,
                                        (gtk.STOCK_CANCEL, gtk.RESPONSE_CANCEL, 
                                         gtk.STOCK_OPEN, gtk.RESPONSE_OK))
        response = chooser.run()
        if response == gtk.RESPONSE_OK: filename = chooser.get_filename()
        chooser.destroy()
        
        return filename    
        
        
    def on_guardarcomo_mitem_activate(self, menuitem, data=None):    
        self.getComponent("spinner1").start()
        filename = self.get_save_filename()
        if filename: self.write_file(filename)
        self.getComponent("spinner1").stop()
    
    
    def on_salir_mitem_activate(self, menuitem, data=None):
        self.getComponent("spinner1").start()
        if self.check_for_save(): self.on_guardar_mitem_activate(None, None)
        self.getComponent("spinner1").stop()
        gtk.main_quit()
    
    
    def error_message(self, message):
        dialog = gtk.MessageDialog(None,
                                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                                   gtk.MESSAGE_ERROR, gtk.BUTTONS_OK, message)    
        dialog.run()
        dialog.destroy()
    
    
    def on_ejecutar_mitem_activate(self,menuItem,data=None):
        self.getComponent("spinner1").start()
        self.getComponent("input_textview").set_sensitive(False)
        buff = self.getComponent("input_textview").get_buffer()
        text = buff.get_text(buff.get_start_iter(), buff.get_end_iter())
        analizador = Analizador()
        ret = analizador.analizarCadena(text)
        self.getComponent("input_textview").set_sensitive(True)
        
        buff = self.getComponent("console_textview").get_buffer()
        buff.set_text(ret)
        self.getComponent("spinner1").stop()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    # Called when the user clicks the 'Cut' menu.
    def on_cut_menu_item_activate(self, menuitem, data=None):

        buff = self.text_view.get_buffer();
        buff.cut_clipboard (gtk.clipboard_get(), True);
        
    # Called when the user clicks the 'Copy' menu.    
    def on_copy_menu_item_activate(self, menuitem, data=None):
    
        buff = self.text_view.get_buffer();
        buff.copy_clipboard (gtk.clipboard_get());
    
    # Called when the user clicks the 'Paste' menu.    
    def on_paste_menu_item_activate(self, menuitem, data=None):
    
        buff = self.text_view.get_buffer();
        buff.paste_clipboard (gtk.clipboard_get(), None, True);
    
    # Called when the user clicks the 'Delete' menu.    
    def on_delete_menu_item_activate(self, menuitem, data=None):
        
        buff = self.text_view.get_buffer();
        buff.delete_selection (False, True);
        
      # Called when the user clicks the 'About' menu. We use gtk_show_about_dialog() 
    # which is a convenience function to show a GtkAboutDialog. This dialog will
    # NOT be modal but will be on top of the main application window.    
    def on_about_menu_item_activate(self, menuitem, data=None):
    
        if self.about_dialog: 
            self.about_dialog.present()
            return
        
        authors = [
        "Micah Carrick <email@micahcarrick.com>"
        ]

        about_dialog = gtk.AboutDialog()
        about_dialog.set_transient_for(self.window)
        about_dialog.set_destroy_with_parent(True)
        about_dialog.set_name("GTK+ Text Editor")
        about_dialog.set_version("0.1")
        about_dialog.set_copyright("Copyright \xc2\xa9 2007 Micah Carrick")
        about_dialog.set_website("http://www.micahcarrick.com")
        about_dialog.set_comments("GTK+ and Glade3 GUI Programming Tutorial")
        about_dialog.set_authors            (authors)
        about_dialog.set_logo_icon_name     (gtk.STOCK_EDIT)
        
        # callbacks for destroying the dialog
        def close(dialog, response, editor):
            editor.about_dialog = None
            dialog.destroy()
            
        def delete_event(dialog, event, editor):
            editor.about_dialog = None
            return True
                    
        about_dialog.connect("response", close, self)
        about_dialog.connect("delete-event", delete_event, self)
        
        self.about_dialog = about_dialog
        about_dialog.show()

    # We call error_message() any time we want to display an error message to 
    # the user. It will both show an error dialog and log the error to the 
    # terminal window. 
        
    #def reset_default_status(self):
        
        #if self.filename: status = "File: %s" % os.path.basename(self.filename)
        #else: status = "File: (UNTITLED)"
        
        #self.statusbar.pop(self.statusbar_cid)
        #self.statusbar.push(self.statusbar_cid, status)

    def run(self):
        #hwg = HellowWorldGTK()
        gtk.main()