package com.bumptech.glide.load.p011p;

import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;
import com.bumptech.glide.p029t.C1296a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d */
public class C1039d implements C1069n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.p.d$a */
    private static final class C1040a implements C0881d<ByteBuffer> {

        /* renamed from: f */
        private final File f3771f;

        C1040a(File file) {
            this.f3771f = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo4563a() {
            return ByteBuffer.class;
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super ByteBuffer> aVar) {
            try {
                aVar.mo4646a(C1296a.m6119a(this.f3771f));
            } catch (IOException e) {
                String str = "ByteBufferFileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo4645a((Exception) e);
            }
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

    /* renamed from: com.bumptech.glide.load.p.d$b */
    public static class C1041b implements C1071o<File, ByteBuffer> {
        /* renamed from: a */
        public C1069n<File, ByteBuffer> mo4574a(C1077r rVar) {
            return new C1039d();
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: a */
    public C1070a<ByteBuffer> mo4571a(File file, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(file), new C1040a(file));
    }

    /* renamed from: a */
    public boolean mo4573a(File file) {
        return true;
    }
}
