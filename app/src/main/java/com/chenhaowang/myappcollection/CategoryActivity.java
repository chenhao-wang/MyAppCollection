package com.chenhaowang.myappcollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button movieButton = (Button) findViewById(R.id.app_movie_button);
        Button stockButton = (Button) findViewById(R.id.app_stock_button);
        Button readerButton = (Button) findViewById(R.id.app_reader_button);
        Button newsButton = (Button) findViewById(R.id.app_news_button);
        Button finalButton = (Button) findViewById(R.id.app_final_button);

        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoryActivity.this, getString(R.string.start_movie_app), Toast.LENGTH_SHORT).show();
            }
        });

        stockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoryActivity.this, getString(R.string.start_stock_app), Toast.LENGTH_SHORT).show();
            }
        });

        readerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoryActivity.this, getString(R.string.start_reader_app), Toast.LENGTH_SHORT).show();
            }
        });

        newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoryActivity.this, getString(R.string.start_news_app), Toast.LENGTH_SHORT).show();
            }
        });

        finalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CategoryActivity.this, getString(R.string.start_final_app), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
