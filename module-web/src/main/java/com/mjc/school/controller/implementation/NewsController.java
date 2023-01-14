package com.mjc.school.controller.implementation;

import com.mjc.school.controller.interfaces.Controller;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import com.mjc.school.service.factory.ServiceFactory;
import com.mjc.school.service.interfaces.Service;

import java.util.List;

public class NewsController implements Controller<NewsDtoRequest, NewsDtoResponse> {
    private final Service<NewsDtoRequest, NewsDtoResponse> newsService;
    public NewsController() {
        newsService = ServiceFactory.getInstance().getNewsService();
    }
    public List<NewsDtoResponse> readAll() {

        return newsService.readAll();
    }
    @Override

    public NewsDtoResponse readById(Long newsId) {

        return newsService.readById(newsId);
    }
    @Override
    public NewsDtoResponse create(NewsDtoRequest dtoRequest) {

        return newsService.create(dtoRequest);
    }
    @Override

    public NewsDtoResponse update(NewsDtoRequest dtoRequest) {

        return newsService.update(dtoRequest);
    }
    @Override

    public boolean deleteById(Long newsId) {

        return newsService.deleteById(newsId);
    }
}
