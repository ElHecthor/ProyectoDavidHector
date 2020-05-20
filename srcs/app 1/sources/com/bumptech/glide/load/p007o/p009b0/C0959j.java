package com.bumptech.glide.load.p007o.p009b0;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.p029t.C1306g;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import com.bumptech.glide.p029t.p030l.C1312a;
import com.bumptech.glide.p029t.p030l.C1312a.C1316d;
import com.bumptech.glide.p029t.p030l.C1312a.C1318f;
import com.bumptech.glide.p029t.p030l.C1321c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.b0.j */
public class C0959j {

    /* renamed from: a */
    private final C1306g<C0869g, String> f3527a = new C1306g<>(1000);

    /* renamed from: b */
    private final C3318e<C0961b> f3528b = C1312a.m6176a(10, (C1316d<T>) new C0960a<T>(this));

    /* renamed from: com.bumptech.glide.load.o.b0.j$a */
    class C0960a implements C1316d<C0961b> {
        C0960a(C0959j jVar) {
        }

        /* renamed from: a */
        public C0961b m4862a() {
            try {
                return new C0961b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.j$b */
    private static final class C0961b implements C1318f {

        /* renamed from: f */
        final MessageDigest f3529f;

        /* renamed from: g */
        private final C1321c f3530g = C1321c.m6194b();

        C0961b(MessageDigest messageDigest) {
            this.f3529f = messageDigest;
        }

        /* renamed from: g */
        public C1321c mo4765g() {
            return this.f3530g;
        }
    }

    /* renamed from: b */
    private String m4859b(C0869g gVar) {
        Object a = this.f3528b.mo5387a();
        C1309j.m6149a(a);
        C0961b bVar = (C0961b) a;
        try {
            gVar.mo4618a(bVar.f3529f);
            return C1310k.m6162a(bVar.f3529f.digest());
        } finally {
            this.f3528b.mo5388a(bVar);
        }
    }

    /* renamed from: a */
    public String mo4763a(C0869g gVar) {
        String str;
        synchronized (this.f3527a) {
            str = (String) this.f3527a.mo5369a(gVar);
        }
        if (str == null) {
            str = m4859b(gVar);
        }
        synchronized (this.f3527a) {
            this.f3527a.mo5373b(gVar, str);
        }
        return str;
    }
}
