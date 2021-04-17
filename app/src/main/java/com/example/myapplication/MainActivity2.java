package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    private EditText name;
    public static final String EXTRA_NAME = "com.example.myapplication.extra.NAME ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button)findViewById(R.id.button2);
        editText = findViewById(R.id.editTextTextPersonName4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int num = Integer.parseInt(s);
                if(num==1)
                {
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    name = findViewById(R.id.editTextTextPersonName);
                    String nameText = name.getText().toString();
                    intent.putExtra(EXTRA_NAME, nameText);
                    startActivity(intent);
                }
                else
                {
                    if(num==2)
                    {
                        Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                        name = findViewById(R.id.editTextTextPersonName);
                        String nameText = name.getText().toString();
                        intent.putExtra(EXTRA_NAME, nameText);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity2.this, "Enter Valid Teacher Code", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }
}