package com.ridhamad.a10119251latihanapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {

//    Tanggal Pengerjaan : 5 - 14 Juli 2022
//    NIM : 10119251
//    Nama : Muhamad Ridwan
//    Kelas : IF6

    @GET("api/indonesia/provinsi")
    Call<List<Post>> getPost();
}
