package com.selflearn.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class walletAdapter extends RecyclerView.Adapter<walletAdapter.MyViewHolder> {

    private int[] ids ={
            R.drawable.con1,
            R.drawable.con2,
            R.drawable.con3,
            R.drawable.con4,
            R.drawable.con5
    };
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.imageView.setImageResource(ids[position]);
    }

    @Override
    public int getItemCount() {
        return ids.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview);
        }
    }
}
