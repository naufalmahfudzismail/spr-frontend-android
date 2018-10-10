package com.example.naufa.myapplication.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.JadwalHolder>
{
    private List<Jadwal> jadwalList;

    public JadwalAdapter(List<Jadwal> jadwalList)
    {
        this.jadwalList = jadwalList;
    }

    @NonNull
    @Override
    public JadwalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_jadwal, viewGroup, false);
        return new JadwalHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalHolder jadwalHolder, int i)
    {
        Jadwal jadwal = jadwalList.get(i);

        jadwalHolder.txt_jadwal_name.setText(jadwal.getNama_jadwal());
        jadwalHolder.txt_dosen.setText(jadwal.getKd_dosen());
        String jam = jadwal.getStartDate() + " - " + jadwal.getEndDate();
        jadwalHolder.txt_jam.setText(jam);
        jadwalHolder.txt_name_room.setText(jadwal.getKd_kelas());

    }

    @Override
    public int getItemCount()
    {
        return jadwalList.size();
    }

    class JadwalHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.txt_jadwal_name)
        TextView txt_jadwal_name;

        @BindView(R.id.txt_ruangan_name)
        TextView txt_name_room;

        @BindView(R.id.txt_jam)
        TextView txt_jam;

        @BindView(R.id.txt_dosen)
        TextView txt_dosen;

        JadwalHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
