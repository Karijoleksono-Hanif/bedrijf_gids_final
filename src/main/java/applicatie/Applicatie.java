package applicatie;

import dp_ChainofResponsibility.PaymentDemo;
import dp_composite.BetalingMedewerkers;
import dp_factory.GenereerFactuur;
import service.DataService;
import service.DummyDataService;

import java.io.IOException;
import java.util.Scanner;


public class Applicatie {
    public static void close() throws InterruptedException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        Thread.sleep(100);
        System.out.println("Applicatie afgesloten..................\n");
        System.exit(0);
    }

    public static void keuze() {
        System.out.println("\nVoer uw menu keuze in: ");
    }

    public static void Menu() throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n\n\n\n\nMENU bedrijven gids");
            System.out.println("------------------------------------");
            System.out.print("1       Data Dummy create operation \n");
            System.out.print("2       Data read operation\n");
            System.out.print("3       Data update operation\n");
            System.out.print("4       Data delete operation\n");
            System.out.print("5       Design Patterns Chain of responsibility\n");
            System.out.print("6       Design Patterns Composite\n");
            System.out.print("7       Design Patterns Factory\n");
            System.out.print("8  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 8);
        switch (choice) {

            case 1:
                subMenu();
            case 2:
                subMenu2();
            case 3:
                subMenu3();
            case 4:
                subMenu4();
            case 5:
                subMenu5();
            case 6:
                subMenu6();
            case 7:
                subMenu7();
            case 8: // AFSLUITEN
                close();
                break;
        }
    }


    public static void subMenu() throws InterruptedException, IOException {
        DummyDataService.createDummyData();
        System.out.println(">> Dummy Data created successful !!!\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();
        }
    }

    public static void subMenu2() throws InterruptedException, IOException {
        DataService.readDataBedrijf();
        System.out.println(">> Data Read 'bedrijf' operation successful !!!\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();
        }
    }

    public static void subMenu3() throws InterruptedException, IOException {
        DataService.updateBedrijf();
        DataService.readDataBedrijf();
        System.out.println(">> Data bedrijf update 'bedrijf' operation successful !!! (see 'updated' key word above)\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();
        }
    }

    public static void subMenu4() throws InterruptedException, IOException {
        DataService.deleteMediaFiles();
        DataService.readDataMediaFiles();
        System.out.println(">> Data delete 'mediaFiles' operation successful !!! (data deleted where id is '1', see above)");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();
        }
    }

    public static void subMenu5() throws InterruptedException, IOException {
        PaymentDemo.Transactie();
        System.out.println(">> Design Patterns Chain of responsibility successful !!!\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();

        }
    }

    public static void subMenu6() throws InterruptedException, IOException {
        BetalingMedewerkers.Betalingen();
        System.out.println(">> Design Patterns Composite successful !!!\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();

        }
    }
    public static void subMenu7() throws InterruptedException, IOException {
        GenereerFactuur.factuur();
        System.out.println(">> Design Patterns Factory successful !!!\n");
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("-----------------------\n");
            System.out.print("1  [<]  MENU\n");
            System.out.print("2  [X]  CLOSE APP\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 2);
        switch (choice) {
            case 1:
                Menu();
            case 2:
                close();
        }
    }


}