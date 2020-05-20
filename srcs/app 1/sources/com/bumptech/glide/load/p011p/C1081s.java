package com.bumptech.glide.load.p011p;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.s */
public class C1081s<Data> implements C1069n<Integer, Data> {

    /* renamed from: a */
    private final C1069n<Uri, Data> f3831a;

    /* renamed from: b */
    private final Resources f3832b;

    /* renamed from: com.bumptech.glide.load.p.s$a */
    public static final class C1082a implements C1071o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f3833a;

        public C1082a(Resources resources) {
            this.f3833a = resources;
        }

        /* renamed from: a */
        public C1069n<Integer, AssetFileDescriptor> mo4574a(C1077r rVar) {
            return new C1081s(this.f3833a, rVar.mo4967a(Uri.class, AssetFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$b */
    public static class C1083b implements C1071o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f3834a;

        public C1083b(Resources resources) {
            this.f3834a = resources;
        }

        /* renamed from: a */
        public C1069n<Integer, ParcelFileDescriptor> mo4574a(C1077r rVar) {
            return new C1081s(this.f3834a, rVar.mo4967a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$c */
    public static class C1084c implements C1071o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f3835a;

        public C1084c(Resources resources) {
            this.f3835a = resources;
        }

        /* renamed from: a */
        public C1069n<Integer, InputStream> mo4574a(C1077r rVar) {
            return new C1081s(this.f3835a, rVar.mo4967a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$d */
    public static class C1085d implements C1071o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f3836a;

        public C1085d(Resources resources) {
            this.f3836a = resources;
        }

        /* renamed from: a */
        public C1069n<Integer, Uri> mo4574a(C1077r rVar) {
            return new C1081s(this.f3836a, C1091v.m5276a());
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1081s(Resources resources, C1069n<Uri, Data> nVar) {
        this.f3832b = resources;
        this.f3831a = nVar;
    }

    /* renamed from: b */
    private Uri m5249b(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f3832b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.f3832b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.f3832b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (NotFoundException e) {
            String str = "ResourceLoader";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                Log.w(str, sb2.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Integer num, int i, int i2, C0873i iVar) {
        Uri b = m5249b(num);
        if (b == null) {
            return null;
        }
        return this.f3831a.mo4571a(b, i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4573a(Integer num) {
        return true;
    }
}
