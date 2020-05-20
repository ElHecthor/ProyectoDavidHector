package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p071f.p097h.p107l.C3321h;

/* renamed from: androidx.fragment.app.i */
public abstract class C0441i<E> extends C0438f {

    /* renamed from: f */
    private final Activity f1994f;

    /* renamed from: g */
    private final Context f1995g;

    /* renamed from: h */
    private final Handler f1996h;

    /* renamed from: i */
    final C0445l f1997i;

    C0441i(Activity activity, Context context, Handler handler, int i) {
        this.f1997i = new C0456m();
        this.f1994f = activity;
        C3321h.m13544a(context, (Object) "context == null");
        this.f1995g = context;
        C3321h.m13544a(handler, (Object) "handler == null");
        this.f1996h = handler;
    }

    C0441i(C0429d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    /* renamed from: a */
    public View mo2593a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2687a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2688a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1995g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo2689a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public boolean mo2690b(Fragment fragment) {
        return true;
    }

    /* renamed from: d */
    public boolean mo2594d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Activity mo2729e() {
        return this.f1994f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Context mo2730f() {
        return this.f1995g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Handler mo2731g() {
        return this.f1996h;
    }

    /* renamed from: i */
    public abstract E mo2691i();

    /* renamed from: j */
    public LayoutInflater mo2692j() {
        return LayoutInflater.from(this.f1995g);
    }

    /* renamed from: k */
    public void mo2693k() {
    }
}
