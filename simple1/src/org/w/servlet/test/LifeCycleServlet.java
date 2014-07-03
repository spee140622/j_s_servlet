package org.w.servlet.test;

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
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.getWriter().println("test");
    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        System.out.println("getLastModified");
        return super.getLastModified(req);
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doHead");
        super.doHead(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut");
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete");
        super.doDelete(req, resp);
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doOptions");
        super.doOptions(req, resp);
    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doTrace");
        super.doTrace(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service - httpServlet");
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service - servlet");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("destory");
        super.destroy();
    }

    @Override
    public String getInitParameter(String name) {
        System.out.println("getInitParameter");
        return super.getInitParameter(name);
    }

    @Override
    public Enumeration getInitParameterNames() {
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
        System.out.println("init - config");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
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
        System.out.println("getServletName");
        return super.getServletName();
    }
}
