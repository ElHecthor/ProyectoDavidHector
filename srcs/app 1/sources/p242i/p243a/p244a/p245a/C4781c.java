package p242i.p243a.p244a.p245a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p242i.p243a.p244a.p245a.C4776a.C4779b;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p249c.C4855d;
import p242i.p243a.p244a.p245a.p246n.p249c.C4864k;
import p242i.p243a.p244a.p245a.p246n.p249c.C4866l;
import p242i.p243a.p244a.p245a.p246n.p249c.C4867m;

/* renamed from: i.a.a.a.c */
public class C4781c {

    /* renamed from: l */
    static volatile C4781c f12491l;

    /* renamed from: m */
    static final C4795l f12492m = new C4780b();

    /* renamed from: a */
    private final Context f12493a;

    /* renamed from: b */
    private final Map<Class<? extends C4792i>, C4792i> f12494b;

    /* renamed from: c */
    private final ExecutorService f12495c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4787f<C4781c> f12496d;

    /* renamed from: e */
    private final C4787f<?> f12497e;

    /* renamed from: f */
    private final C4830s f12498f;

    /* renamed from: g */
    private C4776a f12499g;

    /* renamed from: h */
    private WeakReference<Activity> f12500h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicBoolean f12501i = new AtomicBoolean(false);

    /* renamed from: j */
    final C4795l f12502j;

    /* renamed from: k */
    final boolean f12503k;

    /* renamed from: i.a.a.a.c$a */
    class C4782a extends C4779b {
        C4782a() {
        }

        /* renamed from: a */
        public void mo5433a(Activity activity, Bundle bundle) {
            C4781c.this.mo13799a(activity);
        }

        /* renamed from: c */
        public void mo5436c(Activity activity) {
            C4781c.this.mo13799a(activity);
        }

        /* renamed from: d */
        public void mo5437d(Activity activity) {
            C4781c.this.mo13799a(activity);
        }
    }

    /* renamed from: i.a.a.a.c$b */
    class C4783b implements C4787f {

        /* renamed from: b */
        final CountDownLatch f12505b = new CountDownLatch(this.f12506c);

        /* renamed from: c */
        final /* synthetic */ int f12506c;

        C4783b(int i) {
            this.f12506c = i;
        }

        /* renamed from: a */
        public void mo13808a(Exception exc) {
            C4781c.this.f12496d.mo13808a(exc);
        }

        /* renamed from: a */
        public void mo13809a(Object obj) {
            this.f12505b.countDown();
            if (this.f12505b.getCount() == 0) {
                C4781c.this.f12501i.set(true);
                C4781c.this.f12496d.mo13809a(C4781c.this);
            }
        }
    }

    /* renamed from: i.a.a.a.c$c */
    public static class C4784c {

        /* renamed from: a */
        private final Context f12508a;

        /* renamed from: b */
        private C4792i[] f12509b;

        /* renamed from: c */
        private C4864k f12510c;

        /* renamed from: d */
        private Handler f12511d;

        /* renamed from: e */
        private C4795l f12512e;

        /* renamed from: f */
        private boolean f12513f;

        /* renamed from: g */
        private String f12514g;

        /* renamed from: h */
        private String f12515h;

        /* renamed from: i */
        private C4787f<C4781c> f12516i;

        public C4784c(Context context) {
            if (context != null) {
                this.f12508a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C4784c mo13810a(C4792i... iVarArr) {
            if (this.f12509b == null) {
                if (!C4820l.m19399a(this.f12508a).mo13878a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C4792i iVar : iVarArr) {
                        String n = iVar.mo5401n();
                        char c = 65535;
                        int hashCode = n.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && n.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c = 0;
                            }
                        } else if (n.equals("com.crashlytics.sdk.android:answers")) {
                            c = 1;
                        }
                        if (c == 0 || c == 1) {
                            arrayList.add(iVar);
                        } else if (!z) {
                            C4781c.m19229f().mo13787a("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    iVarArr = (C4792i[]) arrayList.toArray(new C4792i[0]);
                }
                this.f12509b = iVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C4781c mo13811a() {
            if (this.f12510c == null) {
                this.f12510c = C4864k.m19535a();
            }
            if (this.f12511d == null) {
                this.f12511d = new Handler(Looper.getMainLooper());
            }
            if (this.f12512e == null) {
                this.f12512e = this.f12513f ? new C4780b(3) : new C4780b();
            }
            if (this.f12515h == null) {
                this.f12515h = this.f12508a.getPackageName();
            }
            if (this.f12516i == null) {
                this.f12516i = C4787f.f12520a;
            }
            C4792i[] iVarArr = this.f12509b;
            Map hashMap = iVarArr == null ? new HashMap() : C4781c.m19225b((Collection<? extends C4792i>) Arrays.asList(iVarArr));
            Context applicationContext = this.f12508a.getApplicationContext();
            C4781c cVar = new C4781c(applicationContext, hashMap, this.f12510c, this.f12511d, this.f12512e, this.f12513f, this.f12516i, new C4830s(applicationContext, this.f12515h, this.f12514g, hashMap.values()), C4781c.m19228d(this.f12508a));
            return cVar;
        }
    }

    C4781c(Context context, Map<Class<? extends C4792i>, C4792i> map, C4864k kVar, Handler handler, C4795l lVar, boolean z, C4787f fVar, C4830s sVar, Activity activity) {
        this.f12493a = context;
        this.f12494b = map;
        this.f12495c = kVar;
        this.f12502j = lVar;
        this.f12503k = z;
        this.f12496d = fVar;
        this.f12497e = mo13800a(map.size());
        this.f12498f = sVar;
        mo13799a(activity);
    }

    /* renamed from: a */
    public static C4781c m19219a(Context context, C4792i... iVarArr) {
        if (f12491l == null) {
            synchronized (C4781c.class) {
                if (f12491l == null) {
                    C4784c cVar = new C4784c(context);
                    cVar.mo13810a(iVarArr);
                    m19227c(cVar.mo13811a());
                }
            }
        }
        return f12491l;
    }

    /* renamed from: a */
    public static <T extends C4792i> T m19220a(Class<T> cls) {
        return (C4792i) m19232i().f12494b.get(cls);
    }

    /* renamed from: a */
    private static void m19223a(Map<Class<? extends C4792i>, C4792i> map, Collection<? extends C4792i> collection) {
        for (C4792i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof C4793j) {
                m19223a(map, ((C4793j) iVar).mo5399f());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C4792i>, C4792i> m19225b(Collection<? extends C4792i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m19223a((Map<Class<? extends C4792i>, C4792i>) hashMap, collection);
        return hashMap;
    }

    /* renamed from: c */
    private static void m19227c(C4781c cVar) {
        f12491l = cVar;
        cVar.m19230g();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m19228d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: f */
    public static C4795l m19229f() {
        return f12491l == null ? f12492m : f12491l.f12502j;
    }

    /* renamed from: g */
    private void m19230g() {
        C4776a aVar = new C4776a(this.f12493a);
        this.f12499g = aVar;
        aVar.mo13777a(new C4782a());
        mo13804b(this.f12493a);
    }

    /* renamed from: h */
    public static boolean m19231h() {
        if (f12491l == null) {
            return false;
        }
        return f12491l.f12503k;
    }

    /* renamed from: i */
    static C4781c m19232i() {
        if (f12491l != null) {
            return f12491l;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    /* renamed from: a */
    public Activity mo13798a() {
        WeakReference<Activity> weakReference = this.f12500h;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public C4781c mo13799a(Activity activity) {
        this.f12500h = new WeakReference<>(activity);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4787f<?> mo13800a(int i) {
        return new C4783b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Future<Map<String, C4794k>> mo13801a(Context context) {
        return mo13803b().submit(new C4786e(context.getPackageCodePath()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13802a(Map<Class<? extends C4792i>, C4792i> map, C4792i iVar) {
        Class[] value;
        C4855d dVar = iVar.f12527k;
        if (dVar != null) {
            for (Class cls : dVar.value()) {
                if (cls.isInterface()) {
                    for (C4792i iVar2 : map.values()) {
                        if (cls.isAssignableFrom(iVar2.getClass())) {
                            iVar.f12523g.mo13930a((C4866l) iVar2.f12523g);
                        }
                    }
                } else if (((C4792i) map.get(cls)) != null) {
                    iVar.f12523g.mo13930a((C4866l) ((C4792i) map.get(cls)).f12523g);
                } else {
                    throw new C4867m("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: b */
    public ExecutorService mo13803b() {
        return this.f12495c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13804b(Context context) {
        StringBuilder sb;
        Future a = mo13801a(context);
        Collection d = mo13806d();
        C4796m mVar = new C4796m(a, d);
        ArrayList<C4792i> arrayList = new ArrayList<>(d);
        Collections.sort(arrayList);
        mVar.mo13828a(context, this, C4787f.f12520a, this.f12498f);
        for (C4792i a2 : arrayList) {
            a2.mo13828a(context, this, this.f12497e, this.f12498f);
        }
        mVar.mo13839r();
        String str = "Fabric";
        String str2 = " [Version: ";
        if (m19229f().mo13789a(str, 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo13805c());
            sb.append(str2);
            sb.append(mo13807e());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C4792i iVar : arrayList) {
            iVar.f12523g.mo13930a((C4866l) mVar.f12523g);
            mo13802a(this.f12494b, iVar);
            iVar.mo13839r();
            if (sb != null) {
                sb.append(iVar.mo5401n());
                sb.append(str2);
                sb.append(iVar.mo5402p());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m19229f().mo13796e(str, sb.toString());
        }
    }

    /* renamed from: c */
    public String mo13805c() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: d */
    public Collection<C4792i> mo13806d() {
        return this.f12494b.values();
    }

    /* renamed from: e */
    public String mo13807e() {
        return "1.4.8.32";
    }
}
