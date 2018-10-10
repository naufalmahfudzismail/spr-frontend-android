package com.example.naufa.myapplication;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.naufa.myapplication.Adapter.JadwalAdapter;
import com.example.naufa.myapplication.Adapter.ResultRoomAdapter;
import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity
{
    @BindView(R.id.result_rcy)
    RecyclerView recyclerView;

    private ResultRoomAdapter resultRoomAdapter;

    List<Ruangan> ruanganList = new ArrayList<>();
    List<Ruangan> anti_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        getData();
    }

    private void getData()
    {
        int size = Dataset.jadwalList.size();
        for (int i = 0; i < size; i++)
        {
            String tanggal = Dataset.jadwalList.get(i).getDate();
            String start = Dataset.jadwalList.get(i).getStartDate();
            String end = Dataset.jadwalList.get(i).getEndDate();

            if (tanggal.equals(Dataset.Date) && start.equals(Dataset.S_time) && end.equals(Dataset.E_time))
            {
                String ruangan = Dataset.jadwalList.get(i).getNama_ruangan();

                for (int j = 0; j < Dataset.ruanganList.size(); i++)
                {
                    if(ruangan.equals(Dataset.ruanganList.get(j).getNama_ruangan()))
                    {
                        anti_list.add(Dataset.ruanganList.get(j));
                    }
                }
            }
        }

        ruanganList.addAll(Dataset.ruanganList);
        ruanganList.removeAll(anti_list);

        resultRoomAdapter = new ResultRoomAdapter(ruanganList, this);
        recyclerView.setAdapter(resultRoomAdapter);

    }
}
