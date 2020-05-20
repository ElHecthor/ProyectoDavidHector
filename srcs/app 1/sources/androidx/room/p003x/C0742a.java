package androidx.room.p003x;

import android.database.Cursor;
import androidx.room.C0696i.C0699c;
import androidx.room.C0711l;
import androidx.room.C0728p;
import java.util.List;
import java.util.Set;
import p071f.p131r.C3518l;
import p071f.p131r.C3518l.C3523e;
import p071f.p131r.C3518l.C3525g;
import p071f.p133t.p134a.C3544e;

/* renamed from: androidx.room.x.a */
public abstract class C0742a<T> extends C3518l<T> {

    /* renamed from: c */
    private final C0728p f2912c;

    /* renamed from: d */
    private final String f2913d;

    /* renamed from: e */
    private final String f2914e;

    /* renamed from: f */
    private final C0711l f2915f;

    /* renamed from: g */
    private final C0699c f2916g;

    /* renamed from: h */
    private final boolean f2917h;

    /* renamed from: androidx.room.x.a$a */
    class C0743a extends C0699c {
        C0743a(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo4051a(Set<String> set) {
            C0742a.this.mo11127a();
        }
    }

    protected C0742a(C0711l lVar, C0728p pVar, boolean z, String... strArr) {
        this.f2915f = lVar;
        this.f2912c = pVar;
        this.f2917h = z;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM ( ");
        sb.append(this.f2912c.mo4105a());
        sb.append(" )");
        this.f2913d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM ( ");
        sb2.append(this.f2912c.mo4105a());
        sb2.append(" ) LIMIT ? OFFSET ?");
        this.f2914e = sb2.toString();
        this.f2916g = new C0743a(strArr);
        lVar.mo4074h().mo4041b(this.f2916g);
    }

    protected C0742a(C0711l lVar, C3544e eVar, boolean z, String... strArr) {
        this(lVar, C0728p.m4017b(eVar), z, strArr);
    }

    /* renamed from: b */
    private C0728p m4049b(int i, int i2) {
        C0728p b = C0728p.m4018b(this.f2914e, this.f2912c.mo4115d() + 2);
        b.mo4106a(this.f2912c);
        b.bindLong(b.mo4115d() - 1, (long) i2);
        b.bindLong(b.mo4115d(), (long) i);
        return b;
    }

    /* renamed from: a */
    public List<T> mo4142a(int i, int i2) {
        List<T> a;
        C0728p b = m4049b(i, i2);
        if (this.f2917h) {
            this.f2915f.mo4069c();
            Cursor cursor = null;
            try {
                cursor = this.f2915f.mo4061a((C3544e) b);
                a = mo4143a(cursor);
                this.f2915f.mo4081o();
                if (cursor != null) {
                    cursor.close();
                }
                this.f2915f.mo4071e();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                this.f2915f.mo4071e();
                b.mo4116f();
                throw th;
            }
        } else {
            Cursor a2 = this.f2915f.mo4061a((C3544e) b);
            try {
                a = mo4143a(a2);
                a2.close();
            } catch (Throwable th2) {
                a2.close();
                b.mo4116f();
                throw th2;
            }
        }
        b.mo4116f();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<T> mo4143a(Cursor cursor);

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4144a(p071f.p131r.C3518l.C3522d r7, p071f.p131r.C3518l.C3520b<T> r8) {
        /*
            r6 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            androidx.room.l r1 = r6.f2915f
            r1.mo4069c()
            r1 = 0
            int r2 = r6.mo4147e()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0032
            int r0 = p071f.p131r.C3518l.m14417a(r7, r2)     // Catch:{ all -> 0x0047 }
            int r7 = p071f.p131r.C3518l.m14418a(r7, r0, r2)     // Catch:{ all -> 0x0047 }
            androidx.room.p r7 = r6.m4049b(r0, r7)     // Catch:{ all -> 0x0047 }
            androidx.room.l r3 = r6.f2915f     // Catch:{ all -> 0x0030 }
            android.database.Cursor r1 = r3.mo4061a(r7)     // Catch:{ all -> 0x0030 }
            java.util.List r3 = r6.mo4143a(r1)     // Catch:{ all -> 0x0030 }
            androidx.room.l r4 = r6.f2915f     // Catch:{ all -> 0x0030 }
            r4.mo4081o()     // Catch:{ all -> 0x0030 }
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L_0x0034
        L_0x0030:
            r8 = move-exception
            goto L_0x0049
        L_0x0032:
            r7 = 0
            r3 = r1
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            androidx.room.l r1 = r6.f2915f
            r1.mo4071e()
            if (r3 == 0) goto L_0x0043
            r3.mo4116f()
        L_0x0043:
            r8.mo11218a(r0, r7, r2)
            return
        L_0x0047:
            r8 = move-exception
            r7 = r1
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            androidx.room.l r0 = r6.f2915f
            r0.mo4071e()
            if (r7 == 0) goto L_0x0058
            r7.mo4116f()
        L_0x0058:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.p003x.C0742a.mo4144a(f.r.l$d, f.r.l$b):void");
    }

    /* renamed from: a */
    public void mo4145a(C3525g gVar, C3523e<T> eVar) {
        eVar.mo11219a(mo4142a(gVar.f9992a, gVar.f9993b));
    }

    /* renamed from: c */
    public boolean mo4146c() {
        this.f2915f.mo4074h().mo4043c();
        return super.mo4146c();
    }

    /* renamed from: e */
    public int mo4147e() {
        C0728p b = C0728p.m4018b(this.f2913d, this.f2912c.mo4115d());
        b.mo4106a(this.f2912c);
        Cursor a = this.f2915f.mo4061a((C3544e) b);
        try {
            if (a.moveToFirst()) {
                return a.getInt(0);
            }
            a.close();
            b.mo4116f();
            return 0;
        } finally {
            a.close();
            b.mo4116f();
        }
    }
}
