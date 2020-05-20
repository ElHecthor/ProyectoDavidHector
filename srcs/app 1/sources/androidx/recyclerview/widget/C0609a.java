package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0566d0;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3319f;

/* renamed from: androidx.recyclerview.widget.a */
class C0609a implements C0661a {

    /* renamed from: a */
    private C3318e<C0611b> f2505a;

    /* renamed from: b */
    final ArrayList<C0611b> f2506b;

    /* renamed from: c */
    final ArrayList<C0611b> f2507c;

    /* renamed from: d */
    final C0610a f2508d;

    /* renamed from: e */
    Runnable f2509e;

    /* renamed from: f */
    final boolean f2510f;

    /* renamed from: g */
    final C0660q f2511g;

    /* renamed from: h */
    private int f2512h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C0610a {
        /* renamed from: a */
        C0566d0 mo3453a(int i);

        /* renamed from: a */
        void mo3454a(int i, int i2);

        /* renamed from: a */
        void mo3455a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo3456a(C0611b bVar);

        /* renamed from: b */
        void mo3457b(int i, int i2);

        /* renamed from: b */
        void mo3458b(C0611b bVar);

        /* renamed from: c */
        void mo3459c(int i, int i2);

        /* renamed from: d */
        void mo3461d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C0611b {

        /* renamed from: a */
        int f2513a;

        /* renamed from: b */
        int f2514b;

        /* renamed from: c */
        Object f2515c;

        /* renamed from: d */
        int f2516d;

        C0611b(int i, int i2, int i3, Object obj) {
            this.f2513a = i;
            this.f2514b = i2;
            this.f2516d = i3;
            this.f2515c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo3806a() {
            int i = this.f2513a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0611b.class != obj.getClass()) {
                return false;
            }
            C0611b bVar = (C0611b) obj;
            int i = this.f2513a;
            if (i != bVar.f2513a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2516d - this.f2514b) == 1 && this.f2516d == bVar.f2514b && this.f2514b == bVar.f2516d) {
                return true;
            }
            if (this.f2516d != bVar.f2516d || this.f2514b != bVar.f2514b) {
                return false;
            }
            Object obj2 = this.f2515c;
            Object obj3 = bVar.f2515c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2513a * 31) + this.f2514b) * 31) + this.f2516d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo3806a());
            sb.append(",s:");
            sb.append(this.f2514b);
            sb.append("c:");
            sb.append(this.f2516d);
            sb.append(",p:");
            sb.append(this.f2515c);
            sb.append("]");
            return sb.toString();
        }
    }

    C0609a(C0610a aVar) {
        this(aVar, false);
    }

    C0609a(C0610a aVar, boolean z) {
        this.f2505a = new C3319f(30);
        this.f2506b = new ArrayList<>();
        this.f2507c = new ArrayList<>();
        this.f2512h = 0;
        this.f2508d = aVar;
        this.f2510f = z;
        this.f2511g = new C0660q(this);
    }

    /* renamed from: b */
    private void m3502b(C0611b bVar) {
        m3509g(bVar);
    }

    /* renamed from: c */
    private void m3503c(C0611b bVar) {
        m3509g(bVar);
    }

    /* renamed from: d */
    private int m3504d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f2507c.size() - 1; size >= 0; size--) {
            C0611b bVar = (C0611b) this.f2507c.get(size);
            int i7 = bVar.f2513a;
            if (i7 == 8) {
                int i8 = bVar.f2514b;
                int i9 = bVar.f2516d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.f2514b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.f2514b = i11 + 1;
                            i4 = bVar.f2516d + 1;
                        } else if (i2 == 2) {
                            bVar.f2514b = i11 - 1;
                            i4 = bVar.f2516d - 1;
                        }
                        bVar.f2516d = i4;
                    }
                } else {
                    int i12 = bVar.f2514b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.f2516d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f2516d - 1;
                            }
                            i++;
                        }
                        bVar.f2516d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.f2514b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.f2514b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.f2514b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f2516d;
                } else if (i7 == 2) {
                    i += bVar.f2516d;
                }
            }
        }
        for (int size2 = this.f2507c.size() - 1; size2 >= 0; size2--) {
            C0611b bVar2 = (C0611b) this.f2507c.get(size2);
            if (bVar2.f2513a == 8) {
                int i14 = bVar2.f2516d;
                if (i14 != bVar2.f2514b && i14 >= 0) {
                }
            } else if (bVar2.f2516d > 0) {
            }
            this.f2507c.remove(size2);
            mo3792a(bVar2);
        }
        return i;
    }

    /* renamed from: d */
    private void m3505d(C0611b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f2514b;
        int i2 = bVar.f2516d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2508d.mo3453a(i3) != null || m3506d(i3)) {
                if (c2 == 0) {
                    m3508f(mo3790a(2, i, i4, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m3509g(mo3790a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f2516d) {
            mo3792a(bVar);
            bVar = mo3790a(2, i, i4, null);
        }
        if (c2 == 0) {
            m3508f(bVar);
        } else {
            m3509g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m3506d(int i) {
        int size = this.f2507c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0611b bVar = (C0611b) this.f2507c.get(i2);
            int i3 = bVar.f2513a;
            if (i3 == 8) {
                if (mo3789a(bVar.f2516d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2514b;
                int i5 = bVar.f2516d + i4;
                while (i4 < i5) {
                    if (mo3789a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m3507e(C0611b bVar) {
        int i = bVar.f2514b;
        int i2 = bVar.f2516d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f2508d.mo3453a(i) != null || m3506d(i)) {
                if (c == 0) {
                    m3508f(mo3790a(4, i3, i4, bVar.f2515c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m3509g(mo3790a(4, i3, i4, bVar.f2515c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2516d) {
            Object obj = bVar.f2515c;
            mo3792a(bVar);
            bVar = mo3790a(4, i3, i4, obj);
        }
        if (c == 0) {
            m3508f(bVar);
        } else {
            m3509g(bVar);
        }
    }

    /* renamed from: f */
    private void m3508f(C0611b bVar) {
        int i;
        int i2 = bVar.f2513a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m3504d(bVar.f2514b, i2);
        int i3 = bVar.f2514b;
        int i4 = bVar.f2513a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2516d; i6++) {
            int d2 = m3504d(bVar.f2514b + (i * i6), bVar.f2513a);
            int i7 = bVar.f2513a;
            if (i7 == 2 ? d2 == d : i7 == 4 && d2 == d + 1) {
                i5++;
            } else {
                C0611b a = mo3790a(bVar.f2513a, d, i5, bVar.f2515c);
                mo3793a(a, i3);
                mo3792a(a);
                if (bVar.f2513a == 4) {
                    i3 += i5;
                }
                d = d2;
                i5 = 1;
            }
        }
        Object obj = bVar.f2515c;
        mo3792a(bVar);
        if (i5 > 0) {
            C0611b a2 = mo3790a(bVar.f2513a, d, i5, obj);
            mo3793a(a2, i3);
            mo3792a(a2);
        }
    }

    /* renamed from: g */
    private void m3509g(C0611b bVar) {
        this.f2507c.add(bVar);
        int i = bVar.f2513a;
        if (i == 1) {
            this.f2508d.mo3459c(bVar.f2514b, bVar.f2516d);
        } else if (i == 2) {
            this.f2508d.mo3457b(bVar.f2514b, bVar.f2516d);
        } else if (i == 4) {
            this.f2508d.mo3455a(bVar.f2514b, bVar.f2516d, bVar.f2515c);
        } else if (i == 8) {
            this.f2508d.mo3454a(bVar.f2514b, bVar.f2516d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public int mo3788a(int i) {
        int size = this.f2506b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0611b bVar = (C0611b) this.f2506b.get(i2);
            int i3 = bVar.f2513a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2514b;
                    if (i4 <= i) {
                        int i5 = bVar.f2516d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2514b;
                    if (i6 == i) {
                        i = bVar.f2516d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2516d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2514b <= i) {
                i += bVar.f2516d;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3789a(int i, int i2) {
        int size = this.f2507c.size();
        while (i2 < size) {
            C0611b bVar = (C0611b) this.f2507c.get(i2);
            int i3 = bVar.f2513a;
            if (i3 == 8) {
                int i4 = bVar.f2514b;
                if (i4 == i) {
                    i = bVar.f2516d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2516d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2514b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2516d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2516d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C0611b mo3790a(int i, int i2, int i3, Object obj) {
        C0611b bVar = (C0611b) this.f2505a.mo5387a();
        if (bVar == null) {
            return new C0611b(i, i2, i3, obj);
        }
        bVar.f2513a = i;
        bVar.f2514b = i2;
        bVar.f2516d = i3;
        bVar.f2515c = obj;
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3791a() {
        int size = this.f2507c.size();
        for (int i = 0; i < size; i++) {
            this.f2508d.mo3456a((C0611b) this.f2507c.get(i));
        }
        mo3794a((List<C0611b>) this.f2507c);
        this.f2512h = 0;
    }

    /* renamed from: a */
    public void mo3792a(C0611b bVar) {
        if (!this.f2510f) {
            bVar.f2515c = null;
            this.f2505a.mo5388a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3793a(C0611b bVar, int i) {
        this.f2508d.mo3458b(bVar);
        int i2 = bVar.f2513a;
        if (i2 == 2) {
            this.f2508d.mo3461d(i, bVar.f2516d);
        } else if (i2 == 4) {
            this.f2508d.mo3455a(i, bVar.f2516d, bVar.f2515c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3794a(List<C0611b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3792a((C0611b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3795a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f2506b.add(mo3790a(8, i, i2, null));
            this.f2512h |= 8;
            if (this.f2506b.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3796a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2506b.add(mo3790a(4, i, i2, obj));
        this.f2512h |= 4;
        if (this.f2506b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo3797b(int i) {
        return mo3789a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3798b() {
        mo3791a();
        int size = this.f2506b.size();
        for (int i = 0; i < size; i++) {
            C0611b bVar = (C0611b) this.f2506b.get(i);
            int i2 = bVar.f2513a;
            if (i2 == 1) {
                this.f2508d.mo3456a(bVar);
                this.f2508d.mo3459c(bVar.f2514b, bVar.f2516d);
            } else if (i2 == 2) {
                this.f2508d.mo3456a(bVar);
                this.f2508d.mo3461d(bVar.f2514b, bVar.f2516d);
            } else if (i2 == 4) {
                this.f2508d.mo3456a(bVar);
                this.f2508d.mo3455a(bVar.f2514b, bVar.f2516d, bVar.f2515c);
            } else if (i2 == 8) {
                this.f2508d.mo3456a(bVar);
                this.f2508d.mo3454a(bVar.f2514b, bVar.f2516d);
            }
            Runnable runnable = this.f2509e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo3794a((List<C0611b>) this.f2506b);
        this.f2512h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3799b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2506b.add(mo3790a(1, i, i2, null));
        this.f2512h |= 1;
        if (this.f2506b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3800c() {
        return this.f2506b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3801c(int i) {
        return (i & this.f2512h) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3802c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2506b.add(mo3790a(2, i, i2, null));
        this.f2512h |= 2;
        if (this.f2506b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo3803d() {
        return !this.f2507c.isEmpty() && !this.f2506b.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3804e() {
        this.f2511g.mo3936a(this.f2506b);
        int size = this.f2506b.size();
        for (int i = 0; i < size; i++) {
            C0611b bVar = (C0611b) this.f2506b.get(i);
            int i2 = bVar.f2513a;
            if (i2 == 1) {
                m3502b(bVar);
            } else if (i2 == 2) {
                m3505d(bVar);
            } else if (i2 == 4) {
                m3507e(bVar);
            } else if (i2 == 8) {
                m3503c(bVar);
            }
            Runnable runnable = this.f2509e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2506b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3805f() {
        mo3794a((List<C0611b>) this.f2506b);
        mo3794a((List<C0611b>) this.f2507c);
        this.f2512h = 0;
    }
}
