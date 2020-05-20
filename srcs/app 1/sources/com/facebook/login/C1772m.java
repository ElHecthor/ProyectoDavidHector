package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.C1499a;
import com.facebook.C1522e;
import com.facebook.C1527f;
import com.facebook.C1627g;
import com.facebook.C1631i;
import com.facebook.C1787m;
import com.facebook.C1846x;
import com.facebook.FacebookActivity;
import com.facebook.internal.C1647d;
import com.facebook.internal.C1647d.C1648a;
import com.facebook.internal.C1647d.C1649b;
import com.facebook.internal.C1703w;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.m */
public class C1772m {

    /* renamed from: e */
    private static final Set<String> f5338e = m7678c();

    /* renamed from: f */
    private static volatile C1772m f5339f;

    /* renamed from: a */
    private C1758i f5340a = C1758i.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private C1736b f5341b = C1736b.FRIENDS;

    /* renamed from: c */
    private final SharedPreferences f5342c;

    /* renamed from: d */
    private String f5343d = "rerequest";

    /* renamed from: com.facebook.login.m$a */
    class C1773a implements C1648a {

        /* renamed from: a */
        final /* synthetic */ C1627g f5344a;

        C1773a(C1627g gVar) {
            this.f5344a = gVar;
        }

        /* renamed from: a */
        public boolean mo5890a(int i, Intent intent) {
            return C1772m.this.mo6141a(i, intent, this.f5344a);
        }
    }

    /* renamed from: com.facebook.login.m$b */
    static class C1774b extends HashSet<String> {
        C1774b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: com.facebook.login.m$c */
    class C1775c implements C1648a {
        C1775c() {
        }

        /* renamed from: a */
        public boolean mo5890a(int i, Intent intent) {
            return C1772m.this.mo6140a(i, intent);
        }
    }

    /* renamed from: com.facebook.login.m$d */
    private static class C1776d implements C1781q {

        /* renamed from: a */
        private final Activity f5347a;

        C1776d(Activity activity) {
            C1703w.m7423a((Object) activity, "activity");
            this.f5347a = activity;
        }

        /* renamed from: a */
        public Activity mo6143a() {
            return this.f5347a;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.f5347a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.m$e */
    private static class C1777e {

        /* renamed from: a */
        private static C1771l f5348a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C1771l m7691b(Context context) {
            synchronized (C1777e.class) {
                if (context == null) {
                    context = C1787m.m7744e();
                }
                if (context == null) {
                    return null;
                }
                if (f5348a == null) {
                    f5348a = new C1771l(context, C1787m.m7745f());
                }
                C1771l lVar = f5348a;
                return lVar;
            }
        }
    }

    C1772m() {
        C1703w.m7430c();
        this.f5342c = C1787m.m7744e().getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    static C1779o m7667a(C1763d dVar, C1499a aVar) {
        Set h = dVar.mo6115h();
        HashSet hashSet = new HashSet(aVar.mo5689g());
        if (dVar.mo6117j()) {
            hashSet.retainAll(h);
        }
        HashSet hashSet2 = new HashSet(h);
        hashSet2.removeAll(hashSet);
        return new C1779o(aVar, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m7668a(Context context, C1763d dVar) {
        C1771l a = C1777e.m7691b(context);
        if (a != null && dVar != null) {
            a.mo6128a(dVar);
        }
    }

    /* renamed from: a */
    private void m7669a(Context context, C1767b bVar, Map<String, String> map, Exception exc, boolean z, C1763d dVar) {
        C1771l a = C1777e.m7691b(context);
        if (a != null) {
            if (dVar == null) {
                a.mo6134c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : "0");
                a.mo6132a(dVar.mo6108b(), hashMap, bVar, map, exc);
            }
        }
    }

    /* renamed from: a */
    private void m7670a(C1499a aVar, C1763d dVar, C1631i iVar, boolean z, C1627g<C1779o> gVar) {
        if (aVar != null) {
            C1499a.m6757b(aVar);
            C1846x.m7937c();
        }
        if (gVar != null) {
            C1779o a = aVar != null ? m7667a(dVar, aVar) : null;
            if (z || (a != null && a.mo6151b().size() == 0)) {
                gVar.mo5860a();
            } else if (iVar != null) {
                gVar.mo5861a(iVar);
            } else if (aVar != null) {
                m7672a(true);
                gVar.mo5862a(a);
            }
        }
    }

    /* renamed from: a */
    private void m7671a(C1781q qVar, C1763d dVar) {
        m7668a((Context) qVar.mo6143a(), dVar);
        C1647d.m7194b(C1649b.Login.mo5891f(), new C1775c());
        if (!m7677b(qVar, dVar)) {
            C1631i iVar = new C1631i("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m7669a(qVar.mo6143a(), C1767b.ERROR, null, iVar, false, dVar);
            throw iVar;
        }
    }

    /* renamed from: a */
    private void m7672a(boolean z) {
        Editor edit = this.f5342c.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: a */
    private boolean m7673a(Intent intent) {
        return C1787m.m7744e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: a */
    static boolean m7674a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f5338e.contains(str));
    }

    /* renamed from: b */
    public static C1772m m7675b() {
        if (f5339f == null) {
            synchronized (C1772m.class) {
                if (f5339f == null) {
                    f5339f = new C1772m();
                }
            }
        }
        return f5339f;
    }

    /* renamed from: b */
    private void m7676b(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (m7674a(str)) {
                    throw new C1631i(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m7677b(C1781q qVar, C1763d dVar) {
        Intent a = mo6135a(dVar);
        if (!m7673a(a)) {
            return false;
        }
        try {
            qVar.startActivityForResult(a, C1759j.m7599s());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Set<String> m7678c() {
        return Collections.unmodifiableSet(new C1774b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo6135a(C1763d dVar) {
        Intent intent = new Intent();
        intent.setClass(C1787m.m7744e(), FacebookActivity.class);
        intent.setAction(dVar.mo6114g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", dVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1763d mo6136a(Collection<String> collection) {
        HashSet hashSet;
        C1758i iVar = this.f5340a;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        C1763d dVar = new C1763d(iVar, Collections.unmodifiableSet(hashSet), this.f5341b, this.f5343d, C1787m.m7745f(), UUID.randomUUID().toString());
        dVar.mo6107a(C1499a.m6760s());
        return dVar;
    }

    /* renamed from: a */
    public void mo6137a() {
        C1499a.m6757b(null);
        C1846x.m7935a(null);
        m7672a(false);
    }

    /* renamed from: a */
    public void mo6138a(Activity activity, Collection<String> collection) {
        m7671a((C1781q) new C1776d(activity), mo6136a(collection));
    }

    /* renamed from: a */
    public void mo6139a(C1522e eVar, C1627g<C1779o> gVar) {
        if (eVar instanceof C1647d) {
            ((C1647d) eVar).mo5889a(C1649b.Login.mo5891f(), new C1773a(gVar));
            return;
        }
        throw new C1631i("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6140a(int i, Intent intent) {
        return mo6141a(i, intent, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6141a(int i, Intent intent, C1627g<C1779o> gVar) {
        boolean z;
        Map map;
        C1767b bVar;
        C1763d dVar;
        C1499a aVar;
        boolean z2;
        C1763d dVar2;
        Map map2;
        int i2 = i;
        Intent intent2 = intent;
        C1767b bVar2 = C1767b.ERROR;
        C1631i iVar = null;
        boolean z3 = false;
        if (intent2 != null) {
            C1765e eVar = (C1765e) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                C1763d dVar3 = eVar.f5322j;
                C1767b bVar3 = eVar.f5318f;
                if (i2 == -1) {
                    if (bVar3 == C1767b.SUCCESS) {
                        aVar = eVar.f5319g;
                    } else {
                        iVar = new C1527f(eVar.f5320h);
                        aVar = null;
                    }
                } else if (i2 == 0) {
                    aVar = null;
                    z3 = true;
                } else {
                    aVar = null;
                }
                map2 = eVar.f5323k;
                boolean z4 = z3;
                dVar2 = dVar3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                aVar = null;
                map2 = null;
                dVar2 = null;
                z2 = false;
            }
            map = map2;
            bVar = bVar2;
            dVar = dVar2;
            z = z2;
        } else if (i2 == 0) {
            bVar = C1767b.CANCEL;
            aVar = null;
            dVar = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            aVar = null;
            dVar = null;
            map = null;
            z = false;
        }
        if (iVar == null && aVar == null && !z) {
            iVar = new C1631i("Unexpected call to LoginManager.onActivityResult");
        }
        m7669a(null, bVar, map, iVar, true, dVar);
        m7670a(aVar, dVar, iVar, z, gVar);
        return true;
    }

    /* renamed from: b */
    public void mo6142b(Activity activity, Collection<String> collection) {
        m7676b(collection);
        mo6138a(activity, collection);
    }
}
