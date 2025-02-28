package org.example; //DO NOT DELETE

/**
 * Sua Cho
 * Gallon Converter
 */

import java.util.Scanner; 

public class ScannerExample {
  public static void main (String[] args) {

        double gallons;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of gallons: ");
        gallons = input.nextDouble(); 

        double quartsPerGallon = 4;   
        double pintsPerQuart = 2;     
        double cupsPerPint = 2;       
        double tablespoonsPerCup = 16; 

        double quarts = gallons * quartsPerGallon;
        double pints = quarts * pintsPerQuart;
        double cups = pints * cupsPerPint;
        double tablespoons = cups * tablespoonsPerCup;

        System.out.println("In " + gallons + " gallons there are:");
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");

      input.close();
    }
}
