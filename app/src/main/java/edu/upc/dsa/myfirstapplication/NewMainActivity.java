package edu.upc.dsa.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NewMainActivity extends AppCompatActivity {

    Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);

        //btn7 = (Button) findViewById(R.id.btn7);

    }
    public void showOnBoard(View view){
        Log.d("MYAPP", "He hecho click en el button" );
    }

/*
    btn7.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
        }
    });
*/
}