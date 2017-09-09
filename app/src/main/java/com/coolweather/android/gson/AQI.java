package com.coolweather.android.gson;

/**
 * Created by wangcong on 2017/9/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
