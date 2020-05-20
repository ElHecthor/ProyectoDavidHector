package com.bumptech.glide.load.p007o;

import android.util.Log;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.q */
public final class C1013q extends Exception {

    /* renamed from: k */
    private static final StackTraceElement[] f3715k = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private final List<Throwable> f3716f;

    /* renamed from: g */
    private C0869g f3717g;

    /* renamed from: h */
    private C0856a f3718h;

    /* renamed from: i */
    private Class<?> f3719i;

    /* renamed from: j */
    private String f3720j;

    /* renamed from: com.bumptech.glide.load.o.q$a */
    private static final class C1014a implements Appendable {

        /* renamed from: f */
        private final Appendable f3721f;

        /* renamed from: g */
        private boolean f3722g = true;

        C1014a(Appendable appendable) {
            this.f3721f = appendable;
        }

        /* renamed from: a */
        private CharSequence m5054a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f3722g) {
                this.f3722g = false;
                this.f3721f.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f3722g = z;
            this.f3721f.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a = m5054a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = m5054a(charSequence);
            boolean z = false;
            if (this.f3722g) {
                this.f3722g = false;
                this.f3721f.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f3722g = z;
            this.f3721f.append(a, i, i2);
            return this;
        }
    }

    public C1013q(String str) {
        this(str, Collections.emptyList());
    }

    public C1013q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public C1013q(String str, List<Throwable> list) {
        this.f3720j = str;
        setStackTrace(f3715k);
        this.f3716f = list;
    }

    /* renamed from: a */
    private void m5043a(Appendable appendable) {
        m5044a((Throwable) this, appendable);
        m5046a(mo4888a(), (Appendable) new C1014a(appendable));
    }

    /* renamed from: a */
    private static void m5044a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private void m5045a(Throwable th, List<Throwable> list) {
        if (th instanceof C1013q) {
            for (Throwable a : ((C1013q) th).mo4888a()) {
                m5045a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private static void m5046a(List<Throwable> list, Appendable appendable) {
        try {
            m5047b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static void m5047b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C1013q) {
                ((C1013q) th).m5043a(appendable);
            } else {
                m5044a(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public List<Throwable> mo4888a() {
        return this.f3716f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4889a(C0869g gVar, C0856a aVar) {
        mo4890a(gVar, aVar, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4890a(C0869g gVar, C0856a aVar, Class<?> cls) {
        this.f3717g = gVar;
        this.f3718h = aVar;
        this.f3719i = cls;
    }

    /* renamed from: a */
    public void mo4891a(Exception exc) {
    }

    /* renamed from: a */
    public void mo4892a(String str) {
        List b = mo4893b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) b.get(i));
            i = i2;
        }
    }

    /* renamed from: b */
    public List<Throwable> mo4893b() {
        ArrayList arrayList = new ArrayList();
        m5045a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3720j);
        String str4 = ", ";
        String str5 = "";
        if (this.f3719i != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(this.f3719i);
            str = sb2.toString();
        } else {
            str = str5;
        }
        sb.append(str);
        if (this.f3718h != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.f3718h);
            str2 = sb3.toString();
        } else {
            str2 = str5;
        }
        sb.append(str2);
        if (this.f3717g != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(this.f3717g);
            str5 = sb4.toString();
        }
        sb.append(str5);
        List<Throwable> b = mo4893b();
        if (b.isEmpty()) {
            return sb.toString();
        }
        if (b.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(b.size());
            str3 = " causes:";
        }
        sb.append(str3);
        for (Throwable th : b) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m5043a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        m5043a((Appendable) printWriter);
    }
}
