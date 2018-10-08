package com.example.naufa.myapplication.Entity;

public class Jadwal
{
    private String kd_jadwal;
    private String kd_dosen;
    private String hari;
    private String date;
    private String endDate;
    private String kd_kelas;
    private String kd_ruangan;

    public Jadwal(String kd_jadwal, String kd_dosen, String hari, String date, String endDate, String kd_kelas, String kd_ruangan)
    {
        this.kd_jadwal = kd_jadwal;
        this.kd_dosen = kd_dosen;
        this.hari = hari;
        this.date = date;
        this.endDate = endDate;
        this.kd_kelas = kd_kelas;
        this.kd_ruangan = kd_ruangan;
    }

    public String getKd_jadwal()
    {
        return kd_jadwal;
    }

    public void setKd_jadwal(String kd_jadwal)
    {
        this.kd_jadwal = kd_jadwal;
    }

    public String getKd_dosen()
    {
        return kd_dosen;
    }

    public void setKd_dosen(String kd_dosen)
    {
        this.kd_dosen = kd_dosen;
    }

    public String getHari()
    {
        return hari;
    }

    public void setHari(String hari)
    {
        this.hari = hari;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getKd_kelas()
    {
        return kd_kelas;
    }

    public void setKd_kelas(String kd_kelas)
    {
        this.kd_kelas = kd_kelas;
    }

    public String getKd_ruangan()
    {
        return kd_ruangan;
    }

    public void setKd_ruangan(String kd_ruangan)
    {
        this.kd_ruangan = kd_ruangan;
    }
}

