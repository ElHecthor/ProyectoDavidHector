package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;

/* renamed from: androidx.constraintlayout.widget.h */
public class C0326h extends View {

    /* renamed from: f */
    private int f1559f;

    /* renamed from: g */
    private View f1560g;

    /* renamed from: h */
    private int f1561h;

    /* renamed from: a */
    public void mo2037a(ConstraintLayout constraintLayout) {
        if (this.f1560g != null) {
            C0306b bVar = (C0306b) getLayoutParams();
            C0306b bVar2 = (C0306b) this.f1560g.getLayoutParams();
            bVar2.f1392m0.mo10457o(0);
            bVar.f1392m0.mo10459p(bVar2.f1392m0.mo10471y());
            bVar.f1392m0.mo10443h(bVar2.f1392m0.mo10444i());
            bVar2.f1392m0.mo10457o(8);
        }
    }

    /* renamed from: b */
    public void mo2038b(ConstraintLayout constraintLayout) {
        if (this.f1559f == -1 && !isInEditMode()) {
            setVisibility(this.f1561h);
        }
        View findViewById = constraintLayout.findViewById(this.f1559f);
        this.f1560g = findViewById;
        if (findViewById != null) {
            ((C0306b) findViewById.getLayoutParams()).f1368a0 = true;
            this.f1560g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1560g;
    }

    public int getEmptyVisibility() {
        return this.f1561h;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f1559f != i) {
            View view = this.f1560g;
            if (view != null) {
                view.setVisibility(0);
                ((C0306b) this.f1560g.getLayoutParams()).f1368a0 = false;
                this.f1560g = null;
            }
            this.f1559f = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1561h = i;
    }
}
