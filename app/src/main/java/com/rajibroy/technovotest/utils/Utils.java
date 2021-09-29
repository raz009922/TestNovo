package com.rajibroy.technovotest.utils;

import android.util.Pair;

import com.rajibroy.technovotest.repository.Api;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static String urlMaker(String product,String fileUuid){
        String res = Api.BASE_URL + "/delivery/product/" + product + "/file/" + fileUuid;
        return res;
    }

    public static Map<String, String> getTokensMap() {
        Map<String, String> alltokens = new HashMap<>();
        //alltokens.put(pair.first, pair.second);
        alltokens.put("ProviderSession", "527844b3-f8db-4f12-afcd-e83ddec332c6");
        alltokens.put("Content-Type", "application/json;charset=UTF-8");
        return alltokens;
    }
}
