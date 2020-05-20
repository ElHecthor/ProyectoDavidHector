package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
final class C0809a {

    /* renamed from: b */
    private static final MarginLayoutParams f3128b;

    /* renamed from: a */
    private LinearLayoutManager f3129a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    class C0810a implements Comparator<int[]> {
        C0810a(C0809a aVar) {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -1);
        f3128b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C0809a(LinearLayoutManager linearLayoutManager) {
        this.f3129a = linearLayoutManager;
    }

    /* renamed from: a */
    private static boolean m4345a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m4345a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4346b() {
        int i;
        int i2;
        int i3;
        int i4;
        int e = this.f3129a.mo3587e();
        if (e == 0) {
            return true;
        }
        boolean z = this.f3129a.mo3145J() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = e;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < e) {
            View d = this.f3129a.mo3583d(i5);
            if (d != null) {
                LayoutParams layoutParams = d.getLayoutParams();
                MarginLayoutParams marginLayoutParams = layoutParams instanceof MarginLayoutParams ? (MarginLayoutParams) layoutParams : f3128b;
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = d.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = d.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = d.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = d.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0810a(this));
        for (int i6 = 1; i6 < e; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        return iArr2[0][0] <= 0 && iArr2[e - 1][1] >= iArr2[0][1] - iArr2[0][0];
    }

    /* renamed from: c */
    private boolean m4347c() {
        int e = this.f3129a.mo3587e();
        for (int i = 0; i < e; i++) {
            if (m4345a(this.f3129a.mo3583d(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4406a() {
        return (!m4346b() || this.f3129a.mo3587e() <= 1) && m4347c();
    }
}
