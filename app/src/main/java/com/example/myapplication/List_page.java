package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_page extends AppCompatActivity {

    ListView listView;
    String [] List_of_Data={"Nepal","India","Bhutan","Ktm","Chit wan","Bharat pur"
            ,"India","Bhutan","Ktm","Chit wan","Bharat pur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_page);
        listView=(findViewById(R.id.list));
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, List_of_Data);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if (i==0){
                    Intent intent1 = new Intent(getApplicationContext(),Login_page.class);
                    startActivity(intent1);
                    Toast.makeText(List_page.this, "CLicked on Nepal", Toast.LENGTH_SHORT).show();
                } else if (i==1) {
                    Intent intent2 = new Intent(getApplicationContext(),Signup_page.class);
                    startActivity(intent2);

                } else if (i==2) {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                    startActivity(intent);

                }
            }
        });



    }
}