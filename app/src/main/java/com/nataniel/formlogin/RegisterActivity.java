package com.nataniel.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.service.autofill.SavedDatasetsInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username,password,email;
    Button Simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.usernameRegister);
        password = (EditText) findViewById(R.id.passwordRegister);
        email =(EditText) findViewById(R.id.emailRegister);
        Simpan= (Button) findViewById(R.id.buttonSimpan);
        Simpan.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String usernameRegister=username.getText().toString();
                String passwordRegister=password.getText().toString();
                String email1Register=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(RegisterActivity.this, "your username is "+usernameRegister,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(RegisterActivity.this,MainActivity.class);
                RegisterActivity.this.startActivity(intent);
            }
        });

    }
}
