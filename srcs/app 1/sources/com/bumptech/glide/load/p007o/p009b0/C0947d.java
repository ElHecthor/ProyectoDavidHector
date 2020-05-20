package com.bumptech.glide.load.p007o.p009b0;

import com.bumptech.glide.load.p007o.p009b0.C0940a.C0941a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.d */
public class C0947d implements C0941a {

    /* renamed from: a */
    private final long f3503a;

    /* renamed from: b */
    private final C0948a f3504b;

    /* renamed from: com.bumptech.glide.load.o.b0.d$a */
    public interface C0948a {
        /* renamed from: a */
        File mo4746a();
    }

    public C0947d(C0948a aVar, long j) {
        this.f3503a = j;
        this.f3504b = aVar;
    }

    /* renamed from: a */
    public C0940a mo4740a() {
        File a = this.f3504b.mo4746a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C0949e.m4829a(a, this.f3503a);
        }
        return null;
    }
}
