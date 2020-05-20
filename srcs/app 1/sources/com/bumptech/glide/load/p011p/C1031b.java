package com.bumptech.glide.load.p011p;

import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.b */
public class C1031b<Data> implements C1069n<byte[], Data> {

    /* renamed from: a */
    private final C1034b<Data> f3768a;

    /* renamed from: com.bumptech.glide.load.p.b$a */
    public static class C1032a implements C1071o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.p.b$a$a */
        class C1033a implements C1034b<ByteBuffer> {
            C1033a(C1032a aVar) {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo4920a() {
                return ByteBuffer.class;
            }

            /* renamed from: a */
            public ByteBuffer m5113a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: a */
        public C1069n<byte[], ByteBuffer> mo4574a(C1077r rVar) {
            return new C1031b(new C1033a(this));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.b$b */
    public interface C1034b<Data> {
        /* renamed from: a */
        Class<Data> mo4920a();

        /* renamed from: a */
        Data mo4921a(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.p.b$c */
    private static class C1035c<Data> implements C0881d<Data> {

        /* renamed from: f */
        private final byte[] f3769f;

        /* renamed from: g */
        private final C1034b<Data> f3770g;

        C1035c(byte[] bArr, C1034b<Data> bVar) {
            this.f3769f = bArr;
            this.f3770g = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo4563a() {
            return this.f3770g.mo4920a();
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super Data> aVar) {
            aVar.mo4646a(this.f3770g.mo4921a(this.f3769f));
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

    /* renamed from: com.bumptech.glide.load.p.b$d */
    public static class C1036d implements C1071o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.p.b$d$a */
        class C1037a implements C1034b<InputStream> {
            C1037a(C1036d dVar) {
            }

            /* renamed from: a */
            public InputStream m5124a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            /* renamed from: a */
            public Class<InputStream> mo4920a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C1069n<byte[], InputStream> mo4574a(C1077r rVar) {
            return new C1031b(new C1037a(this));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1031b(C1034b<Data> bVar) {
        this.f3768a = bVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(byte[] bArr, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(bArr), new C1035c(bArr, this.f3768a));
    }

    /* renamed from: a */
    public boolean mo4573a(byte[] bArr) {
        return true;
    }
}
