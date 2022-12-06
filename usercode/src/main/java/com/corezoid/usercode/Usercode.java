// fq-class name com.corezoid.usercode.Usercode is mandatory
package com.corezoid.usercode;

import com.corezoid.gitcall.runner.api.UsercodeHandler;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Usercode implements UsercodeHandler<Map<String, String>, Map<String, String>> {

    @java.lang.Override
    public Map<String, String> handle(Map<String, String> data) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://www.liqpay.ua/api/ping")
                .build();

        Response response = client.newCall(request).execute();

        data.put("res", response.body().string());

        return data;
    }
}
