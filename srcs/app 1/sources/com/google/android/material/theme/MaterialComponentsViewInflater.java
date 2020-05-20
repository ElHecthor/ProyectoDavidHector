package com.google.android.material.theme;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0207d;
import androidx.appcompat.widget.C0214f;
import androidx.appcompat.widget.C0223g;
import androidx.appcompat.widget.C0257q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.C2792a;
import com.google.android.material.textview.MaterialTextView;
import p147g.p156d.p157a.p185c.p192p.C4433a;
import p147g.p156d.p157a.p185c.p201x.C4455a;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {

    /* renamed from: f */
    private static int f8204f = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0207d mo169a(Context context, AttributeSet attributeSet) {
        return new C2792a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0214f mo170b(Context context, AttributeSet attributeSet) {
        return mo9379o(context, attributeSet) ? new C0214f(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0223g mo171c(Context context, AttributeSet attributeSet) {
        return new C4433a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0257q mo177i(Context context, AttributeSet attributeSet) {
        return new C4455a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatTextView mo181m(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo9379o(Context context, AttributeSet attributeSet) {
        int i = VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (f8204f == -1) {
            f8204f = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = f8204f;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && f8204f == attributeSet.getAttributeListValue(i3, null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
