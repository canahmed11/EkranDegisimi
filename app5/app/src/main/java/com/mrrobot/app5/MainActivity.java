package com.mrrobot.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);

    }

    public void changeActivity(View view){
        /*
            Intent nesnesi activity'ler arasında gidip gelebilmemizi sağlar. İlk parametrede bulunduğumuz activity'i,
            2. parametrede gideceğimiz activity'i belirtiriz. Aynı şeyleri diğer activity'de de yapabiliriz.
            Activity'ler arasında giderken kullanıcıdan aldığımız verileride taşıyabiliriz. Bunun farklı yolları var ancak
            Şimdilik Intent ile yapalım.
         */

        userName=editText.getText().toString();
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("userInput",userName);//Bu metodta 1.parametre anahtar kelime, 2.parametre alınan veri'dir.
        //Veriyi aldık ancak alınan veriyi diğer activity'de karşılamak gerekiyor. Yani orada da birkaç işlem yapılmalı.
        startActivity(intent);

    }









}