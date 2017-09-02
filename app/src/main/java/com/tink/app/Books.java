package com.tink.app;

/**
 * Created by temslander on 8/16/17.
 */

import java.util.ArrayList;

class Books {
    private static final Books ourInstance = new Books();

    static Books getInstance() {
        return ourInstance;
    }

    private ArrayList<Book> bookList;

    private Books() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("My Handbook to the T INK", R.drawable.book_1, "My Handbook to the T INK", 5.00));
        bookList.add(new Book("How to do Magic: Magic!", R.drawable.book_2, "How to do Magic: Magic!", 5.00));
        bookList.add(new Book("Moviebook #9: Working on color man 2", R.drawable.book_3, "Moviebook #9: Working on color man 2", 5.00));
        bookList.add(new Book("To the Fair", R.drawable.book_4, "To the Fair", 5.00));
        bookList.add(new Book("Mom's Coloring Pages", R.drawable.book_5, "Mom's Coloring Pages", 5.00));
        bookList.add(new Book("My Lovely Family", R.drawable.book_6, "My Lovely Family", 5.00));
    }

    public int size() {
        return bookList.size();
    }

    public Book get(int index) {
        return bookList.get(index);
    }
}
