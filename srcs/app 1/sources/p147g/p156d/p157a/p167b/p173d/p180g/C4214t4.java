package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.t4 */
public abstract class C4214t4<MessageType extends C4214t4<MessageType, BuilderType>, BuilderType extends C4216b<MessageType, BuilderType>> extends C3944c3<MessageType, BuilderType> {
    private static Map<Object, C4214t4<?, ?>> zzd = new ConcurrentHashMap();
    protected C4140o7 zzb = C4140o7.m16895d();
    private int zzc = -1;

    /* renamed from: g.d.a.b.d.g.t4$a */
    public static class C4215a<T extends C4214t4<T, ?>> extends C4015g3<T> {
        public C4215a(T t) {
        }
    }

    /* renamed from: g.d.a.b.d.g.t4$b */
    public static abstract class C4216b<MessageType extends C4214t4<MessageType, BuilderType>, BuilderType extends C4216b<MessageType, BuilderType>> extends C3982e3<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f11312f;

        /* renamed from: g */
        protected MessageType f11313g;

        /* renamed from: h */
        protected boolean f11314h = false;

        protected C4216b(MessageType messagetype) {
            this.f11312f = messagetype;
            this.f11313g = (C4214t4) messagetype.mo12055a(C4219e.f11318d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m17168a(MessageType messagetype, MessageType messagetype2) {
            C4167q6.m16944a().mo12722a(messagetype).mo12547b(messagetype, messagetype2);
        }

        /* renamed from: b */
        private final BuilderType m17169b(byte[] bArr, int i, int i2, C3999f4 f4Var) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            try {
                C4167q6.m16944a().mo12722a(this.f11313g).mo12545a(this.f11313g, bArr, 0, i2 + 0, new C4077k3(f4Var));
                return this;
            } catch (C3968d5 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C3968d5.m16205a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ C3982e3 mo12386a(byte[] bArr, int i, int i2) {
            m17169b(bArr, 0, i2, C3999f4.m16366a());
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C3982e3 mo12387a(byte[] bArr, int i, int i2, C3999f4 f4Var) {
            m17169b(bArr, 0, i2, f4Var);
            return this;
        }

        /* renamed from: a */
        public final BuilderType mo12385a(MessageType messagetype) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            m17168a(this.f11313g, messagetype);
            return this;
        }

        /* renamed from: c */
        public final boolean mo12487c() {
            return C4214t4.m17153a(this.f11313g, false);
        }

        public /* synthetic */ Object clone() {
            C4216b bVar = (C4216b) this.f11312f.mo12055a(C4219e.f11319e, (Object) null, (Object) null);
            bVar.mo12385a((MessageType) (C4214t4) mo12347m());
            return bVar;
        }

        /* renamed from: d */
        public final /* synthetic */ C3985e6 mo12488d() {
            return this.f11312f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo12817l() {
            MessageType messagetype = (C4214t4) this.f11313g.mo12055a(C4219e.f11318d, (Object) null, (Object) null);
            m17168a(messagetype, this.f11313g);
            this.f11313g = messagetype;
        }

        /* renamed from: n */
        public MessageType mo12347m() {
            if (this.f11314h) {
                return this.f11313g;
            }
            MessageType messagetype = this.f11313g;
            C4167q6.m16944a().mo12722a(messagetype).mo12549c(messagetype);
            this.f11314h = true;
            return this.f11313g;
        }

        /* renamed from: o */
        public final MessageType mo12346f() {
            MessageType messagetype = (C4214t4) mo12347m();
            if (messagetype.mo12487c()) {
                return messagetype;
            }
            throw new C4112m7(messagetype);
        }
    }

    /* renamed from: g.d.a.b.d.g.t4$c */
    static final class C4217c implements C4137o4<C4217c> {
        /* renamed from: a */
        public final int mo12682a() {
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final C3969d6 mo12683a(C3969d6 d6Var, C3985e6 e6Var) {
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final C4064j6 mo12684a(C4064j6 j6Var, C4064j6 j6Var2) {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        public final C3951c8 mo12685b() {
            throw new NoSuchMethodError();
        }

        /* renamed from: c */
        public final C4004f8 mo12686c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        /* renamed from: d */
        public final boolean mo12687d() {
            throw new NoSuchMethodError();
        }

        /* renamed from: e */
        public final boolean mo12688e() {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: g.d.a.b.d.g.t4$d */
    public static abstract class C4218d<MessageType extends C4218d<MessageType, BuilderType>, BuilderType> extends C4214t4<MessageType, BuilderType> implements C4018g6 {
        protected C4109m4<C4217c> zzc = C4109m4.m16815g();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C4109m4<C4217c> mo12821a() {
            if (this.zzc.mo12652b()) {
                this.zzc = (C4109m4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: g.d.a.b.d.g.t4$e */
    public static final class C4219e {

        /* renamed from: a */
        public static final int f11315a = 1;

        /* renamed from: b */
        public static final int f11316b = 2;

        /* renamed from: c */
        public static final int f11317c = 3;

        /* renamed from: d */
        public static final int f11318d = 4;

        /* renamed from: e */
        public static final int f11319e = 5;

        /* renamed from: f */
        public static final int f11320f = 6;

        /* renamed from: g */
        public static final int f11321g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f11322h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f11323i = 1;

        /* renamed from: j */
        public static final int f11324j = 2;

        /* renamed from: k */
        public static final int f11325k = 1;

        /* renamed from: l */
        public static final int f11326l = 2;

        /* renamed from: a */
        public static int[] m17189a() {
            return (int[]) f11322h.clone();
        }
    }

    /* renamed from: g.d.a.b.d.g.t4$f */
    public static class C4220f<ContainingType extends C3985e6, Type> extends C4016g4<ContainingType, Type> {
    }

    /* renamed from: a */
    protected static <E> C3914a5<E> m17147a(C3914a5<E> a5Var) {
        int size = a5Var.size();
        return a5Var.mo12078a(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    protected static C3930b5 m17148a(C3930b5 b5Var) {
        int size = b5Var.size();
        return b5Var.mo12110e(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    static <T extends C4214t4<?, ?>> T m17149a(Class<T> cls) {
        T t = (C4214t4) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4214t4) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4214t4) ((C4214t4) C4183r7.m16990a(cls)).mo12055a(C4219e.f11320f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static Object m17150a(C3985e6 e6Var, String str, Object[] objArr) {
        return new C4201s6(e6Var, str, objArr);
    }

    /* renamed from: a */
    static Object m17151a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static <T extends C4214t4<?, ?>> void m17152a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends C4214t4<T, ?>> boolean m17153a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo12055a(C4219e.f11315a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C4167q6.m16944a().mo12722a(t).mo12548b(t);
        if (z) {
            t.mo12055a(C4219e.f11316b, (Object) b ? t : null, (Object) null);
        }
        return b;
    }

    /* renamed from: n */
    protected static C4294y4 m17154n() {
        return C4263w4.m17443d();
    }

    /* renamed from: o */
    protected static C3930b5 m17155o() {
        return C4200s5.m17108d();
    }

    /* renamed from: p */
    protected static <E> C3914a5<E> m17156p() {
        return C4222t6.m17193d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo12055a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12243a(int i) {
        this.zzc = i;
    }

    /* renamed from: a */
    public final void mo12432a(C3945c4 c4Var) {
        C4167q6.m16944a().mo12722a(this).mo12544a(this, (C4051i8) C3983e4.m16280a(c4Var));
    }

    /* renamed from: b */
    public final /* synthetic */ C3969d6 mo12433b() {
        return (C4216b) mo12055a(C4219e.f11319e, (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final boolean mo12487c() {
        return m17153a((T) this, Boolean.TRUE.booleanValue());
    }

    /* renamed from: d */
    public final /* synthetic */ C3985e6 mo12488d() {
        return (C4214t4) mo12055a(C4219e.f11320f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4167q6.m16944a().mo12722a(this).mo12546a(this, (C4214t4) obj);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final int mo12246h() {
        return this.zzc;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = C4167q6.m16944a().mo12722a(this).mo12541a(this);
        this.zza = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final <MessageType extends C4214t4<MessageType, BuilderType>, BuilderType extends C4216b<MessageType, BuilderType>> BuilderType mo12812i() {
        return (C4216b) mo12055a(C4219e.f11319e, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public final int mo12434j() {
        if (this.zzc == -1) {
            this.zzc = C4167q6.m16944a().mo12722a(this).mo12550d(this);
        }
        return this.zzc;
    }

    /* renamed from: k */
    public final /* synthetic */ C3969d6 mo12435k() {
        C4216b bVar = (C4216b) mo12055a(C4219e.f11319e, (Object) null, (Object) null);
        bVar.mo12385a(this);
        return bVar;
    }

    /* renamed from: l */
    public final BuilderType mo12813l() {
        BuilderType buildertype = (C4216b) mo12055a(C4219e.f11319e, (Object) null, (Object) null);
        buildertype.mo12385a(this);
        return buildertype;
    }

    public String toString() {
        return C4002f6.m16370a(this, super.toString());
    }
}
