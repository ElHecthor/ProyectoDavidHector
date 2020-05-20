package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C0861f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p005n.C0894k;
import com.bumptech.glide.load.p005n.C0897m;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.p029t.C1309j;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.d.t */
interface C1172t {

    /* renamed from: com.bumptech.glide.load.q.d.t$a */
    public static final class C1173a implements C1172t {

        /* renamed from: a */
        private final C0894k f3960a;

        /* renamed from: b */
        private final C0916b f3961b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f3962c;

        C1173a(InputStream inputStream, List<ImageHeaderParser> list, C0916b bVar) {
            C1309j.m6149a(bVar);
            this.f3961b = bVar;
            C1309j.m6149a(list);
            this.f3962c = list;
            this.f3960a = new C0894k(inputStream, bVar);
        }

        /* renamed from: a */
        public Bitmap mo5052a(Options options) {
            return BitmapFactory.decodeStream(this.f3960a.m4640a(), null, options);
        }

        /* renamed from: a */
        public void mo5053a() {
            this.f3960a.mo4662c();
        }

        /* renamed from: b */
        public int mo5054b() {
            return C0861f.m4559a(this.f3962c, this.f3960a.m4640a(), this.f3961b);
        }

        /* renamed from: c */
        public ImageType mo5055c() {
            return C0861f.m4563b(this.f3962c, this.f3960a.m4640a(), this.f3961b);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.t$b */
    public static final class C1174b implements C1172t {

        /* renamed from: a */
        private final C0916b f3963a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f3964b;

        /* renamed from: c */
        private final C0897m f3965c;

        C1174b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C0916b bVar) {
            C1309j.m6149a(bVar);
            this.f3963a = bVar;
            C1309j.m6149a(list);
            this.f3964b = list;
            this.f3965c = new C0897m(parcelFileDescriptor);
        }

        /* renamed from: a */
        public Bitmap mo5052a(Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f3965c.m4653a().getFileDescriptor(), null, options);
        }

        /* renamed from: a */
        public void mo5053a() {
        }

        /* renamed from: b */
        public int mo5054b() {
            return C0861f.m4558a(this.f3964b, this.f3965c, this.f3963a);
        }

        /* renamed from: c */
        public ImageType mo5055c() {
            return C0861f.m4562b(this.f3964b, this.f3965c, this.f3963a);
        }
    }

    /* renamed from: a */
    Bitmap mo5052a(Options options);

    /* renamed from: a */
    void mo5053a();

    /* renamed from: b */
    int mo5054b();

    /* renamed from: c */
    ImageType mo5055c();
}
