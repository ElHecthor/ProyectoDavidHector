package p071f.p080b.p081a.p082a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f.b.a.a.b */
public class C3140b extends C3142c {

    /* renamed from: a */
    private final Object f8909a = new Object();

    /* renamed from: b */
    private final ExecutorService f8910b = Executors.newFixedThreadPool(4, new C3141a(this));

    /* renamed from: c */
    private volatile Handler f8911c;

    /* renamed from: f.b.a.a.b$a */
    class C3141a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f8912a = new AtomicInteger(0);

        C3141a(C3140b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f8912a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    private static Handler m12728a(Looper looper) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo10108a(Runnable runnable) {
        this.f8910b.execute(runnable);
    }

    /* renamed from: a */
    public boolean mo10109a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo10110c(Runnable runnable) {
        if (this.f8911c == null) {
            synchronized (this.f8909a) {
                if (this.f8911c == null) {
                    this.f8911c = m12728a(Looper.getMainLooper());
                }
            }
        }
        this.f8911c.post(runnable);
    }
}
