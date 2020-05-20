package com.bumptech.glide.p021n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p021n.C1226a.C1227a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.n.e */
public class C1231e implements C1226a {

    /* renamed from: u */
    private static final String f4111u = "e";

    /* renamed from: a */
    private int[] f4112a;

    /* renamed from: b */
    private final int[] f4113b;

    /* renamed from: c */
    private final C1227a f4114c;

    /* renamed from: d */
    private ByteBuffer f4115d;

    /* renamed from: e */
    private byte[] f4116e;

    /* renamed from: f */
    private short[] f4117f;

    /* renamed from: g */
    private byte[] f4118g;

    /* renamed from: h */
    private byte[] f4119h;

    /* renamed from: i */
    private byte[] f4120i;

    /* renamed from: j */
    private int[] f4121j;

    /* renamed from: k */
    private int f4122k;

    /* renamed from: l */
    private C1229c f4123l;

    /* renamed from: m */
    private Bitmap f4124m;

    /* renamed from: n */
    private boolean f4125n;

    /* renamed from: o */
    private int f4126o;

    /* renamed from: p */
    private int f4127p;

    /* renamed from: q */
    private int f4128q;

    /* renamed from: r */
    private int f4129r;

    /* renamed from: s */
    private Boolean f4130s;

    /* renamed from: t */
    private Config f4131t;

    public C1231e(C1227a aVar) {
        this.f4113b = new int[256];
        this.f4131t = Config.ARGB_8888;
        this.f4114c = aVar;
        this.f4123l = new C1229c();
    }

    public C1231e(C1227a aVar, C1229c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo5179a(cVar, byteBuffer, i);
    }

    /* renamed from: a */
    private int m5776a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f4127p + i; i9++) {
            byte[] bArr = this.f4120i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f4112a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f4127p + i11; i12++) {
            byte[] bArr2 = this.f4120i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f4112a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: a */
    private Bitmap m5777a(C1228b bVar, C1228b bVar2) {
        int[] iArr = this.f4121j;
        int i = 0;
        if (bVar2 == null) {
            Bitmap bitmap = this.f4124m;
            if (bitmap != null) {
                this.f4114c.mo5085a(bitmap);
            }
            this.f4124m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4089g == 3 && this.f4124m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null) {
            int i2 = bVar2.f4089g;
            if (i2 > 0) {
                if (i2 == 2) {
                    if (!bVar.f4088f) {
                        C1229c cVar = this.f4123l;
                        int i3 = cVar.f4105l;
                        if (bVar.f4093k == null || cVar.f4103j != bVar.f4090h) {
                            i = i3;
                        }
                    }
                    int i4 = bVar2.f4086d;
                    int i5 = this.f4127p;
                    int i6 = i4 / i5;
                    int i7 = bVar2.f4084b / i5;
                    int i8 = bVar2.f4085c / i5;
                    int i9 = bVar2.f4083a / i5;
                    int i10 = this.f4129r;
                    int i11 = (i7 * i10) + i9;
                    int i12 = (i6 * i10) + i11;
                    while (i11 < i12) {
                        int i13 = i11 + i8;
                        for (int i14 = i11; i14 < i13; i14++) {
                            iArr[i14] = i;
                        }
                        i11 += this.f4129r;
                    }
                } else if (i2 == 3) {
                    Bitmap bitmap2 = this.f4124m;
                    if (bitmap2 != null) {
                        int i15 = this.f4129r;
                        bitmap2.getPixels(iArr, 0, i15, 0, 0, i15, this.f4128q);
                    }
                }
            }
        }
        m5780c(bVar);
        if (bVar.f4087e || this.f4127p != 1) {
            m5778a(bVar);
        } else {
            m5779b(bVar);
        }
        if (this.f4125n) {
            int i16 = bVar.f4089g;
            if (i16 == 0 || i16 == 1) {
                if (this.f4124m == null) {
                    this.f4124m = m5781i();
                }
                Bitmap bitmap3 = this.f4124m;
                int i17 = this.f4129r;
                bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f4128q);
            }
        }
        Bitmap i18 = m5781i();
        int i19 = this.f4129r;
        i18.setPixels(iArr, 0, i19, 0, 0, i19, this.f4128q);
        return i18;
    }

    /* renamed from: a */
    private void m5778a(C1228b bVar) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C1228b bVar2 = bVar;
        int[] iArr = this.f4121j;
        int i6 = bVar2.f4086d;
        int i7 = this.f4127p;
        int i8 = i6 / i7;
        int i9 = bVar2.f4084b / i7;
        int i10 = bVar2.f4085c / i7;
        int i11 = bVar2.f4083a / i7;
        int i12 = this.f4122k;
        Boolean valueOf = Boolean.valueOf(true);
        boolean z = i12 == 0;
        int i13 = this.f4127p;
        int i14 = this.f4129r;
        int i15 = this.f4128q;
        byte[] bArr = this.f4120i;
        int[] iArr2 = this.f4112a;
        Boolean bool2 = this.f4130s;
        int i16 = 8;
        Boolean bool3 = valueOf;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (true) {
            bool = bool2;
            if (i17 >= i8) {
                break;
            }
            if (bVar2.f4087e) {
                if (i18 >= i8) {
                    i = i8;
                    int i20 = i19 + 1;
                    if (i20 == 2) {
                        i19 = i20;
                        i18 = 4;
                    } else if (i20 != 3) {
                        i19 = i20;
                        if (i20 == 4) {
                            i18 = 1;
                            i16 = 2;
                        }
                    } else {
                        i19 = i20;
                        i18 = 2;
                        i16 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i18 + i16;
            } else {
                i = i8;
                i2 = i18;
                i18 = i17;
            }
            int i21 = i18 + i9;
            boolean z2 = i13 == 1;
            if (i21 < i15) {
                int i22 = i21 * i14;
                int i23 = i22 + i11;
                int i24 = i23 + i10;
                int i25 = i22 + i14;
                if (i25 < i24) {
                    i24 = i25;
                }
                i3 = i2;
                int i26 = i17 * i13 * bVar2.f4085c;
                if (z2) {
                    int i27 = i23;
                    while (true) {
                        i5 = i9;
                        if (i27 >= i24) {
                            break;
                        }
                        int i28 = iArr2[bArr[i26] & 255];
                        if (i28 != 0) {
                            iArr[i27] = i28;
                        } else if (z && bool == null) {
                            bool = bool3;
                        }
                        i26 += i13;
                        i27++;
                        i9 = i5;
                    }
                } else {
                    i5 = i9;
                    int i29 = ((i24 - i23) * i13) + i26;
                    int i30 = i23;
                    while (true) {
                        i4 = i10;
                        if (i30 >= i24) {
                            break;
                        }
                        int a = m5776a(i26, i29, bVar2.f4085c);
                        if (a != 0) {
                            iArr[i30] = a;
                        } else if (z && bool == null) {
                            bool = bool3;
                        }
                        i26 += i13;
                        i30++;
                        i10 = i4;
                    }
                    bool2 = bool;
                    i17++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i18 = i3;
                }
            } else {
                i3 = i2;
                i5 = i9;
            }
            i4 = i10;
            bool2 = bool;
            i17++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i18 = i3;
        }
        if (this.f4130s == null) {
            this.f4130s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: b */
    private void m5779b(C1228b bVar) {
        C1228b bVar2 = bVar;
        int[] iArr = this.f4121j;
        int i = bVar2.f4086d;
        int i2 = bVar2.f4084b;
        int i3 = bVar2.f4085c;
        int i4 = bVar2.f4083a;
        boolean z = this.f4122k == 0;
        int i5 = this.f4129r;
        byte[] bArr = this.f4120i;
        int[] iArr2 = this.f4112a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f4085c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C1228b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f4130s;
        this.f4130s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f4130s == null && z && b != -1));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [short[]] */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4, types: [int] */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r18v4 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r7v13, types: [short] */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r3v1, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r25v4
      assigns: []
      uses: []
      mth insns count: 165
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5780c(com.bumptech.glide.p021n.C1228b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f4115d
            int r3 = r1.f4092j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.n.c r1 = r0.f4123l
            int r2 = r1.f4099f
            int r1 = r1.f4100g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f4085c
            int r1 = r1.f4086d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f4120i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.n.a$a r1 = r0.f4114c
            byte[] r1 = r1.mo5088a(r2)
            r0.f4120i = r1
        L_0x002b:
            byte[] r1 = r0.f4120i
            short[] r3 = r0.f4117f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f4117f = r3
        L_0x0037:
            short[] r3 = r0.f4117f
            byte[] r5 = r0.f4118g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f4118g = r5
        L_0x0041:
            byte[] r5 = r0.f4118g
            byte[] r6 = r0.f4119h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f4119h = r6
        L_0x004d:
            byte[] r6 = r0.f4119h
            int r7 = r28.m5783k()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f4116e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014e
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m5782j()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f4126o = r3
            goto L_0x014e
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r27 = r6
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014e:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p021n.C1231e.m5780c(com.bumptech.glide.n.b):void");
    }

    /* renamed from: i */
    private Bitmap m5781i() {
        Boolean bool = this.f4130s;
        Bitmap a = this.f4114c.mo5084a(this.f4129r, this.f4128q, (bool == null || bool.booleanValue()) ? Config.ARGB_8888 : this.f4131t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: j */
    private int m5782j() {
        int k = m5783k();
        if (k <= 0) {
            return k;
        }
        ByteBuffer byteBuffer = this.f4115d;
        byteBuffer.get(this.f4116e, 0, Math.min(k, byteBuffer.remaining()));
        return k;
    }

    /* renamed from: k */
    private int m5783k() {
        return this.f4115d.get() & 255;
    }

    /* renamed from: a */
    public int mo5161a() {
        return this.f4122k;
    }

    /* renamed from: a */
    public int mo5178a(int i) {
        if (i >= 0) {
            C1229c cVar = this.f4123l;
            if (i < cVar.f4096c) {
                return ((C1228b) cVar.f4098e.get(i)).f4091i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo5162a(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f4131t = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo5179a(C1229c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f4126o = 0;
            this.f4123l = cVar;
            this.f4122k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4115d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f4115d.order(ByteOrder.LITTLE_ENDIAN);
            this.f4125n = false;
            Iterator it = cVar.f4098e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C1228b) it.next()).f4089g == 3) {
                        this.f4125n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f4127p = highestOneBit;
            this.f4129r = cVar.f4099f / highestOneBit;
            this.f4128q = cVar.f4100g / highestOneBit;
            this.f4120i = this.f4114c.mo5088a(cVar.f4099f * cVar.f4100g);
            this.f4121j = this.f4114c.mo5089b(this.f4129r * this.f4128q);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo5163b() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.n.c r0 = r8.f4123l     // Catch:{ all -> 0x00f0 }
            int r0 = r0.f4096c     // Catch:{ all -> 0x00f0 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r3.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f0 }
            com.bumptech.glide.n.c r4 = r8.f4123l     // Catch:{ all -> 0x00f0 }
            int r4 = r4.f4096c     // Catch:{ all -> 0x00f0 }
            r3.append(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f0 }
            int r4 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            r3.append(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f0 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f0 }
        L_0x0039:
            r8.f4126o = r2     // Catch:{ all -> 0x00f0 }
        L_0x003b:
            int r0 = r8.f4126o     // Catch:{ all -> 0x00f0 }
            r3 = 0
            if (r0 == r2) goto L_0x00ce
            int r0 = r8.f4126o     // Catch:{ all -> 0x00f0 }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00ce
        L_0x0047:
            r0 = 0
            r8.f4126o = r0     // Catch:{ all -> 0x00f0 }
            byte[] r5 = r8.f4116e     // Catch:{ all -> 0x00f0 }
            if (r5 != 0) goto L_0x0058
            com.bumptech.glide.n.a$a r5 = r8.f4114c     // Catch:{ all -> 0x00f0 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo5088a(r6)     // Catch:{ all -> 0x00f0 }
            r8.f4116e = r5     // Catch:{ all -> 0x00f0 }
        L_0x0058:
            com.bumptech.glide.n.c r5 = r8.f4123l     // Catch:{ all -> 0x00f0 }
            java.util.List<com.bumptech.glide.n.b> r5 = r5.f4098e     // Catch:{ all -> 0x00f0 }
            int r6 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f0 }
            com.bumptech.glide.n.b r5 = (com.bumptech.glide.p021n.C1228b) r5     // Catch:{ all -> 0x00f0 }
            int r6 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            com.bumptech.glide.n.c r7 = r8.f4123l     // Catch:{ all -> 0x00f0 }
            java.util.List<com.bumptech.glide.n.b> r7 = r7.f4098e     // Catch:{ all -> 0x00f0 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f0 }
            com.bumptech.glide.n.b r6 = (com.bumptech.glide.p021n.C1228b) r6     // Catch:{ all -> 0x00f0 }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f4093k     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x007c
            int[] r7 = r5.f4093k     // Catch:{ all -> 0x00f0 }
            goto L_0x0080
        L_0x007c:
            com.bumptech.glide.n.c r7 = r8.f4123l     // Catch:{ all -> 0x00f0 }
            int[] r7 = r7.f4094a     // Catch:{ all -> 0x00f0 }
        L_0x0080:
            r8.f4112a = r7     // Catch:{ all -> 0x00f0 }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f0 }
            int r4 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            r1.append(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00a4:
            r8.f4126o = r2     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)
            return r3
        L_0x00a8:
            boolean r1 = r5.f4088f     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00c8
            int[] r1 = r8.f4113b     // Catch:{ all -> 0x00f0 }
            int r3 = r7.length     // Catch:{ all -> 0x00f0 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r3)     // Catch:{ all -> 0x00f0 }
            int[] r1 = r8.f4113b     // Catch:{ all -> 0x00f0 }
            r8.f4112a = r1     // Catch:{ all -> 0x00f0 }
            int r3 = r5.f4090h     // Catch:{ all -> 0x00f0 }
            r1[r3] = r0     // Catch:{ all -> 0x00f0 }
            int r0 = r5.f4089g     // Catch:{ all -> 0x00f0 }
            if (r0 != r4) goto L_0x00c8
            int r0 = r8.f4122k     // Catch:{ all -> 0x00f0 }
            if (r0 != 0) goto L_0x00c8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00f0 }
            r8.f4130s = r0     // Catch:{ all -> 0x00f0 }
        L_0x00c8:
            android.graphics.Bitmap r0 = r8.m5777a(r5, r6)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)
            return r0
        L_0x00ce:
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = f4111u     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f0 }
            int r2 = r8.f4126o     // Catch:{ all -> 0x00f0 }
            r1.append(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r8)
            return r3
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p021n.C1231e.mo5163b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo5164c() {
        this.f4122k = (this.f4122k + 1) % this.f4123l.f4096c;
    }

    public void clear() {
        this.f4123l = null;
        byte[] bArr = this.f4120i;
        if (bArr != null) {
            this.f4114c.mo5086a(bArr);
        }
        int[] iArr = this.f4121j;
        if (iArr != null) {
            this.f4114c.mo5087a(iArr);
        }
        Bitmap bitmap = this.f4124m;
        if (bitmap != null) {
            this.f4114c.mo5085a(bitmap);
        }
        this.f4124m = null;
        this.f4115d = null;
        this.f4130s = null;
        byte[] bArr2 = this.f4116e;
        if (bArr2 != null) {
            this.f4114c.mo5086a(bArr2);
        }
    }

    /* renamed from: d */
    public int mo5166d() {
        return this.f4123l.f4096c;
    }

    /* renamed from: e */
    public int mo5167e() {
        if (this.f4123l.f4096c > 0) {
            int i = this.f4122k;
            if (i >= 0) {
                return mo5178a(i);
            }
        }
        return 0;
    }

    /* renamed from: f */
    public int mo5168f() {
        return this.f4115d.limit() + this.f4120i.length + (this.f4121j.length * 4);
    }

    /* renamed from: g */
    public ByteBuffer mo5169g() {
        return this.f4115d;
    }

    /* renamed from: h */
    public void mo5170h() {
        this.f4122k = -1;
    }
}
