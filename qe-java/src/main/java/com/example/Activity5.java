package com.example;

abstract class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    abstract void setTitle(String title);

    public String getTitle() {
        return this.title;
    }
}

class MyBook extends Book {
    MyBook() {
        super("");
    }

    @Override
    void setTitle(String title) {
        this.title = title;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        myBook.setTitle("Arabian Nights");
        System.out.println("The title of the book is " + myBook.getTitle());
    }
}
