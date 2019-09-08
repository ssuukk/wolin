// Generated from PseudoAsmParser.g4 by ANTLR 4.5.1
package pl.qus.wolin;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoAsmParser}.
 */
public interface PseudoAsmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 */
	void enterPseudoAsmFile(PseudoAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 */
	void exitPseudoAsmFile(PseudoAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#jocker}.
	 * @param ctx the parse tree
	 */
	void enterJocker(PseudoAsmParser.JockerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#jocker}.
	 * @param ctx the parse tree
	 */
	void exitJocker(PseudoAsmParser.JockerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#referencer}.
	 * @param ctx the parse tree
	 */
	void enterReferencer(PseudoAsmParser.ReferencerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#referencer}.
	 * @param ctx the parse tree
	 */
	void exitReferencer(PseudoAsmParser.ReferencerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(PseudoAsmParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(PseudoAsmParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PseudoAsmParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PseudoAsmParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#addressed}.
	 * @param ctx the parse tree
	 */
	void enterAddressed(PseudoAsmParser.AddressedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#addressed}.
	 * @param ctx the parse tree
	 */
	void exitAddressed(PseudoAsmParser.AddressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(PseudoAsmParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(PseudoAsmParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(PseudoAsmParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(PseudoAsmParser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 */
	void enterFloatimmediate(PseudoAsmParser.FloatimmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 */
	void exitFloatimmediate(PseudoAsmParser.FloatimmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 */
	void enterStringimmediate(PseudoAsmParser.StringimmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 */
	void exitStringimmediate(PseudoAsmParser.StringimmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#absAddress}.
	 * @param ctx the parse tree
	 */
	void enterAbsAddress(PseudoAsmParser.AbsAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#absAddress}.
	 * @param ctx the parse tree
	 */
	void exitAbsAddress(PseudoAsmParser.AbsAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PseudoAsmParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PseudoAsmParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PseudoAsmParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PseudoAsmParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja(PseudoAsmParser.InstrukcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja(PseudoAsmParser.InstrukcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#linia}.
	 * @param ctx the parse tree
	 */
	void enterLinia(PseudoAsmParser.LiniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#linia}.
	 * @param ctx the parse tree
	 */
	void exitLinia(PseudoAsmParser.LiniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(PseudoAsmParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(PseudoAsmParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PseudoAsmParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PseudoAsmParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PseudoAsmParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PseudoAsmParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(PseudoAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(PseudoAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerBody(PseudoAsmParser.AssemblerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerBody(PseudoAsmParser.AssemblerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(PseudoAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(PseudoAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(PseudoAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(PseudoAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(PseudoAsmParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(PseudoAsmParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(PseudoAsmParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(PseudoAsmParser.LineStringContentContext ctx);
}