package com.bumptech.glide.load.p005n.p006p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p005n.C0888g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.p.c */
public class C0904c implements C0881d<InputStream> {

    /* renamed from: f */
    private final Uri f3430f;

    /* renamed from: g */
    private final C0908e f3431g;

    /* renamed from: h */
    private InputStream f3432h;

    /* renamed from: com.bumptech.glide.load.n.p.c$a */
    static class C0905a implements C0907d {

        /* renamed from: b */
        private static final String[] f3433b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f3434a;

        C0905a(ContentResolver contentResolver) {
            this.f3434a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo4671a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f3434a.query(Thumbnails.EXTERNAL_CONTENT_URI, f3433b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.p.c$b */
    static class C0906b implements C0907d {

        /* renamed from: b */
        private static final String[] f3435b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f3436a;

        C0906b(ContentResolver contentResolver) {
            this.f3436a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo4671a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f3436a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f3435b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    C0904c(Uri uri, C0908e eVar) {
        this.f3430f = uri;
        this.f3431g = eVar;
    }

    /* renamed from: a */
    public static C0904c m4679a(Context context, Uri uri) {
        return m4680a(context, uri, new C0905a(context.getContentResolver()));
    }

    /* renamed from: a */
    private static C0904c m4680a(Context context, Uri uri, C0907d dVar) {
        return new C0904c(uri, new C0908e(C0832c.m4445a(context).mo4525g().mo4554a(), dVar, C0832c.m4445a(context).mo4519b(), context.getContentResolver()));
    }

    /* renamed from: b */
    public static C0904c m4681b(Context context, Uri uri) {
        return m4680a(context, uri, new C0906b(context.getContentResolver()));
    }

    /* renamed from: d */
    private InputStream m4682d() {
        InputStream b = this.f3431g.mo4673b(this.f3430f);
        int a = b != null ? this.f3431g.mo4672a(this.f3430f) : -1;
        return a != -1 ? new C0888g(b, a) : b;
    }

    /* renamed from: a */
    public Class<InputStream> mo4563a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public void mo4564a(C0838g gVar, C0882a<? super InputStream> aVar) {
        try {
            InputStream d = m4682d();
            this.f3432h = d;
            aVar.mo4646a(d);
        } catch (FileNotFoundException e) {
            String str = "MediaStoreThumbFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to find thumbnail file", e);
            }
            aVar.mo4645a((Exception) e);
        }
    }

    /* renamed from: b */
    public void mo4567b() {
        InputStream inputStream = this.f3432h;
        if (inputStream != null) {
            try {
                inputStream.close();
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
