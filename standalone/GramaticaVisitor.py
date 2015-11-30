# Generated from Gramatica.g4 by ANTLR 4.5.1
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by GramaticaParser.

class GramaticaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GramaticaParser#matchFun.
    def visitMatchFun(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#single_input.
    def visitSingle_input(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#stmt.
    def visitStmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#print_fun.
    def visitPrint_fun(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#import_stmt.
    def visitImport_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#import_name.
    def visitImport_name(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#import_from.
    def visitImport_from(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#funcdef.
    def visitFuncdef(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#funcBodyNormal.
    def visitFuncBodyNormal(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#funcBodyMatch.
    def visitFuncBodyMatch(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#match_stmt.
    def visitMatch_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#lambdaParamet.
    def visitLambdaParamet(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#args.
    def visitArgs(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#sub_args.
    def visitSub_args(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#func_call.
    def visitFunc_call(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#parameters.
    def visitParameters(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#sub_parameters.
    def visitSub_parameters(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#if_stmt.
    def visitIf_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#elif_stmt.
    def visitElif_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#else_stmt.
    def visitElse_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#while_stmt.
    def visitWhile_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#return_stmt.
    def visitReturn_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#assig_stmtVar.
    def visitAssig_stmtVar(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#assig_stmtIterable.
    def visitAssig_stmtIterable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#for_stmt.
    def visitFor_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#flow_stmt.
    def visitFlow_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#break_stmt.
    def visitBreak_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#continue_stmt.
    def visitContinue_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#try_stmt.
    def visitTry_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#del_stmt.
    def visitDel_stmt(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#except_clause.
    def visitExcept_clause(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#lambda_testset.
    def visitLambda_testset(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#lambda_subset.
    def visitLambda_subset(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#lambda_test.
    def visitLambda_test(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_generate.
    def visitIterable_generate(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_map.
    def visitIterable_map(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_partition.
    def visitIterable_partition(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_addition.
    def visitIterable_addition(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_filter.
    def visitIterable_filter(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_name.
    def visitIterable_name(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_tuple.
    def visitIterable_tuple(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#iterable_list.
    def visitIterable_list(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#list_element.
    def visitList_element(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#sublist_element.
    def visitSublist_element(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#map_element.
    def visitMap_element(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#submap_element.
    def visitSubmap_element(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testTest.
    def visitTestTest(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testOr.
    def visitTestOr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testAnd.
    def visitTestAnd(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#test_iterable_eq.
    def visitTest_iterable_eq(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testNot.
    def visitTestNot(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testExpr.
    def visitTestExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#test_iterable_in.
    def visitTest_iterable_in(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#testExprComp.
    def visitTestExprComp(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprAtom.
    def visitExprAtom(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprExpr.
    def visitExprExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprPlus.
    def visitExprPlus(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprMinus.
    def visitExprMinus(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprModule.
    def visitExprModule(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprMultiply.
    def visitExprMultiply(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprOr.
    def visitExprOr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprShiftLeft.
    def visitExprShiftLeft(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprAnd.
    def visitExprAnd(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprShiftRight.
    def visitExprShiftRight(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprPower.
    def visitExprPower(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprXor.
    def visitExprXor(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#exprDivision.
    def visitExprDivision(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#AtomName.
    def visitAtomName(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#AtomNumber.
    def visitAtomNumber(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#AtomString.
    def visitAtomString(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomDot.
    def visitAtomDot(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomNone.
    def visitAtomNone(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomTrue.
    def visitAtomTrue(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomFalse.
    def visitAtomFalse(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomFuncCall.
    def visitAtomFuncCall(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomIterableAccess.
    def visitAtomIterableAccess(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#atomIterableDef.
    def visitAtomIterableDef(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#NumberInteger.
    def visitNumberInteger(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#NumberFloat.
    def visitNumberFloat(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#NumberComplex.
    def visitNumberComplex(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#comp_op.
    def visitComp_op(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GramaticaParser#integer.
    def visitInteger(self, ctx):
        return self.visitChildren(ctx)


