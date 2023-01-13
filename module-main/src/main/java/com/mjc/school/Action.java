package com.mjc.school;

public enum Action {
    GET_ALL_NEWS(1, "Get all news."),
    GET_NEWS_BY_ID(2, "Get news by id."),
    CREATE_NEWS(3, "Create news."),
    UPDATE_NEWS(4, "Update news."),
    REMOVE_NEWS_BY_ID(5, "Remove news by id."),
    EXIT(0, "Exit.");
    private final Integer actionNumber;
    private final String action;
    Action(Integer actionNumber, String action) {
        this.actionNumber = actionNumber;
        this.action = action;
    }
    public String getAction() {
        return "Action: " + this.action;
    }

    public String getActionWithNumber() {
        return this.action + " - " + this.actionNumber;
    }


}
