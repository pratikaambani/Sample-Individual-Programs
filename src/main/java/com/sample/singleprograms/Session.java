package com.sample.singleprograms;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Session extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);
		Integer ival = (Integer) session.getAttribute("simplesession.counter");
		if (ival == null)
			ival = new Integer(1);
		else
			ival = new Integer(ival.intValue() + 1);

		session.setAttribute("simplesession.counter", ival);

		out.print("<HTML><body>");
		out.print("<center> You have hit this page ");
		out.print(ival + " times!");
		out.print("</body></html>");
	}

}