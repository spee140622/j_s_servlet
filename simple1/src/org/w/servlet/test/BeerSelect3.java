package org.w.servlet.test;

import org.w.servlet.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/3/2014.
 */
public class BeerSelect3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String request = req.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> brands = be.getBrands(request);

        req.setAttribute("style", brands);

        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, resp);
    }
}
