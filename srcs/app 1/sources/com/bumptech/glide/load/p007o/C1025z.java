package com.bumptech.glide.load.p007o;

import android.util.Log;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p007o.C0975f.C0976a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p029t.C1305f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.z */
class C1025z implements C0975f, C0976a {

    /* renamed from: f */
    private final C0977g<?> f3754f;

    /* renamed from: g */
    private final C0976a f3755g;

    /* renamed from: h */
    private int f3756h;

    /* renamed from: i */
    private C0962c f3757i;

    /* renamed from: j */
    private Object f3758j;

    /* renamed from: k */
    private volatile C1070a<?> f3759k;

    /* renamed from: l */
    private C0973d f3760l;

    /* renamed from: com.bumptech.glide.load.o.z$a */
    class C1026a implements C0882a<Object> {

        /* renamed from: f */
        final /* synthetic */ C1070a f3761f;

        C1026a(C1070a aVar) {
            this.f3761f = aVar;
        }

        /* renamed from: a */
        public void mo4645a(Exception exc) {
            if (C1025z.this.mo4914a(this.f3761f)) {
                C1025z.this.mo4912a(this.f3761f, exc);
            }
        }

        /* renamed from: a */
        public void mo4646a(Object obj) {
            if (C1025z.this.mo4914a(this.f3761f)) {
                C1025z.this.mo4913a(this.f3761f, obj);
            }
        }
    }

    C1025z(C0977g<?> gVar, C0976a aVar) {
        this.f3754f = gVar;
        this.f3755g = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m5082a(Object obj) {
        String str = "SourceGenerator";
        long a = C1305f.m6136a();
        try {
            C0859d a2 = this.f3754f.mo4793a(obj);
            C0974e eVar = new C0974e(a2, obj, this.f3754f.mo4810i());
            this.f3760l = new C0973d(this.f3759k.f3806a, this.f3754f.mo4813l());
            this.f3754f.mo4805d().mo4739a(this.f3760l, eVar);
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f3760l);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(a2);
                sb.append(", duration: ");
                sb.append(C1305f.m6135a(a));
                Log.v(str, sb.toString());
            }
            this.f3759k.f3808c.mo4567b();
            this.f3757i = new C0962c(Collections.singletonList(this.f3759k.f3806a), this.f3754f, this);
        } catch (Throwable th) {
            this.f3759k.f3808c.mo4567b();
            throw th;
        }
    }

    /* renamed from: b */
    private void m5083b(C1070a<?> aVar) {
        this.f3759k.f3808c.mo4564a(this.f3754f.mo4811j(), new C1026a(aVar));
    }

    /* renamed from: b */
    private boolean m5084b() {
        return this.f3756h < this.f3754f.mo4808g().size();
    }

    /* renamed from: a */
    public void mo4790a(C0869g gVar, Exception exc, C0881d<?> dVar, C0856a aVar) {
        this.f3755g.mo4790a(gVar, exc, dVar, this.f3759k.f3808c.mo4568c());
    }

    /* renamed from: a */
    public void mo4791a(C0869g gVar, Object obj, C0881d<?> dVar, C0856a aVar, C0869g gVar2) {
        this.f3755g.mo4791a(gVar, obj, dVar, this.f3759k.f3808c.mo4568c(), gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4912a(C1070a<?> aVar, Exception exc) {
        C0976a aVar2 = this.f3755g;
        C0973d dVar = this.f3760l;
        C0881d<Data> dVar2 = aVar.f3808c;
        aVar2.mo4790a(dVar, exc, dVar2, dVar2.mo4568c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4913a(C1070a<?> aVar, Object obj) {
        C0989j e = this.f3754f.mo4806e();
        if (obj == null || !e.mo4841a(aVar.f3808c.mo4568c())) {
            C0976a aVar2 = this.f3755g;
            C0869g gVar = aVar.f3806a;
            C0881d<Data> dVar = aVar.f3808c;
            aVar2.mo4791a(gVar, obj, dVar, dVar.mo4568c(), this.f3760l);
            return;
        }
        this.f3758j = obj;
        this.f3755g.mo4792f();
    }

    /* renamed from: a */
    public boolean mo4766a() {
        Object obj = this.f3758j;
        if (obj != null) {
            this.f3758j = null;
            m5082a(obj);
        }
        C0962c cVar = this.f3757i;
        if (cVar != null && cVar.mo4766a()) {
            return true;
        }
        this.f3757i = null;
        this.f3759k = null;
        boolean z = false;
        while (!z && m5084b()) {
            List g = this.f3754f.mo4808g();
            int i = this.f3756h;
            this.f3756h = i + 1;
            this.f3759k = (C1070a) g.get(i);
            if (this.f3759k != null && (this.f3754f.mo4806e().mo4841a(this.f3759k.f3808c.mo4568c()) || this.f3754f.mo4804c(this.f3759k.f3808c.mo4563a()))) {
                m5083b(this.f3759k);
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4914a(C1070a<?> aVar) {
        C1070a<?> aVar2 = this.f3759k;
        return aVar2 != null && aVar2 == aVar;
    }

    public void cancel() {
        C1070a<?> aVar = this.f3759k;
        if (aVar != null) {
            aVar.f3808c.cancel();
        }
    }

    /* renamed from: f */
    public void mo4792f() {
        throw new UnsupportedOperationException();
    }
}
