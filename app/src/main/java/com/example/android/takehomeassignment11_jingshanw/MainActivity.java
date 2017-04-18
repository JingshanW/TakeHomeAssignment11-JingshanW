package com.example.android.takehomeassignment11_jingshanw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book>books;
    private BooksAdapter booksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        booksAdapter=new BooksAdapter(books,this);
        recyclerView.setAdapter(booksAdapter);

    }



    public void initialData(){
        books=new ArrayList<>();
        books.add(new Book("Dubliners","James Joyce",R.drawable.dubliners));
        books.add(new Book("Pride and Prejudice","Jane Austin",R.drawable.prideandprejudice));
        books.add(new Book("The Sun Also Rises","Ernest Hemingway",R.drawable.thesunalsorises));
    }

    public Book getRandomBook(){
        int num=(int)(Math.random()*3);
        if(num==0){
            return new Book("Dubliners","James Joyce",R.drawable.dubliners);
        }
        if(num==1){
            return new Book("Pride and Prejudice","Jane Austin",R.drawable.prideandprejudice);
        }
        else{
            return new Book("The Sun Also Rises","Ernest Hemingway",R.drawable.thesunalsorises);
        }
    }

    public void addRandomBook(View view)
    {
        books.add(getRandomBook());
        booksAdapter.notifyDataSetChanged();
    }
}
