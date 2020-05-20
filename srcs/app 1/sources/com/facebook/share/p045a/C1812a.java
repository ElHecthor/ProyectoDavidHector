package com.facebook.share.p045a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0425c;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.C0466s;
import com.facebook.C1730l;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.C1843u;
import com.facebook.common.C1515b;
import com.facebook.common.C1516c;
import com.facebook.common.C1517d;
import com.facebook.common.C1518e;
import com.facebook.internal.C1703w;
import com.facebook.p040g0.p041a.C1628a;
import com.facebook.share.p046b.C1823a;
import com.facebook.share.p046b.C1827c;
import com.facebook.share.p046b.C1834g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.a.a */
public class C1812a extends C0425c {

    /* renamed from: v0 */
    private static ScheduledThreadPoolExecutor f5424v0;

    /* renamed from: p0 */
    private ProgressBar f5425p0;

    /* renamed from: q0 */
    private TextView f5426q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public Dialog f5427r0;

    /* renamed from: s0 */
    private volatile C1816d f5428s0;

    /* renamed from: t0 */
    private volatile ScheduledFuture f5429t0;

    /* renamed from: u0 */
    private C1823a f5430u0;

    /* renamed from: com.facebook.share.a.a$a */
    class C1813a implements OnClickListener {
        C1813a() {
        }

        public void onClick(View view) {
            C1812a.this.f5427r0.dismiss();
        }
    }

    /* renamed from: com.facebook.share.a.a$b */
    class C1814b implements C1802e {
        C1814b() {
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            C1730l a = tVar.mo6290a();
            if (a != null) {
                C1812a.this.m7864a(a);
                return;
            }
            JSONObject b = tVar.mo6291b();
            C1816d dVar = new C1816d();
            try {
                dVar.mo6242a(b.getString("user_code"));
                dVar.mo6241a(b.getLong("expires_in"));
                C1812a.this.m7865a(dVar);
            } catch (JSONException unused) {
                C1812a.this.m7864a(new C1730l(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.a.a$c */
    class C1815c implements Runnable {
        C1815c() {
        }

        public void run() {
            C1812a.this.f5427r0.dismiss();
        }
    }

    /* renamed from: com.facebook.share.a.a$d */
    private static class C1816d implements Parcelable {
        public static final Creator<C1816d> CREATOR = new C1817a();

        /* renamed from: f */
        private String f5434f;

        /* renamed from: g */
        private long f5435g;

        /* renamed from: com.facebook.share.a.a$d$a */
        static class C1817a implements Creator<C1816d> {
            C1817a() {
            }

            public C1816d createFromParcel(Parcel parcel) {
                return new C1816d(parcel);
            }

            public C1816d[] newArray(int i) {
                return new C1816d[i];
            }
        }

        C1816d() {
        }

        protected C1816d(Parcel parcel) {
            this.f5434f = parcel.readString();
            this.f5435g = parcel.readLong();
        }

        /* renamed from: a */
        public long mo6240a() {
            return this.f5435g;
        }

        /* renamed from: a */
        public void mo6241a(long j) {
            this.f5435g = j;
        }

        /* renamed from: a */
        public void mo6242a(String str) {
            this.f5434f = str;
        }

        /* renamed from: b */
        public String mo6243b() {
            return this.f5434f;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5434f);
            parcel.writeLong(this.f5435g);
        }
    }

    /* renamed from: A0 */
    private void m7861A0() {
        Bundle z0 = m7870z0();
        if (z0 == null || z0.size() == 0) {
            m7864a(new C1730l(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C1703w.m7421a());
        sb.append("|");
        sb.append(C1703w.m7427b());
        z0.putString("access_token", sb.toString());
        z0.putString("device_info", C1628a.m7156a());
        C1797q qVar = new C1797q(null, "device/share", z0, C1843u.POST, new C1814b());
        qVar.mo6175b();
    }

    /* renamed from: a */
    private void m7863a(int i, Intent intent) {
        if (this.f5428s0 != null) {
            C1628a.m7157a(this.f5428s0.mo6243b());
        }
        C1730l lVar = (C1730l) intent.getParcelableExtra("error");
        if (lVar != null) {
            Toast.makeText(mo2568n(), lVar.mo6006b(), 0).show();
        }
        if (mo2472L()) {
            C0429d f = mo2540f();
            f.setResult(i, intent);
            f.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7864a(C1730l lVar) {
        m7868x0();
        Intent intent = new Intent();
        intent.putExtra("error", lVar);
        m7863a(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7865a(C1816d dVar) {
        this.f5428s0 = dVar;
        this.f5426q0.setText(dVar.mo6243b());
        this.f5426q0.setVisibility(0);
        this.f5425p0.setVisibility(8);
        this.f5429t0 = m7869y0().schedule(new C1815c(), dVar.mo6240a(), TimeUnit.SECONDS);
    }

    /* renamed from: x0 */
    private void m7868x0() {
        if (mo2472L()) {
            C0466s b = mo2581s().mo2778b();
            b.mo2632b(this);
            b.mo2618a();
        }
    }

    /* renamed from: y0 */
    private static synchronized ScheduledThreadPoolExecutor m7869y0() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (C1812a.class) {
            if (f5424v0 == null) {
                f5424v0 = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f5424v0;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: z0 */
    private Bundle m7870z0() {
        C1823a aVar = this.f5430u0;
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof C1827c) {
            return C1822d.m7893a((C1827c) aVar);
        }
        if (aVar instanceof C1834g) {
            return C1822d.m7894a((C1834g) aVar);
        }
        return null;
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo2488a(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            C1816d dVar = (C1816d) bundle.getParcelable("request_state");
            if (dVar != null) {
                m7865a(dVar);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo6237a(C1823a aVar) {
        this.f5430u0 = aVar;
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        if (this.f5428s0 != null) {
            bundle.putParcelable("request_state", this.f5428s0);
        }
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        this.f5427r0 = new Dialog(mo2540f(), C1518e.com_facebook_auth_dialog);
        View inflate = mo2540f().getLayoutInflater().inflate(C1516c.com_facebook_device_auth_dialog_fragment, null);
        this.f5425p0 = (ProgressBar) inflate.findViewById(C1515b.progress_bar);
        this.f5426q0 = (TextView) inflate.findViewById(C1515b.confirmation_code);
        ((Button) inflate.findViewById(C1515b.cancel_button)).setOnClickListener(new C1813a());
        ((TextView) inflate.findViewById(C1515b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo2491a(C1517d.com_facebook_device_auth_instructions)));
        this.f5427r0.setContentView(inflate);
        m7861A0();
        return this.f5427r0;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5429t0 != null) {
            this.f5429t0.cancel(true);
        }
        m7863a(-1, new Intent());
    }
}
