package p071f.p072a.p079o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0128j;
import androidx.appcompat.widget.C0189a0;
import androidx.appcompat.widget.C0275t0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p072a.C3102j;
import p071f.p097h.p101g.p102a.C3273a;
import p071f.p097h.p108m.C3329b;
import p071f.p097h.p108m.C3365h;

/* renamed from: f.a.o.g */
public class C3131g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f8853e;

    /* renamed from: f */
    static final Class<?>[] f8854f;

    /* renamed from: a */
    final Object[] f8855a;

    /* renamed from: b */
    final Object[] f8856b;

    /* renamed from: c */
    Context f8857c;

    /* renamed from: d */
    private Object f8858d;

    /* renamed from: f.a.o.g$a */
    private static class C3132a implements OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f8859c = {MenuItem.class};

        /* renamed from: a */
        private Object f8860a;

        /* renamed from: b */
        private Method f8861b;

        public C3132a(Object obj, String str) {
            this.f8860a = obj;
            Class cls = obj.getClass();
            try {
                this.f8861b = cls.getMethod(str, f8859c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8861b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8861b.invoke(this.f8860a, new Object[]{menuItem})).booleanValue();
                }
                this.f8861b.invoke(this.f8860a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: f.a.o.g$b */
    private class C3133b {

        /* renamed from: A */
        C3329b f8862A;

        /* renamed from: B */
        private CharSequence f8863B;

        /* renamed from: C */
        private CharSequence f8864C;

        /* renamed from: D */
        private ColorStateList f8865D = null;

        /* renamed from: E */
        private Mode f8866E = null;

        /* renamed from: a */
        private Menu f8868a;

        /* renamed from: b */
        private int f8869b;

        /* renamed from: c */
        private int f8870c;

        /* renamed from: d */
        private int f8871d;

        /* renamed from: e */
        private int f8872e;

        /* renamed from: f */
        private boolean f8873f;

        /* renamed from: g */
        private boolean f8874g;

        /* renamed from: h */
        private boolean f8875h;

        /* renamed from: i */
        private int f8876i;

        /* renamed from: j */
        private int f8877j;

        /* renamed from: k */
        private CharSequence f8878k;

        /* renamed from: l */
        private CharSequence f8879l;

        /* renamed from: m */
        private int f8880m;

        /* renamed from: n */
        private char f8881n;

        /* renamed from: o */
        private int f8882o;

        /* renamed from: p */
        private char f8883p;

        /* renamed from: q */
        private int f8884q;

        /* renamed from: r */
        private int f8885r;

        /* renamed from: s */
        private boolean f8886s;

        /* renamed from: t */
        private boolean f8887t;

        /* renamed from: u */
        private boolean f8888u;

        /* renamed from: v */
        private int f8889v;

        /* renamed from: w */
        private int f8890w;

        /* renamed from: x */
        private String f8891x;

        /* renamed from: y */
        private String f8892y;

        /* renamed from: z */
        private String f8893z;

        public C3133b(Menu menu) {
            this.f8868a = menu;
            mo10083d();
        }

        /* renamed from: a */
        private char m12701a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m12702a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, C3131g.this.f8857c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        private void m12703a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f8886s).setVisible(this.f8887t).setEnabled(this.f8888u).setCheckable(this.f8885r >= 1).setTitleCondensed(this.f8879l).setIcon(this.f8880m);
            int i = this.f8889v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f8893z != null) {
                if (!C3131g.this.f8857c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C3132a(C3131g.this.mo10075a(), this.f8893z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0126i;
            if (z2) {
                C0126i iVar = (C0126i) menuItem;
            }
            if (this.f8885r >= 2) {
                if (z2) {
                    ((C0126i) menuItem).mo663c(true);
                } else if (menuItem instanceof C0128j) {
                    ((C0128j) menuItem).mo712a(true);
                }
            }
            String str = this.f8891x;
            if (str != null) {
                menuItem.setActionView((View) m12702a(str, C3131g.f8853e, C3131g.this.f8855a));
                z = true;
            }
            int i2 = this.f8890w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C3329b bVar = this.f8862A;
            if (bVar != null) {
                C3365h.m13722a(menuItem, bVar);
            }
            C3365h.m13726a(menuItem, this.f8863B);
            C3365h.m13728b(menuItem, this.f8864C);
            C3365h.m13723a(menuItem, this.f8881n, this.f8882o);
            C3365h.m13727b(menuItem, this.f8883p, this.f8884q);
            Mode mode = this.f8866E;
            if (mode != null) {
                C3365h.m13725a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f8865D;
            if (colorStateList != null) {
                C3365h.m13724a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo10078a() {
            this.f8875h = true;
            m12703a(this.f8868a.add(this.f8869b, this.f8876i, this.f8877j, this.f8878k));
        }

        /* renamed from: a */
        public void mo10079a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3131g.this.f8857c.obtainStyledAttributes(attributeSet, C3102j.MenuGroup);
            this.f8869b = obtainStyledAttributes.getResourceId(C3102j.MenuGroup_android_id, 0);
            this.f8870c = obtainStyledAttributes.getInt(C3102j.MenuGroup_android_menuCategory, 0);
            this.f8871d = obtainStyledAttributes.getInt(C3102j.MenuGroup_android_orderInCategory, 0);
            this.f8872e = obtainStyledAttributes.getInt(C3102j.MenuGroup_android_checkableBehavior, 0);
            this.f8873f = obtainStyledAttributes.getBoolean(C3102j.MenuGroup_android_visible, true);
            this.f8874g = obtainStyledAttributes.getBoolean(C3102j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu mo10080b() {
            this.f8875h = true;
            SubMenu addSubMenu = this.f8868a.addSubMenu(this.f8869b, this.f8876i, this.f8877j, this.f8878k);
            m12703a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public void mo10081b(AttributeSet attributeSet) {
            C0275t0 a = C0275t0.m1310a(C3131g.this.f8857c, attributeSet, C3102j.MenuItem);
            this.f8876i = a.mo1750g(C3102j.MenuItem_android_id, 0);
            this.f8877j = (a.mo1744d(C3102j.MenuItem_android_menuCategory, this.f8870c) & -65536) | (a.mo1744d(C3102j.MenuItem_android_orderInCategory, this.f8871d) & 65535);
            this.f8878k = a.mo1747e(C3102j.MenuItem_android_title);
            this.f8879l = a.mo1747e(C3102j.MenuItem_android_titleCondensed);
            this.f8880m = a.mo1750g(C3102j.MenuItem_android_icon, 0);
            this.f8881n = m12701a(a.mo1745d(C3102j.MenuItem_android_alphabeticShortcut));
            this.f8882o = a.mo1744d(C3102j.MenuItem_alphabeticModifiers, 4096);
            this.f8883p = m12701a(a.mo1745d(C3102j.MenuItem_android_numericShortcut));
            this.f8884q = a.mo1744d(C3102j.MenuItem_numericModifiers, 4096);
            this.f8885r = a.mo1751g(C3102j.MenuItem_android_checkable) ? a.mo1738a(C3102j.MenuItem_android_checkable, false) : this.f8872e;
            this.f8886s = a.mo1738a(C3102j.MenuItem_android_checked, false);
            this.f8887t = a.mo1738a(C3102j.MenuItem_android_visible, this.f8873f);
            this.f8888u = a.mo1738a(C3102j.MenuItem_android_enabled, this.f8874g);
            this.f8889v = a.mo1744d(C3102j.MenuItem_showAsAction, -1);
            this.f8893z = a.mo1745d(C3102j.MenuItem_android_onClick);
            this.f8890w = a.mo1750g(C3102j.MenuItem_actionLayout, 0);
            this.f8891x = a.mo1745d(C3102j.MenuItem_actionViewClass);
            String d = a.mo1745d(C3102j.MenuItem_actionProviderClass);
            this.f8892y = d;
            boolean z = d != null;
            if (z && this.f8890w == 0 && this.f8891x == null) {
                this.f8862A = (C3329b) m12702a(this.f8892y, C3131g.f8854f, C3131g.this.f8856b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f8862A = null;
            }
            this.f8863B = a.mo1747e(C3102j.MenuItem_contentDescription);
            this.f8864C = a.mo1747e(C3102j.MenuItem_tooltipText);
            if (a.mo1751g(C3102j.MenuItem_iconTintMode)) {
                this.f8866E = C0189a0.m975a(a.mo1744d(C3102j.MenuItem_iconTintMode, -1), this.f8866E);
            } else {
                this.f8866E = null;
            }
            if (a.mo1751g(C3102j.MenuItem_iconTint)) {
                this.f8865D = a.mo1735a(C3102j.MenuItem_iconTint);
            } else {
                this.f8865D = null;
            }
            a.mo1737a();
            this.f8875h = false;
        }

        /* renamed from: c */
        public boolean mo10082c() {
            return this.f8875h;
        }

        /* renamed from: d */
        public void mo10083d() {
            this.f8869b = 0;
            this.f8870c = 0;
            this.f8871d = 0;
            this.f8872e = 0;
            this.f8873f = true;
            this.f8874g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f8853e = clsArr;
        f8854f = clsArr;
    }

    public C3131g(Context context) {
        super(context);
        this.f8857c = context;
        Object[] objArr = {context};
        this.f8855a = objArr;
        this.f8856b = objArr;
    }

    /* renamed from: a */
    private Object m12698a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m12698a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: a */
    private void m12699a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        String str;
        C3133b bVar = new C3133b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                String str3 = "item";
                String str4 = "group";
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo10083d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo10082c()) {
                                C3329b bVar2 = bVar.f8862A;
                                if (bVar2 == null || !bVar2.mo768a()) {
                                    bVar.mo10078a();
                                } else {
                                    bVar.mo10080b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo10079a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo10081b(attributeSet);
                    } else if (name3.equals(str)) {
                        m12699a(xmlPullParser, attributeSet, bVar.mo10080b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo10075a() {
        if (this.f8858d == null) {
            this.f8858d = m12698a(this.f8857c);
        }
        return this.f8858d;
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C3273a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f8857c.getResources().getLayout(i);
            m12699a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
