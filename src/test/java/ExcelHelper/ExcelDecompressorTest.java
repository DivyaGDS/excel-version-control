package ExcelHelper;

import excelHelper.ExcelHelper;
import org.junit.Test;


import java.io.IOException;

public class ExcelDecompressorTest {
    
    @Test
    public void test(){
        
    }

    @Test
    public void testUnzipExcelFile() throws IOException {
        String sourceExcelFilePath = "src/test/resources/ExcelTest.xlsx";
        String destDirectoryPath = "src/test/resources/Excelpageobjectsdecompressedfolder";
        ExcelHelper.extractExcelFile(sourceExcelFilePath, destDirectoryPath);
    }

    @Test
    public void testCreateExcelFromDir() throws IOException {
        String sourceDirectoryPath = "src/message/resources/testdata/pageobjects/pageobjectsdecompressedfolder";
        String destExcelFilePath = "src/message/resources/testdata/pageobjects/PageObjects.xlsx";
//        ExcelDecompression.zipFolderToCreateExcel(sourceDirectoryPath, destExcelFilePath);
        //message
    }


}
