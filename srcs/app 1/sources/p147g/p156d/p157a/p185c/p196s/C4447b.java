package p147g.p156d.p157a.p185c.p196s;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0065b;
import androidx.appcompat.app.C0065b.C0066a;
import com.google.android.material.theme.p054a.C2794a;
import p071f.p072a.p079o.C3127d;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4458b;

/* renamed from: g.d.a.c.s.b */
public class C4447b extends C0066a {

    /* renamed from: e */
    private static final int f11783e = C4375b.alertDialogStyle;

    /* renamed from: f */
    private static final int f11784f = C4415k.MaterialAlertDialog_MaterialComponents;

    /* renamed from: g */
    private static final int f11785g = C4375b.materialAlertDialogTheme;

    /* renamed from: c */
    private Drawable f11786c;

    /* renamed from: d */
    private final Rect f11787d;

    public C4447b(Context context) {
        this(context, 0);
    }

    public C4447b(Context context, int i) {
        super(m18124a(context), m18123a(context, i));
        Context b = mo221b();
        Theme theme = b.getTheme();
        this.f11787d = C4448c.m18145a(b, f11783e, f11784f);
        int a = C4445a.m18119a(b, C4375b.colorSurface, C4447b.class.getCanonicalName());
        C4382g gVar = new C4382g(b, null, f11783e, f11784f);
        gVar.mo13058a(b);
        gVar.mo13059a(ColorStateList.valueOf(a));
        if (VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(mo221b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gVar.mo13053a(dimension);
            }
        }
        this.f11786c = gVar;
    }

    /* renamed from: a */
    private static int m18123a(Context context, int i) {
        return i == 0 ? m18125b(context) : i;
    }

    /* renamed from: a */
    private static Context m18124a(Context context) {
        int b = m18125b(context);
        Context b2 = C2794a.m11644b(context, null, f11783e, f11784f);
        return b == 0 ? b2 : new C3127d(b2, b);
    }

    /* renamed from: b */
    private static int m18125b(Context context) {
        TypedValue a = C4458b.m18171a(context, f11785g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    /* renamed from: a */
    public C0065b mo220a() {
        C0065b a = super.mo220a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f11786c;
        if (drawable instanceof C4382g) {
            ((C4382g) drawable).mo13064b(C3379v.m13825l(decorView));
        }
        window.setBackgroundDrawable(C4448c.m18146a(this.f11786c, this.f11787d));
        decorView.setOnTouchListener(new C4446a(a, this.f11787d));
        return a;
    }

    /* renamed from: a */
    public C4447b mo212a(int i) {
        super.mo212a(i);
        return this;
    }

    /* renamed from: a */
    public C4447b mo213a(int i, OnClickListener onClickListener) {
        super.mo213a(i, onClickListener);
        return this;
    }

    /* renamed from: a */
    public C4447b m18135a(OnKeyListener onKeyListener) {
        super.mo214a(onKeyListener);
        return this;
    }

    /* renamed from: a */
    public C4447b m18136a(Drawable drawable) {
        super.mo215a(drawable);
        return this;
    }

    /* renamed from: a */
    public C4447b m18137a(View view) {
        super.mo216a(view);
        return this;
    }

    /* renamed from: a */
    public C4447b m18138a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
        super.mo217a(listAdapter, i, onClickListener);
        return this;
    }

    /* renamed from: a */
    public C4447b m18139a(ListAdapter listAdapter, OnClickListener onClickListener) {
        super.mo218a(listAdapter, onClickListener);
        return this;
    }

    /* renamed from: a */
    public C4447b m18140a(CharSequence charSequence) {
        super.mo219a(charSequence);
        return this;
    }

    /* renamed from: b */
    public C4447b mo222b(int i) {
        super.mo222b(i);
        return this;
    }

    /* renamed from: b */
    public C4447b mo223b(int i, OnClickListener onClickListener) {
        super.mo223b(i, onClickListener);
        return this;
    }

    /* renamed from: b */
    public C4447b m18144b(View view) {
        super.mo224b(view);
        return this;
    }
}
