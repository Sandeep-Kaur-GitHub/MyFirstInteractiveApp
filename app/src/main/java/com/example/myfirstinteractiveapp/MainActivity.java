package com.example.myfirstinteractiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view)
    {
     priceDisplay(quantity*10);
    }
    public void increment(View view)
    {
    quantity = quantity+1;
      display(quantity);
    }
    public void decrement(View view)
    {
    quantity = quantity-1;
    display(quantity);
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