package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p071f.p072a.C3093a;
import p071f.p072a.C3095c;
import p071f.p072a.C3097e;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p100f.C3257d;

/* renamed from: androidx.appcompat.widget.j */
public final class C0236j {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Mode f1024b = Mode.SRC_IN;

    /* renamed from: c */
    private static C0236j f1025c;

    /* renamed from: a */
    private C0229i0 f1026a;

    /* renamed from: androidx.appcompat.widget.j$a */
    static class C0237a implements C0234e {

        /* renamed from: a */
        private final int[] f1027a = {C3097e.abc_textfield_search_default_mtrl_alpha, C3097e.abc_textfield_default_mtrl_alpha, C3097e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1028b = {C3097e.abc_ic_commit_search_api_mtrl_alpha, C3097e.abc_seekbar_tick_mark_material, C3097e.abc_ic_menu_share_mtrl_alpha, C3097e.abc_ic_menu_copy_mtrl_am_alpha, C3097e.abc_ic_menu_cut_mtrl_alpha, C3097e.abc_ic_menu_selectall_mtrl_alpha, C3097e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1029c = {C3097e.abc_textfield_activated_mtrl_alpha, C3097e.abc_textfield_search_activated_mtrl_alpha, C3097e.abc_cab_background_top_mtrl_alpha, C3097e.abc_text_cursor_material, C3097e.abc_text_select_handle_left_mtrl_dark, C3097e.abc_text_select_handle_middle_mtrl_dark, C3097e.abc_text_select_handle_right_mtrl_dark, C3097e.abc_text_select_handle_left_mtrl_light, C3097e.abc_text_select_handle_middle_mtrl_light, C3097e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1030d = {C3097e.abc_popup_background_mtrl_mult, C3097e.abc_cab_background_internal_bg, C3097e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1031e = {C3097e.abc_tab_indicator_material, C3097e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1032f = {C3097e.abc_btn_check_material, C3097e.abc_btn_radio_material, C3097e.abc_btn_check_material_anim, C3097e.abc_btn_radio_material_anim};

        C0237a() {
        }

        /* renamed from: a */
        private ColorStateList m1175a(Context context) {
            return m1179b(context, 0);
        }

        /* renamed from: a */
        private void m1176a(Drawable drawable, int i, Mode mode) {
            if (C0189a0.m976a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0236j.f1024b;
            }
            drawable.setColorFilter(C0236j.m1167a(i, mode));
        }

        /* renamed from: a */
        private boolean m1177a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private ColorStateList m1178b(Context context) {
            return m1179b(context, C0254o0.m1256b(context, C3093a.colorAccent));
        }

        /* renamed from: b */
        private ColorStateList m1179b(Context context, int i) {
            int b = C0254o0.m1256b(context, C3093a.colorControlHighlight);
            return new ColorStateList(new int[][]{C0254o0.f1134b, C0254o0.f1136d, C0254o0.f1135c, C0254o0.f1138f}, new int[]{C0254o0.m1253a(context, C3093a.colorButtonNormal), C3257d.m13345b(b, i), C3257d.m13345b(b, i), i});
        }

        /* renamed from: c */
        private ColorStateList m1180c(Context context) {
            return m1179b(context, C0254o0.m1256b(context, C3093a.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m1181d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0254o0.m1257c(context, C3093a.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0254o0.f1134b;
                iArr2[0] = C0254o0.m1253a(context, C3093a.colorSwitchThumbNormal);
                iArr[1] = C0254o0.f1137e;
                iArr2[1] = C0254o0.m1256b(context, C3093a.colorControlActivated);
                iArr[2] = C0254o0.f1138f;
                iArr2[2] = C0254o0.m1256b(context, C3093a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0254o0.f1134b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0254o0.f1137e;
                iArr2[1] = C0254o0.m1256b(context, C3093a.colorControlActivated);
                iArr[2] = C0254o0.f1138f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public ColorStateList mo1469a(Context context, int i) {
            if (i == C3097e.abc_edit_text_material) {
                return C3103a.m12556b(context, C3095c.abc_tint_edittext);
            }
            if (i == C3097e.abc_switch_track_mtrl_alpha) {
                return C3103a.m12556b(context, C3095c.abc_tint_switch_track);
            }
            if (i == C3097e.abc_switch_thumb_material) {
                return m1181d(context);
            }
            if (i == C3097e.abc_btn_default_mtrl_shape) {
                return m1180c(context);
            }
            if (i == C3097e.abc_btn_borderless_material) {
                return m1175a(context);
            }
            if (i == C3097e.abc_btn_colored_material) {
                return m1178b(context);
            }
            if (i == C3097e.abc_spinner_mtrl_am_alpha || i == C3097e.abc_spinner_textfield_background_material) {
                return C3103a.m12556b(context, C3095c.abc_tint_spinner);
            }
            if (m1177a(this.f1028b, i)) {
                return C0254o0.m1257c(context, C3093a.colorControlNormal);
            }
            if (m1177a(this.f1031e, i)) {
                return C3103a.m12556b(context, C3095c.abc_tint_default);
            }
            if (m1177a(this.f1032f, i)) {
                return C3103a.m12556b(context, C3095c.abc_tint_btn_checkable);
            }
            if (i == C3097e.abc_seekbar_thumb_material) {
                return C3103a.m12556b(context, C3095c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: a */
        public Mode mo1470a(int i) {
            if (i == C3097e.abc_switch_thumb_material) {
                return Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: a */
        public Drawable mo1471a(C0229i0 i0Var, Context context, int i) {
            if (i != C3097e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{i0Var.mo1459a(context, C3097e.abc_cab_background_internal_bg), i0Var.mo1459a(context, C3097e.abc_cab_background_top_mtrl_alpha)});
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1472a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0236j.f1024b
                int[] r1 = r6.f1027a
                boolean r1 = r6.m1177a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p071f.p072a.C3093a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1029c
                boolean r1 = r6.m1177a(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p071f.p072a.C3093a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1030d
                boolean r1 = r6.m1177a(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p071f.p072a.C3097e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p071f.p072a.C3097e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0189a0.m976a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0254o0.m1256b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0236j.m1167a(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0236j.C0237a.mo1472a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public boolean mo1473b(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == C3097e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                m1176a(layerDrawable.findDrawableByLayerId(16908288), C0254o0.m1256b(context, C3093a.colorControlNormal), C0236j.f1024b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C3093a.colorControlNormal;
            } else if (i != C3097e.abc_ratingbar_material && i != C3097e.abc_ratingbar_indicator_material && i != C3097e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                m1176a(layerDrawable.findDrawableByLayerId(16908288), C0254o0.m1253a(context, C3093a.colorControlNormal), C0236j.f1024b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C3093a.colorControlActivated;
            }
            m1176a(findDrawableByLayerId, C0254o0.m1256b(context, i2), C0236j.f1024b);
            m1176a(layerDrawable.findDrawableByLayerId(16908301), C0254o0.m1256b(context, C3093a.colorControlActivated), C0236j.f1024b);
            return true;
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1167a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0236j.class) {
            a = C0229i0.m1131a(i, mode);
        }
        return a;
    }

    /* renamed from: a */
    static void m1168a(Drawable drawable, C0260r0 r0Var, int[] iArr) {
        C0229i0.m1137a(drawable, r0Var, iArr);
    }

    /* renamed from: b */
    public static synchronized C0236j m1169b() {
        C0236j jVar;
        synchronized (C0236j.class) {
            if (f1025c == null) {
                m1170c();
            }
            jVar = f1025c;
        }
        return jVar;
    }

    /* renamed from: c */
    public static synchronized void m1170c() {
        synchronized (C0236j.class) {
            if (f1025c == null) {
                C0236j jVar = new C0236j();
                f1025c = jVar;
                jVar.f1026a = C0229i0.m1135a();
                f1025c.f1026a.mo1463a((C0234e) new C0237a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo1474a(Context context, int i) {
        return this.f1026a.mo1459a(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1475a(Context context, int i, boolean z) {
        return this.f1026a.mo1460a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo1476a(Context context) {
        this.f1026a.mo1462a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo1477b(Context context, int i) {
        return this.f1026a.mo1465b(context, i);
    }
}
