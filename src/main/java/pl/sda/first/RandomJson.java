package pl.sda.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/RandomJson")
public class RandomJson extends HttpServlet {

    public int returnRandom(){
        Random random = new Random();
        int i = random.nextInt();
        return i;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(returnRandom());
        //out.println("<h1>so hard!!</h1>");

    }

}
