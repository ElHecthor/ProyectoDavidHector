package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.C0429d;
import com.facebook.C1519d;
import com.facebook.C1729k;
import com.facebook.C1787m;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import com.facebook.login.C1759j.C1763d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.a */
public class C1734a extends C1782r {
    public static final Creator<C1734a> CREATOR = new C1735a();

    /* renamed from: k */
    private static final String[] f5237k = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: i */
    private String f5238i;

    /* renamed from: j */
    private String f5239j;

    /* renamed from: com.facebook.login.a$a */
    static class C1735a implements Creator {
        C1735a() {
        }

        public C1734a createFromParcel(Parcel parcel) {
            return new C1734a(parcel);
        }

        public C1734a[] newArray(int i) {
            return new C1734a[i];
        }
    }

    C1734a(Parcel parcel) {
        super(parcel);
        this.f5239j = parcel.readString();
    }

    C1734a(C1759j jVar) {
        super(jVar);
        this.f5239j = C1698v.m7359a(20);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7512a(java.lang.String r7, com.facebook.login.C1759j.C1763d r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00ad
            java.lang.String r0 = com.facebook.CustomTabMainActivity.m6747a()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00ad
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C1698v.m7407e(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C1698v.m7407e(r7)
            r0.putAll(r7)
            boolean r7 = r6.m7513a(r0)
            r1 = 0
            if (r7 != 0) goto L_0x0035
            com.facebook.i r7 = new com.facebook.i
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.mo6154a(r8, r1, r7)
            return
        L_0x0035:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x0043:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C1698v.m7401c(r3)
            r5 = -1
            if (r4 != 0) goto L_0x006b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r3 = -1
        L_0x006c:
            boolean r4 = com.facebook.internal.C1698v.m7401c(r7)
            if (r4 == 0) goto L_0x007e
            boolean r4 = com.facebook.internal.C1698v.m7401c(r2)
            if (r4 == 0) goto L_0x007e
            if (r3 != r5) goto L_0x007e
            super.mo6154a(r8, r0, r1)
            goto L_0x00ad
        L_0x007e:
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0096
        L_0x0090:
            com.facebook.k r7 = new com.facebook.k
            r7.<init>()
            goto L_0x00aa
        L_0x0096:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00a0
            com.facebook.k r7 = new com.facebook.k
            r7.<init>()
            goto L_0x00aa
        L_0x00a0:
            com.facebook.l r0 = new com.facebook.l
            r0.<init>(r3, r7, r2)
            com.facebook.o r7 = new com.facebook.o
            r7.<init>(r0, r2)
        L_0x00aa:
            super.mo6154a(r8, r1, r7)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C1734a.m7512a(java.lang.String, com.facebook.login.j$d):void");
    }

    /* renamed from: a */
    private boolean m7513a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f5239j);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private String m7514f() {
        String str = this.f5238i;
        if (str != null) {
            return str;
        }
        C0429d c = this.f5350g.mo6087c();
        List<ResolveInfo> queryIntentServices = c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(f5237k));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    String str2 = serviceInfo.packageName;
                    this.f5238i = str2;
                    return str2;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m7515g() {
        return m7514f() != null && C1703w.m7426a(C1787m.m7744e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6017a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f5239j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6018a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo6018a(i, i2, intent);
        }
        C1763d g = this.f5350g.mo6094g();
        if (i2 == -1) {
            m7512a(intent.getStringExtra(CustomTabMainActivity.f4681j), g);
            return true;
        }
        super.mo6154a(g, null, new C1729k());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        if (!m7515g()) {
            return false;
        }
        Bundle b = mo6155b(dVar);
        mo6153a(b, dVar);
        Intent intent = new Intent(this.f5350g.mo6087c(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f4679h, b);
        intent.putExtra(CustomTabMainActivity.f4680i, m7514f());
        this.f5350g.mo6092e().startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6021d() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1519d mo6023e() {
        return C1519d.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5239j);
    }
}
