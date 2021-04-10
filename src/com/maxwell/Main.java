package com.maxwell;

/*
Maxwell Miller
CSC240C40
Program Inventory Markup
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
            }
            fileScanner.close();

            FileWriter writer = new FileWriter("Inventory.txt");
            for (int i = 0; i < 10; i++) {
                writer.write("Product Name: " + itemNames[i] + "\n");
                writer.write("Product Cost: " + originalCosts[i] + "\n");
                writer.write("Product Current Price: " + markupCosts[i] + "\n\n");
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            File myObj = new File("Inventory.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("*******Successfully Retrieved*************");
    }

}
