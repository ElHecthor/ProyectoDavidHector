package com.google.android.youtube.player.p055e;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.C2813d;

/* renamed from: com.google.android.youtube.player.e.n */
public final class C2842n implements C2813d {

    /* renamed from: a */
    private C2819d f8298a;

    /* renamed from: b */
    private C2822f f8299b;

    public C2842n(C2819d dVar, C2822f fVar) {
        C2817b.m11731a(dVar, (Object) "connectionClient cannot be null");
        this.f8298a = dVar;
        C2817b.m11731a(fVar, (Object) "embeddedPlayer cannot be null");
        this.f8299b = fVar;
    }

    /* renamed from: a */
    public final View mo9490a() {
        try {
            return (View) C2849q.m11839a(this.f8299b.mo9457n());
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: a */
    public final void mo9491a(Configuration configuration) {
        try {
            this.f8299b.mo9446a(configuration);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: a */
    public final void mo9436a(String str) {
        mo9492a(str, 0);
    }

    /* renamed from: a */
    public final void mo9492a(String str, int i) {
        try {
            this.f8299b.mo9447a(str, i);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: a */
    public final void mo9493a(boolean z) {
        try {
            this.f8299b.mo9448a(z);
            this.f8298a.mo9441a(z);
            this.f8298a.mo9473b();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: a */
    public final boolean mo9494a(int i, KeyEvent keyEvent) {
        try {
            return this.f8299b.mo9450b(i, keyEvent);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: a */
    public final boolean mo9495a(Bundle bundle) {
        try {
            return this.f8299b.mo9451d(bundle);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: b */
    public final void mo9496b() {
        try {
            this.f8299b.mo9456m();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: b */
    public final void mo9497b(boolean z) {
        try {
            this.f8299b.mo9452e(z);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: b */
    public final boolean mo9498b(int i, KeyEvent keyEvent) {
        try {
            return this.f8299b.mo9449a(i, keyEvent);
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: c */
    public final void mo9499c() {
        try {
            this.f8299b.mo9454k();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: d */
    public final void mo9500d() {
        try {
            this.f8299b.mo9458o();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: e */
    public final void mo9501e() {
        try {
            this.f8299b.mo9459q();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: f */
    public final void mo9502f() {
        try {
            this.f8299b.mo9460s();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: g */
    public final void mo9503g() {
        try {
            this.f8299b.mo9455l();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }

    /* renamed from: h */
    public final Bundle mo9504h() {
        try {
            return this.f8299b.mo9453j();
        } catch (RemoteException e) {
            throw new C2834l(e);
        }
    }
}
