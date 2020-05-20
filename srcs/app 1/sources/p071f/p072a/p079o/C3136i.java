package p071f.p072a.p079o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: f.a.o.i */
public class C3136i implements Callback {

    /* renamed from: f */
    final Callback f8903f;

    public C3136i(Callback callback) {
        if (callback != null) {
            this.f8903f = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Callback mo10093a() {
        return this.f8903f;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8903f.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8903f.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8903f.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8903f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8903f.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8903f.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f8903f.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f8903f.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f8903f.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f8903f.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f8903f.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f8903f.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f8903f.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f8903f.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f8903f.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f8903f.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f8903f.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f8903f.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f8903f.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f8903f.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f8903f.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f8903f.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f8903f.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f8903f.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f8903f.onWindowStartingActionMode(callback, i);
    }
}
