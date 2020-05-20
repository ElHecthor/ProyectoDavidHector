package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C0858c;
import com.bumptech.glide.load.C0870h;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.p007o.p008a0.C0916b;

/* renamed from: com.bumptech.glide.load.q.d.c */
public class C1129c implements C0876l<Bitmap> {

    /* renamed from: b */
    public static final C0870h<Integer> f3900b = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));

    /* renamed from: c */
    public static final C0870h<CompressFormat> f3901c = C0870h.m4572a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    private final C0916b f3902a;

    public C1129c(C0916b bVar) {
        this.f3902a = bVar;
    }

    /* renamed from: a */
    private CompressFormat m5392a(Bitmap bitmap, C0873i iVar) {
        CompressFormat compressFormat = (CompressFormat) iVar.mo4628a(f3901c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? CompressFormat.PNG : CompressFormat.JPEG;
    }

    /* renamed from: a */
    public C0858c mo4633a(C0873i iVar) {
        return C0858c.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:38|39)|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[SYNTHETIC, Splitter:B:38:0x00bc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4615a(com.bumptech.glide.load.p007o.C1020v<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C0873i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m5392a(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.p029t.p030l.C1320b.m6193a(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.p029t.C1305f.m6136a()     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.h<java.lang.Integer> r4 = f3900b     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r11.mo4628a(r4)     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c0 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c0 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0059 }
            com.bumptech.glide.load.o.a0.b r10 = r8.f3902a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            com.bumptech.glide.load.n.c r10 = new com.bumptech.glide.load.n.c     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            com.bumptech.glide.load.o.a0.b r6 = r8.f3902a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0059 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0069
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00ba
        L_0x0054:
            r10 = move-exception
            r6 = r7
            goto L_0x005a
        L_0x0057:
            r9 = move-exception
            goto L_0x00ba
        L_0x0059:
            r10 = move-exception
        L_0x005a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x0057 }
        L_0x0066:
            if (r6 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0069:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c0 }
            if (r10 == 0) goto L_0x00b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r10.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            int r1 = com.bumptech.glide.p029t.C1310k.m6159a(r9)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            double r1 = com.bumptech.glide.p029t.C1305f.m6135a(r2)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r1 = f3901c     // Catch:{ all -> 0x00c0 }
            java.lang.Object r11 = r11.mo4628a(r1)     // Catch:{ all -> 0x00c0 }
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c0 }
            r10.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c0 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c0 }
        L_0x00b6:
            com.bumptech.glide.p029t.p030l.C1320b.m6190a()
            return r5
        L_0x00ba:
            if (r6 == 0) goto L_0x00bf
            r6.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            com.bumptech.glide.p029t.p030l.C1320b.m6190a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1129c.mo4615a(com.bumptech.glide.load.o.v, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
