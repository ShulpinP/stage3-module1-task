//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.service.exceptions;

public enum ServiceErrorCode {
    NEWS_ID_DOES_NOT_EXIST("000001", "News with id %d does not exist."),
    AUTHOR_ID_DOES_NOT_EXIST("000002", "Author Id does not exist. Author Id is: %s"),
    VALIDATE_NEGATIVE_OR_NULL_NUMBER("000010", "%s can not be null or less than 1. %s is: %s"),
    VALIDATE_NULL_STRING("000011", "%s can not be null. %s is null"),
    VALIDATE_STRING_LENGTH("000012", "%s can not be less than %d and more than %d symbols. %s is %s"),
    VALIDATE_INT_VALUE("000013", "%s should be number");

    private final String errorMessage;

    private ServiceErrorCode(String errorCode, String message) {
        this.errorMessage = "ERROR_CODE: " + errorCode + " ERROR_MESSAGE: " + message;
    }

    public String getMessage() {
        return this.errorMessage;
    }

    public String getErrorCode() {
        return this.errorMessage;
    }

    private static class Constants {
        private static final String ERROR_000001 = "000001";
        private static final String ERROR_000002 = "000002";
        private static final String ERROR_000010 = "000010";
        private static final String ERROR_000011 = "000011";
        private static final String ERROR_000012 = "000012";
        private static final String ERROR_000013 = "000013";

        private Constants() {
        }
    }
}
