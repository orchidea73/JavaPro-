package com.gsav.Questionaire1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "QuestServlet", value = "/quest-servlet")
public class QuestServlet extends HttpServlet {

@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name= request.getParameter("name");


        // Hello
        PrintWriter pw = response.getWriter();


            pw.println("</body></html>");
    pw.println("<!DOCTYPE html><html>\n" +
     //  pw.println("<h1>" + message + "</h1>");
         "   <head>\n "+
          "<title>Questionaire1</title>\n" +
            "</head>\n"+
           "<body>\n"+
           "  <h1 align=\"center\">Complete the form!</h1> <br>\n "+
            "   <form action=\"result\" method=\"get\">\n"+

             "  <P><label>1.Do you like to travel?</label>\n"+
            "        <input name=\"travel\" type=\"radio\" value=\"yes\"> Yes\n" +
            "        <input name=\"travel\" type=\"radio\" value=\"no\"> No </p>\n" +

            "        <p> <label>2.Travel places are you looking on the internet?</label>\n" +
            "        <input name=\"internet\" type=\"radio\" value=\"yes\"> Yes\n" +
            "        <input name=\"internet\" type=\"radio\" value=\"no\"> No </p>\n" +

            "        <input type=\"submit\" value=\"Choose\">\n" +
            "</form>\n"+
            "</body>\n"+
            "</html>");


    }


    }
