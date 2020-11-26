/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.ui;

import java.util.Scanner;
import library.domain.ReadingTip;
import library.domain.ReadingTipService;

public class ReadingTipUi {
    
    Scanner scanner;
    ReadingTipService service;

    public void start() throws Exception {

        service = new ReadingTipService();
        scanner = new Scanner(System.in);

        System.out.println("Hello user!");

        while (true) {
            printOptions();
            String input = scanner.nextLine();
            if (input.equals("A")) {
                createReadingTip();
            } else if (input.equals("M")) {
                System.out.println("This option is coming soon. Thank you for being patient!");
            } else if (input.equals("L")) {
                System.out.println("This option is coming soon. Thank you for being patient!");
            } else if (input.equals("Q")) {
                break;
            } else {
                System.out.println("Oops, command not existing! Try again.");
            }
        }
    }

    private void printOptions() {
        System.out.println("You can...");
        System.out.println("(A)dd a new reading tip"); //this is what we have at the moment
        System.out.println("(M)odify an existing reading tip"); //coming soon
        System.out.println("(L)ist all existing reading tips"); //coming soon; selecting this allows user to specify searching criteria
        System.out.println("(Q)uit");
    }
    
    private void createReadingTip() {
        System.out.println("What is the title of the reading tip?");
        String title = scanner.nextLine();
        printTypes();
        String type = scanner.nextLine();
        ReadingTip tip = service.createTipWithType(type.toLowerCase(), title);
        System.out.println(tip.toString());
    }
    
    private void printTypes() {
        System.out.println("What kind of reading tip it is?");
        System.out.println("Options:");
        System.out.println("Blogpost");
        System.out.println("Book");
        System.out.println("Podcast");
        System.out.println("Video");
    }

//        ReadingTipService ok = new ReadingTipService();
//
//        String type = "book";
//        String title = "The Hitchhiker's Guide to the Galaxy";
//        String info1 = "Douglas Adams";
//        String info2 = "	0-330-25864-8";
//
//        ok.createTip(type, title, info1, info2);
//        ok.browseReadingTips();
    
//    public void start() throws Exception {
//        ReadingTipService ok = new ReadingTipService();
//        Scanner sc = new Scanner(System.in);
//
//        //String author = "kennedy";
//        System.out.println("Enter a author name: ");
//        String author = sc.nextLine();
//
//        System.out.println("Enter a title");
//        String title = sc.nextLine();
//
//        ok.createTip(author, title);
//
//
//    }
}
