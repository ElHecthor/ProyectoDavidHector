package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
public final class C2373l7 {
    /* renamed from: a */
    public static String m9598a(String str, String[] strArr, String[] strArr2) {
        C2148s.m8834a(strArr);
        C2148s.m8834a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            boolean z = (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
            if (z) {
                return strArr2[i];
            }
        }
        return null;
    }
}
