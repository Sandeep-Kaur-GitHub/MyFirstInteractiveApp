package com.example.myfirstinteractiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view)
    {
        display(96464610);
        priceDisplay(65);
    }
    private void display(int number)
    {
        TextView textview= (TextView) findViewById(R.id.quantity_text_view);
        textview.setText(""+number);
    }
    private void priceDisplay(int number)
    {
        TextView textview=(TextView) findViewById(R.id.price_text_view);
        textview.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}