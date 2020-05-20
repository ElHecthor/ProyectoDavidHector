package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0513g;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0523n;
import androidx.savedstate.SavedStateRegistry.C0755a;
import androidx.savedstate.SavedStateRegistry.C0756b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C0513g {

    /* renamed from: f */
    private final C0758b f2947f;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C0753a implements C0756b {

        /* renamed from: a */
        final Set<String> f2948a = new HashSet();

        C0753a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo4171a("androidx.savedstate.Restarter", (C0756b) this);
        }

        /* renamed from: a */
        public Bundle mo4165a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f2948a));
            return bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4166a(String str) {
            this.f2948a.add(str);
        }
    }

    Recreator(C0758b bVar) {
        this.f2947f = bVar;
    }

    /* renamed from: a */
    private void m4075a(String str) {
        try {
            Class asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0755a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((C0755a) declaredConstructor.newInstance(new Object[0])).mo2998a(this.f2947f);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e3);
        }
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        if (aVar == C0515a.ON_CREATE) {
            nVar.mo115a().mo3038b(this);
            Bundle a = this.f2947f.mo117c().mo4167a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m4075a((String) it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
