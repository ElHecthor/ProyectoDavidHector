package com.bumptech.glide.load.p013q.p018h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0850j;
import com.bumptech.glide.C0852k;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.C0989j;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p021n.C1226a;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p025r.C1273f;
import com.bumptech.glide.p025r.p026j.C1280c;
import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p025r.p027k.C1291b;
import com.bumptech.glide.p028s.C1295b;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.h.g */
class C1201g {

    /* renamed from: a */
    private final C1226a f4008a;

    /* renamed from: b */
    private final Handler f4009b;

    /* renamed from: c */
    private final List<C1203b> f4010c;

    /* renamed from: d */
    final C0852k f4011d;

    /* renamed from: e */
    private final C0921e f4012e;

    /* renamed from: f */
    private boolean f4013f;

    /* renamed from: g */
    private boolean f4014g;

    /* renamed from: h */
    private boolean f4015h;

    /* renamed from: i */
    private C0850j<Bitmap> f4016i;

    /* renamed from: j */
    private C1202a f4017j;

    /* renamed from: k */
    private boolean f4018k;

    /* renamed from: l */
    private C1202a f4019l;

    /* renamed from: m */
    private Bitmap f4020m;

    /* renamed from: n */
    private C1202a f4021n;

    /* renamed from: o */
    private C1205d f4022o;

    /* renamed from: p */
    private int f4023p;

    /* renamed from: q */
    private int f4024q;

    /* renamed from: r */
    private int f4025r;

    /* renamed from: com.bumptech.glide.load.q.h.g$a */
    static class C1202a extends C1280c<Bitmap> {

        /* renamed from: i */
        private final Handler f4026i;

        /* renamed from: j */
        final int f4027j;

        /* renamed from: k */
        private final long f4028k;

        /* renamed from: l */
        private Bitmap f4029l;

        C1202a(Handler handler, int i, long j) {
            this.f4026i = handler;
            this.f4027j = i;
            this.f4028k = j;
        }

        /* renamed from: a */
        public void mo5128a(Bitmap bitmap, C1291b<? super Bitmap> bVar) {
            this.f4029l = bitmap;
            this.f4026i.sendMessageAtTime(this.f4026i.obtainMessage(1, this), this.f4028k);
        }

        /* renamed from: c */
        public void mo5129c(Drawable drawable) {
            this.f4029l = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Bitmap mo5130e() {
            return this.f4029l;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$b */
    public interface C1203b {
        /* renamed from: a */
        void mo5090a();
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$c */
    private class C1204c implements Callback {
        C1204c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1201g.this.mo5116a((C1202a) message.obj);
                return true;
            }
            if (i == 2) {
                C1201g.this.f4011d.mo4589a((C1285h<?>) (C1202a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$d */
    interface C1205d {
        /* renamed from: a */
        void mo5132a();
    }

    C1201g(C0832c cVar, C1226a aVar, int i, int i2, C0877m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.mo4521c(), C0832c.m4452d(cVar.mo4523e()), aVar, null, m5640a(C0832c.m4452d(cVar.mo4523e()), i, i2), mVar, bitmap);
    }

    C1201g(C0921e eVar, C0852k kVar, C1226a aVar, Handler handler, C0850j<Bitmap> jVar, C0877m<Bitmap> mVar, Bitmap bitmap) {
        this.f4010c = new ArrayList();
        this.f4011d = kVar;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C1204c());
        }
        this.f4012e = eVar;
        this.f4009b = handler;
        this.f4016i = jVar;
        this.f4008a = aVar;
        mo5115a(mVar, bitmap);
    }

    /* renamed from: a */
    private static C0850j<Bitmap> m5640a(C0852k kVar, int i, int i2) {
        return kVar.mo4595e().m4528a(((C1273f) ((C1273f) C1273f.m6001b(C0989j.f3638a).mo5272b(true)).mo5269a(true)).mo5258a(i, i2));
    }

    /* renamed from: j */
    private static C0869g m5641j() {
        return new C1295b(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    private void m5642k() {
        if (this.f4013f && !this.f4014g) {
            if (this.f4015h) {
                C1309j.m6153a(this.f4021n == null, "Pending target must be null when starting from the first frame");
                this.f4008a.mo5170h();
                this.f4015h = false;
            }
            C1202a aVar = this.f4021n;
            if (aVar != null) {
                this.f4021n = null;
                mo5116a(aVar);
                return;
            }
            this.f4014g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f4008a.mo5167e());
            this.f4008a.mo5164c();
            this.f4019l = new C1202a(this.f4009b, this.f4008a.mo5161a(), uptimeMillis);
            this.f4016i.m4528a((C1267a<?>) C1273f.m5999b(m5641j())).mo4579a((Object) this.f4008a).mo4581a(this.f4019l);
        }
    }

    /* renamed from: l */
    private void m5643l() {
        Bitmap bitmap = this.f4020m;
        if (bitmap != null) {
            this.f4012e.mo4713a(bitmap);
            this.f4020m = null;
        }
    }

    /* renamed from: m */
    private void m5644m() {
        if (!this.f4013f) {
            this.f4013f = true;
            this.f4018k = false;
            m5642k();
        }
    }

    /* renamed from: n */
    private void m5645n() {
        this.f4013f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5114a() {
        this.f4010c.clear();
        m5643l();
        m5645n();
        C1202a aVar = this.f4017j;
        if (aVar != null) {
            this.f4011d.mo4589a((C1285h<?>) aVar);
            this.f4017j = null;
        }
        C1202a aVar2 = this.f4019l;
        if (aVar2 != null) {
            this.f4011d.mo4589a((C1285h<?>) aVar2);
            this.f4019l = null;
        }
        C1202a aVar3 = this.f4021n;
        if (aVar3 != null) {
            this.f4011d.mo4589a((C1285h<?>) aVar3);
            this.f4021n = null;
        }
        this.f4008a.clear();
        this.f4018k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5115a(C0877m<Bitmap> mVar, Bitmap bitmap) {
        C1309j.m6149a(mVar);
        C0877m mVar2 = mVar;
        C1309j.m6149a(bitmap);
        this.f4020m = bitmap;
        this.f4016i = this.f4016i.m4528a(new C1273f().mo5262a(mVar));
        this.f4023p = C1310k.m6159a(bitmap);
        this.f4024q = bitmap.getWidth();
        this.f4025r = bitmap.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5116a(C1202a aVar) {
        C1205d dVar = this.f4022o;
        if (dVar != null) {
            dVar.mo5132a();
        }
        this.f4014g = false;
        if (this.f4018k) {
            this.f4009b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f4013f) {
            this.f4021n = aVar;
        } else {
            if (aVar.mo5130e() != null) {
                m5643l();
                C1202a aVar2 = this.f4017j;
                this.f4017j = aVar;
                for (int size = this.f4010c.size() - 1; size >= 0; size--) {
                    ((C1203b) this.f4010c.get(size)).mo5090a();
                }
                if (aVar2 != null) {
                    this.f4009b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m5642k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5117a(C1203b bVar) {
        if (this.f4018k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f4010c.contains(bVar)) {
            boolean isEmpty = this.f4010c.isEmpty();
            this.f4010c.add(bVar);
            if (isEmpty) {
                m5644m();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ByteBuffer mo5118b() {
        return this.f4008a.mo5169g().asReadOnlyBuffer();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5119b(C1203b bVar) {
        this.f4010c.remove(bVar);
        if (this.f4010c.isEmpty()) {
            m5645n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Bitmap mo5120c() {
        C1202a aVar = this.f4017j;
        return aVar != null ? aVar.mo5130e() : this.f4020m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5121d() {
        C1202a aVar = this.f4017j;
        if (aVar != null) {
            return aVar.f4027j;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Bitmap mo5122e() {
        return this.f4020m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo5123f() {
        return this.f4008a.mo5166d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo5124g() {
        return this.f4025r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo5125h() {
        return this.f4008a.mo5168f() + this.f4023p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo5126i() {
        return this.f4024q;
    }
}
