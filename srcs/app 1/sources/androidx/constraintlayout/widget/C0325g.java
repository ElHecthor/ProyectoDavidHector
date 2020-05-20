package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;

/* renamed from: androidx.constraintlayout.widget.g */
public class C0325g extends View {
    public C0325g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0306b bVar = (C0306b) getLayoutParams();
        bVar.f1367a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        C0306b bVar = (C0306b) getLayoutParams();
        bVar.f1369b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        C0306b bVar = (C0306b) getLayoutParams();
        bVar.f1371c = f;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i) {
    }
}
