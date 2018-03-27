package com.example.minh.recycleviewhorizontal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Minh on 3/26/2018.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<SanPham> mNames, Context context) {
        this.sanPhamArrayList = mNames;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SanPham sanPham = sanPhamArrayList.get(position);
        Picasso.with(context).load(sanPham.getAnh()).placeholder(R.drawable.load)
                .error(R.drawable.error)
                .into(holder.imgOk);
        holder.name.setText(sanPham.getName());
    }

    @Override
    public int getItemCount() {
        return sanPhamArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgOk;
        public TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            imgOk=itemView.findViewById(R.id.imgOk);
        }
    }
}
