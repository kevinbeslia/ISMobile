package com.example.ismobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class LogBookAdapter extends RecyclerView.Adapter<LogBookAdapter.MyViewHolder>{

    Context context;
    ArrayList<LogBook> logBookArrayList;
    public LogBookAdapter(Context context, ArrayList<LogBook> logBookArrayList){
        this.context = context;
        this.logBookArrayList = logBookArrayList;

    }

    public LogBookAdapter(ArrayList<LogBook> logBooks) {
    }

    @NonNull
    @Override
    public LogBookAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_logbook,parent,false);

        return new LogBookAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LogBookAdapter.MyViewHolder holder, int position) {

        LogBook logBook = logBookArrayList.get(position);
        holder.logbook_tgl.setText(logBook.tanggal);
        holder.logbook_ket.setText(logBook.ketLogbook);

    }

    @Override
    public int getItemCount() {
        return logBookArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView logbook_tgl;
        TextView logbook_ket;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            logbook_tgl = itemView.findViewById(R.id.logbook_tgl);
            logbook_ket = itemView.findViewById(R.id.logbook_ket);
        }
    }
}
