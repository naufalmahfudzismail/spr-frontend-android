package com.example.naufa.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.naufa.myapplication.Adapter.FragmentAdapter;
import com.example.naufa.myapplication.Adapter.JadwalDosenAdapter;
import com.example.naufa.myapplication.Fragment.Jumat;
import com.example.naufa.myapplication.Fragment.Kamis;
import com.example.naufa.myapplication.Fragment.Rabu;
import com.example.naufa.myapplication.Fragment.Selasa;
import com.example.naufa.myapplication.Fragment.Senin;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DosenPageActivity extends AppCompatActivity
{
    @BindView(R.id.dosen_nip)
    TextView dosen_nip;

    @BindView(R.id.dosen_name)
    TextView dosen_name;

    @BindView(R.id.tablayout_dosen)
    TabLayout tabLayout;

    @BindView(R.id.vp_dosen)
    ViewPager viewPager;


    JadwalDosenAdapter jadwalDosenAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_page);
        ButterKnife.bind(this);
        setFragment();
    }

    private void setFragment()
    {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());

        fragmentAdapter.addFragmet(new Senin(), "Senin");
        fragmentAdapter.addFragmet(new Selasa(), "Selasa");
        fragmentAdapter.addFragmet(new Rabu(), "Rabu");
        fragmentAdapter.addFragmet(new Kamis(), "Kamis");
        fragmentAdapter.addFragmet(new Jumat(), "Jumat");

        dosen_nip.setText(Dataset.dosen_nip);
        dosen_name.setText(Dataset.nama_dosen);

        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
