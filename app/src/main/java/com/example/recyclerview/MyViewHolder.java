package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.item_name);
    }
}

/*
*
*    package com.danieloskarsson.recyclerviewapp;
*
*   @SuppressWarnings("WeakerAccess")
*    public class RecyclerViewItem {
*
*        private String title;
*
*        public RecyclerViewItem(String title) {
*            this.title = title;
*        }
*
*        public String getTitle() {
*            return title;
*        }
*    }
*
*/

/* package annorlunda. not private string. MyViewHolder kom upp automatiskt vid alt enter på något. */