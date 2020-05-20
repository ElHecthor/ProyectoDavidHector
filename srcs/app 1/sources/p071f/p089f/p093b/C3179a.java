package p071f.p089f.p093b;

import java.util.Arrays;
import p071f.p089f.p093b.C3188i.C3189a;

/* renamed from: f.f.b.a */
public class C3179a {

    /* renamed from: a */
    int f9000a = 0;

    /* renamed from: b */
    private final C3180b f9001b;

    /* renamed from: c */
    private final C3181c f9002c;

    /* renamed from: d */
    private int f9003d = 8;

    /* renamed from: e */
    private C3188i f9004e = null;

    /* renamed from: f */
    private int[] f9005f = new int[8];

    /* renamed from: g */
    private int[] f9006g = new int[8];

    /* renamed from: h */
    private float[] f9007h = new float[8];

    /* renamed from: i */
    private int f9008i = -1;

    /* renamed from: j */
    private int f9009j = -1;

    /* renamed from: k */
    private boolean f9010k = false;

    C3179a(C3180b bVar, C3181c cVar) {
        this.f9001b = bVar;
        this.f9002c = cVar;
    }

    /* renamed from: a */
    private boolean m12863a(C3188i iVar, C3183e eVar) {
        return iVar.f9072j <= 1;
    }

    /* renamed from: a */
    public final float mo10300a(C3188i iVar, boolean z) {
        if (this.f9004e == iVar) {
            this.f9004e = null;
        }
        int i = this.f9008i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f9000a) {
            if (this.f9005f[i] == iVar.f9064b) {
                if (i == this.f9008i) {
                    this.f9008i = this.f9006g[i];
                } else {
                    int[] iArr = this.f9006g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo10369b(this.f9001b);
                }
                iVar.f9072j--;
                this.f9000a--;
                this.f9005f[i] = -1;
                if (this.f9010k) {
                    this.f9009j = i;
                }
                return this.f9007h[i];
            }
            i2++;
            i3 = i;
            i = this.f9006g[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3188i mo10301a(int i) {
        int i2 = this.f9008i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f9000a) {
            if (i3 == i) {
                return this.f9002c.f9018c[this.f9005f[i2]];
            }
            i2 = this.f9006g[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p071f.p089f.p093b.C3188i mo10302a(p071f.p089f.p093b.C3183e r15) {
        /*
            r14 = this;
            int r0 = r14.f9008i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            r9 = -1
            if (r0 == r9) goto L_0x008a
            int r9 = r14.f9000a
            if (r4 >= r9) goto L_0x008a
            float[] r9 = r14.f9007h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            f.f.b.c r12 = r14.f9002c
            f.f.b.i[] r12 = r12.f9018c
            int[] r13 = r14.f9005f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0031
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003d
            r9[r0] = r3
            goto L_0x0037
        L_0x0031:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003d
            r9[r0] = r3
        L_0x0037:
            f.f.b.b r9 = r14.f9001b
            r12.mo10369b(r9)
            r10 = 0
        L_0x003d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0083
            f.f.b.i$a r11 = r12.f9069g
            f.f.b.i$a r13 = p071f.p089f.p093b.C3188i.C3189a.UNRESTRICTED
            if (r11 != r13) goto L_0x0063
            if (r2 != 0) goto L_0x0052
        L_0x004a:
            boolean r2 = r14.m12863a(r12, r15)
            r5 = r2
            r7 = r10
            r2 = r12
            goto L_0x0083
        L_0x0052:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0057
            goto L_0x004a
        L_0x0057:
            if (r5 != 0) goto L_0x0083
            boolean r11 = r14.m12863a(r12, r15)
            if (r11 == 0) goto L_0x0083
            r7 = r10
            r2 = r12
            r5 = 1
            goto L_0x0083
        L_0x0063:
            if (r2 != 0) goto L_0x0083
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0083
            if (r1 != 0) goto L_0x0073
        L_0x006b:
            boolean r1 = r14.m12863a(r12, r15)
            r6 = r1
            r8 = r10
            r1 = r12
            goto L_0x0083
        L_0x0073:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0078
            goto L_0x006b
        L_0x0078:
            if (r6 != 0) goto L_0x0083
            boolean r11 = r14.m12863a(r12, r15)
            if (r11 == 0) goto L_0x0083
            r8 = r10
            r1 = r12
            r6 = 1
        L_0x0083:
            int[] r9 = r14.f9006g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto L_0x000b
        L_0x008a:
            if (r2 == 0) goto L_0x008d
            return r2
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.C3179a.mo10302a(f.f.b.e):f.f.b.i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3188i mo10303a(boolean[] zArr, C3188i iVar) {
        int i = this.f9008i;
        int i2 = 0;
        C3188i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f9000a) {
            if (this.f9007h[i] < 0.0f) {
                C3188i iVar3 = this.f9002c.f9018c[this.f9005f[i]];
                if ((zArr == null || !zArr[iVar3.f9064b]) && iVar3 != iVar) {
                    C3189a aVar = iVar3.f9069g;
                    if (aVar == C3189a.SLACK || aVar == C3189a.ERROR) {
                        float f2 = this.f9007h[i];
                        if (f2 < f) {
                            iVar2 = iVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f9006g[i];
            i2++;
        }
        return iVar2;
    }

    /* renamed from: a */
    public final void mo10304a() {
        int i = this.f9008i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            C3188i iVar = this.f9002c.f9018c[this.f9005f[i]];
            if (iVar != null) {
                iVar.mo10369b(this.f9001b);
            }
            i = this.f9006g[i];
            i2++;
        }
        this.f9008i = -1;
        this.f9009j = -1;
        this.f9010k = false;
        this.f9000a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10305a(float f) {
        int i = this.f9008i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            float[] fArr = this.f9007h;
            fArr[i] = fArr[i] / f;
            i = this.f9006g[i];
            i2++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10306a(C3180b bVar, C3180b bVar2, boolean z) {
        int i = this.f9008i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f9000a) {
                int i3 = this.f9005f[i];
                C3188i iVar = bVar2.f9011a;
                if (i3 == iVar.f9064b) {
                    float f = this.f9007h[i];
                    mo10300a(iVar, z);
                    C3179a aVar = bVar2.f9014d;
                    int i4 = aVar.f9008i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f9000a) {
                        mo10309a(this.f9002c.f9018c[aVar.f9005f[i4]], aVar.f9007h[i4] * f, z);
                        i4 = aVar.f9006g[i4];
                        i5++;
                    }
                    bVar.f9012b += bVar2.f9012b * f;
                    if (z) {
                        bVar2.f9011a.mo10369b(bVar);
                    }
                    i = this.f9008i;
                } else {
                    i = this.f9006g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10307a(C3180b bVar, C3180b[] bVarArr) {
        int i = this.f9008i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f9000a) {
                C3188i iVar = this.f9002c.f9018c[this.f9005f[i]];
                if (iVar.f9065c != -1) {
                    float f = this.f9007h[i];
                    mo10300a(iVar, true);
                    C3180b bVar2 = bVarArr[iVar.f9065c];
                    if (!bVar2.f9015e) {
                        C3179a aVar = bVar2.f9014d;
                        int i3 = aVar.f9008i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f9000a) {
                            mo10309a(this.f9002c.f9018c[aVar.f9005f[i3]], aVar.f9007h[i3] * f, true);
                            i3 = aVar.f9006g[i3];
                            i4++;
                        }
                    }
                    bVar.f9012b += bVar2.f9012b * f;
                    bVar2.f9011a.mo10369b(bVar);
                    i = this.f9008i;
                } else {
                    i = this.f9006g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo10308a(C3188i iVar, float f) {
        if (f == 0.0f) {
            mo10300a(iVar, true);
            return;
        }
        int i = this.f9008i;
        if (i == -1) {
            this.f9008i = 0;
            this.f9007h[0] = f;
            this.f9005f[0] = iVar.f9064b;
            this.f9006g[0] = -1;
            iVar.f9072j++;
            iVar.mo10367a(this.f9001b);
            this.f9000a++;
            if (!this.f9010k) {
                int i2 = this.f9009j + 1;
                this.f9009j = i2;
                int[] iArr = this.f9005f;
                if (i2 >= iArr.length) {
                    this.f9010k = true;
                    this.f9009j = iArr.length - 1;
                }
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f9000a) {
            int[] iArr2 = this.f9005f;
            int i5 = iArr2[i];
            int i6 = iVar.f9064b;
            if (i5 == i6) {
                this.f9007h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f9006g[i];
            i3++;
        }
        int i7 = this.f9009j;
        int i8 = i7 + 1;
        if (this.f9010k) {
            int[] iArr3 = this.f9005f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f9005f;
        if (i7 >= iArr4.length && this.f9000a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f9005f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f9005f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f9003d * 2;
            this.f9003d = i10;
            this.f9010k = false;
            this.f9009j = i7 - 1;
            this.f9007h = Arrays.copyOf(this.f9007h, i10);
            this.f9005f = Arrays.copyOf(this.f9005f, this.f9003d);
            this.f9006g = Arrays.copyOf(this.f9006g, this.f9003d);
        }
        this.f9005f[i7] = iVar.f9064b;
        this.f9007h[i7] = f;
        int[] iArr7 = this.f9006g;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f9008i;
            this.f9008i = i7;
        }
        iVar.f9072j++;
        iVar.mo10367a(this.f9001b);
        this.f9000a++;
        if (!this.f9010k) {
            this.f9009j++;
        }
        if (this.f9000a >= this.f9005f.length) {
            this.f9010k = true;
        }
        int i11 = this.f9009j;
        int[] iArr8 = this.f9005f;
        if (i11 >= iArr8.length) {
            this.f9010k = true;
            this.f9009j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10309a(C3188i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f9008i;
            if (i == -1) {
                this.f9008i = 0;
                this.f9007h[0] = f;
                this.f9005f[0] = iVar.f9064b;
                this.f9006g[0] = -1;
                iVar.f9072j++;
                iVar.mo10367a(this.f9001b);
                this.f9000a++;
                if (!this.f9010k) {
                    int i2 = this.f9009j + 1;
                    this.f9009j = i2;
                    int[] iArr = this.f9005f;
                    if (i2 >= iArr.length) {
                        this.f9010k = true;
                        this.f9009j = iArr.length - 1;
                    }
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f9000a) {
                int[] iArr2 = this.f9005f;
                int i5 = iArr2[i];
                int i6 = iVar.f9064b;
                if (i5 == i6) {
                    float[] fArr = this.f9007h;
                    fArr[i] = fArr[i] + f;
                    if (fArr[i] == 0.0f) {
                        if (i == this.f9008i) {
                            this.f9008i = this.f9006g[i];
                        } else {
                            int[] iArr3 = this.f9006g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo10369b(this.f9001b);
                        }
                        if (this.f9010k) {
                            this.f9009j = i;
                        }
                        iVar.f9072j--;
                        this.f9000a--;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f9006g[i];
                i3++;
            }
            int i7 = this.f9009j;
            int i8 = i7 + 1;
            if (this.f9010k) {
                int[] iArr4 = this.f9005f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f9005f;
            if (i7 >= iArr5.length && this.f9000a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f9005f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f9005f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f9003d * 2;
                this.f9003d = i10;
                this.f9010k = false;
                this.f9009j = i7 - 1;
                this.f9007h = Arrays.copyOf(this.f9007h, i10);
                this.f9005f = Arrays.copyOf(this.f9005f, this.f9003d);
                this.f9006g = Arrays.copyOf(this.f9006g, this.f9003d);
            }
            this.f9005f[i7] = iVar.f9064b;
            this.f9007h[i7] = f;
            int[] iArr8 = this.f9006g;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f9008i;
                this.f9008i = i7;
            }
            iVar.f9072j++;
            iVar.mo10367a(this.f9001b);
            this.f9000a++;
            if (!this.f9010k) {
                this.f9009j++;
            }
            int i11 = this.f9009j;
            int[] iArr9 = this.f9005f;
            if (i11 >= iArr9.length) {
                this.f9010k = true;
                this.f9009j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10310a(C3188i iVar) {
        int i = this.f9008i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            if (this.f9005f[i] == iVar.f9064b) {
                return true;
            }
            i = this.f9006g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo10311b(int i) {
        int i2 = this.f9008i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f9000a) {
            if (i3 == i) {
                return this.f9007h[i2];
            }
            i2 = this.f9006g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo10312b(C3188i iVar) {
        int i = this.f9008i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            if (this.f9005f[i] == iVar.f9064b) {
                return this.f9007h[i];
            }
            i = this.f9006g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo10313b() {
        int i = this.f9008i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            float[] fArr = this.f9007h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f9006g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f9008i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f9000a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f9007h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f9002c.f9018c[this.f9005f[i]]);
            str = sb5.toString();
            i = this.f9006g[i];
            i2++;
        }
        return str;
    }
}
