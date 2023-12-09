package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Orders</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Orders.css\">\r\n");
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
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"active\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	HttpSession httpSession = request.getSession();
    String gid=(String)httpSession.getAttribute("currentuser");
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"filler\"></div>\r\n");
      out.write("    \r\n");
      out.write("    ");

    int flag=0;
	ResultSet rs=null;
	CallableStatement cs=null;
	java.sql.Connection conn=null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		cs = conn.prepareCall("call getorders(?)");
		cs.setString(1, gid);
		rs = cs.executeQuery();
		
      out.write("<div class=\"filler2\"></div>\r\n");
      out.write("\t\t<table class=\"tables\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("    \t\t\t<th>Order ID</th>\r\n");
      out.write("    \t\t\t<th>Product ID</th>\r\n");
      out.write("    \t\t\t<th>Price</th>\r\n");
      out.write("    \t\t\t<th>Quantity</th>\r\n");
      out.write("    \t\t\t<th>Seller ID</th>\r\n");
      out.write("    \t\t\t<th>Order Date and Time</th>\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("\t\t");
while(rs.next()) 
		{
			
      out.write("\r\n");
      out.write("\t  \t\t\r\n");
      out.write("  \t\t\t<tr>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("oid") );
      out.write("</td>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getString("pid") );
      out.write("</td>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("price") );
      out.write("</td>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("quantity") );
      out.write("</td>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getString("sid") );
      out.write("</td>\r\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getTimestamp("orderdatetime") );
      out.write("\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t");

	}
		
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 
	}
	catch(Exception e)
	{
		out.println("error: "+e);
	}
		finally {
		    try { if (rs != null) rs.close(); } catch (Exception e) {};
		    try { if (cs != null) cs.close(); } catch (Exception e) {};
		    try { if (conn != null) conn.close(); } catch (Exception e) {};
	}
	
      out.write("\r\n");
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
