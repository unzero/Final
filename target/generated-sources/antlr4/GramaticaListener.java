// Generated from Gramatica.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 */
	void enterMatchFun(GramaticaParser.MatchFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 */
	void exitMatchFun(GramaticaParser.MatchFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(GramaticaParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(GramaticaParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 */
	void enterPrint_fun(GramaticaParser.Print_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 */
	void exitPrint_fun(GramaticaParser.Print_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(GramaticaParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(GramaticaParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(GramaticaParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(GramaticaParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(GramaticaParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(GramaticaParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(GramaticaParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(GramaticaParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyNormal(GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyNormal(GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyMatch(GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyMatch(GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_stmt(GramaticaParser.Match_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_stmt(GramaticaParser.Match_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamet(GramaticaParser.LambdaParametContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamet(GramaticaParser.LambdaParametContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 */
	void enterSub_args(GramaticaParser.Sub_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 */
	void exitSub_args(GramaticaParser.Sub_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(GramaticaParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(GramaticaParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GramaticaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GramaticaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 */
	void enterSub_parameters(GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 */
	void exitSub_parameters(GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(GramaticaParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(GramaticaParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(GramaticaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(GramaticaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(GramaticaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(GramaticaParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssig_stmtVar(GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssig_stmtVar(GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssig_stmtIterable(GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssig_stmtIterable(GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(GramaticaParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(GramaticaParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(GramaticaParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(GramaticaParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(GramaticaParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(GramaticaParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(GramaticaParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(GramaticaParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(GramaticaParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(GramaticaParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 */
	void enterLambda_testset(GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 */
	void exitLambda_testset(GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 */
	void enterLambda_subset(GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 */
	void exitLambda_subset(GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 */
	void enterLambda_test(GramaticaParser.Lambda_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 */
	void exitLambda_test(GramaticaParser.Lambda_testContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_generate(GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_generate(GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_map(GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_map(GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_partition(GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_partition(GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_addition(GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_addition(GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_filter(GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_filter(GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_name(GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_name(GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_tuple(GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_tuple(GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_list(GramaticaParser.Iterable_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_list(GramaticaParser.Iterable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(GramaticaParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(GramaticaParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 */
	void enterSublist_element(GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 */
	void exitSublist_element(GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(GramaticaParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(GramaticaParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 */
	void enterSubmap_element(GramaticaParser.Submap_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 */
	void exitSubmap_element(GramaticaParser.Submap_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestTest(GramaticaParser.TestTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestTest(GramaticaParser.TestTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestOr(GramaticaParser.TestOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestOr(GramaticaParser.TestOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestAnd(GramaticaParser.TestAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestAnd(GramaticaParser.TestAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest_iterable_eq(GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest_iterable_eq(GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestNot(GramaticaParser.TestNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestNot(GramaticaParser.TestNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestExpr(GramaticaParser.TestExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestExpr(GramaticaParser.TestExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest_iterable_in(GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Exit a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest_iterable_in(GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestExprComp(GramaticaParser.TestExprCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestExprComp(GramaticaParser.TestExprCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(GramaticaParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(GramaticaParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExpr(GramaticaParser.ExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExpr(GramaticaParser.ExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(GramaticaParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(GramaticaParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(GramaticaParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(GramaticaParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprModule(GramaticaParser.ExprModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprModule(GramaticaParser.ExprModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiply(GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiply(GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(GramaticaParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(GramaticaParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShiftLeft(GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShiftLeft(GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(GramaticaParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(GramaticaParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShiftRight(GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShiftRight(GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(GramaticaParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(GramaticaParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprXor(GramaticaParser.ExprXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprXor(GramaticaParser.ExprXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDivision(GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDivision(GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomName(GramaticaParser.AtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomName(GramaticaParser.AtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(GramaticaParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(GramaticaParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(GramaticaParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(GramaticaParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDot(GramaticaParser.AtomDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDot(GramaticaParser.AtomDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNone(GramaticaParser.AtomNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNone(GramaticaParser.AtomNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomTrue(GramaticaParser.AtomTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomTrue(GramaticaParser.AtomTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFalse(GramaticaParser.AtomFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFalse(GramaticaParser.AtomFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFuncCall(GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFuncCall(GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIterableAccess(GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIterableAccess(GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIterableDef(GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIterableDef(GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInteger(GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInteger(GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(GramaticaParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(GramaticaParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberComplex(GramaticaParser.NumberComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberComplex(GramaticaParser.NumberComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(GramaticaParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(GramaticaParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GramaticaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GramaticaParser.IntegerContext ctx);
}