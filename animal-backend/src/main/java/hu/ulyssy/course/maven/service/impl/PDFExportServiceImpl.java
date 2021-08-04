package hu.ulyssy.course.maven.service.impl;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import hu.ulyssys.java.course.maven.entity.entity.Cat;
import hu.ulyssys.java.course.maven.entity.service.CatService;
import hu.ulyssys.java.course.maven.entity.service.PDFExportService;

import javax.inject.Inject;
import java.io.*;

public class PDFExportServiceImpl implements PDFExportService {

    @Inject
    private CatService catService;

    @Override
    public InputStream processExport() {

        //TODO implementálni kell, hogy visszaadja az InputStreamet
        try {
            Document document = new Document();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            PdfWriter.getInstance(document, stream);
            document.open();
            for (Cat cat : catService.getAll()) {
                document.add(new Paragraph("Id: " + cat.getId() + ", név: "
                        + cat.getName() + ", típus: " + cat.getAnimalType()));
            }
            document.close();
            return new ByteArrayInputStream(stream.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
