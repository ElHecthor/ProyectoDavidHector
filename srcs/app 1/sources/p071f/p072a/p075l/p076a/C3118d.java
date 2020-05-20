package p071f.p072a.p075l.p076a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.l.a.d */
class C3118d extends C3113b {

    /* renamed from: r */
    private C3119a f8829r;

    /* renamed from: s */
    private boolean f8830s;

    /* renamed from: f.a.l.a.d$a */
    static class C3119a extends C3116c {

        /* renamed from: J */
        int[][] f8831J;

        C3119a(C3119a aVar, C3118d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f8831J = aVar.f8831J;
            } else {
                this.f8831J = new int[mo9992c()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo10035a(int[] iArr) {
            int[][] iArr2 = this.f8831J;
            int d = mo9995d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo10036a(int[] iArr, Drawable drawable) {
            int a = mo9981a(drawable);
            this.f8831J[a] = iArr;
            return a;
        }

        /* renamed from: a */
        public void mo9983a(int i, int i2) {
            super.mo9983a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f8831J, 0, iArr, 0, i);
            this.f8831J = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo9933m() {
            int[][] iArr = this.f8831J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f8831J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f8831J = iArr2;
        }

        public Drawable newDrawable() {
            return new C3118d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3118d(this, resources);
        }
    }

    C3118d(C3119a aVar) {
        if (aVar != null) {
            mo9918a((C3116c) aVar);
        }
    }

    C3118d(C3119a aVar, Resources resources) {
        mo9918a((C3116c) new C3119a(aVar, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3119a m12634a() {
        return new C3119a(this.f8829r, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9918a(C3116c cVar) {
        super.mo9918a(cVar);
        if (cVar instanceof C3119a) {
            this.f8829r = (C3119a) cVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo10034a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f8830s) {
            super.mutate();
            if (this == this) {
                this.f8829r.mo9933m();
                this.f8830s = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f8829r.mo10035a(iArr);
        if (a < 0) {
            a = this.f8829r.mo10035a(StateSet.WILD_CARD);
        }
        return mo9943a(a) || onStateChange;
    }
}
