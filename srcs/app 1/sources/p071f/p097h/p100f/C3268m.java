package p071f.p097h.p100f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p071f.p097h.p098e.p099c.C3240c.C3242b;
import p071f.p097h.p098e.p099c.C3240c.C3243c;
import p071f.p097h.p105j.C3283b.C3289f;

/* renamed from: f.h.f.m */
class C3268m {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C3242b> f9399a = new ConcurrentHashMap<>();

    /* renamed from: f.h.f.m$a */
    class C3269a implements C3271c<C3289f> {
        C3269a(C3268m mVar) {
        }

        /* renamed from: a */
        public int mo10620a(C3289f fVar) {
            return fVar.mo10646d();
        }

        /* renamed from: b */
        public boolean mo10622b(C3289f fVar) {
            return fVar.mo10647e();
        }
    }

    /* renamed from: f.h.f.m$b */
    class C3270b implements C3271c<C3243c> {
        C3270b(C3268m mVar) {
        }

        /* renamed from: a */
        public int mo10620a(C3243c cVar) {
            return cVar.mo10595e();
        }

        /* renamed from: b */
        public boolean mo10622b(C3243c cVar) {
            return cVar.mo10596f();
        }
    }

    /* renamed from: f.h.f.m$c */
    private interface C3271c<T> {
        /* renamed from: a */
        int mo10620a(T t);

        /* renamed from: b */
        boolean mo10622b(T t);
    }

    C3268m() {
    }

    /* renamed from: a */
    private C3243c m13408a(C3242b bVar, int i) {
        return (C3243c) m13409a(bVar.mo10590a(), i, new C3270b(this));
    }

    /* renamed from: a */
    private static <T> T m13409a(T[] tArr, int i, C3271c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo10620a(t2) - i2) * 2) + (cVar.mo10622b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    private void m13410a(Typeface typeface, C3242b bVar) {
        long b = m13411b(typeface);
        if (b != 0) {
            this.f9399a.put(Long.valueOf(b), bVar);
        }
    }

    /* renamed from: b */
    private static long m13411b(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        }
    }

    /* renamed from: a */
    public Typeface mo10607a(Context context, Resources resources, int i, String str, int i2) {
        File a = C3272n.m13428a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C3272n.m13433a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo10605a(Context context, CancellationSignal cancellationSignal, C3289f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo10617a(fVarArr, i).mo10645c());
            try {
                Typeface a = mo10616a(context, inputStream);
                C3272n.m13432a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C3272n.m13432a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C3272n.m13432a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C3272n.m13432a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C3272n.m13432a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo10606a(Context context, C3242b bVar, Resources resources, int i) {
        C3243c a = m13408a(bVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C3262g.m13364a(context, resources, a.mo10592b(), a.mo10591a(), i);
        m13410a(a2, bVar);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo10616a(Context context, InputStream inputStream) {
        File a = C3272n.m13428a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C3272n.m13434a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3242b mo10618a(Typeface typeface) {
        long b = m13411b(typeface);
        if (b == 0) {
            return null;
        }
        return (C3242b) this.f9399a.get(Long.valueOf(b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3289f mo10617a(C3289f[] fVarArr, int i) {
        return (C3289f) m13409a(fVarArr, i, new C3269a(this));
    }
}
