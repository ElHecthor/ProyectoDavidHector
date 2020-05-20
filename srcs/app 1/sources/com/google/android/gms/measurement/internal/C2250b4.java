package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
final class C2250b4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f6273f;

    /* renamed from: g */
    private final /* synthetic */ String f6274g;

    /* renamed from: h */
    private final /* synthetic */ Object f6275h;

    /* renamed from: i */
    private final /* synthetic */ Object f6276i;

    /* renamed from: j */
    private final /* synthetic */ Object f6277j;

    /* renamed from: k */
    private final /* synthetic */ C2516y3 f6278k;

    C2250b4(C2516y3 y3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f6278k = y3Var;
        this.f6273f = i;
        this.f6274g = str;
        this.f6275h = obj;
        this.f6276i = obj2;
        this.f6277j = obj3;
    }

    public final void run() {
        char c;
        C2516y3 y3Var;
        C2370l4 p = this.f6278k.f7100a.mo7212p();
        if (p.mo7745s()) {
            if (this.f6278k.f7088c == 0) {
                if (this.f6278k.mo7827m().mo7123p()) {
                    y3Var = this.f6278k;
                    y3Var.mo7094f();
                    c = 'C';
                } else {
                    y3Var = this.f6278k;
                    y3Var.mo7094f();
                    c = 'c';
                }
                y3Var.f7088c = c;
            }
            if (this.f6278k.f7089d < 0) {
                C2516y3 y3Var2 = this.f6278k;
                y3Var2.f7089d = y3Var2.mo7827m().mo7122o();
            }
            char charAt = "01VDIWEA?".charAt(this.f6273f);
            char a = this.f6278k.f7088c;
            long b = this.f6278k.f7089d;
            String a2 = C2516y3.m10127a(true, this.f6274g, this.f6275h, this.f6276i, this.f6277j);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a);
            sb.append(b);
            sb.append(":");
            sb.append(a2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f6274g.substring(0, 1024);
            }
            p.f6621d.mo7618a(sb2, 1);
            return;
        }
        this.f6278k.mo7812a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
