package com.example.krishnaji_searching_app.data.remote.apis;

import android.content.Context;
import android.util.Log;

import com.example.krishnaji_searching_app.contract.DetailsActivityContract;

//Created by krishnaji

public class DetailActivityModel implements DetailsActivityContract.ModelCallback {
    private Context context;
    private DetailsActivityContract.PresenterCallback presenterCallback;

    public DetailActivityModel(Context context, DetailsActivityContract.PresenterCallback presenterCallback) {
        this.context = context;
        this.presenterCallback = presenterCallback;
    }


    @Override
    public void validateComment(String toString) {
       if (toString.isEmpty()){
           presenterCallback.errorTextField();
       }else {

       }
    }
}
