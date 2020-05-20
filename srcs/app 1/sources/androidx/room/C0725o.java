package androidx.room;

import android.database.Cursor;
import p071f.p133t.p134a.C3536a;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3538c.C3539a;

/* renamed from: androidx.room.o */
public class C0725o extends C3539a {

    /* renamed from: b */
    private C0686c f2860b;

    /* renamed from: c */
    private final C0726a f2861c;

    /* renamed from: d */
    private final String f2862d;

    /* renamed from: e */
    private final String f2863e;

    /* renamed from: androidx.room.o$a */
    public static abstract class C0726a {

        /* renamed from: a */
        public final int f2864a;

        public C0726a(int i) {
            this.f2864a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4098a(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo4099b(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo4100c(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo4101d(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo4102e(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo4103f(C3537b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract C0727b mo4104g(C3537b bVar);
    }

    /* renamed from: androidx.room.o$b */
    public static class C0727b {

        /* renamed from: a */
        public final boolean f2865a;

        /* renamed from: b */
        public final String f2866b;

        public C0727b(boolean z, String str) {
            this.f2865a = z;
            this.f2866b = str;
        }
    }

    public C0725o(C0686c cVar, C0726a aVar, String str, String str2) {
        super(aVar.f2864a);
        this.f2860b = cVar;
        this.f2861c = aVar;
        this.f2862d = str;
        this.f2863e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m4000e(C3537b bVar) {
        if (m4003h(bVar)) {
            String str = null;
            Cursor a = bVar.mo11221a(new C3536a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    str = a.getString(0);
                }
                a.close();
                if (!this.f2862d.equals(str) && !this.f2863e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        } else {
            C0727b g = this.f2861c.mo4104g(bVar);
            if (g.f2865a) {
                this.f2861c.mo4102e(bVar);
                m4004i(bVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Pre-packaged database has an invalid schema: ");
            sb.append(g.f2866b);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: f */
    private void m4001f(C3537b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: g */
    private static boolean m4002g(C3537b bVar) {
        Cursor b = bVar.mo11223b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    /* renamed from: h */
    private static boolean m4003h(C3537b bVar) {
        Cursor b = bVar.mo11223b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    /* renamed from: i */
    private void m4004i(C3537b bVar) {
        m4001f(bVar);
        bVar.execSQL(C0724n.m3999a(this.f2862d));
    }

    /* renamed from: a */
    public void mo4093a(C3537b bVar) {
        super.mo4093a(bVar);
    }

    /* renamed from: a */
    public void mo4094a(C3537b bVar, int i, int i2) {
        mo4095b(bVar, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4095b(p071f.p133t.p134a.C3537b r3, int r4, int r5) {
        /*
            r2 = this;
            androidx.room.c r0 = r2.f2860b
            if (r0 == 0) goto L_0x0052
            androidx.room.l$d r0 = r0.f2745d
            java.util.List r0 = r0.mo4088a(r4, r5)
            if (r0 == 0) goto L_0x0052
            androidx.room.o$a r1 = r2.f2861c
            r1.mo4103f(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r0.next()
            androidx.room.w.a r1 = (androidx.room.p002w.C0741a) r1
            r1.mo4141a(r3)
            goto L_0x0015
        L_0x0025:
            androidx.room.o$a r0 = r2.f2861c
            androidx.room.o$b r0 = r0.mo4104g(r3)
            boolean r1 = r0.f2865a
            if (r1 == 0) goto L_0x0039
            androidx.room.o$a r0 = r2.f2861c
            r0.mo4102e(r3)
            r2.m4004i(r3)
            r0 = 1
            goto L_0x0053
        L_0x0039:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Migration didn't properly handle: "
            r4.append(r5)
            java.lang.String r5 = r0.f2866b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 != 0) goto L_0x008e
            androidx.room.c r0 = r2.f2860b
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.mo4019a(r4, r5)
            if (r0 != 0) goto L_0x006a
            androidx.room.o$a r4 = r2.f2861c
            r4.mo4099b(r3)
            androidx.room.o$a r4 = r2.f2861c
            r4.mo4098a(r3)
            goto L_0x008e
        L_0x006a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0725o.mo4095b(f.t.a.b, int, int):void");
    }

    /* renamed from: c */
    public void mo4096c(C3537b bVar) {
        boolean g = m4002g(bVar);
        this.f2861c.mo4098a(bVar);
        if (!g) {
            C0727b g2 = this.f2861c.mo4104g(bVar);
            if (!g2.f2865a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Pre-packaged database has an invalid schema: ");
                sb.append(g2.f2866b);
                throw new IllegalStateException(sb.toString());
            }
        }
        m4004i(bVar);
        this.f2861c.mo4100c(bVar);
    }

    /* renamed from: d */
    public void mo4097d(C3537b bVar) {
        super.mo4097d(bVar);
        m4000e(bVar);
        this.f2861c.mo4101d(bVar);
        this.f2860b = null;
    }
}
