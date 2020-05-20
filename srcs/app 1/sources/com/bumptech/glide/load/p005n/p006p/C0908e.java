package com.bumptech.glide.load.p005n.p006p;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C0861f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.p.e */
class C0908e {

    /* renamed from: f */
    private static final C0902a f3437f = new C0902a();

    /* renamed from: a */
    private final C0902a f3438a;

    /* renamed from: b */
    private final C0907d f3439b;

    /* renamed from: c */
    private final C0916b f3440c;

    /* renamed from: d */
    private final ContentResolver f3441d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f3442e;

    C0908e(List<ImageHeaderParser> list, C0902a aVar, C0907d dVar, C0916b bVar, ContentResolver contentResolver) {
        this.f3438a = aVar;
        this.f3439b = dVar;
        this.f3440c = bVar;
        this.f3441d = contentResolver;
        this.f3442e = list;
    }

    C0908e(List<ImageHeaderParser> list, C0907d dVar, C0916b bVar, ContentResolver contentResolver) {
        this(list, f3437f, dVar, bVar, contentResolver);
    }

    /* renamed from: a */
    private boolean m4690a(File file) {
        return this.f3438a.mo4669a(file) && 0 < this.f3438a.mo4670b(file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m4691c(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.n.p.d r2 = r6.f3439b     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            android.database.Cursor r2 = r2.mo4671a(r7)     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            if (r2 == 0) goto L_0x001e
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001c }
            if (r3 == 0) goto L_0x001e
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001c }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r7
        L_0x001c:
            r3 = move-exception
            goto L_0x0028
        L_0x001e:
            if (r2 == 0) goto L_0x0023
            r2.close()
        L_0x0023:
            return r1
        L_0x0024:
            r7 = move-exception
            goto L_0x004b
        L_0x0026:
            r3 = move-exception
            r2 = r1
        L_0x0028:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            r4.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0049 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0049 }
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            return r1
        L_0x0049:
            r7 = move-exception
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p005n.p006p.C0908e.m4691c(android.net.Uri):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4672a(Uri uri) {
        String str = "ThumbStreamOpener";
        InputStream inputStream = null;
        try {
            inputStream = this.f3441d.openInputStream(uri);
            int a = C0861f.m4559a(this.f3442e, inputStream, this.f3440c);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException e) {
            inputStream = Log.isLoggable(str, 3);
            if (inputStream) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
                Log.d(str, sb.toString(), e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* renamed from: b */
    public InputStream mo4673b(Uri uri) {
        String c = m4691c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f3438a.mo4668a(c);
        if (!m4690a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f3441d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }
}
