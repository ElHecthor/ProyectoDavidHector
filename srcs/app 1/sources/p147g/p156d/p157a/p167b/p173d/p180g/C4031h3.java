package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.h3 */
final class C4031h3 {
    /* renamed from: a */
    static int m16469a(int i, byte[] bArr, int i2, int i3, C3914a5<?> a5Var, C4077k3 k3Var) {
        C4263w4 w4Var = (C4263w4) a5Var;
        int a = m16478a(bArr, i2, k3Var);
        while (true) {
            w4Var.mo12888c(k3Var.f11063a);
            if (a >= i3) {
                break;
            }
            int a2 = m16478a(bArr, a, k3Var);
            if (i != k3Var.f11063a) {
                break;
            }
            a = m16478a(bArr, a2, k3Var);
        }
        return a;
    }

    /* renamed from: a */
    static int m16470a(int i, byte[] bArr, int i2, int i3, C4077k3 k3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m16479b(bArr, i2, k3Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m16478a(bArr, i2, k3Var) + k3Var.f11063a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m16478a(bArr, i2, k3Var);
                    i6 = k3Var.f11063a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m16470a(i6, bArr, i2, i3, k3Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C3968d5.m16209e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C3968d5.m16207c();
            }
        } else {
            throw C3968d5.m16207c();
        }
    }

    /* renamed from: a */
    static int m16471a(int i, byte[] bArr, int i2, int i3, C4140o7 o7Var, C4077k3 k3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m16479b(bArr, i2, k3Var);
                o7Var.mo12692a(i, (Object) Long.valueOf(k3Var.f11064b));
                return b;
            } else if (i4 == 1) {
                o7Var.mo12692a(i, (Object) Long.valueOf(m16480b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m16478a(bArr, i2, k3Var);
                int i5 = k3Var.f11063a;
                if (i5 < 0) {
                    throw C3968d5.m16206b();
                } else if (i5 <= bArr.length - a) {
                    o7Var.mo12692a(i, (Object) i5 == 0 ? C4092l3.f11077g : C4092l3.m16739a(bArr, a, i5));
                    return a + i5;
                } else {
                    throw C3968d5.m16205a();
                }
            } else if (i4 == 3) {
                C4140o7 e = C4140o7.m16896e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m16478a(bArr, i2, k3Var);
                    int i8 = k3Var.f11063a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m16471a(i7, bArr, a2, i3, e, k3Var);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C3968d5.m16209e();
                }
                o7Var.mo12692a(i, (Object) e);
                return i2;
            } else if (i4 == 5) {
                o7Var.mo12692a(i, (Object) Integer.valueOf(m16476a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C3968d5.m16207c();
            }
        } else {
            throw C3968d5.m16207c();
        }
    }

    /* renamed from: a */
    static int m16472a(int i, byte[] bArr, int i2, C4077k3 k3Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                k3Var.f11063a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            k3Var.f11063a = i7 | i3;
            return i8;
        }
        k3Var.f11063a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    static int m16473a(C4236u6<?> u6Var, int i, byte[] bArr, int i2, int i3, C3914a5<?> a5Var, C4077k3 k3Var) {
        int a = m16475a((C4236u6) u6Var, bArr, i2, i3, k3Var);
        while (true) {
            a5Var.add(k3Var.f11065c);
            if (a >= i3) {
                break;
            }
            int a2 = m16478a(bArr, a, k3Var);
            if (i != k3Var.f11063a) {
                break;
            }
            a = m16475a((C4236u6) u6Var, bArr, a2, i3, k3Var);
        }
        return a;
    }

    /* renamed from: a */
    static int m16474a(C4236u6 u6Var, byte[] bArr, int i, int i2, int i3, C4077k3 k3Var) {
        C4049i6 i6Var = (C4049i6) u6Var;
        Object a = i6Var.mo12543a();
        int a2 = i6Var.mo12542a(a, bArr, i, i2, i3, k3Var);
        i6Var.mo12549c(a);
        k3Var.f11065c = a;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m16475a(p147g.p156d.p157a.p167b.p173d.p180g.C4236u6 r6, byte[] r7, int r8, int r9, p147g.p156d.p157a.p167b.p173d.p180g.C4077k3 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m16472a(r8, r7, r0, r10)
            int r8 = r10.f11063a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo12543a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo12545a(r1, r2, r3, r4, r5)
            r6.mo12549c(r9)
            r10.f11065c = r9
            return r8
        L_0x0025:
            g.d.a.b.d.g.d5 r6 = p147g.p156d.p157a.p167b.p173d.p180g.C3968d5.m16205a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4031h3.m16475a(g.d.a.b.d.g.u6, byte[], int, int, g.d.a.b.d.g.k3):int");
    }

    /* renamed from: a */
    static int m16476a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m16477a(byte[] bArr, int i, C3914a5<?> a5Var, C4077k3 k3Var) {
        C4263w4 w4Var = (C4263w4) a5Var;
        int a = m16478a(bArr, i, k3Var);
        int i2 = k3Var.f11063a + a;
        while (a < i2) {
            a = m16478a(bArr, a, k3Var);
            w4Var.mo12888c(k3Var.f11063a);
        }
        if (a == i2) {
            return a;
        }
        throw C3968d5.m16205a();
    }

    /* renamed from: a */
    static int m16478a(byte[] bArr, int i, C4077k3 k3Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m16472a((int) b, bArr, i2, k3Var);
        }
        k3Var.f11063a = b;
        return i2;
    }

    /* renamed from: b */
    static int m16479b(byte[] bArr, int i, C4077k3 k3Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            k3Var.f11064b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        k3Var.f11064b = j3;
        return i3;
    }

    /* renamed from: b */
    static long m16480b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m16481c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m16480b(bArr, i));
    }

    /* renamed from: c */
    static int m16482c(byte[] bArr, int i, C4077k3 k3Var) {
        int a = m16478a(bArr, i, k3Var);
        int i2 = k3Var.f11063a;
        if (i2 < 0) {
            throw C3968d5.m16206b();
        } else if (i2 == 0) {
            k3Var.f11065c = "";
            return a;
        } else {
            k3Var.f11065c = new String(bArr, a, i2, C4248v4.f11358a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static float m16483d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m16476a(bArr, i));
    }

    /* renamed from: d */
    static int m16484d(byte[] bArr, int i, C4077k3 k3Var) {
        int a = m16478a(bArr, i, k3Var);
        int i2 = k3Var.f11063a;
        if (i2 < 0) {
            throw C3968d5.m16206b();
        } else if (i2 == 0) {
            k3Var.f11065c = "";
            return a;
        } else {
            k3Var.f11065c = C4237u7.m17275b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: e */
    static int m16485e(byte[] bArr, int i, C4077k3 k3Var) {
        int a = m16478a(bArr, i, k3Var);
        int i2 = k3Var.f11063a;
        if (i2 < 0) {
            throw C3968d5.m16206b();
        } else if (i2 > bArr.length - a) {
            throw C3968d5.m16205a();
        } else if (i2 == 0) {
            k3Var.f11065c = C4092l3.f11077g;
            return a;
        } else {
            k3Var.f11065c = C4092l3.m16739a(bArr, a, i2);
            return a + i2;
        }
    }
}
