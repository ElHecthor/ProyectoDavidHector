package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0655m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0597z;

/* renamed from: com.google.android.material.datepicker.q */
class C2654q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    class C2655a extends C0655m {
        C2655a(C2654q qVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo3920a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C2654q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public void mo3159a(RecyclerView recyclerView, C0560a0 a0Var, int i) {
        C2655a aVar = new C2655a(this, recyclerView.getContext());
        aVar.mo3706c(i);
        mo3571b((C0597z) aVar);
    }
}
