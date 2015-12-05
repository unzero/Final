// Generated from Gramatica.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchFun(GramaticaParser.MatchFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(GramaticaParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GramaticaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_fun(GramaticaParser.Print_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(GramaticaParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(GramaticaParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(GramaticaParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(GramaticaParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyNormal(GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyMatch(GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_stmt(GramaticaParser.Match_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamet(GramaticaParser.LambdaParametContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GramaticaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_args(GramaticaParser.Sub_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(GramaticaParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GramaticaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_parameters(GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_stmt(GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(GramaticaParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(GramaticaParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(GramaticaParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig_stmtVar(GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig_stmtIterable(GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(GramaticaParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(GramaticaParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(GramaticaParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(GramaticaParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(GramaticaParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_testset(GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_subset(GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_test(GramaticaParser.Lambda_testContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_generate(GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_map(GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_partition(GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_addition(GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_filter(GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_name(GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_tuple(GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_list(GramaticaParser.Iterable_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(GramaticaParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublist_element(GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(GramaticaParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmap_element(GramaticaParser.Submap_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestTest(GramaticaParser.TestTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOr(GramaticaParser.TestOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestAnd(GramaticaParser.TestAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_iterable_eq(GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestNot(GramaticaParser.TestNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExpr(GramaticaParser.TestExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_iterable_in(GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExprComp(GramaticaParser.TestExprCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(GramaticaParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpr(GramaticaParser.ExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(GramaticaParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(GramaticaParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprModule(GramaticaParser.ExprModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiply(GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(GramaticaParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShiftLeft(GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(GramaticaParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShiftRight(GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(GramaticaParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprXor(GramaticaParser.ExprXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivision(GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(GramaticaParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(GramaticaParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(GramaticaParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDot(GramaticaParser.AtomDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNone(GramaticaParser.AtomNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTrue(GramaticaParser.AtomTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFalse(GramaticaParser.AtomFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFuncCall(GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIterableAccess(GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIterableDef(GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInteger(GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(GramaticaParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberComplex(GramaticaParser.NumberComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(GramaticaParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GramaticaParser.IntegerContext ctx);
}