package p308k.p323z.p325d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p308k.C5737c;
import p308k.C5802l;
import p308k.C5808p;
import p308k.p311c0.C5739b;
import p308k.p314u.C5835j;
import p308k.p323z.C5905a;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5908b;
import p308k.p323z.p324c.C5909c;
import p308k.p323z.p324c.C5910d;
import p308k.p323z.p324c.C5911e;
import p308k.p323z.p324c.C5912f;
import p308k.p323z.p324c.C5913g;
import p308k.p323z.p324c.C5914h;
import p308k.p323z.p324c.C5915i;
import p308k.p323z.p324c.C5916j;
import p308k.p323z.p324c.C5917k;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5919m;
import p308k.p323z.p324c.C5920n;
import p308k.p323z.p324c.C5921o;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p324c.C5924r;
import p308k.p323z.p324c.C5925s;
import p308k.p323z.p324c.C5926t;
import p308k.p323z.p324c.C5927u;
import p308k.p323z.p324c.C5928v;
import p308k.p323z.p324c.C5929w;

/* renamed from: k.z.d.e */
public final class C5935e implements C5739b<Object>, C5934d {

    /* renamed from: b */
    private static final Map<Class<? extends C5737c<?>>, Integer> f14934b;

    /* renamed from: c */
    private static final HashMap<String, String> f14935c;

    /* renamed from: d */
    private static final HashMap<String, String> f14936d;

    /* renamed from: e */
    private static final HashMap<String, String> f14937e;

    /* renamed from: a */
    private final Class<?> f14938a;

    /* renamed from: k.z.d.e$a */
    public static final class C5936a {
        private C5936a() {
        }

        public /* synthetic */ C5936a(C5938g gVar) {
            this();
        }
    }

    static {
        new C5936a(null);
        int i = 0;
        List b = C5837l.m22162b((T[]) new Class[]{C5907a.class, C5918l.class, C5922p.class, C5923q.class, C5924r.class, C5925s.class, C5926t.class, C5927u.class, C5928v.class, C5929w.class, C5908b.class, C5909c.class, C5910d.class, C5911e.class, C5912f.class, C5913g.class, C5914h.class, C5915i.class, C5916j.class, C5917k.class, C5919m.class, C5920n.class, C5921o.class});
        ArrayList arrayList = new ArrayList(C5838m.m22166a(b, 10));
        for (Object next : b) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(C5808p.m22056a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C5835j.m22144b();
                throw null;
            }
        }
        f14934b = C5823c0.m22074a((Iterable<? extends C5802l<? extends K, ? extends V>>) arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        String str = "kotlin.Boolean";
        hashMap.put("boolean", str);
        String str2 = "kotlin.Char";
        hashMap.put("char", str2);
        String str3 = "kotlin.Byte";
        hashMap.put("byte", str3);
        String str4 = "kotlin.Short";
        hashMap.put("short", str4);
        String str5 = "kotlin.Int";
        hashMap.put("int", str5);
        String str6 = "kotlin.Float";
        hashMap.put("float", str6);
        String str7 = "kotlin.Long";
        hashMap.put("long", str7);
        String str8 = "kotlin.Double";
        hashMap.put("double", str8);
        f14935c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", str);
        hashMap2.put("java.lang.Character", str2);
        hashMap2.put("java.lang.Byte", str3);
        hashMap2.put("java.lang.Short", str4);
        hashMap2.put("java.lang.Integer", str5);
        hashMap2.put("java.lang.Float", str6);
        hashMap2.put("java.lang.Long", str7);
        hashMap2.put("java.lang.Double", str8);
        f14936d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f14935c);
        hashMap3.putAll(f14936d);
        Collection<String> values = f14935c.values();
        C5942k.m22324a((Object) values, "primitiveFqNames.values");
        for (String str9 : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C5942k.m22324a((Object) str9, "kotlinName");
            sb.append(C5788q.m21992a(str9, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str9);
            sb3.append(".Companion");
            C5802l a = C5808p.m22056a(sb2, sb3.toString());
            hashMap3.put(a.mo15420c(), a.mo15421d());
        }
        for (Entry entry : f14934b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            String name = cls.getName();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("kotlin.Function");
            sb4.append(intValue);
            hashMap3.put(name, sb4.toString());
        }
        f14937e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5821b0.m22068a(hashMap3.size()));
        for (Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C5788q.m21992a((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public C5935e(Class<?> cls) {
        C5942k.m22327b(cls, "jClass");
        this.f14938a = cls;
    }

    /* renamed from: a */
    public Class<?> mo15610a() {
        return this.f14938a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5935e) && C5942k.m22326a((Object) C5905a.m22296b(this), (Object) C5905a.m22296b((C5739b) obj));
    }

    public int hashCode() {
        return C5905a.m22296b(this).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15610a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
