package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.b */
public final class C2078b extends C2158a {
    public static final Creator<C2078b> CREATOR = new C2176q();

    /* renamed from: j */
    public static final C2078b f5962j = new C2078b(0);

    /* renamed from: f */
    private final int f5963f;

    /* renamed from: g */
    private final int f5964g;

    /* renamed from: h */
    private final PendingIntent f5965h;

    /* renamed from: i */
    private final String f5966i;

    public C2078b(int i) {
        this(i, null, null);
    }

    C2078b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5963f = i;
        this.f5964g = i2;
        this.f5965h = pendingIntent;
        this.f5966i = str;
    }

    public C2078b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C2078b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: a */
    static String m8593a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: e */
    public final int mo6775e() {
        return this.f5964g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2078b)) {
            return false;
        }
        C2078b bVar = (C2078b) obj;
        return this.f5964g == bVar.f5964g && C2141q.m8823a(this.f5965h, bVar.f5965h) && C2141q.m8823a(this.f5966i, bVar.f5966i);
    }

    /* renamed from: f */
    public final String mo6777f() {
        return this.f5966i;
    }

    /* renamed from: g */
    public final PendingIntent mo6778g() {
        return this.f5965h;
    }

    /* renamed from: h */
    public final boolean mo6779h() {
        return (this.f5964g == 0 || this.f5965h == null) ? false : true;
    }

    public final int hashCode() {
        return C2141q.m8821a(Integer.valueOf(this.f5964g), this.f5965h, this.f5966i);
    }

    /* renamed from: k */
    public final boolean mo6781k() {
        return this.f5964g == 0;
    }

    public final String toString() {
        C2142a a = C2141q.m8822a((Object) this);
        a.mo6935a("statusCode", m8593a(this.f5964g));
        a.mo6935a("resolution", this.f5965h);
        a.mo6935a("message", this.f5966i);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f5963f);
        C2161c.m8893a(parcel, 2, mo6775e());
        C2161c.m8897a(parcel, 3, (Parcelable) mo6778g(), i, false);
        C2161c.m8902a(parcel, 4, mo6777f(), false);
        C2161c.m8891a(parcel, a);
    }
}
