package org.w.test.listener;

import org.w.test.beans.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/5/2014.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog dog = new Dog(dogBreed);
        sc.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
