package p071f.p097h.p105j;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p071f.p088e.C3168e;
import p071f.p088e.C3175g;
import p071f.p097h.p098e.p099c.C3240c;
import p071f.p097h.p098e.p099c.C3248f.C3249a;
import p071f.p097h.p100f.C3262g;
import p071f.p097h.p100f.C3272n;
import p071f.p097h.p105j.C3291c.C3296d;
import p071f.p097h.p107l.C3321h;

/* renamed from: f.h.j.b */
public class C3283b {

    /* renamed from: a */
    static final C3168e<String, Typeface> f9410a = new C3168e<>(16);

    /* renamed from: b */
    private static final C3291c f9411b = new C3291c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f9412c = new Object();

    /* renamed from: d */
    static final C3175g<String, ArrayList<C3296d<C3290g>>> f9413d = new C3175g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f9414e = new C3287d();

    /* renamed from: f.h.j.b$a */
    static class C3284a implements Callable<C3290g> {

        /* renamed from: f */
        final /* synthetic */ Context f9415f;

        /* renamed from: g */
        final /* synthetic */ C3282a f9416g;

        /* renamed from: h */
        final /* synthetic */ int f9417h;

        /* renamed from: i */
        final /* synthetic */ String f9418i;

        C3284a(Context context, C3282a aVar, int i, String str) {
            this.f9415f = context;
            this.f9416g = aVar;
            this.f9417h = i;
            this.f9418i = str;
        }

        public C3290g call() {
            C3290g a = C3283b.m13456a(this.f9415f, this.f9416g, this.f9417h);
            Typeface typeface = a.f9429a;
            if (typeface != null) {
                C3283b.f9410a.mo10199a(this.f9418i, typeface);
            }
            return a;
        }
    }

    /* renamed from: f.h.j.b$b */
    static class C3285b implements C3296d<C3290g> {

        /* renamed from: a */
        final /* synthetic */ C3249a f9419a;

        /* renamed from: b */
        final /* synthetic */ Handler f9420b;

        C3285b(C3249a aVar, Handler handler) {
            this.f9419a = aVar;
            this.f9420b = handler;
        }

        /* renamed from: a */
        public void mo10637a(C3290g gVar) {
            int i;
            C3249a aVar;
            if (gVar == null) {
                aVar = this.f9419a;
                i = 1;
            } else {
                i = gVar.f9430b;
                if (i == 0) {
                    this.f9419a.mo10601a(gVar.f9429a, this.f9420b);
                    return;
                }
                aVar = this.f9419a;
            }
            aVar.mo10600a(i, this.f9420b);
        }
    }

    /* renamed from: f.h.j.b$c */
    static class C3286c implements C3296d<C3290g> {

        /* renamed from: a */
        final /* synthetic */ String f9421a;

        C3286c(String str) {
            this.f9421a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p071f.p097h.p105j.C3291c.C3296d) r1.get(r0)).mo10637a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10637a(p071f.p097h.p105j.C3283b.C3290g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p071f.p097h.p105j.C3283b.f9412c
                monitor-enter(r0)
                f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r1 = p071f.p097h.p105j.C3283b.f9413d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f9421a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r2 = p071f.p097h.p105j.C3283b.f9413d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f9421a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                f.h.j.c$d r2 = (p071f.p097h.p105j.C3291c.C3296d) r2
                r2.mo10637a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p105j.C3283b.C3286c.mo10637a(f.h.j.b$g):void");
        }
    }

    /* renamed from: f.h.j.b$d */
    static class C3287d implements Comparator<byte[]> {
        C3287d() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: f.h.j.b$e */
    public static class C3288e {

        /* renamed from: a */
        private final int f9422a;

        /* renamed from: b */
        private final C3289f[] f9423b;

        public C3288e(int i, C3289f[] fVarArr) {
            this.f9422a = i;
            this.f9423b = fVarArr;
        }

        /* renamed from: a */
        public C3289f[] mo10641a() {
            return this.f9423b;
        }

        /* renamed from: b */
        public int mo10642b() {
            return this.f9422a;
        }
    }

    /* renamed from: f.h.j.b$f */
    public static class C3289f {

        /* renamed from: a */
        private final Uri f9424a;

        /* renamed from: b */
        private final int f9425b;

        /* renamed from: c */
        private final int f9426c;

        /* renamed from: d */
        private final boolean f9427d;

        /* renamed from: e */
        private final int f9428e;

        public C3289f(Uri uri, int i, int i2, boolean z, int i3) {
            C3321h.m13543a(uri);
            this.f9424a = uri;
            this.f9425b = i;
            this.f9426c = i2;
            this.f9427d = z;
            this.f9428e = i3;
        }

        /* renamed from: a */
        public int mo10643a() {
            return this.f9428e;
        }

        /* renamed from: b */
        public int mo10644b() {
            return this.f9425b;
        }

        /* renamed from: c */
        public Uri mo10645c() {
            return this.f9424a;
        }

        /* renamed from: d */
        public int mo10646d() {
            return this.f9426c;
        }

        /* renamed from: e */
        public boolean mo10647e() {
            return this.f9427d;
        }
    }

    /* renamed from: f.h.j.b$g */
    private static final class C3290g {

        /* renamed from: a */
        final Typeface f9429a;

        /* renamed from: b */
        final int f9430b;

        C3290g(Typeface typeface, int i) {
            this.f9429a = typeface;
            this.f9430b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m13453a(PackageManager packageManager, C3282a aVar, Resources resources) {
        String d = aVar.mo10631d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(d);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.mo10632e())) {
            List a = m13458a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f9414e);
            List a2 = m13457a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f9414e);
                if (m13460a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(d);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo10632e());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* JADX INFO: used method not loaded: f.h.j.c.a(java.util.concurrent.Callable, f.h.j.c$d):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        f9411b.mo10651a((java.util.concurrent.Callable) r1, (p071f.p097h.p105j.C3291c.C3296d) new p071f.p097h.p105j.C3283b.C3286c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m13454a(android.content.Context r2, p071f.p097h.p105j.C3282a r3, p071f.p097h.p098e.p099c.C3248f.C3249a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo10630c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            f.e.e<java.lang.String, android.graphics.Typeface> r1 = f9410a
            java.lang.Object r1 = r1.mo10203b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1817a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            f.h.j.b$g r2 = m13456a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f9430b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f9429a
            r4.mo10601a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo10600a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f9429a
            return r2
        L_0x0043:
            f.h.j.b$a r1 = new f.h.j.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            f.h.j.c r3 = f9411b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo10648a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            f.h.j.b$g r3 = (p071f.p097h.p105j.C3283b.C3290g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f9429a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            f.h.j.b$b r3 = new f.h.j.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f9412c
            monitor-enter(r4)
            f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r5 = f9413d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r3 = f9413d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            f.h.j.c r3 = f9411b
            f.h.j.b$c r4 = new f.h.j.b$c
            r4.<init>(r0)
            r3.mo10651a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p105j.C3283b.m13454a(android.content.Context, f.h.j.a, f.h.e.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C3288e m13455a(Context context, CancellationSignal cancellationSignal, C3282a aVar) {
        ProviderInfo a = m13453a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C3288e(1, null) : new C3288e(0, m13461a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C3290g m13456a(Context context, C3282a aVar, int i) {
        try {
            C3288e a = m13455a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo10642b() == 0) {
                Typeface a2 = C3262g.m13366a(context, null, a.mo10641a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C3290g(a2, i2);
            }
            if (a.mo10642b() == 1) {
                i2 = -2;
            }
            return new C3290g(null, i2);
        } catch (NameNotFoundException unused) {
            return new C3290g(null, -1);
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m13457a(C3282a aVar, Resources resources) {
        return aVar.mo10628a() != null ? aVar.mo10628a() : C3240c.m13295a(resources, aVar.mo10629b());
    }

    /* renamed from: a */
    private static List<byte[]> m13458a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m13459a(Context context, C3289f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C3289f fVar : fVarArr) {
            if (fVar.mo10643a() == 0) {
                Uri c = fVar.mo10645c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C3272n.m13430a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m13460a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static C3289f[] m13461a(Context context, C3282a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = "content";
        Uri build = new Builder().scheme(str3).authority(str2).build();
        Uri build2 = new Builder().scheme(str3).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor query = VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo10633f()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo10633f()}, null);
            if (query != null && query.getCount() > 0) {
                int columnIndex = query.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = query.getColumnIndex("_id");
                int columnIndex3 = query.getColumnIndex("file_id");
                int columnIndex4 = query.getColumnIndex("font_ttc_index");
                int columnIndex5 = query.getColumnIndex("font_weight");
                int columnIndex6 = query.getColumnIndex("font_italic");
                while (query.moveToNext()) {
                    int i = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                    C3289f fVar = new C3289f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3)), columnIndex4 != -1 ? query.getInt(columnIndex4) : 0, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i);
                    arrayList2.add(fVar);
                }
                arrayList = arrayList2;
            }
            if (query != null) {
                query.close();
            }
            return (C3289f[]) arrayList.toArray(new C3289f[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
