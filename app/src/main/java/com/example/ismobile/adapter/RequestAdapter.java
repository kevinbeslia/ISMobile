package com.example.ismobile.adapter;
import com.example.ismobile.models.Request;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ismobile.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.MyViewHolder>{

    Context context;
    ArrayList<Request> requestArrayList;
    public RequestAdapter(Context context, ArrayList<Request> requestArrayList){
        this.context = context;
        this.requestArrayList = requestArrayList;

    }

    @NonNull
    @Override
    public RequestAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_request,parent,false);

        return new RequestAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestAdapter.MyViewHolder holder, int position) {

        Request request = requestArrayList.get(position);
        holder.request_nama.setText(request.nama);
        holder.request_nim.setText(request.nim);
        holder.request_skripsi.setText(request.skripsi);
        holder.request_ava.setImageResource(request.ava);
    }

    @Override
    public int getItemCount() {
        return requestArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView request_ava;
        TextView request_nama;
        TextView request_nim;
        TextView request_skripsi;



        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            request_ava = itemView.findViewById(R.id.request_ava);
            request_nama = itemView.findViewById(R.id.jadwaldosen_nama);
            request_nim = itemView.findViewById(R.id.jadwaldosen_nim);
            request_skripsi = itemView.findViewById(R.id.jadwaldosen_skripsi);
        }
    }
}
