package p071f.p097h.p108m;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.h.m.e */
public class C3341e {

    /* renamed from: a */
    private static boolean f9542a = false;

    /* renamed from: b */
    private static Method f9543b = null;

    /* renamed from: c */
    private static boolean f9544c = false;

    /* renamed from: d */
    private static Field f9545d;

    /* renamed from: f.h.m.e$a */
    public interface C3342a {
        /* renamed from: a */
        boolean mo374a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static OnKeyListener m13609a(Dialog dialog) {
        if (!f9544c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f9545d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9544c = true;
        }
        Field field = f9545d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m13610a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f9542a) {
            try {
                f9543b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f9542a = true;
        }
        Method method = f9543b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m13611a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m13610a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3379v.m13799a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m13612a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m13609a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3379v.m13799a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m13613a(View view, KeyEvent keyEvent) {
        return C3379v.m13805b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m13614a(C3342a aVar, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.mo374a(keyEvent);
        }
        if (callback instanceof Activity) {
            return m13611a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m13612a((Dialog) callback, keyEvent);
        }
        if ((view != null && C3379v.m13799a(view, keyEvent)) || aVar.mo374a(keyEvent)) {
            z = true;
        }
        return z;
    }
}
