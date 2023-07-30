<%@page import="school_management.Student"%>
<%@page import="javax.persistence.EntityManager"%>
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
  String id = request.getParameter("id");
 int id1 = Integer.parseInt(id);
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
 EntityManager em = emf.createEntityManager();
 
 Student s = em.find(Student.class, id1);
 
%>

<form action="UpdateS" method="post">
Id:- <input type="number" value="<%=s.getId()%>" name ="id"><br><br>
Sname:- <input type="text" value="<%=s.getSname()%>" name="sname"><br><br>
Stream:- <input type="text" value="<%=s.getStream()%>" name="stream"><br><br>
Fees:- <input type="number" value="<%=s.getFees()%>" name="fees"><br><br>
<input type="submit">  


</form>
</body>
</html>