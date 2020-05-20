package p255io.stashteam.stashapp.utils.p304f;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.i */
public final class C5703i {

    /* renamed from: io.stashteam.stashapp.utils.f.i$a */
    public static final class C5704a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ C5918l f14790f;

        C5704a(C5918l lVar) {
            this.f14790f = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f14790f.mo4090d(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: a */
    public static final void m21797a(EditText editText, C5918l<? super String, C5812t> lVar) {
        C5942k.m22327b(editText, "$this$afterTextChanged");
        C5942k.m22327b(lVar, "afterTextChanged");
        editText.addTextChangedListener(new C5704a(lVar));
    }
}
