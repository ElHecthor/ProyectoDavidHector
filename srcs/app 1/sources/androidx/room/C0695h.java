package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: androidx.room.h */
class C0695h {

    /* renamed from: a */
    final Set<LiveData> f2757a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final C0711l f2758b;

    C0695h(C0711l lVar) {
        this.f2758b = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> LiveData<T> mo4031a(String[] strArr, boolean z, Callable<T> callable) {
        C0730q qVar = new C0730q(this.f2758b, this, z, callable, strArr);
        return qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4032a(LiveData liveData) {
        this.f2757a.add(liveData);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4033b(LiveData liveData) {
        this.f2757a.remove(liveData);
    }
}
