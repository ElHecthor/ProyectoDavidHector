package com.bumptech.glide.p020m;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.m.a */
public final class C1217a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final File f4048f;

    /* renamed from: g */
    private final File f4049g;

    /* renamed from: h */
    private final File f4050h;

    /* renamed from: i */
    private final File f4051i;

    /* renamed from: j */
    private final int f4052j;

    /* renamed from: k */
    private long f4053k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f4054l;

    /* renamed from: m */
    private long f4055m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Writer f4056n;

    /* renamed from: o */
    private final LinkedHashMap<String, C1221d> f4057o = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f4058p;

    /* renamed from: q */
    private long f4059q = 0;

    /* renamed from: r */
    final ThreadPoolExecutor f4060r;

    /* renamed from: s */
    private final Callable<Void> f4061s;

    /* renamed from: com.bumptech.glide.m.a$a */
    class C1218a implements Callable<Void> {
        C1218a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                com.bumptech.glide.m.a r0 = com.bumptech.glide.p020m.C1217a.this
                monitor-enter(r0)
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p020m.C1217a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f4056n     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p020m.C1217a.this     // Catch:{ all -> 0x0028 }
                r1.m5707l()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p020m.C1217a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m5703f()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p020m.C1217a.this     // Catch:{ all -> 0x0028 }
                r1.m5706i()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p020m.C1217a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f4058p = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p020m.C1217a.C1218a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.m.a$b */
    private static final class C1219b implements ThreadFactory {
        private C1219b() {
        }

        /* synthetic */ C1219b(C1218a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.m.a$c */
    public final class C1220c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1221d f4063a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f4064b;

        /* renamed from: c */
        private boolean f4065c;

        private C1220c(C1221d dVar) {
            this.f4063a = dVar;
            this.f4064b = dVar.f4071e ? null : new boolean[C1217a.this.f4054l];
        }

        /* synthetic */ C1220c(C1217a aVar, C1221d dVar, C1218a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public File mo5149a(int i) {
            File b;
            synchronized (C1217a.this) {
                if (this.f4063a.f4072f == this) {
                    if (!this.f4063a.f4071e) {
                        this.f4064b[i] = true;
                    }
                    b = this.f4063a.mo5155b(i);
                    if (!C1217a.this.f4048f.exists()) {
                        C1217a.this.f4048f.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: a */
        public void mo5150a() {
            C1217a.this.m5690a(this, false);
        }

        /* renamed from: b */
        public void mo5151b() {
            if (!this.f4065c) {
                try {
                    mo5150a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo5152c() {
            C1217a.this.m5690a(this, true);
            this.f4065c = true;
        }
    }

    /* renamed from: com.bumptech.glide.m.a$d */
    private final class C1221d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f4067a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f4068b;

        /* renamed from: c */
        File[] f4069c;

        /* renamed from: d */
        File[] f4070d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f4071e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1220c f4072f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f4073g;

        private C1221d(String str) {
            this.f4067a = str;
            this.f4068b = new long[C1217a.this.f4054l];
            this.f4069c = new File[C1217a.this.f4054l];
            this.f4070d = new File[C1217a.this.f4054l];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1217a.this.f4054l; i++) {
                sb.append(i);
                this.f4069c[i] = new File(C1217a.this.f4048f, sb.toString());
                sb.append(".tmp");
                this.f4070d[i] = new File(C1217a.this.f4048f, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ C1221d(C1217a aVar, String str, C1218a aVar2) {
            this(str);
        }

        /* renamed from: a */
        private IOException m5720a(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m5725b(String[] strArr) {
            if (strArr.length == C1217a.this.f4054l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f4068b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m5720a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m5720a(strArr);
            throw null;
        }

        /* renamed from: a */
        public File mo5153a(int i) {
            return this.f4069c[i];
        }

        /* renamed from: a */
        public String mo5154a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f4068b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo5155b(int i) {
            return this.f4070d[i];
        }
    }

    /* renamed from: com.bumptech.glide.m.a$e */
    public final class C1222e {

        /* renamed from: a */
        private final File[] f4075a;

        private C1222e(C1217a aVar, String str, long j, File[] fileArr, long[] jArr) {
            this.f4075a = fileArr;
        }

        /* synthetic */ C1222e(C1217a aVar, String str, long j, File[] fileArr, long[] jArr, C1218a aVar2) {
            this(aVar, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo5156a(int i) {
            return this.f4075a[i];
        }
    }

    private C1217a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1219b(null));
        this.f4060r = threadPoolExecutor;
        this.f4061s = new C1218a();
        this.f4048f = file2;
        this.f4052j = i;
        this.f4049g = new File(file2, "journal");
        this.f4050h = new File(file2, "journal.tmp");
        this.f4051i = new File(file2, "journal.bkp");
        this.f4054l = i2;
        this.f4053k = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p020m.C1217a.C1220c m5687a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m5699d()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r5.f4057o     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p020m.C1217a.C1221d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f4073g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.m.a$d r0 = new com.bumptech.glide.m.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r7 = r5.f4057o     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.m.a$c r7 = r0.f4072f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.m.a$c r7 = new com.bumptech.glide.m.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            r0.f4072f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4056n     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4056n     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4056n     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f4056n     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f4056n     // Catch:{ all -> 0x005d }
            m5696b(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p020m.C1217a.m5687a(java.lang.String, long):com.bumptech.glide.m.a$c");
    }

    /* renamed from: a */
    public static C1217a m5688a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m5693a(file2, file3, false);
                }
            }
            C1217a aVar = new C1217a(file, i, i2, j);
            if (aVar.f4049g.exists()) {
                try {
                    aVar.m5705h();
                    aVar.m5704g();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo5142a();
                }
            }
            file.mkdirs();
            C1217a aVar2 = new C1217a(file, i, i2, j);
            aVar2.m5706i();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5690a(com.bumptech.glide.p020m.C1217a.C1220c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.m.a$d r0 = r10.f4063a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.m.a$c r1 = r0.f4072f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f4071e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f4054l     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f4064b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo5155b(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo5150a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo5150a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f4054l     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo5155b(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo5153a(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f4068b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f4068b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f4055m     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f4055m = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m5692a(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f4058p     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f4058p = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            r0.f4072f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f4071e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            r0.f4071e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f4067a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo5154a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f4059q     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f4059q = r1     // Catch:{ all -> 0x010e }
            r0.f4073g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r10 = r9.f4057o     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f4067a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f4067a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f4056n     // Catch:{ all -> 0x010e }
            m5696b(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f4055m     // Catch:{ all -> 0x010e }
            long r0 = r9.f4053k     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m5703f()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f4060r     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f4061s     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p020m.C1217a.m5690a(com.bumptech.glide.m.a$c, boolean):void");
    }

    /* renamed from: a */
    private static void m5692a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m5693a(File file, File file2, boolean z) {
        if (z) {
            m5692a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m5694a(Writer writer) {
        if (VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @TargetApi(26)
    /* renamed from: b */
    private static void m5696b(Writer writer) {
        if (VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: d */
    private void m5699d() {
        if (this.f4056n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: f */
    private void m5702f(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f4057o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1221d dVar = (C1221d) this.f4057o.get(str2);
            if (dVar == null) {
                dVar = new C1221d(this, str2, null);
                this.f4057o.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f4071e = true;
                dVar.f4072f = null;
                dVar.m5725b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f4072f = new C1220c(this, dVar, null);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m5703f() {
        int i = this.f4058p;
        return i >= 2000 && i >= this.f4057o.size();
    }

    /* renamed from: g */
    private void m5704g() {
        m5692a(this.f4050h);
        Iterator it = this.f4057o.values().iterator();
        while (it.hasNext()) {
            C1221d dVar = (C1221d) it.next();
            int i = 0;
            if (dVar.f4072f == null) {
                while (i < this.f4054l) {
                    this.f4055m += dVar.f4068b[i];
                    i++;
                }
            } else {
                dVar.f4072f = null;
                while (i < this.f4054l) {
                    m5692a(dVar.mo5153a(i));
                    m5692a(dVar.mo5155b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f4058p = r0 - r9.f4057o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo5157a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m5706i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f4056n = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f4049g, true), com.bumptech.glide.p020m.C1225c.f4082a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5705h() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.m.b r1 = new com.bumptech.glide.m.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f4049g
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p020m.C1225c.f4082a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo5159d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo5159d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo5159d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo5159d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo5159d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f4052j     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f4054l     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo5159d()     // Catch:{ EOFException -> 0x005f }
            r9.m5702f(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r2 = r9.f4057o     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f4058p = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo5157a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m5706i()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f4049g     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p020m.C1225c.f4082a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f4056n = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p020m.C1225c.m5737a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p020m.C1225c.m5737a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p020m.C1217a.m5705h():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m5706i() {
        String sb;
        if (this.f4056n != null) {
            m5694a(this.f4056n);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4050h), C1225c.f4082a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4052j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4054l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1221d dVar : this.f4057o.values()) {
                if (dVar.f4072f != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DIRTY ");
                    sb2.append(dVar.f4067a);
                    sb2.append(10);
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CLEAN ");
                    sb3.append(dVar.f4067a);
                    sb3.append(dVar.mo5154a());
                    sb3.append(10);
                    sb = sb3.toString();
                }
                bufferedWriter.write(sb);
            }
            m5694a((Writer) bufferedWriter);
            if (this.f4049g.exists()) {
                m5693a(this.f4049g, this.f4051i, true);
            }
            m5693a(this.f4050h, this.f4049g, false);
            this.f4051i.delete();
            this.f4056n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4049g, true), C1225c.f4082a));
        } catch (Throwable th) {
            m5694a((Writer) bufferedWriter);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m5707l() {
        while (this.f4055m > this.f4053k) {
            mo5146e((String) ((Entry) this.f4057o.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public void mo5142a() {
        close();
        C1225c.m5738a(this.f4048f);
    }

    /* renamed from: c */
    public C1220c mo5143c(String str) {
        return m5687a(str, -1);
    }

    public synchronized void close() {
        if (this.f4056n != null) {
            Iterator it = new ArrayList(this.f4057o.values()).iterator();
            while (it.hasNext()) {
                C1221d dVar = (C1221d) it.next();
                if (dVar.f4072f != null) {
                    dVar.f4072f.mo5150a();
                }
            }
            m5707l();
            m5694a(this.f4056n);
            this.f4056n = null;
        }
    }

    /* renamed from: d */
    public synchronized C1222e mo5145d(String str) {
        m5699d();
        C1221d dVar = (C1221d) this.f4057o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4071e) {
            return null;
        }
        for (File exists : dVar.f4069c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f4058p++;
        this.f4056n.append("READ");
        this.f4056n.append(' ');
        this.f4056n.append(str);
        this.f4056n.append(10);
        if (m5703f()) {
            this.f4060r.submit(this.f4061s);
        }
        C1222e eVar = new C1222e(this, str, dVar.f4073g, dVar.f4069c, dVar.f4068b, null);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo5146e(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m5699d()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f4057o     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p020m.C1217a.C1221d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.m.a$c r2 = r0.f4072f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f4054l     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo5153a(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f4055m     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f4068b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f4055m = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f4068b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f4058p     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f4058p = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f4056n     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f4056n     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f4056n     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f4056n     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f4057o     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m5703f()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f4060r     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f4061s     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p020m.C1217a.mo5146e(java.lang.String):boolean");
    }
}
