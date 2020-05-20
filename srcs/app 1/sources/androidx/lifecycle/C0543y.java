package androidx.lifecycle;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry.C0756b;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: androidx.lifecycle.y */
public final class C0543y {
    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Long.TYPE;
        Class<Binder> cls5 = Binder.class;
        Class<Bundle> cls6 = Bundle.class;
        Class cls7 = Byte.TYPE;
        Class cls8 = Character.TYPE;
        Class<CharSequence> cls9 = CharSequence.class;
        Class<CharSequence[]> cls10 = CharSequence[].class;
        Class<ArrayList> cls11 = ArrayList.class;
        Class cls12 = Float.TYPE;
        Class<Parcelable> cls13 = Parcelable.class;
        Class<Parcelable[]> cls14 = Parcelable[].class;
        Class<Serializable> cls15 = Serializable.class;
        Class cls16 = Short.TYPE;
        Class<SparseArray> cls17 = SparseArray.class;
        if (VERSION.SDK_INT >= 21) {
            Class<Size> cls18 = Size.class;
        } else {
            Class cls19 = Integer.TYPE;
        }
        if (VERSION.SDK_INT >= 21) {
            Class<SizeF> cls20 = SizeF.class;
        } else {
            Class cls21 = Integer.TYPE;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0756b mo3085a() {
        throw null;
    }
}
