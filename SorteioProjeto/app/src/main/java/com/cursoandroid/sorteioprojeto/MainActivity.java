package com.cursoandroid.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Rand (View view){
        Random rand = new Random();
        int num = rand.nextInt(11);
        String numStr = String.valueOf(num);
        TextView text = findViewById(R.id.randNum);
        text.setText("O número selecionado é " + numStr);
    }
}