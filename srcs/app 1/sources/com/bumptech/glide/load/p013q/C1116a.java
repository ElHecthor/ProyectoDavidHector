package com.bumptech.glide.load.p013q;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.DecodeException;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.OnPartialImageListener;
import android.graphics.ImageDecoder.Source;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C0857b;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0874j;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p013q.p014d.C1155m;
import com.bumptech.glide.load.p013q.p014d.C1163n;
import com.bumptech.glide.load.p013q.p014d.C1171s;

/* renamed from: com.bumptech.glide.load.q.a */
public abstract class C1116a<T> implements C0875k<Source, T> {

    /* renamed from: a */
    final C1171s f3876a = C1171s.m5526a();

    /* renamed from: com.bumptech.glide.load.q.a$a */
    class C1117a implements OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f3877a;

        /* renamed from: b */
        final /* synthetic */ int f3878b;

        /* renamed from: c */
        final /* synthetic */ boolean f3879c;

        /* renamed from: d */
        final /* synthetic */ C0857b f3880d;

        /* renamed from: e */
        final /* synthetic */ C1155m f3881e;

        /* renamed from: f */
        final /* synthetic */ C0874j f3882f;

        /* renamed from: com.bumptech.glide.load.q.a$a$a */
        class C1118a implements OnPartialImageListener {
            C1118a(C1117a aVar) {
            }

            public boolean onPartialImage(DecodeException decodeException) {
                return false;
            }
        }

        C1117a(int i, int i2, boolean z, C0857b bVar, C1155m mVar, C0874j jVar) {
            this.f3877a = i;
            this.f3878b = i2;
            this.f3879c = z;
            this.f3880d = bVar;
            this.f3881e = mVar;
            this.f3882f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageInfo imageInfo, Source source) {
            Named named;
            boolean z = false;
            if (C1116a.this.f3876a.mo5051a(this.f3877a, this.f3878b, this.f3879c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f3880d == C0857b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1118a(this));
            Size size = imageInfo.getSize();
            int i = this.f3877a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f3878b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f3881e.mo5042b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            String str = "ImageDecoder";
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resizing from [");
                sb.append(size.getWidth());
                String str2 = "x";
                sb.append(str2);
                sb.append(size.getHeight());
                sb.append("] to [");
                sb.append(round);
                sb.append(str2);
                sb.append(round2);
                sb.append("] scaleFactor: ");
                sb.append(b);
                Log.v(str, sb.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f3882f == C0874j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1020v<T> mo4998a(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener);

    /* renamed from: a */
    public final C1020v<T> mo4631a(Source source, int i, int i2, C0873i iVar) {
        C1117a aVar = new C1117a(i, i2, iVar.mo4628a(C1163n.f3939i) != null && ((Boolean) iVar.mo4628a(C1163n.f3939i)).booleanValue(), (C0857b) iVar.mo4628a(C1163n.f3936f), (C1155m) iVar.mo4628a(C1155m.f3931f), (C0874j) iVar.mo4628a(C1163n.f3937g));
        return mo4998a(source, i, i2, (OnHeaderDecodedListener) aVar);
    }

    /* renamed from: a */
    public final boolean mo4632a(Source source, C0873i iVar) {
        return true;
    }
}
