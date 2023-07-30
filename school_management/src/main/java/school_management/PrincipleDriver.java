package school_management;


import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abc")
public class PrincipleDriver extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age = req.getParameter("age");
		String mob = req.getParameter("mob");
		String password = req.getParameter("password");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int id1 = Integer.parseInt(id);
		int age1 = Integer.parseInt(age);
		int mob1 = Integer.parseInt(mob);
		
		Principle p = new Principle();
		
        p.setId(id1);
        p.setEmail(email);
		p.setName(name);
		p.setAge(age1);
		p.setMob(mob1);
		p.setPassword(password);
		
		et.begin();
		em.persist(p);
		et.commit();
		
		RequestDispatcher rd = req.getRequestDispatcher("LoginIn.html");
		
		rd.forward(req, resp);
		
       
		
	}

}
