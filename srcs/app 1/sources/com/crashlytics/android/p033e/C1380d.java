package com.crashlytics.android.p033e;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.crashlytics.android.e.d */
final class C1380d {

    /* renamed from: a */
    private final byte[] f4447a;

    /* renamed from: b */
    private volatile int f4448b = 0;

    static {
        new C1380d(new byte[0]);
    }

    private C1380d(byte[] bArr) {
        this.f4447a = bArr;
    }

    /* renamed from: a */
    public static C1380d m6377a(String str) {
        try {
            return new C1380d(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: a */
    public static C1380d m6378a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C1380d(bArr2);
    }

    /* renamed from: a */
    public InputStream mo5504a() {
        return new ByteArrayInputStream(this.f4447a);
    }

    /* renamed from: a */
    public void mo5505a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4447a, i, bArr, i2, i3);
    }

    /* renamed from: b */
    public int mo5506b() {
        return this.f4447a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1380d)) {
            return false;
        }
        C1380d dVar = (C1380d) obj;
        byte[] bArr = this.f4447a;
        int length = bArr.length;
        byte[] bArr2 = dVar.f4447a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f4448b;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f4447a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f4448b = i;
        }
        return i;
    }
}
