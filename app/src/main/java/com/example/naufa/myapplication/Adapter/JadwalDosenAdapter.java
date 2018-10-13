package com.example.naufa.myapplication.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JadwalDosenAdapter extends RecyclerView.Adapter<JadwalDosenAdapter.JadwalDosenHolder>
{
    private List<Jadwal> jadwalList;

    public JadwalDosenAdapter(List<Jadwal> jadwalList)
    {
        this.jadwalList = jadwalList;
    }

    @NonNull
    @Override
    public JadwalDosenHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_jadwal_dosen, viewGroup, false);
        return new JadwalDosenHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalDosenHolder jadwalHolder, int i)
    {
        Jadwal jadwal = jadwalList.get(i);

        jadwalHolder.txt_jadwal_name.setText(jadwal.getNama_jadwal());
        jadwalHolder.txt_dosen.setText(jadwal.getKd_dosen());
        String jam = jadwal.getStartDate() + " - " + jadwal.getEndDate();
        jadwalHolder.txt_jam.setText(jam);
        jadwalHolder.txt_name_room.setText(jadwal.getKd_kelas());

        jadwalHolder.edt_jadwal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

    }

    @Override
    public int getItemCount()
    {
        return jadwalList.size();
    }

    class JadwalDosenHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.txt_jadwal_dosen)
        TextView txt_jadwal_name;

        @BindView(R.id.txt_ruangan_dosen)
        TextView txt_name_room;

        @BindView(R.id.txt_jam_dosen)
        TextView txt_jam;

        @BindView(R.id.txt_kelas)
        TextView txt_dosen;

        @BindView(R.id.btn_edt_jadwal)
        Button edt_jadwal;

        JadwalDosenHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
