package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0858c;

/* renamed from: com.bumptech.glide.load.o.j */
public abstract class C0989j {

    /* renamed from: a */
    public static final C0989j f3638a = new C0991b();

    /* renamed from: b */
    public static final C0989j f3639b = new C0992c();

    /* renamed from: c */
    public static final C0989j f3640c = new C0994e();

    /* renamed from: com.bumptech.glide.load.o.j$a */
    class C0990a extends C0989j {
        C0990a() {
        }

        /* renamed from: a */
        public boolean mo4840a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo4841a(C0856a aVar) {
            return aVar == C0856a.REMOTE;
        }

        /* renamed from: a */
        public boolean mo4842a(boolean z, C0856a aVar, C0858c cVar) {
            return (aVar == C0856a.RESOURCE_DISK_CACHE || aVar == C0856a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo4843b() {
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    class C0991b extends C0989j {
        C0991b() {
        }

        /* renamed from: a */
        public boolean mo4840a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4841a(C0856a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4842a(boolean z, C0856a aVar, C0858c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4843b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$c */
    class C0992c extends C0989j {
        C0992c() {
        }

        /* renamed from: a */
        public boolean mo4840a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo4841a(C0856a aVar) {
            return (aVar == C0856a.DATA_DISK_CACHE || aVar == C0856a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: a */
        public boolean mo4842a(boolean z, C0856a aVar, C0858c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4843b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$d */
    class C0993d extends C0989j {
        C0993d() {
        }

        /* renamed from: a */
        public boolean mo4840a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4841a(C0856a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4842a(boolean z, C0856a aVar, C0858c cVar) {
            return (aVar == C0856a.RESOURCE_DISK_CACHE || aVar == C0856a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo4843b() {
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$e */
    class C0994e extends C0989j {
        C0994e() {
        }

        /* renamed from: a */
        public boolean mo4840a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo4841a(C0856a aVar) {
            return aVar == C0856a.REMOTE;
        }

        /* renamed from: a */
        public boolean mo4842a(boolean z, C0856a aVar, C0858c cVar) {
            return ((z && aVar == C0856a.DATA_DISK_CACHE) || aVar == C0856a.LOCAL) && cVar == C0858c.TRANSFORMED;
        }

        /* renamed from: b */
        public boolean mo4843b() {
            return true;
        }
    }

    static {
        new C0990a();
        new C0993d();
    }

    /* renamed from: a */
    public abstract boolean mo4840a();

    /* renamed from: a */
    public abstract boolean mo4841a(C0856a aVar);

    /* renamed from: a */
    public abstract boolean mo4842a(boolean z, C0856a aVar, C0858c cVar);

    /* renamed from: b */
    public abstract boolean mo4843b();
}
