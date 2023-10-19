/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-16 01:38:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>리뷰 작성</title>\r\n");
      out.write("<style>\r\n");
      out.write(".main {\r\n");
      out.write("	width: 430px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top {\r\n");
      out.write("	border-bottom: 1px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".infosum {\r\n");
      out.write("	border-bottom: 1px solid;\r\n");
      out.write("	border-color: gainsboro;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".selectstar {\r\n");
      out.write("	border-bottom: 1px solid;\r\n");
      out.write("	border-color: gainsboro;\r\n");
      out.write("	height: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#text {\r\n");
      out.write("	width: 410px;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("	margin: 5px 5px 5px 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary {\r\n");
      out.write("	width: 410px;\r\n");
      out.write("	background-color: #1376F8;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	border-color: white;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 15px 30px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star_rating {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	display: inline-flex;\r\n");
      out.write("	float: left;\r\n");
      out.write("	flex-direction: row;\r\n");
      out.write("	justify-content: flex-start;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star_rating .star {\r\n");
      out.write("	width: 25px;\r\n");
      out.write("	height: 25px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	background:\r\n");
      out.write("		url('https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FE2bww%2FbtsviSSBz4Q%2F5UYnwSWgTlFt6CEFZ1L3Q0%2Fimg.png')\r\n");
      out.write("		no-repeat;\r\n");
      out.write("	background-size: 100%;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star_rating .star.on {\r\n");
      out.write("	width: 25px;\r\n");
      out.write("	height: 25px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	background:\r\n");
      out.write("		url('https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb2d6gV%2FbtsvbDoal87%2FXH5b17uLeEJcBP3RV3FyDk%2Fimg.png')\r\n");
      out.write("		no-repeat;\r\n");
      out.write("	background-size: 100%;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\".star\").val(1);\r\n");
      out.write("		$('.star_rating > .star').click(function() {\r\n");
      out.write("			$(this).parent().children('span').removeClass('on');\r\n");
      out.write("			$(this).addClass('on').prevAll('span').addClass('on');\r\n");
      out.write("			var cnt = $(this).attr('value');\r\n");
      out.write("			$(\".star\").val(cnt); // 히든 인풋에 값 저장.\r\n");
      out.write("			return false;\r\n");
      out.write("		})\r\n");
      out.write("		$(\"#btn_submit\").click(function() {\r\n");
      out.write("			let content = $(\"#content\")\r\n");
      out.write("			let star = $(\".star\")\r\n");
      out.write("			console.log(this)\r\n");
      out.write("\r\n");
      out.write("			console.log(content[0].value)\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : 'insertreview',\r\n");
      out.write("				type : 'POST',\r\n");
      out.write("				dataType : 'json',\r\n");
      out.write("				data : {\r\n");
      out.write("					'pidnum' : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.pidnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("					'comnum' : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.comnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("					'content' : content[0].value,\r\n");
      out.write("					'star' : star[0].value\r\n");
      out.write("				},\r\n");
      out.write("				success : function(result) {\r\n");
      out.write("					console.log(result)\r\n");
      out.write("\r\n");
      out.write("				},\r\n");
      out.write("				error : function(error) {\r\n");
      out.write("\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("			if (!alert('리뷰 등록이 완료되었습니다.')) {\r\n");
      out.write("				window.close()\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"main\">\r\n");
      out.write("		");

		pageContext.include("thinheader.jsp");
		
      out.write("\r\n");
      out.write("		<br>\r\n");
      out.write("		<div class=\"top\">\r\n");
      out.write("			<h3>리뷰 작성</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<div class=\"infosum\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td rowspan=\"3\"><img src=\"image?file=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.hurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("							alt=\"병원\" width=\"200\"></td>\r\n");
      out.write("						<td>&nbsp;&nbsp;</td>\r\n");
      out.write("						<td><h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.hname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>&nbsp;&nbsp;</td>\r\n");
      out.write("						<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.hroad}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>&nbsp;&nbsp;</td>\r\n");
      out.write("						<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.htel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("			<br>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br> <br>\r\n");
      out.write("		<div class=\"selectstar\">\r\n");
      out.write("			<p>별점을 선택해주세요.</p>\r\n");
      out.write("			<div class=\"star_rating\">\r\n");
      out.write("				<span class=\"star on\" value=\"1\"> </span> <span class=\"star\"\r\n");
      out.write("					value=\"2\"> </span> <span class=\"star\" value=\"3\"> </span> <span\r\n");
      out.write("					class=\"star\" value=\"4\"> </span> <span class=\"star\" value=\"5\">\r\n");
      out.write("				</span>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"textreview\">\r\n");
      out.write("			<p>텍스트 리뷰</p>\r\n");
      out.write("			<br>\r\n");
      out.write("			<textarea name=\"content\" id=\"content\" cols=\"58\" rows=\"10\"\r\n");
      out.write("				placeholder=\"솔직한 사용후기를 작성해주세요!\"></textarea>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<div>\r\n");
      out.write("			<!--<button type=\"button\" id=\"aa\">리뷰작성</button>-->\r\n");
      out.write("			<button type=\"button\" class=\"btn-primary\" id=\"btn_submit\">리뷰작성</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
