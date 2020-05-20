package com.bumptech.glide.load.p013q.p014d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0870h;
import com.bumptech.glide.load.C0870h.C0872b;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.d0 */
public class C1133d0<T> implements C0875k<T, Bitmap> {

    /* renamed from: d */
    public static final C0870h<Long> f3905d = C0870h.m4574a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C1134a());

    /* renamed from: e */
    public static final C0870h<Integer> f3906e = C0870h.m4574a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C1135b());

    /* renamed from: f */
    private static final C1139e f3907f = new C1139e();

    /* renamed from: a */
    private final C1140f<T> f3908a;

    /* renamed from: b */
    private final C0921e f3909b;

    /* renamed from: c */
    private final C1139e f3910c;

    /* renamed from: com.bumptech.glide.load.q.d.d0$a */
    class C1134a implements C0872b<Long> {

        /* renamed from: a */
        private final ByteBuffer f3911a = ByteBuffer.allocate(8);

        C1134a() {
        }

        /* renamed from: a */
        public void mo4626a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f3911a) {
                this.f3911a.position(0);
                messageDigest.update(this.f3911a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$b */
    class C1135b implements C0872b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f3912a = ByteBuffer.allocate(4);

        C1135b() {
        }

        /* renamed from: a */
        public void mo4626a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f3912a) {
                    this.f3912a.position(0);
                    messageDigest.update(this.f3912a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$c */
    private static final class C1136c implements C1140f<AssetFileDescriptor> {
        private C1136c() {
        }

        /* synthetic */ C1136c(C1134a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5021a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$d */
    static final class C1137d implements C1140f<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.q.d.d0$d$a */
        class C1138a extends MediaDataSource {

            /* renamed from: f */
            final /* synthetic */ ByteBuffer f3913f;

            C1138a(C1137d dVar, ByteBuffer byteBuffer) {
                this.f3913f = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f3913f.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f3913f.limit())) {
                    return -1;
                }
                this.f3913f.position((int) j);
                int min = Math.min(i2, this.f3913f.remaining());
                this.f3913f.get(bArr, i, min);
                return min;
            }
        }

        C1137d() {
        }

        /* renamed from: a */
        public void mo5021a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C1138a(this, byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$e */
    static class C1139e {
        C1139e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo5026a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$f */
    interface C1140f<T> {
        /* renamed from: a */
        void mo5021a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.q.d.d0$g */
    static final class C1141g implements C1140f<ParcelFileDescriptor> {
        C1141g() {
        }

        /* renamed from: a */
        public void mo5021a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C1133d0(C0921e eVar, C1140f<T> fVar) {
        this(eVar, fVar, f3907f);
    }

    C1133d0(C0921e eVar, C1140f<T> fVar, C1139e eVar2) {
        this.f3909b = eVar;
        this.f3908a = fVar;
        this.f3910c = eVar2;
    }

    /* renamed from: a */
    private static Bitmap m5404a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: a */
    private static Bitmap m5405a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1155m mVar) {
        Bitmap b = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || mVar == C1155m.f3929d) ? null : m5407b(mediaMetadataRetriever, j, i, i2, i3, mVar);
        return b == null ? m5404a(mediaMetadataRetriever, j, i) : b;
    }

    /* renamed from: a */
    public static C0875k<AssetFileDescriptor, Bitmap> m5406a(C0921e eVar) {
        return new C1133d0(eVar, new C1136c(null));
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m5407b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1155m mVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = mVar.mo5042b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            String str = "VideoDecoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Exception trying to decode frame on oreo+", th);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static C0875k<ByteBuffer, Bitmap> m5408b(C0921e eVar) {
        return new C1133d0(eVar, new C1137d());
    }

    /* renamed from: c */
    public static C0875k<ParcelFileDescriptor, Bitmap> m5409c(C0921e eVar) {
        return new C1133d0(eVar, new C1141g());
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(T t, int i, int i2, C0873i iVar) {
        long longValue = ((Long) iVar.mo4628a(f3905d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo4628a(f3906e);
            if (num == null) {
                num = Integer.valueOf(2);
            }
            C1155m mVar = (C1155m) iVar.mo4628a(C1155m.f3931f);
            if (mVar == null) {
                mVar = C1155m.f3930e;
            }
            C1155m mVar2 = mVar;
            MediaMetadataRetriever a = this.f3910c.mo5026a();
            try {
                this.f3908a.mo5021a(a, t);
                Bitmap a2 = m5405a(a, longValue, num.intValue(), i, i2, mVar2);
                a.release();
                return C1142e.m5424a(a2, this.f3909b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo4632a(T t, C0873i iVar) {
        return true;
    }
}
