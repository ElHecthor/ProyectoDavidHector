package p071f.p112j.p114b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: f.j.b.b */
class C3407b {

    /* renamed from: f.j.b.b$a */
    public interface C3408a<T> {
        /* renamed from: a */
        void mo10898a(T t, Rect rect);
    }

    /* renamed from: f.j.b.b$b */
    public interface C3409b<T, V> {
        /* renamed from: a */
        int mo10900a(T t);

        /* renamed from: a */
        V mo10902a(T t, int i);
    }

    /* renamed from: f.j.b.b$c */
    private static class C3410c<T> implements Comparator<T> {

        /* renamed from: f */
        private final Rect f9636f = new Rect();

        /* renamed from: g */
        private final Rect f9637g = new Rect();

        /* renamed from: h */
        private final boolean f9638h;

        /* renamed from: i */
        private final C3408a<T> f9639i;

        C3410c(boolean z, C3408a<T> aVar) {
            this.f9638h = z;
            this.f9639i = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f9636f;
            Rect rect2 = this.f9637g;
            this.f9639i.mo10898a(t, rect);
            this.f9639i.mo10898a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.f9638h) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.f9638h) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.f9638h) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.f9638h) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m13955a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m13956a(L l, C3409b<L, T> bVar, C3408a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo10900a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo10902a(l, i2));
        }
        Collections.sort(arrayList, new C3410c(z, aVar));
        if (i == 1) {
            return m13962b(t, arrayList, z2);
        }
        if (i == 2) {
            return m13958a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T m13957a(L r7, p071f.p112j.p114b.C3407b.C3409b<L, T> r8, p071f.p112j.p114b.C3407b.C3408a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L_0x0038
            r1 = 33
            if (r12 == r1) goto L_0x002e
            r1 = 66
            if (r12 == r1) goto L_0x0026
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L_0x001e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x0034
        L_0x001e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L_0x0026:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x003e
        L_0x002e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L_0x0034:
            r0.offset(r2, r1)
            goto L_0x0041
        L_0x0038:
            int r1 = r11.width()
            int r1 = r1 + 1
        L_0x003e:
            r0.offset(r1, r2)
        L_0x0041:
            r1 = 0
            int r3 = r8.mo10900a(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L_0x004b:
            if (r2 >= r3) goto L_0x0064
            java.lang.Object r5 = r8.mo10902a(r7, r2)
            if (r5 != r10) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            r9.mo10898a(r5, r4)
            boolean r6 = m13964b(r12, r11, r4, r0)
            if (r6 == 0) goto L_0x0061
            r0.set(r4)
            r1 = r5
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p112j.p114b.C3407b.m13957a(java.lang.Object, f.j.b.b$b, f.j.b.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: a */
    private static <T> T m13958a(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    private static boolean m13959a(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m13960a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m13959a(i, rect, rect2);
        boolean z = false;
        if (m13959a(i, rect, rect3) || !a) {
            return false;
        }
        if (!m13963b(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (m13965c(i, rect, rect2) < m13967e(i, rect, rect3)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m13961a(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: b */
    private static <T> T m13962b(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: b */
    private static boolean m13963b(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: b */
    private static boolean m13964b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!m13961a(rect, rect2, i)) {
            return false;
        }
        if (!m13961a(rect, rect3, i) || m13960a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m13960a(i, rect, rect3, rect2)) {
            return false;
        }
        if (m13955a(m13965c(i, rect, rect2), m13969g(i, rect, rect2)) < m13955a(m13965c(i, rect, rect3), m13969g(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private static int m13965c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m13966d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m13966d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: e */
    private static int m13967e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m13968f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m13968f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: g */
    private static int m13969g(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
