package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.room.p002w.C0741a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3538c;
import p071f.p133t.p134a.C3538c.C3542c;
import p071f.p133t.p134a.C3544e;
import p071f.p133t.p134a.C3545f;

/* renamed from: androidx.room.l */
public abstract class C0711l {
    @Deprecated

    /* renamed from: a */
    protected volatile C3537b f2804a;

    /* renamed from: b */
    private Executor f2805b;

    /* renamed from: c */
    private Executor f2806c;

    /* renamed from: d */
    private C3538c f2807d;

    /* renamed from: e */
    private final C0696i f2808e = mo4070d();

    /* renamed from: f */
    private boolean f2809f;

    /* renamed from: g */
    boolean f2810g;
    @Deprecated

    /* renamed from: h */
    protected List<C0713b> f2811h;

    /* renamed from: i */
    private final ReentrantReadWriteLock f2812i = new ReentrantReadWriteLock();

    /* renamed from: j */
    private final ThreadLocal<Integer> f2813j = new ThreadLocal<>();

    /* renamed from: k */
    private final Map<String, Object> f2814k = new ConcurrentHashMap();

    /* renamed from: androidx.room.l$a */
    public static class C0712a<T extends C0711l> {

        /* renamed from: a */
        private final Class<T> f2815a;

        /* renamed from: b */
        private final String f2816b;

        /* renamed from: c */
        private final Context f2817c;

        /* renamed from: d */
        private ArrayList<C0713b> f2818d;

        /* renamed from: e */
        private Executor f2819e;

        /* renamed from: f */
        private Executor f2820f;

        /* renamed from: g */
        private C3542c f2821g;

        /* renamed from: h */
        private boolean f2822h;

        /* renamed from: i */
        private C0714c f2823i = C0714c.AUTOMATIC;

        /* renamed from: j */
        private boolean f2824j;

        /* renamed from: k */
        private boolean f2825k = true;

        /* renamed from: l */
        private boolean f2826l;

        /* renamed from: m */
        private final C0715d f2827m = new C0715d();

        /* renamed from: n */
        private Set<Integer> f2828n;

        /* renamed from: o */
        private Set<Integer> f2829o;

        /* renamed from: p */
        private String f2830p;

        /* renamed from: q */
        private File f2831q;

        C0712a(Context context, Class<T> cls, String str) {
            this.f2817c = context;
            this.f2815a = cls;
            this.f2816b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            if (r1 != null) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T mo4082a() {
            /*
                r21 = this;
                r0 = r21
                android.content.Context r1 = r0.f2817c
                if (r1 == 0) goto L_0x00ec
                java.lang.Class<T> r1 = r0.f2815a
                if (r1 == 0) goto L_0x00e4
                java.util.concurrent.Executor r1 = r0.f2819e
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = r0.f2820f
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = p071f.p080b.p081a.p082a.C3137a.m12722b()
                r0.f2820f = r1
            L_0x0018:
                r0.f2819e = r1
                goto L_0x002f
            L_0x001b:
                java.util.concurrent.Executor r1 = r0.f2819e
                if (r1 == 0) goto L_0x0026
                java.util.concurrent.Executor r2 = r0.f2820f
                if (r2 != 0) goto L_0x0026
                r0.f2820f = r1
                goto L_0x002f
            L_0x0026:
                java.util.concurrent.Executor r1 = r0.f2819e
                if (r1 != 0) goto L_0x002f
                java.util.concurrent.Executor r1 = r0.f2820f
                if (r1 == 0) goto L_0x002f
                goto L_0x0018
            L_0x002f:
                java.util.Set<java.lang.Integer> r1 = r0.f2829o
                if (r1 == 0) goto L_0x0067
                java.util.Set<java.lang.Integer> r2 = r0.f2828n
                if (r2 == 0) goto L_0x0067
                java.util.Iterator r1 = r1.iterator()
            L_0x003b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0067
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.f2828n
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L_0x0050
                goto L_0x003b
            L_0x0050:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0067:
                f.t.a.c$c r1 = r0.f2821g
                if (r1 != 0) goto L_0x0072
                f.t.a.g.c r1 = new f.t.a.g.c
                r1.<init>()
                r0.f2821g = r1
            L_0x0072:
                java.lang.String r1 = r0.f2830p
                if (r1 != 0) goto L_0x007a
                java.io.File r1 = r0.f2831q
                if (r1 == 0) goto L_0x009c
            L_0x007a:
                java.lang.String r1 = r0.f2816b
                if (r1 == 0) goto L_0x00dc
                java.lang.String r1 = r0.f2830p
                if (r1 == 0) goto L_0x008f
                java.io.File r1 = r0.f2831q
                if (r1 != 0) goto L_0x0087
                goto L_0x008f
            L_0x0087:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations."
                r1.<init>(r2)
                throw r1
            L_0x008f:
                androidx.room.s r1 = new androidx.room.s
                java.lang.String r2 = r0.f2830p
                java.io.File r3 = r0.f2831q
                f.t.a.c$c r4 = r0.f2821g
                r1.<init>(r2, r3, r4)
                r0.f2821g = r1
            L_0x009c:
                androidx.room.c r1 = new androidx.room.c
                android.content.Context r6 = r0.f2817c
                java.lang.String r7 = r0.f2816b
                f.t.a.c$c r8 = r0.f2821g
                androidx.room.l$d r9 = r0.f2827m
                java.util.ArrayList<androidx.room.l$b> r10 = r0.f2818d
                boolean r11 = r0.f2822h
                androidx.room.l$c r2 = r0.f2823i
                androidx.room.l$c r12 = r2.mo4087a(r6)
                java.util.concurrent.Executor r13 = r0.f2819e
                java.util.concurrent.Executor r14 = r0.f2820f
                boolean r15 = r0.f2824j
                boolean r2 = r0.f2825k
                boolean r3 = r0.f2826l
                java.util.Set<java.lang.Integer> r4 = r0.f2828n
                java.lang.String r5 = r0.f2830p
                r18 = r4
                java.io.File r4 = r0.f2831q
                r19 = r5
                r5 = r1
                r16 = r2
                r17 = r3
                r20 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Class<T> r2 = r0.f2815a
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = androidx.room.C0710k.m3952a(r2, r3)
                androidx.room.l r2 = (androidx.room.C0711l) r2
                r2.mo4068b(r1)
                return r2
            L_0x00dc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x00e4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L_0x00ec:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0711l.C0712a.mo4082a():androidx.room.l");
        }

        /* renamed from: b */
        public C0712a<T> mo4083b() {
            this.f2825k = false;
            this.f2826l = true;
            return this;
        }
    }

    /* renamed from: androidx.room.l$b */
    public static abstract class C0713b {
        /* renamed from: a */
        public void mo4084a(C3537b bVar) {
        }

        /* renamed from: b */
        public void mo4085b(C3537b bVar) {
        }

        /* renamed from: c */
        public void mo4086c(C3537b bVar) {
        }
    }

    /* renamed from: androidx.room.l$c */
    public enum C0714c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        private static boolean m3980a(ActivityManager activityManager) {
            if (VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C0714c mo4087a(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            if (VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && !m3980a(activityManager)) {
                    return WRITE_AHEAD_LOGGING;
                }
            }
            return TRUNCATE;
        }
    }

    /* renamed from: androidx.room.l$d */
    public static class C0715d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C0741a>> f2836a = new HashMap<>();

        /* renamed from: a */
        private List<C0741a> m3982a(List<C0741a> list, boolean z, int i, int i2) {
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f2836a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    Iterator it = (z ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        /* renamed from: a */
        public List<C0741a> mo4088a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m3982a(new ArrayList(), i2 > i, i, i2);
        }
    }

    /* renamed from: p */
    private static boolean mo14281p() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public Cursor mo4061a(C3544e eVar) {
        return mo4062a(eVar, null);
    }

    /* renamed from: a */
    public Cursor mo4062a(C3544e eVar, CancellationSignal cancellationSignal) {
        mo4065a();
        mo4067b();
        return (cancellationSignal == null || VERSION.SDK_INT < 16) ? this.f2807d.mo4121a().mo11221a(eVar) : this.f2807d.mo4121a().mo11222a(eVar, cancellationSignal);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3538c mo4063a(C0686c cVar);

    /* renamed from: a */
    public C3545f mo4064a(String str) {
        mo4065a();
        mo4067b();
        return this.f2807d.mo4121a().compileStatement(str);
    }

    /* renamed from: a */
    public void mo4065a() {
        if (!this.f2809f && mo14281p()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4066a(C3537b bVar) {
        this.f2808e.mo4037a(bVar);
    }

    /* renamed from: b */
    public void mo4067b() {
        if (!mo4079m() && this.f2813j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: b */
    public void mo4068b(C0686c cVar) {
        C3538c a = mo4063a(cVar);
        this.f2807d = a;
        if (a instanceof C0734r) {
            ((C0734r) a).mo4122a(cVar);
        }
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (cVar.f2748g == C0714c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f2807d.mo4123a(z);
        }
        this.f2811h = cVar.f2746e;
        this.f2805b = cVar.f2749h;
        this.f2806c = new C0739v(cVar.f2750i);
        this.f2809f = cVar.f2747f;
        this.f2810g = z;
        if (cVar.f2751j) {
            this.f2808e.mo4035a(cVar.f2743b, cVar.f2744c);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo4069c() {
        mo4065a();
        C3537b a = this.f2807d.mo4121a();
        this.f2808e.mo4042b(a);
        a.beginTransaction();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C0696i mo4070d();

    @Deprecated
    /* renamed from: e */
    public void mo4071e() {
        this.f2807d.mo4121a().endTransaction();
        if (!mo4079m()) {
            this.f2808e.mo4040b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Map<String, Object> mo4072f() {
        return this.f2814k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Lock mo4073g() {
        return this.f2812i.readLock();
    }

    /* renamed from: h */
    public C0696i mo4074h() {
        return this.f2808e;
    }

    /* renamed from: i */
    public C3538c mo4075i() {
        return this.f2807d;
    }

    /* renamed from: j */
    public Executor mo4076j() {
        return this.f2805b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public ThreadLocal<Integer> mo4077k() {
        return this.f2813j;
    }

    /* renamed from: l */
    public Executor mo4078l() {
        return this.f2806c;
    }

    /* renamed from: m */
    public boolean mo4079m() {
        return this.f2807d.mo4121a().inTransaction();
    }

    /* renamed from: n */
    public boolean mo4080n() {
        C3537b bVar = this.f2804a;
        return bVar != null && bVar.isOpen();
    }

    @Deprecated
    /* renamed from: o */
    public void mo4081o() {
        this.f2807d.mo4121a().setTransactionSuccessful();
    }
}
