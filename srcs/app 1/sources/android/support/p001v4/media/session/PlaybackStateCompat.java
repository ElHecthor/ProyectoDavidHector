package android.support.p001v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C0020a();

    /* renamed from: f */
    final int f48f;

    /* renamed from: g */
    final long f49g;

    /* renamed from: h */
    final long f50h;

    /* renamed from: i */
    final float f51i;

    /* renamed from: j */
    final long f52j;

    /* renamed from: k */
    final int f53k;

    /* renamed from: l */
    final CharSequence f54l;

    /* renamed from: m */
    final long f55m;

    /* renamed from: n */
    List<CustomAction> f56n;

    /* renamed from: o */
    final long f57o;

    /* renamed from: p */
    final Bundle f58p;

    /* renamed from: q */
    private Object f59q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C0019a();

        /* renamed from: f */
        private final String f60f;

        /* renamed from: g */
        private final CharSequence f61g;

        /* renamed from: h */
        private final int f62h;

        /* renamed from: i */
        private final Bundle f63i;

        /* renamed from: j */
        private Object f64j;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0019a implements Creator<CustomAction> {
            C0019a() {
            }

            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f60f = parcel.readString();
            this.f61g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f62h = parcel.readInt();
            this.f63i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f60f = str;
            this.f61g = charSequence;
            this.f62h = i;
            this.f63i = bundle;
        }

        /* renamed from: a */
        public static CustomAction m59a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0037a.m129a(obj), C0037a.m132d(obj), C0037a.m131c(obj), C0037a.m130b(obj));
            customAction.f64j = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f61g);
            sb.append(", mIcon=");
            sb.append(this.f62h);
            sb.append(", mExtras=");
            sb.append(this.f63i);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f60f);
            TextUtils.writeToParcel(this.f61g, parcel, i);
            parcel.writeInt(this.f62h);
            parcel.writeBundle(this.f63i);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0020a implements Creator<PlaybackStateCompat> {
        C0020a() {
        }

        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f48f = i;
        this.f49g = j;
        this.f50h = j2;
        this.f51i = f;
        this.f52j = j3;
        this.f53k = i2;
        this.f54l = charSequence;
        this.f55m = j4;
        this.f56n = new ArrayList(list);
        this.f57o = j5;
        this.f58p = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f48f = parcel.readInt();
        this.f49g = parcel.readLong();
        this.f51i = parcel.readFloat();
        this.f55m = parcel.readLong();
        this.f50h = parcel.readLong();
        this.f52j = parcel.readLong();
        this.f54l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f56n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f57o = parcel.readLong();
        this.f58p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f53k = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m58a(Object obj) {
        List list;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0036g.m123d(obj);
        if (d != null) {
            ArrayList arrayList = new ArrayList(d.size());
            for (Object a : d) {
                arrayList.add(CustomAction.m59a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0038h.m133a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0036g.m128i(obj), C0036g.m127h(obj), C0036g.m122c(obj), C0036g.m126g(obj), C0036g.m120a(obj), 0, C0036g.m124e(obj), C0036g.m125f(obj), list, C0036g.m121b(obj), bundle);
        playbackStateCompat.f59q = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f48f);
        sb.append(", position=");
        sb.append(this.f49g);
        sb.append(", buffered position=");
        sb.append(this.f50h);
        sb.append(", speed=");
        sb.append(this.f51i);
        sb.append(", updated=");
        sb.append(this.f55m);
        sb.append(", actions=");
        sb.append(this.f52j);
        sb.append(", error code=");
        sb.append(this.f53k);
        sb.append(", error message=");
        sb.append(this.f54l);
        sb.append(", custom actions=");
        sb.append(this.f56n);
        sb.append(", active item id=");
        sb.append(this.f57o);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48f);
        parcel.writeLong(this.f49g);
        parcel.writeFloat(this.f51i);
        parcel.writeLong(this.f55m);
        parcel.writeLong(this.f50h);
        parcel.writeLong(this.f52j);
        TextUtils.writeToParcel(this.f54l, parcel, i);
        parcel.writeTypedList(this.f56n);
        parcel.writeLong(this.f57o);
        parcel.writeBundle(this.f58p);
        parcel.writeInt(this.f53k);
    }
}
