package com.google.android.youtube.player.p055e;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.youtube.player.p055e.C2828h.C2829a;
import com.google.android.youtube.player.p055e.C2843o.C2844a;
import com.google.android.youtube.player.p055e.C2843o.C2845b;

/* renamed from: com.google.android.youtube.player.e.k */
public final class C2833k extends C2835m<C2828h> implements C2819d {

    /* renamed from: k */
    private final String f8276k;

    /* renamed from: l */
    private final String f8277l;

    /* renamed from: m */
    private final String f8278m;

    /* renamed from: n */
    private boolean f8279n;

    public C2833k(Context context, String str, String str2, String str3, C2844a aVar, C2845b bVar) {
        super(context, aVar, bVar);
        C2817b.m11730a(str);
        this.f8276k = str;
        C2817b.m11732a(str2, (Object) "callingPackage cannot be null or empty");
        this.f8277l = str2;
        C2817b.m11732a(str3, (Object) "callingAppVersion cannot be null or empty");
        this.f8278m = str3;
    }

    /* renamed from: k */
    private final void m11781k() {
        mo9482i();
        if (this.f8279n) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo9471a(IBinder iBinder) {
        return C2829a.m11775a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9472a(C2825g gVar, C2840e eVar) {
        gVar.mo9462a(eVar, 1202, this.f8277l, this.f8278m, this.f8276k, null);
    }

    /* renamed from: a */
    public final void mo9441a(boolean z) {
        if (mo9479f()) {
            try {
                ((C2828h) mo9483j()).mo9464a(z);
            } catch (RemoteException unused) {
            }
            this.f8279n = true;
        }
    }

    /* renamed from: b */
    public final void mo9473b() {
        if (!this.f8279n) {
            mo9441a(true);
        }
        super.mo9473b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo9474c() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo9475d() {
        return "com.google.android.youtube.api.service.START";
    }

    /* renamed from: e */
    public final IBinder mo9442e() {
        m11781k();
        try {
            return ((C2828h) mo9483j()).mo9465e();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
