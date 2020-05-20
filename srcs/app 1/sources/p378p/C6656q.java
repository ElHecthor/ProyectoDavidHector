package p378p;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p378p.C6605e.C6606a;
import p378p.C6614h.C6615a;

/* renamed from: p.q */
class C6656q {

    /* renamed from: c */
    private static final C6656q f16341c = m24994d();

    /* renamed from: a */
    private final boolean f16342a;
    @Nullable

    /* renamed from: b */
    private final Constructor<Lookup> f16343b;

    /* renamed from: p.q$a */
    static final class C6657a extends C6656q {

        /* renamed from: p.q$a$a */
        static final class C6658a implements Executor {

            /* renamed from: f */
            private final Handler f16344f = new Handler(Looper.getMainLooper());

            C6658a() {
            }

            public void execute(Runnable runnable) {
                this.f16344f.post(runnable);
            }
        }

        C6657a() {
            super(VERSION.SDK_INT >= 24);
        }

        /* access modifiers changed from: 0000 */
        @Nullable
        /* renamed from: a */
        public Object mo17108a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            if (VERSION.SDK_INT >= 26) {
                return C6656q.super.mo17108a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        /* renamed from: a */
        public Executor mo17110a() {
            return new C6658a();
        }
    }

    C6656q(boolean z) {
        this.f16342a = z;
        Constructor<Lookup> constructor = null;
        if (z) {
            try {
                constructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f16343b = constructor;
    }

    /* renamed from: d */
    private static C6656q m24994d() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C6657a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new C6656q(true);
    }

    /* renamed from: e */
    static C6656q m24995e() {
        return f16341c;
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: a */
    public Object mo17108a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        Lookup lookup;
        Constructor<Lookup> constructor = this.f16343b;
        if (constructor != null) {
            lookup = (Lookup) constructor.newInstance(new Object[]{cls, Integer.valueOf(-1)});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<? extends C6606a> mo17109a(@Nullable Executor executor) {
        C6616i iVar = new C6616i(executor);
        if (!this.f16342a) {
            return Collections.singletonList(iVar);
        }
        return Arrays.asList(new C6606a[]{C6608g.f16252a, iVar});
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: a */
    public Executor mo17110a() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo17111a(Method method) {
        return this.f16342a && method.isDefault();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<? extends C6615a> mo17112b() {
        return this.f16342a ? Collections.singletonList(C6640o.f16302a) : Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo17113c() {
        return this.f16342a ? 1 : 0;
    }
}
