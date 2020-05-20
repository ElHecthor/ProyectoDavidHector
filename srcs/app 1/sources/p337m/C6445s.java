package p337m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p308k.C5802l;
import p308k.C5808p;
import p308k.C5809q;
import p308k.p310b0.C5729b;
import p308k.p323z.p325d.C5931b;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;
import p337m.p338f0.C6250b;

/* renamed from: m.s */
public final class C6445s implements Iterable<C5802l<? extends String, ? extends String>>, C5954a {

    /* renamed from: g */
    public static final C6447b f15950g = new C6447b(null);

    /* renamed from: f */
    private final String[] f15951f;

    /* renamed from: m.s$a */
    public static final class C6446a {

        /* renamed from: a */
        private final List<String> f15952a = new ArrayList(20);

        /* renamed from: a */
        public final C6446a mo16612a(String str) {
            C5942k.m22327b(str, "line");
            int a = C5788q.m21984a((CharSequence) str, ':', 1, false, 4, (Object) null);
            String str2 = "(this as java.lang.String).substring(startIndex)";
            if (a != -1) {
                String substring = str.substring(0, a);
                C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(a + 1);
                C5942k.m22324a((Object) substring2, str2);
                mo16617b(substring, substring2);
            } else {
                String str3 = "";
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    C5942k.m22324a((Object) str, str2);
                }
                mo16617b(str3, str);
            }
            return this;
        }

        /* renamed from: a */
        public final C6446a mo16613a(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            C6445s.f15950g.m24271a(str);
            C6445s.f15950g.m24272a(str2, str);
            mo16617b(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C6445s mo16614a() {
            Object[] array = this.f15952a.toArray(new String[0]);
            if (array != null) {
                return new C6445s((String[]) array, null);
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: b */
        public final List<String> mo16615b() {
            return this.f15952a;
        }

        /* renamed from: b */
        public final C6446a mo16616b(String str) {
            C5942k.m22327b(str, "name");
            int i = 0;
            while (i < this.f15952a.size()) {
                if (C5787p.m21979b(str, (String) this.f15952a.get(i), true)) {
                    this.f15952a.remove(i);
                    this.f15952a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: b */
        public final C6446a mo16617b(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            this.f15952a.add(str);
            this.f15952a.add(C5788q.m22032f(str2).toString());
            return this;
        }

        /* renamed from: c */
        public final C6446a mo16618c(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            C6445s.f15950g.m24271a(str);
            C6445s.f15950g.m24272a(str2, str);
            mo16616b(str);
            mo16617b(str, str2);
            return this;
        }
    }

    /* renamed from: m.s$b */
    public static final class C6447b {
        private C6447b() {
        }

        public /* synthetic */ C6447b(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final String m24270a(String[] strArr, String str) {
            C5729b a = C5736g.m21870a(C5736g.m21874c(strArr.length - 2, 0), 2);
            int c = a.mo15363c();
            int d = a.mo15364d();
            int e = a.mo15365e();
            if (e < 0 ? c >= d : c <= d) {
                while (!C5787p.m21979b(str, strArr[c], true)) {
                    if (c != d) {
                        c += e;
                    }
                }
                return strArr[c + 1];
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m24271a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C6250b.m23446a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m24272a(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C6250b.m23446a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* renamed from: a */
        public final C6445s mo16619a(String... strArr) {
            C5942k.m22327b(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        if (strArr2[i] != null) {
                            String str = strArr2[i];
                            if (str != null) {
                                strArr2[i] = C5788q.m22032f(str).toString();
                                i++;
                            } else {
                                throw new C5809q("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    C5729b a = C5736g.m21870a((C5729b) C5736g.m21875d(0, strArr2.length), 2);
                    int c = a.mo15363c();
                    int d = a.mo15364d();
                    int e = a.mo15365e();
                    if (e < 0 ? c >= d : c <= d) {
                        while (true) {
                            String str2 = strArr2[c];
                            String str3 = strArr2[c + 1];
                            m24271a(str2);
                            m24272a(str3, str2);
                            if (c == d) {
                                break;
                            }
                            c += e;
                        }
                    }
                    return new C6445s(strArr2, null);
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private C6445s(String[] strArr) {
        this.f15951f = strArr;
    }

    public /* synthetic */ C6445s(String[] strArr, C5938g gVar) {
        this(strArr);
    }

    /* renamed from: a */
    public static final C6445s m24256a(String... strArr) {
        return f15950g.mo16619a(strArr);
    }

    /* renamed from: a */
    public final String mo16602a(String str) {
        C5942k.m22327b(str, "name");
        return f15950g.m24270a(this.f15951f, str);
    }

    /* renamed from: b */
    public final List<String> mo16603b(String str) {
        C5942k.m22327b(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C5787p.m21979b(str, mo16604c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo16606d(i));
            }
        }
        if (arrayList == null) {
            return C5837l.m22159a();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C5942k.m22324a((Object) unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    /* renamed from: c */
    public final String mo16604c(int i) {
        return this.f15951f[i * 2];
    }

    /* renamed from: c */
    public final C6446a mo16605c() {
        C6446a aVar = new C6446a();
        C5842q.m22170a((Collection<? super T>) aVar.mo16615b(), (T[]) this.f15951f);
        return aVar;
    }

    /* renamed from: d */
    public final String mo16606d(int i) {
        return this.f15951f[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6445s) && Arrays.equals(this.f15951f, ((C6445s) obj).f15951f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15951f);
    }

    public Iterator<C5802l<String, String>> iterator() {
        int size = size();
        C5802l[] lVarArr = new C5802l[size];
        for (int i = 0; i < size; i++) {
            lVarArr[i] = C5808p.m22056a(mo16604c(i), mo16606d(i));
        }
        return C5931b.m22300a(lVarArr);
    }

    public final int size() {
        return this.f15951f.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(mo16604c(i));
            sb.append(": ");
            sb.append(mo16606d(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
