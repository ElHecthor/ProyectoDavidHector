package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.Context;
import android.os.Bundle;

/* renamed from: g.d.a.b.d.g.g */
final class C4010g extends C3958a {

    /* renamed from: j */
    private final /* synthetic */ String f10966j;

    /* renamed from: k */
    private final /* synthetic */ String f10967k;

    /* renamed from: l */
    private final /* synthetic */ Context f10968l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f10969m;

    /* renamed from: n */
    private final /* synthetic */ C3957d f10970n;

    C4010g(C3957d dVar, String str, String str2, Context context, Bundle bundle) {
        this.f10970n = dVar;
        this.f10966j = str;
        this.f10967k = str2;
        this.f10968l = context;
        this.f10969m = bundle;
        super(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x00a0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12054a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            g.d.a.b.d.g.d r2 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r3.<init>()     // Catch:{ Exception -> 0x00a0 }
            r2.f10890d = r3     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.d r2 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = r14.f10966j     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r14.f10967k     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3957d.m16156c(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f10967k     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r14.f10966j     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.d r4 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r4.f10887a     // Catch:{ Exception -> 0x00a0 }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f10968l     // Catch:{ Exception -> 0x00a0 }
            p147g.p156d.p157a.p167b.p173d.p180g.C3957d.m16165i(r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Boolean r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3957d.f10881j     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00a0 }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            g.d.a.b.d.g.d r3 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.d r4 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r5 = r14.f10968l     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.yc r4 = r4.mo12292a(r5, r2)     // Catch:{ Exception -> 0x00a0 }
            r3.f10893g = r4     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.d r3 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.yc r3 = r3.f10893g     // Catch:{ Exception -> 0x00a0 }
            if (r3 != 0) goto L_0x0060
            g.d.a.b.d.g.d r2 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.f10887a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x0060:
            android.content.Context r3 = r14.f10968l     // Catch:{ Exception -> 0x00a0 }
            int r3 = p147g.p156d.p157a.p167b.p173d.p180g.C3957d.m16164h(r3)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r4 = r14.f10968l     // Catch:{ Exception -> 0x00a0 }
            int r4 = p147g.p156d.p157a.p167b.p173d.p180g.C3957d.m16162g(r4)     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            if (r4 >= r3) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0083
        L_0x0079:
            if (r3 <= 0) goto L_0x007c
            r4 = r3
        L_0x007c:
            if (r3 <= 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r8 = r2
            r2 = r4
        L_0x0083:
            g.d.a.b.d.g.b r13 = new g.d.a.b.d.g.b     // Catch:{ Exception -> 0x00a0 }
            r4 = 27000(0x6978, double:1.334E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00a0 }
            android.os.Bundle r12 = r14.f10969m     // Catch:{ Exception -> 0x00a0 }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.d r2 = r14.f10970n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.d.g.yc r2 = r2.f10893g     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r3 = r14.f10968l     // Catch:{ Exception -> 0x00a0 }
            g.d.a.b.c.a r3 = p147g.p156d.p157a.p167b.p172c.C3854b.m15592a(r3)     // Catch:{ Exception -> 0x00a0 }
            long r4 = r14.f10894f     // Catch:{ Exception -> 0x00a0 }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            r2 = move-exception
            g.d.a.b.d.g.d r3 = r14.f10970n
            r3.m16146a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4010g.mo12054a():void");
    }
}
