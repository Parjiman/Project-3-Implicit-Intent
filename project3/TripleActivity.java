package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TripleActivity extends AppCompatActivity {
    private EditText editUrl;
    private EditText editLokasi;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triple);
        editUrl=findViewById(R.id.edit_url);
        editLokasi=findViewById(R.id.edit_lokasi);
        editText=findViewById(R.id.edit_text);
    }


    public void openWeb(View view) {
     String url = editUrl.getText().toString();
     Uri webpage=Uri.parse(url);
     Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
     startActivity(intent);
    }

    public void openLok(View view) {
    }

    public void shareText(View view) {
    }

    public void openActivity1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}