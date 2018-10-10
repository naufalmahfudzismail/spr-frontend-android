package com.example.naufa.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.naufa.myapplication.Adapter.FragmentAdapter;
import com.example.naufa.myapplication.Fragment.Jumat;
import com.example.naufa.myapplication.Fragment.Kamis;
import com.example.naufa.myapplication.Fragment.Rabu;
import com.example.naufa.myapplication.Fragment.Selasa;
import com.example.naufa.myapplication.Fragment.Senin;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity
{
    @BindView(R.id.txt_detail_room)
    TextView txt_room;

    @BindView(R.id.tablayout_detail)
    TabLayout tabLayout;

    @BindView(R.id.vp_detail)
    ViewPager viewPager;

    @BindView(R.id.btn_detail_pinjam)
    Button btn_pinjam;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        btn_pinjam.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(DetailActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        setFragment();
    }

    private void setFragment()
    {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());

        fragmentAdapter.addFragmet(new Senin(),"Senin");
        fragmentAdapter.addFragmet(new Selasa(), "Selasa");
        fragmentAdapter.addFragmet(new Rabu(), "Rabu");
        fragmentAdapter.addFragmet(new Kamis(), "Kamis");
        fragmentAdapter.addFragmet(new Jumat(), "Jumat");

        txt_room.setText(Dataset.ruangan.getNama_ruangan());
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}
