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
 * Use the {@link BimbinganFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BimbinganFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<Bimbingan> bimbinganArrayList;
    private String[] bimbingan_nama, bimbingan_nim;
    private int[] bimbingan_avaID;
    private RecyclerView recyclerview;


    public BimbinganFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BimbinganFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BimbinganFragment newInstance(String param1, String param2) {
        BimbinganFragment fragment = new BimbinganFragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bimbingan, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialized();
        recyclerview = view.findViewById(R.id.recview_bimbingan);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        BimbinganAdapter myAdapter = new BimbinganAdapter(getContext(), bimbinganArrayList);
        recyclerview.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialized(){
        bimbinganArrayList = new ArrayList<>();
        bimbingan_nama = new String[]{
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
        bimbingan_nim = new String[]{
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
        bimbingan_avaID = new int[]{
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

        for(int i = 0; i<bimbingan_nim.length;i++){
            Bimbingan bimbingan = new Bimbingan(bimbingan_nama[i], bimbingan_nim[i], bimbingan_avaID[i]);
            bimbinganArrayList.add(bimbingan);
        }


    }
}