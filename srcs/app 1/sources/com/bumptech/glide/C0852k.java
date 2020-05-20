package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p007o.C0989j;
import com.bumptech.glide.load.p013q.p018h.C1196c;
import com.bumptech.glide.p022o.C1234c;
import com.bumptech.glide.p022o.C1234c.C1235a;
import com.bumptech.glide.p022o.C1236d;
import com.bumptech.glide.p022o.C1241h;
import com.bumptech.glide.p022o.C1242i;
import com.bumptech.glide.p022o.C1249m;
import com.bumptech.glide.p022o.C1250n;
import com.bumptech.glide.p022o.C1253p;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p025r.C1269c;
import com.bumptech.glide.p025r.C1272e;
import com.bumptech.glide.p025r.C1273f;
import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p029t.C1310k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.k */
public class C0852k implements ComponentCallbacks2, C1242i {

    /* renamed from: r */
    private static final C1273f f3350r = ((C1273f) C1273f.m6002b(Bitmap.class).mo5252I());

    /* renamed from: f */
    protected final C0832c f3351f;

    /* renamed from: g */
    protected final Context f3352g;

    /* renamed from: h */
    final C1241h f3353h;

    /* renamed from: i */
    private final C1250n f3354i;

    /* renamed from: j */
    private final C1249m f3355j;

    /* renamed from: k */
    private final C1253p f3356k;

    /* renamed from: l */
    private final Runnable f3357l;

    /* renamed from: m */
    private final Handler f3358m;

    /* renamed from: n */
    private final C1234c f3359n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C1272e<Object>> f3360o;

    /* renamed from: p */
    private C1273f f3361p;

    /* renamed from: q */
    private boolean f3362q;

    /* renamed from: com.bumptech.glide.k$a */
    class C0853a implements Runnable {
        C0853a() {
        }

        public void run() {
            C0852k kVar = C0852k.this;
            kVar.f3353h.mo5181a(kVar);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    private class C0854b implements C1235a {

        /* renamed from: a */
        private final C1250n f3364a;

        C0854b(C1250n nVar) {
            this.f3364a = nVar;
        }

        /* renamed from: a */
        public void mo4608a(boolean z) {
            if (z) {
                synchronized (C0852k.this) {
                    this.f3364a.mo5213d();
                }
            }
        }
    }

    static {
        C1273f fVar = (C1273f) C1273f.m6002b(C1196c.class).mo5252I();
        C1273f fVar2 = (C1273f) ((C1273f) C1273f.m6001b(C0989j.f3639b).mo5259a(C0838g.LOW)).mo5269a(true);
    }

    public C0852k(C0832c cVar, C1241h hVar, C1249m mVar, Context context) {
        this(cVar, hVar, mVar, new C1250n(), cVar.mo4522d(), context);
    }

    C0852k(C0832c cVar, C1241h hVar, C1249m mVar, C1250n nVar, C1236d dVar, Context context) {
        this.f3356k = new C1253p();
        this.f3357l = new C0853a();
        this.f3358m = new Handler(Looper.getMainLooper());
        this.f3351f = cVar;
        this.f3353h = hVar;
        this.f3355j = mVar;
        this.f3354i = nVar;
        this.f3352g = context;
        this.f3359n = dVar.mo5185a(context.getApplicationContext(), new C0854b(nVar));
        if (C1310k.m6169b()) {
            this.f3358m.post(this.f3357l);
        } else {
            hVar.mo5181a(this);
        }
        hVar.mo5181a(this.f3359n);
        this.f3360o = new CopyOnWriteArrayList<>(cVar.mo4524f().mo4537b());
        mo4588a(cVar.mo4524f().mo4538c());
        cVar.mo4517a(this);
    }

    /* renamed from: c */
    private void m4532c(C1285h<?> hVar) {
        boolean b = mo4593b(hVar);
        C1269c c = hVar.mo5324c();
        if (!b && !this.f3351f.mo4518a(hVar) && c != null) {
            hVar.mo5321a((C1269c) null);
            c.clear();
        }
    }

    /* renamed from: a */
    public <ResourceType> C0850j<ResourceType> mo4585a(Class<ResourceType> cls) {
        return new C0850j<>(this.f3351f, this, cls, this.f3352g);
    }

    /* renamed from: a */
    public C0850j<Drawable> mo4586a(String str) {
        return mo4596f().mo4580a(str);
    }

    /* renamed from: a */
    public synchronized void mo4587a() {
        mo4602l();
        this.f3356k.mo4587a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo4588a(C1273f fVar) {
        this.f3361p = (C1273f) ((C1273f) fVar.clone()).mo5270b();
    }

    /* renamed from: a */
    public void mo4589a(C1285h<?> hVar) {
        if (hVar != null) {
            m4532c(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4590a(C1285h<?> hVar, C1269c cVar) {
        this.f3356k.mo5221a(hVar);
        this.f3354i.mo5211b(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> C0855l<?, T> mo4591b(Class<T> cls) {
        return this.f3351f.mo4524f().mo4534a(cls);
    }

    /* renamed from: b */
    public synchronized void mo4592b() {
        mo4601k();
        this.f3356k.mo4592b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo4593b(C1285h<?> hVar) {
        C1269c c = hVar.mo5324c();
        if (c == null) {
            return true;
        }
        if (!this.f3354i.mo5209a(c)) {
            return false;
        }
        this.f3356k.mo5222b(hVar);
        hVar.mo5321a((C1269c) null);
        return true;
    }

    /* renamed from: d */
    public synchronized void mo4594d() {
        this.f3356k.mo4594d();
        for (C1285h a : this.f3356k.mo5224f()) {
            mo4589a(a);
        }
        this.f3356k.mo5223e();
        this.f3354i.mo5208a();
        this.f3353h.mo5183b(this);
        this.f3353h.mo5183b(this.f3359n);
        this.f3358m.removeCallbacks(this.f3357l);
        this.f3351f.mo4520b(this);
    }

    /* renamed from: e */
    public C0850j<Bitmap> mo4595e() {
        return mo4585a(Bitmap.class).m4528a((C1267a<?>) f3350r);
    }

    /* renamed from: f */
    public C0850j<Drawable> mo4596f() {
        return mo4585a(Drawable.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C1272e<Object>> mo4597g() {
        return this.f3360o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public synchronized C1273f mo4598h() {
        return this.f3361p;
    }

    /* renamed from: i */
    public synchronized void mo4599i() {
        this.f3354i.mo5210b();
    }

    /* renamed from: j */
    public synchronized void mo4600j() {
        mo4599i();
        for (C0852k i : this.f3355j.mo5188a()) {
            i.mo4599i();
        }
    }

    /* renamed from: k */
    public synchronized void mo4601k() {
        this.f3354i.mo5212c();
    }

    /* renamed from: l */
    public synchronized void mo4602l() {
        this.f3354i.mo5214e();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f3362q) {
            mo4600j();
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{tracker=");
        sb.append(this.f3354i);
        sb.append(", treeNode=");
        sb.append(this.f3355j);
        sb.append("}");
        return sb.toString();
    }
}
