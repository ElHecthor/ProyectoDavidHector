package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C6119h {

    /* renamed from: a */
    public static final C6119h f15214a = new C6119h();

    private C6119h() {
    }

    /* renamed from: a */
    private final <S> S m22977a(String str, ClassLoader classLoader, Class<S> cls) {
        Class cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected service of class ");
        sb.append(cls);
        sb.append(", but found ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    private final List<String> m22978a(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C5845t.m22184d((Iterable<? extends T>) linkedHashSet);
            }
            String b = C5788q.m22019b(readLine, "#", (String) null, 2, (Object) null);
            if (b != null) {
                String obj = C5788q.m22032f(b).toString();
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= obj.length()) {
                        z = true;
                        break;
                    }
                    char charAt = obj.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (obj.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Illegal service provider class name: ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p308k.p322y.C5904a.m22293a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        p308k.C5727b.m21843a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        p308k.p322y.C5904a.m22293a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m22979a(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "url.toString()"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            r1 = 0
            r2 = 2
            r3 = 0
            java.lang.String r4 = "jar"
            boolean r4 = p308k.p313e0.C5787p.m21980b(r0, r4, r1, r2, r3)
            if (r4 == 0) goto L_0x0062
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = p308k.p313e0.C5788q.m21994a(r0, r6, r3, r2, r3)
            r4 = 33
            java.lang.String r6 = p308k.p313e0.C5788q.m22016b(r6, r4, r3, r2, r3)
            java.lang.String r4 = "!/"
            java.lang.String r0 = p308k.p313e0.C5788q.m21994a(r0, r4, r3, r2, r3)
            java.util.jar.JarFile r2 = new java.util.jar.JarFile
            r2.<init>(r6, r1)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0056 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0056 }
            r4.<init>(r0)     // Catch:{ all -> 0x0056 }
            java.io.InputStream r0 = r2.getInputStream(r4)     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            kotlinx.coroutines.internal.h r0 = f15214a     // Catch:{ all -> 0x004f }
            java.util.List r0 = r0.m22978a(r6)     // Catch:{ all -> 0x004f }
            p308k.p322y.C5904a.m22293a(r6, r3)     // Catch:{ all -> 0x0056 }
            r2.close()     // Catch:{ all -> 0x004d }
            return r0
        L_0x004d:
            r6 = move-exception
            throw r6
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            p308k.p322y.C5904a.m22293a(r6, r0)     // Catch:{ all -> 0x0056 }
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005d }
            throw r0
        L_0x005d:
            r0 = move-exception
            p308k.C5727b.m21843a(r6, r0)
            throw r6
        L_0x0062:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.h r6 = f15214a     // Catch:{ all -> 0x007a }
            java.util.List r6 = r6.m22978a(r0)     // Catch:{ all -> 0x007a }
            p308k.p322y.C5904a.m22293a(r0, r3)
            return r6
        L_0x007a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            p308k.p322y.C5904a.m22293a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6119h.m22979a(java.net.URL):java.util.List");
    }

    /* renamed from: a */
    public final <S> List<S> mo15890a(Class<S> cls, ClassLoader classLoader) {
        C5942k.m22327b(cls, "service");
        C5942k.m22327b(classLoader, "loader");
        try {
            return mo15891b(cls, classLoader);
        } catch (Throwable unused) {
            ServiceLoader load = ServiceLoader.load(cls, classLoader);
            C5942k.m22324a((Object) load, "ServiceLoader.load(service, loader)");
            return C5845t.m22184d((Iterable<? extends T>) load);
        }
    }

    /* renamed from: b */
    public final <S> List<S> mo15891b(Class<S> cls, ClassLoader classLoader) {
        C5942k.m22327b(cls, "service");
        C5942k.m22327b(classLoader, "loader");
        StringBuilder sb = new StringBuilder();
        sb.append("META-INF/services/");
        sb.append(cls.getName());
        Enumeration resources = classLoader.getResources(sb.toString());
        C5942k.m22324a((Object) resources, "urls");
        ArrayList<URL> list = Collections.list(resources);
        C5942k.m22324a((Object) list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C6119h hVar = f15214a;
            C5942k.m22324a((Object) url, "it");
            C5842q.m22169a((Collection<? super T>) arrayList, (Iterable<? extends T>) hVar.m22979a(url));
        }
        Set<String> f = C5845t.m22188f((Iterable<? extends T>) arrayList);
        if (!f.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C5838m.m22166a(f, 10));
            for (String a : f) {
                arrayList2.add(f15214a.m22977a(a, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
