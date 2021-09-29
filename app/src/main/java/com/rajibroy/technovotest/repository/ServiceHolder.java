package com.rajibroy.technovotest.repository;

import androidx.annotation.Nullable;

public class ServiceHolder {
    Api myService = null;

    @Nullable
    public Api get() {
        return myService;
    }

    public void set(Api myService) {
        this.myService = myService;
    }

}
