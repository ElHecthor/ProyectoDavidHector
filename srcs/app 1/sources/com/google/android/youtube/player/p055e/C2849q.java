package com.google.android.youtube.player.p055e;

import android.os.IBinder;
import com.google.android.youtube.player.p055e.C2846p.C2847a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.youtube.player.e.q */
public final class C2849q<T> extends C2847a {

    /* renamed from: a */
    private final T f8301a;

    private C2849q(T t) {
        this.f8301a = t;
    }

    /* renamed from: a */
    public static <T> C2846p m11838a(T t) {
        return new C2849q(t);
    }

    /* renamed from: a */
    public static <T> T m11839a(C2846p pVar) {
        if (pVar instanceof C2849q) {
            return ((C2849q) pVar).f8301a;
        }
        IBinder asBinder = pVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
