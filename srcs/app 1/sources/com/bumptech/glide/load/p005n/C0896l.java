package com.bumptech.glide.load.p005n;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.l */
public abstract class C0896l<T> implements C0881d<T> {

    /* renamed from: f */
    private final Uri f3424f;

    /* renamed from: g */
    private final ContentResolver f3425g;

    /* renamed from: h */
    private T f3426h;

    public C0896l(ContentResolver contentResolver, Uri uri) {
        this.f3425g = contentResolver;
        this.f3424f = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo4635a(Uri uri, ContentResolver contentResolver);

    /* renamed from: a */
    public final void mo4564a(C0838g gVar, C0882a<? super T> aVar) {
        try {
            T a = mo4635a(this.f3424f, this.f3425g);
            this.f3426h = a;
            aVar.mo4646a(a);
        } catch (FileNotFoundException e) {
            String str = "LocalUriFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            aVar.mo4645a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4637a(T t);

    /* renamed from: b */
    public void mo4567b() {
        T t = this.f3426h;
        if (t != null) {
            try {
                mo4637a(t);
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
