package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_page extends AppCompatActivity {

    ListView listView;
    String [] List_of_Data={"Nepal","India","Bhutan","Ktm","Chitwan","Bharatpur"
            ,"India","Bhutan","Ktm","Chitwan","Bharatpur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_page);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, List_of_Data);
        listView.setAdapter(arrayAdapter);



    }
}