package p071f.p131r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p071f.p080b.p081a.p084c.C3151a;

/* renamed from: f.r.d */
public abstract class C3490d<Key, Value> {

    /* renamed from: a */
    private AtomicBoolean f9892a = new AtomicBoolean(false);

    /* renamed from: b */
    private CopyOnWriteArrayList<C3494c> f9893b = new CopyOnWriteArrayList<>();

    /* renamed from: f.r.d$a */
    static class C3491a implements C3151a<List<X>, List<Y>> {

        /* renamed from: a */
        final /* synthetic */ C3151a f9894a;

        C3491a(C3151a aVar) {
            this.f9894a = aVar;
        }

        /* renamed from: a */
        public List<Y> mo10143a(List<X> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(this.f9894a.mo10143a(list.get(i)));
            }
            return arrayList;
        }
    }

    /* renamed from: f.r.d$b */
    public static abstract class C3492b<Key, Value> {

        /* renamed from: f.r.d$b$a */
        class C3493a extends C3492b<Key, ToValue> {

            /* renamed from: a */
            final /* synthetic */ C3151a f9895a;

            C3493a(C3151a aVar) {
                this.f9895a = aVar;
            }

            /* renamed from: a */
            public C3490d<Key, ToValue> mo11132a() {
                return C3492b.this.mo11132a().mo11126a(this.f9895a);
            }
        }

        /* renamed from: a */
        public <ToValue> C3492b<Key, ToValue> mo11131a(C3151a<Value, ToValue> aVar) {
            return mo11133b(C3490d.m14291b(aVar));
        }

        /* renamed from: a */
        public abstract C3490d<Key, Value> mo11132a();

        /* renamed from: b */
        public <ToValue> C3492b<Key, ToValue> mo11133b(C3151a<List<Value>, List<ToValue>> aVar) {
            return new C3493a(aVar);
        }
    }

    /* renamed from: f.r.d$c */
    public interface C3494c {
        /* renamed from: a */
        void mo11134a();
    }

    /* renamed from: f.r.d$d */
    static class C3495d<T> {

        /* renamed from: a */
        final int f9897a;

        /* renamed from: b */
        private final C3490d f9898b;

        /* renamed from: c */
        final C3502a<T> f9899c;

        /* renamed from: d */
        private final Object f9900d = new Object();

        /* renamed from: e */
        private Executor f9901e = null;

        /* renamed from: f */
        private boolean f9902f = false;

        /* renamed from: f.r.d$d$a */
        class C3496a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C3501g f9903f;

            C3496a(C3501g gVar) {
                this.f9903f = gVar;
            }

            public void run() {
                C3495d dVar = C3495d.this;
                dVar.f9899c.mo11123a(dVar.f9897a, this.f9903f);
            }
        }

        C3495d(C3490d dVar, int i, Executor executor, C3502a<T> aVar) {
            this.f9898b = dVar;
            this.f9897a = i;
            this.f9901e = executor;
            this.f9899c = aVar;
        }

        /* renamed from: a */
        static void m14305a(List<?> list, int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.size() + i > i2) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() == 0 && i2 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11135a(C3501g<T> gVar) {
            Executor executor;
            synchronized (this.f9900d) {
                if (!this.f9902f) {
                    this.f9902f = true;
                    executor = this.f9901e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new C3496a(gVar));
            } else {
                this.f9899c.mo11123a(this.f9897a, gVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11136a(Executor executor) {
            synchronized (this.f9900d) {
                this.f9901e = executor;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo11137a() {
            if (!this.f9898b.mo4146c()) {
                return false;
            }
            mo11135a(C3501g.m14319b());
            return true;
        }
    }

    C3490d() {
    }

    /* renamed from: a */
    static <A, B> List<B> m14290a(C3151a<List<A>, List<B>> aVar, List<A> list) {
        List<B> list2 = (List) aVar.mo10143a(list);
        if (list2.size() == list.size()) {
            return list2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid Function ");
        sb.append(aVar);
        sb.append(" changed return size. This is not supported.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    static <X, Y> C3151a<List<X>, List<Y>> m14291b(C3151a<X, Y> aVar) {
        return new C3491a(aVar);
    }

    /* renamed from: a */
    public abstract <ToValue> C3490d<Key, ToValue> mo11126a(C3151a<List<Value>, List<ToValue>> aVar);

    /* renamed from: a */
    public void mo11127a() {
        if (this.f9892a.compareAndSet(false, true)) {
            Iterator it = this.f9893b.iterator();
            while (it.hasNext()) {
                ((C3494c) it.next()).mo11134a();
            }
        }
    }

    /* renamed from: a */
    public void mo11128a(C3494c cVar) {
        this.f9893b.add(cVar);
    }

    /* renamed from: b */
    public void mo11129b(C3494c cVar) {
        this.f9893b.remove(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo11107b();

    /* renamed from: c */
    public boolean mo4146c() {
        return this.f9892a.get();
    }
}
