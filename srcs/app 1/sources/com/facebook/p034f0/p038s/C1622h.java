package com.facebook.p034f0.p038s;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C1787m;
import java.util.UUID;

/* renamed from: com.facebook.f0.s.h */
class C1622h {

    /* renamed from: a */
    private Long f5002a;

    /* renamed from: b */
    private Long f5003b;

    /* renamed from: c */
    private int f5004c;

    /* renamed from: d */
    private Long f5005d;

    /* renamed from: e */
    private C1624j f5006e;

    /* renamed from: f */
    private UUID f5007f;

    public C1622h(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public C1622h(Long l, Long l2, UUID uuid) {
        this.f5002a = l;
        this.f5003b = l2;
        this.f5007f = uuid;
    }

    /* renamed from: i */
    public static void m7129i() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C1624j.m7144b();
    }

    /* renamed from: j */
    public static C1622h m7130j() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C1622h hVar = new C1622h(Long.valueOf(j), Long.valueOf(j2));
        hVar.f5004c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        hVar.f5006e = C1624j.m7145c();
        hVar.f5005d = Long.valueOf(System.currentTimeMillis());
        hVar.f5007f = UUID.fromString(string);
        return hVar;
    }

    /* renamed from: a */
    public long mo5849a() {
        Long l = this.f5005d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public void mo5850a(Long l) {
        this.f5003b = l;
    }

    /* renamed from: b */
    public int mo5851b() {
        return this.f5004c;
    }

    /* renamed from: c */
    public UUID mo5852c() {
        return this.f5007f;
    }

    /* renamed from: d */
    public Long mo5853d() {
        return this.f5003b;
    }

    /* renamed from: e */
    public long mo5854e() {
        if (this.f5002a != null) {
            Long l = this.f5003b;
            if (l != null) {
                return l.longValue() - this.f5002a.longValue();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public C1624j mo5855f() {
        return this.f5006e;
    }

    /* renamed from: g */
    public void mo5856g() {
        this.f5004c++;
    }

    /* renamed from: h */
    public void mo5857h() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f5002a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f5003b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f5004c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f5007f.toString());
        edit.apply();
        C1624j jVar = this.f5006e;
        if (jVar != null) {
            jVar.mo5858a();
        }
    }
}
