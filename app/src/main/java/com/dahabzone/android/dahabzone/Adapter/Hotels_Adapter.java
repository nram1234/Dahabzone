package com.dahabzone.android.dahabzone.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dahabzone.android.dahabzone.Datatype.Hotels_Datatype;
import com.dahabzone.android.dahabzone.Interfaces.ItemClickListener;
import com.dahabzone.android.dahabzone.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Hotels_Adapter extends RecyclerView.Adapter<Hotels_Adapter.Hotels_ViewHolder>{
    ItemClickListener clickListener;
    Context context;
    List<Hotels_Datatype> data_list;

    public Hotels_Adapter(Context context, List<Hotels_Datatype> data_list) {
        this.context = context;
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public Hotels_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hotels_item, viewGroup, false);
        return new Hotels_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Hotels_ViewHolder hotels_viewHolder, int i) {
        Hotels_Datatype data = data_list.get(i);
        hotels_viewHolder.namee.setText(data.getName());
        hotels_viewHolder.imageView.setImageResource(data.getImage());
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    public class Hotels_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.hotels_name )
        TextView namee;
        @BindView(R.id.hotels_image)
        ImageView imageView;

        public Hotels_ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onClick(view, getAdapterPosition());
        }
    }}
