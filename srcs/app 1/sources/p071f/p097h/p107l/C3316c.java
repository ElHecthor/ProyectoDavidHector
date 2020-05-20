package p071f.p097h.p107l;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: f.h.l.c */
public class C3316c {
    /* renamed from: a */
    public static int m13531a(Object... objArr) {
        return VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m13532a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
