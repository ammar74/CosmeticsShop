package com.example.onlineshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlineshop.R;
import com.example.onlineshop.model.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Products> productsList;

    public ProductAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.product_row_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.product_image.setImageResource(productsList.get(position).getImageUrl());
        holder.product_name.setText(productsList.get(position).getProductName());
        holder.realPriceTV.setText(productsList.get(position).getProductPrice());
        holder.realSizeTV.setText(productsList.get(position).getProductQty());

    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView product_image,LikeIV;
        TextView product_name ,sizeTV, priceTV,realSizeTV,realPriceTV;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            product_image=itemView.findViewById(R.id.product_image);
            LikeIV=itemView.findViewById(R.id.LikeIV);
            product_name=itemView.findViewById(R.id.product_name);
            sizeTV=itemView.findViewById(R.id.sizeTV);
            realSizeTV=itemView.findViewById(R.id.realSizeTV);
            priceTV=itemView.findViewById(R.id.priceTV);
            realPriceTV=itemView.findViewById(R.id.realPriceTV);
        }
    }
}
