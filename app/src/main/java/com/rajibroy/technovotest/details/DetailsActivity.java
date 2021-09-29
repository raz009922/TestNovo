package com.rajibroy.technovotest.details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rajibroy.technovotest.R;
import com.rajibroy.technovotest.databinding.ActivityDetailsBinding;
import com.rajibroy.technovotest.manager.DataManager;
import com.rajibroy.technovotest.model.Response;
import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.utils.DialogUtils;
import com.rajibroy.technovotest.viewmodel.DetailsViewModel;
import com.rajibroy.technovotest.viewmodel.MainViewModel;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setSupportActionBar(binding.toolbar);
        //setContentView(R.layout.activity_details);

        initViewModel();

        setData(DataManager.getDataManager().getResponseObject());
    }

    private DetailsViewModel viewModel;

    private void initViewModel() {
        viewModel = new ViewModelProvider(this).get(DetailsViewModel.class);
        viewModel.getMutableLiveData().observe(this, new Observer<ResponseObject>() {
            @Override
            public void onChanged(ResponseObject responseObject) {
                setData(responseObject);
                DataManager.getDataManager().setResponseObject(responseObject);
            }
        });
        viewModel.getResponseMutableLiveData().observe(this, new Observer<Response>() {
            @Override
            public void onChanged(Response response) {
                if(response.getCode() == Response.UPDATED) {
                    viewModel.getData(DataManager.getDataManager().getResponseObject().getProductUuid());
                }
            }
        });
        viewModel.getData(DataManager.getDataManager().getResponseObject().getProductUuid());
    }

    private void setData(ResponseObject responseObject) {
        Log.d("TAG", "text: " + binding.textName.getText().toString());
        Log.d("TAG", "files: " + responseObject.getFiles());
        binding.textName.setText(responseObject.getShortName());
        binding.textDetails.setText(responseObject.getDescription());
        binding.textPrintOrder.setText(responseObject.getProperties().getPrintOrder());
        FileAdapter adapter = new FileAdapter(this);
        adapter.setResponseObject(responseObject);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        binding.recyclerview.setAdapter(adapter);
        binding.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialogEditPrintOrder(responseObject);
            }
        });

    }

    private void callDialogEditPrintOrder(ResponseObject responseObject) {
        DialogUtils.showEditTextDialog(this, "Edit Print Order", R.layout.layout_print_order_edit,
                "YES", "NO", responseObject.getProperties().getPrintOrder(), new DialogUtils.EditCallbacks() {
                    @Override
                    public void negetive() {

                    }

                    @Override
                    public void positive(String value) {
                        responseObject.getProperties().setPrintOrder(value);
                        viewModel.setPrintOrder(responseObject.getProductUuid(), responseObject);
                    }
                });
    }
}