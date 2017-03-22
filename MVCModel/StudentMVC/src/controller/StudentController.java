package controller;

import java.io.FileOutputStream;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.StudentDAO;
import model.StudentDAOImpl;



/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO studentDAO = new StudentDAOImpl();
		
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<link rel=\"stylesheet\" href=\"css/style.css\" />");
			out.println("<title>List Student</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class = \"container\">");
			out.println("<div class = \"table-student\">");
			out.println("<h1>");
			out.println("LIST STUDENTS");
			out.println("</h1>");
			out.println("<table>");
			
			//begin title
			out.println("<thead>");
			out.println("<th>");
			out.println("ID");
			out.println("</th>");
			out.println("<th>");
			out.println("NAME");
			out.println("</th>");
			out.println("<th>");
			out.println("BIRTHDAY");
			out.println("</th>");
			out.println("<th>");
			out.println("CLASSNAME");
			out.println("</th>");
			out.println("</thead>");
			
			// begin show book student
			out.println("<tbody>");
			for (Student s : studentDAO.getListStudent()) {
				out.println("</tr>");
				out.println("<td>");
				out.println(s.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(s.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(s.getBirthday());
				out.println("</td>");
				out.println("<td>");
				out.println(s.getClassName());
				out.println("</td>");
				out.println("<tr>");
			}
			out.println("</tbody>");
			out.println("</table>");
			out.println("</div>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}