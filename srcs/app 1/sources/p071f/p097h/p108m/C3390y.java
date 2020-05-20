package p071f.p097h.p108m;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p308k.p312d0.C5751d;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5955b;

/* renamed from: f.h.m.y */
public final class C3390y {

    /* renamed from: f.h.m.y$a */
    public static final class C3391a implements C5751d<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f9603a;

        C3391a(ViewGroup viewGroup) {
            this.f9603a = viewGroup;
        }

        public Iterator<View> iterator() {
            return C3390y.m13883b(this.f9603a);
        }
    }

    /* renamed from: f.h.m.y$b */
    public static final class C3392b implements Iterator<View>, C5955b {

        /* renamed from: f */
        private int f9604f;

        /* renamed from: g */
        final /* synthetic */ ViewGroup f9605g;

        C3392b(ViewGroup viewGroup) {
            this.f9605g = viewGroup;
        }

        public boolean hasNext() {
            return this.f9604f < this.f9605g.getChildCount();
        }

        public View next() {
            ViewGroup viewGroup = this.f9605g;
            int i = this.f9604f;
            this.f9604f = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public void remove() {
            ViewGroup viewGroup = this.f9605g;
            int i = this.f9604f - 1;
            this.f9604f = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final C5751d<View> m13882a(ViewGroup viewGroup) {
        C5942k.m22327b(viewGroup, "$this$children");
        return new C3391a(viewGroup);
    }

    /* renamed from: b */
    public static final Iterator<View> m13883b(ViewGroup viewGroup) {
        C5942k.m22327b(viewGroup, "$this$iterator");
        return new C3392b(viewGroup);
    }
}
