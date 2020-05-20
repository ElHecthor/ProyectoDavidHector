package com.bumptech.glide.load.p011p.p012y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p005n.p006p.C0903b;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import com.bumptech.glide.p028s.C1295b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.e */
public final class C1109e<DataT> implements C1069n<Uri, DataT> {

    /* renamed from: a */
    private final Context f3858a;

    /* renamed from: b */
    private final C1069n<File, DataT> f3859b;

    /* renamed from: c */
    private final C1069n<Uri, DataT> f3860c;

    /* renamed from: d */
    private final Class<DataT> f3861d;

    /* renamed from: com.bumptech.glide.load.p.y.e$a */
    private static abstract class C1110a<DataT> implements C1071o<Uri, DataT> {

        /* renamed from: a */
        private final Context f3862a;

        /* renamed from: b */
        private final Class<DataT> f3863b;

        C1110a(Context context, Class<DataT> cls) {
            this.f3862a = context;
            this.f3863b = cls;
        }

        /* renamed from: a */
        public final C1069n<Uri, DataT> mo4574a(C1077r rVar) {
            return new C1109e(this.f3862a, rVar.mo4967a(File.class, this.f3863b), rVar.mo4967a(Uri.class, this.f3863b), this.f3863b);
        }

        /* renamed from: a */
        public final void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.y.e$b */
    public static final class C1111b extends C1110a<ParcelFileDescriptor> {
        public C1111b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.y.e$c */
    public static final class C1112c extends C1110a<InputStream> {
        public C1112c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.y.e$d */
    private static final class C1113d<DataT> implements C0881d<DataT> {

        /* renamed from: p */
        private static final String[] f3864p = {"_data"};

        /* renamed from: f */
        private final Context f3865f;

        /* renamed from: g */
        private final C1069n<File, DataT> f3866g;

        /* renamed from: h */
        private final C1069n<Uri, DataT> f3867h;

        /* renamed from: i */
        private final Uri f3868i;

        /* renamed from: j */
        private final int f3869j;

        /* renamed from: k */
        private final int f3870k;

        /* renamed from: l */
        private final C0873i f3871l;

        /* renamed from: m */
        private final Class<DataT> f3872m;

        /* renamed from: n */
        private volatile boolean f3873n;

        /* renamed from: o */
        private volatile C0881d<DataT> f3874o;

        C1113d(Context context, C1069n<File, DataT> nVar, C1069n<Uri, DataT> nVar2, Uri uri, int i, int i2, C0873i iVar, Class<DataT> cls) {
            this.f3865f = context.getApplicationContext();
            this.f3866g = nVar;
            this.f3867h = nVar2;
            this.f3868i = uri;
            this.f3869j = i;
            this.f3870k = i2;
            this.f3871l = iVar;
            this.f3872m = cls;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private File m5337a(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f3865f.getContentResolver().query(uri, f3864p, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to media store entry for: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return file;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File path was empty in media store for: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: d */
        private C1070a<DataT> m5338d() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f3866g.mo4571a(m5337a(this.f3868i), this.f3869j, this.f3870k, this.f3871l);
            }
            return this.f3867h.mo4571a(m5340f() ? MediaStore.setRequireOriginal(this.f3868i) : this.f3868i, this.f3869j, this.f3870k, this.f3871l);
        }

        /* renamed from: e */
        private C0881d<DataT> m5339e() {
            C1070a d = m5338d();
            if (d != null) {
                return d.f3808c;
            }
            return null;
        }

        /* renamed from: f */
        private boolean m5340f() {
            return this.f3865f.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: a */
        public Class<DataT> mo4563a() {
            return this.f3872m;
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super DataT> aVar) {
            try {
                C0881d<DataT> e = m5339e();
                if (e == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to build fetcher for: ");
                    sb.append(this.f3868i);
                    aVar.mo4645a((Exception) new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.f3874o = e;
                if (this.f3873n) {
                    cancel();
                } else {
                    e.mo4564a(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.mo4645a((Exception) e2);
            }
        }

        /* renamed from: b */
        public void mo4567b() {
            C0881d<DataT> dVar = this.f3874o;
            if (dVar != null) {
                dVar.mo4567b();
            }
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return C0856a.LOCAL;
        }

        public void cancel() {
            this.f3873n = true;
            C0881d<DataT> dVar = this.f3874o;
            if (dVar != null) {
                dVar.cancel();
            }
        }
    }

    C1109e(Context context, C1069n<File, DataT> nVar, C1069n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f3858a = context.getApplicationContext();
        this.f3859b = nVar;
        this.f3860c = nVar2;
        this.f3861d = cls;
    }

    /* renamed from: a */
    public C1070a<DataT> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        Uri uri2 = uri;
        C1295b bVar = new C1295b(uri);
        C1113d dVar = new C1113d(this.f3858a, this.f3859b, this.f3860c, uri2, i, i2, iVar, this.f3861d);
        return new C1070a<>(bVar, dVar);
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return VERSION.SDK_INT >= 29 && C0903b.m4676b(uri);
    }
}
