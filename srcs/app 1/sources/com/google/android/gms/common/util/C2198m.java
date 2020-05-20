package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.util.m */
public class C2198m {

    /* renamed from: a */
    private static String f6172a;

    /* renamed from: b */
    private static int f6173b;

    /* renamed from: a */
    private static BufferedReader m9009a(String str) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m9010a() {
        if (f6172a == null) {
            if (f6173b == 0) {
                f6173b = Process.myPid();
            }
            f6172a = m9011a(f6173b);
        }
        return f6172a;
    }

    @Nullable
    /* renamed from: a */
    private static String m9011a(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m9009a(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                C2196k.m8997a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            C2196k.m8997a(bufferedReader);
            throw th;
        }
        C2196k.m8997a(bufferedReader);
        return str;
    }
}
