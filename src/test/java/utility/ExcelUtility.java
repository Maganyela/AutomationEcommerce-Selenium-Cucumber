package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtility {


    public String readExcelCellValue(String columnName, int rowNumber, int columnNumber) throws IOException {
        String cellValue = null;

        // Load the Excel file
        File file = new File("src/main/resources/LoginCredentials.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Get the cell value at the specific row and column
        XSSFRow dataRow = sheet.getRow(rowNumber - 1);
        if (dataRow != null) {
            XSSFCell dataCell = dataRow.getCell(columnNumber - 1);
            if (dataCell != null) {
                cellValue = dataCell.getStringCellValue();
            } else {
                throw new RuntimeException("Data cell is empty or not found!");
            }
        } else {
            throw new RuntimeException("Data row is empty or not found!");
        }

        workbook.close();
        fis.close();

        return cellValue;
    }
}
