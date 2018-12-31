package Requests;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import javafx.scene.control.TablePositionBase;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class FreezeBooking {

//    String res1;
//    Response response;
//    Header header;

    int rowCount = 0;
    String[] returnValues;
    String a;
    String[] payload;
    String data;
    ArrayList<String> dataArray = new ArrayList<String>();

    public com.squareup.okhttp.Response FreezeBooking() throws IOException {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        // RequestBody body = RequestBody.create(mediaType, "{\n  \"bookingId\": 45466,\n  \"endDate\": \"2019-12-08\",\n  \"startDate\": \"2018-11-12\"\n}");
        readExcel();
        RequestBody body = RequestBody.create(mediaType, "{\n  \"bookingId\":" + dataArray.get(0) + ",\n  \"endDate\": \" " + dataArray.get(1) + "\",\n  \"startDate\": \"" + dataArray.get(2) + "\"\n}");


        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/booking/freeze")
                .put(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("isCustomerLoggedIn", "true")
                .addHeader("signedInUserId", "51688")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "06f36e9d-f3be-498e-9445-598a31a18ec8")
                .build();

        com.squareup.okhttp.Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }

    public void readExcel() throws IOException {


/*        String fileName = "DataFile.xlsx";
        String filePath = "C:\\Users\\aroma\\sm_101";
        String sheetName = "name";
        //Create an object of File class to open xlsx file

        File file = new File(filePath + "//" + fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook guru99Workbook = null;

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if (fileExtensionName.equals(".xlsx")) {

            //If it is xlsx file then create object of XSSFWorkbook class

            guru99Workbook = new XSSFWorkbook(inputStream);

        }


        //Read sheet inside the workbook by its name

        Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

        //Find number of rows in excel file

        rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
        System.out.print(rowCount + "\n"); //printing 2

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount + 1; i++) {

            Row row = guru99Sheet.getRow(i);

            //Create a loop to print cell values in a row

            for (int k = 0; k < row.getLastCellNum(); k++) {

                //Print Excel data in console

             //   String endPoint = row.getCell(k).getStringCellValue();
                ////////////////

                //GET CELL TablePositionBase sheet1;
               // Cell cell1 = sheetName.getRow(i).getCell(0);
                //SET AS STRING TYPE
                System.out.print(row.getCell(k).getStringCellValue() + "|| ");
                a = row.getCell(k).getStringCellValue();
                returnValues[i] = a;
            }
            // driver.navigate().to(url + "" + endPoint);
            //driver.manage().window().maximize();
            //System.out.print("\n"+url + "" + endPoint+"\n");

//                statusCode = RestAssured.get(url + "" + endPoint).statusCode();
//                if (statusCode == 200)
//
//                {
//
//                    j = j + 1;
//                }
//
//                System.out.print("\n" +statusCode+"\n");
//
//            }

        }
//                returnValues = new int[]{j, rowCount + 1};
            return returnValues;
 */

        File src = new File("C:\\\\Users\\\\aroma\\\\sm_101\\\\DataFile.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1 = wb.getSheetAt(0);
        int rowcount = sheet1.getLastRowNum();
        System.out.println("Total Row " + (rowcount+1));

        for (int i = 0; i < rowcount + 1; i++) {

            System.out.println(i);
            //GET CELL
            Cell cell1 = sheet1.getRow(i).getCell(0);
            //SET AS STRING TYPE
            cell1.setCellType(Cell.CELL_TYPE_STRING);
            data = cell1.getStringCellValue();
            System.out.println("Test Data From Excel : " + data);

            dataArray.add(String.valueOf(data));
        }
        System.out.println(data);
        fis.close();
    }


}


