package com.example.naufa.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.Entity.Ruangan;

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
    private static String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        btn_change.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        getData();
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
                btn_change.setText("Login sebagai Mahasiswa");
            }
            else
            {
                isDosen = false;
                txt_log_role.setText("Login Mahasiswa");
                txt_nim.setText("NIM");
                btn_change.setText("Login sebagai Dosen");
            }
        }
    }

    private void getData()
    {
        Ruangan ruangan = new Ruangan("1", "AA204", "available" );
        Dataset.ruanganList.add(ruangan);
        Ruangan ruangan1 = new Ruangan("2", "AA205", "Available");
        Dataset.ruanganList.add(ruangan1);
        Ruangan ruangan2 = new Ruangan("3", "AA301", "Available");
        Dataset.ruanganList.add(ruangan2);
        Ruangan ruangan3 = new Ruangan("4", "AA302", "Available");
        Dataset.ruanganList.add(ruangan3);
        Ruangan ruangan4 = new Ruangan("5", "AA303", "Available");
        Dataset.ruanganList.add(ruangan4);
        Ruangan ruangan5 = new Ruangan("6", "AA304", "Available");
        Dataset.ruanganList.add(ruangan5);
        Ruangan ruangan6 = new Ruangan("7", "AA305", "Available");
        Dataset.ruanganList.add(ruangan6);

        Jadwal jadwal = new Jadwal("1", "Pedro", "Senin", "07:30",
                                   "11:00", "AA301", "3", "Web 2", "15-10-2018" );
        Dataset.jadwalList.add(jadwal);

        Jadwal jadwal1 = new Jadwal("2", "Pedrosa","Selasa", "07:30",
                                    "11:00", "AA302", "4", "Web 2", "16-10-2018" );
        Dataset.jadwalList.add(jadwal1);

        Jadwal jadwal2 = new Jadwal("3", "Pedrosi","Rabu", "07:30",
                                    "11:00", "AA303", "5", "Web 2", "17-10-2018" );
        Dataset.jadwalList.add(jadwal2);
        Jadwal jadwal3 = new Jadwal("4", "Pedrosu","Kamis", "07:30",
                                    "11:00", "AA304", "6", "Web 2", "18-10-2018" );
        Dataset.jadwalList.add(jadwal3);

        Jadwal jadwal4 = new Jadwal("5", "Pedrosy","Jumat", "07:30",
                                    "11:00", "AA305", "7", "Web 2", "19-10-2018" );
        Dataset.jadwalList.add(jadwal4);

        Jadwal jadwal5 = new Jadwal("6", "Pedrosya","Senin", "07:30",
                                    "11:00", "AA305", "7", "Web 2", "15-10-2018" );
        Dataset.jadwalList.add(jadwal5);

        Jadwal jadwal6 = new Jadwal("7", "Pedrosaw","Selasa", "07:30",
                                    "11:00", "AA304", "6", "Web 2", "16-10-2018" );
        Dataset.jadwalList.add(jadwal6);

        Jadwal jadwal7 = new Jadwal("8", "Pedrosi","Rabu", "07:30",
                                    "11:00", "AA303", "5", "Web 2", "17-10-2018" );
        Dataset.jadwalList.add(jadwal7);

        Jadwal jadwal8 = new Jadwal("9", "Pedrode","Kamis", "07:30",
                                    "11:00", "AA302", "4", "Web 2", "18-10-2018" );
        Dataset.jadwalList.add(jadwal8);

        Jadwal jadwal9 = new Jadwal("10", "Pedroyan","Jumat", "07:30",
                                    "11:00", "AA301", "3", "Web 2", "19-10-2018" );
        Dataset.jadwalList.add(jadwal9);

        for ( int i = 0; i < Dataset.jadwalList.size(); i++)
        {
            Log.d(TAG, Dataset.jadwalList.get(i).getNama_ruangan());

        }

        /*Jadwal jadwal10 = new Jadwal("11", "Pedro","Senin", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal10);
        Jadwal jadwal11 = new Jadwal("12", "Pedro","Selasa", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal11);
        Jadwal jadwal12 = new Jadwal("13", "Pedro","Rabu", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal12);
        Jadwal jadwal13 = new Jadwal("14", "Pedro","Kamis", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal13);
        Jadwal jadwal14 = new Jadwal("15", "Pedro","Jumat", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal14);
        Jadwal jadwal15 = new Jadwal("16", "Pedro","Senin", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal15);
        Jadwal jadwal16 = new Jadwal("17", "Pedro","Selasa", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal16);
        Jadwal jadwal17 = new Jadwal("18", "Pedro","Rabu", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal17);
        Jadwal jadwal18 = new Jadwal("19", "Pedro","Kamis", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal18);
        Jadwal jadwal19 = new Jadwal("20", "Pedro","Jumat", "07:30",
                                     "11:00", "AA301", "3", "Web 2" );
        Dataset.jadwalList.add(jadwal19);*/
    }
}
