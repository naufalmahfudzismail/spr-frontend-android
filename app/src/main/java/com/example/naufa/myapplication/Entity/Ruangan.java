package com.example.naufa.myapplication.Entity;

public class Ruangan
{
    private String kd_ruangan;
    private String nama_ruangan;
    private String status;


    public String getKd_ruangan()
    {
        return kd_ruangan;
    }

    public void setKd_ruangan(String kd_ruangan)
    {
        this.kd_ruangan = kd_ruangan;
    }

    public String getNama_ruangan()
    {
        return nama_ruangan;
    }

    public void setNama_ruangan(String nama_ruangan)
    {
        this.nama_ruangan = nama_ruangan;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Ruangan(String kd_ruangan, String nama_ruangan, String status)
    {
        this.kd_ruangan = kd_ruangan;
        this.nama_ruangan = nama_ruangan;
        this.status = status;
    }


}
