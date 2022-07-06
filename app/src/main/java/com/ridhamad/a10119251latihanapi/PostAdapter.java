package com.ridhamad.a10119251latihanapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

//    Tanggal Pengerjaan : 5 - 14 Juli 2022
//    NIM : 10119251
//    Nama : Muhamad Ridwan
//    Kelas : IF6

    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post post = postList.get(position);
        holder.provinsi.setText("Nama Provinsi = " + post.getProvinsi());
        holder.kasus.setText("Jumlah Kasus = " + post.getKasus());
        holder.dirawat.setText("Jumlah Pasien Dirawat = " + post.getDirawat());
        holder.sembuh.setText("Jumlah Pasien Sembuh = " + post.getSembuh());
        holder.meninggal.setText("Jumlah Pasien Meninggal = " + post.getMeninggal());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
    TextView provinsi, kasus, dirawat, sembuh, meninggal;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            provinsi = itemView.findViewById(R.id.provinsi);
            kasus = itemView.findViewById(R.id.kasus);
            dirawat = itemView.findViewById(R.id.dirawat);
            sembuh = itemView.findViewById(R.id.sembuh);
            meninggal = itemView.findViewById(R.id.meninggal);
        }
    }
}
