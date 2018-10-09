package com.example.naufa.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    @BindView(R.id.edt_nim)
    EditText edt_nim;

    @BindView(R.id.edt_pass)
    EditText edt_pass;

    @BindView(R.id.txt_log_role)
    TextView txt_log_role;

    @BindView(R.id.txt_nim)
    TextView txt_nim;

    @BindView(R.id.btn_login)
    Button btn_login;

    @BindView(R.id.btn_change)
    Button btn_change;

    private  boolean isDosen = false;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        btn_change.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    private void loginMhsw()
    {
        String nim = edt_nim.getText().toString();
        String pass = edt_pass.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    private void loginDosen()
    {
        String nim = edt_nim.getText().toString();
        String pass = edt_pass.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v)
    {
        int id  = v.getId();
        if(id == R.id.btn_login)
        {
            if(isDosen)
            {
                loginDosen();
            }
            else
            {
                loginMhsw();
            }
        }

        if( id == R.id.btn_change)
        {
            counter ++;

            if(counter % 2 == 0)
            {
                isDosen = true;
                txt_log_role.setText("Login Dosen");
                txt_nim.setText("NIP");
            }
            else
            {
                isDosen = false;
                txt_log_role.setText("Login Mahasiswa");
                txt_nim.setText("NIM");
            }
        }
    }
}
