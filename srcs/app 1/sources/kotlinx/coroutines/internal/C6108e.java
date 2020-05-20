package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.e */
public final class C6108e {

    /* renamed from: a */
    private static final Method f15200a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f15200a = method;
    }

    /* renamed from: a */
    public static final <E> List<E> m22952a() {
        return new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public static final <E> Set<E> m22953a(int i) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i));
        C5942k.m22324a((Object) newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        return newSetFromMap;
    }

    /* renamed from: a */
    public static final boolean m22954a(Executor executor) {
        C5942k.m22327b(executor, "executor");
        try {
            if (!(executor instanceof ScheduledExecutorService)) {
                executor = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executor;
            if (scheduledExecutorService != null) {
                Method method = f15200a;
                if (method != null) {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.valueOf(true)});
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }
}
