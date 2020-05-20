package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.b0 */
final class C3052b0 {

    /* renamed from: a */
    private final SharedPreferences f8674a;

    /* renamed from: b */
    private final String f8675b;

    /* renamed from: c */
    private final String f8676c;

    /* renamed from: d */
    private final ArrayDeque<String> f8677d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f8678e;

    private C3052b0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8674a = sharedPreferences;
        this.f8675b = str;
        this.f8676c = str2;
        this.f8678e = executor;
    }

    /* renamed from: a */
    static C3052b0 m12417a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C3052b0 b0Var = new C3052b0(sharedPreferences, str, str2, executor);
        synchronized (b0Var.f8677d) {
            b0Var.f8677d.clear();
            String string = b0Var.f8674a.getString(b0Var.f8675b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(b0Var.f8676c)) {
                    String[] split = string.split(b0Var.f8676c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            b0Var.f8677d.add(str3);
                        }
                    }
                }
            }
        }
        return b0Var;
    }

    /* renamed from: a */
    private final boolean m12418a(boolean z) {
        if (z) {
            this.f8678e.execute(new C3050a0(this));
        }
        return z;
    }

    /* renamed from: a */
    public final String mo9821a() {
        String str;
        synchronized (this.f8677d) {
            str = (String) this.f8677d.peek();
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo9822a(Object obj) {
        boolean remove;
        synchronized (this.f8677d) {
            remove = this.f8677d.remove(obj);
            m12418a(remove);
        }
        return remove;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9823b() {
        synchronized (this.f8677d) {
            Editor edit = this.f8674a.edit();
            String str = this.f8675b;
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f8677d.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(this.f8676c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }
}
