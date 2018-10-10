package com.example.naufa.myapplication;

import com.example.naufa.myapplication.Entity.Dosen;
import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.Entity.Mahasiswa;
import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.List;

public class Dataset
{
    public static String Date;
    public static String S_time;
    public static String E_time;
    public static Ruangan ruangan;

    public static List<Ruangan> ruanganList = new ArrayList<>();
    public static List<Mahasiswa> mahasiswaList = new ArrayList<>();
    public static List<Jadwal> jadwalList = new ArrayList<>();
    public static List<Dosen> dosenList = new ArrayList<>();

    public Dataset()
    {

    }

    public static void fetchingData()
    {

    }

}
