package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C1631i;
import com.facebook.C1729k;
import com.facebook.C1787m;
import com.facebook.login.C1736b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.q */
public final class C1683q {

    /* renamed from: a */
    private static final String f5134a = "com.facebook.internal.q";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C1689f> f5135b = m7316e();

    /* renamed from: c */
    private static final List<C1689f> f5136c = m7315d();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicBoolean f5137d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final List<Integer> f5138e = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.q$a */
    static class C1684a implements Runnable {
        C1684a() {
        }

        public void run() {
            try {
                for (C1689f a : C1683q.f5135b) {
                    a.m7328a(true);
                }
            } finally {
                C1683q.f5137d.set(false);
            }
        }
    }

    /* renamed from: com.facebook.internal.q$b */
    private static class C1685b extends C1689f {
        private C1685b() {
            super(null);
        }

        /* synthetic */ C1685b(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo5930b() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo5931c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* renamed from: com.facebook.internal.q$c */
    private static class C1686c extends C1689f {
        private C1686c() {
            super(null);
        }

        /* synthetic */ C1686c(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo5930b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo5931c() {
            return "com.facebook.lite";
        }
    }

    /* renamed from: com.facebook.internal.q$d */
    private static class C1687d extends C1689f {
        private C1687d() {
            super(null);
        }

        /* synthetic */ C1687d(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo5930b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo5931c() {
            return "com.facebook.katana";
        }
    }

    /* renamed from: com.facebook.internal.q$e */
    private static class C1688e extends C1689f {
        private C1688e() {
            super(null);
        }

        /* synthetic */ C1688e(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo5930b() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo5931c() {
            return "com.facebook.orca";
        }
    }

    /* renamed from: com.facebook.internal.q$f */
    private static abstract class C1689f {

        /* renamed from: a */
        private TreeSet<Integer> f5139a;

        private C1689f() {
        }

        /* synthetic */ C1689f(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r0.f5139a.isEmpty() == false) goto L_0x0015;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void m7328a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.f5139a     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.f5139a     // Catch:{ all -> 0x0017 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0015
            L_0x000f:
                java.util.TreeSet r1 = com.facebook.internal.C1683q.m7314c(r0)     // Catch:{ all -> 0x0017 }
                r0.f5139a = r1     // Catch:{ all -> 0x0017 }
            L_0x0015:
                monitor-exit(r0)
                return
            L_0x0017:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1683q.C1689f.m7328a(boolean):void");
        }

        /* renamed from: a */
        public TreeSet<Integer> mo5932a() {
            TreeSet<Integer> treeSet = this.f5139a;
            if (treeSet == null || treeSet.isEmpty()) {
                m7328a(false);
            }
            return this.f5139a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo5930b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract String mo5931c();
    }

    /* renamed from: com.facebook.internal.q$g */
    public static class C1690g {

        /* renamed from: a */
        private int f5140a;

        private C1690g() {
        }

        /* renamed from: a */
        public static C1690g m7332a(C1689f fVar, int i) {
            C1690g gVar = new C1690g();
            gVar.f5140a = i;
            return gVar;
        }

        /* renamed from: b */
        public static C1690g m7333b() {
            C1690g gVar = new C1690g();
            gVar.f5140a = -1;
            return gVar;
        }

        /* renamed from: a */
        public int mo5933a() {
            return this.f5140a;
        }
    }

    /* renamed from: com.facebook.internal.q$h */
    private static class C1691h extends C1689f {
        private C1691h() {
            super(null);
        }

        /* synthetic */ C1691h(C1684a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo5930b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo5931c() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        m7313c();
    }

    /* renamed from: a */
    public static int m7293a(int i) {
        return m7302a(f5135b, new int[]{i}).mo5933a();
    }

    /* renamed from: a */
    public static int m7294a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (!descendingIterator.hasNext()) {
                break;
            }
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i3 = Math.max(i3, intValue);
            while (length >= 0 && iArr[length] > intValue) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == intValue) {
                if (length % 2 == 0) {
                    i2 = Math.min(i3, i);
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static Intent m7295a(Context context) {
        for (C1689f fVar : f5135b) {
            Intent b = m7306b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(fVar.mo5931c()).addCategory("android.intent.category.DEFAULT"), fVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    static Intent m7296a(Context context, Intent intent, C1689f fVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C1658h.m7219a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m7297a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1736b bVar, String str3, String str4) {
        C1686c cVar = new C1686c(null);
        Context context2 = context;
        return m7296a(context, m7299a((C1689f) cVar, str, collection, str2, z, z2, bVar, str3, str4), (C1689f) cVar);
    }

    /* renamed from: a */
    public static Intent m7298a(Intent intent, Bundle bundle, C1631i iVar) {
        UUID a = m7304a(intent);
        if (a == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m7312c(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a.toString());
        if (iVar != null) {
            bundle2.putBundle("error", m7300a(iVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    private static Intent m7299a(C1689f fVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1736b bVar, String str3, String str4) {
        String b = fVar.mo5930b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(fVar.mo5931c(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C1787m.m7755p());
        if (!C1698v.m7389a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C1698v.m7401c(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", bVar.mo6027f());
        }
        putExtra.putExtra("legacy_override", C1787m.m7753n());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    /* renamed from: a */
    public static Bundle m7300a(C1631i iVar) {
        if (iVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", iVar.toString());
        if (iVar instanceof C1729k) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    public static C1631i m7301a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new C1631i(string2) : new C1729k(string2);
    }

    /* renamed from: a */
    private static C1690g m7302a(List<C1689f> list, int[] iArr) {
        m7318g();
        if (list == null) {
            return C1690g.m7333b();
        }
        for (C1689f fVar : list) {
            int a = m7294a(fVar.mo5932a(), m7317f(), iArr);
            if (a != -1) {
                return C1690g.m7332a(fVar, a);
            }
        }
        return C1690g.m7333b();
    }

    /* renamed from: a */
    public static UUID m7304a(Intent intent) {
        String str;
        UUID uuid = null;
        if (intent == null) {
            return null;
        }
        if (m7311b(m7312c(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return uuid;
    }

    /* renamed from: b */
    static Intent m7306b(Context context, Intent intent, C1689f fVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && C1658h.m7219a(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    public static Intent m7307b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1736b bVar, String str3, String str4) {
        for (C1689f fVar : f5135b) {
            Context context2 = context;
            Intent a = m7296a(context, m7299a(fVar, str, collection, str2, z, z2, bVar, str3, str4), fVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Uri m7308b(C1689f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(fVar.mo5931c());
        sb.append(".provider.PlatformProvider/versions");
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    public static Bundle m7309b(Intent intent) {
        return !m7311b(m7312c(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: b */
    public static boolean m7311b(int i) {
        return f5138e.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: c */
    public static int m7312c(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: c */
    private static Map<String, List<C1689f>> m7313c() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1688e(null));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f5135b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f5135b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f5135b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f5135b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f5136c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", f5135b);
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e(f5134a, r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m7314c(com.facebook.internal.C1683q.C1689f r10) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            android.content.Context r2 = com.facebook.C1787m.m7744e()
            android.content.ContentResolver r3 = r2.getContentResolver()
            java.lang.String r2 = "version"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            android.net.Uri r4 = m7308b(r10)
            r9 = 0
            android.content.Context r6 = com.facebook.C1787m.m7744e()     // Catch:{ all -> 0x0072 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r10.mo5931c()     // Catch:{ all -> 0x0072 }
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = ".provider.PlatformProvider"
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x0072 }
            r7 = 0
            android.content.pm.ProviderInfo r10 = r6.resolveContentProvider(r10, r7)     // Catch:{ RuntimeException -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r10 = move-exception
            java.lang.String r6 = f5134a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r6, r0, r10)     // Catch:{ all -> 0x0072 }
            r10 = r9
        L_0x0044:
            if (r10 == 0) goto L_0x006c
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x004f }
            r9 = r10
            goto L_0x0054
        L_0x004f:
            java.lang.String r10 = f5134a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r10, r0)     // Catch:{ all -> 0x0072 }
        L_0x0054:
            if (r9 == 0) goto L_0x006c
        L_0x0056:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x006c
            int r10 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0072 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0072 }
            r1.add(r10)     // Catch:{ all -> 0x0072 }
            goto L_0x0056
        L_0x006c:
            if (r9 == 0) goto L_0x0071
            r9.close()
        L_0x0071:
            return r1
        L_0x0072:
            r10 = move-exception
            if (r9 == 0) goto L_0x0078
            r9.close()
        L_0x0078:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1683q.m7314c(com.facebook.internal.q$f):java.util.TreeSet");
    }

    /* renamed from: d */
    private static List<C1689f> m7315d() {
        ArrayList arrayList = new ArrayList(m7316e());
        arrayList.add(0, new C1685b(null));
        return arrayList;
    }

    /* renamed from: e */
    private static List<C1689f> m7316e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1687d(null));
        arrayList.add(new C1691h(null));
        return arrayList;
    }

    /* renamed from: f */
    public static final int m7317f() {
        return ((Integer) f5138e.get(0)).intValue();
    }

    /* renamed from: g */
    public static void m7318g() {
        if (f5137d.compareAndSet(false, true)) {
            C1787m.m7751l().execute(new C1684a());
        }
    }
}
