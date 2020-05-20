package p071f.p131r;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0499b;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p071f.p080b.p081a.p082a.C3137a;
import p071f.p131r.C3490d.C3492b;
import p071f.p131r.C3490d.C3494c;
import p071f.p131r.C3503h.C3506c;
import p071f.p131r.C3503h.C3507d;
import p071f.p131r.C3503h.C3509f;

/* renamed from: f.r.e */
public final class C3497e<Key, Value> {

    /* renamed from: a */
    private Key f9905a;

    /* renamed from: b */
    private C3509f f9906b;

    /* renamed from: c */
    private C3492b<Key, Value> f9907c;

    /* renamed from: d */
    private C3506c f9908d;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: e */
    private Executor f9909e = C3137a.m12722b();

    /* renamed from: f.r.e$a */
    static class C3498a extends C0499b<C3503h<Value>> {

        /* renamed from: g */
        private C3503h<Value> f9910g;

        /* renamed from: h */
        private C3490d<Key, Value> f9911h;

        /* renamed from: i */
        private final C3494c f9912i = new C3499a();

        /* renamed from: j */
        final /* synthetic */ Object f9913j;

        /* renamed from: k */
        final /* synthetic */ C3492b f9914k;

        /* renamed from: l */
        final /* synthetic */ C3509f f9915l;

        /* renamed from: m */
        final /* synthetic */ Executor f9916m;

        /* renamed from: n */
        final /* synthetic */ Executor f9917n;

        /* renamed from: o */
        final /* synthetic */ C3506c f9918o;

        /* renamed from: f.r.e$a$a */
        class C3499a implements C3494c {
            C3499a() {
            }

            /* renamed from: a */
            public void mo11134a() {
                C3498a.this.mo3009c();
            }
        }

        C3498a(Executor executor, Object obj, C3492b bVar, C3509f fVar, Executor executor2, Executor executor3, C3506c cVar) {
            this.f9913j = obj;
            this.f9914k = bVar;
            this.f9915l = fVar;
            this.f9916m = executor2;
            this.f9917n = executor3;
            this.f9918o = cVar;
            super(executor);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3503h<Value> m14315a() {
            C3503h<Value> a;
            Object obj = this.f9913j;
            C3503h<Value> hVar = this.f9910g;
            if (hVar != null) {
                obj = hVar.mo11120g();
            }
            do {
                C3490d<Key, Value> dVar = this.f9911h;
                if (dVar != null) {
                    dVar.mo11129b(this.f9912i);
                }
                C3490d<Key, Value> a2 = this.f9914k.mo11132a();
                this.f9911h = a2;
                a2.mo11128a(this.f9912i);
                C3507d dVar2 = new C3507d(this.f9911h, this.f9915l);
                dVar2.mo11171b(this.f9916m);
                dVar2.mo11169a(this.f9917n);
                dVar2.mo11167a(this.f9918o);
                dVar2.mo11168a(obj);
                a = dVar2.mo11170a();
                this.f9910g = a;
            } while (a.mo11158k());
            return this.f9910g;
        }
    }

    public C3497e(C3492b<Key, Value> bVar, C3509f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (bVar != null) {
            this.f9907c = bVar;
            this.f9906b = fVar;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    private static <Key, Value> LiveData<C3503h<Value>> m14309a(Key key, C3509f fVar, C3506c cVar, C3492b<Key, Value> bVar, Executor executor, Executor executor2) {
        C3498a aVar = new C3498a(executor2, key, bVar, fVar, executor, executor2, cVar);
        return aVar.mo3008b();
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public LiveData<C3503h<Value>> mo11139a() {
        return m14309a(this.f9905a, this.f9906b, this.f9908d, this.f9907c, C3137a.m12724d(), this.f9909e);
    }

    /* renamed from: a */
    public C3497e<Key, Value> mo11140a(C3506c<Value> cVar) {
        this.f9908d = cVar;
        return this;
    }

    /* renamed from: a */
    public C3497e<Key, Value> mo11141a(Key key) {
        this.f9905a = key;
        return this;
    }

    /* renamed from: a */
    public C3497e<Key, Value> mo11142a(Executor executor) {
        this.f9909e = executor;
        return this;
    }
}
