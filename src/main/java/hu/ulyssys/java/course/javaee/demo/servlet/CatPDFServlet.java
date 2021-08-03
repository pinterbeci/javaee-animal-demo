package hu.ulyssys.java.course.javaee.demo.servlet;

import hu.ulyssys.java.course.javaee.demo.animal.service.PDFExportService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(value = "/cat-pdf")
public class CatPDFServlet extends HttpServlet {

    @Inject
    private PDFExportService pdfExportService;

    private final int ARBITARY_SIZE = 1048;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //PDF mine type = application/pdf
        //minden fájltípusnak ez különböző
        //ezekkel kommunikálnak
        resp.setContentType("application/pdf");
        resp.setHeader("Content-disposition", "attachment; filename=test.pdf");

        //valahonnan beolvassa, amit majd a klient le tud tölteni.

        try (InputStream in = pdfExportService.processExport();

             OutputStream out = resp.getOutputStream()) {

            byte[] buffer = new byte[ARBITARY_SIZE];

            int numBytesRead;
            while ((numBytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, numBytesRead);
            }
        }
    }
}
