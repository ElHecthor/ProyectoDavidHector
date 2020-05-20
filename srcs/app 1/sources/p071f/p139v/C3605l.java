package p071f.p139v;

import android.view.ViewGroup;

/* renamed from: f.v.l */
public class C3605l {

    /* renamed from: a */
    private ViewGroup f10114a;

    /* renamed from: b */
    private Runnable f10115b;

    /* renamed from: a */
    public static C3605l m14660a(ViewGroup viewGroup) {
        return (C3605l) viewGroup.getTag(C3598j.transition_current_scene);
    }

    /* renamed from: a */
    static void m14661a(ViewGroup viewGroup, C3605l lVar) {
        viewGroup.setTag(C3598j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo11348a() {
        if (m14660a(this.f10114a) == this) {
            Runnable runnable = this.f10115b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
