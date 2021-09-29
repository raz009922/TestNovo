package com.rajibroy.technovotest.home;


import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rajibroy.technovotest.R;
import com.rajibroy.technovotest.databinding.ActivityMainBinding;
import com.rajibroy.technovotest.manager.ActivityManager;
import com.rajibroy.technovotest.manager.DataManager;
import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.viewmodel.MainViewModel;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        initView();
        getFunction();
    }


    private ListAdapter adapter;

    private void initView() {
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.VERTICAL, false));
        adapter = new ListAdapter(this);
        adapter.setClickListener(new ListAdapter.ClickListener() {
            @Override
            public void onClick(ResponseObject responseObject) {
                DataManager.getDataManager().setResponseObject(responseObject);
                ActivityManager.gotoDetailsActivity(MainActivity.this);
            }
        });
        binding.recyclerview.setAdapter(adapter);


    }

    void getFunction() {
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getMutableLiveData().observe(this, new Observer<List<ResponseObject>>() {
            @Override
            public void onChanged(List<ResponseObject> responseObjects) {
                ArrayList<ResponseObject> responseObjects1 = new ArrayList<>(responseObjects);
                adapter.setArrayList(responseObjects1);
                Log.d("TAG", "onChanged: " + responseObjects1.size());

            }
        });
        viewModel.getValue();
    }


}