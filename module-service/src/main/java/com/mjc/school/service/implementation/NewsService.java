package com.mjc.school.service.implementation;

import com.mjc.school.repository.interfaces.Repository;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import com.mjc.school.service.interfaces.Service;
import com.mjc.school.service.validator.Validator;

import java.util.List;

public class NewsService implements Service<NewsDtoRequest, NewsDtoResponse> {
    private final Repository<NewsModel> newsRepository;
    private final Validator newsValidator;
    @Override
    public List<NewsDtoResponse> readAll() {
        return null;
    }

    @Override
    public NewsDtoResponse readById(Long newsId) {
        return null;
    }

    @Override
    public NewsDtoResponse create(NewsDtoRequest dtoRequest) {
        return null;
    }

    @Override
    public NewsDtoResponse update(NewsDtoRequest dtoRequest) {
        return null;
    }

    @Override
    public Boolean deleteById(Long newsId) {
        return null;
    }
}
