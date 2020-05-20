package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
final class C2358k4 implements Runnable {

    /* renamed from: f */
    private final URL f6582f;

    /* renamed from: g */
    private final byte[] f6583g;

    /* renamed from: h */
    private final C2334i4 f6584h;

    /* renamed from: i */
    private final String f6585i;

    /* renamed from: j */
    private final Map<String, String> f6586j;

    /* renamed from: k */
    private final /* synthetic */ C2310g4 f6587k;

    public C2358k4(C2310g4 g4Var, String str, URL url, byte[] bArr, Map<String, String> map, C2334i4 i4Var) {
        this.f6587k = g4Var;
        C2148s.m8844b(str);
        C2148s.m8834a(url);
        C2148s.m8834a(i4Var);
        this.f6582f = url;
        this.f6583g = bArr;
        this.f6584h = i4Var;
        this.f6585i = str;
        this.f6586j = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1 A[SYNTHETIC, Splitter:B:48:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c A[SYNTHETIC, Splitter:B:61:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.g4 r1 = r13.f6587k
            r1.mo7822b()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.g4 r3 = r13.f6587k     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.URL r4 = r13.f6582f     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.HttpURLConnection r3 = r3.mo7354a(r4)     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f6586j     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f6586j     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f6583g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.g4 r4 = r13.f6587k     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo7492n()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r5 = r13.f6583g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r4 = r4.mo7615c(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.g4 r5 = r13.f6587k     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7810B()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.mo7089a(r6, r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.connect()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r1 = r5
            goto L_0x00ce
        L_0x0082:
            r4 = move-exception
            r10 = r1
            r8 = r4
            r1 = r5
            goto L_0x0109
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            com.google.android.gms.measurement.internal.g4 r2 = r13.f6587k     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            byte[] r10 = com.google.android.gms.measurement.internal.C2310g4.m9419a(r3)     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            if (r3 == 0) goto L_0x009b
            r3.disconnect()
        L_0x009b:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f6587k
            com.google.android.gms.measurement.internal.z4 r0 = r0.mo7097i()
            com.google.android.gms.measurement.internal.h4 r1 = new com.google.android.gms.measurement.internal.h4
            java.lang.String r6 = r13.f6585i
            com.google.android.gms.measurement.internal.i4 r7 = r13.f6584h
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ad:
            r0.mo7841a(r1)
            return
        L_0x00b1:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x00cf
        L_0x00b6:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00c2
        L_0x00ba:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x00cf
        L_0x00bf:
            r4 = move-exception
            r10 = r1
            r7 = r8
        L_0x00c2:
            r8 = r4
            goto L_0x010a
        L_0x00c4:
            r4 = move-exception
            r10 = r1
            goto L_0x00cd
        L_0x00c7:
            r4 = move-exception
            r10 = r1
            goto L_0x0108
        L_0x00ca:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e9
        L_0x00d5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r4 = r13.f6587k
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()
            java.lang.String r5 = r13.f6585i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)
            r4.mo7090a(r0, r5, r1)
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.disconnect()
        L_0x00ee:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f6587k
            com.google.android.gms.measurement.internal.z4 r0 = r0.mo7097i()
            com.google.android.gms.measurement.internal.h4 r1 = new com.google.android.gms.measurement.internal.h4
            java.lang.String r5 = r13.f6585i
            com.google.android.gms.measurement.internal.i4 r6 = r13.f6584h
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo7841a(r1)
            throw r2
        L_0x0105:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x0108:
            r8 = r4
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r1 == 0) goto L_0x0124
            r1.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0124
        L_0x0110:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r2 = r13.f6587k
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()
            java.lang.String r4 = r13.f6585i
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r4)
            r2.mo7090a(r0, r4, r1)
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r3.disconnect()
        L_0x0129:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f6587k
            com.google.android.gms.measurement.internal.z4 r0 = r0.mo7097i()
            com.google.android.gms.measurement.internal.h4 r1 = new com.google.android.gms.measurement.internal.h4
            java.lang.String r5 = r13.f6585i
            com.google.android.gms.measurement.internal.i4 r6 = r13.f6584h
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2358k4.run():void");
    }
}