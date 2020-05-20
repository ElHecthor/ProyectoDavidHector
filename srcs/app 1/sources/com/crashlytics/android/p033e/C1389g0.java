package com.crashlytics.android.p033e;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: com.crashlytics.android.e.g0 */
final class C1389g0 {
    /* renamed from: a */
    private static File m6440a(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m6441a(Context context, String str) {
        return new C1377c(context, new C1480t0()).mo5498a(str);
    }

    /* renamed from: a */
    static byte[] m6442a(File file) {
        File a = m6440a(file, ".device_info");
        if (a == null) {
            return null;
        }
        return m6449d(a);
    }

    /* renamed from: a */
    private static byte[] m6443a(File file, Context context) {
        byte[] d = m6449d(file);
        if (d == null || d.length == 0) {
            return null;
        }
        return m6441a(context, new String(d));
    }

    /* renamed from: a */
    private static byte[] m6444a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    static byte[] m6445b(File file) {
        File a = m6440a(file, ".dmp");
        return a == null ? new byte[0] : m6447c(a);
    }

    /* renamed from: b */
    static byte[] m6446b(File file, Context context) {
        File a = m6440a(file, ".maps");
        if (a != null) {
            return m6448c(a, context);
        }
        File a2 = m6440a(file, ".binary_libs");
        if (a2 != null) {
            return m6443a(a2, context);
        }
        return null;
    }

    /* renamed from: c */
    private static byte[] m6447c(File file) {
        return m6449d(file);
    }

    /* renamed from: c */
    private static byte[] m6448c(File file, Context context) {
        BufferedReader bufferedReader = null;
        if (!file.exists()) {
            return null;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new C1377c(context, new C1480t0()).mo5497a(bufferedReader2);
                C4813i.m19365a((Closeable) bufferedReader2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C4813i.m19365a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19365a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: d */
    static byte[] m6449d(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = m6444a((InputStream) fileInputStream);
                C4813i.m19365a((Closeable) fileInputStream);
                return a;
            } catch (FileNotFoundException unused) {
                C4813i.m19365a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                C4813i.m19365a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C4813i.m19365a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            C4813i.m19365a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            C4813i.m19365a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19365a((Closeable) fileInputStream2);
            throw th;
        }
    }
}
