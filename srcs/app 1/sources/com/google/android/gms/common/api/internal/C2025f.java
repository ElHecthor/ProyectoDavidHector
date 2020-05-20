package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.C2084e;
import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.C1981a.C1985d;
import com.google.android.gms.common.api.C1981a.C1992f;
import com.google.android.gms.common.api.C1998e;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.C2074n;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2017c.C2018a;
import com.google.android.gms.common.internal.C2095c.C2098c;
import com.google.android.gms.common.internal.C2095c.C2100e;
import com.google.android.gms.common.internal.C2126k;
import com.google.android.gms.common.internal.C2128l;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2187b;
import com.google.android.gms.common.util.C2197l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p071f.p088e.C3162a;
import p071f.p088e.C3164b;
import p147g.p156d.p157a.p167b.p173d.p177d.C3878d;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.api.internal.f */
public class C2025f implements Callback {

    /* renamed from: n */
    public static final Status f5866n = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Status f5867o = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Object f5868p = new Object();
    @GuardedBy("lock")

    /* renamed from: q */
    private static C2025f f5869q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f5870a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f5871b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f5872c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f5873d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2084e f5874e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2126k f5875f;

    /* renamed from: g */
    private final AtomicInteger f5876g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f5877h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<C2014b<?>, C2026a<?>> f5878i = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: j */
    public C2052r f5879j = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: k */
    public final Set<C2014b<?>> f5880k = new C3164b();

    /* renamed from: l */
    private final Set<C2014b<?>> f5881l = new C3164b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Handler f5882m;

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public class C2026a<O extends C1985d> implements C2002a, C2003b, C2065x0 {

        /* renamed from: a */
        private final Queue<C2031g0> f5883a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1992f f5884b;

        /* renamed from: c */
        private final C1983b f5885c;

        /* renamed from: d */
        private final C2014b<O> f5886d;

        /* renamed from: e */
        private final C2067y0 f5887e;

        /* renamed from: f */
        private final Set<C2053r0> f5888f = new HashSet();

        /* renamed from: g */
        private final Map<C2036j<?>, C2029f0> f5889g = new HashMap();

        /* renamed from: h */
        private final int f5890h;

        /* renamed from: i */
        private final C2035i0 f5891i;

        /* renamed from: j */
        private boolean f5892j;

        /* renamed from: k */
        private final List<C2028c> f5893k = new ArrayList();

        /* renamed from: l */
        private C2078b f5894l = null;

        /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.common.api.a$h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2026a(com.google.android.gms.common.api.C1998e<O> r5) {
            /*
                r3 = this;
                com.google.android.gms.common.api.internal.C2025f.this = r4
                r3.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r3.f5883a = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.f5888f = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.f5889g = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f5893k = r0
                r0 = 0
                r3.f5894l = r0
                android.os.Handler r1 = r4.f5882m
                android.os.Looper r1 = r1.getLooper()
                com.google.android.gms.common.api.a$f r1 = r5.mo6613a(r1, r3)
                r3.f5884b = r1
                boolean r2 = r1 instanceof com.google.android.gms.common.internal.C2154v
                if (r2 == 0) goto L_0x003c
                com.google.android.gms.common.internal.v r1 = (com.google.android.gms.common.internal.C2154v) r1
                com.google.android.gms.common.api.a$h r1 = r1.mo6553B()
            L_0x003c:
                r3.f5885c = r1
                com.google.android.gms.common.api.internal.b r1 = r5.mo6618c()
                r3.f5886d = r1
                com.google.android.gms.common.api.internal.y0 r1 = new com.google.android.gms.common.api.internal.y0
                r1.<init>()
                r3.f5887e = r1
                int r1 = r5.mo6621f()
                r3.f5890h = r1
                com.google.android.gms.common.api.a$f r1 = r3.f5884b
                boolean r1 = r1.mo6607k()
                if (r1 == 0) goto L_0x0068
                android.content.Context r0 = r4.f5873d
                android.os.Handler r4 = r4.f5882m
                com.google.android.gms.common.api.internal.i0 r4 = r5.mo6616a(r0, r4)
                r3.f5891i = r4
                return
            L_0x0068:
                r3.f5891i = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2025f.C2026a.<init>(com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.e):void");
        }

        /* renamed from: a */
        private final C2082d m8453a(C2082d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                C2082d[] g = this.f5884b.mo6604g();
                if (g == null) {
                    g = new C2082d[0];
                }
                C3162a aVar = new C3162a(g.length);
                for (C2082d dVar : g) {
                    aVar.put(dVar.mo6791e(), Long.valueOf(dVar.mo6793f()));
                }
                for (C2082d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.mo6791e()) || ((Long) aVar.get(dVar2.mo6791e())).longValue() < dVar2.mo6793f()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8456a(C2028c cVar) {
            if (this.f5893k.contains(cVar) && !this.f5892j) {
                if (!this.f5884b.mo6600a()) {
                    mo6691a();
                    return;
                }
                m8469o();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m8458a(boolean z) {
            C2148s.m8838a(C2025f.this.f5882m);
            if (!this.f5884b.mo6600a() || this.f5889g.size() != 0) {
                return false;
            }
            if (this.f5887e.mo6757a()) {
                if (z) {
                    m8471q();
                }
                return false;
            }
            this.f5884b.mo6606i();
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m8461b(C2028c cVar) {
            if (this.f5893k.remove(cVar)) {
                C2025f.this.f5882m.removeMessages(15, cVar);
                C2025f.this.f5882m.removeMessages(16, cVar);
                C2082d b = cVar.f5903b;
                ArrayList arrayList = new ArrayList(this.f5883a.size());
                for (C2031g0 g0Var : this.f5883a) {
                    if (g0Var instanceof C2058u) {
                        C2082d[] b2 = ((C2058u) g0Var).mo6737b(this);
                        if (b2 != null && C2187b.m8971a(b2, b)) {
                            arrayList.add(g0Var);
                        }
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C2031g0 g0Var2 = (C2031g0) obj;
                    this.f5883a.remove(g0Var2);
                    g0Var2.mo6717a((RuntimeException) new C2074n(b));
                }
            }
        }

        /* renamed from: b */
        private final boolean m8462b(C2031g0 g0Var) {
            if (!(g0Var instanceof C2058u)) {
                m8464c(g0Var);
                return true;
            }
            C2058u uVar = (C2058u) g0Var;
            C2082d a = m8453a(uVar.mo6737b(this));
            if (a == null) {
                m8464c(g0Var);
                return true;
            }
            if (uVar.mo6738c(this)) {
                C2028c cVar = new C2028c(this.f5886d, a, null);
                int indexOf = this.f5893k.indexOf(cVar);
                if (indexOf >= 0) {
                    C2028c cVar2 = (C2028c) this.f5893k.get(indexOf);
                    C2025f.this.f5882m.removeMessages(15, cVar2);
                    C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 15, cVar2), C2025f.this.f5870a);
                } else {
                    this.f5893k.add(cVar);
                    C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 15, cVar), C2025f.this.f5870a);
                    C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 16, cVar), C2025f.this.f5871b);
                    C2078b bVar = new C2078b(2, null);
                    if (!m8465c(bVar)) {
                        C2025f.this.mo6689b(bVar, this.f5890h);
                    }
                }
            } else {
                uVar.mo6717a((RuntimeException) new C2074n(a));
            }
            return false;
        }

        /* renamed from: c */
        private final void m8464c(C2031g0 g0Var) {
            g0Var.mo6716a(this.f5887e, mo6699d());
            try {
                g0Var.mo6715a(this);
            } catch (DeadObjectException unused) {
                mo6680a(1);
                this.f5884b.mo6606i();
            }
        }

        /* renamed from: c */
        private final boolean m8465c(C2078b bVar) {
            synchronized (C2025f.f5868p) {
                if (C2025f.this.f5879j == null || !C2025f.this.f5880k.contains(this.f5886d)) {
                    return false;
                }
                C2025f.this.f5879j.mo6746b(bVar, this.f5890h);
                return true;
            }
        }

        /* renamed from: d */
        private final void m8466d(C2078b bVar) {
            for (C2053r0 r0Var : this.f5888f) {
                String str = null;
                if (C2141q.m8823a(bVar, C2078b.f5962j)) {
                    str = this.f5884b.mo6605h();
                }
                r0Var.mo6743a(this.f5886d, bVar, str);
            }
            this.f5888f.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m8467m() {
            mo6705j();
            m8466d(C2078b.f5962j);
            m8470p();
            Iterator it = this.f5889g.values().iterator();
            while (it.hasNext()) {
                C2029f0 f0Var = (C2029f0) it.next();
                if (m8453a(f0Var.f5904a.mo6732b()) == null) {
                    try {
                        f0Var.f5904a.mo6731a(this.f5885c, new C4351i());
                    } catch (DeadObjectException unused) {
                        mo6680a(1);
                        this.f5884b.mo6606i();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m8469o();
            m8471q();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m8468n() {
            mo6705j();
            this.f5892j = true;
            this.f5887e.mo6759c();
            C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 9, this.f5886d), C2025f.this.f5870a);
            C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 11, this.f5886d), C2025f.this.f5871b);
            C2025f.this.f5875f.mo6908a();
        }

        /* renamed from: o */
        private final void m8469o() {
            ArrayList arrayList = new ArrayList(this.f5883a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C2031g0 g0Var = (C2031g0) obj;
                if (!this.f5884b.mo6600a()) {
                    return;
                }
                if (m8462b(g0Var)) {
                    this.f5883a.remove(g0Var);
                }
            }
        }

        /* renamed from: p */
        private final void m8470p() {
            if (this.f5892j) {
                C2025f.this.f5882m.removeMessages(11, this.f5886d);
                C2025f.this.f5882m.removeMessages(9, this.f5886d);
                this.f5892j = false;
            }
        }

        /* renamed from: q */
        private final void m8471q() {
            C2025f.this.f5882m.removeMessages(12, this.f5886d);
            C2025f.this.f5882m.sendMessageDelayed(C2025f.this.f5882m.obtainMessage(12, this.f5886d), C2025f.this.f5872c);
        }

        /* renamed from: a */
        public final void mo6691a() {
            C2148s.m8838a(C2025f.this.f5882m);
            if (!this.f5884b.mo6600a() && !this.f5884b.mo6603f()) {
                int a = C2025f.this.f5875f.mo6907a(C2025f.this.f5873d, this.f5884b);
                if (a != 0) {
                    mo6695a(new C2078b(a, null));
                    return;
                }
                C2027b bVar = new C2027b(this.f5884b, this.f5886d);
                if (this.f5884b.mo6607k()) {
                    this.f5891i.mo6724a((C2037j0) bVar);
                }
                this.f5884b.mo6597a((C2098c) bVar);
            }
        }

        /* renamed from: a */
        public final void mo6680a(int i) {
            if (Looper.myLooper() == C2025f.this.f5882m.getLooper()) {
                m8468n();
            } else {
                C2025f.this.f5882m.post(new C2064x(this));
            }
        }

        /* renamed from: a */
        public final void mo6692a(Status status) {
            C2148s.m8838a(C2025f.this.f5882m);
            for (C2031g0 a : this.f5883a) {
                a.mo6714a(status);
            }
            this.f5883a.clear();
        }

        /* renamed from: a */
        public final void mo6693a(C2031g0 g0Var) {
            C2148s.m8838a(C2025f.this.f5882m);
            if (!this.f5884b.mo6600a()) {
                this.f5883a.add(g0Var);
                C2078b bVar = this.f5894l;
                if (bVar == null || !bVar.mo6779h()) {
                    mo6691a();
                } else {
                    mo6695a(this.f5894l);
                }
            } else if (m8462b(g0Var)) {
                m8471q();
            } else {
                this.f5883a.add(g0Var);
            }
        }

        /* renamed from: a */
        public final void mo6694a(C2053r0 r0Var) {
            C2148s.m8838a(C2025f.this.f5882m);
            this.f5888f.add(r0Var);
        }

        /* renamed from: a */
        public final void mo6695a(C2078b bVar) {
            C2148s.m8838a(C2025f.this.f5882m);
            C2035i0 i0Var = this.f5891i;
            if (i0Var != null) {
                i0Var.mo6726t();
            }
            mo6705j();
            C2025f.this.f5875f.mo6908a();
            m8466d(bVar);
            if (bVar.mo6775e() == 4) {
                mo6692a(C2025f.f5867o);
            } else if (this.f5883a.isEmpty()) {
                this.f5894l = bVar;
            } else {
                if (!m8465c(bVar) && !C2025f.this.mo6689b(bVar, this.f5890h)) {
                    if (bVar.mo6775e() == 18) {
                        this.f5892j = true;
                    }
                    if (this.f5892j) {
                        C2025f.this.f5882m.sendMessageDelayed(Message.obtain(C2025f.this.f5882m, 9, this.f5886d), C2025f.this.f5870a);
                        return;
                    }
                    String a = this.f5886d.mo6651a();
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + String.valueOf(valueOf).length());
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    mo6692a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: b */
        public final int mo6696b() {
            return this.f5890h;
        }

        /* renamed from: b */
        public final void mo6697b(C2078b bVar) {
            C2148s.m8838a(C2025f.this.f5882m);
            this.f5884b.mo6606i();
            mo6695a(bVar);
        }

        /* renamed from: c */
        public final void mo6681c(Bundle bundle) {
            if (Looper.myLooper() == C2025f.this.f5882m.getLooper()) {
                m8467m();
            } else {
                C2025f.this.f5882m.post(new C2062w(this));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo6698c() {
            return this.f5884b.mo6600a();
        }

        /* renamed from: d */
        public final boolean mo6699d() {
            return this.f5884b.mo6607k();
        }

        /* renamed from: e */
        public final void mo6700e() {
            C2148s.m8838a(C2025f.this.f5882m);
            if (this.f5892j) {
                mo6691a();
            }
        }

        /* renamed from: f */
        public final C1992f mo6701f() {
            return this.f5884b;
        }

        /* renamed from: g */
        public final void mo6702g() {
            C2148s.m8838a(C2025f.this.f5882m);
            if (this.f5892j) {
                m8470p();
                mo6692a(C2025f.this.f5874e.mo6806b(C2025f.this.f5873d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f5884b.mo6606i();
            }
        }

        /* renamed from: h */
        public final void mo6703h() {
            C2148s.m8838a(C2025f.this.f5882m);
            mo6692a(C2025f.f5866n);
            this.f5887e.mo6758b();
            for (C2036j q0Var : (C2036j[]) this.f5889g.keySet().toArray(new C2036j[this.f5889g.size()])) {
                mo6693a((C2031g0) new C2051q0(q0Var, new C4351i()));
            }
            m8466d(new C2078b(4));
            if (this.f5884b.mo6600a()) {
                this.f5884b.mo6598a((C2100e) new C2068z(this));
            }
        }

        /* renamed from: i */
        public final Map<C2036j<?>, C2029f0> mo6704i() {
            return this.f5889g;
        }

        /* renamed from: j */
        public final void mo6705j() {
            C2148s.m8838a(C2025f.this.f5882m);
            this.f5894l = null;
        }

        /* renamed from: k */
        public final C2078b mo6706k() {
            C2148s.m8838a(C2025f.this.f5882m);
            return this.f5894l;
        }

        /* renamed from: l */
        public final boolean mo6707l() {
            return m8458a(true);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.f$b */
    private class C2027b implements C2037j0, C2098c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1992f f5896a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2014b<?> f5897b;

        /* renamed from: c */
        private C2128l f5898c = null;

        /* renamed from: d */
        private Set<Scope> f5899d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f5900e = false;

        public C2027b(C1992f fVar, C2014b<?> bVar) {
            this.f5896a = fVar;
            this.f5897b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8492a() {
            if (this.f5900e) {
                C2128l lVar = this.f5898c;
                if (lVar != null) {
                    this.f5896a.mo6599a(lVar, this.f5899d);
                }
            }
        }

        /* renamed from: a */
        public final void mo6708a(C2078b bVar) {
            C2025f.this.f5882m.post(new C2015b0(this, bVar));
        }

        /* renamed from: a */
        public final void mo6709a(C2128l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo6710b(new C2078b(4));
                return;
            }
            this.f5898c = lVar;
            this.f5899d = set;
            m8492a();
        }

        /* renamed from: b */
        public final void mo6710b(C2078b bVar) {
            ((C2026a) C2025f.this.f5878i.get(this.f5897b)).mo6697b(bVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.f$c */
    private static class C2028c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2014b<?> f5902a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2082d f5903b;

        private C2028c(C2014b<?> bVar, C2082d dVar) {
            this.f5902a = bVar;
            this.f5903b = dVar;
        }

        /* synthetic */ C2028c(C2014b bVar, C2082d dVar, C2060v vVar) {
            this(bVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C2028c)) {
                C2028c cVar = (C2028c) obj;
                if (C2141q.m8823a(this.f5902a, cVar.f5902a) && C2141q.m8823a(this.f5903b, cVar.f5903b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C2141q.m8821a(this.f5902a, this.f5903b);
        }

        public final String toString() {
            C2142a a = C2141q.m8822a((Object) this);
            a.mo6935a("key", this.f5902a);
            a.mo6935a("feature", this.f5903b);
            return a.toString();
        }
    }

    private C2025f(Context context, Looper looper, C2084e eVar) {
        this.f5873d = context;
        this.f5882m = new C3878d(looper, this);
        this.f5874e = eVar;
        this.f5875f = new C2126k(eVar);
        Handler handler = this.f5882m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C2025f m8431a(Context context) {
        C2025f fVar;
        synchronized (f5868p) {
            if (f5869q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5869q = new C2025f(context.getApplicationContext(), handlerThread.getLooper(), C2084e.m8612a());
            }
            fVar = f5869q;
        }
        return fVar;
    }

    /* renamed from: b */
    private final void m8433b(C1998e<?> eVar) {
        C2014b c = eVar.mo6618c();
        C2026a aVar = (C2026a) this.f5878i.get(c);
        if (aVar == null) {
            aVar = new C2026a(eVar);
            this.f5878i.put(c, aVar);
        }
        if (aVar.mo6699d()) {
            this.f5881l.add(c);
        }
        aVar.mo6691a();
    }

    /* renamed from: c */
    public static void m8435c() {
        synchronized (f5868p) {
            if (f5869q != null) {
                C2025f fVar = f5869q;
                fVar.f5877h.incrementAndGet();
                fVar.f5882m.sendMessageAtFrontOfQueue(fVar.f5882m.obtainMessage(10));
            }
        }
    }

    /* renamed from: a */
    public final int mo6682a() {
        return this.f5876g.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo6683a(C1998e<?> eVar) {
        Handler handler = this.f5882m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: a */
    public final <O extends C1985d> void mo6684a(C1998e<O> eVar, int i, C2021d<? extends C2071k, C1983b> dVar) {
        C2047o0 o0Var = new C2047o0(i, dVar);
        Handler handler = this.f5882m;
        handler.sendMessage(handler.obtainMessage(4, new C2024e0(o0Var, this.f5877h.get(), eVar)));
    }

    /* renamed from: a */
    public final void mo6685a(C2052r rVar) {
        synchronized (f5868p) {
            if (this.f5879j != rVar) {
                this.f5879j = rVar;
                this.f5880k.clear();
            }
            this.f5880k.addAll(rVar.mo6741h());
        }
    }

    /* renamed from: a */
    public final void mo6686a(C2078b bVar, int i) {
        if (!mo6689b(bVar, i)) {
            Handler handler = this.f5882m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    /* renamed from: b */
    public final void mo6687b() {
        Handler handler = this.f5882m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6688b(C2052r rVar) {
        synchronized (f5868p) {
            if (this.f5879j == rVar) {
                this.f5879j = null;
                this.f5880k.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo6689b(C2078b bVar, int i) {
        return this.f5874e.mo6805a(this.f5873d, bVar, i);
    }

    public boolean handleMessage(Message message) {
        C4351i iVar;
        Boolean bool;
        int i = message.what;
        long j = 300000;
        String str = "GoogleApiManager";
        C2026a aVar = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f5872c = j;
                this.f5882m.removeMessages(12);
                for (C2014b bVar : this.f5878i.keySet()) {
                    Handler handler = this.f5882m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f5872c);
                }
                break;
            case 2:
                C2053r0 r0Var = (C2053r0) message.obj;
                Iterator it = r0Var.mo6742a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C2014b bVar2 = (C2014b) it.next();
                        C2026a aVar2 = (C2026a) this.f5878i.get(bVar2);
                        if (aVar2 == null) {
                            r0Var.mo6743a(bVar2, new C2078b(13), null);
                            break;
                        } else if (aVar2.mo6698c()) {
                            r0Var.mo6743a(bVar2, C2078b.f5962j, aVar2.mo6701f().mo6605h());
                        } else if (aVar2.mo6706k() != null) {
                            r0Var.mo6743a(bVar2, aVar2.mo6706k(), null);
                        } else {
                            aVar2.mo6694a(r0Var);
                            aVar2.mo6691a();
                        }
                    }
                }
            case 3:
                for (C2026a aVar3 : this.f5878i.values()) {
                    aVar3.mo6705j();
                    aVar3.mo6691a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C2024e0 e0Var = (C2024e0) message.obj;
                C2026a aVar4 = (C2026a) this.f5878i.get(e0Var.f5865c.mo6618c());
                if (aVar4 == null) {
                    m8433b(e0Var.f5865c);
                    aVar4 = (C2026a) this.f5878i.get(e0Var.f5865c.mo6618c());
                }
                if (aVar4.mo6699d() && this.f5877h.get() != e0Var.f5864b) {
                    e0Var.f5863a.mo6714a(f5866n);
                    aVar4.mo6703h();
                    break;
                } else {
                    aVar4.mo6693a(e0Var.f5863a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                C2078b bVar3 = (C2078b) message.obj;
                Iterator it2 = this.f5878i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C2026a aVar5 = (C2026a) it2.next();
                        if (aVar5.mo6696b() == i2) {
                            aVar = aVar5;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf(str, sb.toString(), new Exception());
                    break;
                } else {
                    String a = this.f5874e.mo6803a(bVar3.mo6775e());
                    String f = bVar3.mo6777f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 69 + String.valueOf(f).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a);
                    sb2.append(": ");
                    sb2.append(f);
                    aVar.mo6692a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C2197l.m8998a() && (this.f5873d.getApplicationContext() instanceof Application)) {
                    C2017c.m8399a((Application) this.f5873d.getApplicationContext());
                    C2017c.m8400b().mo6656a((C2018a) new C2060v(this));
                    if (!C2017c.m8400b().mo6658a(true)) {
                        this.f5872c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m8433b((C1998e) message.obj);
                break;
            case 9:
                if (this.f5878i.containsKey(message.obj)) {
                    ((C2026a) this.f5878i.get(message.obj)).mo6700e();
                    break;
                }
                break;
            case 10:
                for (C2014b remove : this.f5881l) {
                    ((C2026a) this.f5878i.remove(remove)).mo6703h();
                }
                this.f5881l.clear();
                break;
            case 11:
                if (this.f5878i.containsKey(message.obj)) {
                    ((C2026a) this.f5878i.get(message.obj)).mo6702g();
                    break;
                }
                break;
            case 12:
                if (this.f5878i.containsKey(message.obj)) {
                    ((C2026a) this.f5878i.get(message.obj)).mo6707l();
                    break;
                }
                break;
            case 14:
                C2054s sVar = (C2054s) message.obj;
                C2014b a2 = sVar.mo6744a();
                if (!this.f5878i.containsKey(a2)) {
                    iVar = sVar.mo6745b();
                    bool = Boolean.valueOf(false);
                } else {
                    boolean a3 = ((C2026a) this.f5878i.get(a2)).m8458a(false);
                    iVar = sVar.mo6745b();
                    bool = Boolean.valueOf(a3);
                }
                iVar.mo13027a(bool);
                break;
            case 15:
                C2028c cVar = (C2028c) message.obj;
                if (this.f5878i.containsKey(cVar.f5902a)) {
                    ((C2026a) this.f5878i.get(cVar.f5902a)).m8456a(cVar);
                    break;
                }
                break;
            case 16:
                C2028c cVar2 = (C2028c) message.obj;
                if (this.f5878i.containsKey(cVar2.f5902a)) {
                    ((C2026a) this.f5878i.get(cVar2.f5902a)).m8461b(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w(str, sb3.toString());
                return false;
        }
        return true;
    }
}
