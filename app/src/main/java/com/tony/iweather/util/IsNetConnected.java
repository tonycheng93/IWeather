package com.tony.iweather.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 2015/9/1.
 */
public class IsNetConnected {

    public static Context mContext;

    public IsNetConnected(Context context) {
        this.mContext = context;
    }

    /**
     * 检测网络是否连接
     */
    public static boolean isNetConnected(){
        ConnectivityManager  manager =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager != null){
            NetworkInfo[] infos = manager.getAllNetworkInfo();
            if (infos != null){
                for (NetworkInfo info:infos){
                    if (info.isConnected()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
