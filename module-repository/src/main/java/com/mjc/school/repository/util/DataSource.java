package com.mjc.school.repository.util;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.model.NewsModel;

import java.util.List;

import static com.mjc.school.repository.model.data.AuthorData.getAuthorData;
import static com.mjc.school.repository.model.data.NewsData.getNewsData;

public class DataSource {
    private final List<NewsModel> news;

    private DataSource() {
        List<AuthorModel> authorList = getAuthorData().getAuthorList();
        news = getNewsData(authorList).getNewsList();
    }
    private static class LazyDataSource {
        static final DataSource INSTANCE = new DataSource();
    }
        public static DataSource getInstance() {
            return LazyDataSource.INSTANCE;
        }
        public List<NewsModel> getNews() {
            return news;
        }
    }
