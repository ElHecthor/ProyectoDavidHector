package com.bumptech.glide.load.p013q.p014d;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.s */
public final class C1171s {

    /* renamed from: f */
    private static final File f3953f = new File("/proc/self/fd");

    /* renamed from: g */
    private static volatile C1171s f3954g;

    /* renamed from: a */
    private final boolean f3955a = m5528c();

    /* renamed from: b */
    private final int f3956b;

    /* renamed from: c */
    private final int f3957c;

    /* renamed from: d */
    private int f3958d;

    /* renamed from: e */
    private boolean f3959e = true;

    C1171s() {
        int i;
        if (VERSION.SDK_INT >= 28) {
            this.f3956b = 20000;
            i = 0;
        } else {
            this.f3956b = 700;
            i = 128;
        }
        this.f3957c = i;
    }

    /* renamed from: a */
    public static C1171s m5526a() {
        if (f3954g == null) {
            synchronized (C1171s.class) {
                if (f3954g == null) {
                    f3954g = new C1171s();
                }
            }
        }
        return f3954g;
    }

    /* renamed from: b */
    private synchronized boolean m5527b() {
        boolean z = true;
        int i = this.f3958d + 1;
        this.f3958d = i;
        if (i >= 50) {
            this.f3958d = 0;
            int length = f3953f.list().length;
            if (length >= this.f3956b) {
                z = false;
            }
            this.f3959e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(this.f3956b);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f3959e;
    }

    /* renamed from: c */
    private static boolean m5528c() {
        String str = Build.MODEL;
        boolean z = true;
        if (str != null && str.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            char c = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
                default:
                    return true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    /* renamed from: a */
    public boolean mo5050a(int i, int i2, Options options, boolean z, boolean z2) {
        boolean a = mo5051a(i, i2, z, z2);
        if (a) {
            options.inPreferredConfig = Config.HARDWARE;
            options.inMutable = false;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo5051a(int i, int i2, boolean z, boolean z2) {
        if (!z || !this.f3955a || VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        int i3 = this.f3957c;
        return i >= i3 && i2 >= i3 && m5527b();
    }
}
