package com.bumptech.glide.load.p011p;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.p.j */
public final class C1059j implements C1056h {

    /* renamed from: b */
    private final Map<String, List<C1058i>> f3790b;

    /* renamed from: c */
    private volatile Map<String, String> f3791c;

    /* renamed from: com.bumptech.glide.load.p.j$a */
    public static final class C1060a {

        /* renamed from: b */
        private static final String f3792b = m5190b();

        /* renamed from: c */
        private static final Map<String, List<C1058i>> f3793c;

        /* renamed from: a */
        private Map<String, List<C1058i>> f3794a = f3793c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f3792b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1061b(f3792b)));
            }
            f3793c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m5190b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1059j mo4946a() {
            return new C1059j(this.f3794a);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.j$b */
    static final class C1061b implements C1058i {

        /* renamed from: a */
        private final String f3795a;

        C1061b(String str) {
            this.f3795a = str;
        }

        /* renamed from: a */
        public String mo4942a() {
            return this.f3795a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1061b)) {
                return false;
            }
            return this.f3795a.equals(((C1061b) obj).f3795a);
        }

        public int hashCode() {
            return this.f3795a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f3795a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    C1059j(Map<String, List<C1058i>> map) {
        this.f3790b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    private String m5187a(List<C1058i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((C1058i) list.get(i)).mo4942a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private Map<String, String> m5188b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f3790b.entrySet()) {
            String a = m5187a((List) entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo4941a() {
        if (this.f3791c == null) {
            synchronized (this) {
                if (this.f3791c == null) {
                    this.f3791c = Collections.unmodifiableMap(m5188b());
                }
            }
        }
        return this.f3791c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1059j)) {
            return false;
        }
        return this.f3790b.equals(((C1059j) obj).f3790b);
    }

    public int hashCode() {
        return this.f3790b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f3790b);
        sb.append('}');
        return sb.toString();
    }
}
