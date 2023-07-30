<%@page import="school_management.Student"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
        
     List<Student> t = (List)session.getAttribute("Student");
     %>
     <table cellpadding="20px" border="1">
     <th>Id<th>
     <th>Sname<th>
     <th>Stream</th>
     <th>fees</th>
     <%
          for(Student s : t)
          { %>
        	  <tr align="center">
        	  <td><%=s.getId() %></td>
        	  <td><%=s.getSname() %></tr>
        	  <td><%=s.getStream() %></td>
        	  <td><%=s.getFees() %>
        	  
        <%  }
           %>
           </table>




</body>
</html>