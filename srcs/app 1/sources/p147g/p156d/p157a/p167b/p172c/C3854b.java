package p147g.p156d.p157a.p167b.p172c;

import android.os.IBinder;
import java.lang.reflect.Field;
import p147g.p156d.p157a.p167b.p172c.C3851a.C3852a;

/* renamed from: g.d.a.b.c.b */
public final class C3854b<T> extends C3852a {

    /* renamed from: a */
    private final T f10777a;

    private C3854b(T t) {
        this.f10777a = t;
    }

    /* renamed from: a */
    public static <T> C3851a m15592a(T t) {
        return new C3854b(t);
    }

    /* renamed from: a */
    public static <T> T m15593a(C3851a aVar) {
        if (aVar instanceof C3854b) {
            return ((C3854b) aVar).f10777a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
