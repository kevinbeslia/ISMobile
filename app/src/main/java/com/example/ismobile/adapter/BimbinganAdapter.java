package com.example.ismobile.adapter;
import com.example.ismobile.R;
import com.example.ismobile.models.Bimbingan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class BimbinganAdapter extends RecyclerView.Adapter<BimbinganAdapter.MyViewHolder> {

    Context context;
    ArrayList<Bimbingan> bimbinganArrayList;
    public BimbinganAdapter(Context context, ArrayList<Bimbingan> bimbinganArrayList){
        this.context = context;
        this.bimbinganArrayList = bimbinganArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_bimbingan,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Bimbingan bimbingan = bimbinganArrayList.get(position);
        holder.bimbingan_nama.setText(bimbingan.nama);
        holder.bimbingan_nim.setText(bimbingan.nim);
        holder.bimbingan_ava.setImageResource(bimbingan.ava);
    }

    @Override
    public int getItemCount() {
        return bimbinganArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView bimbingan_ava;
        TextView bimbingan_nama;
        TextView bimbingan_nim;



        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            bimbingan_ava = itemView.findViewById(R.id.bimbingan_ava);
            bimbingan_nama = itemView.findViewById(R.id.bimbingan_nama);
            bimbingan_nim = itemView.findViewById(R.id.bimbingan_nim);
        }
    }
}
