package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0883e;
import com.bumptech.glide.p029t.C1309j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.t */
public class C1017t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final C3318e<List<Throwable>> f3725a;

    /* renamed from: b */
    private final List<? extends C0987i<Data, ResourceType, Transcode>> f3726b;

    /* renamed from: c */
    private final String f3727c;

    public C1017t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C0987i<Data, ResourceType, Transcode>> list, C3318e<List<Throwable>> eVar) {
        this.f3725a = eVar;
        C1309j.m6152a(list);
        this.f3726b = list;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f3727c = sb.toString();
    }

    /* renamed from: a */
    private C1020v<Transcode> m5060a(C0883e<Data> eVar, C0873i iVar, int i, int i2, C0988a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f3726b.size();
        C1020v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C0987i) this.f3726b.get(i3)).mo4838a(eVar, i, i2, iVar, aVar);
            } catch (C1013q e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1013q(this.f3727c, (List<Throwable>) new ArrayList<Throwable>(list2));
    }

    /* renamed from: a */
    public C1020v<Transcode> mo4906a(C0883e<Data> eVar, C0873i iVar, int i, int i2, C0988a<ResourceType> aVar) {
        Object a = this.f3725a.mo5387a();
        C1309j.m6149a(a);
        List list = (List) a;
        try {
            C1020v<Transcode> a2 = m5060a(eVar, iVar, i, i2, aVar, list);
            return a2;
        } finally {
            this.f3725a.mo5388a(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.f3726b.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
