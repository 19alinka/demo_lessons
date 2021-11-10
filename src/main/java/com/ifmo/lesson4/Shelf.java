package com.ifmo.lesson4;

import com.ifmo.lesson4.Book;

import java.util.Objects;

public class Shelf {
    private Book book;
    private int quantity;

    public Shelf(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public int  getQuantity() { return quantity; } // возвращает значение
    public void setQuantity(int book) { this.quantity = quantity; } // принимает аргумент int book(количество) и
                                                                    // присваивает его значение this.quantity


}
