package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f16228e = {(byte) 42};

    /* renamed from: f */
    private static final List<String> f16229f = C5836k.m22153a("*");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final PublicSuffixDatabase f16230g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C6573a f16231h = new C6573a(null);

    /* renamed from: a */
    private final AtomicBoolean f16232a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f16233b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f16234c;

    /* renamed from: d */
    private byte[] f16235d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C6573a {
        private C6573a() {
        }

        public /* synthetic */ C6573a(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final String m24862a(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int a;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = C6250b.m23430a(bArr4[i9][i10], 255);
                    }
                    a = i3 - C6250b.m23430a(bArr3[i6 + i11], 255);
                    if (a == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (a >= 0) {
                    if (a <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        for (int i13 = i9 + 1; i13 < bArr4.length; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C5942k.m22324a((Object) charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        /* renamed from: a */
        public final PublicSuffixDatabase mo17037a() {
            return PublicSuffixDatabase.f16230g;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r4 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r1 != null) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m24856a(java.util.List<java.lang.String> r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f16232a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f16232a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.m24859c()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f16233b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f16234c
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0121
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L_0x0035:
            if (r5 >= r1) goto L_0x005e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            p308k.p323z.p325d.C5942k.m22324a(r8, r9)
            if (r7 == 0) goto L_0x0056
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            p308k.p323z.p325d.C5942k.m22324a(r7, r8)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0056:
            k.q r1 = new k.q
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            r5 = 0
        L_0x005f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0078
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f16231h
            byte[] r9 = r0.f16234c
            if (r9 == 0) goto L_0x0074
            java.lang.String r8 = r8.m24862a(r9, r4, r5)
            if (r8 == 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0074:
            p308k.p323z.p325d.C5942k.m22329c(r6)
            throw r7
        L_0x0078:
            r8 = r7
        L_0x0079:
            if (r1 <= r3) goto L_0x009f
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = 0
        L_0x0084:
            if (r10 >= r9) goto L_0x009f
            byte[] r11 = f16228e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f16231h
            byte[] r12 = r0.f16234c
            if (r12 == 0) goto L_0x009b
            java.lang.String r11 = r11.m24862a(r12, r5, r10)
            if (r11 == 0) goto L_0x0098
            r5 = r11
            goto L_0x00a0
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x0084
        L_0x009b:
            p308k.p323z.p325d.C5942k.m22329c(r6)
            throw r7
        L_0x009f:
            r5 = r7
        L_0x00a0:
            if (r5 == 0) goto L_0x00bd
            int r1 = r1 - r3
            r6 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00bd
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f16231h
            byte[] r10 = r0.f16235d
            if (r10 == 0) goto L_0x00b7
            java.lang.String r9 = r9.m24862a(r10, r4, r6)
            if (r9 == 0) goto L_0x00b4
            r7 = r9
            goto L_0x00bd
        L_0x00b4:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r1 = "publicSuffixExceptionListBytes"
            p308k.p323z.p325d.C5942k.m22329c(r1)
            throw r7
        L_0x00bd:
            r1 = 46
            if (r7 == 0) goto L_0x00df
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r1 = p308k.p313e0.C5788q.m21997a(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00df:
            if (r8 != 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00e6
            java.util.List<java.lang.String> r1 = f16229f
            return r1
        L_0x00e6:
            if (r8 == 0) goto L_0x00f9
            char[] r7 = new char[r3]
            r7[r2] = r1
            r4 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = p308k.p313e0.C5788q.m21997a(r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x00f9
            goto L_0x00fd
        L_0x00f9:
            java.util.List r4 = p308k.p314u.C5837l.m22159a()
        L_0x00fd:
            if (r5 == 0) goto L_0x0110
            char[] r12 = new char[r3]
            r12[r2] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r5
            java.util.List r1 = p308k.p313e0.C5788q.m21997a(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            java.util.List r1 = p308k.p314u.C5837l.m22159a()
        L_0x0114:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r4 = r1
        L_0x0120:
            return r4
        L_0x0121:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24856a(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        p308k.p322y.C5904a.m22293a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24858b() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0054
            n.l r1 = new n.l
            n.y r0 = p350n.C6493o.m24625a(r0)
            r1.<init>(r0)
            n.g r0 = p350n.C6493o.m24623a(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r1 = (long) r1     // Catch:{ all -> 0x004d }
            byte[] r1 = r0.mo16799e(r1)     // Catch:{ all -> 0x004d }
            int r2 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r2 = (long) r2     // Catch:{ all -> 0x004d }
            byte[] r2 = r0.mo16799e(r2)     // Catch:{ all -> 0x004d }
            k.t r3 = p308k.C5812t.f14872a     // Catch:{ all -> 0x004d }
            r3 = 0
            p308k.p322y.C5904a.m22293a(r0, r3)
            monitor-enter(r4)
            if (r1 == 0) goto L_0x0047
            r4.f16234c = r1     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            r4.f16235d = r2     // Catch:{ all -> 0x0045 }
            k.t r0 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f16233b
            r0.countDown()
            return
        L_0x0041:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x004b:
            monitor-exit(r4)
            throw r0
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            p308k.p322y.C5904a.m22293a(r0, r1)
            throw r2
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24858b():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24859c() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m24858b()     // Catch:{  }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            r1.interrupt()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            m.f0.i.h$a r2 = p337m.p338f0.p345i.C6380h.f15831c     // Catch:{ all -> 0x000e }
            m.f0.i.h r2 = r2.mo16477a()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.mo16440a(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24859c():void");
    }

    /* renamed from: a */
    public final String mo17036a(String str) {
        C5942k.m22327b(str, "domain");
        String unicode = IDN.toUnicode(str);
        C5942k.m22324a((Object) unicode, "unicodeDomain");
        List a = C5788q.m21997a((CharSequence) unicode, new char[]{'.'}, false, 0, 6, (Object) null);
        List a2 = m24856a(a);
        if (a.size() == a2.size() && ((String) a2.get(0)).charAt(0) != '!') {
            return null;
        }
        char charAt = ((String) a2.get(0)).charAt(0);
        int size = a.size();
        int size2 = a2.size();
        if (charAt != '!') {
            size2++;
        }
        return C5761l.m21903a(C5761l.m21905a(C5845t.m22177a((Iterable<? extends T>) C5788q.m21997a((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
