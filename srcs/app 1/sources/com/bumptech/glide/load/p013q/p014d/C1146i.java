package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.i */
public class C1146i extends C1143f {

    /* renamed from: b */
    private static final byte[] f3918b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C0869g.f3390a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo5028a(C0921e eVar, Bitmap bitmap, int i, int i2) {
        return C1125b0.m5377a(eVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        messageDigest.update(f3918b);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1146i;
    }

    public int hashCode() {
        return -599754482;
    }
}
