package com.androidcodefinder.demoproject01;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.androidcodefinder.demoproject01.adapter.CartAdapter;
import com.androidcodefinder.demoproject01.model.CartModel;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    private RecyclerView rcvCart;
    private List<CartModel> mListCart;
    private CartAdapter CartAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cart_new);
        rcvCart = findViewById(R.id.rcv_cart);
        mListCart = new ArrayList<>();
    }
}
