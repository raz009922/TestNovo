package com.rajibroy.technovotest.model;

public class Response {
    static public final int UPDATED = 202;
    static public final int SUCCESS = 200;

    int code;

    public Response(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
