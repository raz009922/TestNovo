package com.rajibroy.technovotest.repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpClientInstance {

    public static class Builder {
        private HashMap<String, String> headers = new HashMap<>();
        private ServiceHolder myServiceHolder;

        public Builder(ServiceHolder myServiceHolder) {
            this.myServiceHolder = myServiceHolder;
        }

        public Builder addHeader(String key, String value) {
            headers.put(key, value);
            return this;
        }

        public OkHttpClient build() {

            OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                    .addInterceptor(
                            new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    // Add default headers
                                    Request.Builder requestBuilder = chain.request().newBuilder()
                                            .addHeader("accept", "*/*")
                                            .addHeader("accept-encoding:gzip", "gzip, deflate")
                                            .addHeader("accept-language", "en-US,en;q=0.9");

                                    // Add additional headers
                                    Iterator it = headers.entrySet().iterator();

                                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                                        if (entry.getKey() != null && entry.getValue() != null) {
                                            requestBuilder.addHeader(entry.getKey(), entry.getValue());
                                        }
                                    }

                                    //requestBuilder.addHeader(Utils.getAccessToken().first, Utils.getAccessToken().second);
                                    //requestBuilder.addHeader(Utils.getApplicationType().first, Utils.getApplicationType().second);



                                    return chain.proceed(requestBuilder.build());
                                }
                            }
                    )
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS);



            return okHttpClientBuilder.build();
        }
    }

}
