package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController.C0052f;
import p071f.p072a.C3093a;

/* renamed from: androidx.appcompat.app.b */
public class C0065b extends C0090g implements DialogInterface {

    /* renamed from: h */
    final AlertController f219h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0066a {

        /* renamed from: a */
        private final C0052f f220a;

        /* renamed from: b */
        private final int f221b;

        public C0066a(Context context) {
            this(context, C0065b.m231a(context, 0));
        }

        public C0066a(Context context, int i) {
            this.f220a = new C0052f(new ContextThemeWrapper(context, C0065b.m231a(context, i)));
            this.f221b = i;
        }

        /* renamed from: a */
        public C0066a mo212a(int i) {
            C0052f fVar = this.f220a;
            fVar.f177h = fVar.f170a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C0066a mo213a(int i, OnClickListener onClickListener) {
            C0052f fVar = this.f220a;
            fVar.f181l = fVar.f170a.getText(i);
            this.f220a.f183n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0066a mo214a(OnKeyListener onKeyListener) {
            this.f220a.f190u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0066a mo215a(Drawable drawable) {
            this.f220a.f173d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0066a mo216a(View view) {
            this.f220a.f176g = view;
            return this;
        }

        /* renamed from: a */
        public C0066a mo217a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
            C0052f fVar = this.f220a;
            fVar.f192w = listAdapter;
            fVar.f193x = onClickListener;
            fVar.f163I = i;
            fVar.f162H = true;
            return this;
        }

        /* renamed from: a */
        public C0066a mo218a(ListAdapter listAdapter, OnClickListener onClickListener) {
            C0052f fVar = this.f220a;
            fVar.f192w = listAdapter;
            fVar.f193x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0066a mo219a(CharSequence charSequence) {
            this.f220a.f175f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0065b mo220a() {
            C0065b bVar = new C0065b(this.f220a.f170a, this.f221b);
            this.f220a.mo157a(bVar.f219h);
            bVar.setCancelable(this.f220a.f187r);
            if (this.f220a.f187r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f220a.f188s);
            bVar.setOnDismissListener(this.f220a.f189t);
            OnKeyListener onKeyListener = this.f220a.f190u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: b */
        public Context mo221b() {
            return this.f220a.f170a;
        }

        /* renamed from: b */
        public C0066a mo222b(int i) {
            C0052f fVar = this.f220a;
            fVar.f175f = fVar.f170a.getText(i);
            return this;
        }

        /* renamed from: b */
        public C0066a mo223b(int i, OnClickListener onClickListener) {
            C0052f fVar = this.f220a;
            fVar.f178i = fVar.f170a.getText(i);
            this.f220a.f180k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0066a mo224b(View view) {
            C0052f fVar = this.f220a;
            fVar.f195z = view;
            fVar.f194y = 0;
            fVar.f159E = false;
            return this;
        }

        /* renamed from: c */
        public C0065b mo225c() {
            C0065b a = mo220a();
            a.show();
            return a;
        }
    }

    protected C0065b(Context context, int i) {
        super(context, m231a(context, i));
    }

    /* renamed from: a */
    static int m231a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3093a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView mo207b() {
        return this.f219h.mo137a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f219h.mo144b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f219h.mo143a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f219h.mo148b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f219h.mo147b(charSequence);
    }
}
