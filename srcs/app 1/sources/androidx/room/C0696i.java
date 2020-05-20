package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p071f.p080b.p081a.p083b.C3144b;
import p071f.p133t.p134a.C3536a;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3544e;
import p071f.p133t.p134a.C3545f;

/* renamed from: androidx.room.i */
public class C0696i {

    /* renamed from: l */
    private static final String[] f2759l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f2760a;

    /* renamed from: b */
    final String[] f2761b;

    /* renamed from: c */
    private Map<String, Set<String>> f2762c;

    /* renamed from: d */
    final C0711l f2763d;

    /* renamed from: e */
    AtomicBoolean f2764e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f2765f = false;

    /* renamed from: g */
    volatile C3545f f2766g;

    /* renamed from: h */
    private C0698b f2767h;

    /* renamed from: i */
    private final C0695h f2768i;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j */
    final C3144b<C0699c, C0700d> f2769j = new C3144b<>();

    /* renamed from: k */
    Runnable f2770k = new C0697a();

    /* renamed from: androidx.room.i$a */
    class C0697a implements Runnable {
        C0697a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m3937a() {
            HashSet hashSet = new HashSet();
            Cursor a = C0696i.this.f2763d.mo4061a((C3544e) new C3536a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (a.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(a.getInt(0)));
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            a.close();
            if (!hashSet.isEmpty()) {
                C0696i.this.f2766g.executeUpdateDelete();
            }
            return hashSet;
        }

        public void run() {
            C3537b a;
            Lock g = C0696i.this.f2763d.mo4073g();
            Set set = null;
            try {
                g.lock();
                if (!C0696i.this.mo4039a()) {
                    g.unlock();
                } else if (!C0696i.this.f2764e.compareAndSet(true, false)) {
                    g.unlock();
                } else if (C0696i.this.f2763d.mo4079m()) {
                    g.unlock();
                } else {
                    if (C0696i.this.f2763d.f2810g) {
                        a = C0696i.this.f2763d.mo4075i().mo4121a();
                        a.beginTransaction();
                        set = m3937a();
                        a.setTransactionSuccessful();
                        a.endTransaction();
                    } else {
                        set = m3937a();
                    }
                    g.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C0696i.this.f2769j) {
                            Iterator it = C0696i.this.f2769j.iterator();
                            while (it.hasNext()) {
                                ((C0700d) ((Entry) it.next()).getValue()).mo4053a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    g.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                a.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.i$b */
    static class C0698b {

        /* renamed from: a */
        final long[] f2772a;

        /* renamed from: b */
        final boolean[] f2773b;

        /* renamed from: c */
        final int[] f2774c;

        /* renamed from: d */
        boolean f2775d;

        /* renamed from: e */
        boolean f2776e;

        C0698b(int i) {
            long[] jArr = new long[i];
            this.f2772a = jArr;
            this.f2773b = new boolean[i];
            this.f2774c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.f2773b, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4047a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f2772a[i];
                    this.f2772a[i] = 1 + j;
                    if (j == 0) {
                        this.f2775d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int[] mo4048a() {
            synchronized (this) {
                if (this.f2775d) {
                    if (!this.f2776e) {
                        int length = this.f2772a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f2772a[i] > 0;
                                if (z != this.f2773b[i]) {
                                    int[] iArr = this.f2774c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f2774c[i] = 0;
                                }
                                this.f2773b[i] = z;
                                i++;
                            } else {
                                this.f2776e = true;
                                this.f2775d = false;
                                int[] iArr2 = this.f2774c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4049b() {
            synchronized (this) {
                this.f2776e = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4050b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f2772a[i];
                    this.f2772a[i] = j - 1;
                    if (j == 1) {
                        this.f2775d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: androidx.room.i$c */
    public static abstract class C0699c {

        /* renamed from: a */
        final String[] f2777a;

        public C0699c(String[] strArr) {
            this.f2777a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo4051a(Set<String> set);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4052a() {
            return false;
        }
    }

    /* renamed from: androidx.room.i$d */
    static class C0700d {

        /* renamed from: a */
        final int[] f2778a;

        /* renamed from: b */
        private final String[] f2779b;

        /* renamed from: c */
        final C0699c f2780c;

        /* renamed from: d */
        private final Set<String> f2781d;

        C0700d(C0699c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f2780c = cVar;
            this.f2778a = iArr;
            this.f2779b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f2779b[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f2781d = set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4053a(Set<Integer> set) {
            int length = this.f2778a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f2778a[i]))) {
                    if (length == 1) {
                        set2 = this.f2781d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f2779b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f2780c.mo4051a(set2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4054a(String[] strArr) {
            Set set = 0;
            if (this.f2779b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f2779b[0])) {
                        set = this.f2781d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2779b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != 0) {
                this.f2780c.mo4051a(set);
            }
        }
    }

    /* renamed from: androidx.room.i$e */
    static class C0701e extends C0699c {

        /* renamed from: b */
        final C0696i f2782b;

        /* renamed from: c */
        final WeakReference<C0699c> f2783c;

        C0701e(C0696i iVar, C0699c cVar) {
            super(cVar.f2777a);
            this.f2782b = iVar;
            this.f2783c = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo4051a(Set<String> set) {
            C0699c cVar = (C0699c) this.f2783c.get();
            if (cVar == null) {
                this.f2782b.mo4044c((C0699c) this);
            } else {
                cVar.mo4051a(set);
            }
        }
    }

    public C0696i(C0711l lVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2763d = lVar;
        this.f2767h = new C0698b(strArr.length);
        this.f2760a = new HashMap<>();
        this.f2762c = map2;
        this.f2768i = new C0695h(this.f2763d);
        int length = strArr.length;
        this.f2761b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f2760a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.f2761b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f2761b[i] = lowerCase;
            }
        }
        for (Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.f2760a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.f2760a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: a */
    private void m3920a(C3537b bVar, int i) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        bVar.execSQL(sb.toString());
        String str = this.f2761b[i];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f2759l) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m3921a(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            String str3 = "invalidated";
            sb2.append(str3);
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i);
            sb2.append(" AND ");
            sb2.append(str3);
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.execSQL(sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m3921a(StringBuilder sb, String str, String str2) {
        String str3 = "`";
        sb.append(str3);
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(str3);
    }

    /* renamed from: b */
    private void m3922b(C3537b bVar, int i) {
        String[] strArr;
        String str = this.f2761b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2759l) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m3921a(sb, str, str2);
            bVar.execSQL(sb.toString());
        }
    }

    /* renamed from: b */
    private String[] m3923b(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2762c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f2762c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: c */
    private String[] m3924c(String[] strArr) {
        String[] b = m3923b(strArr);
        int length = b.length;
        int i = 0;
        while (i < length) {
            String str = b[i];
            if (this.f2760a.containsKey(str.toLowerCase(Locale.US))) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public <T> LiveData<T> mo4034a(String[] strArr, boolean z, Callable<T> callable) {
        return this.f2768i.mo4031a(m3924c(strArr), z, callable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4035a(Context context, String str) {
        new C0702j(context, str, this, this.f2763d.mo4076j());
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo4036a(C0699c cVar) {
        C0700d dVar;
        String[] b = m3923b(cVar.f2777a);
        int[] iArr = new int[b.length];
        int length = b.length;
        int i = 0;
        while (i < length) {
            Integer num = (Integer) this.f2760a.get(b[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(b[i]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C0700d dVar2 = new C0700d(cVar, iArr, b);
        synchronized (this.f2769j) {
            dVar = (C0700d) this.f2769j.mo10116b(cVar, dVar2);
        }
        if (dVar == null && this.f2767h.mo4047a(iArr)) {
            mo4045d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4037a(C3537b bVar) {
        synchronized (this) {
            if (this.f2765f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.execSQL("PRAGMA temp_store = MEMORY;");
            bVar.execSQL("PRAGMA recursive_triggers='ON';");
            bVar.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo4042b(bVar);
            this.f2766g = bVar.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f2765f = true;
        }
    }

    /* renamed from: a */
    public void mo4038a(String... strArr) {
        synchronized (this.f2769j) {
            Iterator it = this.f2769j.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!((C0699c) entry.getKey()).mo4052a()) {
                    ((C0700d) entry.getValue()).mo4054a(strArr);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4039a() {
        if (!this.f2763d.mo4080n()) {
            return false;
        }
        if (!this.f2765f) {
            this.f2763d.mo4075i().mo4121a();
        }
        if (this.f2765f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: b */
    public void mo4040b() {
        if (this.f2764e.compareAndSet(false, true)) {
            this.f2763d.mo4076j().execute(this.f2770k);
        }
    }

    /* renamed from: b */
    public void mo4041b(C0699c cVar) {
        mo4036a((C0699c) new C0701e(this, cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4042b(C3537b bVar) {
        if (!bVar.inTransaction()) {
            while (true) {
                try {
                    Lock g = this.f2763d.mo4073g();
                    g.lock();
                    try {
                        int[] a = this.f2767h.mo4048a();
                        if (a == null) {
                            g.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.beginTransaction();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m3920a(bVar, i);
                            } else if (i2 == 2) {
                                m3922b(bVar, i);
                            }
                        }
                        bVar.setTransactionSuccessful();
                        bVar.endTransaction();
                        this.f2767h.mo4049b();
                        g.unlock();
                    } catch (Throwable th) {
                        g.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4043c() {
        mo4045d();
        this.f2770k.run();
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: c */
    public void mo4044c(C0699c cVar) {
        C0700d dVar;
        synchronized (this.f2769j) {
            dVar = (C0700d) this.f2769j.remove(cVar);
        }
        if (dVar != null && this.f2767h.mo4050b(dVar.f2778a)) {
            mo4045d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4045d() {
        if (this.f2763d.mo4080n()) {
            mo4042b(this.f2763d.mo4075i().mo4121a());
        }
    }
}
