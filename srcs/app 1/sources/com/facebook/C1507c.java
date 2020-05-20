package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.C1499a.C1501b;
import com.facebook.C1797q.C1802e;
import com.facebook.C1809s.C1810a;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p071f.p129q.p130a.C3476a;

/* renamed from: com.facebook.c */
public final class C1507c {

    /* renamed from: f */
    private static volatile C1507c f4721f;

    /* renamed from: a */
    private final C3476a f4722a;

    /* renamed from: b */
    private final C1503b f4723b;

    /* renamed from: c */
    private C1499a f4724c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AtomicBoolean f4725d = new AtomicBoolean(false);

    /* renamed from: e */
    private Date f4726e = new Date(0);

    /* renamed from: com.facebook.c$a */
    class C1508a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1501b f4727f;

        C1508a(C1501b bVar) {
            this.f4727f = bVar;
        }

        public void run() {
            C1507c.this.m6801b(this.f4727f);
        }
    }

    /* renamed from: com.facebook.c$b */
    class C1509b implements C1802e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f4729a;

        /* renamed from: b */
        final /* synthetic */ Set f4730b;

        /* renamed from: c */
        final /* synthetic */ Set f4731c;

        /* renamed from: d */
        final /* synthetic */ Set f4732d;

        C1509b(C1507c cVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f4729a = atomicBoolean;
            this.f4730b = set;
            this.f4731c = set2;
            this.f4732d = set3;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            Set set;
            JSONObject b = tVar.mo6291b();
            if (b != null) {
                JSONArray optJSONArray = b.optJSONArray("data");
                if (optJSONArray != null) {
                    this.f4729a.set(true);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString("status");
                            if (!C1698v.m7401c(optString) && !C1698v.m7401c(optString2)) {
                                String lowerCase = optString2.toLowerCase(Locale.US);
                                if (lowerCase.equals("granted")) {
                                    set = this.f4730b;
                                } else if (lowerCase.equals("declined")) {
                                    set = this.f4731c;
                                } else if (lowerCase.equals("expired")) {
                                    set = this.f4732d;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unexpected status: ");
                                    sb.append(lowerCase);
                                    Log.w("AccessTokenManager", sb.toString());
                                }
                                set.add(optString);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.c$c */
    class C1510c implements C1802e {

        /* renamed from: a */
        final /* synthetic */ C1512e f4733a;

        C1510c(C1507c cVar, C1512e eVar) {
            this.f4733a = eVar;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            JSONObject b = tVar.mo6291b();
            if (b != null) {
                this.f4733a.f4742a = b.optString("access_token");
                this.f4733a.f4743b = b.optInt("expires_at");
                this.f4733a.f4744c = Long.valueOf(b.optLong("data_access_expiration_time"));
            }
        }
    }

    /* renamed from: com.facebook.c$d */
    class C1511d implements C1810a {

        /* renamed from: a */
        final /* synthetic */ C1499a f4734a;

        /* renamed from: b */
        final /* synthetic */ C1501b f4735b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f4736c;

        /* renamed from: d */
        final /* synthetic */ C1512e f4737d;

        /* renamed from: e */
        final /* synthetic */ Set f4738e;

        /* renamed from: f */
        final /* synthetic */ Set f4739f;

        /* renamed from: g */
        final /* synthetic */ Set f4740g;

        C1511d(C1499a aVar, C1501b bVar, AtomicBoolean atomicBoolean, C1512e eVar, Set set, Set set2, Set set3) {
            this.f4734a = aVar;
            this.f4735b = bVar;
            this.f4736c = atomicBoolean;
            this.f4737d = eVar;
            this.f4738e = set;
            this.f4739f = set2;
            this.f4740g = set3;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0053=Splitter:B:18:0x0053, B:52:0x010d=Splitter:B:52:0x010d} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5726a(com.facebook.C1809s r19) {
            /*
                r18 = this;
                r1 = r18
                r2 = 0
                com.facebook.c r0 = com.facebook.C1507c.m6802e()     // Catch:{ all -> 0x0129 }
                com.facebook.a r0 = r0.mo5722c()     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x010d
                com.facebook.c r0 = com.facebook.C1507c.m6802e()     // Catch:{ all -> 0x0129 }
                com.facebook.a r0 = r0.mo5722c()     // Catch:{ all -> 0x0129 }
                java.lang.String r0 = r0.mo5693j()     // Catch:{ all -> 0x0129 }
                com.facebook.a r4 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.lang.String r4 = r4.mo5693j()     // Catch:{ all -> 0x0129 }
                if (r0 == r4) goto L_0x0023
                goto L_0x010d
            L_0x0023:
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f4736c     // Catch:{ all -> 0x0129 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0129 }
                if (r0 != 0) goto L_0x0053
                com.facebook.c$e r0 = r1.f4737d     // Catch:{ all -> 0x0129 }
                java.lang.String r0 = r0.f4742a     // Catch:{ all -> 0x0129 }
                if (r0 != 0) goto L_0x0053
                com.facebook.c$e r0 = r1.f4737d     // Catch:{ all -> 0x0129 }
                int r0 = r0.f4743b     // Catch:{ all -> 0x0129 }
                if (r0 != 0) goto L_0x0053
                com.facebook.a$b r0 = r1.f4735b     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x0047
                com.facebook.a$b r0 = r1.f4735b     // Catch:{ all -> 0x0129 }
                com.facebook.i r4 = new com.facebook.i     // Catch:{ all -> 0x0129 }
                java.lang.String r5 = "Failed to refresh access token"
                r4.<init>(r5)     // Catch:{ all -> 0x0129 }
                r0.mo5701a(r4)     // Catch:{ all -> 0x0129 }
            L_0x0047:
                com.facebook.c r0 = com.facebook.C1507c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4725d
                r0.set(r2)
                com.facebook.a$b r0 = r1.f4735b
                return
            L_0x0053:
                com.facebook.a r15 = new com.facebook.a     // Catch:{ all -> 0x0129 }
                com.facebook.c$e r0 = r1.f4737d     // Catch:{ all -> 0x0129 }
                java.lang.String r0 = r0.f4742a     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x0060
                com.facebook.c$e r0 = r1.f4737d     // Catch:{ all -> 0x0129 }
                java.lang.String r0 = r0.f4742a     // Catch:{ all -> 0x0129 }
                goto L_0x0066
            L_0x0060:
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.lang.String r0 = r0.mo5692i()     // Catch:{ all -> 0x0129 }
            L_0x0066:
                r5 = r0
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.lang.String r6 = r0.mo5681a()     // Catch:{ all -> 0x0129 }
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.lang.String r7 = r0.mo5693j()     // Catch:{ all -> 0x0129 }
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f4736c     // Catch:{ all -> 0x0129 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x007e
                java.util.Set r0 = r1.f4738e     // Catch:{ all -> 0x0129 }
                goto L_0x0084
            L_0x007e:
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.util.Set r0 = r0.mo5689g()     // Catch:{ all -> 0x0129 }
            L_0x0084:
                r8 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f4736c     // Catch:{ all -> 0x0129 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x0090
                java.util.Set r0 = r1.f4739f     // Catch:{ all -> 0x0129 }
                goto L_0x0096
            L_0x0090:
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.util.Set r0 = r0.mo5683c()     // Catch:{ all -> 0x0129 }
            L_0x0096:
                r9 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f4736c     // Catch:{ all -> 0x0129 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x00a2
                java.util.Set r0 = r1.f4740g     // Catch:{ all -> 0x0129 }
                goto L_0x00a8
            L_0x00a2:
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.util.Set r0 = r0.mo5684d()     // Catch:{ all -> 0x0129 }
            L_0x00a8:
                r10 = r0
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                com.facebook.d r11 = r0.mo5690h()     // Catch:{ all -> 0x0129 }
                com.facebook.c$e r0 = r1.f4737d     // Catch:{ all -> 0x0129 }
                int r0 = r0.f4743b     // Catch:{ all -> 0x0129 }
                r12 = 1000(0x3e8, double:4.94E-321)
                if (r0 == 0) goto L_0x00c4
                java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x0129 }
                com.facebook.c$e r4 = r1.f4737d     // Catch:{ all -> 0x0129 }
                int r4 = r4.f4743b     // Catch:{ all -> 0x0129 }
                long r3 = (long) r4     // Catch:{ all -> 0x0129 }
                long r3 = r3 * r12
                r0.<init>(r3)     // Catch:{ all -> 0x0129 }
                goto L_0x00ca
            L_0x00c4:
                com.facebook.a r0 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.util.Date r0 = r0.mo5686e()     // Catch:{ all -> 0x0129 }
            L_0x00ca:
                java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0129 }
                r3.<init>()     // Catch:{ all -> 0x0129 }
                com.facebook.c$e r4 = r1.f4737d     // Catch:{ all -> 0x0129 }
                java.lang.Long r4 = r4.f4744c     // Catch:{ all -> 0x0129 }
                if (r4 == 0) goto L_0x00e5
                java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0129 }
                com.facebook.c$e r14 = r1.f4737d     // Catch:{ all -> 0x0129 }
                java.lang.Long r14 = r14.f4744c     // Catch:{ all -> 0x0129 }
                long r16 = r14.longValue()     // Catch:{ all -> 0x0129 }
                long r12 = r12 * r16
                r4.<init>(r12)     // Catch:{ all -> 0x0129 }
                goto L_0x00eb
            L_0x00e5:
                com.facebook.a r4 = r1.f4734a     // Catch:{ all -> 0x0129 }
                java.util.Date r4 = r4.mo5682b()     // Catch:{ all -> 0x0129 }
            L_0x00eb:
                r14 = r4
                r4 = r15
                r12 = r0
                r13 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0129 }
                com.facebook.c r0 = com.facebook.C1507c.m6802e()     // Catch:{ all -> 0x010a }
                r0.mo5720a(r15)     // Catch:{ all -> 0x010a }
                com.facebook.c r0 = com.facebook.C1507c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4725d
                r0.set(r2)
                com.facebook.a$b r0 = r1.f4735b
                if (r0 == 0) goto L_0x0109
                r0.mo5700a(r15)
            L_0x0109:
                return
            L_0x010a:
                r0 = move-exception
                r3 = r15
                goto L_0x012b
            L_0x010d:
                com.facebook.a$b r0 = r1.f4735b     // Catch:{ all -> 0x0129 }
                if (r0 == 0) goto L_0x011d
                com.facebook.a$b r0 = r1.f4735b     // Catch:{ all -> 0x0129 }
                com.facebook.i r3 = new com.facebook.i     // Catch:{ all -> 0x0129 }
                java.lang.String r4 = "No current access token to refresh"
                r3.<init>(r4)     // Catch:{ all -> 0x0129 }
                r0.mo5701a(r3)     // Catch:{ all -> 0x0129 }
            L_0x011d:
                com.facebook.c r0 = com.facebook.C1507c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4725d
                r0.set(r2)
                com.facebook.a$b r0 = r1.f4735b
                return
            L_0x0129:
                r0 = move-exception
                r3 = 0
            L_0x012b:
                com.facebook.c r4 = com.facebook.C1507c.this
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f4725d
                r4.set(r2)
                com.facebook.a$b r2 = r1.f4735b
                if (r2 == 0) goto L_0x013d
                if (r3 == 0) goto L_0x013d
                r2.mo5700a(r3)
            L_0x013d:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1507c.C1511d.mo5726a(com.facebook.s):void");
        }
    }

    /* renamed from: com.facebook.c$e */
    private static class C1512e {

        /* renamed from: a */
        public String f4742a;

        /* renamed from: b */
        public int f4743b;

        /* renamed from: c */
        public Long f4744c;

        private C1512e() {
        }

        /* synthetic */ C1512e(C1508a aVar) {
            this();
        }
    }

    C1507c(C3476a aVar, C1503b bVar) {
        C1703w.m7423a((Object) aVar, "localBroadcastManager");
        C1703w.m7423a((Object) bVar, "accessTokenCache");
        this.f4722a = aVar;
        this.f4723b = bVar;
    }

    /* renamed from: a */
    private static C1797q m6795a(C1499a aVar, C1802e eVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        C1499a aVar2 = aVar;
        C1797q qVar = new C1797q(aVar2, "oauth/access_token", bundle, C1843u.GET, eVar);
        return qVar;
    }

    /* renamed from: a */
    private void m6797a(C1499a aVar, C1499a aVar2) {
        Intent intent = new Intent(C1787m.m7744e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f4722a.mo11088a(intent);
    }

    /* renamed from: a */
    private void m6798a(C1499a aVar, boolean z) {
        C1499a aVar2 = this.f4724c;
        this.f4724c = aVar;
        this.f4725d.set(false);
        this.f4726e = new Date(0);
        if (z) {
            C1503b bVar = this.f4723b;
            if (aVar != null) {
                bVar.mo5710a(aVar);
            } else {
                bVar.mo5709a();
                C1698v.m7373a(C1787m.m7744e());
            }
        }
        if (!C1698v.m7388a(aVar2, aVar)) {
            m6797a(aVar2, aVar);
            m6803f();
        }
    }

    /* renamed from: b */
    private static C1797q m6800b(C1499a aVar, C1802e eVar) {
        C1499a aVar2 = aVar;
        C1797q qVar = new C1797q(aVar2, "me/permissions", new Bundle(), C1843u.GET, eVar);
        return qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6801b(C1501b bVar) {
        C1501b bVar2 = bVar;
        C1499a aVar = this.f4724c;
        if (aVar == null) {
            if (bVar2 != null) {
                bVar2.mo5701a(new C1631i("No current access token to refresh"));
            }
        } else if (!this.f4725d.compareAndSet(false, true)) {
            if (bVar2 != null) {
                bVar2.mo5701a(new C1631i("Refresh already in progress"));
            }
        } else {
            this.f4726e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C1512e eVar = new C1512e(null);
            C1509b bVar3 = r0;
            HashSet hashSet4 = hashSet2;
            C1509b bVar4 = new C1509b(this, atomicBoolean, hashSet, hashSet2, hashSet3);
            C1809s sVar = new C1809s(m6800b(aVar, bVar3), m6795a(aVar, (C1802e) new C1510c(this, eVar)));
            C1511d dVar = new C1511d(aVar, bVar, atomicBoolean, eVar, hashSet, hashSet4, hashSet3);
            sVar.mo6216a((C1810a) dVar);
            sVar.mo6224e();
        }
    }

    /* renamed from: e */
    static C1507c m6802e() {
        if (f4721f == null) {
            synchronized (C1507c.class) {
                if (f4721f == null) {
                    f4721f = new C1507c(C3476a.m14249a(C1787m.m7744e()), new C1503b());
                }
            }
        }
        return f4721f;
    }

    /* renamed from: f */
    private void m6803f() {
        Context e = C1787m.m7744e();
        C1499a r = C1499a.m6759r();
        AlarmManager alarmManager = (AlarmManager) e.getSystemService("alarm");
        if (C1499a.m6760s() && r.mo5686e() != null && alarmManager != null) {
            Intent intent = new Intent(e, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, r.mo5686e().getTime(), PendingIntent.getBroadcast(e, 0, intent, 0));
        }
    }

    /* renamed from: g */
    private boolean m6804g() {
        boolean z = false;
        if (this.f4724c == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.f4724c.mo5690h().mo5727f() && valueOf.longValue() - this.f4726e.getTime() > 3600000 && valueOf.longValue() - this.f4724c.mo5688f().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5718a() {
        C1499a aVar = this.f4724c;
        m6797a(aVar, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5719a(C1501b bVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m6801b(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C1508a(bVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5720a(C1499a aVar) {
        m6798a(aVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5721b() {
        if (m6804g()) {
            mo5719a((C1501b) null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1499a mo5722c() {
        return this.f4724c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5723d() {
        C1499a b = this.f4723b.mo5711b();
        if (b == null) {
            return false;
        }
        m6798a(b, false);
        return true;
    }
}
