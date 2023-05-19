package com.example.pr4_gurdzhi;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
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

import java.util.ArrayList;

    public class BlankFragment3 extends Fragment {
        private Context context;
        private final int duration = Toast.LENGTH_SHORT;

        private static final String TAG = "BlankFragment3";
        public BlankFragment3() {
            super(R.layout.fragment_blank3);
        }



        @Nullable
        @Override

            public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                return inflater.inflate(R.layout.fragment_blank3, container, false);
            }


                ArrayList<BookInfo> books = new ArrayList<BookInfo>();
                ListView countriesList;
                //@Override
                public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
                    super.onViewCreated(view, savedInstanceState);
                    //view.setContentView(R.layout.fragment_blank3);
                    setInitialData();


                    countriesList = view.findViewById(R.id.bookList1);

                    BookAdapter bookAdapter = new BookAdapter(getContext(), R.layout.list_item, books);

                    countriesList.setAdapter(bookAdapter);

                }
                private void setInitialData(){

                    books.add(new BookInfo ("Отель1", R.drawable.book_svgrepo_com));
                    books.add(new BookInfo ("Отель2", R.drawable.book_svgrepo_com));
                    books.add(new BookInfo ("Отель3", R.drawable.book_svgrepo_com));
                    books.add(new BookInfo ("Отель4", R.drawable.book_svgrepo_com));
                    books.add(new BookInfo ("Отель5", R.drawable.book_svgrepo_com));
                }




            }