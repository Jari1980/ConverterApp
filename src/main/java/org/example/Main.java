package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        double amountToExhange;
        double amountExhanged;
        var scan = new Scanner(System.in);
        while(true){
        System.out.println("Currency Converter App:\n" +
                "1. Convert SEK to USD\n" +
                "2. Convert USD to SEK\n" +
                "3. Convert SEK to EURO\n" +
                "4. Convert Euro to SEK\n" +
                "0. Exit\n" +
                "Enter your choice");
        String option = scan.nextLine();
        try{
            int optionNum = Integer.parseInt(option);
            switch(optionNum){
                case 1:
                    amountToExhange = amount();
                    amountExhanged = Converter.sekToUsd(amountToExhange);
                    System.out.format("You will receive %.2f USD", amountExhanged);
                    System.out.println();
                    break;
                case 2:
                    amountToExhange = amount();
                    amountExhanged = Converter.usdToSek(amountToExhange);
                    System.out.format("You will receive %.2f SEK", amountExhanged);
                    System.out.println();
                    break;
                case 3:
                    amountToExhange = amount();
                    amountExhanged = Converter.sekToEuro(amountToExhange);
                    System.out.format("You will receive %.2f Euro", amountExhanged);
                    System.out.println();
                    break;
                case 4:
                    amountToExhange = amount();
                    amountExhanged = Converter.euroToSek(amountToExhange);
                    System.out.format("You will receive %.2f SEK", amountExhanged);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Closing program");
                    System.exit(0);
                default:
                    System.out.println("Not a valid option, choose again.");
                    break;
            }
        }
        catch (Exception e){
            System.out.println("Not a valid number, choose again.");
            }
            System.out.println();
        }
    }

    public static double amount(){
        var scan = new Scanner(System.in);
        double exh;
        while(true){
            System.out.println("Exhange amount? :");
            String amount = scan.nextLine();
            try{
                exh = Double.parseDouble(amount);
                if(exh < 0){
                    System.out.println("Cant exhange negative amount.");
                }
                else{
                    break;
                }
            }
            catch (Exception ex){
                System.out.println("Not a valid number.");
            }
        }
        return exh;
    }

}