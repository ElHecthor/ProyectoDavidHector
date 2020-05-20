package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0513g;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0523n;
import java.util.Map.Entry;
import p071f.p080b.p081a.p083b.C3144b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C3144b<String, C0756b> f2949a = new C3144b<>();

    /* renamed from: b */
    private Bundle f2950b;

    /* renamed from: c */
    private boolean f2951c;

    /* renamed from: d */
    private C0753a f2952d;

    /* renamed from: e */
    boolean f2953e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0755a {
        /* renamed from: a */
        void mo2998a(C0758b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0756b {
        /* renamed from: a */
        Bundle mo4165a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo4167a(String str) {
        if (this.f2951c) {
            Bundle bundle = this.f2950b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2950b.remove(str);
            if (this.f2950b.isEmpty()) {
                this.f2950b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4168a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2950b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3148d e = this.f2949a.mo10123e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            bundle2.putBundle((String) entry.getKey(), ((C0756b) entry.getValue()).mo4165a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4169a(C0514h hVar, Bundle bundle) {
        if (!this.f2951c) {
            if (bundle != null) {
                this.f2950b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            hVar.mo3037a(new C0513g() {
                /* renamed from: a */
                public void mo124a(C0523n nVar, C0515a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == C0515a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == C0515a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f2953e = z;
                }
            });
            this.f2951c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* renamed from: a */
    public void mo4170a(Class<? extends C0755a> cls) {
        if (this.f2953e) {
            if (this.f2952d == null) {
                this.f2952d = new C0753a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f2952d.mo4166a(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: a */
    public void mo4171a(String str, C0756b bVar) {
        if (((C0756b) this.f2949a.mo10116b(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
