// Generated from PseudoAsmParser.g4 by ANTLR 4.5.1
package pl.qus.wolin;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoAsmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoAsmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoAsmFile(PseudoAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#jocker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJocker(PseudoAsmParser.JockerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#referencer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencer(PseudoAsmParser.ReferencerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(PseudoAsmParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PseudoAsmParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#addressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressed(PseudoAsmParser.AddressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(PseudoAsmParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(PseudoAsmParser.ImmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatimmediate(PseudoAsmParser.FloatimmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringimmediate(PseudoAsmParser.StringimmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#absAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsAddress(PseudoAsmParser.AbsAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PseudoAsmParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(PseudoAsmParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(PseudoAsmParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#linia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinia(PseudoAsmParser.LiniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(PseudoAsmParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PseudoAsmParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PseudoAsmParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(PseudoAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerBody(PseudoAsmParser.AssemblerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(PseudoAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(PseudoAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(PseudoAsmParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(PseudoAsmParser.LineStringContentContext ctx);
}