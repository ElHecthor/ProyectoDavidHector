package com.google.android.youtube.player.p055e;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.youtube.player.p055e.C2822f.C2823a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.youtube.player.e.r */
public final class C2850r {

    /* renamed from: com.google.android.youtube.player.e.r$a */
    public static final class C2851a extends Exception {
        public C2851a(String str) {
            super(str);
        }

        public C2851a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    private static IBinder m11840a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z)});
        } catch (NoSuchMethodException e) {
            String str = "Could not find the right constructor for ";
            String valueOf = String.valueOf(cls.getName());
            throw new C2851a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        } catch (InvocationTargetException e2) {
            String str2 = "Exception thrown by invoked constructor in ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new C2851a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e2);
        } catch (InstantiationException e3) {
            String str3 = "Unable to instantiate the dynamic class ";
            String valueOf3 = String.valueOf(cls.getName());
            throw new C2851a(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), e3);
        } catch (IllegalAccessException e4) {
            String str4 = "Unable to call the default constructor of ";
            String valueOf4 = String.valueOf(cls.getName());
            throw new C2851a(valueOf4.length() != 0 ? str4.concat(valueOf4) : new String(str4), e4);
        }
    }

    /* renamed from: a */
    private static IBinder m11841a(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return m11840a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (ClassNotFoundException e) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new C2851a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }

    /* renamed from: a */
    public static C2822f m11842a(Activity activity, IBinder iBinder, boolean z) {
        C2817b.m11730a(activity);
        C2817b.m11730a(iBinder);
        Context b = C2854u.m11848b(activity);
        if (b != null) {
            return C2823a.m11754a(m11841a(b.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", C2849q.m11838a(b).asBinder(), C2849q.m11838a(activity).asBinder(), iBinder, z));
        }
        throw new C2851a("Could not create remote context");
    }
}
