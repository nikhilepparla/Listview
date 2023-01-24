package com.example.alist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String TAG = "MYAPPLICATION";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout relativeLayout;
        relativeLayout = findViewById(R.id.layout);
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = " position " + position + " View " + ((TextView) view).getText().toString();
                Snackbar.make(relativeLayout, text, Snackbar.LENGTH_LONG).show();
            }
        });
    }
}