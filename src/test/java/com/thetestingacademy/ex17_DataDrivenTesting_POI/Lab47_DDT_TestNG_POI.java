package com.thetestingacademy.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username,String password){
        System.out.println("Multiple Time Login I Have to check!");
        System.out.println(username + " - " + password);
        System.out.println();
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
        };

    }

//    @DataProvider
//    public Object[][] getData(){
//       //FETCH THE DATA FROM THE EXCEL FILE
   // .// return 2d array
//
//    }






}
