package com.gsav.Questionaire1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name="ResultServlet",value="/result")
public class ResultServlet extends HttpServlet {
    private AtomicInteger travelY=new AtomicInteger(0);
    private AtomicInteger travelN =new AtomicInteger(0);
    private AtomicInteger internetY =new AtomicInteger(0);
    private AtomicInteger internetN =new AtomicInteger(0);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        try {

            response.setContentType("text/html;charset=UTF-8");

            String travel = request.getParameter("travel");
            String internet = request.getParameter("internet");
            if (travel.equals("yes")) {
                travelY.getAndIncrement();
            }

            if (travel.equals("no")) {
                travelN.getAndIncrement();
            }

            if (internet.equals("yes")) {
                internetY.getAndIncrement();
            }

            if (internet.equals("no")) {
                internetN.getAndIncrement();
            }

        }catch(NullPointerException e){

        }
        PrintWriter out = response.getWriter();
        out.println( "<html>\n"+
                "<head>\n" +
                "    <title>Statistics</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 align=\"center\"> Survey statistics :</h1> <br>\n" +
                "    <table border=\"2\" align=\"center\">\n" +
                "        <tr>\n" +
                "            <th>    </th>\n" +
                "            <th>Travel</th>\n" +
                "            <th>Internet</th>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th>YES</th>\n" +
                "            <td align=\"center\">" + travelY + "</td>\n" +
                "            <td align=\"center\">" +internetY + "</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th>NO</th>\n" +
                "            <td align=\"center\">" + travelN + "</td>\n" +
                "            <td align=\"center\">" + internetN + "</td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "       <h5 align=\"center\">Fill the form - <a href=\"http://localhost:8080/Questionaire1_war_exploded\">poosh</a></h5>\n" +
                "</body>\n" +
                "</html>");
    }
}



