package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p013q.p014d.C1163n.C1165b;
import com.bumptech.glide.p029t.C1301d;
import com.bumptech.glide.p029t.C1307h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.a0 */
public class C1122a0 implements C0875k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1163n f3888a;

    /* renamed from: b */
    private final C0916b f3889b;

    /* renamed from: com.bumptech.glide.load.q.d.a0$a */
    static class C1123a implements C1165b {

        /* renamed from: a */
        private final C1178x f3890a;

        /* renamed from: b */
        private final C1301d f3891b;

        C1123a(C1178x xVar, C1301d dVar) {
            this.f3890a = xVar;
            this.f3891b = dVar;
        }

        /* renamed from: a */
        public void mo5005a() {
            this.f3890a.mo5060a();
        }

        /* renamed from: a */
        public void mo5006a(C0921e eVar, Bitmap bitmap) {
            IOException a = this.f3891b.mo5355a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo4713a(bitmap);
                }
                throw a;
            }
        }
    }

    public C1122a0(C1163n nVar, C0916b bVar) {
        this.f3888a = nVar;
        this.f3889b = bVar;
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(InputStream inputStream, int i, int i2, C0873i iVar) {
        C1178x xVar;
        boolean z;
        if (inputStream instanceof C1178x) {
            xVar = (C1178x) inputStream;
            z = false;
        } else {
            xVar = new C1178x(inputStream, this.f3889b);
            z = true;
        }
        C1301d b = C1301d.m6129b(xVar);
        try {
            return this.f3888a.mo5045a((InputStream) new C1307h(b), i, i2, iVar, (C1165b) new C1123a(xVar, b));
        } finally {
            b.mo5359d();
            if (z) {
                xVar.mo5063d();
            }
        }
    }

    /* renamed from: a */
    public boolean mo4632a(InputStream inputStream, C0873i iVar) {
        return this.f3888a.mo5047a(inputStream);
    }
}
