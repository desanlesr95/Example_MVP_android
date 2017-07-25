package com.desan.luis.mvp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,LonginView{
    EditText user,pass;
    Button login;
    ProgressBar progressBar;
    LoginPresentador presentador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=(ProgressBar)findViewById(R.id.progress);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(this);
        presentador=new LoginPresentadorImpl(this);
    }

    @Override
    public void onClick(View view) {
        presentador.validateUsers(user.getText().toString(), pass.getText().toString());
    }



    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        user.setError("Usuario desconocido");
    }

    @Override
    public void setPasswordError() {
        pass.setError("Esta mal la contra");
    }

    @Override
    public void AcceptLogin() {
        Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
    }
}
