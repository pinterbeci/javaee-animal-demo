package hu.ulyssy.course.maven.service.impl;


import hu.ulyssys.java.course.maven.entity.entity.AbstractAnimal;
import hu.ulyssys.java.course.maven.entity.entity.Cat;
import hu.ulyssys.java.course.maven.entity.entity.Dog;
import hu.ulyssys.java.course.maven.entity.entity.Slug;
import hu.ulyssys.java.course.maven.entity.service.CatService;
import hu.ulyssys.java.course.maven.entity.service.DogService;
import hu.ulyssys.java.course.maven.entity.service.SlugService;
import hu.ulyssys.java.course.maven.entity.service.XLSExportService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.inject.Inject;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XLSExportServiceImpl implements XLSExportService {

    @Inject
    private CatService catService;

    @Inject
    private DogService dogService;

    @Inject
    private SlugService slugService;

    @Override
    public void processExport() {

        Workbook wb = new HSSFWorkbook();  // or new XSSFWorkbook();
        Sheet catSheet = wb.createSheet("Cat");
        Sheet dogSheet = wb.createSheet("Dog");
        Sheet slugSheet = wb.createSheet("Slug");

        int i = 0;
        Row catHeader = catSheet.createRow(i);
        catHeader.createCell(0).setCellValue("Id");
        catHeader.createCell(1).setCellValue("Név");
        catHeader.createCell(2).setCellValue("Típus");
        catHeader.createCell(3).setCellValue("Nyávogás");
        catHeader.createCell(4).setCellValue("Lábakszáma");

        i++;

        for (Cat cat : catService.getAll()) {
            Row row = createSheet(catSheet, i, cat);
            row.createCell(4).setCellValue(cat.getLegsNumber());
            i++;
        }

        i = 0;
        Row dogHeader = dogSheet.createRow(i);
        dogHeader.createCell(0).setCellValue("Id");
        dogHeader.createCell(1).setCellValue("Név");
        dogHeader.createCell(2).setCellValue("Típus");
        dogHeader.createCell(3).setCellValue("Lábakszáma");
        i++;
        for (Dog dog : dogService.getAll()) {
            createSheet(dogSheet, i, dog);
            i++;
        }

        i = 0;
        Row slugHeader = slugSheet.createRow(i);
        slugHeader.createCell(0).setCellValue("Id");
        slugHeader.createCell(1).setCellValue("Név");
        slugHeader.createCell(2).setCellValue("Típus");
        slugHeader.createCell(3).setCellValue("Lábakszáma");
        i++;
        for (Slug slug : slugService.getAll()) {
            createSheet(slugSheet, i, slug);
            i++;
        }


        try (OutputStream fileOut = new FileOutputStream("workbook2.xls")) {

            wb.write(fileOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Row createSheet(Sheet sheet, int i, AbstractAnimal animal) {
        Row row = sheet.createRow(i);
        row.createCell(0).setCellValue(animal.getId());
        row.createCell(1).setCellValue(animal.getName());
        row.createCell(2).setCellValue(animal.getAnimalType().toString());
        row.createCell(3).setCellValue(animal.getLegsNumber());
        return row;
    }
}

