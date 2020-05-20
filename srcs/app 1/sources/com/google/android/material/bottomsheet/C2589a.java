package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0090g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4415k;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C2589a extends C0090g {

    /* renamed from: h */
    private BottomSheetBehavior<FrameLayout> f7374h;

    /* renamed from: i */
    private FrameLayout f7375i;

    /* renamed from: j */
    boolean f7376j;

    /* renamed from: k */
    boolean f7377k = true;

    /* renamed from: l */
    private boolean f7378l = true;

    /* renamed from: m */
    private boolean f7379m;

    /* renamed from: n */
    private C2585e f7380n = new C2593d();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class C2590a implements OnClickListener {
        C2590a() {
        }

        public void onClick(View view) {
            C2589a aVar = C2589a.this;
            if (aVar.f7377k && aVar.isShowing() && C2589a.this.mo8138e()) {
                C2589a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class C2591b extends C3323a {
        C2591b() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            boolean z;
            super.mo2349a(view, cVar);
            if (C2589a.this.f7377k) {
                cVar.mo10740a(1048576);
                z = true;
            } else {
                z = false;
            }
            cVar.mo10769e(z);
        }

        /* renamed from: a */
        public boolean mo2350a(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C2589a aVar = C2589a.this;
                if (aVar.f7377k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo2350a(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class C2592c implements OnTouchListener {
        C2592c(C2589a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class C2593d extends C2585e {
        C2593d() {
        }

        /* renamed from: a */
        public void mo8128a(View view, float f) {
        }

        /* renamed from: a */
        public void mo8129a(View view, int i) {
            if (i == 5) {
                C2589a.this.cancel();
            }
        }
    }

    public C2589a(Context context, int i) {
        super(context, m10517a(context, i));
        mo363a(1);
    }

    /* renamed from: a */
    private static int m10517a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C4375b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C4415k.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: a */
    private View m10518a(int i, View view, LayoutParams layoutParams) {
        m10519f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7375i.findViewById(C4410f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f7375i.findViewById(C4410f.design_bottom_sheet);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C4410f.touch_outside).setOnClickListener(new C2590a());
        C3379v.m13788a((View) frameLayout, (C3323a) new C2591b());
        frameLayout.setOnTouchListener(new C2592c(this));
        return this.f7375i;
    }

    /* renamed from: f */
    private FrameLayout m10519f() {
        if (this.f7375i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C4412h.design_bottom_sheet_dialog, null);
            this.f7375i = frameLayout;
            BottomSheetBehavior<FrameLayout> b = BottomSheetBehavior.m10458b((FrameLayout) frameLayout.findViewById(C4410f.design_bottom_sheet));
            this.f7374h = b;
            b.mo8112a(this.f7380n);
            this.f7374h.mo8118b(this.f7377k);
        }
        return this.f7375i;
    }

    /* renamed from: b */
    public BottomSheetBehavior<FrameLayout> mo8134b() {
        if (this.f7374h == null) {
            m10519f();
        }
        return this.f7374h;
    }

    /* renamed from: c */
    public boolean mo8135c() {
        return this.f7376j;
    }

    public void cancel() {
        BottomSheetBehavior b = mo8134b();
        if (!this.f7376j || b.mo8115b() == 5) {
            super.cancel();
        } else {
            b.mo8123e(5);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8137d() {
        this.f7374h.mo8117b(this.f7380n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo8138e() {
        if (!this.f7379m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f7378l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f7379m = true;
        }
        return this.f7378l;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7374h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo8115b() == 5) {
            this.f7374h.mo8123e(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f7377k != z) {
            this.f7377k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7374h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo8118b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f7377k) {
            this.f7377k = true;
        }
        this.f7378l = z;
        this.f7379m = true;
    }

    public void setContentView(int i) {
        super.setContentView(m10518a(i, null, null));
    }

    public void setContentView(View view) {
        super.setContentView(m10518a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m10518a(0, view, layoutParams));
    }
}
