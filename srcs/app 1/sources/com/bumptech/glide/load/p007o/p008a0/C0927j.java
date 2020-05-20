package com.bumptech.glide.load.p007o.p008a0;

import android.util.Log;
import com.bumptech.glide.p029t.C1309j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.j */
public final class C0927j implements C0916b {

    /* renamed from: a */
    private final C0924h<C0928a, Object> f3467a = new C0924h<>();

    /* renamed from: b */
    private final C0929b f3468b = new C0929b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f3469c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C0915a<?>> f3470d = new HashMap();

    /* renamed from: e */
    private final int f3471e;

    /* renamed from: f */
    private int f3472f;

    /* renamed from: com.bumptech.glide.load.o.a0.j$a */
    private static final class C0928a implements C0934m {

        /* renamed from: a */
        private final C0929b f3473a;

        /* renamed from: b */
        int f3474b;

        /* renamed from: c */
        private Class<?> f3475c;

        C0928a(C0929b bVar) {
            this.f3473a = bVar;
        }

        /* renamed from: a */
        public void mo4701a() {
            this.f3473a.mo4708a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4724a(int i, Class<?> cls) {
            this.f3474b = i;
            this.f3475c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0928a)) {
                return false;
            }
            C0928a aVar = (C0928a) obj;
            return this.f3474b == aVar.f3474b && this.f3475c == aVar.f3475c;
        }

        public int hashCode() {
            int i = this.f3474b * 31;
            Class<?> cls = this.f3475c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.f3474b);
            sb.append("array=");
            sb.append(this.f3475c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.j$b */
    private static final class C0929b extends C0920d<C0928a> {
        C0929b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0928a m4772a() {
            return new C0928a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0928a mo4728a(int i, Class<?> cls) {
            C0928a aVar = (C0928a) mo4709b();
            aVar.mo4724a(i, cls);
            return aVar;
        }
    }

    public C0927j(int i) {
        this.f3471e = i;
    }

    /* renamed from: a */
    private <T> C0915a<T> m4753a(Class<T> cls) {
        C0915a<T> aVar = (C0915a) this.f3470d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C0926i<>();
            } else if (cls.equals(byte[].class)) {
                aVar = new C0923g<>();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.f3470d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    private <T> C0915a<T> m4754a(T t) {
        return m4753a(t.getClass());
    }

    /* renamed from: a */
    private <T> T m4755a(C0928a aVar) {
        return this.f3467a.mo4717a(aVar);
    }

    /* renamed from: a */
    private <T> T m4756a(C0928a aVar, Class<T> cls) {
        C0915a a = m4753a(cls);
        T a2 = m4755a(aVar);
        if (a2 != null) {
            this.f3472f -= a.mo4685a(a2) * a.mo4687b();
            m4761c(a.mo4685a(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(a.mo4686a(), 2)) {
            String a3 = a.mo4686a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f3474b);
            sb.append(" bytes");
            Log.v(a3, sb.toString());
        }
        return a.newArray(aVar.f3474b);
    }

    /* renamed from: a */
    private boolean m4757a(int i, Integer num) {
        return num != null && (m4762c() || num.intValue() <= i * 8);
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m4758b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f3469c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3469c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private void m4759b() {
        m4760b(this.f3471e);
    }

    /* renamed from: b */
    private void m4760b(int i) {
        while (this.f3472f > i) {
            Object a = this.f3467a.mo4716a();
            C1309j.m6149a(a);
            C0915a a2 = m4754a((T) a);
            this.f3472f -= a2.mo4685a(a) * a2.mo4687b();
            m4761c(a2.mo4685a(a), a.getClass());
            if (Log.isLoggable(a2.mo4686a(), 2)) {
                String a3 = a2.mo4686a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(a2.mo4685a(a));
                Log.v(a3, sb.toString());
            }
        }
    }

    /* renamed from: c */
    private void m4761c(int i, Class<?> cls) {
        NavigableMap b = m4758b(cls);
        Integer num = (Integer) b.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                b.remove(valueOf);
            } else {
                b.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: c */
    private boolean m4762c() {
        int i = this.f3472f;
        return i == 0 || this.f3471e / i >= 2;
    }

    /* renamed from: c */
    private boolean m4763c(int i) {
        return i <= this.f3471e / 2;
    }

    /* renamed from: a */
    public synchronized <T> T mo4689a(int i, Class<T> cls) {
        return m4756a(this.f3468b.mo4728a(i, cls), cls);
    }

    /* renamed from: a */
    public synchronized void mo4690a() {
        m4760b(0);
    }

    /* renamed from: a */
    public synchronized void mo4691a(int i) {
        if (i >= 40) {
            try {
                mo4690a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m4760b(this.f3471e / 2);
        }
    }

    /* renamed from: b */
    public synchronized <T> T mo4692b(int i, Class<T> cls) {
        Integer num;
        num = (Integer) m4758b(cls).ceilingKey(Integer.valueOf(i));
        return m4756a(m4757a(i, num) ? this.f3468b.mo4728a(num.intValue(), cls) : this.f3468b.mo4728a(i, cls), cls);
    }

    public synchronized <T> void put(T t) {
        Class cls = t.getClass();
        C0915a a = m4753a(cls);
        int a2 = a.mo4685a(t);
        int b = a.mo4687b() * a2;
        if (m4763c(b)) {
            C0928a a3 = this.f3468b.mo4728a(a2, cls);
            this.f3467a.mo4718a(a3, t);
            NavigableMap b2 = m4758b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a3.f3474b));
            Integer valueOf = Integer.valueOf(a3.f3474b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f3472f += b;
            m4759b();
        }
    }
}
