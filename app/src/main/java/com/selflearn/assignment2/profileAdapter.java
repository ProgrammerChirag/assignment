package com.selflearn.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class profileAdapter extends RecyclerView.Adapter<profileAdapter.MyViewHolder> {

    private String[] names={
            "Instagram Clone",
            "Payment Integration",
            "Vs code java project",
            "python calculator",
            "java assignment management system"
    };
    @NonNull
    @Override
    public profileAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycle1, parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull profileAdapter.MyViewHolder holder, int position) {
        holder.title.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title ;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            title=itemView.findViewById(R.id.title);

        }
    }
}
