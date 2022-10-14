package com.example.ismobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DetailMahasiswaActivity extends AppCompatActivity {

    private RecyclerView rvLogbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail_mahasiswa);

        rvLogbook = findViewById(R.id.recview_logbook);

        LogBookAdapter adapter = new LogBookAdapter(new ArrayList<>());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvLogbook.setLayoutManager(layoutManager);
        rvLogbook.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public ArrayList<LogBook> getLogbook(){
        ArrayList<LogBook> listLogbook = new ArrayList<>();
        listLogbook.add(new LogBook("Revisi Bab 2", "20/10/2022"));
        listLogbook.add(new LogBook("Revisi 2", "22/10/2022"));
        listLogbook.add(new LogBook("Revisi 3", "25/10/2022"));
        listLogbook.add(new LogBook("Revisi 4", "27/10/2022"));
        listLogbook.add(new LogBook("Revisi 5", "29/10/2022"));
        listLogbook.add(new LogBook("Revisi 6", "30/10/2022"));
        listLogbook.add(new LogBook("Revisi 7", "2/11/2022"));
        listLogbook.add(new LogBook("Revisi 8", "22/11/2022"));
        listLogbook.add(new LogBook("Revisi 9", "25/11/2022"));
        return listLogbook;
    }

}