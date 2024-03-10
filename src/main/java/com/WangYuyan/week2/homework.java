package com.WangYuyan.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class homework extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException {
        PrintWriter writer=response.getWriter();
        writer.println("Name:WangYuyan");
        writer.println("ID:2022211001000332");
        writer.println("Date and Time:"+new Date());
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}