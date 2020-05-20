package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import androidx.annotation.Keep;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p308k.C5797g;
import p308k.p311c0.C5742e;
import p308k.p316w.C5859a;
import p308k.p316w.C5871g;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5944m;
import p308k.p323z.p325d.C5945n;
import p308k.p323z.p325d.C5950s;

@Keep
public final class AndroidExceptionPreHandler extends C5859a implements CoroutineExceptionHandler, C5907a<Method> {
    static final /* synthetic */ C5742e[] $$delegatedProperties;
    private final C5797g preHandler$delegate = C5799i.m22044a(this);

    static {
        C5945n nVar = new C5945n(C5950s.m22341a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        C5950s.m22343a((C5944m) nVar);
        $$delegatedProperties = new C5742e[]{nVar};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f14950c);
    }

    private final Method getPreHandler() {
        C5797g gVar = this.preHandler$delegate;
        C5742e eVar = $$delegatedProperties[0];
        return (Method) gVar.getValue();
    }

    public void handleException(C5871g gVar, Throwable th) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (VERSION.SDK_INT >= 28) {
            C5942k.m22324a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object obj = null;
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        if (invoke instanceof UncaughtExceptionHandler) {
            obj = invoke;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C5942k.m22324a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
