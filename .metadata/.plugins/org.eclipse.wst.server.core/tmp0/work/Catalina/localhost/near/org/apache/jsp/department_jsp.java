/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-19 00:48:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class department_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1696897873775L));
    _jspx_dependants.put("jar:file:/C:/khs/NearByDocProj/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/NearByProj/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("    <title>Select Type</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Noto Sans kr', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("       	button{\r\n");
      out.write("	background-color: #191970;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	width:100px;\r\n");
      out.write("	height:25px;\r\n");
      out.write("	cursor:pointer;\r\n");
      out.write("       	}\r\n");
      out.write("\r\n");
      out.write("        li {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <h2>진료과목을 선택하세요</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"내과\" id=\"type\" > 내과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"정형외과\" id=\"type\"> 정형외과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"외과\" id=\"type\"> 외과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"피부과\" id=\"type\"> 피부과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"산부인과\" id=\"type\"> 산부인과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"정신건강의학과\" id=\"type\"> 정신건강의학과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"이비인후과\" id=\"type\"> 이비인후과</li>\r\n");
      out.write("        <li><input type=\"checkbox\" name=\"type\" value=\"소아과\" id=\"type\"> 소아과</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"checkbox\" name=\"type\" id=\"otherTypeCheckbox\" value=\"기타\" onchange=\"toggleOtherTypeInput()\">\r\n");
      out.write("            기타\r\n");
      out.write("            <input type=\"text\" id=\"otherTypeInput\" placeholder=\"기타 진료과목 입력\" disabled>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <button onclick=\"selectTypes()\">선택 완료</button>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        function toggleOtherTypeInput() {\r\n");
      out.write("            var otherTypeInput = document.getElementById(\"otherTypeInput\");\r\n");
      out.write("            var otherTypeCheckbox = document.getElementById(\"otherTypeCheckbox\");\r\n");
      out.write("\r\n");
      out.write("            if (otherTypeCheckbox.checked) {\r\n");
      out.write("                otherTypeInput.disabled = false;\r\n");
      out.write("            } else {\r\n");
      out.write("                otherTypeInput.disabled = true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function selectTypes() {\r\n");
      out.write("            // 선택한 진료과목을 수집\r\n");
      out.write("            var selectedTypes = [];\r\n");
      out.write("            var checkboxes = document.querySelectorAll('input[name=\"type\"]:checked');\r\n");
      out.write("\r\n");
      out.write("            checkboxes.forEach(function (checkbox) {\r\n");
      out.write("                if (checkbox.value === \"기타\") {\r\n");
      out.write("                    // \"기타\" 옵션 선택 시 텍스트 상자의 값을 사용\r\n");
      out.write("                    var otherTypeInput = document.getElementById(\"otherTypeInput\").value;\r\n");
      out.write("                    if (otherTypeInput.trim() !== \"\") {\r\n");
      out.write("                        selectedTypes.push(otherTypeInput);\r\n");
      out.write("                    }\r\n");
      out.write("                } else {\r\n");
      out.write("                    selectedTypes.push(checkbox.value);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // 선택한 진료과목을 부모 페이지로 전달\r\n");
      out.write("            var selectedTypesStr = selectedTypes.join(',');\r\n");
      out.write("            window.opener.postMessage(selectedTypesStr, \"*\"); // '*'는 모든 도메인에서 메시지를 수신할 수 있도록 함\r\n");
      out.write("            window.close();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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
