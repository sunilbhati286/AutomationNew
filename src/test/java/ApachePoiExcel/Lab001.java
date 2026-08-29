package ApachePoiExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Lab001 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("/Users/ineel07/Desktop/testData.xlsx");
       XSSFSheet sheet =  workbook.getSheetAt(0);
       for (int i = 0; i<sheet.getLastRowNum(); i++){
           XSSFRow row = sheet.getRow(i);
           for (int j = 0; j <row.getLastCellNum();j++){
               XSSFCell cell = row.getCell(j);
               System.out.print(cell + "\t");
           }
           System.out.println();
           System.out.println("hi");
       }




     }
}
