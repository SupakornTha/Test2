package com.example.user.test2;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.user.test2.R.layout.minigreenhouse;

//public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ProductViewHolder>{
//
//    private Context mCtx;
//    private List<GreenhouseCard> items;
//
//    public CardAdapter(Activity mCtx, List<GreenhouseCard> items) {
//        this.mCtx = mCtx;
//        this.items = items;
//    }

//    @Override
//    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////        LayoutInflater inflater = LayoutInflater.from(mCtx);
////        View view = inflater.inflate(R.layout.minigreenhouse, null);
////        return new ProductViewHolder(view);
//        View v;
//        v = LayoutInflater.from(mCtx).inflate(R.layout.minigreenhouse,parent,false);
//        ProductViewHolder viewHolder = new ProductViewHolder(v);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(ProductViewHolder holder, int position) {
////        GreenhouseCard product = items.get(position);
////        holder.textViewGreenhouse.setText(product.getName());
////        holder.textViewZone.setText(product.getZone());
//
//        holder.textViewGreenhouse.setText(items.get(position).getName());
//        holder.textViewZone.setText(items.get(position).getZone());
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//
//    public static class ProductViewHolder extends RecyclerView.ViewHolder {
//
//        private TextView textViewGreenhouse, textViewZone;
//
//        public ProductViewHolder(View itemView) {
//            super(itemView);
//
//            textViewGreenhouse = itemView.findViewById(R.id.textViewGreenhouse);
//            textViewZone = itemView.findViewById(R.id.textViewZone);
//        }
//    }
//}
