package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0425c;
import androidx.fragment.app.C0429d;
import com.facebook.C1631i;
import com.facebook.C1787m;
import com.facebook.internal.C1704x.C1709e;
import com.facebook.internal.C1704x.C1711g;

/* renamed from: com.facebook.internal.f */
public class C1651f extends C0425c {

    /* renamed from: p0 */
    private Dialog f5053p0;

    /* renamed from: com.facebook.internal.f$a */
    class C1652a implements C1711g {
        C1652a() {
        }

        /* renamed from: a */
        public void mo5894a(Bundle bundle, C1631i iVar) {
            C1651f.this.m7201a(bundle, iVar);
        }
    }

    /* renamed from: com.facebook.internal.f$b */
    class C1653b implements C1711g {
        C1653b() {
        }

        /* renamed from: a */
        public void mo5894a(Bundle bundle, C1631i iVar) {
            C1651f.this.m7204o(bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7201a(Bundle bundle, C1631i iVar) {
        C0429d f = mo2540f();
        f.setResult(iVar == null ? -1 : 0, C1683q.m7298a(f.getIntent(), bundle, iVar));
        f.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m7204o(Bundle bundle) {
        C0429d f = mo2540f();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        f.setResult(-1, intent);
        f.finish();
    }

    /* renamed from: Y */
    public void mo2485Y() {
        if (mo2655u0() != null && mo2462B()) {
            mo2655u0().setDismissMessage(null);
        }
        super.mo2485Y();
    }

    /* renamed from: a */
    public void mo5893a(Dialog dialog) {
        this.f5053p0 = dialog;
    }

    /* renamed from: b0 */
    public void mo2522b0() {
        super.mo2522b0();
        Dialog dialog = this.f5053p0;
        if (dialog instanceof C1704x) {
            ((C1704x) dialog).mo5957d();
        }
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        C1704x xVar;
        String str;
        super.mo2524c(bundle);
        if (this.f5053p0 == null) {
            C0429d f = mo2540f();
            Bundle b = C1683q.m7309b(f.getIntent());
            String str2 = "FacebookDialogFragment";
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (C1698v.m7401c(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                } else {
                    C1709e eVar = new C1709e(f, string, bundle2);
                    eVar.mo5970a(new C1652a());
                    xVar = eVar.mo5971a();
                    this.f5053p0 = xVar;
                }
            } else {
                String string2 = b.getString("url");
                if (C1698v.m7401c(string2)) {
                    str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                } else {
                    xVar = C1659i.m7220a(f, string2, String.format("fb%s://bridge/", new Object[]{C1787m.m7745f()}));
                    xVar.mo5952a((C1711g) new C1653b());
                    this.f5053p0 = xVar;
                }
            }
            C1698v.m7399c(str2, str);
            f.finish();
        }
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        if (this.f5053p0 == null) {
            m7201a((Bundle) null, (C1631i) null);
            mo2650j(false);
        }
        return this.f5053p0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f5053p0 instanceof C1704x) && mo2479S()) {
            ((C1704x) this.f5053p0).mo5957d();
        }
    }
}
