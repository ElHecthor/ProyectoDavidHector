package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.d0 */
final class C2083d0 extends C2079b0 {

    /* renamed from: e */
    private final Callable<String> f5976e;

    private C2083d0(Callable<String> callable) {
        super(false, null, null);
        this.f5976e = callable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo6784a() {
        try {
            return (String) this.f5976e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
