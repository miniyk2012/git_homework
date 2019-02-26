package com.netease;

import coms.netease.Kitchen;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

/**
 * @author thomas_young
 */
public class NoodlesServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(NoodlesServlet.class);
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        String html = Kitchen.makeNoodles(vegetable);
        writer.println(html);
    }
}
