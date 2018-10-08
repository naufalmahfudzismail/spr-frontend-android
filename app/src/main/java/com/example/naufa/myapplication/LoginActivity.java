package com.example.naufa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    @BindView(R.id.edt_nim)
    EditText edt_nim;

    @BindView(R.id.edt_pass)
    EditText edt_pass;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    private void login()
    {
        String nim = edt_nim.getText().toString();
        String pass = edt_pass.getText().toString();

    }

    @Override
    public void onClick(View v)
    {
        int id  = v.getId();
        if(id == R.id.btn_login)
        {
            login();
        }
    }
}
