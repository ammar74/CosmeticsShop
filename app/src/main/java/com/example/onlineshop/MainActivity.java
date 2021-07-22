package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlineshop.adapter.ProductAdapter;
import com.example.onlineshop.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductAdapter productAdapter;
    RecyclerView ProductCatRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ProductCategory> productCategoryList=new ArrayList<>();
        productCategoryList.add(new ProductCategory("1","Popular"));
        productCategoryList.add(new ProductCategory("2","Body Products"));
        productCategoryList.add(new ProductCategory("3","Skin Care"));
        productCategoryList.add(new ProductCategory("4","Hair"));

        setProductRecycler(productCategoryList);
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){
        ProductCatRecycler=findViewById(R.id.categoryRecycler);
        RecyclerView.LayoutManager layoutManager=
                new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ProductCatRecycler.setLayoutManager(layoutManager);
        productAdapter=new ProductAdapter(this,productCategoryList);
        ProductCatRecycler.setAdapter(productAdapter);
    }
}