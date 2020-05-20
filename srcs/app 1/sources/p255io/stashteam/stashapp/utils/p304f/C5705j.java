package p255io.stashteam.stashapp.utils.p304f;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import p308k.C5797g;
import p308k.C5802l;
import p308k.C5809q;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: io.stashteam.stashapp.utils.f.j */
public final class C5705j {

    /* renamed from: io.stashteam.stashapp.utils.f.j$a */
    static final class C5706a extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ Fragment f14791g;

        /* renamed from: h */
        final /* synthetic */ String f14792h;

        C5706a(Fragment fragment, String str) {
            this.f14791g = fragment;
            this.f14792h = str;
            super(0);
        }

        public final T invoke() {
            Bundle l = this.f14791g.mo2562l();
            T t = l != null ? l.get(this.f14792h) : null;
            if (t != null) {
                return t;
            }
            throw new C5809q("null cannot be cast to non-null type T");
        }
    }

    /* renamed from: io.stashteam.stashapp.utils.f.j$b */
    static final class C5707b extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ Fragment f14793g;

        /* renamed from: h */
        final /* synthetic */ String f14794h;

        /* renamed from: i */
        final /* synthetic */ Object f14795i;

        C5707b(Fragment fragment, String str, Object obj) {
            this.f14793g = fragment;
            this.f14794h = str;
            this.f14795i = obj;
            super(0);
        }

        public final T invoke() {
            Bundle l = this.f14793g.mo2562l();
            T t = null;
            T t2 = l != null ? l.get(this.f14794h) : null;
            if (t2 instanceof Object) {
                t = t2;
            }
            return t != null ? t : this.f14795i;
        }
    }

    /* renamed from: a */
    public static final Fragment m21798a(Fragment fragment, C5802l<String, ? extends Serializable>... lVarArr) {
        C5942k.m22327b(fragment, "$this$withArguments");
        C5942k.m22327b(lVarArr, "arguments");
        Bundle bundle = new Bundle();
        for (C5802l<String, ? extends Serializable> lVar : lVarArr) {
            bundle.putSerializable((String) lVar.mo15420c(), (Serializable) lVar.mo15421d());
        }
        fragment.mo2566m(bundle);
        return fragment;
    }

    /* renamed from: a */
    public static final <T> C5797g<T> m21799a(Fragment fragment, String str) {
        C5942k.m22327b(fragment, "$this$argument");
        C5942k.m22327b(str, "key");
        return C5799i.m22044a(new C5706a(fragment, str));
    }

    /* renamed from: a */
    public static final <T> C5797g<T> m21800a(Fragment fragment, String str, T t) {
        C5942k.m22327b(fragment, "$this$argument");
        C5942k.m22327b(str, "key");
        return C5799i.m22044a(new C5707b(fragment, str, t));
    }
}
