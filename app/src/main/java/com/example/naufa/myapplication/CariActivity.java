package com.example.naufa.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.naufa.myapplication.Entity.Ruangan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CariActivity extends AppCompatActivity implements View.OnClickListener
{
    @BindView(R.id.in_time)
    EditText in_time;

    @BindView(R.id.in_date)
    EditText in_date;

    @BindView(R.id.in_end_time)
    EditText in_end_time;

    @BindView(R.id.btn_date)
    Button btn_date;

    @BindView(R.id.btn_time)
    Button btn_time;

    @BindView(R.id.btn_end_time)
    Button btn_end_time;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);
        ButterKnife.bind(this);
        btn_date.setOnClickListener(this);
        btn_time.setOnClickListener(this);
        btn_end_time.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        if (id == R.id.btn_date)
        {
            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
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
            int mHour = c.get(Calendar.HOUR_OF_DAY);
            int mMinute = c.get(Calendar.MINUTE);

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

        if(id == R.id.btn_end_time)
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
                    in_end_time.setText(hourOfDay + ":" + minute);
                }
            }, mHour, mMinute, false);

            timePickerDialog.show();
        }

        if( id == R.id.btn_cari)
        {
            findData();
        }
    }

    private void findData()
    {
        String date = in_date.getText().toString();
        String startTime = in_time.getText().toString();
        String endTime = in_end_time.getText().toString();

        if( date.isEmpty() || startTime.isEmpty() || endTime.isEmpty())
        {
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(this, "Semua data harus di isi", duration).show();
        }

        else
        {

        }
    }
}
