package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.v */
abstract class C2207v extends C2184t {

    /* renamed from: c */
    private static final WeakReference<byte[]> f6185c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f6186b = f6185c;

    C2207v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final byte[] mo6985t() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6186b.get();
            if (bArr == null) {
                bArr = mo6572u();
                this.f6186b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract byte[] mo6572u();
}
