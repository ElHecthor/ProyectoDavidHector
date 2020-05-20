package p242i.p243a.p244a.p245a.p246n.p253f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import p242i.p243a.p244a.p245a.C4792i;

/* renamed from: i.a.a.a.n.f.d */
public class C4904d implements C4903c {

    /* renamed from: a */
    private final SharedPreferences f12751a;

    /* renamed from: b */
    private final String f12752b;

    /* renamed from: c */
    private final Context f12753c;

    public C4904d(Context context, String str) {
        if (context != null) {
            this.f12753c = context;
            this.f12752b = str;
            this.f12751a = context.getSharedPreferences(str, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C4904d(C4792i iVar) {
        this(iVar.mo13833i(), iVar.getClass().getName());
    }

    /* renamed from: a */
    public Editor mo14052a() {
        return this.f12751a.edit();
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo14053a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public SharedPreferences get() {
        return this.f12751a;
    }
}
