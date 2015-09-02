package file;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.read.biff.BiffException;

import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

@WebServlet("/LoginServlet")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response)
                                   throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
 
   
    SimpleDateFormat dateFormat = new SimpleDateFormat("ddmmyyyy");
    Date date1= new Date();
    String dte = dateFormat.format(date1);
   
    String name = request.getParameter("username");
   
    Integer pass = Integer.parseInt(request.getParameter("Training"));
    Integer pass1 = Integer.parseInt(request.getParameter("Sales"));
    Integer pass2 = Integer.parseInt(request.getParameter("Project"));
    Integer pass3 = Integer.parseInt(request.getParameter("Self"));
    BufferedWriter writer = null;
    writer = new BufferedWriter( new FileWriter( "C:/Users/Administrator/Documents/test/"+name+"_"+dte+".xls"));
    
    writer.write( "Name: " + name + ""+'\n'+'\n');
    writer.write( "Training: " + pass + ""+'\n'+'\n');
    writer.write( "Sales: " + pass1 + ""+'\n'+'\n');
    writer.write( "Project: " + pass2 + ""+'\n'+'\n');
    writer.write( "Self: " + pass3 + ""+'\n'+'\n');
    writer.close( );
    
    


    out.println("<html>");
    out.println("<body>");
    out.println("Thanks" + "  " + name + "<br>");
    out.println("Time Spent on Training Activities: " + "  " + pass + "<br>");
    out.println("Time Spent on Training Activities: " + "  " + pass1 + "<br>");
    out.println("Time Spent on Training Activities: " + "  " + pass2 + "<br>");
    out.println("Time Spent on Training Activities: " + "  " + pass3 + "<br>");
    
    out.println("</body></html>");
    

  }
}