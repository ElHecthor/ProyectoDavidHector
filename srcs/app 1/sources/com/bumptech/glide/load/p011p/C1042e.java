package com.bumptech.glide.load.p011p;

import android.util.Base64;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.e */
public final class C1042e<Model, Data> implements C1069n<Model, Data> {

    /* renamed from: a */
    private final C1043a<Data> f3772a;

    /* renamed from: com.bumptech.glide.load.p.e$a */
    public interface C1043a<Data> {
        /* renamed from: a */
        Class<Data> mo4925a();

        /* renamed from: a */
        Data mo4926a(String str);

        /* renamed from: a */
        void mo4927a(Data data);
    }

    /* renamed from: com.bumptech.glide.load.p.e$b */
    private static final class C1044b<Data> implements C0881d<Data> {

        /* renamed from: f */
        private final String f3773f;

        /* renamed from: g */
        private final C1043a<Data> f3774g;

        /* renamed from: h */
        private Data f3775h;

        C1044b(String str, C1043a<Data> aVar) {
            this.f3773f = str;
            this.f3774g = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo4563a() {
            return this.f3774g.mo4925a();
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super Data> aVar) {
            try {
                Data a = this.f3774g.mo4926a(this.f3773f);
                this.f3775h = a;
                aVar.mo4646a(a);
            } catch (IllegalArgumentException e) {
                aVar.mo4645a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo4567b() {
            try {
                this.f3774g.mo4927a(this.f3775h);
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return C0856a.LOCAL;
        }

        public void cancel() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.e$c */
    public static final class C1045c<Model> implements C1071o<Model, InputStream> {

        /* renamed from: a */
        private final C1043a<InputStream> f3776a = new C1046a(this);

        /* renamed from: com.bumptech.glide.load.p.e$c$a */
        class C1046a implements C1043a<InputStream> {
            C1046a(C1045c cVar) {
            }

            /* renamed from: a */
            public InputStream m5150a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }

            /* renamed from: a */
            public Class<InputStream> mo4925a() {
                return InputStream.class;
            }

            /* renamed from: a */
            public void mo4927a(InputStream inputStream) {
                inputStream.close();
            }
        }

        /* renamed from: a */
        public C1069n<Model, InputStream> mo4574a(C1077r rVar) {
            return new C1042e(this.f3776a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1042e(C1043a<Data> aVar) {
        this.f3772a = aVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Model model, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(model), new C1044b(model.toString(), this.f3772a));
    }

    /* renamed from: a */
    public boolean mo4573a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
