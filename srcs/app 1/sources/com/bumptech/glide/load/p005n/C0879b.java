package com.bumptech.glide.load.p005n;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.b */
public abstract class C0879b<T> implements C0881d<T> {

    /* renamed from: f */
    private final String f3400f;

    /* renamed from: g */
    private final AssetManager f3401g;

    /* renamed from: h */
    private T f3402h;

    public C0879b(AssetManager assetManager, String str) {
        this.f3401g = assetManager;
        this.f3400f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo4638a(AssetManager assetManager, String str);

    /* renamed from: a */
    public void mo4564a(C0838g gVar, C0882a<? super T> aVar) {
        try {
            T a = mo4638a(this.f3401g, this.f3400f);
            this.f3402h = a;
            aVar.mo4646a(a);
        } catch (IOException e) {
            String str = "AssetPathFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to load data from asset manager", e);
            }
            aVar.mo4645a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4639a(T t);

    /* renamed from: b */
    public void mo4567b() {
        T t = this.f3402h;
        if (t != null) {
            try {
                mo4639a(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public C0856a mo4568c() {
        return C0856a.LOCAL;
    }

    public void cancel() {
    }
}
