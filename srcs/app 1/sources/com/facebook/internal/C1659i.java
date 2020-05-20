package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.i */
public class C1659i extends C1704x {

    /* renamed from: u */
    private static final String f5065u = C1659i.class.getName();

    /* renamed from: t */
    private boolean f5066t;

    /* renamed from: com.facebook.internal.i$a */
    class C1660a implements Runnable {
        C1660a() {
        }

        public void run() {
            C1659i.super.cancel();
        }
    }

    private C1659i(Context context, String str, String str2) {
        super(context, str);
        mo5954b(str2);
    }

    /* renamed from: a */
    public static C1659i m7220a(Context context, String str, String str2) {
        C1704x.m7437a(context);
        return new C1659i(context, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo5897a(String str) {
        Bundle e = C1698v.m7407e(Uri.parse(str).getQuery());
        String str2 = "bridge_args";
        String string = e.getString(str2);
        e.remove(str2);
        String str3 = "Unable to parse bridge_args JSON";
        if (!C1698v.m7401c(string)) {
            try {
                e.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C1638c.m7184a(new JSONObject(string)));
            } catch (JSONException e2) {
                C1698v.m7381a(f5065u, str3, (Throwable) e2);
            }
        }
        String str4 = "method_results";
        String string2 = e.getString(str4);
        e.remove(str4);
        if (!C1698v.m7401c(string2)) {
            if (C1698v.m7401c(string2)) {
                string2 = "{}";
            }
            try {
                e.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C1638c.m7184a(new JSONObject(string2)));
            } catch (JSONException e3) {
                C1698v.m7381a(f5065u, str3, (Throwable) e3);
            }
        }
        e.remove("version");
        e.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C1683q.m7317f());
        return e;
    }

    public void cancel() {
        WebView a = mo5950a();
        if (!mo5956c() || mo5955b() || a == null || !a.isShown()) {
            super.cancel();
        } else if (!this.f5066t) {
            this.f5066t = true;
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            a.loadUrl(sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new C1660a(), 1500);
        }
    }
}
