package com.example.naufa.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookActivity extends AppCompatActivity implements View.OnClickListener
{
    @BindView(R.id.in_time)
    EditText in_time;

    @BindView(R.id.in_date)
    EditText in_date;

    @BindView(R.id.spn_room)
    Spinner spn_room;

    private int mYear, mMonth, mDay, mHour, mMinute;
    private List<Ruangan> ruanganList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        if (id == R.id.btn_date)
        {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,  new DatePickerDialog.OnDateSetListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                {
                    in_date.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
                }
            }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

        if (id == R.id.btn_time)
        {
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                {
                    in_time.setText(hourOfDay + ":" + minute);
                }
            }, mHour, mMinute, false);

            timePickerDialog.show();
        }
    }
}
