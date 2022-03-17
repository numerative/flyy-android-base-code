package com.example.flyybasecode;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        AppCompatButton checkoutButton = findViewById(R.id.checkoutButton);

        checkoutButton.setOnClickListener(
                v -> {
                    //TODO Step 2: Send purchase Event
                }
        );
    }
}