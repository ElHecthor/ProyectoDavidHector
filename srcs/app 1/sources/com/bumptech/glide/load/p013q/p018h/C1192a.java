package com.bumptech.glide.load.p013q.p018h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.C0857b;
import com.bumptech.glide.load.C0861f;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p013q.C1120c;
import com.bumptech.glide.p021n.C1226a;
import com.bumptech.glide.p021n.C1226a.C1227a;
import com.bumptech.glide.p021n.C1229c;
import com.bumptech.glide.p021n.C1230d;
import com.bumptech.glide.p021n.C1231e;
import com.bumptech.glide.p029t.C1305f;
import com.bumptech.glide.p029t.C1310k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.q.h.a */
public class C1192a implements C0875k<ByteBuffer, C1196c> {

    /* renamed from: f */
    private static final C1193a f3985f = new C1193a();

    /* renamed from: g */
    private static final C1194b f3986g = new C1194b();

    /* renamed from: a */
    private final Context f3987a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f3988b;

    /* renamed from: c */
    private final C1194b f3989c;

    /* renamed from: d */
    private final C1193a f3990d;

    /* renamed from: e */
    private final C1195b f3991e;

    /* renamed from: com.bumptech.glide.load.q.h.a$a */
    static class C1193a {
        C1193a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1226a mo5081a(C1227a aVar, C1229c cVar, ByteBuffer byteBuffer, int i) {
            return new C1231e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.a$b */
    static class C1194b {

        /* renamed from: a */
        private final Queue<C1230d> f3992a = C1310k.m6165a(0);

        C1194b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C1230d mo5082a(ByteBuffer byteBuffer) {
            C1230d dVar;
            dVar = (C1230d) this.f3992a.poll();
            if (dVar == null) {
                dVar = new C1230d();
            }
            dVar.mo5175a(byteBuffer);
            return dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo5083a(C1230d dVar) {
            dVar.mo5176a();
            this.f3992a.offer(dVar);
        }
    }

    public C1192a(Context context, List<ImageHeaderParser> list, C0921e eVar, C0916b bVar) {
        this(context, list, eVar, bVar, f3986g, f3985f);
    }

    C1192a(Context context, List<ImageHeaderParser> list, C0921e eVar, C0916b bVar, C1194b bVar2, C1193a aVar) {
        this.f3987a = context.getApplicationContext();
        this.f3988b = list;
        this.f3990d = aVar;
        this.f3991e = new C1195b(eVar, bVar);
        this.f3989c = bVar2;
    }

    /* renamed from: a */
    private static int m5601a(C1229c cVar, int i, int i2) {
        int min = Math.min(cVar.mo5171a() / i2, cVar.mo5174d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        String str = "BufferGifDecoder";
        if (Log.isLoggable(str, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo5174d());
            sb.append(str2);
            sb.append(cVar.mo5171a());
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return max;
    }

    /* renamed from: a */
    private C1199e m5602a(ByteBuffer byteBuffer, int i, int i2, C1230d dVar, C0873i iVar) {
        String str = "Decoded GIF from stream in ";
        String str2 = "BufferGifDecoder";
        long a = C1305f.m6136a();
        try {
            C1229c b = dVar.mo5177b();
            if (b.mo5172b() > 0) {
                if (b.mo5173c() == 0) {
                    Config config = iVar.mo4628a(C1207i.f4032a) == C0857b.PREFER_RGB_565 ? Config.RGB_565 : Config.ARGB_8888;
                    C1226a a2 = this.f3990d.mo5081a(this.f3991e, b, byteBuffer, m5601a(b, i, i2));
                    a2.mo5162a(config);
                    a2.mo5164c();
                    Bitmap b2 = a2.mo5163b();
                    if (b2 == null) {
                        if (Log.isLoggable(str2, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(C1305f.m6135a(a));
                            Log.v(str2, sb.toString());
                        }
                        return null;
                    }
                    C1196c cVar = new C1196c(this.f3987a, a2, C1120c.m5359a(), i, i2, b2);
                    C1199e eVar = new C1199e(cVar);
                    if (Log.isLoggable(str2, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(C1305f.m6135a(a));
                        Log.v(str2, sb2.toString());
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C1305f.m6135a(a));
                Log.v(str2, sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public C1199e mo4631a(ByteBuffer byteBuffer, int i, int i2, C0873i iVar) {
        C1230d a = this.f3989c.mo5082a(byteBuffer);
        try {
            C1199e a2 = m5602a(byteBuffer, i, i2, a, iVar);
            return a2;
        } finally {
            this.f3989c.mo5083a(a);
        }
    }

    /* renamed from: a */
    public boolean mo4632a(ByteBuffer byteBuffer, C0873i iVar) {
        return !((Boolean) iVar.mo4628a(C1207i.f4033b)).booleanValue() && C0861f.m4561a(this.f3988b, byteBuffer) == ImageType.GIF;
    }
}
