//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.repository.model.data;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class AuthorData {
    private static final String AUTHORS_FILE_NAME = "authors";
    private static AuthorData authorData;
    private List<AuthorModel> authorList;

    private AuthorData() {
        this.init();
    }

    public static AuthorData getAuthorData() {
        if (authorData == null) {
            authorData = new AuthorData();
        }

        return authorData;
    }

    private void init() {
        this.authorList = new ArrayList();

        for(long i = 1L; i <= 20L; ++i) {
            this.authorList.add(new AuthorModel(i, Utils.getRandomContentByFilePath("authors")));
        }

    }

    public List<AuthorModel> getAuthorList() {
        return this.authorList;
    }
}
