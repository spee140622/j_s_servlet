package org.w.test.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/4/2014.
 */
public class LifeCycleServlet extends HttpServlet {

    public LifeCycleServlet() {
        super();
        System.out.println("构造方法");
        System.out.println(Thread.currentThread());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.getWriter().println("lifeCycleTest");
        System.out.println(Thread.currentThread());
    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return super.getLastModified(req);
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doHead(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("post");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doOptions(req, resp);
    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doTrace(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service - httpServletRequest");
        System.out.println(Thread.currentThread());
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet - servletRequest");
        System.out.println(Thread.currentThread());
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
        System.out.println(Thread.currentThread());
        super.destroy();
    }

    @Override
    public String getInitParameter(String name) {
        System.out.println("getInitParameter");
        return super.getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        System.out.println("getInitParameterNames");
        return super.getInitParameterNames();
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig");
        return super.getServletConfig();
    }

    @Override
    public ServletContext getServletContext() {
        System.out.println("getServletContext");
        return super.getServletContext();
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo");
        return super.getServletInfo();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init config");
        System.out.println(Thread.currentThread());
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
        System.out.println(Thread.currentThread());
        super.init();
    }

    @Override
    public void log(String msg) {
        super.log(msg);
    }

    @Override
    public void log(String message, Throwable t) {
        super.log(message, t);
    }

    @Override
    public String getServletName() {
        return super.getServletName();
    }
}
