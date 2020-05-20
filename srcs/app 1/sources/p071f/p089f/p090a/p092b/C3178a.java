package p071f.p089f.p090a.p092b;

import android.view.View;

/* renamed from: f.f.a.b.a */
public class C3178a {
    /* renamed from: a */
    public static String m12862a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
