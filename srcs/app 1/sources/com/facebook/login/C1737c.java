package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0425c;
import com.facebook.C1499a;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.C1730l;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1808r;
import com.facebook.C1842t;
import com.facebook.C1843u;
import com.facebook.FacebookActivity;
import com.facebook.common.C1515b;
import com.facebook.common.C1516c;
import com.facebook.common.C1517d;
import com.facebook.common.C1518e;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1697u;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1698v.C1702d;
import com.facebook.internal.C1703w;
import com.facebook.login.C1759j.C1763d;
import com.facebook.p034f0.C1558m;
import com.facebook.p040g0.p041a.C1628a;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c */
public class C1737c extends C0425c {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public C1763d f5246A0 = null;

    /* renamed from: p0 */
    private View f5247p0;

    /* renamed from: q0 */
    private TextView f5248q0;

    /* renamed from: r0 */
    private TextView f5249r0;

    /* renamed from: s0 */
    private C1747d f5250s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public AtomicBoolean f5251t0 = new AtomicBoolean();

    /* renamed from: u0 */
    private volatile C1808r f5252u0;

    /* renamed from: v0 */
    private volatile ScheduledFuture f5253v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public volatile C1745h f5254w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public Dialog f5255x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public boolean f5256y0 = false;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f5257z0 = false;

    /* renamed from: com.facebook.login.c$a */
    class C1738a implements C1802e {
        C1738a() {
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            if (!C1737c.this.f5256y0) {
                if (tVar.mo6290a() != null) {
                    C1737c.this.mo6028a(tVar.mo6290a().mo6008d());
                    return;
                }
                JSONObject b = tVar.mo6291b();
                C1745h hVar = new C1745h();
                try {
                    hVar.mo6042b(b.getString("user_code"));
                    hVar.mo6039a(b.getString("code"));
                    hVar.mo6038a(b.getLong("interval"));
                    C1737c.this.m7524a(hVar);
                } catch (JSONException e) {
                    C1737c.this.mo6028a(new C1631i((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.c$b */
    class C1739b implements OnClickListener {
        C1739b() {
        }

        public void onClick(View view) {
            C1737c.this.mo6032x0();
        }
    }

    /* renamed from: com.facebook.login.c$c */
    class C1740c implements Runnable {
        C1740c() {
        }

        public void run() {
            C1737c.this.m7542z0();
        }
    }

    /* renamed from: com.facebook.login.c$d */
    class C1741d implements C1802e {
        C1741d() {
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            if (!C1737c.this.f5251t0.get()) {
                C1730l a = tVar.mo6290a();
                if (a != null) {
                    int f = a.mo6011f();
                    if (f != 1349152) {
                        switch (f) {
                            case 1349172:
                            case 1349174:
                                C1737c.this.m7523A0();
                                break;
                            case 1349173:
                                break;
                            default:
                                C1737c.this.mo6028a(tVar.mo6290a().mo6008d());
                                break;
                        }
                    } else {
                        if (C1737c.this.f5254w0 != null) {
                            C1628a.m7157a(C1737c.this.f5254w0.mo6044d());
                        }
                        if (C1737c.this.f5246A0 != null) {
                            C1737c cVar = C1737c.this;
                            cVar.mo6029a(cVar.f5246A0);
                            return;
                        }
                    }
                    C1737c.this.mo6032x0();
                    return;
                }
                try {
                    JSONObject b = tVar.mo6291b();
                    C1737c.this.m7531a(b.getString("access_token"), Long.valueOf(b.getLong("expires_in")), Long.valueOf(b.optLong("data_access_expiration_time")));
                } catch (JSONException e) {
                    C1737c.this.mo6028a(new C1631i((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.c$e */
    class C1742e implements DialogInterface.OnClickListener {
        C1742e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1737c.this.f5255x0.setContentView(C1737c.this.mo6031l(false));
            C1737c cVar = C1737c.this;
            cVar.mo6029a(cVar.f5246A0);
        }
    }

    /* renamed from: com.facebook.login.c$f */
    class C1743f implements DialogInterface.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ String f5263f;

        /* renamed from: g */
        final /* synthetic */ C1702d f5264g;

        /* renamed from: h */
        final /* synthetic */ String f5265h;

        /* renamed from: i */
        final /* synthetic */ Date f5266i;

        /* renamed from: j */
        final /* synthetic */ Date f5267j;

        C1743f(String str, C1702d dVar, String str2, Date date, Date date2) {
            this.f5263f = str;
            this.f5264g = dVar;
            this.f5265h = str2;
            this.f5266i = date;
            this.f5267j = date2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1737c.this.m7530a(this.f5263f, this.f5264g, this.f5265h, this.f5266i, this.f5267j);
        }
    }

    /* renamed from: com.facebook.login.c$g */
    class C1744g implements C1802e {

        /* renamed from: a */
        final /* synthetic */ String f5269a;

        /* renamed from: b */
        final /* synthetic */ Date f5270b;

        /* renamed from: c */
        final /* synthetic */ Date f5271c;

        C1744g(String str, Date date, Date date2) {
            this.f5269a = str;
            this.f5270b = date;
            this.f5271c = date2;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            if (!C1737c.this.f5251t0.get()) {
                if (tVar.mo6290a() != null) {
                    C1737c.this.mo6028a(tVar.mo6290a().mo6008d());
                    return;
                }
                try {
                    JSONObject b = tVar.mo6291b();
                    String string = b.getString("id");
                    C1702d b2 = C1698v.m7390b(b);
                    String string2 = b.getString("name");
                    C1628a.m7157a(C1737c.this.f5254w0.mo6044d());
                    if (!C1672m.m7268c(C1787m.m7745f()).mo5913i().contains(C1697u.RequireConfirm) || C1737c.this.f5257z0) {
                        C1737c.this.m7530a(string, b2, this.f5269a, this.f5270b, this.f5271c);
                        return;
                    }
                    C1737c.this.f5257z0 = true;
                    C1737c.this.m7529a(string, b2, this.f5269a, string2, this.f5270b, this.f5271c);
                } catch (JSONException e) {
                    C1737c.this.mo6028a(new C1631i((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.c$h */
    private static class C1745h implements Parcelable {
        public static final Creator<C1745h> CREATOR = new C1746a();

        /* renamed from: f */
        private String f5273f;

        /* renamed from: g */
        private String f5274g;

        /* renamed from: h */
        private String f5275h;

        /* renamed from: i */
        private long f5276i;

        /* renamed from: j */
        private long f5277j;

        /* renamed from: com.facebook.login.c$h$a */
        static class C1746a implements Creator<C1745h> {
            C1746a() {
            }

            public C1745h createFromParcel(Parcel parcel) {
                return new C1745h(parcel);
            }

            public C1745h[] newArray(int i) {
                return new C1745h[i];
            }
        }

        C1745h() {
        }

        protected C1745h(Parcel parcel) {
            this.f5273f = parcel.readString();
            this.f5274g = parcel.readString();
            this.f5275h = parcel.readString();
            this.f5276i = parcel.readLong();
            this.f5277j = parcel.readLong();
        }

        /* renamed from: a */
        public String mo6037a() {
            return this.f5273f;
        }

        /* renamed from: a */
        public void mo6038a(long j) {
            this.f5276i = j;
        }

        /* renamed from: a */
        public void mo6039a(String str) {
            this.f5275h = str;
        }

        /* renamed from: b */
        public long mo6040b() {
            return this.f5276i;
        }

        /* renamed from: b */
        public void mo6041b(long j) {
            this.f5277j = j;
        }

        /* renamed from: b */
        public void mo6042b(String str) {
            this.f5274g = str;
            this.f5273f = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: c */
        public String mo6043c() {
            return this.f5275h;
        }

        /* renamed from: d */
        public String mo6044d() {
            return this.f5274g;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo6046e() {
            boolean z = false;
            if (this.f5277j == 0) {
                return false;
            }
            if ((new Date().getTime() - this.f5277j) - (this.f5276i * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5273f);
            parcel.writeString(this.f5274g);
            parcel.writeString(this.f5275h);
            parcel.writeLong(this.f5276i);
            parcel.writeLong(this.f5277j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m7523A0() {
        this.f5253v0 = C1747d.m7565f().schedule(new C1740c(), this.f5254w0.mo6040b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7524a(C1745h hVar) {
        this.f5254w0 = hVar;
        this.f5248q0.setText(hVar.mo6044d());
        this.f5249r0.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(mo2461A(), C1628a.m7160c(hVar.mo6037a())), null, null);
        this.f5248q0.setVisibility(0);
        this.f5247p0.setVisibility(8);
        if (!this.f5257z0 && C1628a.m7161d(hVar.mo6044d())) {
            new C1558m(mo2568n()).mo5770a("fb_smart_login_service");
        }
        if (hVar.mo6046e()) {
            m7523A0();
        } else {
            m7542z0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7529a(String str, C1702d dVar, String str2, String str3, Date date, Date date2) {
        String string = mo2461A().getString(C1517d.com_facebook_smart_login_confirmation_title);
        String string2 = mo2461A().getString(C1517d.com_facebook_smart_login_confirmation_continue_as);
        String string3 = mo2461A().getString(C1517d.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(mo2568n());
        Builder cancelable = builder.setMessage(string).setCancelable(true);
        C1743f fVar = new C1743f(str, dVar, str2, date, date2);
        cancelable.setNegativeButton(format, fVar).setPositiveButton(string3, new C1742e());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7530a(String str, C1702d dVar, String str2, Date date, Date date2) {
        this.f5250s0.mo6051a(str2, C1787m.m7745f(), str, dVar.mo5949c(), dVar.mo5947a(), dVar.mo5948b(), C1519d.DEVICE_AUTH, date, null, date2);
        this.f5255x0.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7531a(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        C1499a aVar = new C1499a(str, C1787m.m7745f(), "0", null, null, null, null, date2, null, date);
        C1797q qVar = new C1797q(aVar, "me", bundle, C1843u.GET, new C1744g(str, date2, date));
        qVar.mo6175b();
    }

    /* renamed from: y0 */
    private C1797q m7541y0() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f5254w0.mo6043c());
        C1797q qVar = new C1797q(null, "device/login_status", bundle, C1843u.POST, new C1741d());
        return qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m7542z0() {
        this.f5254w0.mo6041b(new Date().getTime());
        this.f5252u0 = m7541y0().mo6175b();
    }

    /* renamed from: W */
    public void mo2483W() {
        this.f5256y0 = true;
        this.f5251t0.set(true);
        super.mo2483W();
        if (this.f5252u0 != null) {
            this.f5252u0.cancel(true);
        }
        if (this.f5253v0 != null) {
            this.f5253v0.cancel(true);
        }
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo2488a(layoutInflater, viewGroup, bundle);
        this.f5250s0 = (C1747d) ((C1768k) ((FacebookActivity) mo2540f()).mo258q()).mo6126u0().mo6090d();
        if (bundle != null) {
            C1745h hVar = (C1745h) bundle.getParcelable("request_state");
            if (hVar != null) {
                m7524a(hVar);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6028a(C1631i iVar) {
        if (this.f5251t0.compareAndSet(false, true)) {
            if (this.f5254w0 != null) {
                C1628a.m7157a(this.f5254w0.mo6044d());
            }
            this.f5250s0.mo6050a((Exception) iVar);
            this.f5255x0.dismiss();
        }
    }

    /* renamed from: a */
    public void mo6029a(C1763d dVar) {
        this.f5246A0 = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.mo6115h()));
        String f = dVar.mo6113f();
        if (f != null) {
            bundle.putString("redirect_uri", f);
        }
        String e = dVar.mo6112e();
        if (e != null) {
            bundle.putString("target_user_id", e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C1703w.m7421a());
        sb.append("|");
        sb.append(C1703w.m7427b());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C1628a.m7156a());
        C1797q qVar = new C1797q(null, "device/login", bundle, C1843u.POST, new C1738a());
        qVar.mo6175b();
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        if (this.f5254w0 != null) {
            bundle.putParcelable("request_state", this.f5254w0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo6030k(boolean z) {
        return z ? C1516c.com_facebook_smart_device_dialog_fragment : C1516c.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public View mo6031l(boolean z) {
        View inflate = mo2540f().getLayoutInflater().inflate(mo6030k(z), null);
        this.f5247p0 = inflate.findViewById(C1515b.progress_bar);
        this.f5248q0 = (TextView) inflate.findViewById(C1515b.confirmation_code);
        ((Button) inflate.findViewById(C1515b.cancel_button)).setOnClickListener(new C1739b());
        TextView textView = (TextView) inflate.findViewById(C1515b.com_facebook_device_auth_instructions);
        this.f5249r0 = textView;
        textView.setText(Html.fromHtml(mo2491a(C1517d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        this.f5255x0 = new Dialog(mo2540f(), C1518e.com_facebook_auth_dialog);
        this.f5255x0.setContentView(mo6031l(C1628a.m7159b() && !this.f5257z0));
        return this.f5255x0;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f5256y0) {
            mo6032x0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo6032x0() {
        if (this.f5251t0.compareAndSet(false, true)) {
            if (this.f5254w0 != null) {
                C1628a.m7157a(this.f5254w0.mo6044d());
            }
            C1747d dVar = this.f5250s0;
            if (dVar != null) {
                dVar.mo6054e();
            }
            this.f5255x0.dismiss();
        }
    }
}
