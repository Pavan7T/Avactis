package com.avactis.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

	public static List<Product> getProducts(String filePath) {
		System.out.println("File Path: " + filePath);
		List<Product> products = new ArrayList<Product>();

		try (FileInputStream file = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(file)) {

			Sheet sheet = workbook.getSheetAt(0);
			int numberOfRows = sheet.getPhysicalNumberOfRows();

			for (int i = 1; i < numberOfRows; i++) { // Start at 1 to skip the header row
				Row row = sheet.getRow(i);

				String category = row.getCell(0).getStringCellValue();
				String productName = row.getCell(1).getStringCellValue();
				int quantity = (int) row.getCell(2).getNumericCellValue();

				products.add(new Product(category, productName, quantity));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return products;
	}
}
