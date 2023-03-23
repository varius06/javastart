package com.startjava.bookcase;

public class Book {
    private String author;
    private String title;
    private String year;
    private int maxLen;
    Book(String author, String title, String year){
        this.author = author;
        this.title = title;
        this.year = year;
        String str = author + ", " + title + ", " + year;
        maxLen = str.length();
    }
    public String getTitle() {
        return title;
    }
    public int getLen() {
        return maxLen;
    }
    public String toString() {
        return author + ", " + title + ", " + year;
    }
}
