package p255io.stashteam.stashapp.p281f.p288b;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C5003t;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p281f.p282a.C5325b;
import p255io.stashteam.stashapp.utils.p304f.C5696b;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p337m.p338f0.C6250b;

/* renamed from: io.stashteam.stashapp.f.b.b */
public final class C5361b extends C5325b<C5003t> {

    /* renamed from: t0 */
    public static final C5364b f14064t0 = new C5364b(null);
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C5365c f14065r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C5297f f14066s0;

    /* renamed from: io.stashteam.stashapp.f.b.b$a */
    private enum C5362a {
        DEFAULT(R.color.color_primary_text);
        

        /* renamed from: i */
        public static final C5363a f14069i = null;

        /* renamed from: f */
        private final int f14070f;

        /* renamed from: io.stashteam.stashapp.f.b.b$a$a */
        public static final class C5363a {
            private C5363a() {
            }

            public /* synthetic */ C5363a(C5938g gVar) {
                this();
            }

            /* renamed from: a */
            public final C5362a mo15059a(Context context, String str) {
                C5362a aVar;
                C5942k.m22327b(context, "context");
                if (str == null) {
                    return C5362a.DEFAULT;
                }
                C5362a[] values = C5362a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (C5942k.m22326a((Object) aVar.mo15057a(context), (Object) str)) {
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    aVar = C5362a.DEFAULT;
                }
                return aVar;
            }
        }

        static {
            f14069i = new C5363a(null);
        }

        private C5362a(int i) {
            this.f14070f = i;
        }

        /* renamed from: a */
        public final String mo15057a(Context context) {
            C5942k.m22327b(context, "context");
            if (this == DEFAULT) {
                return null;
            }
            String a = C6250b.m23445a(C5699e.m21783a(context, this.f14070f));
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            sb.append(a);
            return sb.toString();
        }

        /* renamed from: f */
        public final int mo15058f() {
            return this.f14070f;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$b */
    public static final class C5364b {
        private C5364b() {
        }

        public /* synthetic */ C5364b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5361b mo15060a() {
            return new C5361b();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$c */
    public interface C5365c {
        /* renamed from: a */
        void mo15052a(C5297f fVar);
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$d */
    static final class C5366d extends C5943l implements C5918l<Integer, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5361b f14071g;

        C5366d(C5361b bVar) {
            this.f14071g = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo15061a(int i) {
            TextInputEditText textInputEditText = C5361b.m20903a(this.f14071g).f13174d;
            Context p0 = this.f14071g.mo2576p0();
            C5942k.m22324a((Object) p0, "requireContext()");
            textInputEditText.setTextColor(C5699e.m21783a(p0, this.f14071g.m20908e(i).mo15058f()));
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15061a(((Number) obj).intValue());
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$e */
    static final class C5367e extends C5943l implements C5918l<String, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5361b f14072g;

        C5367e(C5361b bVar) {
            this.f14072g = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo15062a(String str) {
            C5942k.m22327b(str, "it");
            MaterialButton materialButton = C5361b.m20903a(this.f14072g).f13172b;
            C5942k.m22324a((Object) materialButton, "binding.btnSave");
            materialButton.setEnabled(!C5787p.m21972a(str));
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15062a((String) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$f */
    static final class C5368f implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5361b f14073f;

        C5368f(C5361b bVar) {
            this.f14073f = bVar;
        }

        public final void onClick(View view) {
            AppCompatImageButton appCompatImageButton = C5361b.m20903a(this.f14073f).f13175e;
            String str = "binding.imageLock";
            C5942k.m22324a((Object) appCompatImageButton, str);
            AppCompatImageButton appCompatImageButton2 = C5361b.m20903a(this.f14073f).f13175e;
            C5942k.m22324a((Object) appCompatImageButton2, str);
            appCompatImageButton.setSelected(!appCompatImageButton2.isSelected());
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.b$g */
    static final class C5369g implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5361b f14074f;

        C5369g(C5361b bVar) {
            this.f14074f = bVar;
        }

        public final void onClick(View view) {
            Integer selectedId = C5361b.m20903a(this.f14074f).f13176f.getSelectedId();
            String str = null;
            C5362a a = selectedId != null ? this.f14074f.m20908e(selectedId.intValue()) : null;
            C5297f b = this.f14074f.f14066s0;
            long d = b != null ? b.mo14903d() : 0;
            TextInputEditText textInputEditText = C5361b.m20903a(this.f14074f).f13174d;
            C5942k.m22324a((Object) textInputEditText, "binding.fieldTitle");
            String valueOf = String.valueOf(textInputEditText.getText());
            String str2 = "null cannot be cast to non-null type kotlin.CharSequence";
            if (valueOf != null) {
                String obj = C5788q.m22032f(valueOf).toString();
                TextInputEditText textInputEditText2 = C5361b.m20903a(this.f14074f).f13173c;
                C5942k.m22324a((Object) textInputEditText2, "binding.fieldDescription");
                String valueOf2 = String.valueOf(textInputEditText2.getText());
                if (valueOf2 != null) {
                    String obj2 = C5788q.m22032f(valueOf2).toString();
                    AppCompatImageButton appCompatImageButton = C5361b.m20903a(this.f14074f).f13175e;
                    C5942k.m22324a((Object) appCompatImageButton, "binding.imageLock");
                    boolean isSelected = appCompatImageButton.isSelected();
                    if (a != null) {
                        Context p0 = this.f14074f.mo2576p0();
                        C5942k.m22324a((Object) p0, "requireContext()");
                        str = a.mo15057a(p0);
                    }
                    C5297f fVar = new C5297f(d, obj, obj2, 0, isSelected, str, 8, null);
                    C5365c c = this.f14074f.f14065r0;
                    if (c != null) {
                        c.mo15052a(fVar);
                    }
                    this.f14074f.mo2653s0();
                    return;
                }
                throw new C5809q(str2);
            }
            throw new C5809q(str2);
        }
    }

    /* renamed from: a */
    private final View m20902a(C5362a aVar) {
        View inflate = LayoutInflater.from(mo2576p0()).inflate(R.layout.item_color_circle, ((C5003t) mo15026x0()).f13176f, false);
        inflate.setId(C5696b.m21779a(aVar));
        View findViewById = inflate.findViewById(R.id.view_circle);
        C5942k.m22324a((Object) findViewById, "findViewById<View>(R.id.view_circle)");
        Context context = inflate.getContext();
        C5942k.m22324a((Object) context, "context");
        findViewById.setBackgroundTintList(ColorStateList.valueOf(C5699e.m21783a(context, aVar.mo15058f())));
        LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
            C5942k.m22324a((Object) inflate, "LayoutInflater.from(requ… = 1.0f\n                }");
            return inflate;
        }
        throw new C5809q("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final /* synthetic */ C5003t m20903a(C5361b bVar) {
        return (C5003t) bVar.mo15026x0();
    }

    /* renamed from: a */
    public static /* synthetic */ void m20905a(C5361b bVar, C5297f fVar, C5365c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        bVar.mo15056a(fVar, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C5362a m20908e(int i) {
        C5362a aVar;
        C5362a[] values = C5362a.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i2];
            if (C5696b.m21779a(aVar) == i) {
                break;
            }
            i2++;
        }
        return aVar != null ? aVar : C5362a.DEFAULT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5003t m20910a(ViewGroup viewGroup) {
        C5003t a = C5003t.m20027a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "DialogCustomListBinding.…flater, container, false)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        if (r2 != null) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2506a(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p308k.p323z.p325d.C5942k.m22327b(r5, r0)
            super.mo2506a(r5, r6)
            io.stashteam.stashapp.f.b.b$a[] r5 = p255io.stashteam.stashapp.p281f.p288b.C5361b.C5362a.values()
            int r6 = r5.length
            r0 = 0
            r1 = 0
        L_0x000f:
            if (r1 >= r6) goto L_0x0025
            r2 = r5[r1]
            android.view.View r2 = r4.m20902a(r2)
            f.x.a r3 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r3 = (p255io.stashteam.stashapp.p262c.C5003t) r3
            io.stashteam.stashapp.ui.widgets.select_group.SelectGroup r3 = r3.f13176f
            r3.addView(r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0025:
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            io.stashteam.stashapp.ui.widgets.select_group.SelectGroup r5 = r5.f13176f
            r5.invalidate()
            io.stashteam.stashapp.f.b.b$a$a r5 = p255io.stashteam.stashapp.p281f.p288b.C5361b.C5362a.f14069i
            android.content.Context r6 = r4.mo2576p0()
            java.lang.String r1 = "requireContext()"
            p308k.p323z.p325d.C5942k.m22324a(r6, r1)
            io.stashteam.stashapp.e.c.f r2 = r4.f14066s0
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r2.mo14899a()
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            io.stashteam.stashapp.f.b.b$a r5 = r5.mo15059a(r6, r2)
            f.x.a r6 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r6 = (p255io.stashteam.stashapp.p262c.C5003t) r6
            io.stashteam.stashapp.ui.widgets.select_group.SelectGroup r6 = r6.f13176f
            int r2 = p255io.stashteam.stashapp.utils.p304f.C5696b.m21779a(r5)
            r6.mo15327a(r2)
            f.x.a r6 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r6 = (p255io.stashteam.stashapp.p262c.C5003t) r6
            io.stashteam.stashapp.ui.widgets.select_group.SelectGroup r6 = r6.f13176f
            io.stashteam.stashapp.f.b.b$d r2 = new io.stashteam.stashapp.f.b.b$d
            r2.<init>(r4)
            r6.setOnSelectedChangeListener(r2)
            f.x.a r6 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r6 = (p255io.stashteam.stashapp.p262c.C5003t) r6
            com.google.android.material.textfield.TextInputEditText r6 = r6.f13174d
            io.stashteam.stashapp.e.c.f r2 = r4.f14066s0
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = r2.mo14904e()
            if (r2 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r2 = r3
        L_0x007e:
            r6.setText(r2)
            f.x.a r6 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r6 = (p255io.stashteam.stashapp.p262c.C5003t) r6
            com.google.android.material.textfield.TextInputEditText r6 = r6.f13174d
            android.content.Context r2 = r4.mo2576p0()
            p308k.p323z.p325d.C5942k.m22324a(r2, r1)
            int r5 = r5.mo15058f()
            int r5 = p255io.stashteam.stashapp.utils.p304f.C5699e.m21783a(r2, r5)
            r6.setTextColor(r5)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            com.google.android.material.textfield.TextInputEditText r5 = r5.f13174d
            java.lang.String r6 = "binding.fieldTitle"
            p308k.p323z.p325d.C5942k.m22324a(r5, r6)
            io.stashteam.stashapp.f.b.b$e r1 = new io.stashteam.stashapp.f.b.b$e
            r1.<init>(r4)
            p255io.stashteam.stashapp.utils.p304f.C5703i.m21797a(r5, r1)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            androidx.appcompat.widget.AppCompatImageButton r5 = r5.f13175e
            java.lang.String r1 = "binding.imageLock"
            p308k.p323z.p325d.C5942k.m22324a(r5, r1)
            io.stashteam.stashapp.e.c.f r1 = r4.f14066s0
            r2 = 1
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r1.mo14906f()
            if (r1 != r2) goto L_0x00ca
            r1 = 1
            goto L_0x00cb
        L_0x00ca:
            r1 = 0
        L_0x00cb:
            r5.setSelected(r1)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            androidx.appcompat.widget.AppCompatImageButton r5 = r5.f13175e
            io.stashteam.stashapp.f.b.b$f r1 = new io.stashteam.stashapp.f.b.b$f
            r1.<init>(r4)
            r5.setOnClickListener(r1)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            com.google.android.material.textfield.TextInputEditText r5 = r5.f13173c
            io.stashteam.stashapp.e.c.f r1 = r4.f14066s0
            if (r1 == 0) goto L_0x00f1
            java.lang.String r1 = r1.mo14901b()
            if (r1 == 0) goto L_0x00f1
            r3 = r1
        L_0x00f1:
            r5.setText(r3)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            com.google.android.material.button.MaterialButton r5 = r5.f13172b
            io.stashteam.stashapp.e.c.f r1 = r4.f14066s0
            if (r1 != 0) goto L_0x0104
            r1 = 2131755039(0x7f10001f, float:1.9140946E38)
            goto L_0x0107
        L_0x0104:
            r1 = 2131755044(0x7f100024, float:1.9140956E38)
        L_0x0107:
            r5.setText(r1)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            com.google.android.material.button.MaterialButton r5 = r5.f13172b
            java.lang.String r1 = "binding.btnSave"
            p308k.p323z.p325d.C5942k.m22324a(r5, r1)
            f.x.a r1 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r1 = (p255io.stashteam.stashapp.p262c.C5003t) r1
            com.google.android.material.textfield.TextInputEditText r1 = r1.f13174d
            p308k.p323z.p325d.C5942k.m22324a(r1, r6)
            android.text.Editable r6 = r1.getText()
            if (r6 == 0) goto L_0x0130
            boolean r6 = p308k.p313e0.C5787p.m21972a(r6)
            r6 = r6 ^ r2
            if (r6 != r2) goto L_0x0130
            r0 = 1
        L_0x0130:
            r5.setEnabled(r0)
            f.x.a r5 = r4.mo15026x0()
            io.stashteam.stashapp.c.t r5 = (p255io.stashteam.stashapp.p262c.C5003t) r5
            com.google.android.material.button.MaterialButton r5 = r5.f13172b
            io.stashteam.stashapp.f.b.b$g r6 = new io.stashteam.stashapp.f.b.b$g
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p288b.C5361b.mo2506a(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo15056a(C5297f fVar, C5365c cVar) {
        C5942k.m22327b(cVar, "listener");
        this.f14066s0 = fVar;
        this.f14065r0 = cVar;
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        Dialog n = super.mo376n(bundle);
        C5942k.m22324a((Object) n, "super.onCreateDialog(savedInstanceState)");
        Window window = n.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        return n;
    }
}
