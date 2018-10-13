package com.example.naufa.myapplication;

import com.example.naufa.myapplication.Entity.Dosen;
import com.example.naufa.myapplication.Entity.Jadwal;
import com.example.naufa.myapplication.Entity.Mahasiswa;
import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.List;

public class Dataset   // Global Variable
{
    public static String Date;  // tanggal
    public static String S_time; //start time
    public static String E_time; // end time
    public static Ruangan ruangan; // ruangan

    public static String nama_dosen;
    public static String dosen_nip;
    public static boolean isDosen = false;

    public static List<Ruangan> ruanganList = new ArrayList<>();
    public static List<Mahasiswa> mahasiswaList = new ArrayList<>();
    public static List<Jadwal> jadwalList = new ArrayList<>();
    public static List<Dosen> dosenList = new ArrayList<>();

    public Dataset()
    {

    }


}
