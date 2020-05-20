package com.google.firebase.components;

import com.google.firebase.p059f.C2915a;
import com.google.firebase.p059f.C2916b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.q */
final /* synthetic */ class C2894q implements Runnable {

    /* renamed from: f */
    private final Entry f8370f;

    /* renamed from: g */
    private final C2915a f8371g;

    private C2894q(Entry entry, C2915a aVar) {
        this.f8370f = entry;
        this.f8371g = aVar;
    }

    /* renamed from: a */
    public static Runnable m11979a(Entry entry, C2915a aVar) {
        return new C2894q(entry, aVar);
    }

    public void run() {
        ((C2916b) this.f8370f.getKey()).mo9529a(this.f8371g);
    }
}
