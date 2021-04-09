package com.maxwell;

import java.io.*;
import java.util.Scanner;


//The program will take each cost and mark it up 30% using the formula (itemCost * 1.3) where itemCost is your own declared variable for product cost.
//
//Your program will print to the screen (console window) a line with the product name, a line with the cost, a line with the markup cost, and lastly with message
//
//“*******Successfully Retrieved*************”.
//
//The program will then write to a file called “Inventory.txt” located in the root folder of your project.
//
//The file Inventory.txt will receive the information and look like the following:
//
//Product Name: Television
//Product Cost: $439.65
//Product Current Price: $571.55
//
//There will be a space between products in the Inventory.txt and all ten products must be listed. See image examples below for format.
//
//Program will have a header at the top of your code with your name, class number, and program purpose in comments (//).
//Be sure to have proper indentation in the code.
//You may not use any code that you find on the Internet or anywhere else to complete this assignment.
//You will also need documentation. Take a screen capture of your program’s execution and put it in a Word document or PDF. Upload this along with your program files in the Assignment Submission Folder. In Windows, hold the Alt key while pressing the print screen button (PrtScn) on the keyboard. A picture of the active window will be stored in memory. Go to Edit-> Paste in your Word document and a screen capture will appear.
//You will submit your .java and screen capture to the Assignment Submission Folder. If you compress these be sure to use ONLY a single ZIP file. You will not submit your work as a .rar or any other type of compressed file format.

public class Main {

    public static void main(String[] args) {
        // Open the .txt file in project folder
        try {
            try (BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\thelo\\IdeaProjects\\Ahhh\\Data.txt"))) {
                String write = "";
                String contentline;
                while ((contentline = br.readLine()) != null) {
                    //read item cost and item
                    System.out.println(contentline);
                }

                //convert string to int
                int y = Integer.parseInt(contentline);

               // write += ("" + y * 1.3);

                System.out.println("" + y);
                br.close();
            }
        } catch (Exception exception) {
            return;
        }
    }
}