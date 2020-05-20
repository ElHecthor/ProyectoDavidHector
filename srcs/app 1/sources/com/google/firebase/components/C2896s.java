package com.google.firebase.components;

import com.google.firebase.p061h.C2924a;

/* renamed from: com.google.firebase.components.s */
public class C2896s<T> implements C2924a<T> {

    /* renamed from: c */
    private static final Object f8375c = new Object();

    /* renamed from: a */
    private volatile Object f8376a = f8375c;

    /* renamed from: b */
    private volatile C2924a<T> f8377b;

    public C2896s(C2924a<T> aVar) {
        this.f8377b = aVar;
    }

    public T get() {
        T t = this.f8376a;
        if (t == f8375c) {
            synchronized (this) {
                t = this.f8376a;
                if (t == f8375c) {
                    t = this.f8377b.get();
                    this.f8376a = t;
                    this.f8377b = null;
                }
            }
        }
        return t;
    }
}
