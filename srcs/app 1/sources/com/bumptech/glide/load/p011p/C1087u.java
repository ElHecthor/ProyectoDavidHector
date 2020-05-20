package com.bumptech.glide.load.p011p;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.u */
public class C1087u<Data> implements C1069n<String, Data> {

    /* renamed from: a */
    private final C1069n<Uri, Data> f3838a;

    /* renamed from: com.bumptech.glide.load.p.u$a */
    public static final class C1088a implements C1071o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C1069n<String, AssetFileDescriptor> mo4574a(C1077r rVar) {
            return new C1087u(rVar.mo4967a(Uri.class, AssetFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$b */
    public static class C1089b implements C1071o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C1069n<String, ParcelFileDescriptor> mo4574a(C1077r rVar) {
            return new C1087u(rVar.mo4967a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$c */
    public static class C1090c implements C1071o<String, InputStream> {
        /* renamed from: a */
        public C1069n<String, InputStream> mo4574a(C1077r rVar) {
            return new C1087u(rVar.mo4967a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1087u(C1069n<Uri, Data> nVar) {
        this.f3838a = nVar;
    }

    /* renamed from: b */
    private static Uri m5264b(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                uri = parse;
                return uri;
            }
        }
        uri = m5265c(str);
        return uri;
    }

    /* renamed from: c */
    private static Uri m5265c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(String str, int i, int i2, C0873i iVar) {
        Uri b = m5264b(str);
        if (b == null || !this.f3838a.mo4573a(b)) {
            return null;
        }
        return this.f3838a.mo4571a(b, i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4573a(String str) {
        return true;
    }
}
