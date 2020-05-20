package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.C0429d;
import com.facebook.C1499a;
import com.facebook.C1519d;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.facebook.login.d */
class C1747d extends C1778n {
    public static final Creator<C1747d> CREATOR = new C1748a();

    /* renamed from: h */
    private static ScheduledThreadPoolExecutor f5278h;

    /* renamed from: com.facebook.login.d$a */
    static class C1748a implements Creator {
        C1748a() {
        }

        public C1747d createFromParcel(Parcel parcel) {
            return new C1747d(parcel);
        }

        public C1747d[] newArray(int i) {
            return new C1747d[i];
        }
    }

    protected C1747d(Parcel parcel) {
        super(parcel);
    }

    C1747d(C1759j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private void m7564b(C1763d dVar) {
        C0429d c = this.f5350g.mo6087c();
        if (c != null && !c.isFinishing()) {
            C1737c d = mo6052d();
            d.mo2649a(c.mo2666l(), "login_with_facebook");
            d.mo6029a(dVar);
        }
    }

    /* renamed from: f */
    public static synchronized ScheduledThreadPoolExecutor m7565f() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (C1747d.class) {
            if (f5278h == null) {
                f5278h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f5278h;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public void mo6050a(Exception exc) {
        this.f5350g.mo6084b(C1765e.m7639a(this.f5350g.mo6094g(), null, exc.getMessage()));
    }

    /* renamed from: a */
    public void mo6051a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C1519d dVar, Date date, Date date2, Date date3) {
        C1499a aVar = new C1499a(str, str2, str3, collection, collection2, collection3, dVar, date, date2, date3);
        this.f5350g.mo6084b(C1765e.m7637a(this.f5350g.mo6094g(), aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        m7564b(dVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "device_auth";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1737c mo6052d() {
        return new C1737c();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo6054e() {
        this.f5350g.mo6084b(C1765e.m7638a(this.f5350g.mo6094g(), "User canceled log in."));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
