package com.crashlytics.android.p033e;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: com.crashlytics.android.e.t0 */
class C1480t0 implements C1378a {
    C1480t0() {
    }

    /* renamed from: a */
    private static String m6704a(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = C4813i.m19357a((InputStream) bufferedInputStream2);
                C4813i.m19365a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C4813i.m19365a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19365a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo5499a(File file) {
        return m6704a(file.getPath());
    }
}
