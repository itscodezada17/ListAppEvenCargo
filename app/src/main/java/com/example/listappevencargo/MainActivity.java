package com.example.listappevencargo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Item> itemList;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = new ArrayList<>();
        recyclerView = findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

        addItem(new Item("Item 1", 10.99));
        addItem(new Item("Item 2", 19.99));
        addItem(new Item("Item 3", 7.50));
        addItem(new Item("Item 4", 10.99));
        addItem(new Item("Item 5", 19.99));
        addItem(new Item("Item 6", 7.50));
        addItem(new Item("Item 7", 10.99));
        addItem(new Item("Item 8", 19.99));
        addItem(new Item("Item 9", 7.50));
        addItem(new Item("Item 10", 10.99));
        addItem(new Item("Item 11", 19.99));
        addItem(new Item("Item 12", 7.50));
        addItem(new Item("Item 13", 10.99));
        addItem(new Item("Item 14", 19.99));
        addItem(new Item("Item 15", 7.50));
    }

    private void addItem(Item item) {
        itemList.add(item);
        itemAdapter.notifyDataSetChanged();
    }
}

