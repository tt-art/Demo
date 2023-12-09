package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class AddInventory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>ReStock</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Buy.css\">\r\n");
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
      out.write("\t\t\t\t<a href=\"SellerHomepage.jsp\">HOME</a>\r\n");
      out.write("\t\t\t\t<a href=\"AddProduct.html\">ADD</a>\r\n");
      out.write("\t\t\t\t<a href=\"AddInventory.jsp\">RESTOCK</a>\r\n");
      out.write("\t\t\t\t<a href=\"SellerOrders.jsp\">ORDERS</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"active\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

		HttpSession httpSession = request.getSession();
    	String guid=(String)httpSession.getAttribute("currentuser");
    
      out.write("\r\n");
      out.write("    <div class=\"filler\"></div>\r\n");
      out.write("    ");

   		int flag=0;
		ResultSet rs=null;
		PreparedStatement ps=null;
		java.sql.Connection conn=null;
		String query="select p.pid,i.quantity,p.pname,p.manufacturer,p.mfg,p.exp,p.price from product p,inventory i where p.pid=i.pid and i.sid=?";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			ps=conn.prepareStatement(query);
			ps.setString(1,guid);
			rs=ps.executeQuery();
	
      out.write("\r\n");
      out.write("\t<div class=\"filler2\"></div>\r\n");
      out.write("\t\t<div class=\"block\">\r\n");
      out.write("\t");

			while(rs.next())
			{
				if(flag==4)
				{
					flag=1;
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"filler2\"></div>\r\n");
      out.write("\t\t\t\t\t");
 
				}
				else
					flag++;
			
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write(" \t\t\t\t<div class=\"column\">\r\n");
      out.write("    \t\t\t\t<div class=\"card\">\r\n");
      out.write("    \t\t\t\t\t<form action=\"UpdateInventory.jsp\" method=\"post\">\r\n");
      out.write("    \t\t\t\t\t\t<img src=\"images/pills.png\" width=180 height=200>\r\n");
      out.write("  \t\t\t\t\t\t\t<h1>");
      out.print(rs.getString("pname") );
      out.write("</h1>\r\n");
      out.write("  \t\t\t\t\t\t\t<p><b>ID: </b>");
      out.print(rs.getString("pid") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><b>Manufacturer: </b>");
      out.print(rs.getString("manufacturer") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><b>Mfg Date: </b>");
      out.print(rs.getDate("mfg") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><b>Exp Date: </b>");
      out.print(rs.getDate("exp") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><b>Stock: </b>");
      out.print(rs.getInt("quantity") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><b>Price: </b>");
      out.print(rs.getInt("price") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><input type=\"text\" name=\"restock\" placeholder=\"quantity\" onkeypress=\"return event.charCode>= 48 && event.charCode<= 57\" required></p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"pid\" value=\"");
      out.print(rs.getString("pid") );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("  \t\t\t\t\t\t\t<button>ReStock</button>\r\n");
      out.write("  \t\t\t\t\t\t</form>\r\n");
      out.write("  \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("  \t\t\t");

  			} 
  			
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

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
