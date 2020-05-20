package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p071f.p097h.p098e.C3236a;

/* renamed from: androidx.core.app.n */
public final class C0369n implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f1720f = new ArrayList<>();

    /* renamed from: g */
    private final Context f1721g;

    /* renamed from: androidx.core.app.n$a */
    public interface C0370a {
        /* renamed from: f */
        Intent mo239f();
    }

    private C0369n(Context context) {
        this.f1721g = context;
    }

    /* renamed from: a */
    public static C0369n m1877a(Context context) {
        return new C0369n(context);
    }

    /* renamed from: a */
    public C0369n mo2228a(Activity activity) {
        Intent f = activity instanceof C0370a ? ((C0370a) activity).mo239f() : null;
        if (f == null) {
            f = C0356g.m1801a(activity);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(this.f1721g.getPackageManager());
            }
            mo2229a(component);
            mo2230a(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0369n mo2229a(ComponentName componentName) {
        int size = this.f1720f.size();
        try {
            Context context = this.f1721g;
            while (true) {
                Intent a = C0356g.m1802a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1720f.add(size, a);
                context = this.f1721g;
                componentName = a.getComponent();
            }
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0369n mo2230a(Intent intent) {
        this.f1720f.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo2231a(Bundle bundle) {
        if (!this.f1720f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1720f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C3236a.m13268a(this.f1721g, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1721g.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: c */
    public void mo2232c() {
        mo2231a((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1720f.iterator();
    }
}
