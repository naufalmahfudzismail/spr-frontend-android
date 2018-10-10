package com.example.naufa.myapplication;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.naufa.myapplication.Adapter.ListRoomAdapter;
import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener
{

    @BindView(R.id.btn_cari)
    Button btn_cari;

    @BindView(R.id.list_rcy)
    RecyclerView recyclerView;

    private ListRoomAdapter listRoomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn_cari.setOnClickListener(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        listRoomAdapter = new ListRoomAdapter(Dataset.ruanganList,this);
        recyclerView.setAdapter(listRoomAdapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        return false;
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();

        if(id == R.id.btn_cari)
        {
            Intent intent = new Intent(this, CariActivity.class);
            startActivity(intent);
        }
    }


}
