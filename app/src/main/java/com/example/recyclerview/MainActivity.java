package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

/*
ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
        new RecyclerViewItem("Matterhorn"),
        new RecyclerViewItem("Mont Blanc"),
        new RecyclerViewItem("Denali")
));
*/

/* string istället för recyclerviewitem, arrays.aslists istället för new arraylist och <> */

/*
RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
    @Override
    public void onClick(RecyclerViewItem item) {
        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
    }
});
 */

/* onbind istället för onclick. holder istället för adapter?  */

/*
RecyclerView view = findViewById(R.id.recycler_view);
view.setLayoutManager(new LinearLayoutManager(this));
view.setAdapter(adapter);
 */



/* 5 ist 3 mountains.  */