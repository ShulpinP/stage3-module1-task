//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.repository.model.data;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.repository.utils.Utils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewsData {
    private static final String CONTENT_FILE_NAME = "content";
    private static final String NEWS_FILE_NAME = "news";
    private static NewsData newsData;
    private List<NewsModel> newsList;

    private NewsData(List<AuthorModel> authorModelList) {
        this.init(authorModelList);
    }

    public static NewsData getNewsData(List<AuthorModel> authorModelList) {
        if (newsData == null) {
            newsData = new NewsData(authorModelList);
        }

        return newsData;
    }

    private void init(List<AuthorModel> authorModelList) {
        this.newsList = new ArrayList();
        Random random = new Random();

        for(long i = 1L; i <= 20L; ++i) {
            LocalDateTime date = Utils.getRandomDate();
            this.newsList.add(new NewsModel(i, Utils.getRandomContentByFilePath("news"), Utils.getRandomContentByFilePath("content"), date, date, ((AuthorModel)authorModelList.get(random.nextInt(authorModelList.size()))).getId()));
        }

    }

    public List<NewsModel> getNewsList() {
        return this.newsList;
    }
}
