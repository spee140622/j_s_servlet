package org.w.servlet.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/3/2014.
 */
public class BeerSelect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Beer Selection Advice<br/>");
        String request = req.getParameter("color");
        out.println("<br/>Got beer color" + request);
    }
}
