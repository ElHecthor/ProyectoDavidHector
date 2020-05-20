package com.facebook;

import android.content.Intent;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import p071f.p129q.p130a.C3476a;

/* renamed from: com.facebook.z */
public final class C1850z {

    /* renamed from: d */
    private static volatile C1850z f5485d;

    /* renamed from: a */
    private final C3476a f5486a;

    /* renamed from: b */
    private final C1849y f5487b;

    /* renamed from: c */
    private C1846x f5488c;

    C1850z(C3476a aVar, C1849y yVar) {
        C1703w.m7423a((Object) aVar, "localBroadcastManager");
        C1703w.m7423a((Object) yVar, "profileCache");
        this.f5486a = aVar;
        this.f5487b = yVar;
    }

    /* renamed from: a */
    private void m7945a(C1846x xVar, C1846x xVar2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", xVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", xVar2);
        this.f5486a.mo11088a(intent);
    }

    /* renamed from: a */
    private void m7946a(C1846x xVar, boolean z) {
        C1846x xVar2 = this.f5488c;
        this.f5488c = xVar;
        if (z) {
            C1849y yVar = this.f5487b;
            if (xVar != null) {
                yVar.mo6303a(xVar);
            } else {
                yVar.mo6302a();
            }
        }
        if (!C1698v.m7388a(xVar2, xVar)) {
            m7945a(xVar2, xVar);
        }
    }

    /* renamed from: c */
    static C1850z m7947c() {
        if (f5485d == null) {
            synchronized (C1850z.class) {
                if (f5485d == null) {
                    f5485d = new C1850z(C3476a.m14249a(C1787m.m7744e()), new C1849y());
                }
            }
        }
        return f5485d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1846x mo6305a() {
        return this.f5488c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6306a(C1846x xVar) {
        m7946a(xVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6307b() {
        C1846x b = this.f5487b.mo6304b();
        if (b == null) {
            return false;
        }
        m7946a(b, false);
        return true;
    }
}
