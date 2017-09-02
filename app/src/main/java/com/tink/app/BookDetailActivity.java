package com.tink.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class BookDetailActivity extends AppCompatActivity {

    private Books books = Books.getInstance();
    private int bookPosition;
    private Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setup book for position asked for
        bookPosition = getIntent().getIntExtra("BOOK_POSITION", 0);
        book = books.get(bookPosition);

        setContentView(R.layout.activity_book_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView photo = (ImageView) findViewById(R.id.bookPhoto);
        photo.setImageResource(book.getImageId());

        TextView title = (TextView) findViewById(R.id.bookTitle);
        title.setText(book.getName());

        TextView description = (TextView) findViewById(R.id.bookDescription);
        description.setText(book.getDescription());

        TextView price = (TextView) findViewById(R.id.bookPrice);
        price.setText(String.format(Locale.US, "$%.2f", book.getPrice().floatValue()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Purchased! (not really)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
