package com.bumptech.glide.load.p011p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0878a;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0890i;
import com.bumptech.glide.load.p005n.C0901o;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.w */
public class C1094w<Data> implements C1069n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f3842b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C1097c<Data> f3843a;

    /* renamed from: com.bumptech.glide.load.p.w$a */
    public static final class C1095a implements C1071o<Uri, AssetFileDescriptor>, C1097c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f3844a;

        public C1095a(ContentResolver contentResolver) {
            this.f3844a = contentResolver;
        }

        /* renamed from: a */
        public C0881d<AssetFileDescriptor> mo4983a(Uri uri) {
            return new C0878a(this.f3844a, uri);
        }

        /* renamed from: a */
        public C1069n<Uri, AssetFileDescriptor> mo4574a(C1077r rVar) {
            return new C1094w(this);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$b */
    public static class C1096b implements C1071o<Uri, ParcelFileDescriptor>, C1097c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f3845a;

        public C1096b(ContentResolver contentResolver) {
            this.f3845a = contentResolver;
        }

        /* renamed from: a */
        public C0881d<ParcelFileDescriptor> mo4983a(Uri uri) {
            return new C0890i(this.f3845a, uri);
        }

        /* renamed from: a */
        public C1069n<Uri, ParcelFileDescriptor> mo4574a(C1077r rVar) {
            return new C1094w(this);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$c */
    public interface C1097c<Data> {
        /* renamed from: a */
        C0881d<Data> mo4983a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.p.w$d */
    public static class C1098d implements C1071o<Uri, InputStream>, C1097c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f3846a;

        public C1098d(ContentResolver contentResolver) {
            this.f3846a = contentResolver;
        }

        /* renamed from: a */
        public C0881d<InputStream> mo4983a(Uri uri) {
            return new C0901o(this.f3846a, uri);
        }

        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1094w(this);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1094w(C1097c<Data> cVar) {
        this.f3843a = cVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(uri), this.f3843a.mo4983a(uri));
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return f3842b.contains(uri.getScheme());
    }
}
