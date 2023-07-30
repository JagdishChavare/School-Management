package school_management;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchStudent extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Query q = em.createQuery("select j from Student j");
		
		List<Student> s = q.getResultList();
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("id" + "      " + "Sname" +  "      " + "Stream" +  "      " + "Fees" );
		pw.println();
		
		for (Student s1 : s) {
			
			pw.write(s1.getId()+" ");
			
			pw.write(s1.getSname()+ " ");
			
			pw.write(s1.getStream()+ " ");
			
			pw.write((int) s1.getFees()+ " ");
			
			pw.println();
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
