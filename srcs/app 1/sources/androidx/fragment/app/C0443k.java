package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0445l.C0451f;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.k */
class C0443k {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0444a> f1999a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final C0445l f2000b;

    /* renamed from: androidx.fragment.app.k$a */
    private static final class C0444a {

        /* renamed from: a */
        final C0451f f2001a;

        /* renamed from: b */
        final boolean f2002b;

        C0444a(C0451f fVar, boolean z) {
            this.f2001a = fVar;
            this.f2002b = z;
        }
    }

    C0443k(C0445l lVar) {
        this.f2000b = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2734a(Fragment fragment, Context context, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2734a(fragment, context, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2832a(this.f2000b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2735a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2735a(fragment, bundle, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2833a(this.f2000b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2736a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2736a(fragment, view, bundle, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2834a(this.f2000b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2737a(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2737a(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2831a(this.f2000b, fragment);
            }
        }
    }

    /* renamed from: a */
    public void mo2738a(C0451f fVar) {
        synchronized (this.f1999a) {
            int i = 0;
            int size = this.f1999a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C0444a) this.f1999a.get(i)).f2001a == fVar) {
                    this.f1999a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2739a(C0451f fVar, boolean z) {
        this.f1999a.add(new C0444a(fVar, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2740b(Fragment fragment, Context context, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2740b(fragment, context, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2836b(this.f2000b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2741b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2741b(fragment, bundle, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2837b(this.f2000b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2742b(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2742b(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2835b(this.f2000b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2743c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2743c(fragment, bundle, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2839c(this.f2000b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2744c(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2744c(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2838c(this.f2000b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2745d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2745d(fragment, bundle, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2841d(this.f2000b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2746d(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2746d(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2840d(this.f2000b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2747e(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2747e(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2842e(this.f2000b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2748f(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2748f(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2843f(this.f2000b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2749g(Fragment fragment, boolean z) {
        Fragment s = this.f2000b.mo2818s();
        if (s != null) {
            s.mo2589y().mo2817r().mo2749g(fragment, true);
        }
        Iterator it = this.f1999a.iterator();
        while (it.hasNext()) {
            C0444a aVar = (C0444a) it.next();
            if (!z || aVar.f2002b) {
                aVar.f2001a.mo2844g(this.f2000b, fragment);
            }
        }
    }
}
