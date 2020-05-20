package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
final class C2361k7 implements Runnable {

    /* renamed from: f */
    private final URL f6592f;

    /* renamed from: g */
    private final C2325h7 f6593g;

    /* renamed from: h */
    private final String f6594h;

    /* renamed from: i */
    private final Map<String, String> f6595i = null;

    /* renamed from: j */
    private final /* synthetic */ C2337i7 f6596j;

    public C2361k7(C2337i7 i7Var, String str, URL url, byte[] bArr, Map<String, String> map, C2325h7 h7Var) {
        this.f6596j = i7Var;
        C2148s.m8844b(str);
        C2148s.m8834a(url);
        C2148s.m8834a(h7Var);
        this.f6592f = url;
        this.f6593g = h7Var;
        this.f6594h = str;
    }

    /* renamed from: b */
    private final void m9559b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        C2528z4 i2 = this.f6596j.mo7097i();
        C2349j7 j7Var = new C2349j7(this, i, exc, bArr, map);
        i2.mo7841a((Runnable) j7Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo7455a(int i, Exception exc, byte[] bArr, Map map) {
        this.f6593g.mo7356a(this.f6594h, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.i7 r0 = r7.f6596j
            r0.mo7822b()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.i7 r2 = r7.f6596j     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.URL r3 = r7.f6592f     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.HttpURLConnection r2 = r2.mo7396a(r3)     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f6595i     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f6595i     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            com.google.android.gms.measurement.internal.i7 r4 = r7.f6596j     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.C2337i7.m9472a(r2)     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r7.m9559b(r1, r0, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x0063
        L_0x0055:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x006f
        L_0x005a:
            r3 = move-exception
            r4 = r0
            goto L_0x0063
        L_0x005d:
            r3 = move-exception
            r4 = r0
            goto L_0x006f
        L_0x0060:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.disconnect()
        L_0x0068:
            r7.m9559b(r1, r0, r0, r4)
            throw r3
        L_0x006c:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()
        L_0x0074:
            r7.m9559b(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2361k7.run():void");
    }
}
