package com.example.alist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String TAG = "MYAPPLICATION";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Accessing listview from xml
        ListView listView = findViewById(R.id.listview);

        //array list is a array where you can add remove measure the list of items
        ArrayList arrayList = new ArrayList();
        arrayList.add("nikhil");
        arrayList.add("ANIL");
        arrayList.add("20");


        //TO convert array list into view and display this list in xml we use array adaptor
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);

        //adding the listview to array adaptor
        listView.setAdapter(arrayAdapter);
    }
}