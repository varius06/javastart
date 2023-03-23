package com.startjava.bookcase;

import java.util.Arrays;

public class BookCase {
    private int constBook;
    private Book[][] books;
    private int numberBooks;
    private int maxLen;
    BookCase() {
    }
    public int getNumberBooks() {
        return numberBooks;
    }
    public int getMaxLen() {
        return maxLen;
    }
    public boolean setProperty(String numberShelf, String numberBooks) {
        int constShelf = 0;
        boolean check = true;
        try {
            constShelf = Integer.parseInt(numberShelf);
            constBook = Integer.parseInt(numberBooks);
            if (constShelf > 0 && constBook > 0) {
                check = false;
                books = new Book[constShelf][constBook];
            } else {
                System.out.println("Некорректные данные");
            }
        } catch (NumberFormatException e){
            System.out.println("Некорректный тип операции");
        }
        return check;
    }
    public boolean addBook(String author, String title, String year) {
        boolean check = false;
        if (findBook(title) == null) {
            Book book = new Book(author, title, year);
            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < books[i].length; j++) {
                    if(books[i][j] == null) {
                        books[i][j] = book;
                        i = books.length;
                        check = true;
                        break;
                    }
                }
            }
            if (maxLen < book.getLen())
                maxLen = book.getLen();
            numberBooks++;
        }
        return check;
    }
    public boolean delete(String title){
        boolean operation = false;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                if (books[i][j] != null) {
                    if(books[i][j].getTitle().equals(title)) {
                        operation = true;
                        Book[] arrDestination = new Book[constBook];
                        System.arraycopy(books[i], 0, arrDestination, 0, j);
                        int remainingElements = books[i].length - ( j + 1 );
                        System.arraycopy(books[i], j + 1, arrDestination, j, remainingElements);
                        books[i] = arrDestination;
                        numberBooks--;
                        i = books.length;
                        break;
                    }
                }
            }
        }
        if(operation) {
            for (Book [] elements : books){
                for (Book book : elements) {
                    if(book != null) {
                        if (maxLen < book.getLen())
                            maxLen = book.getLen();
                        break;
                    }
                }
            }
        }
        return operation;
    }
    public Book[][] viewBooks() {
        int quantityShelf = 0;
        for (Book [] elements : books){
            for (Book book : elements) {
                if(book != null) {
                    quantityShelf++;
                    break;
                }
            }
        }
        return Arrays.copyOf(this.books, quantityShelf);
    }
    public Book findBook(String title) {
        Book result = null;
        for (Book [] elements : books) {
            for (Book book : elements) {
                if(book != null) {
                    if(book.getTitle().equals(title)){
                        result = book;
                        break;
                    }
                }
            }
        }
        return result;
    }
    public int getFreeShelf() {
        int freeShelf = 0;
        for (Book [] elements : books) {
            for (Book book : elements) {
                if(book == null)
                    freeShelf++;
                    break;
            }
        }
        return freeShelf;
    }
    public boolean clearShelf(String shelf) {
        int numberShelf = Integer.parseInt(shelf);
        boolean result = false;
        if (numberShelf > 0 && getShelf() >= numberShelf) {
            for (Book book : books[numberShelf - 1]) {
                if (book != null)
                    numberBooks--;
            }
            Arrays.fill(books[numberShelf - 1], 0, constBook, null);
            result = true;
        }
        return result;
    }
    private int getShelf() {
        int shelf = 0;
        for (Book [] elements : books){
            shelf++;
        }
        return shelf;
    }

}
