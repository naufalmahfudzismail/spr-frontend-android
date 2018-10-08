package com.example.naufa.myapplication.Entity;

public class Mahasiswa
{
    private String nim;
    private String nama;
    private String kd_kelas;

    public Mahasiswa(String nim, String nama, String kd_kelas)
    {
        this.nim = nim;
        this.nama = nama;
        this.kd_kelas = kd_kelas;
    }

    public String getNim()
    {
        return nim;
    }

    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getKd_kelas()
    {
        return kd_kelas;
    }

    public void setKd_kelas(String kd_kelas)
    {
        this.kd_kelas = kd_kelas;
    }
}
