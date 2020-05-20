package com.bumptech.glide.load.p011p;

import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p028s.C1295b;

/* renamed from: com.bumptech.glide.load.p.v */
public class C1091v<Model> implements C1069n<Model, Model> {

    /* renamed from: a */
    private static final C1091v<?> f3839a = new C1091v<>();

    /* renamed from: com.bumptech.glide.load.p.v$a */
    public static class C1092a<Model> implements C1071o<Model, Model> {

        /* renamed from: a */
        private static final C1092a<?> f3840a = new C1092a<>();

        /* renamed from: b */
        public static <T> C1092a<T> m5279b() {
            return f3840a;
        }

        /* renamed from: a */
        public C1069n<Model, Model> mo4574a(C1077r rVar) {
            return C1091v.m5276a();
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.v$b */
    private static class C1093b<Model> implements C0881d<Model> {

        /* renamed from: f */
        private final Model f3841f;

        C1093b(Model model) {
            this.f3841f = model;
        }

        /* renamed from: a */
        public Class<Model> mo4563a() {
            return this.f3841f.getClass();
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super Model> aVar) {
            aVar.mo4646a(this.f3841f);
        }

        /* renamed from: b */
        public void mo4567b() {
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return C0856a.LOCAL;
        }

        public void cancel() {
        }
    }

    /* renamed from: a */
    public static <T> C1091v<T> m5276a() {
        return f3839a;
    }

    /* renamed from: a */
    public C1070a<Model> mo4571a(Model model, int i, int i2, C0873i iVar) {
        return new C1070a<>(new C1295b(model), new C1093b(model));
    }

    /* renamed from: a */
    public boolean mo4573a(Model model) {
        return true;
    }
}
