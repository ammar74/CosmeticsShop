package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlineshop.adapter.ProductAdapter;
import com.example.onlineshop.adapter.ProductCategoryAdapter;
import com.example.onlineshop.model.ProductCategory;
import com.example.onlineshop.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView ProductCatRecycler, ProductItemRecycler;
    ProductAdapter productAdapter;

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

        List<Products> productsList=new ArrayList<>();
        productsList.add(new Products("African Mango Blossom Shower Gel",1,
                "250 ml","$ 15.00",R.drawable.prod1));
        productsList.add(new Products("Japanesse Cherry Blossom Shower Gel",2,
                "350 ml","$ 17.00",R.drawable.prod2));
        productsList.add(new Products("African Mango Blossom Shower Gel",3,
                "350 ml","$ 17.00",R.drawable.prod1));
        productsList.add(new Products("Japanesse Cherry Blossom Shower Gel",4,
                "350 ml","$ 17.00",R.drawable.prod2));

        setProductItemRecycler(productsList);
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){
        ProductCatRecycler=findViewById(R.id.categoryRecycler);
        RecyclerView.LayoutManager layoutManager=
                new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ProductCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter =new ProductCategoryAdapter(this,productCategoryList);
        ProductCatRecycler.setAdapter(productCategoryAdapter);
    }


    private void setProductItemRecycler(List<Products> productsList){
        ProductItemRecycler=findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager=
                new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ProductItemRecycler.setLayoutManager(layoutManager);
        productAdapter =new ProductAdapter(this,productsList);
        ProductItemRecycler.setAdapter(productAdapter);
    }
}