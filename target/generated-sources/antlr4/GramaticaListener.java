// Generated from Gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFalse(@NotNull GramaticaParser.AtomFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFalse}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFalse(@NotNull GramaticaParser.AtomFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 */
	void enterLambda_test(@NotNull GramaticaParser.Lambda_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_test}.
	 * @param ctx the parse tree
	 */
	void exitLambda_test(@NotNull GramaticaParser.Lambda_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 */
	void enterPrint_fun(@NotNull GramaticaParser.Print_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print_fun}.
	 * @param ctx the parse tree
	 */
	void exitPrint_fun(@NotNull GramaticaParser.Print_funContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprModule(@NotNull GramaticaParser.ExprModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprModule}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprModule(@NotNull GramaticaParser.ExprModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull GramaticaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull GramaticaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(@NotNull GramaticaParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(@NotNull GramaticaParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull GramaticaParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull GramaticaParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_name(@NotNull GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_name}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_name(@NotNull GramaticaParser.Iterable_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestExprComp(@NotNull GramaticaParser.TestExprCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testExprComp}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestExprComp(@NotNull GramaticaParser.TestExprCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(@NotNull GramaticaParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(@NotNull GramaticaParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(@NotNull GramaticaParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(@NotNull GramaticaParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiply(@NotNull GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultiply}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiply(@NotNull GramaticaParser.ExprMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(@NotNull GramaticaParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(@NotNull GramaticaParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(@NotNull GramaticaParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(@NotNull GramaticaParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomName(@NotNull GramaticaParser.AtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomName(@NotNull GramaticaParser.AtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(@NotNull GramaticaParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(@NotNull GramaticaParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNone(@NotNull GramaticaParser.AtomNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNone}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNone(@NotNull GramaticaParser.AtomNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull GramaticaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull GramaticaParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_generate(@NotNull GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_generate}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_generate(@NotNull GramaticaParser.Iterable_generateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull GramaticaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull GramaticaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(@NotNull GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(@NotNull GramaticaParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(@NotNull GramaticaParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(@NotNull GramaticaParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestOr(@NotNull GramaticaParser.TestOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testOr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestOr(@NotNull GramaticaParser.TestOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssig_stmtVar(@NotNull GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assig_stmtVar}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssig_stmtVar(@NotNull GramaticaParser.Assig_stmtVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(@NotNull GramaticaParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(@NotNull GramaticaParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_stmt(@NotNull GramaticaParser.Match_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_stmt(@NotNull GramaticaParser.Match_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(@NotNull GramaticaParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(@NotNull GramaticaParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_partition(@NotNull GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_partition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_partition(@NotNull GramaticaParser.Iterable_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(@NotNull GramaticaParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(@NotNull GramaticaParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamet(@NotNull GramaticaParser.LambdaParametContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambdaParamet}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamet(@NotNull GramaticaParser.LambdaParametContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssig_stmtIterable(@NotNull GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assig_stmtIterable}
	 * labeled alternative in {@link GramaticaParser#assig_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssig_stmtIterable(@NotNull GramaticaParser.Assig_stmtIterableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberComplex(@NotNull GramaticaParser.NumberComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberComplex}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberComplex(@NotNull GramaticaParser.NumberComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(@NotNull GramaticaParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(@NotNull GramaticaParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestExpr(@NotNull GramaticaParser.TestExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testExpr}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestExpr(@NotNull GramaticaParser.TestExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(@NotNull GramaticaParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(@NotNull GramaticaParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull GramaticaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull GramaticaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDivision(@NotNull GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDivision(@NotNull GramaticaParser.ExprDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExpr(@NotNull GramaticaParser.ExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExpr(@NotNull GramaticaParser.ExprExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 */
	void enterSubmap_element(@NotNull GramaticaParser.Submap_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#submap_element}.
	 * @param ctx the parse tree
	 */
	void exitSubmap_element(@NotNull GramaticaParser.Submap_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDot(@NotNull GramaticaParser.AtomDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomDot}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDot(@NotNull GramaticaParser.AtomDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(@NotNull GramaticaParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(@NotNull GramaticaParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull GramaticaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull GramaticaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 */
	void enterMatchFun(@NotNull GramaticaParser.MatchFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#matchFun}.
	 * @param ctx the parse tree
	 */
	void exitMatchFun(@NotNull GramaticaParser.MatchFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomTrue(@NotNull GramaticaParser.AtomTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTrue}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomTrue(@NotNull GramaticaParser.AtomTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFuncCall(@NotNull GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFuncCall}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFuncCall(@NotNull GramaticaParser.AtomFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(@NotNull GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(@NotNull GramaticaParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIterableDef(@NotNull GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomIterableDef}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIterableDef(@NotNull GramaticaParser.AtomIterableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 */
	void enterLambda_testset(@NotNull GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_testset}.
	 * @param ctx the parse tree
	 */
	void exitLambda_testset(@NotNull GramaticaParser.Lambda_testsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 */
	void enterSublist_element(@NotNull GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sublist_element}.
	 * @param ctx the parse tree
	 */
	void exitSublist_element(@NotNull GramaticaParser.Sublist_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestAnd(@NotNull GramaticaParser.TestAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testAnd}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestAnd(@NotNull GramaticaParser.TestAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShiftLeft(@NotNull GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShiftLeft}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShiftLeft(@NotNull GramaticaParser.ExprShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_addition(@NotNull GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_addition}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_addition(@NotNull GramaticaParser.Iterable_additionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestNot(@NotNull GramaticaParser.TestNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testNot}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestNot(@NotNull GramaticaParser.TestNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(@NotNull GramaticaParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(@NotNull GramaticaParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInteger(@NotNull GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInteger(@NotNull GramaticaParser.NumberIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyNormal(@NotNull GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyNormal}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyNormal(@NotNull GramaticaParser.FuncBodyNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShiftRight(@NotNull GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShiftRight}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShiftRight(@NotNull GramaticaParser.ExprShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_filter(@NotNull GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_filter}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_filter(@NotNull GramaticaParser.Iterable_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprXor(@NotNull GramaticaParser.ExprXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprXor(@NotNull GramaticaParser.ExprXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(@NotNull GramaticaParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(@NotNull GramaticaParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestTest(@NotNull GramaticaParser.TestTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testTest}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestTest(@NotNull GramaticaParser.TestTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_map(@NotNull GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_map}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_map(@NotNull GramaticaParser.Iterable_mapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(@NotNull GramaticaParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(@NotNull GramaticaParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest_iterable_eq(@NotNull GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code test_iterable_eq}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest_iterable_eq(@NotNull GramaticaParser.Test_iterable_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(@NotNull GramaticaParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(@NotNull GramaticaParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(@NotNull GramaticaParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(@NotNull GramaticaParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest_iterable_in(@NotNull GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Exit a parse tree produced by the {@code test_iterable_in}
	 * labeled alternative in {@link GramaticaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest_iterable_in(@NotNull GramaticaParser.Test_iterable_inContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_tuple(@NotNull GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_tuple}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_tuple(@NotNull GramaticaParser.Iterable_tupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(@NotNull GramaticaParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(@NotNull GramaticaParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull GramaticaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull GramaticaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyMatch(@NotNull GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyMatch}
	 * labeled alternative in {@link GramaticaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyMatch(@NotNull GramaticaParser.FuncBodyMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 */
	void enterSub_parameters(@NotNull GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sub_parameters}.
	 * @param ctx the parse tree
	 */
	void exitSub_parameters(@NotNull GramaticaParser.Sub_parametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(@NotNull GramaticaParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(@NotNull GramaticaParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(@NotNull GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(@NotNull GramaticaParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 */
	void enterLambda_subset(@NotNull GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lambda_subset}.
	 * @param ctx the parse tree
	 */
	void exitLambda_subset(@NotNull GramaticaParser.Lambda_subsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(@NotNull GramaticaParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(@NotNull GramaticaParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(@NotNull GramaticaParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(@NotNull GramaticaParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIterableAccess(@NotNull GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomIterableAccess}
	 * labeled alternative in {@link GramaticaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIterableAccess(@NotNull GramaticaParser.AtomIterableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(@NotNull GramaticaParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(@NotNull GramaticaParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull GramaticaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull GramaticaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 */
	void enterSub_args(@NotNull GramaticaParser.Sub_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sub_args}.
	 * @param ctx the parse tree
	 */
	void exitSub_args(@NotNull GramaticaParser.Sub_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable_list(@NotNull GramaticaParser.Iterable_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterable_list}
	 * labeled alternative in {@link GramaticaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable_list(@NotNull GramaticaParser.Iterable_listContext ctx);
}