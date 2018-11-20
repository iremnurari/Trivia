package com.example.nurir.loginex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn, btn2;
     EditText username;
     EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signup();
            }
        });
    }

    String adminUser = "admin";
    String adminPassword = "1111";
    String user = "";
    String pass = "";

    void Signup(){
        user = username.getText().toString();
        pass = password.getText().toString();

    }
    void Login() {
        if(adminUser.equals(username.getText().toString()) && adminPassword.equals(password.getText().toString())){
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("username", "Admin");
            startActivity(intent);
        }
        else if(user.equals(username.getText().toString()) && pass.equals(password.getText().toString())){
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("username", user);
            startActivity(intent);
        }
        else
            Toast.makeText(getApplicationContext(), "Wrong username or password", Toast.LENGTH_LONG).show();

    }


}
