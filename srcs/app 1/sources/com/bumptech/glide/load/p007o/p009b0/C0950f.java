package com.bumptech.glide.load.p007o.p009b0;

import android.content.Context;
import com.bumptech.glide.load.p007o.p009b0.C0947d.C0948a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.f */
public final class C0950f extends C0947d {

    /* renamed from: com.bumptech.glide.load.o.b0.f$a */
    class C0951a implements C0948a {

        /* renamed from: a */
        final /* synthetic */ Context f3510a;

        /* renamed from: b */
        final /* synthetic */ String f3511b;

        C0951a(Context context, String str) {
            this.f3510a = context;
            this.f3511b = str;
        }

        /* renamed from: a */
        public File mo4746a() {
            File cacheDir = this.f3510a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f3511b != null ? new File(cacheDir, this.f3511b) : cacheDir;
        }
    }

    public C0950f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C0950f(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C0950f(Context context, String str, long j) {
        super(new C0951a(context, str), j);
    }
}
