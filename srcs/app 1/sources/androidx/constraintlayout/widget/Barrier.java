package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p071f.p089f.p093b.p094j.C3190a;
import p071f.p089f.p093b.p094j.C3196e;

public class Barrier extends C0312b {

    /* renamed from: m */
    private int f1317m;

    /* renamed from: n */
    private int f1318n;

    /* renamed from: o */
    private C3190a f1319o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1591a(p071f.p089f.p093b.p094j.C3196e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f1318n = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L_0x0016
            int r7 = r5.f1317m
            if (r7 != r3) goto L_0x0013
        L_0x0010:
            r5.f1318n = r1
            goto L_0x0028
        L_0x0013:
            if (r7 != r2) goto L_0x0028
        L_0x0015:
            goto L_0x001c
        L_0x0016:
            int r7 = r5.f1317m
            if (r8 == 0) goto L_0x0022
            if (r7 != r3) goto L_0x001f
        L_0x001c:
            r5.f1318n = r0
            goto L_0x0028
        L_0x001f:
            if (r7 != r2) goto L_0x0028
            goto L_0x0010
        L_0x0022:
            if (r7 != r3) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            if (r7 != r2) goto L_0x0028
            goto L_0x0015
        L_0x0028:
            boolean r7 = r6 instanceof p071f.p089f.p093b.p094j.C3190a
            if (r7 == 0) goto L_0x0033
            f.f.b.j.a r6 = (p071f.p089f.p093b.p094j.C3190a) r6
            int r7 = r5.f1318n
            r6.mo10378s(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m1591a(f.f.b.j.e, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1929a(AttributeSet attributeSet) {
        super.mo1929a(attributeSet);
        this.f1319o = new C3190a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0328j.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0328j.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1319o.mo10377d(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0328j.ConstraintLayout_Layout_barrierMargin) {
                    this.f1319o.mo10379t(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1428i = this.f1319o;
        mo2000a();
    }

    /* renamed from: a */
    public void mo1930a(C3196e eVar, boolean z) {
        m1591a(eVar, this.f1317m, z);
    }

    /* renamed from: b */
    public boolean mo1953b() {
        return this.f1319o.mo10372G();
    }

    public int getMargin() {
        return this.f1319o.mo10374I();
    }

    public int getType() {
        return this.f1317m;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1319o.mo10377d(z);
    }

    public void setDpMargin(int i) {
        this.f1319o.mo10379t((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1319o.mo10379t(i);
    }

    public void setType(int i) {
        this.f1317m = i;
    }
}
