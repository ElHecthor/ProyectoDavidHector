package p147g.p225e.p226a.p235i.p236a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.stfalcon.imageviewer.common.pager.C3080a;
import com.stfalcon.imageviewer.common.pager.C3080a.C3083c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147g.p153c.p154a.p155a.C3726i;
import p147g.p153c.p154a.p155a.C3728k;
import p147g.p225e.p226a.p227f.p228a.C4721b;
import p147g.p225e.p226a.p234h.C4740a;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.i.a.a */
public final class C4741a<T> extends C3080a<C4742a> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<? extends T> f12399e;

    /* renamed from: f */
    private final List<C4742a> f12400f = new ArrayList();

    /* renamed from: g */
    private final Context f12401g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4740a<T> f12402h;

    /* renamed from: i */
    private final boolean f12403i;

    /* renamed from: g.e.a.i.a.a$a */
    public final class C4742a extends C3083c {

        /* renamed from: e */
        private final C3728k f12404e;

        /* renamed from: f */
        final /* synthetic */ C4741a f12405f;

        public C4742a(C4741a aVar, View view) {
            C5942k.m22327b(view, "itemView");
            this.f12405f = aVar;
            super(view);
            this.f12404e = (C3728k) view;
        }

        /* renamed from: b */
        public final void mo13716b(int i) {
            mo9900a(i);
            this.f12405f.f12402h.mo13712a(this.f12404e, this.f12405f.f12399e.get(i));
        }

        /* renamed from: e */
        public final boolean mo13717e() {
            return this.f12404e.getScale() > 1.0f;
        }

        /* renamed from: f */
        public final void mo13718f() {
            C4721b.m19030a(this.f12404e, true);
        }
    }

    /* renamed from: g.e.a.i.a.a$b */
    static final class C4743b implements C3726i {

        /* renamed from: a */
        final /* synthetic */ C3728k f12406a;

        C4743b(C3728k kVar) {
            this.f12406a = kVar;
        }

        /* renamed from: a */
        public final void mo11813a(float f, float f2) {
            C3728k kVar = this.f12406a;
            kVar.setAllowParentInterceptOnEdge(kVar.getScale() == 1.0f);
        }
    }

    public C4741a(Context context, List<? extends T> list, C4740a<T> aVar, boolean z) {
        C5942k.m22327b(context, "context");
        C5942k.m22327b(list, "_images");
        C5942k.m22327b(aVar, "imageLoader");
        this.f12401g = context;
        this.f12402h = aVar;
        this.f12403i = z;
        this.f12399e = list;
    }

    /* renamed from: a */
    public void mo9892a(C4742a aVar, int i) {
        C5942k.m22327b(aVar, "holder");
        aVar.mo13716b(i);
    }

    /* renamed from: b */
    public C4742a m19080b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C3728k kVar = new C3728k(this.f12401g);
        kVar.setEnabled(this.f12403i);
        kVar.setOnViewDragListener(new C4743b(kVar));
        C4742a aVar = new C4742a<>(this, kVar);
        this.f12400f.add(aVar);
        return aVar;
    }

    /* renamed from: c */
    public int mo9896c() {
        return this.f12399e.size();
    }

    /* renamed from: c */
    public final boolean mo13714c(int i) {
        Object obj;
        boolean z;
        Iterator it = this.f12400f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C4742a) obj).mo9904b() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C4742a aVar = (C4742a) obj;
        if (aVar != null) {
            return aVar.mo13717e();
        }
        return false;
    }

    /* renamed from: d */
    public final C5812t mo13715d(int i) {
        Object obj;
        boolean z;
        Iterator it = this.f12400f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C4742a) obj).mo9904b() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C4742a aVar = (C4742a) obj;
        if (aVar == null) {
            return null;
        }
        aVar.mo13718f();
        return C5812t.f14872a;
    }
}
