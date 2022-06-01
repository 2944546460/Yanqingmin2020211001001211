package com.YanQingmin.controller;



import com.YanQingmin.dao.OrderDao;
import com.YanQingmin.model.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name = "OrderDetailsServlet", value = "/orderDetails")
public class OrderDetailsServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
        con=(Connection)getServletContext().getAttribute("con");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ordeId=request.getParameter("ordeId")!=null?Integer.parseInt(request.getParameter("ordeId")):0;
        Item item=new Item();
        OrderDao orderDao=new OrderDao();
        List<Item> items=orderDao.findItemsByOrderId(con,ordeId);
        //Log.info(items.toString());
        request.setAttribute("itemList",items);
        String path="orderDetails.jsp";
        //Log.info(path);
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
