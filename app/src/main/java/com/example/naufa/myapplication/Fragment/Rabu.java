package com.example.naufa.myapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naufa.myapplication.Adapter.JadwalAdapter;
import com.example.naufa.myapplication.Dataset;
import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Rabu extends Fragment
{

    @BindView(R.id.fragment_rcy)
    RecyclerView recyclerView;

    private JadwalAdapter jadwalAdapter;
    private List<Jadwal> jadwalList = new ArrayList<>();
    private static String day = "Rabu";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_jadwal, container, false);
        ButterKnife.bind(this, v);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        getData();
        return v;
    }

    private void getData()
    {
        jadwalList.clear();
        int size = Dataset.jadwalList.size();
        String ruangan = Dataset.ruangan.getNama_ruangan();

        for (int i = 0; i < size; i++)
        {
            String hari = Dataset.jadwalList.get(i).getHari();
            String ruang = Dataset.jadwalList.get(i).getNama_ruangan();

            if (hari.equals(day) && ruang.equals(ruangan))
            {
                jadwalList.add(Dataset.jadwalList.get(i));
            }
        }

        jadwalAdapter = new JadwalAdapter(jadwalList);
        recyclerView.setAdapter(jadwalAdapter);

    }
}
