package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.z */
public final class C1181z extends C1143f {

    /* renamed from: c */
    private static final byte[] f3978c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C0869g.f3390a);

    /* renamed from: b */
    private final int f3979b;

    public C1181z(int i) {
        C1309j.m6153a(i > 0, "roundingRadius must be greater than 0.");
        this.f3979b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo5028a(C0921e eVar, Bitmap bitmap, int i, int i2) {
        return C1125b0.m5385b(eVar, bitmap, this.f3979b);
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        messageDigest.update(f3978c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3979b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1181z)) {
            return false;
        }
        return this.f3979b == ((C1181z) obj).f3979b;
    }

    public int hashCode() {
        return C1310k.m6156a(-569625254, C1310k.m6168b(this.f3979b));
    }
}
