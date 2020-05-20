package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.C2983v0.C2984a;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p071f.p088e.C3175g;
import p147g.p156d.p157a.p167b.p184g.C4351i;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.iid.x */
final class C2987x {

    /* renamed from: g */
    private static int f8551g;

    /* renamed from: h */
    private static PendingIntent f8552h;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    private final C3175g<String, C4351i<Bundle>> f8553a = new C3175g<>();

    /* renamed from: b */
    private final Context f8554b;

    /* renamed from: c */
    private final C2974r f8555c;

    /* renamed from: d */
    private Messenger f8556d;

    /* renamed from: e */
    private Messenger f8557e;

    /* renamed from: f */
    private C2983v0 f8558f;

    public C2987x(Context context, C2974r rVar) {
        this.f8554b = context;
        this.f8555c = rVar;
        this.f8556d = new Messenger(new C2929a0(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    private static synchronized String m12200a() {
        String num;
        synchronized (C2987x.class) {
            int i = f8551g;
            f8551g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    private static synchronized void m12201a(Context context, Intent intent) {
        synchronized (C2987x.class) {
            if (f8552h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f8552h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f8552h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12202a(Message message) {
        String str;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2984a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C2983v0) {
                        this.f8558f = (C2983v0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f8557e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str2 = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        str = sb.toString();
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str3 = "Received InstanceID error ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str4 = split[2];
                                    String str5 = split[3];
                                    if (str5.startsWith(":")) {
                                        str5 = str5.substring(1);
                                    }
                                    m12204a(str4, intent2.putExtra("error", str5).getExtras());
                                }
                            }
                            String str6 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            str = valueOf4.length() != 0 ? str6.concat(valueOf4) : new String(str6);
                        } else {
                            synchronized (this.f8553a) {
                                for (int i = 0; i < this.f8553a.size(); i++) {
                                    m12204a((String) this.f8553a.mo10271b(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                    Log.w("FirebaseInstanceId", str);
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str7 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? str7.concat(valueOf5) : new String(str7));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m12204a(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: a */
    private final void m12204a(String str, Bundle bundle) {
        synchronized (this.f8553a) {
            C4351i iVar = (C4351i) this.f8553a.remove(str);
            if (iVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            iVar.mo13027a(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m12205b(Bundle bundle) {
        Bundle c = m12206c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        Bundle c2 = m12206c(bundle);
        if (c2 == null || !c2.containsKey(str)) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m12206c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = m12200a()
            g.d.a.b.g.i r1 = new g.d.a.b.g.i
            r1.<init>()
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r2 = r7.f8553a
            monitor-enter(r2)
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r3 = r7.f8553a     // Catch:{ all -> 0x0123 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0123 }
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
            com.google.firebase.iid.r r2 = r7.f8555c
            int r2 = r2.mo9690b()
            if (r2 == 0) goto L_0x011b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.r r3 = r7.f8555c
            int r3 = r3.mo9690b()
            r4 = 2
            if (r3 != r4) goto L_0x0030
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x0032:
            r2.setAction(r3)
            r2.putExtras(r8)
            android.content.Context r8 = r7.f8554b
            m12201a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0093
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0093:
            android.os.Messenger r3 = r7.f8556d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f8557e
            if (r3 != 0) goto L_0x00a2
            com.google.firebase.iid.v0 r3 = r7.f8558f
            if (r3 == 0) goto L_0x00c8
        L_0x00a2:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f8557e     // Catch:{ RemoteException -> 0x00b8 }
            if (r5 == 0) goto L_0x00b2
            android.os.Messenger r5 = r7.f8557e     // Catch:{ RemoteException -> 0x00b8 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00db
        L_0x00b2:
            com.google.firebase.iid.v0 r5 = r7.f8558f     // Catch:{ RemoteException -> 0x00b8 }
            r5.mo9697a(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00db
        L_0x00b8:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00c8
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00c8:
            com.google.firebase.iid.r r8 = r7.f8555c
            int r8 = r8.mo9690b()
            if (r8 != r4) goto L_0x00d6
            android.content.Context r8 = r7.f8554b
            r8.sendBroadcast(r2)
            goto L_0x00db
        L_0x00d6:
            android.content.Context r8 = r7.f8554b
            r8.startService(r2)
        L_0x00db:
            g.d.a.b.g.h r8 = r1.mo13025a()     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            java.lang.Object r8 = p147g.p156d.p157a.p167b.p184g.C4354k.m17759a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r1 = r7.f8553a
            monitor-enter(r1)
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r2 = r7.f8553a     // Catch:{ all -> 0x00f3 }
            r2.remove(r0)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return r8
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            throw r8
        L_0x00f6:
            r8 = move-exception
            goto L_0x010e
        L_0x00f8:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f6 }
            r1.<init>(r8)     // Catch:{ all -> 0x00f6 }
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00ff:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00f6 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00f6 }
            throw r8     // Catch:{ all -> 0x00f6 }
        L_0x010e:
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r1 = r7.f8553a
            monitor-enter(r1)
            f.e.g<java.lang.String, g.d.a.b.g.i<android.os.Bundle>> r2 = r7.f8553a     // Catch:{ all -> 0x0118 }
            r2.remove(r0)     // Catch:{ all -> 0x0118 }
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r8
        L_0x0118:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r8
        L_0x011b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0123:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2987x.m12206c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo9705a(Bundle bundle) {
        if (this.f8555c.mo9693e() < 12000000) {
            return m12205b(bundle);
        }
        try {
            return (Bundle) C4354k.m17758a(C2940e.m12126a(this.f8554b).mo9642b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if (!(e.getCause() instanceof C2970p) || ((C2970p) e.getCause()).mo9684a() != 4) {
                return null;
            }
            return m12205b(bundle);
        }
    }
}
