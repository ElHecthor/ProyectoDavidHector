package p382q.p383a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q.a.a */
public final class C6677a {

    /* renamed from: a */
    private static final C6679b[] f16431a = new C6679b[0];

    /* renamed from: b */
    private static final List<C6679b> f16432b = new ArrayList();

    /* renamed from: c */
    static volatile C6679b[] f16433c = f16431a;

    /* renamed from: d */
    private static final C6679b f16434d = new C6678a();

    /* renamed from: q.a.a$a */
    static class C6678a extends C6679b {
        C6678a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15345a(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        /* renamed from: a */
        public void mo17167a(Throwable th) {
            for (C6679b a : C6677a.f16433c) {
                a.mo17167a(th);
            }
        }

        /* renamed from: a */
        public void mo17168a(Throwable th, String str, Object... objArr) {
            for (C6679b a : C6677a.f16433c) {
                a.mo17168a(th, str, objArr);
            }
        }
    }

    /* renamed from: q.a.a$b */
    public static abstract class C6679b {

        /* renamed from: a */
        final ThreadLocal<String> f16435a = new ThreadLocal<>();

        /* renamed from: a */
        private void m25088a(int i, Throwable th, String str, Object... objArr) {
            String a = mo17169a();
            if (mo17172a(a, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = mo17170a(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        sb.append(m25089b(th));
                        str = sb.toString();
                    }
                } else if (th != null) {
                    str = m25089b(th);
                } else {
                    return;
                }
                mo15345a(i, a, str, th);
            }
        }

        /* renamed from: b */
        private String m25089b(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo17169a() {
            String str = (String) this.f16435a.get();
            if (str != null) {
                this.f16435a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17170a(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo15345a(int i, String str, String str2, Throwable th);

        /* renamed from: a */
        public void mo17167a(Throwable th) {
            m25088a(6, th, (String) null, new Object[0]);
        }

        /* renamed from: a */
        public void mo17168a(Throwable th, String str, Object... objArr) {
            m25088a(6, th, str, objArr);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: a */
        public boolean mo17171a(int i) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo17172a(String str, int i) {
            return mo17171a(i);
        }
    }

    /* renamed from: a */
    public static void m25082a(Throwable th) {
        f16434d.mo17167a(th);
    }

    /* renamed from: a */
    public static void m25083a(Throwable th, String str, Object... objArr) {
        f16434d.mo17168a(th, str, objArr);
    }

    /* renamed from: a */
    public static void m25084a(C6679b bVar) {
        if (bVar == null) {
            throw new NullPointerException("tree == null");
        } else if (bVar != f16434d) {
            synchronized (f16432b) {
                f16432b.add(bVar);
                f16433c = (C6679b[]) f16432b.toArray(new C6679b[f16432b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }
}
