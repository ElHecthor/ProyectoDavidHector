package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import p071f.p072a.C3093a;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p112j.p113a.C3400a;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: k */
    private static final int[] f7796k = {16842912};

    /* renamed from: h */
    private boolean f7797h;

    /* renamed from: i */
    private boolean f7798i;

    /* renamed from: j */
    private boolean f7799j;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C2695a extends C3323a {
        C2695a() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10756b(CheckableImageButton.this.mo8910a());
            cVar.mo10762c(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2351b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C2696b extends C3400a {
        public static final Creator<C2696b> CREATOR = new C2697a();

        /* renamed from: h */
        boolean f7801h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C2697a implements ClassLoaderCreator<C2696b> {
            C2697a() {
            }

            public C2696b createFromParcel(Parcel parcel) {
                return new C2696b(parcel, null);
            }

            public C2696b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2696b(parcel, classLoader);
            }

            public C2696b[] newArray(int i) {
                return new C2696b[i];
            }
        }

        public C2696b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m11190a(parcel);
        }

        public C2696b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m11190a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f7801h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7801h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7798i = true;
        this.f7799j = true;
        C3379v.m13788a((View) this, (C3323a) new C2695a());
    }

    /* renamed from: a */
    public boolean mo8910a() {
        return this.f7798i;
    }

    public boolean isChecked() {
        return this.f7797h;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f7797h ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f7796k.length), f7796k) : super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2696b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2696b bVar = (C2696b) parcelable;
        super.onRestoreInstanceState(bVar.mo10880a());
        setChecked(bVar.f7801h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2696b bVar = new C2696b(super.onSaveInstanceState());
        bVar.f7801h = this.f7797h;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f7798i != z) {
            this.f7798i = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f7798i && this.f7797h != z) {
            this.f7797h = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f7799j = z;
    }

    public void setPressed(boolean z) {
        if (this.f7799j) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f7797h);
    }
}
