package com.example.hadu3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SujuAdapter extends RecyclerView.Adapter<SujuAdapter.ViewHolder> {
    private Context context;
    private ArrayList<SujuModel> sujuList;

    public SujuAdapter(Context context) {
        this.context = context;
    }


    public ArrayList<SujuModel> getSujuList() {
        return sujuList;
    }

    public void setSujuModels(ArrayList<SujuModel> sujuModels) {
        this.sujuList = sujuModels;
    }

    @NonNull
    @Override
    public SujuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_list,viewGroup,false);
        return new ViewHolder(itemRow);

    }

    @Override
    public void onBindViewHolder(@NonNull SujuAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getSujuList().get(i).getLambang()).into
                (viewHolder.ivLambangTeam);
        viewHolder.tvNamateam.setText(getSujuList().get(i).getNama()); }


    @Override
    public int getItemCount() {
        return getSujuList().size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangTeam; private TextView tvNamateam;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivLambangTeam = itemView.findViewById(R.id.LogoMember);
            tvNamateam = itemView.findViewById(R.id.NamaMember);
        }
    }
}
