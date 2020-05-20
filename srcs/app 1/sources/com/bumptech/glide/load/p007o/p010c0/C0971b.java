package com.bumptech.glide.load.p007o.p010c0;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.o.c0.b */
final class C0971b {

    /* renamed from: com.bumptech.glide.load.o.c0.b$a */
    class C0972a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f3556a;

        C0972a(Pattern pattern) {
            this.f3556a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f3556a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m4883a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return VERSION.SDK_INT < 17 ? Math.max(m4884b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m4884b() {
        File[] fileArr;
        String str = "GlideRuntimeCompat";
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C0972a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
