package com.mrrobot.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText2=findViewById(R.id.editText2);
        Intent intent=getIntent();//İntent'i al demek istiyoruz.
        String userName=intent.getStringExtra("userInput");//Diğer activity'de verdiğimiz anahtar kelimeyi burada veriyoruz.
        editText2.setText(userName);
    }
    /*
        MainActivity'nin bulunduğu klasörden yeni activity oluşturabiliriz. Böylece bir uygulamada farklı ekranlarımız oluşur.
     */
    public void changeScreen(View view){

        Intent intent2=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent2);

    }






}