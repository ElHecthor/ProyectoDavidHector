package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C0002a();

    /* renamed from: f */
    private final String f10f;

    /* renamed from: g */
    private final CharSequence f11g;

    /* renamed from: h */
    private final CharSequence f12h;

    /* renamed from: i */
    private final CharSequence f13i;

    /* renamed from: j */
    private final Bitmap f14j;

    /* renamed from: k */
    private final Uri f15k;

    /* renamed from: l */
    private final Bundle f16l;

    /* renamed from: m */
    private final Uri f17m;

    /* renamed from: n */
    private Object f18n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0002a implements Creator<MediaDescriptionCompat> {
        C0002a() {
        }

        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m5a(C0009d.m25a(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0003b {

        /* renamed from: a */
        private String f19a;

        /* renamed from: b */
        private CharSequence f20b;

        /* renamed from: c */
        private CharSequence f21c;

        /* renamed from: d */
        private CharSequence f22d;

        /* renamed from: e */
        private Bitmap f23e;

        /* renamed from: f */
        private Uri f24f;

        /* renamed from: g */
        private Bundle f25g;

        /* renamed from: h */
        private Uri f26h;

        /* renamed from: a */
        public C0003b mo13a(Bitmap bitmap) {
            this.f23e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0003b mo14a(Uri uri) {
            this.f24f = uri;
            return this;
        }

        /* renamed from: a */
        public C0003b mo15a(Bundle bundle) {
            this.f25g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0003b mo16a(CharSequence charSequence) {
            this.f22d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0003b mo17a(String str) {
            this.f19a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo18a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f19a, this.f20b, this.f21c, this.f22d, this.f23e, this.f24f, this.f25g, this.f26h);
            return mediaDescriptionCompat;
        }

        /* renamed from: b */
        public C0003b mo19b(Uri uri) {
            this.f26h = uri;
            return this;
        }

        /* renamed from: b */
        public C0003b mo20b(CharSequence charSequence) {
            this.f21c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0003b mo21c(CharSequence charSequence) {
            this.f20b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f10f = parcel.readString();
        this.f11g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f14j = (Bitmap) parcel.readParcelable(classLoader);
        this.f15k = (Uri) parcel.readParcelable(classLoader);
        this.f16l = parcel.readBundle(classLoader);
        this.f17m = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10f = str;
        this.f11g = charSequence;
        this.f12h = charSequence2;
        this.f13i = charSequence3;
        this.f14j = bitmap;
        this.f15k = uri;
        this.f16l = bundle;
        this.f17m = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m5a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p001v4.media.C0009d.m30e(r8)
            r1.mo17a(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0009d.m32g(r8)
            r1.mo21c(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0009d.m31f(r8)
            r1.mo20b(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0009d.m24a(r8)
            r1.mo16a(r2)
            android.graphics.Bitmap r2 = android.support.p001v4.media.C0009d.m28c(r8)
            r1.mo13a(r2)
            android.net.Uri r2 = android.support.p001v4.media.C0009d.m29d(r8)
            r1.mo14a(r2)
            android.os.Bundle r2 = android.support.p001v4.media.C0009d.m27b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p001v4.media.session.MediaSessionCompat.m52a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.mo15a(r0)
            if (r4 == 0) goto L_0x006d
            r1.mo19b(r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.p001v4.media.C0011e.m42a(r8)
            r1.mo19b(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo18a()
            r0.f18n = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m5a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo7a() {
        if (this.f18n != null || VERSION.SDK_INT < 21) {
            return this.f18n;
        }
        Object a = C0010a.m33a();
        C0010a.m39a(a, this.f10f);
        C0010a.m41c(a, this.f11g);
        C0010a.m40b(a, this.f12h);
        C0010a.m38a(a, this.f13i);
        C0010a.m35a(a, this.f14j);
        C0010a.m36a(a, this.f15k);
        Bundle bundle = this.f16l;
        if (VERSION.SDK_INT < 23 && this.f17m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f17m);
        }
        C0010a.m37a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0012a.m43a(a, this.f17m);
        }
        Object a2 = C0010a.m34a(a);
        this.f18n = a2;
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11g);
        String str = ", ";
        sb.append(str);
        sb.append(this.f12h);
        sb.append(str);
        sb.append(this.f13i);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f10f);
            TextUtils.writeToParcel(this.f11g, parcel, i);
            TextUtils.writeToParcel(this.f12h, parcel, i);
            TextUtils.writeToParcel(this.f13i, parcel, i);
            parcel.writeParcelable(this.f14j, i);
            parcel.writeParcelable(this.f15k, i);
            parcel.writeBundle(this.f16l);
            parcel.writeParcelable(this.f17m, i);
            return;
        }
        C0009d.m26a(mo7a(), parcel, i);
    }
}
