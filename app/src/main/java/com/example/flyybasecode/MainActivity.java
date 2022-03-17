package com.example.flyybasecode;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.firebase.FirebaseApp;

import theflyy.com.flyy.Flyy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton offersButton = findViewById(R.id.offersButton);
        AppCompatButton navigateButton = findViewById(R.id.navigateButton);
        FirebaseApp.initializeApp(this);

        //TODO Config 1: Paste Package name from "Settings > Connect SDK" in Dashboard.
        Flyy.setPackageName("");
        //TODO Config 2: Paste Partner Id from "Settings > SDK Keys" in Dashboard.
        Flyy.init(getApplicationContext(), "", Flyy.STAGE);

        Flyy.setUser("test_user_1");
        Flyy.setUsername("Test User");

        offersButton.setOnClickListener(
                v -> {
                    //TODO Step 1: Navigate to Offers Activity
                }
        );

        navigateButton.setOnClickListener(
                v -> {
                    navigateToCartActivity();
                }
        );
    }

    private void navigateToCartActivity() {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}