package org.w.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/5/2014.
 */
public class InitParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = getServletConfig().getInitParameter("adminEmail");
        String email2 = getInitParameter("adminEmail");
        resp.getWriter().println(email);
        resp.getWriter().println(email2);

        String gs = getServletContext().getInitParameter("globalParam");
        resp.getWriter().println(gs);
    }
}
