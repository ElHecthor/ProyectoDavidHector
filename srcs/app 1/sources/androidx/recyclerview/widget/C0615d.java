package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C0636h.C0638b;
import androidx.recyclerview.widget.C0636h.C0639c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public class C0615d<T> {

    /* renamed from: h */
    private static final Executor f2526h = new C0620c();

    /* renamed from: a */
    private final C0659p f2527a;

    /* renamed from: b */
    final C0613c<T> f2528b;

    /* renamed from: c */
    Executor f2529c;

    /* renamed from: d */
    private final List<C0619b<T>> f2530d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private List<T> f2531e;

    /* renamed from: f */
    private List<T> f2532f = Collections.emptyList();

    /* renamed from: g */
    int f2533g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    class C0616a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f2534f;

        /* renamed from: g */
        final /* synthetic */ List f2535g;

        /* renamed from: h */
        final /* synthetic */ int f2536h;

        /* renamed from: i */
        final /* synthetic */ Runnable f2537i;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        class C0617a extends C0638b {
            C0617a() {
            }

            /* renamed from: a */
            public int mo3824a() {
                return C0616a.this.f2535g.size();
            }

            /* renamed from: a */
            public boolean mo3825a(int i, int i2) {
                Object obj = C0616a.this.f2534f.get(i);
                Object obj2 = C0616a.this.f2535g.get(i2);
                if (obj != null && obj2 != null) {
                    return C0615d.this.f2528b.mo3815b().mo3888a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public int mo3826b() {
                return C0616a.this.f2534f.size();
            }

            /* renamed from: b */
            public boolean mo3827b(int i, int i2) {
                Object obj = C0616a.this.f2534f.get(i);
                Object obj2 = C0616a.this.f2535g.get(i2);
                if (obj != null && obj2 != null) {
                    return C0615d.this.f2528b.mo3815b().mo3889b(obj, obj2);
                }
                return obj == null && obj2 == null;
            }

            /* renamed from: c */
            public Object mo3828c(int i, int i2) {
                Object obj = C0616a.this.f2534f.get(i);
                Object obj2 = C0616a.this.f2535g.get(i2);
                if (obj != null && obj2 != null) {
                    return C0615d.this.f2528b.mo3815b().mo3890c(obj, obj2);
                }
                throw new AssertionError();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        class C0618b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0639c f2540f;

            C0618b(C0639c cVar) {
                this.f2540f = cVar;
            }

            public void run() {
                C0616a aVar = C0616a.this;
                C0615d dVar = C0615d.this;
                if (dVar.f2533g == aVar.f2536h) {
                    dVar.mo3821a(aVar.f2535g, this.f2540f, aVar.f2537i);
                }
            }
        }

        C0616a(List list, List list2, int i, Runnable runnable) {
            this.f2534f = list;
            this.f2535g = list2;
            this.f2536h = i;
            this.f2537i = runnable;
        }

        public void run() {
            C0615d.this.f2529c.execute(new C0618b(C0636h.m3620a(new C0617a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface C0619b<T> {
        /* renamed from: a */
        void mo3830a(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private static class C0620c implements Executor {

        /* renamed from: f */
        final Handler f2542f = new Handler(Looper.getMainLooper());

        C0620c() {
        }

        public void execute(Runnable runnable) {
            this.f2542f.post(runnable);
        }
    }

    public C0615d(C0659p pVar, C0613c<T> cVar) {
        this.f2527a = pVar;
        this.f2528b = cVar;
        this.f2529c = cVar.mo3816c() != null ? cVar.mo3816c() : f2526h;
    }

    /* renamed from: b */
    private void m3545b(List<T> list, Runnable runnable) {
        for (C0619b a : this.f2530d) {
            a.mo3830a(list, this.f2532f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public List<T> mo3818a() {
        return this.f2532f;
    }

    /* renamed from: a */
    public void mo3819a(C0619b<T> bVar) {
        this.f2530d.add(bVar);
    }

    /* renamed from: a */
    public void mo3820a(List<T> list) {
        mo3822a(list, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3821a(List<T> list, C0639c cVar, Runnable runnable) {
        List<T> list2 = this.f2532f;
        this.f2531e = list;
        this.f2532f = Collections.unmodifiableList(list);
        cVar.mo3887a(this.f2527a);
        m3545b(list2, runnable);
    }

    /* renamed from: a */
    public void mo3822a(List<T> list, Runnable runnable) {
        int i = this.f2533g + 1;
        this.f2533g = i;
        List<T> list2 = this.f2531e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        List<T> list3 = this.f2532f;
        if (list == null) {
            int size = list2.size();
            this.f2531e = null;
            this.f2532f = Collections.emptyList();
            this.f2527a.mo3810a(0, size);
            m3545b(list3, runnable);
        } else if (list2 == null) {
            this.f2531e = list;
            this.f2532f = Collections.unmodifiableList(list);
            this.f2527a.mo3813c(0, list.size());
            m3545b(list3, runnable);
        } else {
            Executor a = this.f2528b.mo3814a();
            C0616a aVar = new C0616a(list2, list, i, runnable);
            a.execute(aVar);
        }
    }
}
