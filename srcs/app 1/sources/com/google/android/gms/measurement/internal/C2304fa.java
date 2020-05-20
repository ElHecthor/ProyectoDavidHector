package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a;

/* renamed from: com.google.android.gms.measurement.internal.fa */
final class C2304fa {

    /* renamed from: a */
    private C4289y0 f6453a;

    /* renamed from: b */
    private Long f6454b;

    /* renamed from: c */
    private long f6455c;

    /* renamed from: d */
    private final /* synthetic */ C2292ea f6456d;

    private C2304fa(C2292ea eaVar) {
        this.f6456d = eaVar;
    }

    /* synthetic */ C2304fa(C2292ea eaVar, C2280da daVar) {
        this(eaVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4289y0 mo7353a(String str, C4289y0 y0Var) {
        C2238a4 u;
        String str2;
        String str3 = str;
        C4289y0 y0Var2 = y0Var;
        String r = y0Var.mo12912r();
        List a = y0Var.mo12909a();
        String str4 = "_eid";
        Long l = (Long) this.f6456d.mo7492n().mo7605a(y0Var2, str4);
        boolean z = l != null;
        if (z && r.equals("_ep")) {
            r = (String) this.f6456d.mo7492n().mo7605a(y0Var2, "_en");
            if (TextUtils.isEmpty(r)) {
                this.f6456d.mo7098j().mo7816u().mo7089a("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.f6453a == null || this.f6454b == null || l.longValue() != this.f6454b.longValue()) {
                Pair a2 = this.f6456d.mo7493o().mo7148a(str3, l);
                if (a2 != null) {
                    Object obj = a2.first;
                    if (obj != null) {
                        this.f6453a = (C4289y0) obj;
                        this.f6455c = ((Long) a2.second).longValue();
                        this.f6454b = (Long) this.f6456d.mo7492n().mo7605a(this.f6453a, str4);
                    }
                }
                this.f6456d.mo7098j().mo7816u().mo7090a("Extra parameter without existing main event. eventName, eventId", r, l);
                return null;
            }
            long j = this.f6455c - 1;
            this.f6455c = j;
            if (j <= 0) {
                C2257c o = this.f6456d.mo7493o();
                o.mo7274c();
                o.mo7098j().mo7810B().mo7089a("Clearing complex main event info. appId", str3);
                try {
                    o.mo7183v().execSQL("delete from main_event_params where app_id=?", new String[]{str3});
                } catch (SQLiteException e) {
                    o.mo7098j().mo7815t().mo7089a("Error clearing complex main event", e);
                }
            } else {
                this.f6456d.mo7493o().mo7165a(str, l, this.f6455c, this.f6453a);
            }
            List arrayList = new ArrayList();
            for (C3909a1 a1Var : this.f6453a.mo12909a()) {
                this.f6456d.mo7492n();
                if (C2445r9.m9783b(y0Var2, a1Var.mo12057q()) == null) {
                    arrayList.add(a1Var);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(a);
                a = arrayList;
                C4290a aVar = (C4290a) y0Var.mo12813l();
                aVar.mo12926a(r);
                aVar.mo12931q();
                aVar.mo12925a((Iterable<? extends C3909a1>) a);
                return (C4289y0) ((C4214t4) aVar.mo12346f());
            }
            u = this.f6456d.mo7098j().mo7816u();
            str2 = "No unique parameters in main event. eventName";
        } else {
            if (z) {
                this.f6454b = l;
                this.f6453a = y0Var2;
                C2445r9 n = this.f6456d.mo7492n();
                Long valueOf = Long.valueOf(0);
                Object a3 = n.mo7605a(y0Var2, "_epc");
                if (a3 != null) {
                    valueOf = a3;
                }
                long longValue = valueOf.longValue();
                this.f6455c = longValue;
                if (longValue <= 0) {
                    u = this.f6456d.mo7098j().mo7816u();
                    str2 = "Complex event with zero extra param count. eventName";
                } else {
                    this.f6456d.mo7493o().mo7165a(str, l, this.f6455c, y0Var);
                }
            }
            C4290a aVar2 = (C4290a) y0Var.mo12813l();
            aVar2.mo12926a(r);
            aVar2.mo12931q();
            aVar2.mo12925a((Iterable<? extends C3909a1>) a);
            return (C4289y0) ((C4214t4) aVar2.mo12346f());
        }
        u.mo7089a(str2, r);
        C4290a aVar22 = (C4290a) y0Var.mo12813l();
        aVar22.mo12926a(r);
        aVar22.mo12931q();
        aVar22.mo12925a((Iterable<? extends C3909a1>) a);
        return (C4289y0) ((C4214t4) aVar22.mo12346f());
    }
}
