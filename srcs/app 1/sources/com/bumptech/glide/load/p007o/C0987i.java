package com.bumptech.glide.load.p007o;

import android.util.Log;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p005n.C0883e;
import com.bumptech.glide.load.p013q.p019i.C1213e;
import com.bumptech.glide.p029t.C1309j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.i */
public class C0987i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f3633a;

    /* renamed from: b */
    private final List<? extends C0875k<DataType, ResourceType>> f3634b;

    /* renamed from: c */
    private final C1213e<ResourceType, Transcode> f3635c;

    /* renamed from: d */
    private final C3318e<List<Throwable>> f3636d;

    /* renamed from: e */
    private final String f3637e;

    /* renamed from: com.bumptech.glide.load.o.i$a */
    interface C0988a<ResourceType> {
        /* renamed from: a */
        C1020v<ResourceType> mo4828a(C1020v<ResourceType> vVar);
    }

    public C0987i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C0875k<DataType, ResourceType>> list, C1213e<ResourceType, Transcode> eVar, C3318e<List<Throwable>> eVar2) {
        this.f3633a = cls;
        this.f3634b = list;
        this.f3635c = eVar;
        this.f3636d = eVar2;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f3637e = sb.toString();
    }

    /* renamed from: a */
    private C1020v<ResourceType> m4958a(C0883e<DataType> eVar, int i, int i2, C0873i iVar) {
        Object a = this.f3636d.mo5387a();
        C1309j.m6149a(a);
        List list = (List) a;
        try {
            C1020v<ResourceType> a2 = m4959a(eVar, i, i2, iVar, list);
            return a2;
        } finally {
            this.f3636d.mo5388a(list);
        }
    }

    /* renamed from: a */
    private C1020v<ResourceType> m4959a(C0883e<DataType> eVar, int i, int i2, C0873i iVar, List<Throwable> list) {
        int size = this.f3634b.size();
        C1020v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C0875k kVar = (C0875k) this.f3634b.get(i3);
            try {
                if (kVar.mo4632a(eVar.mo4647a(), iVar)) {
                    vVar = kVar.mo4631a(eVar.mo4647a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                String str = "DecodePath";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(kVar);
                    Log.v(str, sb.toString(), e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1013q(this.f3637e, (List<Throwable>) new ArrayList<Throwable>(list));
    }

    /* renamed from: a */
    public C1020v<Transcode> mo4838a(C0883e<DataType> eVar, int i, int i2, C0873i iVar, C0988a<ResourceType> aVar) {
        return this.f3635c.mo5137a(aVar.mo4828a(m4958a(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.f3633a);
        sb.append(", decoders=");
        sb.append(this.f3634b);
        sb.append(", transcoder=");
        sb.append(this.f3635c);
        sb.append('}');
        return sb.toString();
    }
}
