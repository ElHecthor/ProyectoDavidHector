package com.bumptech.glide.load.p011p;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0889h;
import com.bumptech.glide.load.p005n.C0900n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.a */
public class C1027a<Data> implements C1069n<Uri, Data> {

    /* renamed from: c */
    private static final int f3763c = 22;

    /* renamed from: a */
    private final AssetManager f3764a;

    /* renamed from: b */
    private final C1028a<Data> f3765b;

    /* renamed from: com.bumptech.glide.load.p.a$a */
    public interface C1028a<Data> {
        /* renamed from: a */
        C0881d<Data> mo4917a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.p.a$b */
    public static class C1029b implements C1071o<Uri, ParcelFileDescriptor>, C1028a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f3766a;

        public C1029b(AssetManager assetManager) {
            this.f3766a = assetManager;
        }

        /* renamed from: a */
        public C0881d<ParcelFileDescriptor> mo4917a(AssetManager assetManager, String str) {
            return new C0889h(assetManager, str);
        }

        /* renamed from: a */
        public C1069n<Uri, ParcelFileDescriptor> mo4574a(C1077r rVar) {
            return new C1027a(this.f3766a, this);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.a$c */
    public static class C1030c implements C1071o<Uri, InputStream>, C1028a<InputStream> {

        /* renamed from: a */
        private final AssetManager f3767a;

        public C1030c(AssetManager assetManager) {
            this.f3767a = assetManager;
        }

        /* renamed from: a */
        public C0881d<InputStream> mo4917a(AssetManager assetManager, String str) {
            return new C0900n(assetManager, str);
        }

        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1027a(this.f3767a, this);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1027a(AssetManager assetManager, C1028a<Data> aVar) {
        this.f3764a = assetManager;
        this.f3765b = aVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(uri), this.f3765b.mo4917a(this.f3764a, uri.toString().substring(f3763c)));
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return "android_asset".equals(uri.getPathSegments().get(0));
    }
}
