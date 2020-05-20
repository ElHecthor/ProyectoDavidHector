package p147g.p151b.p152a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0090g;
import androidx.core.graphics.drawable.C0371a;
import p071f.p097h.p098e.C3236a;

/* renamed from: g.b.a.g */
public class C3709g extends C0090g implements OnRatingBarChangeListener, OnClickListener {

    /* renamed from: h */
    private String f10496h = "RatingDialog";

    /* renamed from: i */
    private SharedPreferences f10497i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f10498j;

    /* renamed from: k */
    private C3712c f10499k;

    /* renamed from: l */
    private TextView f10500l;

    /* renamed from: m */
    private TextView f10501m;

    /* renamed from: n */
    private TextView f10502n;

    /* renamed from: o */
    private TextView f10503o;

    /* renamed from: p */
    private TextView f10504p;

    /* renamed from: q */
    private TextView f10505q;

    /* renamed from: r */
    private RatingBar f10506r;

    /* renamed from: s */
    private ImageView f10507s;

    /* renamed from: t */
    private EditText f10508t;

    /* renamed from: u */
    private LinearLayout f10509u;

    /* renamed from: v */
    private LinearLayout f10510v;

    /* renamed from: w */
    private float f10511w;

    /* renamed from: x */
    private int f10512x;

    /* renamed from: y */
    private boolean f10513y = true;

    /* renamed from: g.b.a.g$a */
    class C3710a implements C3715c {
        C3710a() {
        }

        /* renamed from: a */
        public void mo11789a(C3709g gVar, float f, boolean z) {
            C3709g gVar2 = C3709g.this;
            gVar2.m15146a(gVar2.f10498j);
            C3709g.this.dismiss();
        }
    }

    /* renamed from: g.b.a.g$b */
    class C3711b implements C3716d {
        C3711b() {
        }

        /* renamed from: a */
        public void mo11790a(C3709g gVar, float f, boolean z) {
            C3709g.this.m15151c();
        }
    }

    /* renamed from: g.b.a.g$c */
    public static class C3712c {

        /* renamed from: a */
        private final Context f10516a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f10517b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f10518c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f10519d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f10520e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f10521f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f10522g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f10523h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f10524i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f10525j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f10526k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f10527l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f10528m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f10529n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f10530o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f10531p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f10532q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C3715c f10533r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C3716d f10534s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public C3713a f10535t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public C3714b f10536u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public Drawable f10537v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public int f10538w = 1;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public float f10539x = 1.0f;

        /* renamed from: g.b.a.g$c$a */
        public interface C3713a {
            /* renamed from: a */
            void mo11797a(String str);
        }

        /* renamed from: g.b.a.g$c$b */
        public interface C3714b {
            /* renamed from: a */
            void mo11798a(float f, boolean z);
        }

        /* renamed from: g.b.a.g$c$c */
        public interface C3715c {
            /* renamed from: a */
            void mo11789a(C3709g gVar, float f, boolean z);
        }

        /* renamed from: g.b.a.g$c$d */
        public interface C3716d {
            /* renamed from: a */
            void mo11790a(C3709g gVar, float f, boolean z);
        }

        public C3712c(Context context) {
            this.f10516a = context;
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(context.getPackageName());
            this.f10520e = sb.toString();
            m15161b();
        }

        /* renamed from: b */
        private void m15161b() {
            this.f10517b = this.f10516a.getString(C3708f.rating_dialog_experience);
            this.f10518c = this.f10516a.getString(C3708f.rating_dialog_maybe_later);
            this.f10519d = this.f10516a.getString(C3708f.rating_dialog_never);
            this.f10521f = this.f10516a.getString(C3708f.rating_dialog_feedback_title);
            this.f10522g = this.f10516a.getString(C3708f.rating_dialog_submit);
            this.f10523h = this.f10516a.getString(C3708f.rating_dialog_cancel);
            this.f10524i = this.f10516a.getString(C3708f.rating_dialog_suggestions);
        }

        /* renamed from: a */
        public C3712c mo11791a(int i) {
            this.f10528m = i;
            return this;
        }

        /* renamed from: a */
        public C3712c mo11792a(String str) {
            this.f10519d = str;
            return this;
        }

        /* renamed from: a */
        public C3709g mo11793a() {
            return new C3709g(this.f10516a, this);
        }

        /* renamed from: b */
        public C3712c mo11794b(int i) {
            this.f10538w = i;
            return this;
        }

        /* renamed from: b */
        public C3712c mo11795b(String str) {
            this.f10518c = str;
            return this;
        }

        /* renamed from: c */
        public C3712c mo11796c(String str) {
            this.f10517b = str;
            return this;
        }
    }

    public C3709g(Context context, C3712c cVar) {
        super(context);
        this.f10498j = context;
        this.f10499k = cVar;
        this.f10512x = cVar.f10538w;
        this.f10511w = cVar.f10539x;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15146a(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10499k.f10520e)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, "Couldn't find PlayStore on this device", 0).show();
        }
    }

    /* renamed from: b */
    private void m15148b() {
        int i;
        Context context;
        int i2;
        Context context2;
        int i3;
        Context context3;
        int i4;
        Context context4;
        this.f10500l.setText(this.f10499k.f10517b);
        this.f10502n.setText(this.f10499k.f10518c);
        this.f10501m.setText(this.f10499k.f10519d);
        this.f10503o.setText(this.f10499k.f10521f);
        this.f10504p.setText(this.f10499k.f10522g);
        this.f10505q.setText(this.f10499k.f10523h);
        this.f10508t.setHint(this.f10499k.f10524i);
        TypedValue typedValue = new TypedValue();
        this.f10498j.getTheme().resolveAttribute(C3704b.colorAccent, typedValue, true);
        int i5 = typedValue.data;
        TextView textView = this.f10500l;
        if (this.f10499k.f10527l != 0) {
            context = this.f10498j;
            i = this.f10499k.f10527l;
        } else {
            context = this.f10498j;
            i = C3705c.black;
        }
        textView.setTextColor(C3236a.m13263a(context, i));
        this.f10502n.setTextColor(this.f10499k.f10525j != 0 ? C3236a.m13263a(this.f10498j, this.f10499k.f10525j) : i5);
        TextView textView2 = this.f10501m;
        if (this.f10499k.f10526k != 0) {
            context2 = this.f10498j;
            i2 = this.f10499k.f10526k;
        } else {
            context2 = this.f10498j;
            i2 = C3705c.grey_500;
        }
        textView2.setTextColor(C3236a.m13263a(context2, i2));
        TextView textView3 = this.f10503o;
        if (this.f10499k.f10527l != 0) {
            context3 = this.f10498j;
            i3 = this.f10499k.f10527l;
        } else {
            context3 = this.f10498j;
            i3 = C3705c.black;
        }
        textView3.setTextColor(C3236a.m13263a(context3, i3));
        TextView textView4 = this.f10504p;
        if (this.f10499k.f10525j != 0) {
            i5 = C3236a.m13263a(this.f10498j, this.f10499k.f10525j);
        }
        textView4.setTextColor(i5);
        TextView textView5 = this.f10505q;
        if (this.f10499k.f10526k != 0) {
            context4 = this.f10498j;
            i4 = this.f10499k.f10526k;
        } else {
            context4 = this.f10498j;
            i4 = C3705c.grey_500;
        }
        textView5.setTextColor(C3236a.m13263a(context4, i4));
        if (this.f10499k.f10530o != 0) {
            this.f10508t.setTextColor(C3236a.m13263a(this.f10498j, this.f10499k.f10530o));
        }
        if (this.f10499k.f10531p != 0) {
            this.f10502n.setBackgroundResource(this.f10499k.f10531p);
            this.f10504p.setBackgroundResource(this.f10499k.f10531p);
        }
        if (this.f10499k.f10532q != 0) {
            this.f10501m.setBackgroundResource(this.f10499k.f10532q);
            this.f10505q.setBackgroundResource(this.f10499k.f10532q);
        }
        if (this.f10499k.f10528m != 0) {
            if (VERSION.SDK_INT > 19) {
                LayerDrawable layerDrawable = (LayerDrawable) this.f10506r.getProgressDrawable();
                layerDrawable.getDrawable(2).setColorFilter(C3236a.m13263a(this.f10498j, this.f10499k.f10528m), Mode.SRC_ATOP);
                layerDrawable.getDrawable(1).setColorFilter(C3236a.m13263a(this.f10498j, this.f10499k.f10528m), Mode.SRC_ATOP);
                layerDrawable.getDrawable(0).setColorFilter(C3236a.m13263a(this.f10498j, this.f10499k.f10529n != 0 ? this.f10499k.f10529n : C3705c.grey_200), Mode.SRC_ATOP);
            } else {
                C0371a.m1906b(this.f10506r.getProgressDrawable(), C3236a.m13263a(this.f10498j, this.f10499k.f10528m));
            }
        }
        Drawable applicationIcon = this.f10498j.getPackageManager().getApplicationIcon(this.f10498j.getApplicationInfo());
        ImageView imageView = this.f10507s;
        if (this.f10499k.f10537v != null) {
            applicationIcon = this.f10499k.f10537v;
        }
        imageView.setImageDrawable(applicationIcon);
        this.f10506r.setOnRatingBarChangeListener(this);
        this.f10502n.setOnClickListener(this);
        this.f10501m.setOnClickListener(this);
        this.f10504p.setOnClickListener(this);
        this.f10505q.setOnClickListener(this);
        if (this.f10512x == 1) {
            this.f10501m.setVisibility(8);
        }
    }

    /* renamed from: b */
    private boolean m15150b(int i) {
        Editor edit;
        if (i == 1) {
            return true;
        }
        SharedPreferences sharedPreferences = this.f10498j.getSharedPreferences(this.f10496h, 0);
        this.f10497i = sharedPreferences;
        if (sharedPreferences.getBoolean("show_never", false)) {
            return false;
        }
        String str = "session_count";
        int i2 = this.f10497i.getInt(str, 1);
        if (i == i2) {
            Editor edit2 = this.f10497i.edit();
            edit2.putInt(str, 1);
            edit2.commit();
            return true;
        }
        if (i > i2) {
            int i3 = i2 + 1;
            edit = this.f10497i.edit();
            edit.putInt(str, i3);
        } else {
            edit = this.f10497i.edit();
            edit.putInt(str, 2);
        }
        edit.commit();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15151c() {
        this.f10503o.setVisibility(0);
        this.f10508t.setVisibility(0);
        this.f10510v.setVisibility(0);
        this.f10509u.setVisibility(8);
        this.f10507s.setVisibility(8);
        this.f10500l.setVisibility(8);
        this.f10506r.setVisibility(8);
    }

    /* renamed from: d */
    private void m15152d() {
        this.f10499k.f10533r = new C3710a();
    }

    /* renamed from: e */
    private void m15153e() {
        this.f10499k.f10534s = new C3711b();
    }

    /* renamed from: f */
    private void m15154f() {
        SharedPreferences sharedPreferences = this.f10498j.getSharedPreferences(this.f10496h, 0);
        this.f10497i = sharedPreferences;
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("show_never", true);
        edit.commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r3.getId() == p147g.p151b.p152a.C3706d.dialog_rating_button_feedback_cancel) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            int r0 = r3.getId()
            int r1 = p147g.p151b.p152a.C3706d.dialog_rating_button_negative
            if (r0 != r1) goto L_0x000f
        L_0x0008:
            r2.dismiss()
            r2.m15154f()
            goto L_0x0060
        L_0x000f:
            int r0 = r3.getId()
            int r1 = p147g.p151b.p152a.C3706d.dialog_rating_button_positive
            if (r0 != r1) goto L_0x001b
        L_0x0017:
            r2.dismiss()
            goto L_0x0060
        L_0x001b:
            int r0 = r3.getId()
            int r1 = p147g.p151b.p152a.C3706d.dialog_rating_button_feedback_submit
            if (r0 != r1) goto L_0x0057
            android.widget.EditText r3 = r2.f10508t
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0045
            android.content.Context r3 = r2.f10498j
            int r0 = p147g.p151b.p152a.C3703a.shake
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r0)
            android.widget.EditText r0 = r2.f10508t
            r0.startAnimation(r3)
            return
        L_0x0045:
            g.b.a.g$c r0 = r2.f10499k
            g.b.a.g$c$a r0 = r0.f10535t
            if (r0 == 0) goto L_0x0008
            g.b.a.g$c r0 = r2.f10499k
            g.b.a.g$c$a r0 = r0.f10535t
            r0.mo11797a(r3)
            goto L_0x0008
        L_0x0057:
            int r3 = r3.getId()
            int r0 = p147g.p151b.p152a.C3706d.dialog_rating_button_feedback_cancel
            if (r3 != r0) goto L_0x0060
            goto L_0x0017
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p151b.p152a.C3709g.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(C3707e.dialog_rating);
        this.f10500l = (TextView) findViewById(C3706d.dialog_rating_title);
        this.f10501m = (TextView) findViewById(C3706d.dialog_rating_button_negative);
        this.f10502n = (TextView) findViewById(C3706d.dialog_rating_button_positive);
        this.f10503o = (TextView) findViewById(C3706d.dialog_rating_feedback_title);
        this.f10504p = (TextView) findViewById(C3706d.dialog_rating_button_feedback_submit);
        this.f10505q = (TextView) findViewById(C3706d.dialog_rating_button_feedback_cancel);
        this.f10506r = (RatingBar) findViewById(C3706d.dialog_rating_rating_bar);
        this.f10507s = (ImageView) findViewById(C3706d.dialog_rating_icon);
        this.f10508t = (EditText) findViewById(C3706d.dialog_rating_feedback);
        this.f10509u = (LinearLayout) findViewById(C3706d.dialog_rating_buttons);
        this.f10510v = (LinearLayout) findViewById(C3706d.dialog_rating_feedback_buttons);
        m15148b();
    }

    public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        if (ratingBar.getRating() >= this.f10511w) {
            this.f10513y = true;
            if (this.f10499k.f10533r == null) {
                m15152d();
            }
            this.f10499k.f10533r.mo11789a(this, ratingBar.getRating(), this.f10513y);
        } else {
            this.f10513y = false;
            if (this.f10499k.f10534s == null) {
                m15153e();
            }
            this.f10499k.f10534s.mo11790a(this, ratingBar.getRating(), this.f10513y);
        }
        if (this.f10499k.f10536u != null) {
            this.f10499k.f10536u.mo11798a(ratingBar.getRating(), this.f10513y);
        }
        m15154f();
    }

    public void show() {
        if (m15150b(this.f10512x)) {
            super.show();
        }
    }
}
