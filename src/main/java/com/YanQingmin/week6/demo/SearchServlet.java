package com.YanQingmin.week6.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String baidu =request.getParameter("baidu");
        String bing =request.getParameter("bing");
        String google =request.getParameter("google");
        String search =request.getParameter("search");
        if (search.equals("baidu"))
        {
            response.sendRedirect("https://www.baidu.com/");
        } else if (search.equals("bing")){
            response.sendRedirect("https://www.bing.com/");
        }
        else if (search.equals("google")){
            response.sendRedirect("https://www.google.com/");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
