package p147g.p156d.p204b;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p205a0.C4474d;
import p147g.p156d.p204b.p207y.C4522c;
import p147g.p156d.p204b.p207y.C4537d;
import p147g.p156d.p204b.p207y.C4552k;
import p147g.p156d.p204b.p207y.C4553l;
import p147g.p156d.p204b.p207y.p208n.C4561a;
import p147g.p156d.p204b.p207y.p208n.C4563b;
import p147g.p156d.p204b.p207y.p208n.C4565c;
import p147g.p156d.p204b.p207y.p208n.C4567d;
import p147g.p156d.p204b.p207y.p208n.C4572g;
import p147g.p156d.p204b.p207y.p208n.C4574h;
import p147g.p156d.p204b.p207y.p208n.C4577i;
import p147g.p156d.p204b.p207y.p208n.C4581j;
import p147g.p156d.p204b.p207y.p208n.C4583k;
import p147g.p156d.p204b.p207y.p208n.C4589n;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.f */
public final class C4485f {

    /* renamed from: k */
    private static final C4632a<?> f11882k = C4632a.m18690a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C4632a<?>, C4491f<?>>> f11883a;

    /* renamed from: b */
    private final Map<C4632a<?>, C4509v<?>> f11884b;

    /* renamed from: c */
    private final C4522c f11885c;

    /* renamed from: d */
    private final C4567d f11886d;

    /* renamed from: e */
    final List<C4511w> f11887e;

    /* renamed from: f */
    final boolean f11888f;

    /* renamed from: g */
    final boolean f11889g;

    /* renamed from: h */
    final boolean f11890h;

    /* renamed from: i */
    final boolean f11891i;

    /* renamed from: j */
    final boolean f11892j;

    /* renamed from: g.d.b.f$a */
    class C4486a extends C4509v<Number> {
        C4486a(C4485f fVar) {
        }

        /* renamed from: a */
        public Double m18307a(C4470a aVar) {
            if (aVar.mo13307w() != C4472b.NULL) {
                return Double.valueOf(aVar.mo13300p());
            }
            aVar.mo13305u();
            return null;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, Number number) {
            if (number == null) {
                cVar.mo13329m();
                return;
            }
            C4485f.m18286a(number.doubleValue());
            cVar.mo13312a(number);
        }
    }

    /* renamed from: g.d.b.f$b */
    class C4487b extends C4509v<Number> {
        C4487b(C4485f fVar) {
        }

        /* renamed from: a */
        public Float m18311a(C4470a aVar) {
            if (aVar.mo13307w() != C4472b.NULL) {
                return Float.valueOf((float) aVar.mo13300p());
            }
            aVar.mo13305u();
            return null;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, Number number) {
            if (number == null) {
                cVar.mo13329m();
                return;
            }
            C4485f.m18286a((double) number.floatValue());
            cVar.mo13312a(number);
        }
    }

    /* renamed from: g.d.b.f$c */
    static class C4488c extends C4509v<Number> {
        C4488c() {
        }

        /* renamed from: a */
        public Number m18315a(C4470a aVar) {
            if (aVar.mo13307w() != C4472b.NULL) {
                return Long.valueOf(aVar.mo13302s());
            }
            aVar.mo13305u();
            return null;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, Number number) {
            if (number == null) {
                cVar.mo13329m();
            } else {
                cVar.mo13322e(number.toString());
            }
        }
    }

    /* renamed from: g.d.b.f$d */
    static class C4489d extends C4509v<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C4509v f11893a;

        C4489d(C4509v vVar) {
            this.f11893a = vVar;
        }

        /* renamed from: a */
        public AtomicLong m18319a(C4470a aVar) {
            return new AtomicLong(((Number) this.f11893a.mo13284a(aVar)).longValue());
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, AtomicLong atomicLong) {
            this.f11893a.mo13285a(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: g.d.b.f$e */
    static class C4490e extends C4509v<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C4509v f11894a;

        C4490e(C4509v vVar) {
            this.f11894a = vVar;
        }

        /* renamed from: a */
        public AtomicLongArray m18323a(C4470a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo13288a();
            while (aVar.mo13296i()) {
                arrayList.add(Long.valueOf(((Number) this.f11894a.mo13284a(aVar)).longValue()));
            }
            aVar.mo13293g();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, AtomicLongArray atomicLongArray) {
            cVar.mo13310a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f11894a.mo13285a(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo13323f();
        }
    }

    /* renamed from: g.d.b.f$f */
    static class C4491f<T> extends C4509v<T> {

        /* renamed from: a */
        private C4509v<T> f11895a;

        C4491f() {
        }

        /* renamed from: a */
        public T mo13284a(C4470a aVar) {
            C4509v<T> vVar = this.f11895a;
            if (vVar != null) {
                return vVar.mo13284a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, T t) {
            C4509v<T> vVar = this.f11895a;
            if (vVar != null) {
                vVar.mo13285a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo13355a(C4509v<T> vVar) {
            if (this.f11895a == null) {
                this.f11895a = vVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public C4485f() {
        this(C4537d.f11939l, C4477d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C4506u.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C4485f(C4537d dVar, C4484e eVar, Map<Type, C4493h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C4506u uVar, String str, int i, int i2, List<C4511w> list, List<C4511w> list2, List<C4511w> list3) {
        C4537d dVar2 = dVar;
        boolean z8 = z7;
        this.f11883a = new ThreadLocal<>();
        this.f11884b = new ConcurrentHashMap();
        Map<Type, C4493h<?>> map2 = map;
        this.f11885c = new C4522c(map);
        this.f11888f = z;
        this.f11889g = z3;
        this.f11890h = z4;
        this.f11891i = z5;
        this.f11892j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4589n.f12068Y);
        arrayList.add(C4574h.f12011b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C4589n.f12047D);
        arrayList.add(C4589n.f12082m);
        arrayList.add(C4589n.f12076g);
        arrayList.add(C4589n.f12078i);
        arrayList.add(C4589n.f12080k);
        C4509v a = m18283a(uVar);
        arrayList.add(C4589n.m18548a(Long.TYPE, Long.class, a));
        arrayList.add(C4589n.m18548a(Double.TYPE, Double.class, m18285a(z8)));
        arrayList.add(C4589n.m18548a(Float.TYPE, Float.class, m18289b(z8)));
        arrayList.add(C4589n.f12093x);
        arrayList.add(C4589n.f12084o);
        arrayList.add(C4589n.f12086q);
        arrayList.add(C4589n.m18547a(AtomicLong.class, m18284a(a)));
        arrayList.add(C4589n.m18547a(AtomicLongArray.class, m18288b(a)));
        arrayList.add(C4589n.f12088s);
        arrayList.add(C4589n.f12095z);
        arrayList.add(C4589n.f12049F);
        arrayList.add(C4589n.f12051H);
        arrayList.add(C4589n.m18547a(BigDecimal.class, C4589n.f12045B));
        arrayList.add(C4589n.m18547a(BigInteger.class, C4589n.f12046C));
        arrayList.add(C4589n.f12053J);
        arrayList.add(C4589n.f12055L);
        arrayList.add(C4589n.f12059P);
        arrayList.add(C4589n.f12061R);
        arrayList.add(C4589n.f12066W);
        arrayList.add(C4589n.f12057N);
        arrayList.add(C4589n.f12073d);
        arrayList.add(C4565c.f11992b);
        arrayList.add(C4589n.f12064U);
        arrayList.add(C4583k.f12032b);
        arrayList.add(C4581j.f12030b);
        arrayList.add(C4589n.f12062S);
        arrayList.add(C4561a.f11986c);
        arrayList.add(C4589n.f12071b);
        arrayList.add(new C4563b(this.f11885c));
        boolean z9 = z2;
        arrayList.add(new C4572g(this.f11885c, z2));
        C4567d dVar3 = new C4567d(this.f11885c);
        this.f11886d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(C4589n.f12069Z);
        C4484e eVar2 = eVar;
        arrayList.add(new C4577i(this.f11885c, eVar, dVar, this.f11886d));
        this.f11887e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C4509v<Number> m18283a(C4506u uVar) {
        return uVar == C4506u.DEFAULT ? C4589n.f12089t : new C4488c();
    }

    /* renamed from: a */
    private static C4509v<AtomicLong> m18284a(C4509v<Number> vVar) {
        return new C4489d(vVar).mo13392a();
    }

    /* renamed from: a */
    private C4509v<Number> m18285a(boolean z) {
        return z ? C4589n.f12091v : new C4486a(this);
    }

    /* renamed from: a */
    static void m18286a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m18287a(Object obj, C4470a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo13307w() != C4472b.END_DOCUMENT) {
                    throw new C4498m("JSON document was not fully consumed.");
                }
            } catch (C4474d e) {
                throw new C4505t((Throwable) e);
            } catch (IOException e2) {
                throw new C4498m((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C4509v<AtomicLongArray> m18288b(C4509v<Number> vVar) {
        return new C4490e(vVar).mo13392a();
    }

    /* renamed from: b */
    private C4509v<Number> m18289b(boolean z) {
        return z ? C4589n.f12090u : new C4487b(this);
    }

    /* renamed from: a */
    public C4470a mo13333a(Reader reader) {
        C4470a aVar = new C4470a(reader);
        aVar.mo13289a(this.f11892j);
        return aVar;
    }

    /* renamed from: a */
    public C4473c mo13334a(Writer writer) {
        if (this.f11889g) {
            writer.write(")]}'\n");
        }
        C4473c cVar = new C4473c(writer);
        if (this.f11891i) {
            cVar.mo13321d("  ");
        }
        cVar.mo13316c(this.f11888f);
        return cVar;
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13335a(C4511w wVar, C4632a<T> aVar) {
        if (!this.f11887e.contains(wVar)) {
            wVar = this.f11886d;
        }
        boolean z = false;
        for (C4511w wVar2 : this.f11887e) {
            if (z) {
                C4509v<T> a = wVar2.mo13393a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (wVar2 == wVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=g.d.b.z.a<T>, code=g.d.b.z.a, for r6v0, types: [g.d.b.z.a, java.lang.Object, g.d.b.z.a<T>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p147g.p156d.p204b.C4509v<T> mo13336a(p147g.p156d.p204b.p211z.C4632a r6) {
        /*
            r5 = this;
            java.util.Map<g.d.b.z.a<?>, g.d.b.v<?>> r0 = r5.f11884b
            if (r6 != 0) goto L_0x0007
            g.d.b.z.a<?> r1 = f11882k
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            g.d.b.v r0 = (p147g.p156d.p204b.C4509v) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<g.d.b.z.a<?>, g.d.b.f$f<?>>> r0 = r5.f11883a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<g.d.b.z.a<?>, g.d.b.f$f<?>>> r1 = r5.f11883a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            g.d.b.f$f r2 = (p147g.p156d.p204b.C4485f.C4491f) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            g.d.b.f$f r2 = new g.d.b.f$f     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            r0.put(r6, r2)     // Catch:{ all -> 0x007a }
            java.util.List<g.d.b.w> r3 = r5.f11887e     // Catch:{ all -> 0x007a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007a }
            g.d.b.w r4 = (p147g.p156d.p204b.C4511w) r4     // Catch:{ all -> 0x007a }
            g.d.b.v r4 = r4.mo13393a(r5, r6)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x003e
            r2.mo13355a(r4)     // Catch:{ all -> 0x007a }
            java.util.Map<g.d.b.z.a<?>, g.d.b.v<?>> r2 = r5.f11884b     // Catch:{ all -> 0x007a }
            r2.put(r6, r4)     // Catch:{ all -> 0x007a }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<g.d.b.z.a<?>, g.d.b.f$f<?>>> r6 = r5.f11883a
            r6.remove()
        L_0x0062:
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.append(r4)     // Catch:{ all -> 0x007a }
            r3.append(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r3)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x0085
            java.lang.ThreadLocal<java.util.Map<g.d.b.z.a<?>, g.d.b.f$f<?>>> r6 = r5.f11883a
            r6.remove()
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.C4485f.mo13336a(g.d.b.z.a):g.d.b.v");
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13337a(Class<T> cls) {
        return mo13336a(C4632a.m18690a(cls));
    }

    /* renamed from: a */
    public <T> T mo13338a(C4470a aVar, Type type) {
        boolean l = aVar.mo13297l();
        aVar.mo13289a(true);
        try {
            aVar.mo13307w();
            T a = mo13336a(C4632a.m18691a(type)).mo13284a(aVar);
            aVar.mo13289a(l);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo13289a(l);
                return null;
            }
            throw new C4505t((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C4505t((Throwable) e2);
        } catch (IOException e3) {
            throw new C4505t((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e4.getMessage());
            throw new AssertionError(sb.toString(), e4);
        } catch (Throwable th) {
            aVar.mo13289a(l);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo13339a(Reader reader, Type type) {
        C4470a a = mo13333a(reader);
        T a2 = mo13338a(a, type);
        m18287a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    public <T> T mo13340a(String str, Class<T> cls) {
        return C4552k.m18444a(cls).cast(mo13341a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo13341a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo13339a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public String mo13342a(C4497l lVar) {
        StringWriter stringWriter = new StringWriter();
        mo13346a(lVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public String mo13343a(Object obj) {
        return obj == null ? mo13342a((C4497l) C4499n.f11913a) : mo13344a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo13344a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo13348a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo13345a(C4497l lVar, C4473c cVar) {
        boolean l = cVar.mo13328l();
        cVar.mo13314b(true);
        boolean i = cVar.mo13327i();
        cVar.mo13313a(this.f11890h);
        boolean h = cVar.mo13326h();
        cVar.mo13316c(this.f11888f);
        try {
            C4553l.m18449a(lVar, cVar);
            cVar.mo13314b(l);
            cVar.mo13313a(i);
            cVar.mo13316c(h);
        } catch (IOException e) {
            throw new C4498m((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.mo13314b(l);
            cVar.mo13313a(i);
            cVar.mo13316c(h);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo13346a(C4497l lVar, Appendable appendable) {
        try {
            mo13345a(lVar, mo13334a(C4553l.m18448a(appendable)));
        } catch (IOException e) {
            throw new C4498m((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo13347a(Object obj, Type type, C4473c cVar) {
        C4509v a = mo13336a(C4632a.m18691a(type));
        boolean l = cVar.mo13328l();
        cVar.mo13314b(true);
        boolean i = cVar.mo13327i();
        cVar.mo13313a(this.f11890h);
        boolean h = cVar.mo13326h();
        cVar.mo13316c(this.f11888f);
        try {
            a.mo13285a(cVar, obj);
            cVar.mo13314b(l);
            cVar.mo13313a(i);
            cVar.mo13316c(h);
        } catch (IOException e) {
            throw new C4498m((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.mo13314b(l);
            cVar.mo13313a(i);
            cVar.mo13316c(h);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo13348a(Object obj, Type type, Appendable appendable) {
        try {
            mo13347a(obj, type, mo13334a(C4553l.m18448a(appendable)));
        } catch (IOException e) {
            throw new C4498m((Throwable) e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f11888f);
        sb.append(",factories:");
        sb.append(this.f11887e);
        sb.append(",instanceCreators:");
        sb.append(this.f11885c);
        sb.append("}");
        return sb.toString();
    }
}
