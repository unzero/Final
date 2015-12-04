// Generated from Gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFalse(@NotNull GramaticaParser.AtomFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_test(@NotNull GramaticaParser.Lambda_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_fun(@NotNull GramaticaParser.Print_funContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprModule(@NotNull GramaticaParser.ExprModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull GramaticaParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(@NotNull GramaticaParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull GramaticaParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_name(@NotNull GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExprComp(@NotNull GramaticaParser.TestExprCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(@NotNull GramaticaParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(@NotNull GramaticaParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiply(@NotNull GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(@NotNull GramaticaParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(@NotNull GramaticaParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(@NotNull GramaticaParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(@NotNull GramaticaParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNone(@NotNull GramaticaParser.AtomNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(@NotNull GramaticaParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_generate(@NotNull GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(@NotNull GramaticaParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(@NotNull GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(@NotNull GramaticaParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOr(@NotNull GramaticaParser.TestOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig_stmtVar(@NotNull GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(@NotNull GramaticaParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_stmt(@NotNull GramaticaParser.Match_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(@NotNull GramaticaParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_partition(@NotNull GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(@NotNull GramaticaParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamet(@NotNull GramaticaParser.LambdaParametContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig_stmtIterable(@NotNull GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberComplex(@NotNull GramaticaParser.NumberComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(@NotNull GramaticaParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExpr(@NotNull GramaticaParser.TestExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(@NotNull GramaticaParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull GramaticaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivision(@NotNull GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpr(@NotNull GramaticaParser.ExprExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmap_element(@NotNull GramaticaParser.Submap_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDot(@NotNull GramaticaParser.AtomDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(@NotNull GramaticaParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull GramaticaParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchFun(@NotNull GramaticaParser.MatchFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTrue(@NotNull GramaticaParser.AtomTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFuncCall(@NotNull GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_stmt(@NotNull GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIterableDef(@NotNull GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_testset(@NotNull GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublist_element(@NotNull GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestAnd(@NotNull GramaticaParser.TestAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShiftLeft(@NotNull GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_addition(@NotNull GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestNot(@NotNull GramaticaParser.TestNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(@NotNull GramaticaParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInteger(@NotNull GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyNormal(@NotNull GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShiftRight(@NotNull GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_filter(@NotNull GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprXor(@NotNull GramaticaParser.ExprXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(@NotNull GramaticaParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestTest(@NotNull GramaticaParser.TestTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_map(@NotNull GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(@NotNull GramaticaParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_iterable_eq(@NotNull GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(@NotNull GramaticaParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(@NotNull GramaticaParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_iterable_in(@NotNull GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_tuple(@NotNull GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(@NotNull GramaticaParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull GramaticaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyMatch(@NotNull GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_parameters(@NotNull GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(@NotNull GramaticaParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(@NotNull GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_subset(@NotNull GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(@NotNull GramaticaParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(@NotNull GramaticaParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIterableAccess(@NotNull GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(@NotNull GramaticaParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull GramaticaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_args(@NotNull GramaticaParser.Sub_argsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable_list(@NotNull GramaticaParser.Iterable_listContext ctx);
}