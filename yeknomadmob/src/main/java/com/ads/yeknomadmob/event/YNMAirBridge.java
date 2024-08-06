package com.ads.yeknomadmob.event;

import android.app.Application;
import android.content.Context;

import com.ads.yeknomadmob.utils.TypeAds;
import com.google.android.gms.ads.AdValue;

public class YNMAirBridge {
    private static final String TAG = "YNMAirBridge";
    private Context context;
    private static YNMAirBridge tnmAirBridge;
    public static boolean enableAirBridge = false;

    public YNMAirBridge() {
    }

    public static YNMAirBridge getInstance(){
        if (tnmAirBridge ==null)
            tnmAirBridge = new YNMAirBridge();
        return tnmAirBridge;
    }

    public void init(Application context, String appName, String tokenApp) {
        init(context, appName, tokenApp, false);
    }

    public void init(Application context, String appName, String tokenApp, boolean enableDebugLog) {
        this.context = context;
    }

    public static void onTrackEvent(String eventName) {}

    public static void logAdClicked() {
    }

    public static void logPaidAdImpressionValue(Context context, AdValue adValue, String adUnitId, String mediationAdapterClassName, TypeAds adType) {
        //abridge here
    }

    public static void logCustomEvent(String eventName) {
    }
}
