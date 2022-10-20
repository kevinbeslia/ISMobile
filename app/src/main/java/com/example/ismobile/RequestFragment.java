package com.example.ismobile;
import com.example.ismobile.adapter.*;
import com.example.ismobile.models.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RequestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RequestFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<Request> requestArrayList;
    private String[] request_nama, request_nim, request_skripsi;
    private int[] request_avaID;
    private RecyclerView recyclerview;

    public RequestFragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RequestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RequestFragment newInstance(String param1, String param2) {
        RequestFragment fragment = new RequestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_request, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialized();
        recyclerview = view.findViewById(R.id.recview_jadwaldosen);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        RequestAdapter myAdapter = new RequestAdapter(getContext(), requestArrayList);
        recyclerview.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialized(){
        requestArrayList = new ArrayList<>();
        request_nama = new String[]{
                getString(R.string.bimbingan_nama_1),
                getString(R.string.bimbingan_nama_2),
                getString(R.string.bimbingan_nama_3),
                getString(R.string.bimbingan_nama_4),
                getString(R.string.bimbingan_nama_5),
                getString(R.string.bimbingan_nama_6),
                getString(R.string.bimbingan_nama_7),
                getString(R.string.bimbingan_nama_8),
                getString(R.string.bimbingan_nama_9),
                getString(R.string.bimbingan_nama_10),
        };
        request_nim = new String[]{
                getString(R.string.bimbingan_nim_1),
                getString(R.string.bimbingan_nim_2),
                getString(R.string.bimbingan_nim_3),
                getString(R.string.bimbingan_nim_4),
                getString(R.string.bimbingan_nim_5),
                getString(R.string.bimbingan_nim_6),
                getString(R.string.bimbingan_nim_7),
                getString(R.string.bimbingan_nim_8),
                getString(R.string.bimbingan_nim_9),
                getString(R.string.bimbingan_nim_10),
        };
        request_skripsi = new String[]{
                getString(R.string.skripsi1),
                getString(R.string.skripsi2),
                getString(R.string.skripsi3),
                getString(R.string.skripsi4),
                getString(R.string.skripsi5),
                getString(R.string.skripsi6),
                getString(R.string.skripsi7),
                getString(R.string.skripsi8),
                getString(R.string.skripsi9),
                getString(R.string.skripsi10),
        };
        request_avaID = new int[]{
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
                R.drawable.ic_profile,
        };

        for(int i = 0; i<request_nim.length;i++){
            Request request = new Request(request_nama[i], request_nim[i], request_skripsi[i], request_avaID[i]);
            requestArrayList.add(request);
        }


    }
}