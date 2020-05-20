package p147g.p156d.p157a.p185c.p190n;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.C2704e;
import p147g.p156d.p157a.p185c.p190n.C4428a.C4429a;

/* renamed from: g.d.a.c.n.b */
public class C4431b {

    /* renamed from: a */
    public static final boolean f11763a = (VERSION.SDK_INT < 18);

    /* renamed from: a */
    public static SparseArray<C4428a> m18085a(Context context, C2704e eVar) {
        SparseArray<C4428a> sparseArray = new SparseArray<>(eVar.size());
        int i = 0;
        while (i < eVar.size()) {
            int keyAt = eVar.keyAt(i);
            C4429a aVar = (C4429a) eVar.valueAt(i);
            if (aVar != null) {
                sparseArray.put(keyAt, C4428a.m18043a(context, aVar));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static C2704e m18086a(SparseArray<C4428a> sparseArray) {
        C2704e eVar = new C2704e();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C4428a aVar = (C4428a) sparseArray.valueAt(i);
            if (aVar != null) {
                eVar.put(keyAt, aVar.mo13199e());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public static void m18087a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    /* renamed from: a */
    public static void m18088a(C4428a aVar, View view, FrameLayout frameLayout) {
        m18090c(aVar, view, frameLayout);
        if (f11763a) {
            frameLayout.setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    /* renamed from: b */
    public static void m18089b(C4428a aVar, View view, FrameLayout frameLayout) {
        if (aVar != null) {
            if (f11763a) {
                frameLayout.setForeground(null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    /* renamed from: c */
    public static void m18090c(C4428a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f11763a ? frameLayout : view).getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo13191a(view, (ViewGroup) frameLayout);
    }
}
