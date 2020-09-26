package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.List;

public class WebTables extends TestBase {

    //Create a class: WebTables
    //Create a method: login()
    //Log in  http://www.kaolapalace-qa-environment2.com/
    //Click on Hotel Management
    //Click on Hotel Rooms

    public void login() {
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.id("menuHotels")).click();
        driver.findElement(By.partialLinkText("Hotel Rooms")).click();
    }




//    @Test
//    public void entireTable() throws InterruptedException {
//   //Create a test method: entireTable() and Find the size of the entire table body and print all of headers
//        login();
//        Thread.sleep(2000);
//        WebElement tBody= driver.findElement(By.xpath("//tbody"));
//        System.out.println(tBody.getText());
//
//        List<WebElement> tableData = driver.findElements(By.xpath("//td"));
//        System.out.println(tableData.size());
//        for (WebElement eachData: tableData) {
//            System.out.println(eachData.getText());
//        }
//
//        List<WebElement> headers = driver.findElements(By.xpath("//th"));
//        System.out.println(headers.size());
//        for (WebElement eachData: headers) {
//            System.out.println(eachData.getText());
//        }
//    }



//    @Test
//    public void printRows() throws InterruptedException {
//     //  Create a test method: printRows() and Print all of the rows and print the element s on the 4th row
//        login();
//        List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr"));
//        for (WebElement eachData: allRows) {
//            System.out.println(eachData.getText());
//        }
//
//        WebElement fourthRow = driver.findElement(By.xpath("//tbody//tr[4]"));
//        System.out.println(fourthRow.getText());
//    }

//    @Test
//    public void printCells(){
//        //  Create a test method: printCells() and Find the total number of cells in the table body and print all of the cells
//        login();
//        List<WebElement> allCells = driver.findElements(By.xpath("//tbody//td"));
//        for (WebElement eachCells:allCells ) {
//            System.out.println(eachCells.getText());
//        }
//        System.out.println(allCells.size());
//    }


//    @Test
//        public void printColumns() throws InterruptedException {
//        //  Create a test method: printColumns() and print Find the total number of columns and Print the elements of the 5th column
//        login();
//        List<WebElement> allColumns = driver.findElements(By.xpath("//thead//th"));
//        System.out.println(allColumns.size());
//        Thread.sleep(2000);
//
//
//        List<WebElement> fifthElement = driver.findElements(By.xpath("//td[5]"));
//        for (WebElement eachElement:fifthElement) {
//            System.out.println(eachElement.getText());
//        }
//
//    }


    @Test
    public void webTableHomework() throws InterruptedException {

        login();
        Thread.sleep(5000);


        //  test if the 6th column includes price of 1000,
        WebElement sixtColumn = driver.findElement(By.xpath("//tbody")); //it should be //td[6]
        String text = sixtColumn.getText();
        Assert.assertTrue(text.contains("1,000.00"));

        //  test if the first table row has Orlando,
        WebElement firstRow = driver.findElement(By.xpath("//tbody//tr[1]"));
        String text1 = firstRow.getText();
        Assert.assertTrue(text1.contains("Orlando"));

        //  test if fourth column has hilton
        WebElement fourthColumn = driver.findElement(By.xpath("//tbody"));  //it should be //td[4]
        String text2 = fourthColumn.getText();
        Assert.assertTrue(text2.contains("Hilton"));

























    }



}

