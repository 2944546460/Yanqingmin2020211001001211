package com.YanQingmin.controller;

import com.YanQingmin.dao.ProductDao;
import com.YanQingmin.model.Category;
import com.YanQingmin.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductDetailServlet",value="/productDetails")
public class ProductDetailsServlet extends HttpServlet {
    private Connection con=null;

    @Override
    public void init() throws ServletException{

        con=(Connection) getServletContext().getAttribute("con");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):0;
        ProductDao productDao=new ProductDao();
        if(id==0){
            return;
        }
        List<Category> categoryList= null;
        try {
            categoryList = Category.findAllCategory(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);

        Product product= null;
        try {
            product = productDao.findById(id,con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("p",product);
        String path ="/WEB-INF/views/productDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
