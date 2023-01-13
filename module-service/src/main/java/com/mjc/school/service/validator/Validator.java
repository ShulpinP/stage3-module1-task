//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.service.validator;

import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.exceptions.ServiceErrorCode;
import com.mjc.school.service.exceptions.ValidatorException;

public class Validator {
    private static Validator newsValidator;
    private static final String NEWS_ID = "News id";
    private static final String NEWS_CONTENT = "News content";
    private static final String AUTHOR_ID = "Author id";
    private static final String NEWS_TITLE = "News title";
    private static final Integer NEWS_CONTENT_MIN_LENGTH = 5;
    private static final Integer NEWS_CONTENT_MAX_LENGTH = 255;
    private static final Integer NEWS_TITLE_MIN_LENGTH = 5;
    private static final Integer NEWS_TITLE_MAX_LENGTH = 30;
    private static final Integer MAX_AUTHOR_ID = 20;

    public Validator() {
    }

    public static Validator getNewsValidator() {
        if (newsValidator == null) {
            newsValidator = new Validator();
        }

        return newsValidator;
    }

    public void validateNewsId(Long newsId) {
        this.validateNumber(newsId, "News id");
    }

    public void validateAuthorId(Long authorId) {
        this.validateNumber(authorId, "Author id");
        if (authorId > (long)MAX_AUTHOR_ID) {
            throw new ValidatorException(String.format(ServiceErrorCode.AUTHOR_ID_DOES_NOT_EXIST.getMessage(), authorId));
        }
    }

    public void validateNewsDto(NewsDtoRequest dtoRequest) {
        this.validateString(dtoRequest.title(), "News title", NEWS_TITLE_MIN_LENGTH, NEWS_TITLE_MAX_LENGTH);
        this.validateString(dtoRequest.content(), "News content", NEWS_CONTENT_MIN_LENGTH, NEWS_CONTENT_MAX_LENGTH);
        this.validateAuthorId(dtoRequest.authorId());
    }

    private void validateNumber(Long id, String parameter) {
        if (id == null || id < 1L) {
            throw new ValidatorException(String.format(ServiceErrorCode.VALIDATE_NEGATIVE_OR_NULL_NUMBER.getMessage(), parameter, parameter, id));
        }
    }

    private void validateString(String value, String parameter, int minLength, int maxLength) {
        if (value == null) {
            throw new ValidatorException(String.format(ServiceErrorCode.VALIDATE_NULL_STRING.getMessage(), parameter, parameter));
        } else if (value.trim().length() < minLength || value.trim().length() > maxLength) {
            throw new ValidatorException(String.format(ServiceErrorCode.VALIDATE_STRING_LENGTH.getMessage(), parameter, minLength, maxLength, parameter, value));
        }
    }
}
