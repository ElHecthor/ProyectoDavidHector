package p071f.p131r;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f.r.j */
final class C3513j<T> extends AbstractList<T> {

    /* renamed from: o */
    private static final List f9965o = new ArrayList();

    /* renamed from: f */
    private int f9966f;

    /* renamed from: g */
    private final ArrayList<List<T>> f9967g;

    /* renamed from: h */
    private int f9968h;

    /* renamed from: i */
    private int f9969i;

    /* renamed from: j */
    private int f9970j;

    /* renamed from: k */
    private int f9971k;

    /* renamed from: l */
    private int f9972l;

    /* renamed from: m */
    private int f9973m;

    /* renamed from: n */
    private int f9974n;

    /* renamed from: f.r.j$a */
    interface C3514a {
        /* renamed from: a */
        void mo11109a(int i, int i2);

        /* renamed from: a */
        void mo11110a(int i, int i2, int i3);

        /* renamed from: b */
        void mo11112b(int i, int i2);

        /* renamed from: b */
        void mo11113b(int i, int i2, int i3);

        /* renamed from: c */
        void mo11114c();

        /* renamed from: c */
        void mo11115c(int i);

        /* renamed from: c */
        void mo11116c(int i, int i2);

        /* renamed from: d */
        void mo11117d();

        /* renamed from: d */
        void mo11118d(int i);
    }

    C3513j() {
        this.f9966f = 0;
        this.f9967g = new ArrayList<>();
        this.f9968h = 0;
        this.f9969i = 0;
        this.f9970j = 0;
        this.f9971k = 0;
        this.f9972l = 1;
        this.f9973m = 0;
        this.f9974n = 0;
    }

    private C3513j(C3513j<T> jVar) {
        this.f9966f = jVar.f9966f;
        this.f9967g = new ArrayList<>(jVar.f9967g);
        this.f9968h = jVar.f9968h;
        this.f9969i = jVar.f9969i;
        this.f9970j = jVar.f9970j;
        this.f9971k = jVar.f9971k;
        this.f9972l = jVar.f9972l;
        this.f9973m = jVar.f9973m;
        this.f9974n = jVar.f9974n;
    }

    /* renamed from: a */
    private void m14365a(int i, List<T> list, int i2, int i3) {
        this.f9966f = i;
        this.f9967g.clear();
        this.f9967g.add(list);
        this.f9968h = i2;
        this.f9969i = i3;
        int size = list.size();
        this.f9970j = size;
        this.f9971k = size;
        this.f9972l = list.size();
        this.f9973m = 0;
        this.f9974n = 0;
    }

    /* renamed from: b */
    private boolean m14366b(int i, int i2, int i3) {
        List list = (List) this.f9967g.get(i3);
        return list == null || (this.f9970j > i && this.f9967g.size() > 2 && list != f9965o && this.f9970j - list.size() >= i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11181a(int i, int i2) {
        int i3;
        int i4 = this.f9966f / this.f9972l;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.f9967g.add(0, null);
                i5++;
            }
            int i6 = i3 * this.f9972l;
            this.f9971k += i6;
            this.f9966f -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.f9967g.size() + i) {
            int min = Math.min(this.f9968h, ((i2 + 1) - (this.f9967g.size() + i)) * this.f9972l);
            for (int size = this.f9967g.size(); size <= i2 - i; size++) {
                ArrayList<List<T>> arrayList = this.f9967g;
                arrayList.add(arrayList.size(), null);
            }
            this.f9971k += min;
            this.f9968h -= min;
        }
    }

    /* renamed from: a */
    public void mo11182a(int i, int i2, int i3, C3514a aVar) {
        int i4 = this.f9972l;
        if (i3 != i4) {
            if (i3 < i4) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.f9967g.size() == 1 && this.f9968h == 0) {
                this.f9972l = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = size();
        int i5 = this.f9972l;
        int i6 = ((size + i5) - 1) / i5;
        int max = Math.max((i - i2) / i5, 0);
        int min = Math.min((i + i2) / this.f9972l, i6 - 1);
        mo11181a(max, min);
        int i7 = this.f9966f / this.f9972l;
        while (max <= min) {
            int i8 = max - i7;
            if (this.f9967g.get(i8) == null) {
                this.f9967g.set(i8, f9965o);
                aVar.mo11118d(max);
            }
            max++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11183a(int i, List<T> list, int i2, int i3, int i4, C3514a aVar) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                m14365a(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                mo11185a(i6 + i, subList, (C3514a) null);
            }
            i5 = i7;
        }
        aVar.mo11115c(size());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11184a(int i, List<T> list, int i2, int i3, C3514a aVar) {
        m14365a(i, list, i2, i3);
        aVar.mo11115c(size());
    }

    /* renamed from: a */
    public void mo11185a(int i, List<T> list, C3514a aVar) {
        int size = list.size();
        if (size != this.f9972l) {
            int size2 = size();
            int i2 = this.f9972l;
            boolean z = false;
            boolean z2 = i == size2 - (size2 % i2) && size < i2;
            if (this.f9968h == 0 && this.f9967g.size() == 1 && size > this.f9972l) {
                z = true;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z) {
                this.f9972l = size;
            }
        }
        int i3 = i / this.f9972l;
        mo11181a(i3, i3);
        int i4 = i3 - (this.f9966f / this.f9972l);
        List list2 = (List) this.f9967g.get(i4);
        if (list2 == null || list2 == f9965o) {
            this.f9967g.set(i4, list);
            this.f9970j += size;
            if (aVar != null) {
                aVar.mo11112b(i, size);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid position ");
        sb.append(i);
        sb.append(": data already loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11186a(List<T> list, C3514a aVar) {
        int size = list.size();
        if (size == 0) {
            aVar.mo11114c();
            return;
        }
        if (this.f9972l > 0) {
            ArrayList<List<T>> arrayList = this.f9967g;
            int size2 = ((List) arrayList.get(arrayList.size() - 1)).size();
            int i = this.f9972l;
            if (size2 != i || size > i) {
                this.f9972l = -1;
            }
        }
        this.f9967g.add(list);
        this.f9970j += size;
        this.f9971k += size;
        int min = Math.min(this.f9968h, size);
        int i2 = size - min;
        if (min != 0) {
            this.f9968h -= min;
        }
        this.f9974n += size;
        aVar.mo11113b((this.f9966f + this.f9971k) - size, min, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11187a(int i, int i2, int i3) {
        return this.f9970j + i3 > i && this.f9967g.size() > 1 && this.f9970j >= i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11188a(int i, boolean z) {
        if (this.f9972l < 1 || this.f9967g.size() < 2) {
            throw new IllegalStateException("Trimming attempt before sufficient load");
        }
        int i2 = this.f9966f;
        if (i < i2) {
            return z;
        }
        if (i >= this.f9971k + i2) {
            return !z;
        }
        int i3 = (i - i2) / this.f9972l;
        if (z) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f9967g.get(i4) != null) {
                    return false;
                }
            }
        } else {
            for (int size = this.f9967g.size() - 1; size > i3; size--) {
                if (this.f9967g.get(size) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11189a(boolean z, int i, int i2, C3514a aVar) {
        int i3 = 0;
        while (mo11195c(i, i2)) {
            ArrayList<List<T>> arrayList = this.f9967g;
            List list = (List) arrayList.remove(arrayList.size() - 1);
            int size = list == null ? this.f9972l : list.size();
            i3 += size;
            this.f9971k -= size;
            this.f9970j -= list == null ? 0 : list.size();
        }
        if (i3 > 0) {
            int i4 = this.f9966f + this.f9971k;
            if (z) {
                this.f9968h += i3;
                aVar.mo11116c(i4, i3);
            } else {
                aVar.mo11109a(i4, i3);
            }
        }
        return i3 > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11190b(int i, List<T> list, int i2, int i3, int i4, C3514a aVar) {
        boolean z = i3 != Integer.MAX_VALUE;
        boolean z2 = i2 > mo11202h();
        if (!z || !mo11187a(i3, i4, list.size()) || !mo11188a(i, z2)) {
            mo11185a(i, list, aVar);
        } else {
            this.f9967g.set((i - this.f9966f) / this.f9972l, null);
            this.f9971k -= list.size();
            ArrayList<List<T>> arrayList = this.f9967g;
            if (z2) {
                arrayList.remove(0);
                this.f9966f += list.size();
            } else {
                arrayList.remove(arrayList.size() - 1);
                this.f9968h += list.size();
            }
        }
        if (!z) {
            return;
        }
        if (z2) {
            mo11193b(true, i3, i4, aVar);
        } else {
            mo11189a(true, i3, i4, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11191b(List<T> list, C3514a aVar) {
        int size = list.size();
        if (size == 0) {
            aVar.mo11117d();
            return;
        }
        int i = this.f9972l;
        if (i > 0 && size != i) {
            if (this.f9967g.size() != 1 || size <= this.f9972l) {
                this.f9972l = -1;
            } else {
                this.f9972l = size;
            }
        }
        this.f9967g.add(0, list);
        this.f9970j += size;
        this.f9971k += size;
        int min = Math.min(this.f9966f, size);
        int i2 = size - min;
        if (min != 0) {
            this.f9966f -= min;
        }
        this.f9969i -= i2;
        this.f9973m += size;
        aVar.mo11110a(this.f9966f, min, i2);
    }

    /* renamed from: b */
    public boolean mo11192b(int i, int i2) {
        int i3 = this.f9966f / i;
        if (i2 < i3 || i2 >= this.f9967g.size() + i3) {
            return false;
        }
        List list = (List) this.f9967g.get(i2 - i3);
        return (list == null || list == f9965o) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo11193b(boolean z, int i, int i2, C3514a aVar) {
        int i3 = 0;
        while (mo11197d(i, i2)) {
            List list = (List) this.f9967g.remove(0);
            int size = list == null ? this.f9972l : list.size();
            i3 += size;
            this.f9971k -= size;
            this.f9970j -= list == null ? 0 : list.size();
        }
        if (i3 > 0) {
            if (z) {
                int i4 = this.f9966f;
                this.f9966f = i4 + i3;
                aVar.mo11116c(i4, i3);
            } else {
                this.f9969i += i3;
                aVar.mo11109a(this.f9966f, i3);
            }
        }
        return i3 > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo11194c() {
        int i = this.f9966f;
        int size = this.f9967g.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f9967g.get(i2);
            if (list != null && list != f9965o) {
                break;
            }
            i += this.f9972l;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo11195c(int i, int i2) {
        return m14366b(i, i2, this.f9967g.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo11196d() {
        int i = this.f9968h;
        for (int size = this.f9967g.size() - 1; size >= 0; size--) {
            List list = (List) this.f9967g.get(size);
            if (list != null && list != f9965o) {
                break;
            }
            i += this.f9972l;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo11197d(int i, int i2) {
        return m14366b(i, i2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public T mo11198e() {
        return ((List) this.f9967g.get(0)).get(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public T mo11199f() {
        ArrayList<List<T>> arrayList = this.f9967g;
        List list = (List) arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo11200g() {
        return this.f9966f;
    }

    public T get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = i - this.f9966f;
        if (i3 >= 0 && i3 < this.f9971k) {
            if (mo11209q()) {
                int i4 = this.f9972l;
                i2 = i3 / i4;
                i3 %= i4;
            } else {
                int size = this.f9967g.size();
                i2 = 0;
                while (i2 < size) {
                    int size2 = ((List) this.f9967g.get(i2)).size();
                    if (size2 > i3) {
                        break;
                    }
                    i3 -= size2;
                    i2++;
                }
            }
            List list = (List) this.f9967g.get(i2);
            if (!(list == null || list.size() == 0)) {
                return list.get(i3);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo11202h() {
        return this.f9966f + this.f9969i + (this.f9971k / 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo11203i() {
        return this.f9974n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo11204k() {
        return this.f9973m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public int mo11205l() {
        return this.f9967g.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int mo11206m() {
        return this.f9969i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public int mo11207o() {
        return this.f9971k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public int mo11208p() {
        return this.f9968h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo11209q() {
        return this.f9972l > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C3513j<T> mo11210r() {
        return new C3513j<>(this);
    }

    public int size() {
        return this.f9966f + this.f9971k + this.f9968h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("leading ");
        sb.append(this.f9966f);
        sb.append(", storage ");
        sb.append(this.f9971k);
        sb.append(", trailing ");
        sb.append(mo11208p());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < this.f9967g.size(); i++) {
            sb2.append(" ");
            sb2.append(this.f9967g.get(i));
        }
        return sb2.toString();
    }
}
