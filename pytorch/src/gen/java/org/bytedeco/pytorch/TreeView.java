// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// clang-format off
// TreeView provides a statically-typed way to traverse the tree, which should
// be formed according to the grammar below.
//
// A few notes on types and their aliases:
// - List<T> is really a Tree with kind TK_LIST and elements as subtrees
// - Maybe<T> is really a Tree with kind TK_OPTION that has 0 or 1 subtree of type T
// - Builtin types are: Ident (TK_IDENT), String (TK_STRING)
//
// Param = Param(Maybe<Expr> type, Ident name)                          TK_PARAM
//
// Decl  = Decl(List<Param> params, Maybe<Expr> return_type)            TK_DECL
// Def   = Def(Ident name, Decl decl, List<Stmt> body)                  TK_DEF
// ClassDef = ClassDef(Ident name,                                      TK_CLASS_DEF
//                     Maybe<Expr> superclass,
//                     List<Stmt> body)
//
// Stmt  = If(Expr cond, List<Stmt> true_body, List<Stmt> false_body)   TK_IF
//       | For(List<Expr> targets, List<Expr> iters, List<Stmt> body)   TK_FOR
//       | While(Expr cond, List<Stmt> body)                            TK_WHILE
//       | Global(List<Ident> idents)                                   TK_GLOBAL
//       -- NB: the only type of Expr's allowed on lhs are Var
//          Or a tuple containing Var with an optional terminating Starred
//       | Assign(Expr lhs, Maybe<Expr> rhs, Maybe<Expr> type)          TK_ASSIGN
//       | AugAssign(Expr lhs, AugAssignKind aug_op, Expr rhs)          TK_AUG_ASSIGN
//       | Return(List<Expr> values)                                    TK_RETURN
//       | ExprStmt(List<Expr> expr)                                    TK_EXPR_STMT
//       | Raise(Expr expr)                                             TK_RAISE
//       | Def                                                          TK_DEF
//       | With(List<WithItem> targets, List<Stmt> body)                TK_WITH
//
// Expr  = TernaryIf(Expr cond, Expr true_expr, Expr false_expr)        TK_IF_EXPR
//       | BinOp(Expr lhs, Expr rhs)
//       |     And                                                      TK_AND
//       |     Or                                                       TK_OR
//       |     Lt                                                       '<'
//       |     Gt                                                       '>'
//       |     Eq                                                       TK_EQ
//       |     Le                                                       TK_LE
//       |     Ge                                                       TK_GE
//       |     Ne                                                       TK_NE
//       |     Is                                                       TK_IS
//       |     IsNot                                                    TK_ISNOT
//       |     Add                                                      '+'
//       |     Sub                                                      '-'
//       |     Mul                                                      '*'
//       |     Div                                                      '/'
//       |     Mod                                                      '%'
//       |     MatMult                                                  '@'
//       |     Pow                                                      TK_POW
//       | UnaryOp(Expr expr)
//       |     Not                                                      TK_NOT
//       |     USub                                                     '-'
//       | Const(String value)                                          TK_CONST
//       -- NB: x.name(y) is desugared into name(x, y)
//       | Apply(Ident name, List<Expr> args, List<Attribute> kwargs)   TK_APPLY
//       | Select(Expr value, Ident selector)                           '.'
//       | Subscript(Expr value, List<Expr> subscript_exprs)            TK_SUBSCRIPT
//       | SliceExpr(Maybe<Expr> start, Maybe<Expr> end)                TK_SLICE_EXPR
//       | Var(Ident name)                                              TK_VAR
//       | ListLiteral(List<Expr> inputs)                               TK_LIST_LITERAL
//       | TupleLiteral(List<Expr> inputs)                              TK_TUPLE_LITERAL
//       | Starred(Expr expr)                                           TK_STARRED
//       | WithItem(Expr target, Maybe<Var> var)                        TK_WITH_ITEM
// -- NB: only allowed expressions are Const or List(Const)
//        (List as a value, not type constructor)
// Attribute = Attribute(Ident name, Expr value)                        TK_ATTRIBUTE
//
// AugAssignKind =
//            | Add()                                                   TK_PLUS_EQ
//            | Sub()                                                   TK_MINUS_EQ
//            | Mul()                                                   TK_TIMES_EQ
//            | Div()                                                   TK_DIV_EQ
//            | Mod()                                                   TK_MOD_EQ
//

// Each subclass of TreeView should provide:
// 1. Constructor that takes a TreeRef, and checks that it's of the right type.
// 2. Accessors that get underlying information out of the object. If they
//    return subtrees, they should wrap them in appropriate views too.
// 3. Static method 'create' that creates the underlying TreeRef object
//    for every TreeRef kind that has a TreeView, the parser always uses
//    (e.g.) Ident::create rather than Compound::Create, this means that
//    changes to the structure of Ident are always made right here rather
//    than both in the parser and in this code.
// XXX: these structs should have no fields to prevent slicing when passing by value
// clang-format on
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TreeView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeView(Pointer p) { super(p); }

  public TreeView(@ByVal TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@ByVal TreeRef tree);
  public native @ByVal TreeRef tree();
  public native @Const @ByRef SourceRange range();
  public native @ByVal @Name("operator torch::jit::TreeRef") TreeRef asTreeRef();
  
  public native int kind();
  public native void dump();
}
