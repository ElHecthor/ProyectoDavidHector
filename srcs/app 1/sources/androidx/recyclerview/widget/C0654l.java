package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0592v;

/* renamed from: androidx.recyclerview.widget.l */
class C0654l {

    /* renamed from: a */
    boolean f2679a = true;

    /* renamed from: b */
    int f2680b;

    /* renamed from: c */
    int f2681c;

    /* renamed from: d */
    int f2682d;

    /* renamed from: e */
    int f2683e;

    /* renamed from: f */
    int f2684f = 0;

    /* renamed from: g */
    int f2685g = 0;

    /* renamed from: h */
    boolean f2686h;

    /* renamed from: i */
    boolean f2687i;

    C0654l() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3917a(C0592v vVar) {
        View d = vVar.mo3677d(this.f2681c);
        this.f2681c += this.f2682d;
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3918a(C0560a0 a0Var) {
        int i = this.f2681c;
        return i >= 0 && i < a0Var.mo3384a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f2680b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f2681c);
        sb.append(", mItemDirection=");
        sb.append(this.f2682d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f2683e);
        sb.append(", mStartLine=");
        sb.append(this.f2684f);
        sb.append(", mEndLine=");
        sb.append(this.f2685g);
        sb.append('}');
        return sb.toString();
    }
}
