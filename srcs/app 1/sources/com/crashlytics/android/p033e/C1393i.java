package com.crashlytics.android.p033e;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;
import p242i.p243a.p244a.p245a.p246n.p254g.C4919o;

/* renamed from: com.crashlytics.android.e.i */
class C1393i {

    /* renamed from: a */
    private final C1398e f4467a;

    /* renamed from: b */
    private final Builder f4468b;

    /* renamed from: com.crashlytics.android.e.i$a */
    static class C1394a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1398e f4469f;

        C1394a(C1398e eVar) {
            this.f4469f = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f4469f.mo5556a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.e.i$b */
    static class C1395b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1398e f4470f;

        C1395b(C1398e eVar) {
            this.f4470f = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f4470f.mo5556a(false);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.e.i$c */
    static class C1396c implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1397d f4471f;

        /* renamed from: g */
        final /* synthetic */ C1398e f4472g;

        C1396c(C1397d dVar, C1398e eVar) {
            this.f4471f = dVar;
            this.f4472g = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f4471f.mo5554a(true);
            this.f4472g.mo5556a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.crashlytics.android.e.i$d */
    interface C1397d {
        /* renamed from: a */
        void mo5554a(boolean z);
    }

    /* renamed from: com.crashlytics.android.e.i$e */
    private static class C1398e {

        /* renamed from: a */
        private boolean f4473a;

        /* renamed from: b */
        private final CountDownLatch f4474b;

        private C1398e() {
            this.f4473a = false;
            this.f4474b = new CountDownLatch(1);
        }

        /* synthetic */ C1398e(C1394a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5555a() {
            try {
                this.f4474b.await();
            } catch (InterruptedException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5556a(boolean z) {
            this.f4473a = z;
            this.f4474b.countDown();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5557b() {
            return this.f4473a;
        }
    }

    private C1393i(Builder builder, C1398e eVar) {
        this.f4467a = eVar;
        this.f4468b = builder;
    }

    /* renamed from: a */
    private static int m6457a(float f, int i) {
        return (int) (f * ((float) i));
    }

    /* renamed from: a */
    private static ScrollView m6458a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = m6457a(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(m6457a(f, 14), m6457a(f, 2), m6457a(f, 10), m6457a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    /* renamed from: a */
    public static C1393i m6459a(Activity activity, C4919o oVar, C1397d dVar) {
        C1398e eVar = new C1398e(null);
        C1490x xVar = new C1490x(activity, oVar);
        Builder builder = new Builder(activity);
        ScrollView a = m6458a(activity, xVar.mo5666c());
        builder.setView(a).setTitle(xVar.mo5668e()).setCancelable(false).setNeutralButton(xVar.mo5667d(), new C1394a(eVar));
        if (oVar.f12800d) {
            builder.setNegativeButton(xVar.mo5665b(), new C1395b(eVar));
        }
        if (oVar.f12802f) {
            builder.setPositiveButton(xVar.mo5664a(), new C1396c(dVar, eVar));
        }
        return new C1393i(builder, eVar);
    }

    /* renamed from: a */
    public void mo5548a() {
        this.f4467a.mo5555a();
    }

    /* renamed from: b */
    public boolean mo5549b() {
        return this.f4467a.mo5557b();
    }

    /* renamed from: c */
    public void mo5550c() {
        this.f4468b.show();
    }
}
