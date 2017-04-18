package com.example.android.takehomeassignment11_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.takehomeassignment11_jingshanw.Keys.BOOK;

public class SecondActivity extends AppCompatActivity {

    private ImageView image;
    private TextView name;
    private TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image= (ImageView) findViewById(R.id.book_image_second);
        name= (TextView) findViewById(R.id.book_name_second);
        author= (TextView) findViewById(R.id.book_author_second);

        Intent intent=getIntent();
//        int i=intent.getIntExtra("IMAGE",1);
        Book b= (Book) intent.getSerializableExtra(BOOK);
        image.setImageResource(b.getPhotoId());
        name.setText(b.getName());
        author.setText(b.getAuthor());

    }
}
