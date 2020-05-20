package com.bumptech.glide.load.p005n;

import com.bumptech.glide.load.p005n.C0883e.C0884a;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p013q.p014d.C1178x;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.k */
public final class C0894k implements C0883e<InputStream> {

    /* renamed from: a */
    private final C1178x f3422a;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    public static final class C0895a implements C0884a<InputStream> {

        /* renamed from: a */
        private final C0916b f3423a;

        public C0895a(C0916b bVar) {
            this.f3423a = bVar;
        }

        /* renamed from: a */
        public C0883e<InputStream> mo4649a(InputStream inputStream) {
            return new C0894k(inputStream, this.f3423a);
        }

        /* renamed from: a */
        public Class<InputStream> mo4650a() {
            return InputStream.class;
        }
    }

    public C0894k(InputStream inputStream, C0916b bVar) {
        C1178x xVar = new C1178x(inputStream, bVar);
        this.f3422a = xVar;
        xVar.mark(5242880);
    }

    /* renamed from: a */
    public InputStream m4640a() {
        this.f3422a.reset();
        return this.f3422a;
    }

    /* renamed from: b */
    public void mo4648b() {
        this.f3422a.mo5063d();
    }

    /* renamed from: c */
    public void mo4662c() {
        this.f3422a.mo5060a();
    }
}
