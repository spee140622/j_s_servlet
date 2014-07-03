package org.w.test.servlet;

import org.w.test.beans.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/5/2014.
 */
public class ListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        resp.getWriter().println("dog's breed is: " + dog.getBreed());
    }
}
