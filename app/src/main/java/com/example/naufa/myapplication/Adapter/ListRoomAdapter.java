package com.example.naufa.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.naufa.myapplication.Dataset;
import com.example.naufa.myapplication.DetailActivity;
import com.example.naufa.myapplication.Entity.Ruangan;
import com.example.naufa.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListRoomAdapter extends RecyclerView.Adapter<ListRoomAdapter.RoomHolder>
{
    private List<Ruangan> ruanganList;
    private Context context;

    public ListRoomAdapter(List<Ruangan> ruanganList, Context context)
    {
        this.ruanganList = ruanganList;
        this.context = context;
    }

    @NonNull
    @Override
    public RoomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_room, viewGroup, false);
        return new RoomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomHolder roomHolder, int i)
    {
        final Ruangan ruangan = ruanganList.get(i);

        roomHolder.txt_room.setText(ruangan.getNama_ruangan());
        roomHolder.btn_room.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Dataset.ruangan = ruangan;
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return ruanganList.size();
    }

    class RoomHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.txt_name_room)
        TextView txt_room;

        @BindView(R.id.btn_room)
        Button btn_room;

        RoomHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
