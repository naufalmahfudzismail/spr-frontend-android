package com.example.naufa.myapplication.Entity;

public class Mahasiswa
{
    private String nim;
    private String nama;
    private String nama_ruangan;

    public Mahasiswa(String nim, String nama, String nama_ruangan)
    {
        this.nim = nim;
        this.nama = nama;
        this.nama_ruangan = nama_ruangan;
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
        return nama_ruangan;
    }

    public void setKd_kelas(String nama_ruangan)
    {
        this.nama_ruangan = nama_ruangan;
    }
}
