package com.example.intex.gsonproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import jso;
import jsonResponce.Okhttp;
import com.google.gson.Gson;



public class MainActivity extends AppCompatActivity {
    String jsonData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String tag= "tag";
        jsonData = "{\"status\":200,\"status_message\":\"we have all data\",\"data\":[[\"title: Cras eget nisi dictum augue malesuada malesuada. Integer id\",\"info: fringilla mi lacinia mattis. Integer eu lacus. Quisque imperdiet, erat nonummy ultricies ornare, elit elit fermentum risus, at fringilla purus mauris a nunc. In at pede. Cras vulputate velit\"],[\"title: mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a\",\"info: velit. Cras lorem lorem, luctus ut, pellentesque eget, dictum placerat, augue. Sed molestie. Sed id risus quis\"],[\"title: Etiam laoreet, libero et tristique pellentesque, tellus sem mollis\",\"info: Nam ac nulla. In tincidunt congue turpis. In condimentum. Donec at arcu. Vestibulum ante ipsum primis\"],[\"title:Title nec tellus. Nunc lectus pede, ultrices a, auctor non, feugiatfour\",\"info: Ben\"],[\"title: felis ullamcorper viverra. Maecenas\",\"info: enim. Suspendisse aliquet, sem ut cursus luctus, ipsum leo elementum sem, vitae aliquam eros turpisBen\"],[\"title: quis massa. Mauris vestibulum, neque sed\",\"info: sapien imperdiet ornare. In faucibus. Morbi vehicula. Pellentesque tincidunt tempus risus. Donec egestas. Duis ac arcu. Nunc mauris. Morbi non sapien molestie orci tincidunt adipiscingBen\"]]}";
        Log.i(tag,jsonData);

        Gson gson = new Gson();






    }
}
