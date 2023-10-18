package org.example;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which Story Would You Like To Read? (enter a number)" +
                    " " + "\n1.Goldilocks" + " " + "\n2.Hensel and Gretel" + " " + "\n3.Mary Had a Little Lamb"
            );

            String choice = scanner.nextLine().toLowerCase();

            FileInputStream f1 = null;
            String fileName = "goldilocks.txt";


            switch (choice) {
                case "1", "goldilocks":
                    fileName = "goldilocks.txt";
                    break;
                case "2", "hansel and gretel":
                    fileName = "hansel_and_gretel_.txt";
                    break;
                case "3", "mary had a little lamb":
                    fileName = "mary_had_a_little_lamb.txt";
                    break;
                default:
                    System.out.println("How About We Tell You About Goldilocks");
            }

            f1 = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(f1);

            String input;
            int lineNum = 1;

            while (fileScanner.hasNextLine()) {
                input = fileScanner.nextLine();
                System.out.println(lineNum++ + " . " + input);
            }
            fileScanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}