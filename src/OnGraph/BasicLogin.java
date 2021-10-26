package OnGraph;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		
		if(user.equals("payal") && pass.equals("payal"))
			pw.println("Login success..");
		else
			pw.println("Login failed..");
		pw.close();
	}

}
