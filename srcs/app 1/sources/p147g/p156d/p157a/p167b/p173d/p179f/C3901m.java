package p147g.p156d.p157a.p167b.p173d.p179f;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g.d.a.b.d.f.m */
public final class C3901m {
    /* renamed from: a */
    public static int m15654a(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
