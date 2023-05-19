package com.example.pr4_gurdzhi;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class BlankFragment4 extends Fragment {
    private Context context;
    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "BlankFragment4";
    public BlankFragment4() {
        super(R.layout.fragment_blank4);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank4, container, false);
    }

    ArrayList<BookInfo> books = new ArrayList<BookInfo>();

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setInitialData();
        setInitialData();
        RecyclerView recyclerView = view.findViewById(R.id.list);
        BookRecycleAdapter adapter = new BookRecycleAdapter(getContext(), books);
        recyclerView.setAdapter(adapter);
    }


    private void setInitialData(){

        books.add(new BookInfo ("Отель1", R.drawable.book_svgrepo_com));
        books.add(new BookInfo ("Отель2", R.drawable.book_svgrepo_com));
        books.add(new BookInfo ("Отель3", R.drawable.book_svgrepo_com));
        books.add(new BookInfo ("Отель4", R.drawable.book_svgrepo_com));
        books.add(new BookInfo ("Отель5", R.drawable.book_svgrepo_com));
    }

    }