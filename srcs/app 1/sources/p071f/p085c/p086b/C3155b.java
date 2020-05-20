package p071f.p085c.p086b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C0353e;
import java.util.ArrayList;
import p071f.p085c.p086b.C3153a.C3154a;
import p071f.p097h.p098e.C3236a;

/* renamed from: f.c.b.b */
public final class C3155b {

    /* renamed from: a */
    public final Intent f8933a;

    /* renamed from: b */
    public final Bundle f8934b;

    /* renamed from: f.c.b.b$a */
    public static final class C3156a {

        /* renamed from: a */
        private final Intent f8935a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C3154a f8936b = new C3154a();

        /* renamed from: c */
        private ArrayList<Bundle> f8937c;

        /* renamed from: d */
        private Bundle f8938d;

        /* renamed from: e */
        private ArrayList<Bundle> f8939e;

        /* renamed from: f */
        private boolean f8940f = true;

        /* renamed from: g */
        private SparseArray<Bundle> f8941g;

        /* renamed from: a */
        private void m12760a(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0353e.m1797a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f8935a.putExtras(bundle);
        }

        /* renamed from: a */
        public C3155b mo10147a() {
            if (!this.f8935a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m12760a(null, null);
            }
            ArrayList<Bundle> arrayList = this.f8937c;
            if (arrayList != null) {
                this.f8935a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f8939e;
            if (arrayList2 != null) {
                this.f8935a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f8935a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8940f);
            this.f8935a.putExtras(this.f8936b.mo10145a().mo10144a());
            if (this.f8941g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f8941g);
                this.f8935a.putExtras(bundle);
            }
            return new C3155b(this.f8935a, this.f8938d);
        }
    }

    C3155b(Intent intent, Bundle bundle) {
        this.f8933a = intent;
        this.f8934b = bundle;
    }

    /* renamed from: a */
    public void mo10146a(Context context, Uri uri) {
        this.f8933a.setData(uri);
        C3236a.m13267a(context, this.f8933a, this.f8934b);
    }
}
