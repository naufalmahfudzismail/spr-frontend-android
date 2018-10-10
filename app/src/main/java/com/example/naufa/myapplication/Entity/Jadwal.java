package com.example.naufa.myapplication.Entity;

public class Jadwal
{
    private String kd_jadwal;
    private String kd_dosen;
    private String hari;
    private String date;
    private String startDate;
    private String endDate;
    private String nama_ruangan;

    public String getNama_ruangan()
    {
        return nama_ruangan;
    }

    public void setNama_ruangan(String nama_ruangan)
    {
        this.nama_ruangan = nama_ruangan;
    }

    private String kd_ruangan;
    private String nama_jadwal;

    public Jadwal(String kd_jadwal, String kd_dosen, String hari, String startDate, String endDate, String nama_ruangan, String kd_ruangan, String nama_jadwal, String Date)
    {
        this.kd_jadwal = kd_jadwal;
        this.kd_dosen = kd_dosen;
        this.hari = hari;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nama_ruangan = nama_ruangan;
        this.kd_ruangan = kd_ruangan;
        this.nama_jadwal = nama_jadwal;
        this.date =  Date;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getNama_jadwal()
    {
        return nama_jadwal;
    }

    public void setNama_jadwal(String nama_jadwal)
    {
        this.nama_jadwal = nama_jadwal;
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
        return nama_ruangan;
    }

    public void setKd_kelas(String nama_ruangan)
    {
        this.nama_ruangan = nama_ruangan;
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

