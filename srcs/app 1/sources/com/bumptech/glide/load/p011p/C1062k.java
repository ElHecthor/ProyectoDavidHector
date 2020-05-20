package com.bumptech.glide.load.p011p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p005n.p006p.C0903b;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.p.k */
public final class C1062k implements C1069n<Uri, File> {

    /* renamed from: a */
    private final Context f3796a;

    /* renamed from: com.bumptech.glide.load.p.k$a */
    public static final class C1063a implements C1071o<Uri, File> {

        /* renamed from: a */
        private final Context f3797a;

        public C1063a(Context context) {
            this.f3797a = context;
        }

        /* renamed from: a */
        public C1069n<Uri, File> mo4574a(C1077r rVar) {
            return new C1062k(this.f3797a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.k$b */
    private static class C1064b implements C0881d<File> {

        /* renamed from: h */
        private static final String[] f3798h = {"_data"};

        /* renamed from: f */
        private final Context f3799f;

        /* renamed from: g */
        private final Uri f3800g;

        C1064b(Context context, Uri uri) {
            this.f3799f = context;
            this.f3800g = uri;
        }

        /* renamed from: a */
        public Class<File> mo4563a() {
            return File.class;
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super File> aVar) {
            Cursor query = this.f3799f.getContentResolver().query(this.f3800g, f3798h, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.f3800g);
                aVar.mo4645a((Exception) new FileNotFoundException(sb.toString()));
                return;
            }
            aVar.mo4646a(new File(str));
        }

        /* renamed from: b */
        public void mo4567b() {
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return C0856a.LOCAL;
        }

        public void cancel() {
        }
    }

    public C1062k(Context context) {
        this.f3796a = context;
    }

    /* renamed from: a */
    public C1070a<File> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(uri), new C1064b(this.f3796a, uri));
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return C0903b.m4676b(uri);
    }
}
