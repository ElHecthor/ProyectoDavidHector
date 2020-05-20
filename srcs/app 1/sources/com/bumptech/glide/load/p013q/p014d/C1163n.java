package com.bumptech.glide.load.p013q.p014d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C0857b;
import com.bumptech.glide.load.C0870h;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0874j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p005n.C0897m;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p013q.p014d.C1155m.C1162g;
import com.bumptech.glide.load.p013q.p014d.C1172t.C1173a;
import com.bumptech.glide.load.p013q.p014d.C1172t.C1174b;
import com.bumptech.glide.p029t.C1305f;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.q.d.n */
public final class C1163n {

    /* renamed from: f */
    public static final C0870h<C0857b> f3936f = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C0857b.f3376h);

    /* renamed from: g */
    public static final C0870h<C0874j> f3937g = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C0874j.SRGB);

    /* renamed from: h */
    public static final C0870h<Boolean> f3938h;

    /* renamed from: i */
    public static final C0870h<Boolean> f3939i;

    /* renamed from: j */
    private static final Set<String> f3940j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    private static final C1165b f3941k = new C1164a();

    /* renamed from: l */
    private static final Set<ImageType> f3942l = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));

    /* renamed from: m */
    private static final Queue<Options> f3943m = C1310k.m6165a(0);

    /* renamed from: a */
    private final C0921e f3944a;

    /* renamed from: b */
    private final DisplayMetrics f3945b;

    /* renamed from: c */
    private final C0916b f3946c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f3947d;

    /* renamed from: e */
    private final C1171s f3948e = C1171s.m5526a();

    /* renamed from: com.bumptech.glide.load.q.d.n$a */
    class C1164a implements C1165b {
        C1164a() {
        }

        /* renamed from: a */
        public void mo5005a() {
        }

        /* renamed from: a */
        public void mo5006a(C0921e eVar, Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.n$b */
    public interface C1165b {
        /* renamed from: a */
        void mo5005a();

        /* renamed from: a */
        void mo5006a(C0921e eVar, Bitmap bitmap);
    }

    static {
        C0870h<C1155m> hVar = C1155m.f3931f;
        Boolean valueOf = Boolean.valueOf(false);
        f3938h = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", valueOf);
        f3939i = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", valueOf);
    }

    public C1163n(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C0921e eVar, C0916b bVar) {
        this.f3947d = list;
        C1309j.m6149a(displayMetrics);
        this.f3945b = displayMetrics;
        C1309j.m6149a(eVar);
        this.f3944a = eVar;
        C1309j.m6149a(bVar);
        this.f3946c = bVar;
    }

    /* renamed from: a */
    private static int m5484a(double d) {
        int b = m5498b(d);
        int c = m5501c(((double) b) * d);
        return m5501c((d / ((double) (((float) c) / ((float) b)))) * ((double) c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016d, code lost:
        if (r3 >= 26) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m5485a(com.bumptech.glide.load.p013q.p014d.C1172t r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.p013q.p014d.C1155m r30, com.bumptech.glide.load.C0857b r31, com.bumptech.glide.load.C0874j r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.p013q.p014d.C1163n.C1165b r37) {
        /*
            r27 = this;
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r37
            long r20 = com.bumptech.glide.p029t.C1305f.m6136a()
            com.bumptech.glide.load.o.a0.e r0 = r8.f3944a
            int[] r0 = m5500b(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r3 = 1
            r2 = r0[r3]
            java.lang.String r1 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L_0x0024
            if (r2 != r0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r23 = r33
            goto L_0x0026
        L_0x0024:
            r23 = 0
        L_0x0026:
            int r0 = r28.mo5054b()
            int r14 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5373a(r0)
            boolean r24 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5387b(r0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r34
            if (r15 != r9) goto L_0x0046
            boolean r10 = m5496a(r14)
            r13 = r35
            if (r10 == 0) goto L_0x0043
            r25 = r2
            goto L_0x004a
        L_0x0043:
            r25 = r4
            goto L_0x004a
        L_0x0046:
            r13 = r35
            r25 = r15
        L_0x004a:
            if (r13 != r9) goto L_0x0058
            boolean r9 = m5496a(r14)
            if (r9 == 0) goto L_0x0055
            r26 = r4
            goto L_0x005a
        L_0x0055:
            r26 = r2
            goto L_0x005a
        L_0x0058:
            r26 = r13
        L_0x005a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = r28.mo5055c()
            com.bumptech.glide.load.o.a0.e r11 = r8.f3944a
            r9 = r12
            r10 = r28
            r16 = r11
            r11 = r37
            r8 = r12
            r12 = r16
            r13 = r30
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r26
            r19 = r29
            m5494a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            r0 = r27
            r11 = r1
            r1 = r28
            r10 = r2
            r2 = r31
            r9 = 1
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r29
            r14 = r6
            r6 = r25
            r7 = r26
            r0.m5495a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x009a
            r3 = 1
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            int r0 = r14.inSampleSize
            r1 = 2
            java.lang.String r2 = "Downsampler"
            if (r0 == r9) goto L_0x00a9
            if (r3 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            r0 = r27
            goto L_0x014e
        L_0x00a9:
            r0 = r27
            r4 = r8
            boolean r4 = r0.m5497a(r4)
            if (r4 == 0) goto L_0x014e
            if (r12 < 0) goto L_0x00c0
            if (r10 < 0) goto L_0x00c0
            if (r36 == 0) goto L_0x00c0
            if (r3 == 0) goto L_0x00c0
            r5 = r25
            r6 = r26
            goto L_0x0145
        L_0x00c0:
            boolean r3 = m5499b(r29)
            if (r3 == 0) goto L_0x00ce
            int r3 = r14.inTargetDensity
            float r3 = (float) r3
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L_0x00d0
        L_0x00ce:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d0:
            int r4 = r14.inSampleSize
            float r5 = (float) r12
            float r6 = (float) r4
            float r5 = r5 / r6
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            float r7 = (float) r10
            float r7 = r7 / r6
            double r6 = (double) r7
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r3
            int r6 = java.lang.Math.round(r6)
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L_0x0145
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Calculated target ["
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = "x"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r9 = "] for source ["
            r7.append(r9)
            r7.append(r12)
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = "], sampleSize: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ", targetDensity: "
            r7.append(r4)
            int r4 = r14.inTargetDensity
            r7.append(r4)
            java.lang.String r4 = ", density: "
            r7.append(r4)
            int r4 = r14.inDensity
            r7.append(r4)
            java.lang.String r4 = ", density multiplier: "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.v(r2, r3)
        L_0x0145:
            if (r5 <= 0) goto L_0x014e
            if (r6 <= 0) goto L_0x014e
            com.bumptech.glide.load.o.a0.e r3 = r0.f3944a
            m5493a(r14, r3, r5, r6)
        L_0x014e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x016b
            com.bumptech.glide.load.j r3 = com.bumptech.glide.load.C0874j.DISPLAY_P3
            r4 = r32
            if (r4 != r3) goto L_0x0166
            android.graphics.ColorSpace r3 = r14.outColorSpace
            if (r3 == 0) goto L_0x0166
            boolean r3 = r3.isWideGamut()
            if (r3 == 0) goto L_0x0166
            r22 = 1
        L_0x0166:
            if (r22 == 0) goto L_0x016f
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0171
        L_0x016b:
            r4 = 26
            if (r3 < r4) goto L_0x0177
        L_0x016f:
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
        L_0x0171:
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            r14.inPreferredColorSpace = r3
        L_0x0177:
            com.bumptech.glide.load.o.a0.e r3 = r0.f3944a
            r4 = r28
            android.graphics.Bitmap r3 = m5486a(r4, r14, r13, r3)
            com.bumptech.glide.load.o.a0.e r4 = r0.f3944a
            r13.mo5006a(r4, r3)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x0199
            r9 = r12
            r12 = r29
            r13 = r3
            r14 = r34
            r1 = r15
            r15 = r35
            r16 = r20
            m5492a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x019a
        L_0x0199:
            r1 = r15
        L_0x019a:
            r2 = 0
            if (r3 == 0) goto L_0x01b5
            android.util.DisplayMetrics r2 = r0.f3945b
            int r2 = r2.densityDpi
            r3.setDensity(r2)
            com.bumptech.glide.load.o.a0.e r2 = r0.f3944a
            android.graphics.Bitmap r2 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5376a(r2, r3, r1)
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L_0x01b5
            com.bumptech.glide.load.o.a0.e r1 = r0.f3944a
            r1.mo4713a(r3)
        L_0x01b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1163n.m5485a(com.bumptech.glide.load.q.d.t, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.q.d.m, com.bumptech.glide.load.b, com.bumptech.glide.load.j, boolean, int, int, boolean, com.bumptech.glide.load.q.d.n$b):android.graphics.Bitmap");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0050 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m5486a(com.bumptech.glide.load.p013q.p014d.C1172t r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.p013q.p014d.C1163n.C1165b r7, com.bumptech.glide.load.p007o.p008a0.C0921e r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo5005a()
            r5.mo5053a()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5379a()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo5052a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5379a()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0052
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m5489a(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0051
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ IOException -> 0x0050 }
            r8.mo4713a(r0)     // Catch:{ IOException -> 0x0050 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0050 }
            android.graphics.Bitmap r5 = m5486a(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0050 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5379a()
            r6.unlock()
            return r5
        L_0x0050:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0051:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0052:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p013q.p014d.C1125b0.m5379a()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1163n.m5486a(com.bumptech.glide.load.q.d.t, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.q.d.n$b, com.bumptech.glide.load.o.a0.e):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static synchronized Options m5487a() {
        Options options;
        synchronized (C1163n.class) {
            synchronized (f3943m) {
                options = (Options) f3943m.poll();
            }
            if (options == null) {
                options = new Options();
                m5503d(options);
            }
        }
        return options;
    }

    /* renamed from: a */
    private C1020v<Bitmap> m5488a(C1172t tVar, int i, int i2, C0873i iVar, C1165b bVar) {
        C0873i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f3946c.mo4692b(65536, byte[].class);
        Options a = m5487a();
        a.inTempStorage = bArr;
        try {
            return C1142e.m5424a(m5485a(tVar, a, (C1155m) iVar2.mo4628a(C1155m.f3931f), (C0857b) iVar2.mo4628a(f3936f), (C0874j) iVar2.mo4628a(f3937g), iVar2.mo4628a(f3939i) != null && ((Boolean) iVar2.mo4628a(f3939i)).booleanValue(), i, i2, ((Boolean) iVar2.mo4628a(f3938h)).booleanValue(), bVar), this.f3944a);
        } finally {
            m5502c(a);
            this.f3946c.put(bArr);
        }
    }

    /* renamed from: a */
    private static IOException m5489a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(m5491a(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m5490a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static String m5491a(Options options) {
        return m5490a(options.inBitmap);
    }

    /* renamed from: a */
    private static void m5492a(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m5490a(bitmap));
        sb.append(" from [");
        sb.append(i);
        String str2 = "x";
        sb.append(str2);
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m5491a(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C1305f.m6135a(j));
        Log.v("Downsampler", sb.toString());
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m5493a(Options options, C0921e eVar, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo4714b(i, i2, config);
    }

    /* renamed from: a */
    private static void m5494a(ImageType imageType, C1172t tVar, C1165b bVar, C0921e eVar, C1155m mVar, int i, int i2, int i3, int i4, int i5, Options options) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ImageType imageType2 = imageType;
        C1155m mVar2 = mVar;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        Options options2 = options;
        String str = "]";
        String str2 = "Downsampler";
        String str3 = "x";
        if (i11 <= 0 || i12 <= 0) {
            String str4 = str3;
            if (Log.isLoggable(str2, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i13);
                sb.append(str4);
                sb.append(i14);
                sb.append(str);
                Log.d(str2, sb.toString());
            }
            return;
        }
        if (m5496a(i)) {
            i6 = i11;
            i7 = i12;
        } else {
            i7 = i11;
            i6 = i12;
        }
        float b = mVar2.mo5042b(i7, i6, i13, i14);
        if (b > 0.0f) {
            C1162g a = mVar2.mo5041a(i7, i6, i13, i14);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int c = i7 / m5501c((double) (b * f));
                int c2 = i6 / m5501c((double) (b * f2));
                int max = a == C1162g.MEMORY ? Math.max(c, c2) : Math.min(c, c2);
                String str5 = str3;
                if (VERSION.SDK_INT > 23 || !f3940j.contains(options2.outMimeType)) {
                    i8 = Math.max(1, Integer.highestOneBit(max));
                    if (a == C1162g.MEMORY && ((float) i8) < 1.0f / b) {
                        i8 <<= 1;
                    }
                } else {
                    i8 = 1;
                }
                options2.inSampleSize = i8;
                if (imageType2 == ImageType.JPEG) {
                    float min = (float) Math.min(i8, 8);
                    i9 = (int) Math.ceil((double) (f / min));
                    i10 = (int) Math.ceil((double) (f2 / min));
                    int i15 = i8 / 8;
                    if (i15 > 0) {
                        i9 /= i15;
                        i10 /= i15;
                    }
                } else {
                    if (!(imageType2 == ImageType.PNG || imageType2 == ImageType.PNG_A)) {
                        if (imageType2 == ImageType.WEBP || imageType2 == ImageType.WEBP_A) {
                            if (VERSION.SDK_INT >= 24) {
                                float f3 = (float) i8;
                                i9 = Math.round(f / f3);
                                i10 = Math.round(f2 / f3);
                            }
                        } else if (i7 % i8 == 0 && i6 % i8 == 0) {
                            i9 = i7 / i8;
                            i10 = i6 / i8;
                        } else {
                            int[] b2 = m5500b(tVar, options2, bVar, eVar);
                            i9 = b2[0];
                            i10 = b2[1];
                        }
                    }
                    float f4 = (float) i8;
                    i9 = (int) Math.floor((double) (f / f4));
                    i10 = (int) Math.floor((double) (f2 / f4));
                }
                double b3 = (double) mVar2.mo5042b(i9, i10, i13, i14);
                if (VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m5484a(b3);
                    options2.inDensity = m5498b(b3);
                }
                if (m5499b(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i2);
                    String str6 = str5;
                    sb2.append(str6);
                    sb2.append(i3);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i);
                    sb2.append(", target: [");
                    sb2.append(i13);
                    sb2.append(str6);
                    sb2.append(i14);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i9);
                    sb2.append(str6);
                    sb2.append(i10);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i8);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b3);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    Log.v(str2, sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i16 = i12;
        String str7 = str3;
        int i17 = i11;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot scale with factor: ");
        sb3.append(b);
        sb3.append(" from: ");
        sb3.append(mVar2);
        sb3.append(", source: [");
        sb3.append(i17);
        sb3.append(str7);
        sb3.append(i16);
        sb3.append("], target: [");
        sb3.append(i13);
        sb3.append(str7);
        sb3.append(i14);
        sb3.append(str);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private void m5495a(C1172t tVar, C0857b bVar, boolean z, boolean z2, Options options, int i, int i2) {
        if (!this.f3948e.mo5050a(i, i2, options, z, z2)) {
            if (bVar == C0857b.PREFER_ARGB_8888 || VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = tVar.mo5055c().hasAlpha();
            } catch (IOException e) {
                String str = "Downsampler";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(bVar);
                    Log.d(str, sb.toString(), e);
                }
            }
            Config config = z3 ? Config.ARGB_8888 : Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5496a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: a */
    private boolean m5497a(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f3942l.contains(imageType);
    }

    /* renamed from: b */
    private static int m5498b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: b */
    private static boolean m5499b(Options options) {
        int i = options.inTargetDensity;
        if (i > 0) {
            int i2 = options.inDensity;
            if (i2 > 0 && i != i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int[] m5500b(C1172t tVar, Options options, C1165b bVar, C0921e eVar) {
        options.inJustDecodeBounds = true;
        m5486a(tVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: c */
    private static int m5501c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m5502c(Options options) {
        m5503d(options);
        synchronized (f3943m) {
            f3943m.offer(options);
        }
    }

    /* renamed from: d */
    private static void m5503d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo5043a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C0873i iVar) {
        return m5488a((C1172t) new C1174b(parcelFileDescriptor, this.f3947d, this.f3946c), i, i2, iVar, f3941k);
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo5044a(InputStream inputStream, int i, int i2, C0873i iVar) {
        return mo5045a(inputStream, i, i2, iVar, f3941k);
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo5045a(InputStream inputStream, int i, int i2, C0873i iVar, C1165b bVar) {
        return m5488a((C1172t) new C1173a(inputStream, this.f3947d, this.f3946c), i, i2, iVar, bVar);
    }

    /* renamed from: a */
    public boolean mo5046a(ParcelFileDescriptor parcelFileDescriptor) {
        return C0897m.m4651c();
    }

    /* renamed from: a */
    public boolean mo5047a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo5048a(ByteBuffer byteBuffer) {
        return true;
    }
}
