package com.startjava.bookcase;

import java.util.Scanner;

public class ViewBooks {
    private static BookCase bookCase;
    private static boolean exit = true;
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        bookCase = new BookCase();
        setPropertyCase();
        exit = true;
        viewMenu();
    }

    private static void setPropertyCase() {
        while (exit) {
            System.out.print("Введите количество полок шкафа: ");
            String numberShelf = sc.nextLine();
            System.out.print("Введите количество книг на полке шкафа: ");
            String numberBooks = sc.nextLine();
            exit = bookCase.setProperty(numberShelf, numberBooks);
        }
    }

    private static void viewMenu() {
        while (exit) {
            printMenu();
            System.out.print("Выберете пункт меню: ");
            try {
                String answer = sc.nextLine();
                runCommand(answer, sc);
            }catch (NumberFormatException e){
                System.out.println("Некорректный тип операции");
            }
        }
    }

    private static void viewAddBook() {
        System.out.print("Введите имя автора: ");
        String author = sc.nextLine();
        System.out.print("Введите название книги: ");
        String title = sc.nextLine();
        System.out.print("Введите год издания: ");
        String year = sc.nextLine();
        if(bookCase.addBook(author, title, year))
            System.out.println("Книга добавлена");
        else
            System.out.println("Такая книга есть в шкфу или шкаф переполнен");
    }

    private static void viewDeleteBook() {
        System.out.println("Введите название книги");
        String title = sc.nextLine();
        if(bookCase.delete(title))
            System.out.println("Книга удалена");
        else
            System.out.println("Такой книги в шкафу нет");

    }

    private static void viewFindBook() {
        System.out.println("Введите название книги");
        String title = sc.nextLine();
        Book book = bookCase.findBook(title);
        if(book != null)
            System.out.println(book.toString());
        else
            System.out.println("С таким названием книги нет");

    }

    private static void viewClearShelf() {
        System.out.print("Введите номер книжной полки: ");
        String title = sc.nextLine();
        if(bookCase.clearShelf(title))
            System.out.println("Полка пустая");
        else
            System.out.println("Полка не пустая");

    }
    private static void viewBooks() {
        if(bookCase.getNumberBooks() > 0) {
            System.out.println("В шкафу находиться " + bookCase.getNumberBooks() + " книг и " + bookCase.getFreeShelf() + " свободных полок");
            Book[][] books = bookCase.viewBooks();
            String border = "-".repeat(bookCase.getMaxLen());
            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < books[i].length; j++) {
                    if(books[i][j] != null) {
                        System.out.println("|" + books[i][j].toString() + " ".repeat(bookCase.getMaxLen() -
                                books[i][j].getLen()) + "|");
                        System.out.println("|" + border + "|");
                    }
                }
            }
        } else {
            System.out.println("Шкаф пустой");
        }
    }
    private static void printMenu() {
        System.out.print("""
                1. Сохранить книгу
                2. Отобразить список книг
                3. Удалить книгу
                4. Найти книгу
                5. Очистить полку книг
                6. Выход
                """);
    }

    public static void runCommand(String answer, Scanner sc) {
        switch (Integer.parseInt(answer)) {
            case 1 :
                viewAddBook();
                break;
            case 2 :
                viewBooks();
                break;
            case 3:
                viewDeleteBook();
                break;
            case 4 :
                viewFindBook();
                break;
            case 5 :
                viewClearShelf();
                break;
            case 6 :
                exit = false;
                break;
        }
    }


}
