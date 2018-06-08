package com.aasem.tabbedview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by inspire_info_soft on 6/7/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    ArrayList<DataChats> dataChats;

    public Adapter(Context context, ArrayList<DataChats> dataChats) {
        this.context = context;
        this.dataChats = dataChats;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvMessage, tvTime;
        ImageView ivImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvMessage = itemView.findViewById(R.id.tv_message);
            tvTime = itemView.findViewById(R.id.tv_time);
            ivImage = itemView.findViewById(R.id.iv_image);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_design_chats, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvName.setText(dataChats.get(position).getName());
        holder.tvMessage.setText(dataChats.get(position).getMessgae());
        holder.tvTime.setText(dataChats.get(position).getTime());
        holder.ivImage.setImageResource(dataChats.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataChats.size();
    }
}
