package androidx.emoji.widget;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import p071f.p115k.p117c.C3419a;

/* renamed from: androidx.emoji.widget.f */
final class C0404f implements KeyListener {

    /* renamed from: f */
    private final KeyListener f1842f;

    C0404f(KeyListener keyListener) {
        this.f1842f = keyListener;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1842f.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f1842f.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return C3419a.m14023a(editable, i, keyEvent) || this.f1842f.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1842f.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1842f.onKeyUp(view, editable, i, keyEvent);
    }
}
