package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C1499a;
import com.facebook.C1630h;
import com.facebook.C1631i;
import com.facebook.C1728j;
import com.facebook.C1729k;
import com.facebook.C1730l;
import com.facebook.C1787m;
import com.facebook.C1795o;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.common.C1514a;
import com.facebook.common.C1517d;
import com.facebook.common.C1518e;
import com.facebook.share.p045a.C1820c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.x */
public class C1704x extends Dialog {

    /* renamed from: r */
    private static final int f5173r = C1518e.com_facebook_activity_theme;

    /* renamed from: s */
    private static volatile int f5174s;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f5175f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f5176g;

    /* renamed from: h */
    private C1711g f5177h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public WebView f5178i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ProgressDialog f5179j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ImageView f5180k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public FrameLayout f5181l;

    /* renamed from: m */
    private C1712h f5182m;

    /* renamed from: n */
    private boolean f5183n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5184o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f5185p;

    /* renamed from: q */
    private LayoutParams f5186q;

    /* renamed from: com.facebook.internal.x$a */
    class C1705a implements OnCancelListener {
        C1705a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C1704x.this.cancel();
        }
    }

    /* renamed from: com.facebook.internal.x$b */
    class C1706b implements OnClickListener {
        C1706b() {
        }

        public void onClick(View view) {
            C1704x.this.cancel();
        }
    }

    /* renamed from: com.facebook.internal.x$c */
    class C1707c extends WebView {
        C1707c(C1704x xVar, Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: com.facebook.internal.x$d */
    class C1708d implements OnTouchListener {
        C1708d(C1704x xVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            return false;
        }
    }

    /* renamed from: com.facebook.internal.x$e */
    public static class C1709e {

        /* renamed from: a */
        private Context f5189a;

        /* renamed from: b */
        private String f5190b;

        /* renamed from: c */
        private String f5191c;

        /* renamed from: d */
        private int f5192d;

        /* renamed from: e */
        private C1711g f5193e;

        /* renamed from: f */
        private Bundle f5194f;

        /* renamed from: g */
        private C1499a f5195g;

        public C1709e(Context context, String str, Bundle bundle) {
            this.f5195g = C1499a.m6759r();
            if (!C1499a.m6760s()) {
                String c = C1698v.m7397c(context);
                if (c != null) {
                    this.f5190b = c;
                } else {
                    throw new C1631i("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m7457a(context, str, bundle);
        }

        public C1709e(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = C1698v.m7397c(context);
            }
            C1703w.m7424a(str, "applicationId");
            this.f5190b = str;
            m7457a(context, str2, bundle);
        }

        /* renamed from: a */
        private void m7457a(Context context, String str, Bundle bundle) {
            this.f5189a = context;
            this.f5191c = str;
            if (bundle != null) {
                this.f5194f = bundle;
            } else {
                this.f5194f = new Bundle();
            }
        }

        /* renamed from: a */
        public C1709e mo5970a(C1711g gVar) {
            this.f5193e = gVar;
            return this;
        }

        /* renamed from: a */
        public C1704x mo5971a() {
            C1499a aVar = this.f5195g;
            String str = "app_id";
            if (aVar != null) {
                this.f5194f.putString(str, aVar.mo5681a());
                this.f5194f.putString("access_token", this.f5195g.mo5692i());
            } else {
                this.f5194f.putString(str, this.f5190b);
            }
            return C1704x.m7433a(this.f5189a, this.f5191c, this.f5194f, this.f5192d, this.f5193e);
        }

        /* renamed from: b */
        public String mo5972b() {
            return this.f5190b;
        }

        /* renamed from: c */
        public Context mo5973c() {
            return this.f5189a;
        }

        /* renamed from: d */
        public C1711g mo5974d() {
            return this.f5193e;
        }

        /* renamed from: e */
        public Bundle mo5975e() {
            return this.f5194f;
        }

        /* renamed from: f */
        public int mo5976f() {
            return this.f5192d;
        }
    }

    /* renamed from: com.facebook.internal.x$f */
    private class C1710f extends WebViewClient {
        private C1710f() {
        }

        /* synthetic */ C1710f(C1704x xVar, C1705a aVar) {
            this();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C1704x.this.f5184o) {
                C1704x.this.f5179j.dismiss();
            }
            C1704x.this.f5181l.setBackgroundColor(0);
            C1704x.this.f5178i.setVisibility(0);
            C1704x.this.f5180k.setVisibility(0);
            C1704x.this.f5185p = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append("Webview loading URL: ");
            sb.append(str);
            C1698v.m7399c("FacebookSDK.WebDialog", sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!C1704x.this.f5184o) {
                C1704x.this.f5179j.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C1704x.this.mo5953a((Throwable) new C1630h(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C1704x.this.mo5953a((Throwable) new C1630h(null, -11, null));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("Redirect URL: ");
            sb.append(str);
            C1698v.m7399c("FacebookSDK.WebDialog", sb.toString());
            if (str.startsWith(C1704x.this.f5176g)) {
                Bundle a = C1704x.this.mo5897a(str);
                String string = a.getString("error");
                if (string == null) {
                    string = a.getString("error_type");
                }
                String string2 = a.getString("error_msg");
                if (string2 == null) {
                    string2 = a.getString("error_message");
                }
                if (string2 == null) {
                    string2 = a.getString("error_description");
                }
                String string3 = a.getString("error_code");
                if (!C1698v.m7401c(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!C1698v.m7401c(string) && C1698v.m7401c(string2) && i == -1) {
                        C1704x.this.mo5951a(a);
                    } else if ((string != null || (!string.equals("access_denied") && !string.equals("OAuthAccessDeniedException"))) && i != 4201) {
                        C1704x.this.mo5953a((Throwable) new C1795o(new C1730l(i, string, string2), string2));
                    } else {
                        C1704x.this.cancel();
                    }
                    return true;
                }
                i = -1;
                if (!C1698v.m7401c(string)) {
                }
                if (string != null) {
                }
                C1704x.this.mo5953a((Throwable) new C1795o(new C1730l(i, string, string2), string2));
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                C1704x.this.cancel();
                return true;
            } else if (str.contains("touch")) {
                return false;
            } else {
                try {
                    C1704x.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.x$g */
    public interface C1711g {
        /* renamed from: a */
        void mo5894a(Bundle bundle, C1631i iVar);
    }

    /* renamed from: com.facebook.internal.x$h */
    private class C1712h extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private String f5197a;

        /* renamed from: b */
        private Bundle f5198b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f5199c;

        /* renamed from: com.facebook.internal.x$h$a */
        class C1713a implements C1802e {

            /* renamed from: a */
            final /* synthetic */ String[] f5201a;

            /* renamed from: b */
            final /* synthetic */ int f5202b;

            /* renamed from: c */
            final /* synthetic */ CountDownLatch f5203c;

            C1713a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f5201a = strArr;
                this.f5202b = i;
                this.f5203c = countDownLatch;
            }

            /* renamed from: a */
            public void mo5725a(C1842t tVar) {
                try {
                    C1730l a = tVar.mo6290a();
                    String str = "Error staging photo.";
                    if (a != null) {
                        String b = a.mo6006b();
                        if (b != null) {
                            str = b;
                        }
                        throw new C1728j(tVar, str);
                    }
                    JSONObject b2 = tVar.mo6291b();
                    if (b2 != null) {
                        String optString = b2.optString("uri");
                        if (optString != null) {
                            this.f5201a[this.f5202b] = optString;
                            this.f5203c.countDown();
                            return;
                        }
                        throw new C1631i(str);
                    }
                    throw new C1631i(str);
                } catch (Exception e) {
                    C1712h.this.f5199c[this.f5202b] = e;
                }
            }
        }

        C1712h(String str, Bundle bundle) {
            this.f5197a = str;
            this.f5198b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            Exception[] excArr;
            C1704x.this.f5179j.dismiss();
            for (Exception exc : this.f5199c) {
                if (exc != null) {
                    C1704x.this.mo5953a((Throwable) exc);
                    return;
                }
            }
            String str = "Failed to stage photos for web dialog";
            if (strArr == null) {
                C1704x.this.mo5953a((Throwable) new C1631i(str));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                C1704x.this.mo5953a((Throwable) new C1631i(str));
                return;
            }
            C1698v.m7386a(this.f5198b, "media", (Object) new JSONArray(asList));
            String b = C1696t.m7348b();
            StringBuilder sb = new StringBuilder();
            sb.append(C1787m.m7753n());
            sb.append("/");
            sb.append("dialog/");
            sb.append(this.f5197a);
            C1704x.this.f5175f = C1698v.m7356a(b, sb.toString(), this.f5198b).toString();
            C1704x.this.m7436a((C1704x.this.f5180k.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f5198b.getStringArray("media");
            String[] strArr = new String[stringArray.length];
            this.f5199c = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            C1499a r = C1499a.m6759r();
            int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C1698v.m7405d(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C1820c.m7886a(r, parse, (C1802e) new C1713a(strArr, i, countDownLatch)).mo6175b());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }
    }

    protected C1704x(Context context, String str) {
        this(context, str, m7446f());
    }

    private C1704x(Context context, String str, int i) {
        if (i == 0) {
            i = m7446f();
        }
        super(context, i);
        this.f5176g = "fbconnect://success";
        this.f5183n = false;
        this.f5184o = false;
        this.f5185p = false;
        this.f5175f = str;
    }

    private C1704x(Context context, String str, Bundle bundle, int i, C1711g gVar) {
        if (i == 0) {
            i = m7446f();
        }
        super(context, i);
        String str2 = "fbconnect://success";
        this.f5176g = str2;
        this.f5183n = false;
        this.f5184o = false;
        this.f5185p = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C1698v.m7408e(context)) {
            str2 = "fbconnect://chrome_os_success";
        }
        this.f5176g = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C1787m.m7745f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C1787m.m7755p()}));
        this.f5177h = gVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String b = C1696t.m7348b();
            StringBuilder sb = new StringBuilder();
            sb.append(C1787m.m7753n());
            sb.append("/");
            sb.append("dialog/");
            sb.append(str);
            this.f5175f = C1698v.m7356a(b, sb.toString(), bundle).toString();
            return;
        }
        this.f5182m = new C1712h(str, bundle);
    }

    /* renamed from: a */
    private int m7432a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d);
    }

    /* renamed from: a */
    public static C1704x m7433a(Context context, String str, Bundle bundle, int i, C1711g gVar) {
        m7437a(context);
        C1704x xVar = new C1704x(context, str, bundle, i, gVar);
        return xVar;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void m7436a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C1707c cVar = new C1707c(this, getContext());
        this.f5178i = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f5178i.setHorizontalScrollBarEnabled(false);
        this.f5178i.setWebViewClient(new C1710f(this, null));
        this.f5178i.getSettings().setJavaScriptEnabled(true);
        this.f5178i.loadUrl(this.f5175f);
        this.f5178i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f5178i.setVisibility(4);
        this.f5178i.getSettings().setSavePassword(false);
        this.f5178i.getSettings().setSaveFormData(false);
        this.f5178i.setFocusable(true);
        this.f5178i.setFocusableInTouchMode(true);
        this.f5178i.setOnTouchListener(new C1708d(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f5178i);
        linearLayout.setBackgroundColor(-872415232);
        this.f5181l.addView(linearLayout);
    }

    /* renamed from: a */
    protected static void m7437a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || f5174s != 0)) {
                    m7440b(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m7440b(int i) {
        if (i == 0) {
            i = f5173r;
        }
        f5174s = i;
    }

    /* renamed from: e */
    private void m7445e() {
        ImageView imageView = new ImageView(getContext());
        this.f5180k = imageView;
        imageView.setOnClickListener(new C1706b());
        this.f5180k.setImageDrawable(getContext().getResources().getDrawable(C1514a.com_facebook_close));
        this.f5180k.setVisibility(4);
    }

    /* renamed from: f */
    public static int m7446f() {
        C1703w.m7430c();
        return f5174s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo5897a(String str) {
        Uri parse = Uri.parse(str);
        Bundle e = C1698v.m7407e(parse.getQuery());
        e.putAll(C1698v.m7407e(parse.getFragment()));
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebView mo5950a() {
        return this.f5178i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5951a(Bundle bundle) {
        C1711g gVar = this.f5177h;
        if (gVar != null && !this.f5183n) {
            this.f5183n = true;
            gVar.mo5894a(bundle, null);
            dismiss();
        }
    }

    /* renamed from: a */
    public void mo5952a(C1711g gVar) {
        this.f5177h = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5953a(Throwable th) {
        if (this.f5177h != null && !this.f5183n) {
            this.f5183n = true;
            this.f5177h.mo5894a(null, th instanceof C1631i ? (C1631i) th : new C1631i(th));
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5954b(String str) {
        this.f5176g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo5955b() {
        return this.f5183n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5956c() {
        return this.f5185p;
    }

    public void cancel() {
        if (this.f5177h != null && !this.f5183n) {
            mo5953a((Throwable) new C1729k());
        }
    }

    /* renamed from: d */
    public void mo5957d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i >= i2) {
            i = i2;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 < i4) {
            i3 = i4;
        }
        getWindow().setLayout(Math.min(m7432a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m7432a(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    public void dismiss() {
        WebView webView = this.f5178i;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f5184o) {
            ProgressDialog progressDialog = this.f5179j;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f5179j.dismiss();
            }
        }
        super.dismiss();
    }

    public void onAttachedToWindow() {
        this.f5184o = false;
        if (C1698v.m7411f(getContext())) {
            LayoutParams layoutParams = this.f5186q;
            if (layoutParams != null && layoutParams.token == null) {
                layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                sb.append(this.f5186q.token);
                C1698v.m7399c("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f5179j = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f5179j.setMessage(getContext().getString(C1517d.com_facebook_loading));
        this.f5179j.setCanceledOnTouchOutside(false);
        this.f5179j.setOnCancelListener(new C1705a());
        requestWindowFeature(1);
        this.f5181l = new FrameLayout(getContext());
        mo5957d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m7445e();
        if (this.f5175f != null) {
            m7436a((this.f5180k.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f5181l.addView(this.f5180k, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f5181l);
    }

    public void onDetachedFromWindow() {
        this.f5184o = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C1712h hVar = this.f5182m;
        if (hVar == null || hVar.getStatus() != Status.PENDING) {
            mo5957d();
            return;
        }
        this.f5182m.execute(new Void[0]);
        this.f5179j.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C1712h hVar = this.f5182m;
        if (hVar != null) {
            hVar.cancel(true);
            this.f5179j.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f5186q = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
