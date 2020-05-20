package androidx.room.p004y;

import android.database.Cursor;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p071f.p133t.p134a.C3537b;

/* renamed from: androidx.room.y.e */
public class C0748e {

    /* renamed from: a */
    public final String f2924a;

    /* renamed from: b */
    public final Map<String, C0749a> f2925b;

    /* renamed from: c */
    public final Set<C0750b> f2926c;

    /* renamed from: d */
    public final Set<C0752d> f2927d;

    /* renamed from: androidx.room.y.e$a */
    public static class C0749a {

        /* renamed from: a */
        public final String f2928a;

        /* renamed from: b */
        public final String f2929b;

        /* renamed from: c */
        public final int f2930c;

        /* renamed from: d */
        public final boolean f2931d;

        /* renamed from: e */
        public final int f2932e;

        /* renamed from: f */
        public final String f2933f;

        /* renamed from: g */
        private final int f2934g;

        public C0749a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f2928a = str;
            this.f2929b = str2;
            this.f2931d = z;
            this.f2932e = i;
            this.f2930c = m4072a(str2);
            this.f2933f = str3;
            this.f2934g = i2;
        }

        /* renamed from: a */
        private static int m4072a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: a */
        public boolean mo4153a() {
            return this.f2932e > 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0749a.class != obj.getClass()) {
                return false;
            }
            C0749a aVar = (C0749a) obj;
            if (VERSION.SDK_INT >= 20) {
                if (this.f2932e != aVar.f2932e) {
                    return false;
                }
            } else if (mo4153a() != aVar.mo4153a()) {
                return false;
            }
            if (!this.f2928a.equals(aVar.f2928a) || this.f2931d != aVar.f2931d) {
                return false;
            }
            if (this.f2934g == 1 && aVar.f2934g == 2) {
                String str = this.f2933f;
                if (str != null && !str.equals(aVar.f2933f)) {
                    return false;
                }
            }
            if (this.f2934g == 2 && aVar.f2934g == 1) {
                String str2 = aVar.f2933f;
                if (str2 != null && !str2.equals(this.f2933f)) {
                    return false;
                }
            }
            int i = this.f2934g;
            if (i != 0 && i == aVar.f2934g) {
                String str3 = this.f2933f;
                if (str3 == null ? aVar.f2933f != null : !str3.equals(aVar.f2933f)) {
                    return false;
                }
            }
            if (this.f2930c != aVar.f2930c) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f2928a.hashCode() * 31) + this.f2930c) * 31) + (this.f2931d ? 1231 : 1237)) * 31) + this.f2932e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f2928a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f2929b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.f2930c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.f2931d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f2932e);
            sb.append(", defaultValue='");
            sb.append(this.f2933f);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.room.y.e$b */
    public static class C0750b {

        /* renamed from: a */
        public final String f2935a;

        /* renamed from: b */
        public final String f2936b;

        /* renamed from: c */
        public final String f2937c;

        /* renamed from: d */
        public final List<String> f2938d;

        /* renamed from: e */
        public final List<String> f2939e;

        public C0750b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f2935a = str;
            this.f2936b = str2;
            this.f2937c = str3;
            this.f2938d = Collections.unmodifiableList(list);
            this.f2939e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0750b.class != obj.getClass()) {
                return false;
            }
            C0750b bVar = (C0750b) obj;
            if (this.f2935a.equals(bVar.f2935a) && this.f2936b.equals(bVar.f2936b) && this.f2937c.equals(bVar.f2937c) && this.f2938d.equals(bVar.f2938d)) {
                return this.f2939e.equals(bVar.f2939e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f2935a.hashCode() * 31) + this.f2936b.hashCode()) * 31) + this.f2937c.hashCode()) * 31) + this.f2938d.hashCode()) * 31) + this.f2939e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ForeignKey{referenceTable='");
            sb.append(this.f2935a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.f2936b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.f2937c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.f2938d);
            sb.append(", referenceColumnNames=");
            sb.append(this.f2939e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.room.y.e$c */
    static class C0751c implements Comparable<C0751c> {

        /* renamed from: f */
        final int f2940f;

        /* renamed from: g */
        final int f2941g;

        /* renamed from: h */
        final String f2942h;

        /* renamed from: i */
        final String f2943i;

        C0751c(int i, int i2, String str, String str2) {
            this.f2940f = i;
            this.f2941g = i2;
            this.f2942h = str;
            this.f2943i = str2;
        }

        /* renamed from: a */
        public int compareTo(C0751c cVar) {
            int i = this.f2940f - cVar.f2940f;
            return i == 0 ? this.f2941g - cVar.f2941g : i;
        }
    }

    /* renamed from: androidx.room.y.e$d */
    public static class C0752d {

        /* renamed from: a */
        public final String f2944a;

        /* renamed from: b */
        public final boolean f2945b;

        /* renamed from: c */
        public final List<String> f2946c;

        public C0752d(String str, boolean z, List<String> list) {
            this.f2944a = str;
            this.f2945b = z;
            this.f2946c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0752d.class != obj.getClass()) {
                return false;
            }
            C0752d dVar = (C0752d) obj;
            if (this.f2945b != dVar.f2945b || !this.f2946c.equals(dVar.f2946c)) {
                return false;
            }
            String str = "index_";
            return this.f2944a.startsWith(str) ? dVar.f2944a.startsWith(str) : this.f2944a.equals(dVar.f2944a);
        }

        public int hashCode() {
            return ((((this.f2944a.startsWith("index_") ? -1184239155 : this.f2944a.hashCode()) * 31) + (this.f2945b ? 1 : 0)) * 31) + this.f2946c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Index{name='");
            sb.append(this.f2944a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.f2945b);
            sb.append(", columns=");
            sb.append(this.f2946c);
            sb.append('}');
            return sb.toString();
        }
    }

    public C0748e(String str, Map<String, C0749a> map, Set<C0750b> set, Set<C0752d> set2) {
        this.f2924a = str;
        this.f2925b = Collections.unmodifiableMap(map);
        this.f2926c = Collections.unmodifiableSet(set);
        this.f2927d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    private static C0752d m4066a(C3537b bVar, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo11223b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0752d dVar = new C0752d(str, z, arrayList);
                    b.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* renamed from: a */
    public static C0748e m4067a(C3537b bVar, String str) {
        return new C0748e(str, m4069b(bVar, str), m4070c(bVar, str), m4071d(bVar, str));
    }

    /* renamed from: a */
    private static List<C0751c> m4068a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0751c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    private static Map<String, C0749a> m4069b(C3537b bVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo11223b(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex("name");
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                int columnIndex5 = b.getColumnIndex("dflt_value");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    C0749a aVar = new C0749a(string, b.getString(columnIndex2), b.getInt(columnIndex3) != 0, b.getInt(columnIndex4), b.getString(columnIndex5), 2);
                    hashMap.put(string, aVar);
                }
            }
            return hashMap;
        } finally {
            b.close();
        }
    }

    /* renamed from: c */
    private static Set<C0750b> m4070c(C3537b bVar, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo11223b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<C0751c> a = m4068a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0751c cVar : a) {
                        if (cVar.f2940f == i2) {
                            arrayList.add(cVar.f2942h);
                            arrayList2.add(cVar.f2943i);
                        }
                    }
                    C0750b bVar2 = new C0750b(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar2);
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private static Set<C0752d> m4071d(C3537b bVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo11223b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("name");
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b.moveToNext()) {
                        if ("c".equals(b.getString(columnIndex2))) {
                            String string = b.getString(columnIndex);
                            boolean z = true;
                            if (b.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0752d a = m4066a(bVar, string, z);
                            if (a == null) {
                                b.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    b.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0748e.class != obj.getClass()) {
            return false;
        }
        C0748e eVar = (C0748e) obj;
        String str = this.f2924a;
        if (str == null ? eVar.f2924a != null : !str.equals(eVar.f2924a)) {
            return false;
        }
        Map<String, C0749a> map = this.f2925b;
        if (map == null ? eVar.f2925b != null : !map.equals(eVar.f2925b)) {
            return false;
        }
        Set<C0750b> set = this.f2926c;
        if (set == null ? eVar.f2926c != null : !set.equals(eVar.f2926c)) {
            return false;
        }
        Set<C0752d> set2 = this.f2927d;
        if (set2 != null) {
            Set<C0752d> set3 = eVar.f2927d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f2924a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0749a> map = this.f2925b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0750b> set = this.f2926c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TableInfo{name='");
        sb.append(this.f2924a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.f2925b);
        sb.append(", foreignKeys=");
        sb.append(this.f2926c);
        sb.append(", indices=");
        sb.append(this.f2927d);
        sb.append('}');
        return sb.toString();
    }
}
