package com.example.pr4_gurdzhi.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.pr4_gurdzhi.Model.BookInfo;
import com.example.pr4_gurdzhi.Repositories.BookRepos;

import java.util.List;

public class BookViewModel extends ViewModel {
    public LiveData<List<BookInfo>> books;

    public void init(){
        BookRepos repositBooks = new BookRepos();
        books = repositBooks.generateData();
    }

    public BookViewModel(){
        init();
    }
}