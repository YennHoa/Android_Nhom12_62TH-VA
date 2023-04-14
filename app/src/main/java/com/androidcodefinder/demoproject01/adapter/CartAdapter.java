package com.androidcodefinder.demoproject01.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidcodefinder.demoproject01.R;
import com.androidcodefinder.demoproject01.model.AllCategoryModel;
import com.androidcodefinder.demoproject01.model.CartModel;
import com.androidcodefinder.demoproject01.model.CartModel;

import java.util.List;


public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ItemCartViewHolder> {
    Context context;
    String Total, Price, Quantity;
    List<CartModel> categoryList;

    public CartAdapter(Context context, List<CartModel> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public ItemCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_cart, parent, false);

        return new ItemCartViewHolder(view);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<CartModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CartModel> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCartViewHolder holder, int position) {

        CartModel item = categoryList.get(position);
        holder.imItemCartImage.setImageResource(item.getImage());
        holder.tvItemCartName.setText(item.getName());
        holder.tvItemCartPrice.setText(item.getPrice() +"");
        holder.tvItemCartQuantity.setText(item.getQuantity() + "");
        holder.tvListCartTax.setText(item.getTax() + "");
        holder.tvListCartTotal.setText(item.getTotal() + "");
        holder.imItemCartPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setQuantity(item.getQuantity() + 1);

            }

        });
        holder.imItemCartMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item.getQuantity()>0){
                    item.setQuantity(item.getQuantity() - 1);
                }
            }
        });
        holder.imItemCartDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Price = (item.getPrice() +"");
        Quantity = (item.getQuantity() +"");
        holder.tvItemCartQuantity.setText(item.getQuantity() + "");
        holder.tvItemCartPrice.setText(item.getPrice() +"");
        holder.tvListCartTax.setText(item.getTax() +"");
        Total = String.valueOf(Double.parseDouble(Price) * Integer.parseInt(Quantity));
        holder.tvListCartTotal.setText(item.getTotal() + "");

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public  static class ItemCartViewHolder extends RecyclerView.ViewHolder{

        ImageView imItemCartImage;
        ImageView imItemCartPlus;
        ImageView imItemCartMinus;
        ImageView imItemCartDelete;
        TextView tvItemCartName, tvItemCartPrice, tvItemCartQuantity, tvListCartTax, tvListCartTotal;
        public ItemCartViewHolder(@NonNull View itemView) {
            super(itemView);

            imItemCartImage = itemView.findViewById(R.id.imItemCartImage);
            imItemCartPlus = itemView.findViewById(R.id.imItemCartPlus);
            imItemCartMinus = itemView.findViewById(R.id.imItemCartMinus);
            imItemCartDelete = itemView.findViewById(R.id.imItemCartDelete);
            tvItemCartName = itemView.findViewById(R.id.tvItemCartName);
            tvItemCartPrice = itemView.findViewById(R.id.tvItemCartPrice);
            tvItemCartQuantity = itemView.findViewById(R.id.tvItemCartQuantity);
            tvListCartTax = itemView.findViewById(R.id.tvListCartTax);
            tvListCartTotal = itemView.findViewById(R.id.tvListCartTotal);



        }
    }

}






