package com.bumptech.glide.load.p011p;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.f */
public class C1047f<Data> implements C1069n<File, Data> {

    /* renamed from: a */
    private final C1052d<Data> f3777a;

    /* renamed from: com.bumptech.glide.load.p.f$a */
    public static class C1048a<Data> implements C1071o<File, Data> {

        /* renamed from: a */
        private final C1052d<Data> f3778a;

        public C1048a(C1052d<Data> dVar) {
            this.f3778a = dVar;
        }

        /* renamed from: a */
        public final C1069n<File, Data> mo4574a(C1077r rVar) {
            return new C1047f(this.f3778a);
        }

        /* renamed from: a */
        public final void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$b */
    public static class C1049b extends C1048a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.p.f$b$a */
        class C1050a implements C1052d<ParcelFileDescriptor> {
            C1050a() {
            }

            /* renamed from: a */
            public ParcelFileDescriptor m5161a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo4932a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: a */
            public void mo4934a(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public C1049b() {
            super(new C1050a());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$c */
    private static final class C1051c<Data> implements C0881d<Data> {

        /* renamed from: f */
        private final File f3779f;

        /* renamed from: g */
        private final C1052d<Data> f3780g;

        /* renamed from: h */
        private Data f3781h;

        C1051c(File file, C1052d<Data> dVar) {
            this.f3779f = file;
            this.f3780g = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo4563a() {
            return this.f3780g.mo4932a();
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super Data> aVar) {
            try {
                Data a = this.f3780g.mo4931a(this.f3779f);
                this.f3781h = a;
                aVar.mo4646a(a);
            } catch (FileNotFoundException e) {
                String str = "FileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to open file", e);
                }
                aVar.mo4645a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo4567b() {
            Data data = this.f3781h;
            if (data != null) {
                try {
                    this.f3780g.mo4934a(data);
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return C0856a.LOCAL;
        }

        public void cancel() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$d */
    public interface C1052d<Data> {
        /* renamed from: a */
        Class<Data> mo4932a();

        /* renamed from: a */
        Data mo4931a(File file);

        /* renamed from: a */
        void mo4934a(Data data);
    }

    /* renamed from: com.bumptech.glide.load.p.f$e */
    public static class C1053e extends C1048a<InputStream> {

        /* renamed from: com.bumptech.glide.load.p.f$e$a */
        class C1054a implements C1052d<InputStream> {
            C1054a() {
            }

            /* renamed from: a */
            public InputStream m5173a(File file) {
                return new FileInputStream(file);
            }

            /* renamed from: a */
            public Class<InputStream> mo4932a() {
                return InputStream.class;
            }

            /* renamed from: a */
            public void mo4934a(InputStream inputStream) {
                inputStream.close();
            }
        }

        public C1053e() {
            super(new C1054a());
        }
    }

    public C1047f(C1052d<Data> dVar) {
        this.f3777a = dVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(File file, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(file), new C1051c(file, this.f3777a));
    }

    /* renamed from: a */
    public boolean mo4573a(File file) {
        return true;
    }
}
