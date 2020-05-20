package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2197l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.iid.c */
public final class C2934c implements C2938d0 {

    /* renamed from: c */
    private static final Object f8453c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static C2962l0 f8454d;

    /* renamed from: a */
    private final Context f8455a;

    /* renamed from: b */
    private final ExecutorService f8456b;

    public C2934c(Context context, ExecutorService executorService) {
        this.f8455a = context;
        this.f8456b = executorService;
    }

    /* renamed from: a */
    private static C2962l0 m12103a(Context context, String str) {
        C2962l0 l0Var;
        synchronized (f8453c) {
            if (f8454d == null) {
                f8454d = new C2962l0(context, str);
            }
            l0Var = f8454d;
        }
        return l0Var;
    }

    /* renamed from: a */
    static final /* synthetic */ C4350h m12104a(Context context, Intent intent, C4350h hVar) {
        return (!C2197l.m9007j() || ((Integer) hVar.mo13016b()).intValue() != 402) ? hVar : m12107b(context, intent).mo13005a(C2979t0.m12191a(), C2973q0.f8531a);
    }

    /* renamed from: b */
    private static C4350h<Integer> m12107b(Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Binding to service");
        }
        return m12103a(context, "com.google.firebase.MESSAGING_EVENT").mo9676a(intent).mo13005a(C2979t0.m12191a(), C2975r0.f8537a);
    }

    /* renamed from: a */
    public final C4350h<Integer> mo9634a(Intent intent) {
        String str = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str);
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str);
        }
        Context context = this.f8455a;
        boolean z2 = C2197l.m9007j() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        return (!z2 || z) ? C4354k.m17757a((Executor) this.f8456b, (Callable<TResult>) new C2971p0<TResult>(context, intent)).mo13015b(this.f8456b, new C2969o0(context, intent)) : m12107b(context, intent);
    }
}
