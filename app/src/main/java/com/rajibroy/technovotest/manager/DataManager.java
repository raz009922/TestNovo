package com.rajibroy.technovotest.manager;

import com.rajibroy.technovotest.model.ResponseObject;

public class DataManager {

    private static DataManager dataManager = new DataManager();

    private DataManager(){

    }

    public static DataManager getDataManager() {
        return dataManager;
    }

    private ResponseObject responseObject;

    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

    public ResponseObject getResponseObject() {
        return responseObject;
    }
}
