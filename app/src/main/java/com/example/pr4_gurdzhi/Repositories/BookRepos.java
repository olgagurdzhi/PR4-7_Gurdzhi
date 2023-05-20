package com.example.pr4_gurdzhi.Repositories;

import androidx.lifecycle.LiveData;

import com.example.pr4_gurdzhi.BookDataSource.BookDataSource;
import com.example.pr4_gurdzhi.Model.BookInfo;

import java.util.ArrayList;
import java.util.List;

public class BookRepos {
    public LiveData<List<BookInfo>> generateData(){
        return BookDataSource.setInitialData();
    }
}