package com.example.naufa.myapplication.Entity;

import java.util.ArrayList;
import java.util.List;

public class Kelas
{
    private String kd_kelas;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private String nama_kelas;

    public Kelas()
    {
    }

    public String getKd_kelas()
    {
        return kd_kelas;
    }

    public void setKd_kelas(String kd_kelas)
    {
        this.kd_kelas = kd_kelas;
    }

    public List<Mahasiswa> getMahasiswaList()
    {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList)
    {
        this.mahasiswaList = mahasiswaList;
    }

    public String getNama_kelas()
    {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas)
    {
        this.nama_kelas = nama_kelas;
    }
}
