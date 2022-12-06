// fq-class name com.corezoid.usercode.Usercode is mandatory
package com.corezoid.usercode;

import com.corezoid.gitcall.runner.api.UsercodeHandler;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
 import javax.mail.*;
 import javax.mail.internet.InternetAddress;

public class Usercode implements UsercodeHandler<Map<String, String>, Map<String, String>> {
//    OkHttpClient client = new OkHttpClient();
    @java.lang.Override
    public Map<String, String> handle(Map<String, String> data) throws Exception {

//        Request request = new Request.Builder()
//                .url("https://reqres.in/api/users?page=1")
//                .build();
//
//        Response response = client.newCall(request).execute();
//
//        data.put("res", response.body().string());

//         Address address = new InternetAddress("test@gmail.com");
//        data.put("address", address.toString());


        data.put("key", "val12345");

        return data;
    }
}
