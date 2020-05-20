package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3968d5;
import p147g.p156d.p157a.p167b.p173d.p180g.C3988e9;
import p147g.p156d.p157a.p167b.p173d.p180g.C4027h0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4175r0.C4176a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4194s0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4194s0.C4195a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4209t0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final class C2506x4 extends C2363k9 implements C2269d {

    /* renamed from: j */
    private static int f7068j = 65535;

    /* renamed from: k */
    private static int f7069k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f7070d = new C3162a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f7071e = new C3162a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f7072f = new C3162a();

    /* renamed from: g */
    private final Map<String, C4194s0> f7073g = new C3162a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f7074h = new C3162a();

    /* renamed from: i */
    private final Map<String, String> f7075i = new C3162a();

    C2506x4(C2399n9 n9Var) {
        super(n9Var);
    }

    /* renamed from: a */
    private final C4194s0 m10093a(String str, byte[] bArr) {
        String str2 = "Unable to merge remote config. appId";
        if (bArr == null) {
            return C4194s0.m17080y();
        }
        try {
            C4195a x = C4194s0.m17079x();
            C2445r9.m9770a(x, bArr);
            C4194s0 s0Var = (C4194s0) ((C4214t4) x.mo12346f());
            C2238a4 B = mo7098j().mo7810B();
            String str3 = "Parsed config. version, gmp_app_id";
            String str4 = null;
            Object valueOf = s0Var.mo12761a() ? Long.valueOf(s0Var.mo12763q()) : null;
            if (s0Var.mo12764r()) {
                str4 = s0Var.mo12765s();
            }
            B.mo7090a(str3, valueOf, str4);
            return s0Var;
        } catch (C3968d5 | RuntimeException e) {
            mo7098j().mo7818w().mo7090a(str2, C2516y3.m10125a(str), e);
            return C4194s0.m17080y();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m10094a(C4194s0 s0Var) {
        C3162a aVar = new C3162a();
        if (s0Var != null) {
            for (C4209t0 t0Var : s0Var.mo12766t()) {
                aVar.put(t0Var.mo12806a(), t0Var.mo12807q());
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m10095a(String str, C4195a aVar) {
        C3162a aVar2 = new C3162a();
        C3162a aVar3 = new C3162a();
        C3162a aVar4 = new C3162a();
        if (aVar != null) {
            for (int i = 0; i < aVar.mo12770a(); i++) {
                C4176a aVar5 = (C4176a) aVar.mo12771a(i).mo12813l();
                if (TextUtils.isEmpty(aVar5.mo12735a())) {
                    mo7098j().mo7818w().mo7088a("EventConfig contained null event name");
                } else {
                    String a = C2264c6.m9273a(aVar5.mo12735a());
                    if (!TextUtils.isEmpty(a)) {
                        aVar5.mo12734a(a);
                        aVar.mo12772a(i, aVar5);
                    }
                    aVar2.put(aVar5.mo12735a(), Boolean.valueOf(aVar5.mo12736p()));
                    aVar3.put(aVar5.mo12735a(), Boolean.valueOf(aVar5.mo12737q()));
                    if (aVar5.mo12738r()) {
                        if (aVar5.mo12739s() < f7069k || aVar5.mo12739s() > f7068j) {
                            mo7098j().mo7818w().mo7090a("Invalid sampling rate. Event name, sample rate", aVar5.mo12735a(), Integer.valueOf(aVar5.mo12739s()));
                        } else {
                            aVar4.put(aVar5.mo12735a(), Integer.valueOf(aVar5.mo12739s()));
                        }
                    }
                }
            }
        }
        this.f7071e.put(str, aVar2);
        this.f7072f.put(str, aVar3);
        this.f7074h.put(str, aVar4);
    }

    /* renamed from: i */
    private final void m10096i(String str) {
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        if (this.f7073g.get(str) == null) {
            byte[] d = mo7493o().mo7172d(str);
            if (d == null) {
                this.f7070d.put(str, null);
                this.f7071e.put(str, null);
                this.f7072f.put(str, null);
                this.f7073g.put(str, null);
                this.f7075i.put(str, null);
                this.f7074h.put(str, null);
                return;
            }
            C4195a aVar = (C4195a) m10093a(str, d).mo12813l();
            m10095a(str, aVar);
            this.f7070d.put(str, m10094a((C4194s0) ((C4214t4) aVar.mo12346f())));
            this.f7073g.put(str, (C4194s0) ((C4214t4) aVar.mo12346f()));
            this.f7075i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4194s0 mo7730a(String str) {
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        m10096i(str);
        return (C4194s0) this.f7073g.get(str);
    }

    /* renamed from: a */
    public final String mo7234a(String str, String str2) {
        mo7274c();
        m10096i(str);
        Map map = (Map) this.f7070d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7731a(String str, byte[] bArr, String str2) {
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        C4195a aVar = (C4195a) m10093a(str, bArr).mo12813l();
        if (aVar == null) {
            return false;
        }
        m10095a(str, aVar);
        this.f7073g.put(str, (C4194s0) ((C4214t4) aVar.mo12346f()));
        this.f7075i.put(str, str2);
        this.f7070d.put(str, m10094a((C4194s0) ((C4214t4) aVar.mo12346f())));
        mo7493o().mo7159a(str, (List<C4027h0>) new ArrayList<C4027h0>(aVar.mo12773p()));
        try {
            aVar.mo12774q();
            bArr = ((C4194s0) ((C4214t4) aVar.mo12346f())).mo12245g();
        } catch (RuntimeException e) {
            mo7098j().mo7818w().mo7090a("Unable to serialize reduced-size config. Storing full config instead. appId", C2516y3.m10125a(str), e);
        }
        C2257c o = mo7493o();
        C2148s.m8844b(str);
        o.mo7274c();
        o.mo7459r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) o.mo7183v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                o.mo7098j().mo7815t().mo7089a("Failed to update remote config (got 0). appId", C2516y3.m10125a(str));
            }
        } catch (SQLiteException e2) {
            o.mo7098j().mo7815t().mo7090a("Error storing remote config. appId", C2516y3.m10125a(str), e2);
        }
        this.f7073g.put(str, (C4194s0) ((C4214t4) aVar.mo12346f()));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7732b(String str) {
        mo7274c();
        return (String) this.f7075i.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo7733b(String str, String str2) {
        mo7274c();
        m10096i(str);
        if (mo7740g(str) && C2489v9.m10029f(str2)) {
            return true;
        }
        if (mo7741h(str) && C2489v9.m10028e(str2)) {
            return true;
        }
        Map map = (Map) this.f7071e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7734c(String str) {
        mo7274c();
        this.f7075i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo7735c(String str, String str2) {
        mo7274c();
        m10096i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (C3988e9.m16328b() && mo7827m().mo7108a(C2457t.f6883K0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = (Map) this.f7072f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo7736d(String str, String str2) {
        mo7274c();
        m10096i(str);
        Map map = (Map) this.f7074h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo7737d(String str) {
        mo7274c();
        this.f7073g.remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo7738e(String str) {
        mo7274c();
        C4194s0 a = mo7730a(str);
        if (a == null) {
            return false;
        }
        return a.mo12769w();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo7739f(String str) {
        String a = mo7234a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo7098j().mo7818w().mo7090a("Unable to parse timezone offset. appId", C2516y3.m10125a(str), e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo7740g(String str) {
        return "1".equals(mo7234a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo7741h(String str) {
        return "1".equals(mo7234a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo7181t() {
        return false;
    }
}
