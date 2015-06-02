package s.b;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//test controller.
public class Test extends HttpServlet {

	private static final long serialVersionUID = -6704704709301346456L;

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str = request.getParameter("str");
		response.getWriter().print(" the params is : " +  str);
		return;
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	public void init() throws ServletException {
		// Put your code here
	}

}
