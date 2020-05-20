package p071f.p126p.p128b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p071f.p097h.p107l.C3314a;

/* renamed from: f.p.b.b */
public class C3464b<D> {

    /* renamed from: a */
    int f9817a;

    /* renamed from: b */
    C3466b<D> f9818b;

    /* renamed from: c */
    C3465a<D> f9819c;

    /* renamed from: d */
    boolean f9820d = false;

    /* renamed from: e */
    boolean f9821e = false;

    /* renamed from: f */
    boolean f9822f = true;

    /* renamed from: g */
    boolean f9823g = false;

    /* renamed from: h */
    boolean f9824h = false;

    /* renamed from: f.p.b.b$a */
    public interface C3465a<D> {
        /* renamed from: a */
        void mo11071a(C3464b<D> bVar);
    }

    /* renamed from: f.p.b.b$b */
    public interface C3466b<D> {
        /* renamed from: a */
        void mo11022a(C3464b<D> bVar, D d);
    }

    public C3464b(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public String mo11052a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C3314a.m13529a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo11053a() {
        this.f9821e = true;
        mo11062g();
    }

    /* renamed from: a */
    public void mo11054a(int i, C3466b<D> bVar) {
        if (this.f9818b == null) {
            this.f9818b = bVar;
            this.f9817a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo11055a(C3466b<D> bVar) {
        C3466b<D> bVar2 = this.f9818b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f9818b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo11039a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f9817a);
        printWriter.print(" mListener=");
        printWriter.println(this.f9818b);
        if (this.f9820d || this.f9823g || this.f9824h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f9820d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f9823g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f9824h);
        }
        if (this.f9821e || this.f9822f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f9821e);
            printWriter.print(" mReset=");
            printWriter.println(this.f9822f);
        }
    }

    /* renamed from: b */
    public void mo11056b(D d) {
        C3466b<D> bVar = this.f9818b;
        if (bVar != null) {
            bVar.mo11022a(this, d);
        }
    }

    /* renamed from: b */
    public boolean mo11057b() {
        return mo11042h();
    }

    /* renamed from: c */
    public void mo11058c() {
        this.f9824h = false;
    }

    /* renamed from: d */
    public void mo11059d() {
        C3465a<D> aVar = this.f9819c;
        if (aVar != null) {
            aVar.mo11071a(this);
        }
    }

    /* renamed from: e */
    public void mo11060e() {
        mo11043j();
    }

    /* renamed from: f */
    public boolean mo11061f() {
        return this.f9821e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11062g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo11042h() {
        throw null;
    }

    /* renamed from: i */
    public void mo11063i() {
        if (this.f9820d) {
            mo11060e();
        } else {
            this.f9823g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo11043j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo11064k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6551l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo11065m() {
    }

    /* renamed from: n */
    public void mo11066n() {
        mo11064k();
        this.f9822f = true;
        this.f9820d = false;
        this.f9821e = false;
        this.f9823g = false;
        this.f9824h = false;
    }

    /* renamed from: o */
    public void mo11067o() {
        if (this.f9824h) {
            mo11063i();
        }
    }

    /* renamed from: p */
    public final void mo11068p() {
        this.f9820d = true;
        this.f9822f = false;
        this.f9821e = false;
        mo6551l();
    }

    /* renamed from: q */
    public void mo11069q() {
        this.f9820d = false;
        mo11065m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C3314a.m13529a(this, sb);
        sb.append(" id=");
        sb.append(this.f9817a);
        sb.append("}");
        return sb.toString();
    }
}
