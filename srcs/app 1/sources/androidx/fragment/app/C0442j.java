package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import p071f.p120m.C3449c;

/* renamed from: androidx.fragment.app.j */
class C0442j implements Factory2 {

    /* renamed from: f */
    private final C0445l f1998f;

    C0442j(C0445l lVar) {
        this.f1998f = lVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f1998f);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3449c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C3449c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C3449c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C3449c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0440h.m2336b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = this.f1998f.mo2752a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f1998f.mo2777b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f1998f.mo2752a(id);
        }
        if (C0445l.m2390d(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(attributeValue);
            sb2.append(" existing=");
            sb2.append(fragment);
            Log.v("FragmentManager", sb2.toString());
        }
        if (fragment == null) {
            fragment = this.f1998f.mo2812o().mo2728a(context.getClassLoader(), attributeValue);
            fragment.f1895r = true;
            fragment.f1857A = resourceId != 0 ? resourceId : id;
            fragment.f1858B = id;
            fragment.f1859C = string;
            fragment.f1896s = true;
            C0445l lVar = this.f1998f;
            fragment.f1900w = lVar;
            C0441i<?> iVar = lVar.f2023o;
            fragment.f1901x = iVar;
            fragment.mo2498a(iVar.mo2730f(), attributeSet, fragment.f1884g);
            this.f1998f.mo2761a(fragment);
            this.f1998f.mo2803j(fragment);
        } else if (!fragment.f1896s) {
            fragment.f1896s = true;
            C0441i<?> iVar2 = this.f1998f.f2023o;
            fragment.f1901x = iVar2;
            fragment.mo2498a(iVar2.mo2730f(), attributeSet, fragment.f1884g);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(id));
            sb3.append(" with another fragment for ");
            sb3.append(attributeValue);
            throw new IllegalArgumentException(sb3.toString());
        }
        C0445l lVar2 = this.f1998f;
        if (lVar2.f2022n >= 1 || !fragment.f1895r) {
            this.f1998f.mo2803j(fragment);
        } else {
            lVar2.mo2762a(fragment, 1);
        }
        View view2 = fragment.f1868L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f1868L.getTag() == null) {
                fragment.f1868L.setTag(string);
            }
            return fragment.f1868L;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(attributeValue);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
