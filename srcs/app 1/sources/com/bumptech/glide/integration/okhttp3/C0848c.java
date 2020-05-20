package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import java.io.InputStream;
import p337m.C6244e.C6245a;
import p337m.C6462x;

/* renamed from: com.bumptech.glide.integration.okhttp3.c */
public class C0848c implements C1069n<C1055g, InputStream> {

    /* renamed from: a */
    private final C6245a f3332a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.c$a */
    public static class C0849a implements C1071o<C1055g, InputStream> {

        /* renamed from: b */
        private static volatile C6245a f3333b;

        /* renamed from: a */
        private final C6245a f3334a;

        public C0849a() {
            this(m4511b());
        }

        public C0849a(C6245a aVar) {
            this.f3334a = aVar;
        }

        /* renamed from: b */
        private static C6245a m4511b() {
            if (f3333b == null) {
                synchronized (C0849a.class) {
                    if (f3333b == null) {
                        f3333b = new C6462x();
                    }
                }
            }
            return f3333b;
        }

        /* renamed from: a */
        public C1069n<C1055g, InputStream> mo4574a(C1077r rVar) {
            return new C0848c(this.f3334a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C0848c(C6245a aVar) {
        this.f3332a = aVar;
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(C1055g gVar, int i, int i2, C0873i iVar) {
        return new C1070a<>(gVar, new C0847b(this.f3332a, gVar));
    }

    /* renamed from: a */
    public boolean mo4573a(C1055g gVar) {
        return true;
    }
}
