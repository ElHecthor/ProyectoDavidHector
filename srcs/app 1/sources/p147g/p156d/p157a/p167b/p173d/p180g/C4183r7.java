package p147g.p156d.p157a.p167b.p173d.p180g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: g.d.a.b.d.g.r7 */
final class C4183r7 {

    /* renamed from: a */
    private static final Logger f11261a = Logger.getLogger(C4183r7.class.getName());

    /* renamed from: b */
    private static final Unsafe f11262b = m17007c();

    /* renamed from: c */
    private static final Class<?> f11263c = C4046i3.m16533b();

    /* renamed from: d */
    private static final boolean f11264d = m17015d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f11265e = m17015d(Integer.TYPE);

    /* renamed from: f */
    private static final C4187d f11266f;

    /* renamed from: g */
    private static final boolean f11267g = m17018e();

    /* renamed from: h */
    private static final boolean f11268h = m17014d();

    /* renamed from: i */
    private static final long f11269i = ((long) m17001b(byte[].class));

    /* renamed from: j */
    static final boolean f11270j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: g.d.a.b.d.g.r7$a */
    static final class C4184a extends C4187d {
        C4184a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo12745a(Object obj, long j) {
            return C4183r7.f11270j ? C4183r7.m17025k(obj, j) : C4183r7.m17026l(obj, j);
        }

        /* renamed from: a */
        public final void mo12746a(Object obj, long j, byte b) {
            if (C4183r7.f11270j) {
                C4183r7.m17008c(obj, j, b);
            } else {
                C4183r7.m17012d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo12747a(Object obj, long j, double d) {
            mo12754a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo12748a(Object obj, long j, float f) {
            mo12753a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo12749a(Object obj, long j, boolean z) {
            if (C4183r7.f11270j) {
                C4183r7.m17013d(obj, j, z);
            } else {
                C4183r7.m17017e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo12750b(Object obj, long j) {
            return C4183r7.f11270j ? C4183r7.m17027m(obj, j) : C4183r7.m17028n(obj, j);
        }

        /* renamed from: c */
        public final float mo12751c(Object obj, long j) {
            return Float.intBitsToFloat(mo12755e(obj, j));
        }

        /* renamed from: d */
        public final double mo12752d(Object obj, long j) {
            return Double.longBitsToDouble(mo12756f(obj, j));
        }
    }

    /* renamed from: g.d.a.b.d.g.r7$b */
    static final class C4185b extends C4187d {
        C4185b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo12745a(Object obj, long j) {
            return this.f11271a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo12746a(Object obj, long j, byte b) {
            this.f11271a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo12747a(Object obj, long j, double d) {
            this.f11271a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo12748a(Object obj, long j, float f) {
            this.f11271a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo12749a(Object obj, long j, boolean z) {
            this.f11271a.putBoolean(obj, j, z);
        }

        /* renamed from: b */
        public final boolean mo12750b(Object obj, long j) {
            return this.f11271a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo12751c(Object obj, long j) {
            return this.f11271a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo12752d(Object obj, long j) {
            return this.f11271a.getDouble(obj, j);
        }
    }

    /* renamed from: g.d.a.b.d.g.r7$c */
    static final class C4186c extends C4187d {
        C4186c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo12745a(Object obj, long j) {
            return C4183r7.f11270j ? C4183r7.m17025k(obj, j) : C4183r7.m17026l(obj, j);
        }

        /* renamed from: a */
        public final void mo12746a(Object obj, long j, byte b) {
            if (C4183r7.f11270j) {
                C4183r7.m17008c(obj, j, b);
            } else {
                C4183r7.m17012d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo12747a(Object obj, long j, double d) {
            mo12754a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo12748a(Object obj, long j, float f) {
            mo12753a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo12749a(Object obj, long j, boolean z) {
            if (C4183r7.f11270j) {
                C4183r7.m17013d(obj, j, z);
            } else {
                C4183r7.m17017e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo12750b(Object obj, long j) {
            return C4183r7.f11270j ? C4183r7.m17027m(obj, j) : C4183r7.m17028n(obj, j);
        }

        /* renamed from: c */
        public final float mo12751c(Object obj, long j) {
            return Float.intBitsToFloat(mo12755e(obj, j));
        }

        /* renamed from: d */
        public final double mo12752d(Object obj, long j) {
            return Double.longBitsToDouble(mo12756f(obj, j));
        }
    }

    /* renamed from: g.d.a.b.d.g.r7$d */
    static abstract class C4187d {

        /* renamed from: a */
        Unsafe f11271a;

        C4187d(Unsafe unsafe) {
            this.f11271a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo12745a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo12746a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo12747a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo12748a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo12753a(Object obj, long j, int i) {
            this.f11271a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo12754a(Object obj, long j, long j2) {
            this.f11271a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo12749a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo12750b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo12751c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo12752d(Object obj, long j);

        /* renamed from: e */
        public final int mo12755e(Object obj, long j) {
            return this.f11271a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo12756f(Object obj, long j) {
            return this.f11271a.getLong(obj, j);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        C4187d dVar = null;
        if (f11262b != null) {
            if (!C4046i3.m16532a()) {
                dVar = new C4185b(f11262b);
            } else if (f11264d) {
                dVar = new C4186c(f11262b);
            } else if (f11265e) {
                dVar = new C4184a(f11262b);
            }
        }
        f11266f = dVar;
        m17001b(cls6);
        m17006c(cls6);
        m17001b(cls5);
        m17006c(cls5);
        m17001b(cls4);
        m17006c(cls4);
        m17001b(cls3);
        m17006c(cls3);
        m17001b(cls2);
        m17006c(cls2);
        m17001b(cls);
        m17006c(cls);
        Field f = m17020f();
        if (f != null) {
            C4187d dVar2 = f11266f;
            if (dVar2 != null) {
                dVar2.f11271a.objectFieldOffset(f);
            }
        }
    }

    private C4183r7() {
    }

    /* renamed from: a */
    static byte m16988a(byte[] bArr, long j) {
        return f11266f.mo12745a(bArr, f11269i + j);
    }

    /* renamed from: a */
    static int m16989a(Object obj, long j) {
        return f11266f.mo12755e(obj, j);
    }

    /* renamed from: a */
    static <T> T m16990a(Class<T> cls) {
        try {
            return f11262b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static Field m16991a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m16993a(Object obj, long j, double d) {
        f11266f.mo12747a(obj, j, d);
    }

    /* renamed from: a */
    static void m16994a(Object obj, long j, float f) {
        f11266f.mo12748a(obj, j, f);
    }

    /* renamed from: a */
    static void m16995a(Object obj, long j, int i) {
        f11266f.mo12753a(obj, j, i);
    }

    /* renamed from: a */
    static void m16996a(Object obj, long j, long j2) {
        f11266f.mo12754a(obj, j, j2);
    }

    /* renamed from: a */
    static void m16997a(Object obj, long j, Object obj2) {
        f11266f.f11271a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m16998a(Object obj, long j, boolean z) {
        f11266f.mo12749a(obj, j, z);
    }

    /* renamed from: a */
    static void m16999a(byte[] bArr, long j, byte b) {
        f11266f.mo12746a((Object) bArr, f11269i + j, b);
    }

    /* renamed from: a */
    static boolean m17000a() {
        return f11268h;
    }

    /* renamed from: b */
    private static int m17001b(Class<?> cls) {
        if (f11268h) {
            return f11266f.f11271a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m17002b(Object obj, long j) {
        return f11266f.mo12756f(obj, j);
    }

    /* renamed from: b */
    static boolean m17005b() {
        return f11267g;
    }

    /* renamed from: c */
    private static int m17006c(Class<?> cls) {
        if (f11268h) {
            return f11266f.f11271a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    static Unsafe m17007c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4223t7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m17008c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        m16995a(obj, j2, i2 | (m16989a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: c */
    static boolean m17010c(Object obj, long j) {
        return f11266f.mo12750b(obj, j);
    }

    /* renamed from: d */
    static float m17011d(Object obj, long j) {
        return f11266f.mo12751c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m17012d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m16995a(obj, j2, ((255 & b) << i) | (m16989a(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m17013d(Object obj, long j, boolean z) {
        m17008c(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: d */
    private static boolean m17014d() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f11262b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C4046i3.m16532a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f11261a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m17015d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C4046i3.m16532a()) {
            return false;
        }
        try {
            Class<?> cls3 = f11263c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    static double m17016e(Object obj, long j) {
        return f11266f.mo12752d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m17017e(Object obj, long j, boolean z) {
        m17012d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    private static boolean m17018e() {
        String str = "copyMemory";
        String str2 = "getLong";
        Class<Object> cls = Object.class;
        Unsafe unsafe = f11262b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod(str2, new Class[]{cls, Long.TYPE});
            if (m17020f() == null) {
                return false;
            }
            if (C4046i3.m16532a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod(str2, new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f11261a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    static Object m17019f(Object obj, long j) {
        return f11266f.f11271a.getObject(obj, j);
    }

    /* renamed from: f */
    private static Field m17020f() {
        if (C4046i3.m16532a()) {
            Field a = m16991a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m16991a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m17025k(Object obj, long j) {
        return (byte) (m16989a(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m17026l(Object obj, long j) {
        return (byte) (m16989a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m17027m(Object obj, long j) {
        return m17025k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m17028n(Object obj, long j) {
        return m17026l(obj, j) != 0;
    }
}
