/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.NestedExpression;

public class ASTNestedExpression extends AbstractApexNode<NestedExpression> {

    public ASTNestedExpression(NestedExpression node) {
        super(node);
    }

    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
