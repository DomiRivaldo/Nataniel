package com.nataniel.formlogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SavedDatasetsInfoCallback;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button buttonlog, buttonreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editPassword);
        buttonlog = (Button) findViewById(R.id.ButtonLogin);
        buttonreg= (Button) findViewById(R.id.ButtonRegister);

        buttonreg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Form Register", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey= username.getText().toString();
                String passwordKey= password.getText().toString();

                if (usernameKey.equals("DOM")&& passwordKey.equals("123") ){

                    SavedDatasetsInfoCallback email,password,username;
                    Toast.makeText(getApplicationContext(),"login sukses", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MainActivity.this,LoginActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau passwod anda salah")
                            .setNegativeButton("Retry",null).create().show();
                }

            }
        });
    }
}