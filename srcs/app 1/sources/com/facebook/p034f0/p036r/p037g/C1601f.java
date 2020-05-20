package com.facebook.p034f0.p036r.p037g;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.internal.C1698v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p071f.p097h.p108m.C3369l;

/* renamed from: com.facebook.f0.r.g.f */
public class C1601f {

    /* renamed from: a */
    private static final String f4962a = "com.facebook.f0.r.g.f";

    /* renamed from: b */
    private static WeakReference<View> f4963b = new WeakReference<>(null);

    /* renamed from: c */
    private static Method f4964c = null;

    /* renamed from: a */
    public static View m7049a(View view) {
        while (view != null) {
            if (!m7065m(view)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static View m7050a(float[] fArr, View view) {
        m7051a();
        Method method = f4964c;
        View view2 = null;
        if (!(method == null || view == null)) {
            try {
                View view3 = (View) method.invoke(null, new Object[]{fArr, view});
                if (view3 != null && view3.getId() > 0) {
                    View view4 = (View) view3.getParent();
                    if (view4 != null) {
                        view2 = view4;
                    }
                    return view2;
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                C1698v.m7380a(f4962a, (Exception) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m7051a() {
        if (f4964c == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                f4964c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                C1698v.m7380a(f4962a, (Exception) e);
            }
        }
    }

    /* renamed from: a */
    public static void m7052a(View view, JSONObject jSONObject) {
        try {
            String j = m7062j(view);
            String h = m7060h(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", m7055c(view));
            jSONObject.put("id", view.getId());
            String str = "text";
            String str2 = "";
            if (!C1599d.m7039a(view)) {
                jSONObject.put(str, C1698v.m7361a(C1698v.m7409f(j), str2));
            } else {
                jSONObject.put(str, str2);
                jSONObject.put("is_user_input", true);
            }
            jSONObject.put("hint", C1698v.m7361a(C1698v.m7409f(h), str2));
            if (tag != null) {
                jSONObject.put("tag", C1698v.m7361a(C1698v.m7409f(tag.toString()), str2));
            }
            if (contentDescription != null) {
                jSONObject.put("description", C1698v.m7361a(C1698v.m7409f(contentDescription.toString()), str2));
            }
            jSONObject.put("dimension", m7057e(view));
        } catch (JSONException e) {
            C1698v.m7380a(f4962a, (Exception) e);
        }
    }

    /* renamed from: a */
    public static boolean m7053a(View view, View view2) {
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        View a = m7050a(m7063k(view), view2);
        return a != null && a.getId() == view.getId();
    }

    /* renamed from: b */
    public static List<View> m7054b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static int m7055c(View view) {
        int i = view instanceof ImageView ? 2 : 0;
        if (view.isClickable()) {
            i |= 32;
        }
        if (m7064l(view)) {
            i |= 512;
        }
        if (!(view instanceof TextView)) {
            return ((view instanceof Spinner) || (view instanceof DatePicker)) ? i | 4096 : view instanceof RatingBar ? i | 65536 : view instanceof RadioGroup ? i | 16384 : (!(view instanceof ViewGroup) || !m7053a(view, (View) f4963b.get())) ? i : i | 64;
        }
        int i2 = i | 1024 | 1;
        if (view instanceof Button) {
            i2 |= 4;
            if (view instanceof Switch) {
                i2 |= 8192;
            } else if (view instanceof CheckBox) {
                i2 |= 32768;
            }
        }
        return view instanceof EditText ? i2 | 2048 : i2;
    }

    /* renamed from: d */
    public static JSONObject m7056d(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f4963b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m7052a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List b = m7054b(view);
            for (int i = 0; i < b.size(); i++) {
                jSONArray.put(m7056d((View) b.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f4962a, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m7057e(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f4962a, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static OnClickListener m7058f(View view) {
        OnClickListener onClickListener = null;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onClickListener = (OnClickListener) declaredField2.get(obj);
            }
            return onClickListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* renamed from: g */
    public static OnTouchListener m7059g(View view) {
        OnTouchListener onTouchListener = null;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField2.get(obj);
            }
            return onTouchListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            C1698v.m7380a(f4962a, (Exception) e);
            return null;
        }
    }

    /* renamed from: h */
    public static String m7060h(View view) {
        CharSequence charSequence = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
        return charSequence == null ? "" : charSequence.toString();
    }

    /* renamed from: i */
    public static ViewGroup m7061i(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7062j(android.view.View r6) {
        /*
            boolean r0 = r6 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r6 instanceof android.widget.Switch
            if (r0 == 0) goto L_0x00cb
            android.widget.Switch r6 = (android.widget.Switch) r6
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "1"
            goto L_0x001d
        L_0x001b:
            java.lang.String r6 = "0"
        L_0x001d:
            r1 = r6
            goto L_0x00cb
        L_0x0020:
            boolean r0 = r6 instanceof android.widget.Spinner
            if (r0 == 0) goto L_0x0038
            android.widget.Spinner r6 = (android.widget.Spinner) r6
            int r0 = r6.getCount()
            if (r0 <= 0) goto L_0x00cb
            java.lang.Object r6 = r6.getSelectedItem()
            if (r6 == 0) goto L_0x00cb
            java.lang.String r1 = r6.toString()
            goto L_0x00cb
        L_0x0038:
            boolean r0 = r6 instanceof android.widget.DatePicker
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0069
            android.widget.DatePicker r6 = (android.widget.DatePicker) r6
            int r0 = r6.getYear()
            int r1 = r6.getMonth()
            int r6 = r6.getDayOfMonth()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5[r3] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = "%04d-%02d-%02d"
            java.lang.String r1 = java.lang.String.format(r6, r5)
            goto L_0x00cb
        L_0x0069:
            boolean r0 = r6 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x0094
            android.widget.TimePicker r6 = (android.widget.TimePicker) r6
            java.lang.Integer r0 = r6.getCurrentHour()
            int r0 = r0.intValue()
            java.lang.Integer r6 = r6.getCurrentMinute()
            int r6 = r6.intValue()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            java.lang.String r6 = "%02d:%02d"
            java.lang.String r1 = java.lang.String.format(r6, r1)
            goto L_0x00cb
        L_0x0094:
            boolean r0 = r6 instanceof android.widget.RadioGroup
            if (r0 == 0) goto L_0x00bd
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6
            int r0 = r6.getCheckedRadioButtonId()
            int r2 = r6.getChildCount()
        L_0x00a2:
            if (r4 >= r2) goto L_0x00cb
            android.view.View r3 = r6.getChildAt(r4)
            int r5 = r3.getId()
            if (r5 != r0) goto L_0x00ba
            boolean r5 = r3 instanceof android.widget.RadioButton
            if (r5 == 0) goto L_0x00ba
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            java.lang.CharSequence r6 = r3.getText()
            goto L_0x001d
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bd:
            boolean r0 = r6 instanceof android.widget.RatingBar
            if (r0 == 0) goto L_0x00cb
            android.widget.RatingBar r6 = (android.widget.RatingBar) r6
            float r6 = r6.getRating()
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x00cb:
            if (r1 != 0) goto L_0x00d0
            java.lang.String r6 = ""
            goto L_0x00d4
        L_0x00d0:
            java.lang.String r6 = r1.toString()
        L_0x00d4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p036r.p037g.C1601f.m7062j(android.view.View):java.lang.String");
    }

    /* renamed from: k */
    private static float[] m7063k(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    /* renamed from: l */
    private static boolean m7064l(View view) {
        ViewParent parent = view.getParent();
        return (parent instanceof AdapterView) || (parent instanceof C3369l);
    }

    /* renamed from: m */
    public static boolean m7065m(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }
}
