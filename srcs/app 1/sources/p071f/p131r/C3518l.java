package p071f.p131r;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3490d.C3494c;

/* renamed from: f.r.l */
public abstract class C3518l<T> extends C3490d<Integer, T> {

    /* renamed from: f.r.l$a */
    static class C3519a<Value> extends C3485b<Integer, Value> {

        /* renamed from: c */
        final C3518l<Value> f9983c;

        C3519a(C3518l<Value> lVar) {
            this.f9983c = lVar;
        }

        /* renamed from: a */
        public <ToValue> C3490d<Integer, ToValue> mo11126a(C3151a<List<Value>, List<ToValue>> aVar) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Integer m14429a(int i, Value value) {
            return Integer.valueOf(i);
        }

        /* renamed from: a */
        public void mo11127a() {
            this.f9983c.mo11127a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11104a(int i, Value value, int i2, Executor executor, C3502a<Value> aVar) {
            this.f9983c.mo11213a(1, i + 1, i2, executor, aVar);
        }

        /* renamed from: a */
        public void mo11128a(C3494c cVar) {
            this.f9983c.mo11128a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11105a(Integer num, int i, int i2, boolean z, Executor executor, C3502a<Value> aVar) {
            Integer num2;
            if (num == null) {
                num2 = Integer.valueOf(0);
            } else {
                i = Math.max(i / i2, 2) * i2;
                num2 = Integer.valueOf(Math.max(0, ((num.intValue() - (i / 2)) / i2) * i2));
            }
            this.f9983c.mo11214a(false, num2.intValue(), i, i2, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo11106b(int i, Value value, int i2, Executor executor, C3502a<Value> aVar) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.f9983c.mo11213a(2, i3, 0, executor, aVar);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.f9983c.mo11213a(2, (i3 - min) + 1, min, executor, aVar);
        }

        /* renamed from: b */
        public void mo11129b(C3494c cVar) {
            this.f9983c.mo11129b(cVar);
        }

        /* renamed from: c */
        public boolean mo4146c() {
            return this.f9983c.mo4146c();
        }
    }

    /* renamed from: f.r.l$b */
    public static abstract class C3520b<T> {
        /* renamed from: a */
        public abstract void mo11217a(List<T> list, int i);

        /* renamed from: a */
        public abstract void mo11218a(List<T> list, int i, int i2);
    }

    /* renamed from: f.r.l$c */
    static class C3521c<T> extends C3520b<T> {

        /* renamed from: a */
        final C3495d<T> f9984a;

        /* renamed from: b */
        private final boolean f9985b;

        /* renamed from: c */
        private final int f9986c;

        C3521c(C3518l lVar, boolean z, int i, C3502a<T> aVar) {
            this.f9984a = new C3495d<>(lVar, 0, null, aVar);
            this.f9985b = z;
            this.f9986c = i;
            if (i < 1) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        /* renamed from: a */
        public void mo11217a(List<T> list, int i) {
            if (this.f9984a.mo11137a()) {
                return;
            }
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.isEmpty() && i != 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            } else if (!this.f9985b) {
                this.f9984a.mo11135a(new C3501g<>(list, i));
            } else {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
        }

        /* renamed from: a */
        public void mo11218a(List<T> list, int i, int i2) {
            if (!this.f9984a.mo11137a()) {
                C3495d.m14305a(list, i, i2);
                if (list.size() + i != i2 && list.size() % this.f9986c != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize ");
                    sb.append(list.size());
                    sb.append(", position ");
                    sb.append(i);
                    sb.append(", totalCount ");
                    sb.append(i2);
                    sb.append(", pageSize ");
                    sb.append(this.f9986c);
                    throw new IllegalArgumentException(sb.toString());
                } else if (this.f9985b) {
                    this.f9984a.mo11135a(new C3501g<>(list, i, (i2 - i) - list.size(), 0));
                } else {
                    this.f9984a.mo11135a(new C3501g<>(list, i));
                }
            }
        }
    }

    /* renamed from: f.r.l$d */
    public static class C3522d {

        /* renamed from: a */
        public final int f9987a;

        /* renamed from: b */
        public final int f9988b;

        /* renamed from: c */
        public final int f9989c;

        public C3522d(int i, int i2, int i3, boolean z) {
            this.f9987a = i;
            this.f9988b = i2;
            this.f9989c = i3;
        }
    }

    /* renamed from: f.r.l$e */
    public static abstract class C3523e<T> {
        /* renamed from: a */
        public abstract void mo11219a(List<T> list);
    }

    /* renamed from: f.r.l$f */
    static class C3524f<T> extends C3523e<T> {

        /* renamed from: a */
        private C3495d<T> f9990a;

        /* renamed from: b */
        private final int f9991b;

        C3524f(C3518l lVar, int i, int i2, Executor executor, C3502a<T> aVar) {
            this.f9990a = new C3495d<>(lVar, i, executor, aVar);
            this.f9991b = i2;
        }

        /* renamed from: a */
        public void mo11219a(List<T> list) {
            if (!this.f9990a.mo11137a()) {
                this.f9990a.mo11135a(new C3501g<>(list, 0, 0, this.f9991b));
            }
        }
    }

    /* renamed from: f.r.l$g */
    public static class C3525g {

        /* renamed from: a */
        public final int f9992a;

        /* renamed from: b */
        public final int f9993b;

        public C3525g(int i, int i2) {
            this.f9992a = i;
            this.f9993b = i2;
        }
    }

    /* renamed from: a */
    public static int m14417a(C3522d dVar, int i) {
        int i2 = dVar.f9987a;
        int i3 = dVar.f9988b;
        int i4 = dVar.f9989c;
        return Math.max(0, Math.min(((((i - i3) + i4) - 1) / i4) * i4, (i2 / i4) * i4));
    }

    /* renamed from: a */
    public static int m14418a(C3522d dVar, int i, int i2) {
        return Math.min(i2 - i, dVar.f9988b);
    }

    /* renamed from: a */
    public final <V> C3518l<V> m14420a(C3151a<List<T>, List<V>> aVar) {
        return new C3530o(this, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11213a(int i, int i2, int i3, Executor executor, C3502a<T> aVar) {
        C3524f fVar = new C3524f(this, i, i2, executor, aVar);
        if (i3 == 0) {
            fVar.mo11219a(Collections.emptyList());
        } else {
            mo4145a(new C3525g(i2, i3), (C3523e<T>) fVar);
        }
    }

    /* renamed from: a */
    public abstract void mo4144a(C3522d dVar, C3520b<T> bVar);

    /* renamed from: a */
    public abstract void mo4145a(C3525g gVar, C3523e<T> eVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11214a(boolean z, int i, int i2, int i3, Executor executor, C3502a<T> aVar) {
        C3521c cVar = new C3521c(this, z, i3, aVar);
        mo4144a(new C3522d(i, i2, i3, z), (C3520b<T>) cVar);
        cVar.f9984a.mo11136a(executor);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo11107b() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3485b<Integer, T> mo11215d() {
        return new C3519a(this);
    }
}
