package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.r */
public class C1170r extends C1143f {

    /* renamed from: b */
    private static final byte[] f3952b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C0869g.f3390a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo5028a(C0921e eVar, Bitmap bitmap, int i, int i2) {
        return C1125b0.m5389d(eVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        messageDigest.update(f3952b);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1170r;
    }

    public int hashCode() {
        return 1572326941;
    }
}
