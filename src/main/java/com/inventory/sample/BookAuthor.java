package com.inventory.sample;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class BookAuthor {
    private final Integer authorId;
    private final String authorName;
    private final Date dob;
    private final Map<Integer, String> bookMap = new HashMap<Integer, String>();


    BookAuthor(Integer authorId, String authorName, Map<Integer, String> bookMap, Date dob) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.dob = (Date) dob.clone();

        for (var entry : bookMap.entrySet()) {
            this.bookMap.put(entry.getKey(), entry.getValue());
        }
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Date getDob() {
        return dob;
    }

    public Map<Integer, String> getBookMap() {

        Map<Integer, String> tempMap = new HashMap<Integer, String>();
        for (var entry : this.bookMap.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
