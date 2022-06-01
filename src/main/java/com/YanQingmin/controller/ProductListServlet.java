package com.YanQingmin.controller;

import com.YanQingmin.dao.ProductDao;
import com.YanQingmin.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductListServlet", value = "/ProductListServlet")
public class ProductListServlet extends HttpServlet {
    Connection con=null;

    @Override
    public void init() throws ServletException {
        con=(Connection) getServletContext().getAttribute("connection");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ProductDao productDao=new ProductDao();
            List<Product> productList=productDao.findAll(con);
            request.setAttribute("productList",productList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String path="WEB-INF/views/admin/productList.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

