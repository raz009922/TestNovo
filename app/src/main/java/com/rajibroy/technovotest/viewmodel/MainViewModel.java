package com.rajibroy.technovotest.viewmodel;

import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.repository.Repository;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<ResponseObject>> mutableLiveData = new MutableLiveData();

    public void getValue(){
        Repository.getInstance().getValue(mutableLiveData);
    }

    public MutableLiveData<List<ResponseObject>> getMutableLiveData() {
        return mutableLiveData;
    }
}
