/* Generated By:JJTree: Do not edit this line. ASTLimit.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.tcdi.zombodb.query_parser;

public
class ASTLimit extends com.tcdi.zombodb.query_parser.QueryParserNode {
  public ASTLimit(int id) {
    super(id);
  }

  public ASTLimit(QueryParser p, int id) {
    super(p, id);
  }


  public String getFieldname() {
    return String.valueOf(getChild(0).getValue());
  }

  public String getSortDirection() {
    return String.valueOf(getChild(1).getValue());
  }

  public int getOffset() {
    return Integer.valueOf(String.valueOf(getChild(2).getValue()));
  }

  public int getLimit() {
    return Integer.valueOf(String.valueOf(getChild(3).getValue()));
  }


  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=47810319df365d1b799e53febb39a350 (do not edit this line) */
