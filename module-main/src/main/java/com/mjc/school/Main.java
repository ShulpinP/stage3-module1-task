package com.mjc.school;

import com.mjc.school.controller.Controller;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true) {
            try {
                menu.printMenu();
                switch (scanner.nextLine()) {
                    case "1" -> menu.getNews(controller);
                    case "2" -> menu.getNewsById(controller, scanner);
                    case "3" -> menu.createNews(controller, scanner);
                    case "4" -> menu.updateNews(controller, scanner);
                    case "5" -> menu.deleteNews(controller,scanner);
                    case "0" -> System.exit(0);
                    default -> System.out.println("Not found");
                }
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
