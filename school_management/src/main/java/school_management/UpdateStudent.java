package school_management;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/UpdateS")
public class UpdateStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String sname = req.getParameter("sname");
		String stream = req.getParameter("stream");
		String fees = req.getParameter("fees");
		
		int id1 = Integer.parseInt(id);
		double  fees1 = Double.parseDouble(fees);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Student s = new Student();
		
		s.setId(id1);
		s.setSname(sname);
		s.setStream(stream);
		s.setFees(fees1);
		
		et.begin();
		em.merge(s);
		et.commit();
		
		resp.setContentType("text/css");
        PrintWriter pw = resp.getWriter();    
        pw.write("Updated Successfully ! ");
        
        RequestDispatcher rd = req.getRequestDispatcher("StudentOperation.html");
         rd.forward(req, resp);
		
		
		
	}

}
