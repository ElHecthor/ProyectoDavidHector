package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0358i.C0361c;
import androidx.core.app.C0358i.C0363e;
import androidx.core.app.C0358i.C0364f;
import androidx.fragment.app.C0429d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C2019c0;
import com.google.android.gms.common.api.internal.C2022d0;
import com.google.android.gms.common.api.internal.C2034i;
import com.google.android.gms.common.internal.C2113e;
import com.google.android.gms.common.internal.C2115f;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2194i;
import com.google.android.gms.common.util.C2197l;
import p147g.p156d.p157a.p167b.p171b.C3849a;
import p147g.p156d.p157a.p167b.p171b.C3850b;
import p147g.p156d.p157a.p167b.p173d.p177d.C3878d;

/* renamed from: com.google.android.gms.common.e */
public class C2084e extends C2087f {

    /* renamed from: d */
    private static final Object f5977d = new Object();

    /* renamed from: e */
    private static final C2084e f5978e = new C2084e();

    /* renamed from: c */
    private String f5979c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.e$a */
    private class C2085a extends C3878d {

        /* renamed from: a */
        private final Context f5980a;

        public C2085a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f5980a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int b = C2084e.this.mo6806b(this.f5980a);
            if (C2084e.this.mo6808b(b)) {
                C2084e.this.mo6807b(this.f5980a, b);
            }
        }
    }

    /* renamed from: a */
    public static Dialog m8610a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2113e.m8749b(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        m8613a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    static Dialog m8611a(Context context, int i, C2115f fVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C2113e.m8749b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = C2113e.m8745a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, fVar);
        }
        String e = C2113e.m8752e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    public static C2084e m8612a() {
        return f5978e;
    }

    /* renamed from: a */
    static void m8613a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C0429d) {
            C2167l.m8919a(dialog, onCancelListener).mo2649a(((C0429d) activity).mo2666l(), str);
            return;
        }
        C2080c.m8606a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m8614a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo6810c(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String d = C2113e.m8751d(context, i);
            String c = C2113e.m8750c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0363e eVar = new C0363e(context);
            eVar.mo2210b(true);
            eVar.mo2204a(true);
            eVar.mo2209b((CharSequence) d);
            C0361c cVar = new C0361c();
            cVar.mo2191a((CharSequence) c);
            eVar.mo2201a((C0364f) cVar);
            if (C2194i.m8991b(context)) {
                C2148s.m8845b(C2197l.m9004g());
                eVar.mo2215e(context.getApplicationInfo().icon);
                eVar.mo2214d(2);
                if (C2194i.m8992c(context)) {
                    eVar.mo2196a(C3849a.common_full_open_on_phone, (CharSequence) resources.getString(C3850b.common_open_on_phone), pendingIntent);
                } else {
                    eVar.mo2198a(pendingIntent);
                }
            } else {
                eVar.mo2215e(17301642);
                eVar.mo2212c((CharSequence) resources.getString(C3850b.common_google_play_services_notification_ticker));
                eVar.mo2197a(System.currentTimeMillis());
                eVar.mo2198a(pendingIntent);
                eVar.mo2202a((CharSequence) c);
            }
            if (C2197l.m9007j()) {
                C2148s.m8845b(C2197l.m9007j());
                String b = m8615b();
                if (b == null) {
                    b = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
                    String b2 = C2113e.m8748b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(b, b2, 4);
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.mo2203a(b);
            }
            Notification a = eVar.mo2193a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C2090i.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        }
    }

    /* renamed from: b */
    private final String m8615b() {
        String str;
        synchronized (f5977d) {
            str = this.f5979c;
        }
        return str;
    }

    /* renamed from: a */
    public int mo6797a(Context context, int i) {
        return super.mo6797a(context, i);
    }

    /* renamed from: a */
    public Dialog mo6798a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m8611a((Context) activity, i, C2115f.m8754a(activity, mo6801a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public PendingIntent mo6799a(Context context, int i, int i2) {
        return super.mo6799a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo6800a(Context context, C2078b bVar) {
        return bVar.mo6779h() ? bVar.mo6778g() : mo6799a(context, bVar.mo6775e(), 0);
    }

    /* renamed from: a */
    public Intent mo6801a(Context context, int i, String str) {
        return super.mo6801a(context, i, str);
    }

    /* renamed from: a */
    public final C2022d0 mo6802a(Context context, C2019c0 c0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2022d0 d0Var = new C2022d0(c0Var);
        context.registerReceiver(d0Var, intentFilter);
        d0Var.mo6678a(context);
        if (mo6814a(context, "com.google.android.gms")) {
            return d0Var;
        }
        c0Var.mo6670a();
        d0Var.mo6677a();
        return null;
    }

    /* renamed from: a */
    public final String mo6803a(int i) {
        return super.mo6803a(i);
    }

    /* renamed from: a */
    public final boolean mo6804a(Activity activity, C2034i iVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m8611a((Context) activity, i, C2115f.m8756a(iVar, mo6801a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m8613a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public final boolean mo6805a(Context context, C2078b bVar, int i) {
        PendingIntent a = mo6800a(context, bVar);
        if (a == null) {
            return false;
        }
        m8614a(context, bVar.mo6775e(), (String) null, GoogleApiActivity.m8312a(context, a, i));
        return true;
    }

    /* renamed from: b */
    public int mo6806b(Context context) {
        return super.mo6806b(context);
    }

    /* renamed from: b */
    public void mo6807b(Context context, int i) {
        m8614a(context, i, (String) null, mo6813a(context, i, 0, "n"));
    }

    /* renamed from: b */
    public final boolean mo6808b(int i) {
        return super.mo6808b(i);
    }

    /* renamed from: b */
    public boolean mo6809b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo6798a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m8613a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6810c(Context context) {
        new C2085a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
