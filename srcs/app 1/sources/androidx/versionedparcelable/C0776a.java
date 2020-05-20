package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p071f.p088e.C3162a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C0776a {

    /* renamed from: a */
    protected final C3162a<String, Method> f3049a;

    /* renamed from: b */
    protected final C3162a<String, Method> f3050b;

    /* renamed from: c */
    protected final C3162a<String, Class> f3051c;

    public C0776a(C3162a<String, Method> aVar, C3162a<String, Method> aVar2, C3162a<String, Class> aVar3) {
        this.f3049a = aVar;
        this.f3050b = aVar2;
        this.f3051c = aVar3;
    }

    /* renamed from: a */
    private Class m4157a(Class<? extends C0778c> cls) {
        Class cls2 = (Class) this.f3051c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3051c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: b */
    private Method m4158b(Class cls) {
        Method method = (Method) this.f3050b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m4157a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, C0776a.class});
        this.f3050b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Method m4159b(String str) {
        Class<C0776a> cls = C0776a.class;
        Method method = (Method) this.f3049a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3049a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private void m4160b(C0778c cVar) {
        try {
            mo4297a(m4157a(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public int mo4286a(int i, int i2) {
        return !mo4301a(i2) ? i : mo4318g();
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo4287a(T t, int i) {
        return !mo4301a(i) ? t : mo4319h();
    }

    /* renamed from: a */
    public <T extends C0778c> T mo4288a(T t, int i) {
        return !mo4301a(i) ? t : mo4321j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0778c> T mo4289a(String str, C0776a aVar) {
        try {
            return (C0778c) m4159b(str).invoke(null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public CharSequence mo4290a(CharSequence charSequence, int i) {
        return !mo4301a(i) ? charSequence : mo4317f();
    }

    /* renamed from: a */
    public String mo4291a(String str, int i) {
        return !mo4301a(i) ? str : mo4320i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4292a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4293a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4294a(C0778c cVar) {
        if (cVar == null) {
            mo4297a((String) null);
            return;
        }
        m4160b(cVar);
        C0776a b = mo4304b();
        mo4295a((T) cVar, b);
        b.mo4292a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0778c> void mo4295a(T t, C0776a aVar) {
        try {
            m4158b(t.getClass()).invoke(null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4296a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4297a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4298a(boolean z);

    /* renamed from: a */
    public void mo4299a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4300a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo4301a(int i);

    /* renamed from: a */
    public boolean mo4302a(boolean z, int i) {
        return !mo4301a(i) ? z : mo4315d();
    }

    /* renamed from: a */
    public byte[] mo4303a(byte[] bArr, int i) {
        return !mo4301a(i) ? bArr : mo4316e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0776a mo4304b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4305b(int i);

    /* renamed from: b */
    public void mo4306b(int i, int i2) {
        mo4305b(i2);
        mo4313c(i);
    }

    /* renamed from: b */
    public void mo4307b(Parcelable parcelable, int i) {
        mo4305b(i);
        mo4293a(parcelable);
    }

    /* renamed from: b */
    public void mo4308b(C0778c cVar, int i) {
        mo4305b(i);
        mo4294a(cVar);
    }

    /* renamed from: b */
    public void mo4309b(CharSequence charSequence, int i) {
        mo4305b(i);
        mo4296a(charSequence);
    }

    /* renamed from: b */
    public void mo4310b(String str, int i) {
        mo4305b(i);
        mo4297a(str);
    }

    /* renamed from: b */
    public void mo4311b(boolean z, int i) {
        mo4305b(i);
        mo4298a(z);
    }

    /* renamed from: b */
    public void mo4312b(byte[] bArr, int i) {
        mo4305b(i);
        mo4300a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo4313c(int i);

    /* renamed from: c */
    public boolean mo4314c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo4315d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo4316e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo4317f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo4318g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo4319h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo4320i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends C0778c> T mo4321j() {
        String i = mo4320i();
        if (i == null) {
            return null;
        }
        return mo4289a(i, mo4304b());
    }
}
