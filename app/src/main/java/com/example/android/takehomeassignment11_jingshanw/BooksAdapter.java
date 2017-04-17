package com.example.android.takehomeassignment11_jingshanw;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Jing on 4/17/17.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksViewHolder>{
    private List<Book>books;
    private Context context;

    public BooksAdapter(List<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_book, parent, false);
        return new BooksViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(BooksViewHolder holder,int position){
        Book book=books.get(position);
        holder.bind(book);

    }

    @Override
    public int getItemCount(){
        return books.size();
    }
}
