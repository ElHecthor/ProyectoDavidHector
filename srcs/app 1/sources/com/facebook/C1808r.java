package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C1698v;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.r */
public class C1808r extends AsyncTask<Void, Void, List<C1842t>> {

    /* renamed from: d */
    private static final String f5413d = C1808r.class.getCanonicalName();

    /* renamed from: a */
    private final HttpURLConnection f5414a;

    /* renamed from: b */
    private final C1809s f5415b;

    /* renamed from: c */
    private Exception f5416c;

    public C1808r(C1809s sVar) {
        this(null, sVar);
    }

    public C1808r(HttpURLConnection httpURLConnection, C1809s sVar) {
        this.f5415b = sVar;
        this.f5414a = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C1842t> doInBackground(Void... voidArr) {
        try {
            return this.f5414a == null ? this.f5415b.mo6221c() : C1797q.m7770a(this.f5414a, this.f5415b);
        } catch (Exception e) {
            this.f5416c = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<C1842t> list) {
        super.onPostExecute(list);
        Exception exc = this.f5416c;
        if (exc != null) {
            C1698v.m7399c(f5413d, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        if (C1787m.m7756q()) {
            C1698v.m7399c(f5413d, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f5415b.mo6228h() == null) {
            this.f5415b.mo6215a(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.f5414a);
        sb.append(", requests: ");
        sb.append(this.f5415b);
        sb.append("}");
        return sb.toString();
    }
}
