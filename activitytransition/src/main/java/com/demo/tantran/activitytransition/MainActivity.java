package com.demo.tantran.activitytransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View title;
    View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Screen");
        title = findViewById(R.id.title);
        button = findViewById(R.id.button);
    }

    public void gotoDetail(View view) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, Pair.create(title, "title"), Pair.create(button,
                    "button"));
            Intent intent = new Intent(this, DetailActivity.class);
            startActivity(intent, options.toBundle());
        }
    }
}
