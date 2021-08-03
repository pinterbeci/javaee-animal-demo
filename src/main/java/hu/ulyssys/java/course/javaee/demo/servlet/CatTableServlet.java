package hu.ulyssys.java.course.javaee.demo.servlet;

import hu.ulyssys.java.course.javaee.demo.animal.entity.Cat;
import hu.ulyssys.java.course.javaee.demo.animal.service.CatService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(value = "/cat")
public class CatTableServlet extends HttpServlet {

    @Inject
    private CatService catService;


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Cím</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Ez a Cat oldal</h1>\n");
        builder.append("<table>");
        builder.append("<tr>");
        builder.append("<td>ID</td>");
        builder.append("<td>Név</td>");
        builder.append("<td>Típus</td>");
        builder.append("<td>Lábak száma</td>");

        builder.append("</tr>");

        for (Cat cat : catService.getAll()) {
            builder.append("<tr>");
            builder.append("<td>" + cat.getId() +
                    "</td>" +
                    " <td>" + cat.getName() +
                    "</td>" +
                    " <td>" + cat.getAnimalType() +
                    "</td>" +
                    "<td>" + cat.getLegsNumber() +
                    "</td>");
            builder.append("</tr>");
        }
        builder.append("</table>");
        PrintWriter out = response.getWriter();
        out.println(new String(builder.toString().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8.name()));
        out.println("</body>\n" + "</html>\n");
    }
}
