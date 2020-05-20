package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0205c0.C0206a;

public class FitWindowsLinearLayout extends LinearLayout implements C0205c0 {

    /* renamed from: f */
    private C0206a f724f;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0206a aVar = this.f724f;
        if (aVar != null) {
            aVar.mo326a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0206a aVar) {
        this.f724f = aVar;
    }
}
