package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.itemviews.SettingItemView;

/* renamed from: io.stashteam.stashapp.c.j */
public final class C4985j implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13076a;

    /* renamed from: b */
    public final C4982h0 f13077b;

    /* renamed from: c */
    public final MaterialButton f13078c;

    /* renamed from: d */
    public final TextInputEditText f13079d;

    /* renamed from: e */
    public final TextInputEditText f13080e;

    /* renamed from: f */
    public final AppCompatImageView f13081f;

    /* renamed from: g */
    public final SettingItemView f13082g;

    /* renamed from: h */
    public final SettingItemView f13083h;

    /* renamed from: i */
    public final SettingItemView f13084i;

    /* renamed from: j */
    public final SettingItemView f13085j;

    /* renamed from: k */
    public final SettingItemView f13086k;

    /* renamed from: l */
    public final SettingItemView f13087l;

    /* renamed from: m */
    public final SettingItemView f13088m;

    /* renamed from: n */
    public final SettingItemView f13089n;

    /* renamed from: o */
    public final SwitchMaterial f13090o;

    private C4985j(CoordinatorLayout coordinatorLayout, C4982h0 h0Var, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, AppCompatImageView appCompatImageView, SettingItemView settingItemView, SettingItemView settingItemView2, SettingItemView settingItemView3, SettingItemView settingItemView4, SettingItemView settingItemView5, SettingItemView settingItemView6, SettingItemView settingItemView7, SettingItemView settingItemView8, SwitchMaterial switchMaterial) {
        this.f13076a = coordinatorLayout;
        this.f13077b = h0Var;
        this.f13078c = materialButton;
        this.f13079d = textInputEditText;
        this.f13080e = textInputEditText2;
        this.f13081f = appCompatImageView;
        this.f13082g = settingItemView;
        this.f13083h = settingItemView2;
        this.f13084i = settingItemView3;
        this.f13085j = settingItemView4;
        this.f13086k = settingItemView5;
        this.f13087l = settingItemView6;
        this.f13088m = settingItemView7;
        this.f13089n = settingItemView8;
        this.f13090o = switchMaterial;
    }

    /* renamed from: a */
    public static C4985j m19964a(LayoutInflater layoutInflater) {
        return m19965a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4985j m19965a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19966a(inflate);
    }

    /* renamed from: a */
    public static C4985j m19966a(View view) {
        String str;
        View view2 = view;
        View findViewById = view2.findViewById(R.id.appbar);
        if (findViewById != null) {
            C4982h0 a = C4982h0.m19952a(findViewById);
            MaterialButton materialButton = (MaterialButton) view2.findViewById(R.id.btn_logout);
            if (materialButton != null) {
                TextInputEditText textInputEditText = (TextInputEditText) view2.findViewById(R.id.field_name);
                if (textInputEditText != null) {
                    TextInputEditText textInputEditText2 = (TextInputEditText) view2.findViewById(R.id.field_nickname);
                    if (textInputEditText2 != null) {
                        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.image_avatar);
                        if (appCompatImageView != null) {
                            SettingItemView settingItemView = (SettingItemView) view2.findViewById(R.id.item_contact_us);
                            if (settingItemView != null) {
                                SettingItemView settingItemView2 = (SettingItemView) view2.findViewById(R.id.item_facebook);
                                if (settingItemView2 != null) {
                                    SettingItemView settingItemView3 = (SettingItemView) view2.findViewById(R.id.item_policy);
                                    if (settingItemView3 != null) {
                                        SettingItemView settingItemView4 = (SettingItemView) view2.findViewById(R.id.item_rate_us);
                                        if (settingItemView4 != null) {
                                            SettingItemView settingItemView5 = (SettingItemView) view2.findViewById(R.id.item_send_feedback);
                                            if (settingItemView5 != null) {
                                                SettingItemView settingItemView6 = (SettingItemView) view2.findViewById(R.id.item_terms);
                                                if (settingItemView6 != null) {
                                                    SettingItemView settingItemView7 = (SettingItemView) view2.findViewById(R.id.item_theme);
                                                    if (settingItemView7 != null) {
                                                        SettingItemView settingItemView8 = (SettingItemView) view2.findViewById(R.id.item_twitter);
                                                        if (settingItemView8 != null) {
                                                            SwitchMaterial switchMaterial = (SwitchMaterial) view2.findViewById(R.id.switch_hide_profile);
                                                            if (switchMaterial != null) {
                                                                C4985j jVar = new C4985j((CoordinatorLayout) view2, a, materialButton, textInputEditText, textInputEditText2, appCompatImageView, settingItemView, settingItemView2, settingItemView3, settingItemView4, settingItemView5, settingItemView6, settingItemView7, settingItemView8, switchMaterial);
                                                                return jVar;
                                                            }
                                                            str = "switchHideProfile";
                                                        } else {
                                                            str = "itemTwitter";
                                                        }
                                                    } else {
                                                        str = "itemTheme";
                                                    }
                                                } else {
                                                    str = "itemTerms";
                                                }
                                            } else {
                                                str = "itemSendFeedback";
                                            }
                                        } else {
                                            str = "itemRateUs";
                                        }
                                    } else {
                                        str = "itemPolicy";
                                    }
                                } else {
                                    str = "itemFacebook";
                                }
                            } else {
                                str = "itemContactUs";
                            }
                        } else {
                            str = "imageAvatar";
                        }
                    } else {
                        str = "fieldNickname";
                    }
                } else {
                    str = "fieldName";
                }
            } else {
                str = "btnLogout";
            }
        } else {
            str = "appbar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19968b() {
        return this.f13076a;
    }
}
