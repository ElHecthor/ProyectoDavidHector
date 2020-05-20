package com.google.android.gms.common.stats;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.c */
public class C2181c {
    /* renamed from: a */
    public static String m8957a(WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    static String m8958a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    static List<String> m8959a(List<String> list) {
        if (list == null || list.size() != 1) {
            return list;
        }
        if ("com.google.android.gms".equals(list.get(0))) {
            return null;
        }
        return list;
    }
}
