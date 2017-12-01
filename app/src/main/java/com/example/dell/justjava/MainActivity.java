package com.example.dell.justjava;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void add(View view) {
        n = n + 1;
        display(n);
        TextView TON = (TextView) findViewById(R.id.checkt);
        TextView T2ON = (TextView) findViewById(R.id.price_text_view);
        TON.setVisibility(View.INVISIBLE);
        T2ON.setVisibility(View.INVISIBLE);
//        displayPrice(n*5);
    }

    public void minus(View view) {
        TextView TON = (TextView) findViewById(R.id.checkt);
        TextView T2ON = (TextView) findViewById(R.id.price_text_view);
        TON.setVisibility(View.INVISIBLE);
        T2ON.setVisibility(View.INVISIBLE);
        if (n > 0) {
            n = n - 1;
        } else {
            n = 0;
        }

        display(n);
//        displayPrice(n*5);
    }

    public void checkout(View view) {

//        displayPrice(n * 5);

        TextView TON = (TextView) findViewById(R.id.checkt);
        TextView T2ON = (TextView) findViewById(R.id.price_text_view);

        TON.setVisibility(View.VISIBLE);
        T2ON.setVisibility(View.VISIBLE);

        if (n == 1) {

            String priceMessage = "You Ordered " + n + " a cup of coffee" + "\n This will cost you " + n * 5 + " $ \n Happy to serve you";
            displayMessage(priceMessage);
        }
        else if(n==0){

            String priceMessage = "Matsa3'arnash ya 3m \n Lazm tshrab 7aga :D";
            displayMessage(priceMessage);
        }
    else{

            String priceMessage = "You Ordered " + n + " cups of coffee " + "\n This will cost you " + n * 5 + " $ \n Happy to serve you";
            displayMessage(priceMessage);

        }
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText("" + number*5+"$");  other solution
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}