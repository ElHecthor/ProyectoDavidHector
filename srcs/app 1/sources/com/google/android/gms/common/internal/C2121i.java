package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class C2121i {

    /* renamed from: a */
    private static final Object f6064a = new Object();

    /* renamed from: b */
    private static C2121i f6065b;

    /* renamed from: com.google.android.gms.common.internal.i$a */
    protected static final class C2122a {

        /* renamed from: f */
        private static final Uri f6066f = new Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        private final String f6067a;

        /* renamed from: b */
        private final String f6068b;

        /* renamed from: c */
        private final ComponentName f6069c = null;

        /* renamed from: d */
        private final int f6070d;

        /* renamed from: e */
        private final boolean f6071e;

        public C2122a(String str, String str2, int i, boolean z) {
            C2148s.m8844b(str);
            this.f6067a = str;
            C2148s.m8844b(str2);
            this.f6068b = str2;
            this.f6070d = i;
            this.f6071e = z;
        }

        /* renamed from: a */
        public final ComponentName mo6892a() {
            return this.f6069c;
        }

        /* renamed from: a */
        public final Intent mo6893a(Context context) {
            if (this.f6067a == null) {
                return new Intent().setComponent(this.f6069c);
            }
            Intent intent = null;
            if (this.f6071e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.f6067a);
                Bundle call = context.getContentResolver().call(f6066f, "serviceIntentCall", null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String str = "Dynamic lookup for intent failed for action: ";
                    String valueOf = String.valueOf(this.f6067a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            return intent == null ? new Intent(this.f6067a).setPackage(this.f6068b) : intent;
        }

        /* renamed from: b */
        public final String mo6894b() {
            return this.f6068b;
        }

        /* renamed from: c */
        public final int mo6895c() {
            return this.f6070d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2122a)) {
                return false;
            }
            C2122a aVar = (C2122a) obj;
            return C2141q.m8823a(this.f6067a, aVar.f6067a) && C2141q.m8823a(this.f6068b, aVar.f6068b) && C2141q.m8823a(this.f6069c, aVar.f6069c) && this.f6070d == aVar.f6070d && this.f6071e == aVar.f6071e;
        }

        public final int hashCode() {
            return C2141q.m8821a(this.f6067a, this.f6068b, this.f6069c, Integer.valueOf(this.f6070d), Boolean.valueOf(this.f6071e));
        }

        public final String toString() {
            String str = this.f6067a;
            return str == null ? this.f6069c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static C2121i m8768a(Context context) {
        synchronized (f6064a) {
            if (f6065b == null) {
                f6065b = new C2131l0(context.getApplicationContext());
            }
        }
        return f6065b;
    }

    /* renamed from: a */
    public final void mo6889a(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo6891b(new C2122a(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo6890a(C2122a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6891b(C2122a aVar, ServiceConnection serviceConnection, String str);
}
