package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Home Page</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Homepage.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("\t<div class=\"topbar1\"></div>\r\n");
      out.write("\t<div class=\"topbar2\">\r\n");
      out.write("\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t<div class=\"logout-btn\">\r\n");
      out.write("\t\t\t\t<a href=\"Logout.jsp\">Logout</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"container2\">\r\n");
      out.write("\t\t\t<div class=\"navbar\">\r\n");
      out.write("\t\t\t\t<a href=\"Homepage.jsp\">HOME</a>\r\n");
      out.write("\t\t\t\t<a href=\"Buy.jsp\">BUY</a>\r\n");
      out.write("\t\t\t\t<a href=\"Orders.jsp\">ORDERS</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"active\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	HttpSession httpSession = request.getSession();
    String guid=(String)httpSession.getAttribute("currentuser");
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"filler\"></div>\r\n");
      out.write("    <h2>Welcome ");
      out.print(guid);
      out.write("</h2>\r\n");
      out.write("    \r\n");
      out.write("    ");

	ResultSet rs=null;
	PreparedStatement ps=null;
	java.sql.Connection conn=null;
	String query="select fname,uid,address,phno,email from customer where uid=?";
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		ps=conn.prepareStatement(query);
		ps.setString(1,guid);
		rs=ps.executeQuery();
		if(rs.next())
		{
			
		
      out.write("\r\n");
      out.write("\t\t<div class=\"filler2\"></div>\r\n");
      out.write("\t\t\t<div class=\"card\">\r\n");
      out.write("  \t\t\t\t<img src=\"images/User.png\" class=\"Avatar\" width=234 height=234>\r\n");
      out.write("  \t\t\t\t<div class=\"container\">\r\n");
      out.write("    \t\t\t <div class=\"space1\"><b>");
      out.print(rs.getString("fname") );
      out.write("</b></div>\r\n");
      out.write("    \t\t\t <div class=\"filler3\"></div>\r\n");
      out.write("   \t\t\t\t\t<div class=\"space\"><b>ID: </b>");
      out.print(rs.getString("uid") );
      out.write("</div>\r\n");
      out.write("   \t\t\t\t\t<div class=\"space\"><b>Address: </b>");
      out.print(rs.getString("address") );
      out.write("</div>\r\n");
      out.write("   \t\t\t\t\t<div class=\"space\"><b>Phone: </b>");
      out.print(rs.getString("phno") );
      out.write("</div>\r\n");
      out.write("   \t\t\t\t\t<div class=\"space\"><b>Email: </b>");
      out.print(rs.getString("email") );
      out.write("</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");

		
		}
	}
	catch(Exception e)
	{
		out.println("error: "+e);
	}
	finally {
	    try { if (rs != null) rs.close(); } catch (Exception e) {};
	    try { if (ps != null) ps.close(); } catch (Exception e) {};
	    try { if (conn != null) conn.close(); } catch (Exception e) {};
	}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
