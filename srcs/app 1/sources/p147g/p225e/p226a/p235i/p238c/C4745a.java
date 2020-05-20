package p147g.p225e.p226a.p235i.p238c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.C0065b;
import androidx.appcompat.app.C0065b.C0066a;
import p147g.p225e.p226a.C4717d;
import p147g.p225e.p226a.p233g.C4738a;
import p147g.p225e.p226a.p233g.C4739b;
import p147g.p225e.p226a.p235i.p237b.C4744a;
import p147g.p225e.p226a.p235i.p239d.C4751a;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: g.e.a.i.c.a */
public final class C4745a<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0065b f12420a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4751a<T> f12421b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f12422c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4744a<T> f12423d;

    /* renamed from: g.e.a.i.c.a$a */
    static final class C4746a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C4745a f12424a;

        C4746a(C4745a aVar) {
            this.f12424a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f12424a.f12421b.mo13741a(this.f12424a.f12423d.mo13731k(), this.f12424a.f12422c);
        }
    }

    /* renamed from: g.e.a.i.c.a$b */
    static final class C4747b implements OnDismissListener {

        /* renamed from: f */
        final /* synthetic */ C4745a f12425f;

        C4747b(C4745a aVar) {
            this.f12425f = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C4738a g = this.f12425f.f12423d.mo13727g();
            if (g != null) {
                g.onDismiss();
            }
        }
    }

    /* renamed from: g.e.a.i.c.a$c */
    static final class C4748c implements OnKeyListener {

        /* renamed from: f */
        final /* synthetic */ C4745a f12426f;

        C4748c(C4745a aVar) {
            this.f12426f = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C4745a aVar = this.f12426f;
            C5942k.m22324a((Object) keyEvent, "event");
            return aVar.m19104a(i, keyEvent);
        }
    }

    /* renamed from: g.e.a.i.c.a$d */
    static final class C4749d extends C5943l implements C5918l<Integer, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4745a f12427g;

        C4749d(C4745a aVar) {
            this.f12427g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13738a(int i) {
            C4739b c = this.f12427g.f12423d.mo13723c();
            if (c != null) {
                c.mo13711a(i);
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13738a(((Number) obj).intValue());
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.c.a$e */
    static final class C4750e extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4745a f12428g;

        C4750e(C4745a aVar) {
            this.f12428g = aVar;
            super(0);
        }

        public final void invoke() {
            this.f12428g.f12420a.dismiss();
        }
    }

    public C4745a(Context context, C4744a<T> aVar) {
        C5942k.m22327b(context, "context");
        C5942k.m22327b(aVar, "builderData");
        this.f12423d = aVar;
        C4751a aVar2 = new C4751a(context, null, 0, 6, null);
        this.f12421b = aVar2;
        m19108b();
        C0066a aVar3 = new C0066a(context, m19103a());
        aVar3.mo224b((View) this.f12421b);
        aVar3.mo214a((OnKeyListener) new C4748c(this));
        C0065b a = aVar3.mo220a();
        a.setOnShowListener(new C4746a(this));
        a.setOnDismissListener(new C4747b(this));
        C5942k.m22324a((Object) a, "AlertDialog\n            …Dismiss() }\n            }");
        this.f12420a = a;
    }

    /* renamed from: a */
    private final int m19103a() {
        return this.f12423d.mo13729i() ? C4717d.ImageViewerDialog_NoStatusBar : C4717d.ImageViewerDialog_Default;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m19104a(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            if (this.f12421b.mo13743b()) {
                this.f12421b.mo13744c();
            } else {
                this.f12421b.mo13740a();
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m19108b() {
        C4751a<T> aVar = this.f12421b;
        aVar.setZoomingAllowed$imageviewer_release(this.f12423d.mo13733m());
        aVar.setSwipeToDismissAllowed$imageviewer_release(this.f12423d.mo13732l());
        aVar.setContainerPadding$imageviewer_release(this.f12423d.mo13722b());
        aVar.setImagesMargin$imageviewer_release(this.f12423d.mo13725e());
        aVar.setOverlayView$imageviewer_release(this.f12423d.mo13728h());
        aVar.setBackgroundColor(this.f12423d.mo13719a());
        aVar.mo13742a(this.f12423d.mo13726f(), this.f12423d.mo13730j(), this.f12423d.mo13724d());
        aVar.setOnPageChange$imageviewer_release(new C4749d(this));
        aVar.setOnDismiss$imageviewer_release(new C4750e(this));
    }

    /* renamed from: a */
    public final void mo13734a(boolean z) {
        this.f12422c = z;
        this.f12420a.show();
    }
}
