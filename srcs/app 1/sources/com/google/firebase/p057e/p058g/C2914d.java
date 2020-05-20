package com.google.firebase.p057e.p058g;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.p057e.C2904b;
import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;
import com.google.firebase.p057e.C2907e;
import com.google.firebase.p057e.C2908f;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.e.g.d */
final class C2914d implements C2906d, C2908f {

    /* renamed from: a */
    private C2914d f8401a = null;

    /* renamed from: b */
    private boolean f8402b = true;

    /* renamed from: c */
    private final JsonWriter f8403c;

    /* renamed from: d */
    private final Map<Class<?>, C2905c<?>> f8404d;

    /* renamed from: e */
    private final Map<Class<?>, C2907e<?>> f8405e;

    C2914d(Writer writer, Map<Class<?>, C2905c<?>> map, Map<Class<?>, C2907e<?>> map2) {
        this.f8403c = new JsonWriter(writer);
        this.f8404d = map;
        this.f8405e = map2;
    }

    /* renamed from: b */
    private void m12025b() {
        if (this.f8402b) {
            C2914d dVar = this.f8401a;
            if (dVar != null) {
                dVar.m12025b();
                this.f8401a.f8402b = false;
                this.f8401a = null;
                this.f8403c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C2914d mo9596a(int i) {
        m12025b();
        this.f8403c.value((long) i);
        return this;
    }

    /* renamed from: a */
    public C2914d mo9597a(long j) {
        m12025b();
        this.f8403c.value(j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2914d mo9598a(Object obj) {
        if (obj == null) {
            this.f8403c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f8403c.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    mo9599a((byte[]) obj);
                    return this;
                }
                this.f8403c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f8403c.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        mo9597a(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f8403c.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f8403c.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo9598a((Object) numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo9598a(objArr[i]);
                        i++;
                    }
                }
                this.f8403c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                Collection<Object> collection = (Collection) obj;
                this.f8403c.beginArray();
                for (Object a : collection) {
                    mo9598a(a);
                }
                this.f8403c.endArray();
                return this;
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                this.f8403c.beginObject();
                for (Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo9588a((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C2904b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f8403c.endObject();
                return this;
            } else {
                C2905c cVar = (C2905c) this.f8404d.get(obj.getClass());
                if (cVar != null) {
                    this.f8403c.beginObject();
                    cVar.mo6324a(obj, this);
                    this.f8403c.endObject();
                    return this;
                }
                C2907e eVar = (C2907e) this.f8405e.get(obj.getClass());
                if (eVar != null) {
                    eVar.mo9589a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo9590a(((Enum) obj).name());
                    return this;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't find encoder for type ");
                    sb.append(obj.getClass().getCanonicalName());
                    throw new C2904b(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public C2914d m12034a(String str) {
        m12025b();
        this.f8403c.value(str);
        return this;
    }

    /* renamed from: a */
    public C2914d m12035a(String str, int i) {
        m12025b();
        this.f8403c.name(str);
        mo9596a(i);
        return this;
    }

    /* renamed from: a */
    public C2914d m12036a(String str, long j) {
        m12025b();
        this.f8403c.name(str);
        mo9597a(j);
        return this;
    }

    /* renamed from: a */
    public C2914d m12037a(String str, Object obj) {
        m12025b();
        this.f8403c.name(str);
        if (obj == null) {
            this.f8403c.nullValue();
            return this;
        }
        mo9598a(obj);
        return this;
    }

    /* renamed from: a */
    public C2914d m12038a(boolean z) {
        m12025b();
        this.f8403c.value(z);
        return this;
    }

    /* renamed from: a */
    public C2914d mo9599a(byte[] bArr) {
        m12025b();
        if (bArr == null) {
            this.f8403c.nullValue();
        } else {
            this.f8403c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9600a() {
        m12025b();
        this.f8403c.flush();
    }
}
