package com.aasem.tabbedview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentOne extends Fragment {

    ArrayList<DataChats> dataChats;
    Adapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        dataChats = new ArrayList<>();
        recyclerView = view.findViewById(R.id.rv);
        linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter(getActivity(), dataChats);
        recyclerView.setAdapter(adapter);
        getData();
        return view;
    }

    private void getData() {
        dataChats.add(new DataChats("Aasem", "Hello, where are you ?", "9.10AM", R.drawable.ic_launcher_background));
        dataChats.add(new DataChats("Aasem", "Hello, where are you ?", "9.10AM", R.drawable.ic_launcher_background));
        dataChats.add(new DataChats("Aasem", "Hello, where are you ?", "9.10AM", R.drawable.ic_launcher_background));
    }
}
