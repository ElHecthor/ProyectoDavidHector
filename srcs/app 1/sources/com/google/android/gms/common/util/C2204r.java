package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.r */
public final class C2204r {

    /* renamed from: a */
    private static final IntentFilter f6182a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f6183b;

    /* renamed from: c */
    private static float f6184c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m9029a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f6182a);
        int i = 0;
        int intExtra = registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0);
        int i2 = 3;
        if (C2197l.m9001d()) {
            i2 = 7;
        }
        int i3 = (intExtra & i2) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C2197l.m9004g() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 2;
        }
        return i | i3;
    }

    /* renamed from: b */
    public static synchronized float m9030b(Context context) {
        synchronized (C2204r.class) {
            if (SystemClock.elapsedRealtime() - f6183b >= 60000 || Float.isNaN(f6184c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f6182a);
                if (registerReceiver != null) {
                    f6184c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f6183b = SystemClock.elapsedRealtime();
                float f = f6184c;
                return f;
            }
            float f2 = f6184c;
            return f2;
        }
    }
}
