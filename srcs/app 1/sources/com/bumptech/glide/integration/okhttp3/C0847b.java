package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0860e;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.p029t.C1300c;
import com.bumptech.glide.p029t.C1309j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import p337m.C6232b0;
import p337m.C6236c0;
import p337m.C6244e;
import p337m.C6244e.C6245a;
import p337m.C6248f;
import p337m.C6467z;
import p337m.C6467z.C6468a;

/* renamed from: com.bumptech.glide.integration.okhttp3.b */
public class C0847b implements C0881d<InputStream>, C6248f {

    /* renamed from: f */
    private final C6245a f3326f;

    /* renamed from: g */
    private final C1055g f3327g;

    /* renamed from: h */
    private InputStream f3328h;

    /* renamed from: i */
    private C6236c0 f3329i;

    /* renamed from: j */
    private C0882a<? super InputStream> f3330j;

    /* renamed from: k */
    private volatile C6244e f3331k;

    public C0847b(C6245a aVar, C1055g gVar) {
        this.f3326f = aVar;
        this.f3327g = gVar;
    }

    /* renamed from: a */
    public Class<InputStream> mo4563a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public void mo4564a(C0838g gVar, C0882a<? super InputStream> aVar) {
        C6468a aVar2 = new C6468a();
        aVar2.mo16766b(this.f3327g.mo4938c());
        for (Entry entry : this.f3327g.mo4937b().entrySet()) {
            aVar2.mo16760a((String) entry.getKey(), (String) entry.getValue());
        }
        C6467z a = aVar2.mo16765a();
        this.f3330j = aVar;
        this.f3331k = this.f3326f.mo16097a(a);
        this.f3331k.mo16092a(this);
    }

    /* renamed from: a */
    public void mo4565a(C6244e eVar, IOException iOException) {
        String str = "OkHttpFetcher";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "OkHttp failed to obtain result", iOException);
        }
        this.f3330j.mo4645a((Exception) iOException);
    }

    /* renamed from: a */
    public void mo4566a(C6244e eVar, C6232b0 b0Var) {
        this.f3329i = b0Var.mo16018a();
        if (b0Var.mo16026m()) {
            C6236c0 c0Var = this.f3329i;
            C1309j.m6149a(c0Var);
            InputStream a = C1300c.m6128a(this.f3329i.mo16058a(), c0Var.mo16061f());
            this.f3328h = a;
            this.f3330j.mo4646a(a);
            return;
        }
        this.f3330j.mo4645a((Exception) new C0860e(b0Var.mo16027o(), b0Var.mo16022g()));
    }

    /* renamed from: b */
    public void mo4567b() {
        try {
            if (this.f3328h != null) {
                this.f3328h.close();
            }
        } catch (IOException unused) {
        }
        C6236c0 c0Var = this.f3329i;
        if (c0Var != null) {
            c0Var.close();
        }
        this.f3330j = null;
    }

    /* renamed from: c */
    public C0856a mo4568c() {
        return C0856a.REMOTE;
    }

    public void cancel() {
        C6244e eVar = this.f3331k;
        if (eVar != null) {
            eVar.cancel();
        }
    }
}
