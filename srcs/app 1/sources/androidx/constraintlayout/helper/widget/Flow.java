package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.widget.C0328j;
import androidx.constraintlayout.widget.C0329k;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3200g;
import p071f.p089f.p093b.p094j.C3207l;

public class Flow extends C0329k {

    /* renamed from: m */
    private C3200g f1316m;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1929a(AttributeSet attributeSet) {
        super.mo1929a(attributeSet);
        this.f1316m = new C3200g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0328j.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.ConstraintLayout_Layout_android_orientation) {
                    this.f1316m.mo10498F(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_android_padding) {
                    this.f1316m.mo10378s(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1316m.mo10540u(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1316m.mo10542w(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1316m.mo10541v(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1316m.mo10539t(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1316m.mo10502J(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1316m.mo10494B(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1316m.mo10501I(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1316m.mo10510x(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1316m.mo10495C(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1316m.mo10511y(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1316m.mo10496D(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1316m.mo10506g(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1316m.mo10504e(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1316m.mo10507h(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1316m.mo10505f(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1316m.mo10508i(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1316m.mo10509j(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1316m.mo10512z(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1316m.mo10499G(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1316m.mo10493A(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1316m.mo10500H(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1316m.mo10497E(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f1428i = this.f1316m;
        mo2000a();
    }

    /* renamed from: a */
    public void mo1930a(C3196e eVar, boolean z) {
    }

    /* renamed from: a */
    public void mo1931a(C3207l lVar, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.mo10503b(mode, size, mode2, size2);
            setMeasuredDimension(lVar.mo10530I(), lVar.mo10529H());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo1931a(this.f1316m, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1316m.mo10504e(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1316m.mo10510x(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1316m.mo10505f(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1316m.mo10511y(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1316m.mo10512z(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1316m.mo10506g(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1316m.mo10493A(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1316m.mo10494B(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1316m.mo10497E(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1316m.mo10498F(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1316m.mo10378s(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1316m.mo10539t(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1316m.mo10540u(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1316m.mo10541v(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1316m.mo10542w(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1316m.mo10499G(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1316m.mo10509j(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1316m.mo10500H(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1316m.mo10501I(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1316m.mo10502J(i);
        requestLayout();
    }
}
