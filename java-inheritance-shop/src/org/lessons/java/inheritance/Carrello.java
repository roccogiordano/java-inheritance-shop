package org.lessons.java.inheritance;

import java.util.Scanner;


public class Carrello {
    public static void main(String[] args) {
        

        // Scanner Generation

        Scanner input = new Scanner(System.in);

        //


        // User Input


        System.out.println("Inserisci la categoria del prodotto - 'Smartphone' 'Televisore' 'Cuffie'");
        String inputCategory = input.nextLine();


        if (inputCategory.equals("Smartphone")) {

            System.out.println("Inserisci il nome del prodotto:");
            String inputName = input.nextLine();
    
            System.out.println("Inserisci il brand del prodotto:");
            String inputBrand = input.nextLine();
    
            System.out.println("Inserisci il prezzo base del prodotto:");
            float inputBasePrice = input.nextFloat();
    
            System.out.println("Inserisci l'IVA del prodotto:");
            int inputIva = input.nextInt();

            System.out.println("Inserisci l'IMEI dello smartphone:");
            long inputImei = input.nextLong();

            System.out.println("Inserisci la memoria dello smartphone:");
            int inputMemory = input.nextInt();

            Smartphone smartphone = new Smartphone(inputName, inputBrand, inputBasePrice, inputIva, inputImei, inputMemory);

            System.out.println("Nome: " + inputName + " - Brand: " + inputBrand + " - Prezzo Base: " + inputBasePrice + "$" + " - Iva: " + inputIva + "%" + " - IMEI : " + inputImei + " - Wireless: " + inputMemory + "GB");

        } else if (inputCategory.equals("Televisore")) {

            System.out.println("Inserisci il nome del prodotto:");
            String inputName = input.nextLine();
    
            System.out.println("Inserisci il brand del prodotto:");
            String inputBrand = input.nextLine();
    
            System.out.println("Inserisci il prezzo base del prodotto:");
            float inputBasePrice = input.nextFloat();
    
            System.out.println("Inserisci l'IVA del prodotto:");
            int inputIva = input.nextInt();

            System.out.println("Inserisci le dimensioni del televisore:");
            int inputScreenSize = input.nextInt();

            System.out.println("Il televisore è smart? ( true | false ):");
            boolean inputIsSmart = input.nextBoolean();

            Televisore televisore = new Televisore(inputName, inputBrand, inputBasePrice, inputIva, inputScreenSize, inputIsSmart);

            System.out.println("Nome: " + inputName + " - Brand: " + inputBrand + " - Prezzo Base: " + inputBasePrice +  "$" + " - Iva: " + inputIva + "%" + " - Dimensioni: " + inputScreenSize + " - Smart: " + inputIsSmart);

        } else if (inputCategory.equals("Cuffie")) {

            System.out.println("Inserisci il nome del prodotto:");
            String inputName = input.nextLine();
    
            System.out.println("Inserisci il brand del prodotto:");
            String inputBrand = input.nextLine();
    
            System.out.println("Inserisci il prezzo base del prodotto:");
            float inputBasePrice = input.nextFloat();
    
            System.out.println("Inserisci l'IVA del prodotto:");
            int inputIva = input.nextInt();

            System.out.println("Inserisci il colore delle cuffie:");
            String inputColor = input.nextLine();

            System.out.println("Le cuffie sono wireless? ( true | false ):");
            boolean inputIsWireless = input.nextBoolean();

            Cuffie cuffie = new Cuffie(inputName, inputBrand, inputBasePrice, inputIva, inputColor, inputIsWireless);

            System.out.println("Nome: " + inputName + " - Brand: " + inputBrand + " - Prezzo Base: " + inputBasePrice + "$" + " - Iva: " + inputIva + "%" + " - Colore: " + inputColor + " - Wireless: " + inputIsWireless);

        } else {
            
            System.out.println("Perfavore, inserisci una delle 3 categorie proposte");

        }

        input.close();

        //
        

        //

        //

    }

}
