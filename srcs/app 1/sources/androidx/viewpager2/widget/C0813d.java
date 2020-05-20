package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2.C0798i;
import androidx.viewpager2.widget.ViewPager2.C0803k;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
final class C0813d extends C0798i {

    /* renamed from: a */
    private final LinearLayoutManager f3132a;

    /* renamed from: b */
    private C0803k f3133b;

    C0813d(LinearLayoutManager linearLayoutManager) {
        this.f3132a = linearLayoutManager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0803k mo4412a() {
        return this.f3133b;
    }

    /* renamed from: a */
    public void mo4337a(int i) {
    }

    /* renamed from: a */
    public void mo4395a(int i, float f, int i2) {
        if (this.f3133b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f3132a.mo3587e()) {
                View d = this.f3132a.mo3583d(i3);
                if (d != null) {
                    this.f3133b.mo4399a(d, ((float) (this.f3132a.mo3608l(d) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f3132a.mo3587e())}));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4413a(C0803k kVar) {
        this.f3133b = kVar;
    }

    /* renamed from: b */
    public void mo4338b(int i) {
    }
}
