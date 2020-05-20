package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C2141q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static final class C2142a {

        /* renamed from: a */
        private final List<String> f6100a;

        /* renamed from: b */
        private final Object f6101b;

        private C2142a(Object obj) {
            C2148s.m8834a(obj);
            this.f6101b = obj;
            this.f6100a = new ArrayList();
        }

        /* renamed from: a */
        public final C2142a mo6935a(String str, Object obj) {
            List<String> list = this.f6100a;
            C2148s.m8834a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6101b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f6100a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f6100a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m8821a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C2142a m8822a(Object obj) {
        return new C2142a(obj);
    }

    /* renamed from: a */
    public static boolean m8823a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
