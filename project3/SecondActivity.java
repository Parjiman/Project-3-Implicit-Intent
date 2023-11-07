package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    public static final String EXTRA_MESSAGE="MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.text_message);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);

        editText = findViewById(R.id.editText2);
    }
    public void openSecondActivity2(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void Button3(View view) {
        Intent intent = new Intent(this,TripleActivity.class);
        startActivity(intent);
    }
}

//public class SecondActivity extends AppCompatActivity {
//    private TextView textView;
//    private EditText editText;
//    public static final String EXTRA_MESSAGE = "MESSAGE";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//        textView = findViewById(R.id.text_message);
//        editText = findViewById(R.id.editText2);
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        textView.setText(message);
//
//        // Mengambil daftar pesan yang terkirim dari Intent
//        ArrayList<String> sentMessages = intent.getStringArrayListExtra("SENT_MESSAGES");
//
//        // Menampilkan daftar pesan yang terkirim
//        if (sentMessages != null && !sentMessages.isEmpty()) {
//            StringBuilder sentMessagesText = new StringBuilder();
//            for (String sentMessage : sentMessages) {
//                sentMessagesText.append(sentMessage).append("\n");
//            }
//            textView.append("\nPesan yang Terkirim:\n" + sentMessagesText.toString());
//        }
//    }
//
//    public void openSecondActivity2(View view) {
//        String message = editText.getText().toString();
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }




