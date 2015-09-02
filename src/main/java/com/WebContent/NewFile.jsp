<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Task Tracking Sheet</title>
</head>

<body>

<h2>Activity Log</h2>
<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
<p>Activity performed on <%= df.format(new java.util.Date()) %></p>
<h6>Note:1.Input time spent in Number(eg:10)<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	 2.Input time spent as Zero for null(eg:0)</h6>
<form method="GET" action="LoginServlet">
<table>
  <tr>
  <td> Name</td>
  <td>  <input type="text" name="username" size="20"></td>
  </tr>
  <tr>
  <td> Training Activities:</td>
  <td>  <input type="text" name="Training" size="20"></td>
  </tr>
  
  <tr>
  <td> Sales Activities:</td>
  <td> <input type="text" name="Sales" size="20"></td>
  </tr>
  <tr>
  <td>Project Activities: </td>
  <td> <input type="text" name="Project" size="20"></td>
  </tr>
  <tr>
  <td> Self Study: </td>
  <td> <input type="text" name="Self" size="20"></td>
  </tr>
  <tr>
  <td><input type="submit" value="Submit" name="B1"></td>
 </tr>
  </table>
</form>


</body>

</html>