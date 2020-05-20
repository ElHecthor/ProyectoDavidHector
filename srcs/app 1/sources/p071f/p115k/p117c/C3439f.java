package p071f.p115k.p117c;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import p071f.p097h.p107l.C3321h;
import p071f.p136u.p137a.p138a.C3556b;

/* renamed from: f.k.c.f */
public final class C3439f {

    /* renamed from: a */
    private final C3556b f9725a;

    /* renamed from: b */
    private final char[] f9726b = new char[(this.f9725a.mo11262a() * 2)];

    /* renamed from: c */
    private final C3440a f9727c = new C3440a(1024);

    /* renamed from: d */
    private final Typeface f9728d;

    /* renamed from: f.k.c.f$a */
    static class C3440a {

        /* renamed from: a */
        private final SparseArray<C3440a> f9729a;

        /* renamed from: b */
        private C3429b f9730b;

        private C3440a() {
            this(1);
        }

        C3440a(int i) {
            this.f9729a = new SparseArray<>(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C3429b mo10979a() {
            return this.f9730b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3440a mo10980a(int i) {
            SparseArray<C3440a> sparseArray = this.f9729a;
            if (sparseArray == null) {
                return null;
            }
            return (C3440a) sparseArray.get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10981a(C3429b bVar, int i, int i2) {
            C3440a a = mo10980a(bVar.mo10947a(i));
            if (a == null) {
                a = new C3440a();
                this.f9729a.put(bVar.mo10947a(i), a);
            }
            if (i2 > i) {
                a.mo10981a(bVar, i + 1, i2);
            } else {
                a.f9730b = bVar;
            }
        }
    }

    private C3439f(Typeface typeface, C3556b bVar) {
        this.f9728d = typeface;
        this.f9725a = bVar;
        m14104a(this.f9725a);
    }

    /* renamed from: a */
    public static C3439f m14103a(AssetManager assetManager, String str) {
        return new C3439f(Typeface.createFromAsset(assetManager, str), C3435e.m14090a(assetManager, str));
    }

    /* renamed from: a */
    private void m14104a(C3556b bVar) {
        int a = bVar.mo11262a();
        for (int i = 0; i < a; i++) {
            C3429b bVar2 = new C3429b(this, i);
            Character.toChars(bVar2.mo10952d(), this.f9726b, i * 2);
            mo10973a(bVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10973a(C3429b bVar) {
        C3321h.m13544a(bVar, (Object) "emoji metadata cannot be null");
        C3321h.m13546a(bVar.mo10946a() > 0, (Object) "invalid metadata codepoint length");
        this.f9727c.mo10981a(bVar, 0, bVar.mo10946a() - 1);
    }

    /* renamed from: a */
    public char[] mo10974a() {
        return this.f9726b;
    }

    /* renamed from: b */
    public C3556b mo10975b() {
        return this.f9725a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo10976c() {
        return this.f9725a.mo11265b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3440a mo10977d() {
        return this.f9727c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Typeface mo10978e() {
        return this.f9728d;
    }
}
