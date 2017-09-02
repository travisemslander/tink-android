package com.tink.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.GridView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String description = books.get(position).getDescription();
                Toast.makeText(MainActivity.this, description, Toast.LENGTH_SHORT).show();

                Intent detailIntent = new Intent(this, BookDetailActivity.class);
                detailIntent.setData(Uri.parse("data://"+position));
                startService(detailIntent);
            }
        });
    }

    private Books books = Books.getInstance();
}
