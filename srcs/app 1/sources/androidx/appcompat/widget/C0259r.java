package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p071f.p072a.C3093a;

/* renamed from: androidx.appcompat.widget.r */
public class C0259r extends SeekBar {

    /* renamed from: f */
    private final C0261s f1150f;

    public C0259r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.seekBarStyle);
    }

    public C0259r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0261s sVar = new C0261s(this);
        this.f1150f = sVar;
        sVar.mo1648a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1150f.mo1668b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1150f.mo1669c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1150f.mo1666a(canvas);
    }
}
