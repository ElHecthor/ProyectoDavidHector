package p255io.stashteam.stashapp.utils.p304f;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import p308k.C5797g;
import p308k.C5809q;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: io.stashteam.stashapp.utils.f.a */
public final class C5693a {

    /* renamed from: io.stashteam.stashapp.utils.f.a$a */
    static final class C5694a extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ Activity f14785g;

        /* renamed from: h */
        final /* synthetic */ String f14786h;

        C5694a(Activity activity, String str) {
            this.f14785g = activity;
            this.f14786h = str;
            super(0);
        }

        public final T invoke() {
            Intent intent = this.f14785g.getIntent();
            C5942k.m22324a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            T t = extras != null ? extras.get(this.f14786h) : null;
            if (t != null) {
                return t;
            }
            throw new C5809q("null cannot be cast to non-null type T");
        }
    }

    /* renamed from: io.stashteam.stashapp.utils.f.a$b */
    static final class C5695b extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ Activity f14787g;

        /* renamed from: h */
        final /* synthetic */ String f14788h;

        /* renamed from: i */
        final /* synthetic */ Object f14789i;

        C5695b(Activity activity, String str, Object obj) {
            this.f14787g = activity;
            this.f14788h = str;
            this.f14789i = obj;
            super(0);
        }

        public final T invoke() {
            Intent intent = this.f14787g.getIntent();
            C5942k.m22324a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            T t = null;
            T t2 = extras != null ? extras.get(this.f14788h) : null;
            if (t2 instanceof Object) {
                t = t2;
            }
            return t != null ? t : this.f14789i;
        }
    }

    /* renamed from: a */
    public static final <T> C5797g<T> m21776a(Activity activity, String str) {
        C5942k.m22327b(activity, "$this$argument");
        C5942k.m22327b(str, "key");
        return C5799i.m22044a(new C5694a(activity, str));
    }

    /* renamed from: a */
    public static final <T> C5797g<T> m21777a(Activity activity, String str, T t) {
        C5942k.m22327b(activity, "$this$argument");
        C5942k.m22327b(str, "key");
        return C5799i.m22044a(new C5695b(activity, str, t));
    }

    /* renamed from: a */
    public static final void m21778a(Activity activity, int i) {
        C5942k.m22327b(activity, "$this$showToast");
        Toast.makeText(activity, i, 0).show();
    }
}
