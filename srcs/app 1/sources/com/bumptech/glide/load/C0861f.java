package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p005n.C0897m;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p013q.p014d.C1178x;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
public final class C0861f {

    /* renamed from: com.bumptech.glide.load.f$a */
    class C0862a implements C0868g {

        /* renamed from: a */
        final /* synthetic */ InputStream f3382a;

        C0862a(InputStream inputStream) {
            this.f3382a = inputStream;
        }

        /* renamed from: a */
        public ImageType mo4616a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo4612a(this.f3382a);
            } finally {
                this.f3382a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$b */
    class C0863b implements C0868g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f3383a;

        C0863b(ByteBuffer byteBuffer) {
            this.f3383a = byteBuffer;
        }

        /* renamed from: a */
        public ImageType mo4616a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.mo4613a(this.f3383a);
        }
    }

    /* renamed from: com.bumptech.glide.load.f$c */
    class C0864c implements C0868g {

        /* renamed from: a */
        final /* synthetic */ C0897m f3384a;

        /* renamed from: b */
        final /* synthetic */ C0916b f3385b;

        C0864c(C0897m mVar, C0916b bVar) {
            this.f3384a = mVar;
            this.f3385b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo4616a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.q.d.x r1 = new com.bumptech.glide.load.q.d.x     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.n.m r3 = r4.f3384a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.m4653a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.o.a0.b r3 = r4.f3385b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo4612a(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.n.m r0 = r4.f3384a
                r0.m4653a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.n.m r0 = r4.f3384a
                r0.m4653a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C0861f.C0864c.mo4616a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$d */
    class C0865d implements C0867f {

        /* renamed from: a */
        final /* synthetic */ InputStream f3386a;

        /* renamed from: b */
        final /* synthetic */ C0916b f3387b;

        C0865d(InputStream inputStream, C0916b bVar) {
            this.f3386a = inputStream;
            this.f3387b = bVar;
        }

        /* renamed from: a */
        public int mo4617a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo4611a(this.f3386a, this.f3387b);
            } finally {
                this.f3386a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$e */
    class C0866e implements C0867f {

        /* renamed from: a */
        final /* synthetic */ C0897m f3388a;

        /* renamed from: b */
        final /* synthetic */ C0916b f3389b;

        C0866e(C0897m mVar, C0916b bVar) {
            this.f3388a = mVar;
            this.f3389b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4617a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.q.d.x r1 = new com.bumptech.glide.load.q.d.x     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.m r3 = r4.f3388a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.m4653a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.o.a0.b r3 = r4.f3389b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.o.a0.b r0 = r4.f3389b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo4611a(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.n.m r0 = r4.f3388a
                r0.m4653a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.n.m r0 = r4.f3388a
                r0.m4653a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C0861f.C0866e.mo4617a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$f */
    private interface C0867f {
        /* renamed from: a */
        int mo4617a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.f$g */
    private interface C0868g {
        /* renamed from: a */
        ImageType mo4616a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    private static int m4557a(List<ImageHeaderParser> list, C0867f fVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo4617a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m4558a(List<ImageHeaderParser> list, C0897m mVar, C0916b bVar) {
        return m4557a(list, (C0867f) new C0866e(mVar, bVar));
    }

    /* renamed from: a */
    public static int m4559a(List<ImageHeaderParser> list, InputStream inputStream, C0916b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1178x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m4557a(list, (C0867f) new C0865d(inputStream, bVar));
    }

    /* renamed from: a */
    private static ImageType m4560a(List<ImageHeaderParser> list, C0868g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageType a = gVar.mo4616a((ImageHeaderParser) list.get(i));
            if (a != ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public static ImageType m4561a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageType.UNKNOWN : m4560a(list, (C0868g) new C0863b(byteBuffer));
    }

    /* renamed from: b */
    public static ImageType m4562b(List<ImageHeaderParser> list, C0897m mVar, C0916b bVar) {
        return m4560a(list, (C0868g) new C0864c(mVar, bVar));
    }

    /* renamed from: b */
    public static ImageType m4563b(List<ImageHeaderParser> list, InputStream inputStream, C0916b bVar) {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1178x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m4560a(list, (C0868g) new C0862a(inputStream));
    }
}
