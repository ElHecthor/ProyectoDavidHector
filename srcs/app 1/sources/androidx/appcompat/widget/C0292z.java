package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0137m.C0138a;
import p071f.p097h.p108m.C3325a0;

/* renamed from: androidx.appcompat.widget.z */
public interface C0292z {
    /* renamed from: a */
    C3325a0 mo1754a(int i, long j);

    /* renamed from: a */
    void mo1755a(int i);

    /* renamed from: a */
    void mo1756a(Drawable drawable);

    /* renamed from: a */
    void mo1757a(Menu menu, C0138a aVar);

    /* renamed from: a */
    void mo1759a(C0138a aVar, C0123a aVar2);

    /* renamed from: a */
    void mo1760a(C0242l0 l0Var);

    /* renamed from: a */
    void mo1762a(boolean z);

    /* renamed from: a */
    boolean mo1763a();

    /* renamed from: b */
    Context mo1764b();

    /* renamed from: b */
    void mo1765b(int i);

    /* renamed from: b */
    void mo1768b(boolean z);

    /* renamed from: c */
    void mo1769c();

    /* renamed from: c */
    void mo1770c(int i);

    void collapseActionView();

    /* renamed from: d */
    boolean mo1774d();

    /* renamed from: e */
    boolean mo1776e();

    /* renamed from: f */
    boolean mo1777f();

    /* renamed from: g */
    boolean mo1778g();

    CharSequence getTitle();

    /* renamed from: h */
    void mo1780h();

    /* renamed from: i */
    ViewGroup mo1781i();

    /* renamed from: j */
    boolean mo1782j();

    /* renamed from: k */
    int mo1783k();

    /* renamed from: l */
    Menu mo1784l();

    /* renamed from: m */
    int mo1785m();

    /* renamed from: n */
    void mo1786n();

    /* renamed from: o */
    void mo1787o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
