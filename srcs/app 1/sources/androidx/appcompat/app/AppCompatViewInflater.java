package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0207d;
import androidx.appcompat.widget.C0214f;
import androidx.appcompat.widget.C0223g;
import androidx.appcompat.widget.C0225h;
import androidx.appcompat.widget.C0239k;
import androidx.appcompat.widget.C0250n;
import androidx.appcompat.widget.C0257q;
import androidx.appcompat.widget.C0258q0;
import androidx.appcompat.widget.C0259r;
import androidx.appcompat.widget.C0263t;
import androidx.appcompat.widget.C0288x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p071f.p072a.C3102j;
import p071f.p072a.p079o.C3127d;
import p071f.p088e.C3162a;
import p071f.p097h.p108m.C3379v;

public class AppCompatViewInflater {

    /* renamed from: b */
    private static final Class<?>[] f209b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f210c = {16843375};

    /* renamed from: d */
    private static final String[] f211d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final Map<String, Constructor<? extends View>> f212e = new C3162a();

    /* renamed from: a */
    private final Object[] f213a = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    private static class C0060a implements OnClickListener {

        /* renamed from: f */
        private final View f214f;

        /* renamed from: g */
        private final String f215g;

        /* renamed from: h */
        private Method f216h;

        /* renamed from: i */
        private Context f217i;

        public C0060a(View view, String str) {
            this.f214f = view;
            this.f215g = str;
        }

        /* renamed from: a */
        private void m207a(Context context, String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f215g, new Class[]{View.class});
                        if (method != null) {
                            this.f216h = method;
                            this.f217i = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f214f.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f214f.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f215g);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.f214f.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(View view) {
            if (this.f216h == null) {
                m207a(this.f214f.getContext(), this.f215g);
            }
            try {
                this.f216h.invoke(this.f217i, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m186a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C3102j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C3102j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C3127d) || ((C3127d) context).mo10049a() != resourceId) ? new C3127d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m187a(Context context, String str, String str2) {
        String str3;
        Constructor constructor = (Constructor) f212e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f209b);
            f212e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f213a);
    }

    /* renamed from: a */
    private void m188a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C3379v.m13838y(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f210c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0060a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m189a(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private View m190b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f213a[0] = context;
            this.f213a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f211d) {
                    View a2 = m187a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f213a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m187a(context, str, (String) null);
            Object[] objArr2 = this.f213a;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f213a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo167a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo168a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m186a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0258q0.m1264b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo181m(context2, attributeSet);
                break;
            case 1:
                view2 = mo175g(context2, attributeSet);
                break;
            case 2:
                view2 = mo170b(context2, attributeSet);
                break;
            case 3:
                view2 = mo173e(context2, attributeSet);
                break;
            case 4:
                view2 = mo180l(context2, attributeSet);
                break;
            case 5:
                view2 = mo174f(context2, attributeSet);
                break;
            case 6:
                view2 = mo171c(context2, attributeSet);
                break;
            case 7:
                view2 = mo177i(context2, attributeSet);
                break;
            case 8:
                view2 = mo172d(context2, attributeSet);
                break;
            case 9:
                view2 = mo169a(context2, attributeSet);
                break;
            case 10:
                view2 = mo176h(context2, attributeSet);
                break;
            case 11:
                view2 = mo178j(context2, attributeSet);
                break;
            case 12:
                view2 = mo179k(context2, attributeSet);
                break;
            case 13:
                view2 = mo182n(context2, attributeSet);
                break;
            default:
                view2 = mo167a(context2, str, attributeSet);
                break;
        }
        m189a(view2, str);
        if (view2 == null && context != context2) {
            view2 = m190b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m188a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0207d mo169a(Context context, AttributeSet attributeSet) {
        return new C0207d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0214f mo170b(Context context, AttributeSet attributeSet) {
        return new C0214f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0223g mo171c(Context context, AttributeSet attributeSet) {
        return new C0223g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0225h mo172d(Context context, AttributeSet attributeSet) {
        return new C0225h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0239k mo173e(Context context, AttributeSet attributeSet) {
        return new C0239k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatImageButton mo174f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageView mo175g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0250n mo176h(Context context, AttributeSet attributeSet) {
        return new C0250n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0257q mo177i(Context context, AttributeSet attributeSet) {
        return new C0257q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRatingBar mo178j(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0259r mo179k(Context context, AttributeSet attributeSet) {
        return new C0259r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0263t mo180l(Context context, AttributeSet attributeSet) {
        return new C0263t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatTextView mo181m(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0288x mo182n(Context context, AttributeSet attributeSet) {
        return new C0288x(context, attributeSet);
    }
}
