package com.example.pr4_gurdzhi.BookDataSource.;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.pr4_gurdzhi.Model.BookInfo;
import com.example.pr4_gurdzhi.R;

import java.util.ArrayList;
import java.util.List;

public class BookDataSource {



    public static LiveData<List<BookInfo>> setInitialData(){
        MutableLiveData<List<BookInfo>> result = new MutableLiveData<>();
        ArrayList<BookInfo> books = new ArrayList<>();
        for(int i=1; i<=200;i++){
            books.add(new BookInfo(String.valueOf(i), R.drawable.book_svgrepo_com));
        }
        result.setValue(books);
        return result;
    }
}