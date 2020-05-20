package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.viewpager2.adapter.a */
public final class C0788a extends C0566d0 {
    private C0788a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: a */
    static C0788a m4260a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.setId(C3379v.m13800b());
        frameLayout.setSaveEnabled(false);
        return new C0788a(frameLayout);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public FrameLayout mo4341B() {
        return (FrameLayout) this.f2358a;
    }
}
