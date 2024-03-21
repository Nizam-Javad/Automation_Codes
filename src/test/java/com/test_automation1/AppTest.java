package com.test_automation1;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.*;

//import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

/**
 * Unit test for simple App.
 * 
 */
public class AppTest {
    // Java Program to Demonstrate
    // Working of Map interface

    // Importing required classes

    // Main class

    // Main driver method
    public static void main(String args[]) {
        // Creating an empty HashMap
        int [] arr1={2,1,5,4};
        for (int i=0;i< arr1.length;i++){
            for (int j=i+1;j<=arr1.length;j++){
                temp=0;
                if(arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println(arr1);
}