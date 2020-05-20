package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.android.c */
public final class C6010c {
    static {
        Object obj;
        try {
            C5804a aVar = C5803m.f14866f;
            Looper mainLooper = Looper.getMainLooper();
            C5942k.m22324a((Object) mainLooper, "Looper.getMainLooper()");
            obj = new C6007a(m22579a(mainLooper, true), "Main");
            C5803m.m22049a(obj);
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
            C5803m.m22049a(obj);
        }
        if (C5803m.m22051c(obj)) {
            obj = null;
        }
        C6009b bVar = (C6009b) obj;
    }

    /* renamed from: a */
    public static final Handler m22579a(Looper looper, boolean z) {
        C5942k.m22327b(looper, "$this$asHandler");
        if (z) {
            int i = VERSION.SDK_INT;
            if (i >= 16) {
                if (i >= 28) {
                    Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
                    if (invoke != null) {
                        return (Handler) invoke;
                    }
                    throw new C5809q("null cannot be cast to non-null type android.os.Handler");
                }
                try {
                    Constructor declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE});
                    C5942k.m22324a((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
                    Object newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
                    C5942k.m22324a(newInstance, "constructor.newInstance(this, null, true)");
                    return (Handler) newInstance;
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
        }
        return new Handler(looper);
    }
}
