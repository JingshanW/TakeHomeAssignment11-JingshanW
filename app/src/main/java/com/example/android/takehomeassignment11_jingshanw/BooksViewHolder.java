package com.example.android.takehomeassignment11_jingshanw;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by Jing on 4/17/17.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView bookName;
    private TextView bookAuthor;
    private ImageView bookImage;
    private Context context;


    public BooksViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view_book);
        bookName = (TextView) itemView.findViewById(R.id.book_name);
        bookAuthor = (TextView) itemView.findViewById(R.id.book_author);
        bookImage = (ImageView) itemView.findViewById(R.id.book_image);
        this.context = context;

    }

    public void bind(final Book book) {
        bookName.setText(book.name);
        bookAuthor.setText(book.author);
        bookImage.setImageResource(book.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("NAME", bookName.getText());
                intent.putExtra("AUTHOR", bookAuthor.getText());
                intent.putExtra("IMAGE", bookImage.getId());
                context.startActivity(intent);
            }

        });

    }
}