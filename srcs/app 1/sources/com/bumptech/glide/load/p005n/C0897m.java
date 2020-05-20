package com.bumptech.glide.load.p005n;

import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.p005n.C0883e.C0884a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.m */
public final class C0897m implements C0883e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C0899b f3427a;

    /* renamed from: com.bumptech.glide.load.n.m$a */
    public static final class C0898a implements C0884a<ParcelFileDescriptor> {
        /* renamed from: a */
        public C0883e<ParcelFileDescriptor> mo4649a(ParcelFileDescriptor parcelFileDescriptor) {
            return new C0897m(parcelFileDescriptor);
        }

        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo4650a() {
            return ParcelFileDescriptor.class;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.m$b */
    private static final class C0899b {

        /* renamed from: a */
        private final ParcelFileDescriptor f3428a;

        C0899b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f3428a = parcelFileDescriptor;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public ParcelFileDescriptor mo4665a() {
            try {
                Os.lseek(this.f3428a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f3428a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public C0897m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3427a = new C0899b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m4651c() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public ParcelFileDescriptor m4653a() {
        return this.f3427a.mo4665a();
    }

    /* renamed from: b */
    public void mo4648b() {
    }
}
