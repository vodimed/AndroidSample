package com.smartoperator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView control = findViewById(R.id.scroller);
        control.setOnClickListener(onClick);
        control.setMovementMethod(new android.text.method.ScrollingMovementMethod());
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ((android.widget.TextView)view).append(String.format("%d\n", ++i));
        }
    };
}
