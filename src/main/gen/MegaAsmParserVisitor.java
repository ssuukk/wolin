// Generated from D:/Projekty/kotlinek/src/main/antlr\MegaAsmParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MegaAsmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MegaAsmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#pseudoAsmFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoAsmFile(MegaAsmParser.PseudoAsmFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#referencer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencer(MegaAsmParser.ReferencerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(MegaAsmParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MegaAsmParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#addressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressed(MegaAsmParser.AddressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(MegaAsmParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(MegaAsmParser.ImmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#floatimmediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatimmediate(MegaAsmParser.FloatimmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#stringimmediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringimmediate(MegaAsmParser.StringimmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#absAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsAddress(MegaAsmParser.AbsAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(MegaAsmParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(MegaAsmParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#linia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinia(MegaAsmParser.LiniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(MegaAsmParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MegaAsmParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MegaAsmParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(MegaAsmParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#assemblerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerBody(MegaAsmParser.AssemblerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(MegaAsmParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(MegaAsmParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(MegaAsmParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MegaAsmParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(MegaAsmParser.LineStringContentContext ctx);
}