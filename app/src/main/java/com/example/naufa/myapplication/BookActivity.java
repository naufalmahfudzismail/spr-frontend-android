package com.example.naufa.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookActivity extends AppCompatActivity implements View.OnClickListener
{
    @BindView(R.id.edt_room)
    EditText edt_room;

    @BindView(R.id.edt_date_book)
    EditText edt_date_book;

    @BindView(R.id.edt_start_time_book)
    EditText edt_start_time_book;

    @BindView(R.id.edt_end_time_book)
    EditText edt_end_time_book;

    @BindView(R.id.edt_ket)
    EditText edt_ket;

    @BindView(R.id.btn_date_book)
    Button btn_date;

    @BindView(R.id.btn_time_start_book)
    Button btn_time_start;

    @BindView(R.id.btn_time_end_book)
    Button btn_time_end;

    @BindView(R.id.btn_pinjam)
    Button btn_pinjam;


    private Calendar c = Calendar.getInstance();
    private String hari, date;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        ButterKnife.bind(this);

        btn_date.setOnClickListener(this);
        btn_time_start.setOnClickListener(this);
        btn_time_end.setOnClickListener(this);
        btn_pinjam.setOnClickListener(this);


        edt_date_book.setText(Dataset.Date);
        edt_start_time_book.setText(Dataset.S_time);
        edt_end_time_book.setText(Dataset.E_time);
        edt_room.setText(Dataset.ruangan.getNama_ruangan());


    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        if (id == R.id.btn_date_book)
        {

            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                {
                    edt_date_book.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
                    date = year + "-" + (month + 1) + "-" + dayOfMonth;
                }
            }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

        if (id == R.id.btn_time_start_book)
        {
            int mHour = c.get(Calendar.HOUR_OF_DAY);
            int mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                {
                    edt_start_time_book.setText(hourOfDay + ":" + minute);
                }
            }, mHour, mMinute, false);

            timePickerDialog.show();
        }

        if (id == R.id.btn_time_end_book)
        {
            final Calendar c = Calendar.getInstance();
            int mHour = c.get(Calendar.HOUR_OF_DAY);
            int mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                {
                    edt_end_time_book.setText(hourOfDay + ":" + minute);
                }
            }, mHour, mMinute, false);

            timePickerDialog.show();
        }

        if (id == R.id.btn_pinjam)
        {
            setPeminjaman();
        }

    }

    private void setPeminjaman()
    {
        String input_date = edt_date_book.getText().toString();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date dt1 = null;
        try
        {
            dt1 = format1.parse(input_date);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        @SuppressLint("SimpleDateFormat") DateFormat format2 = new SimpleDateFormat("EEEE");
         hari = format2.format(dt1);
    }

    private String days(int day)
    {
        String har = "";

        switch (day)
        {
            case 1:
                har = "Minggu";
                break;
            case 2:
                har = "Senin";
                break;
            case 3:
                har = "Selasa";
                break;
            case 4:
                har = "Rabu";
                break;
            case 5:
                har = "Kamis";
                break;
            case 6:
                har = "Jumat";
                break;
            case 7:
                har = "Sabtu";
                break;
        }

        return har;

    }
}
