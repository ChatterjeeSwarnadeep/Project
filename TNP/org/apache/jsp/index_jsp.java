/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2017-09-12 18:02:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/SwarnaDeep/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TNP/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1504930328000L));
    _jspx_dependants.put("jar:file:/C:/Users/SwarnaDeep/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TNP/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".alert {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    background-color: #f44336; /* Red */\r\n");
      out.write("    color: white;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    margin-left: 285px;\r\n");
      out.write("    width: 40%\r\n");
      out.write("}\r\n");
      out.write(".closebtn {\r\n");
      out.write("\t\r\n");
      out.write("    margin-left: 15px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    float: right;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".closebtn:hover {\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write("li\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write(" ul\r\n");
      out.write("\t{\r\n");
      out.write("\t\tlist-style-type: none;\r\n");
      out.write("\t\tmargin-left: 15px;\r\n");
      out.write("\t\tmargin-top:0px;\r\n");
      out.write("\t\tpadding: 0px;\r\n");
      out.write("\t\toverflow: hidden;\r\n");
      out.write("\t\tbackground-color:#00008B;\r\n");
      out.write(" \t\twidth:84.5%;\r\n");
      out.write(" \t\tbox-shadow: 10px 10px 5px #888888; \r\n");
      out.write("\t}\r\n");
      out.write("\tli a\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tpadding: 5px 10px;\r\n");
      out.write("\t\ttext-decoration: none; \r\n");
      out.write("\t}\r\n");
      out.write("\t li a:HOVER\r\n");
      out.write("\t{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground-color:#6495ED;\r\n");
      out.write("\ttext-shadow:1px 1px #A9A9A9;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-decoration-style: none;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div class='b'>.</div>\r\n");
      out.write("<div class='k'>\r\n");
      out.write("<img  src=\"pic/top1.jpg\" align=\"center\">                   <div align=right> Department Of Training & Placement</div>\r\n");
      out.write("</div>\r\n");
      out.write("<ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#\">About T &amp; P</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\">Companies Wall</a></li>\r\n");
      out.write("        <li><a href=\"#\">News</a></li>            \r\n");
      out.write("        <li><a href=\"index.jsp?ms=2\">Notice</a></li>      \r\n");
      out.write("        <li><a href=\"#\">IEC</a></li>            \r\n");
      out.write("        <li><a href=\"#\">Alumini Feedback</a></li>            \r\n");
      out.write("        <li><a href=\"#\">Recruiter Talks</a></li>            \r\n");
      out.write("        <li><a href=\"http://kiittnp.in/cs/\">Centre For Advanced Training<img src=\"image/new.gif\" alt=\"\"></a></li>\r\n");
      out.write("</ul>\r\n");

String msg=request.getParameter("msg");
int s=0;
if(msg!=null)
s=Integer.parseInt(msg);
if(s==1)
{

      out.write("\r\n");
      out.write("<div class=\"alert\" align=\"center\">\r\n");
      out.write("  <span class=\"closebtn\" onclick=\"this.parentElement.style.display='none';\">&times;</span> \r\n");
      out.write("  <strong>ALERT!</strong> Wrong user name or password\r\n");
      out.write("</div>\r\n");

}

      out.write('\r');
      out.write('\n');
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');

session.removeAttribute("roll");
session.removeAttribute("type");
session.setAttribute("pass", null);

              out.write('\r');
              out.write('\n');
              org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "f.html", out, false);
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /index.jsp(100,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ms==2}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "new.jsp", out, false);
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }
}
