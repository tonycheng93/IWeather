package com.tony.iweather.util;

/**
 * Created by Administrator on 2015/8/31.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
