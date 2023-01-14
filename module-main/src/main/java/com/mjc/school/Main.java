package com.mjc.school;

import com.mjc.school.controller.implementation.NewsController;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsController newsController = new NewsController();
        Menu menu = new Menu();
        while (true) {
            try {
                menu.printMenu();
                switch (scanner.nextLine()) {
                    case "1" -> menu.getNews(newsController);
                    case "2" -> menu.getNewsById(newsController, scanner);
                    case "3" -> menu.createNews(newsController, scanner);
                    case "4" -> menu.updateNews(newsController, scanner);
                    case "5" -> menu.deleteNews(newsController,scanner);
                    case "0" -> System.exit(0);
                    default -> System.out.println("Not found");
                }
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
