package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C2141q;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C2187b {
    /* renamed from: a */
    public static <T> boolean m8971a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C2141q.m8823a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* renamed from: a */
    public static <T> T[] m8972a(T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            System.arraycopy(tArr2, 0, copyOf, length2, tArr2.length);
            length2 += tArr2.length;
        }
        return copyOf;
    }
}
