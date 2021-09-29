package com.rajibroy.technovotest.viewmodel;

import com.rajibroy.technovotest.model.Response;
import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.repository.Repository;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {

    private MutableLiveData<ResponseObject> mutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Response> responseMutableLiveData = new MutableLiveData<>();

    public void getData(String value){
        Repository.getInstance().getOneObject(value, mutableLiveData);
    }

    public MutableLiveData<ResponseObject> getMutableLiveData() {
        return mutableLiveData;
    }

    public void setPrintOrder(String value, ResponseObject responseObject) {
        Repository.getInstance().setOneObject(value, responseObject, responseMutableLiveData);
    }

    public MutableLiveData<Response> getResponseMutableLiveData() {
        return responseMutableLiveData;
    }
}
