package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p167b.p173d.p179f.C3896i;
import p147g.p156d.p157a.p167b.p173d.p179f.C3897j;
import p147g.p156d.p157a.p167b.p173d.p179f.C3899l;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.messaging.v */
final class C3074v implements Closeable {

    /* renamed from: f */
    private final URL f8733f;

    /* renamed from: g */
    private C4350h<Bitmap> f8734g;

    /* renamed from: h */
    private volatile InputStream f8735h;

    private C3074v(URL url) {
        this.f8733f = url;
    }

    /* renamed from: c */
    public static C3074v m12472c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C3074v(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* renamed from: f */
    private final byte[] m12473f() {
        URLConnection openConnection = this.f8733f.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f8735h = inputStream;
                byte[] a = C3896i.m15648a(C3896i.m15647a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                String str = "FirebaseMessaging";
                if (Log.isLoggable(str, 2)) {
                    int length = a.length;
                    String valueOf = String.valueOf(this.f8733f);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v(str, sb.toString());
                }
                if (a.length <= 1048576) {
                    return a;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                C3899l.m15652a(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    /* renamed from: a */
    public final C4350h<Bitmap> mo9849a() {
        C4350h<Bitmap> hVar = this.f8734g;
        C2148s.m8834a(hVar);
        return hVar;
    }

    /* renamed from: a */
    public final void mo9850a(Executor executor) {
        this.f8734g = C4354k.m17757a(executor, (Callable<TResult>) new C3076x<TResult>(this));
    }

    public final void close() {
        try {
            C3897j.m15650a(this.f8735h);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    /* renamed from: d */
    public final Bitmap mo9852d() {
        String valueOf = String.valueOf(this.f8733f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        String str = "FirebaseMessaging";
        Log.i(str, sb.toString());
        byte[] f = m12473f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f, 0, f.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(str, 3)) {
                String valueOf2 = String.valueOf(this.f8733f);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                Log.d(str, sb2.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f8733f);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }
}
