package com.example.naufa.myapplication.Entity;

public class Dosen
{
    private String nip;
    private String nama;

    public Dosen(String nip, String nama)
    {
        this.nip = nip;
        this.nama = nama;
    }

    public Dosen()
    {

    }

    public String getNip()
    {
        return nip;
    }

    public void setNip(String nip)
    {
        this.nip = nip;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }
}
