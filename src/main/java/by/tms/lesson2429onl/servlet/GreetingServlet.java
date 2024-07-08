package by.tms.lesson2429onl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greeting") // GET localhost:8080/greeting?name=Denis
public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String name = req.getParameter("name");
        String result = "Hello %s".formatted(name);

        resp.addHeader("Content-Type", "application/json");

        resp.getWriter().println(result);
    }
}
