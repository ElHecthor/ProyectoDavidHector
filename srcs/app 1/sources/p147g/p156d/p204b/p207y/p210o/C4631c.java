package p147g.p156d.p204b.p207y.p210o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p147g.p156d.p204b.C4498m;

/* renamed from: g.d.b.y.o.c */
final class C4631c extends C4630b {

    /* renamed from: d */
    private static Class f12114d;

    /* renamed from: b */
    private final Object f12115b = m18687c();

    /* renamed from: c */
    private final Field f12116c = m18686b();

    C4631c() {
    }

    /* renamed from: b */
    private static Field m18686b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Object m18687c() {
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            f12114d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo13527a(AccessibleObject accessibleObject) {
        if (!mo13528b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new C4498m(sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo13528b(AccessibleObject accessibleObject) {
        if (!(this.f12115b == null || this.f12116c == null)) {
            try {
                long longValue = ((Long) f12114d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f12115b, new Object[]{this.f12116c})).longValue();
                f12114d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f12115b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
