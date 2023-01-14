package com.mjc.school;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.exceptions.ValidatorException;
import com.mjc.school.service.exceptions.ServiceErrorCode;

import static com.mjc.school.Action.*;


import java.util.Scanner;

public class Menu {
    public static final String NEWS_ID = "News Id";
    public static final String AUTHOR_ID = "Author Id";
    public static final String NUMBER_OPERATION_ENTER = "Enter the number of operation:";
    public static final String NEWS_ID_ENTER = "Enter news id:";
    public static final String NEWS_TITLE_ENTER = "Enter news title:";
    public static final String NEWS_CONTENT_ENTER = "Enter news content:";
    public static final String AUTHOR_ID_ENTER = "Enter author id:";
    public static final String COMMAND_NOT_FOUND = "Command not found.";
    public static final String ACTION = "Action: ";
    public void printMenu() {
        System.out.println(NUMBER_OPERATION_ENTER);
        for (Action action:Action.values()) {
            System.out.println(action.getActionWithNumber());
        }
    }
    public void getNews(NewsController newsController) {
        System.out.println(GET_ALL_NEWS.getAction());
        newsController.readAll().forEach(System.out::println);
    }

    public void getNewsById(NewsController newsController, Scanner input) {
        System.out.println(GET_NEWS_BY_ID.getAction());
        System.out.println(NEWS_ID_ENTER);
        System.out.println(newsController.readById(getKeyboardNumber(NEWS_ID, input)));
    }

    public void createNews(NewsController newsController, Scanner input) {
        NewsDtoRequest dtoRequest = null;
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println(CREATE_NEWS.getAction());
                System.out.println(NEWS_TITLE_ENTER);
                String title = input.nextLine();
                System.out.println(NEWS_CONTENT_ENTER);
                String content = input.nextLine();
                System.out.println(AUTHOR_ID_ENTER);
                Long authorId = getKeyboardNumber(AUTHOR_ID, input);
                dtoRequest = new NewsDtoRequest(null, title, content, authorId);
                isValid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(newsController.create(dtoRequest));
    }

    public void updateNews(NewsController newsController, Scanner keyboard) {
        NewsDtoRequest dtoRequest = null;
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println(UPDATE_NEWS.getAction());
                System.out.println(NEWS_ID_ENTER);
                Long newsId = getKeyboardNumber(NEWS_ID, keyboard);
                System.out.println(NEWS_TITLE_ENTER);
                String title = keyboard.nextLine();
                System.out.println(NEWS_CONTENT_ENTER);
                String content = keyboard.nextLine();
                System.out.println(AUTHOR_ID_ENTER);
                Long authorId = getKeyboardNumber(AUTHOR_ID, keyboard);
                dtoRequest = new NewsDtoRequest(newsId, title, content, authorId);
                isValid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(newsController.update(dtoRequest));
    }

    public void deleteNews(NewsController newsController, Scanner keyboard) {
        System.out.println(REMOVE_NEWS_BY_ID.getAction());
        System.out.println(NEWS_ID_ENTER);
        System.out.println(newsController.deleteById(getKeyboardNumber(NEWS_ID, keyboard)));
    }

    private long getKeyboardNumber(String params, Scanner keyboard) {
        long enter = 0;
        try {
            enter = keyboard.nextLong();
            keyboard.nextLine();
        } catch (Exception ex) {
            keyboard.nextLine();
            throw new ValidatorException(
                    String.format(ServiceErrorCode.VALIDATE_INT_VALUE.getMessage(), params));
        }
        return enter;
    }
}
