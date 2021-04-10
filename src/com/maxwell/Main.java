package com.maxwell;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


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

//read String and OG cost together


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

            while (fileScanner.hasNextLine()) {

                String data = fileScanner.nextLine();
                String itemName;
                double originalCost;
                double markupCost;


                //  double[] myList = new double[10];

                double[] myList = {439.65, 40.00, 525.99, 139.65, 89.94, 189.94, 29.94, 19.94, 69.94, 49.94};

                ArrayList<Integer> result = new ArrayList<>();

                try (Scanner s = new Scanner(new FileReader("Data.txt"))) {
                    while (s.hasNext()) {
                        result.add(s.nextInt());
                    }
                    return result;
                }

                /*for (double element : myList) {
                  System.out.println(element);

*/
                    //    fileScanner.close();

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


    /*try {
                        originalCost = Double.parseDouble(data);
                        markupCost = Double.parseDouble(data) * 1.3;
                    } catch (NumberFormatException e) {
                        itemName = data;*/
//                System.out.println(fileScanner.nextLine());
//                System.out.println(itemName + originalCost);

//                try {
//                    originalCost = Double.parseDouble(data);
//                    markupCost = Double.parseDouble(data) * 1.3;
//                } catch (NumberFormatException e) {
//                    itemName = data;
//                }