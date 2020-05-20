package androidx.emoji.widget;

import android.os.Build.VERSION;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p071f.p097h.p107l.C3321h;

/* renamed from: androidx.emoji.widget.b */
public final class C0397b {

    /* renamed from: a */
    private final C0399b f1830a;

    /* renamed from: b */
    private int f1831b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f1832c = 0;

    /* renamed from: androidx.emoji.widget.b$a */
    private static class C0398a extends C0399b {

        /* renamed from: a */
        private final EditText f1833a;

        /* renamed from: b */
        private final C0408h f1834b;

        C0398a(EditText editText) {
            this.f1833a = editText;
            C0408h hVar = new C0408h(editText);
            this.f1834b = hVar;
            this.f1833a.addTextChangedListener(hVar);
            this.f1833a.setEditableFactory(C0400c.getInstance());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public KeyListener mo2406a(KeyListener keyListener) {
            return keyListener instanceof C0404f ? keyListener : new C0404f(keyListener);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputConnection mo2407a(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C0401d ? inputConnection : new C0401d(this.f1833a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2408a(int i) {
            this.f1834b.mo2427a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2409b(int i) {
            this.f1834b.mo2429b(i);
        }
    }

    /* renamed from: androidx.emoji.widget.b$b */
    static class C0399b {
        C0399b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public KeyListener mo2406a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputConnection mo2407a(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2408a(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2409b(int i) {
        }
    }

    public C0397b(EditText editText) {
        C3321h.m13544a(editText, (Object) "editText cannot be null");
        this.f1830a = VERSION.SDK_INT >= 19 ? new C0398a(editText) : new C0399b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2400a() {
        return this.f1832c;
    }

    /* renamed from: a */
    public KeyListener mo2401a(KeyListener keyListener) {
        C3321h.m13544a(keyListener, (Object) "keyListener cannot be null");
        return this.f1830a.mo2406a(keyListener);
    }

    /* renamed from: a */
    public InputConnection mo2402a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1830a.mo2407a(inputConnection, editorInfo);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2403a(int i) {
        this.f1832c = i;
        this.f1830a.mo2408a(i);
    }

    /* renamed from: b */
    public int mo2404b() {
        return this.f1831b;
    }

    /* renamed from: b */
    public void mo2405b(int i) {
        C3321h.m13542a(i, "maxEmojiCount should be greater than 0");
        this.f1831b = i;
        this.f1830a.mo2409b(i);
    }
}
