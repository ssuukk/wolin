// Generated from D:/Projekty/kotlinek/src/main/antlr\MegaAsmParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MegaAsmParser}.
 */
public interface MegaAsmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 */
	void enterPseudoAsmFile(MegaAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 */
	void exitPseudoAsmFile(MegaAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#referencer}.
	 * @param ctx the parse tree
	 */
	void enterReferencer(MegaAsmParser.ReferencerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#referencer}.
	 * @param ctx the parse tree
	 */
	void exitReferencer(MegaAsmParser.ReferencerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(MegaAsmParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(MegaAsmParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MegaAsmParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MegaAsmParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#addressed}.
	 * @param ctx the parse tree
	 */
	void enterAddressed(MegaAsmParser.AddressedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#addressed}.
	 * @param ctx the parse tree
	 */
	void exitAddressed(MegaAsmParser.AddressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MegaAsmParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MegaAsmParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(MegaAsmParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(MegaAsmParser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 */
	void enterFloatimmediate(MegaAsmParser.FloatimmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 */
	void exitFloatimmediate(MegaAsmParser.FloatimmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 */
	void enterStringimmediate(MegaAsmParser.StringimmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 */
	void exitStringimmediate(MegaAsmParser.StringimmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#absAddress}.
	 * @param ctx the parse tree
	 */
	void enterAbsAddress(MegaAsmParser.AbsAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#absAddress}.
	 * @param ctx the parse tree
	 */
	void exitAbsAddress(MegaAsmParser.AbsAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MegaAsmParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MegaAsmParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja(MegaAsmParser.InstrukcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja(MegaAsmParser.InstrukcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#linia}.
	 * @param ctx the parse tree
	 */
	void enterLinia(MegaAsmParser.LiniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#linia}.
	 * @param ctx the parse tree
	 */
	void exitLinia(MegaAsmParser.LiniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(MegaAsmParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(MegaAsmParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(MegaAsmParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(MegaAsmParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MegaAsmParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MegaAsmParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(MegaAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(MegaAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerBody(MegaAsmParser.AssemblerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerBody(MegaAsmParser.AssemblerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(MegaAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(MegaAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(MegaAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(MegaAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(MegaAsmParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(MegaAsmParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MegaAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(MegaAsmParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MegaAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(MegaAsmParser.LineStringContentContext ctx);
}