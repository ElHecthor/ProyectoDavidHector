package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.appcompat.widget.C0275t0;
import p071f.p072a.C3093a;
import p071f.p072a.C3098f;
import p071f.p072a.C3099g;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

public class ListMenuItemView extends LinearLayout implements C0140a, SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0126i f413f;

    /* renamed from: g */
    private ImageView f414g;

    /* renamed from: h */
    private RadioButton f415h;

    /* renamed from: i */
    private TextView f416i;

    /* renamed from: j */
    private CheckBox f417j;

    /* renamed from: k */
    private TextView f418k;

    /* renamed from: l */
    private ImageView f419l;

    /* renamed from: m */
    private ImageView f420m;

    /* renamed from: n */
    private LinearLayout f421n;

    /* renamed from: o */
    private Drawable f422o;

    /* renamed from: p */
    private int f423p;

    /* renamed from: q */
    private Context f424q;

    /* renamed from: r */
    private boolean f425r;

    /* renamed from: s */
    private Drawable f426s;

    /* renamed from: t */
    private boolean f427t;

    /* renamed from: u */
    private LayoutInflater f428u;

    /* renamed from: v */
    private boolean f429v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0275t0 a = C0275t0.m1311a(getContext(), attributeSet, C3102j.MenuView, i, 0);
        this.f422o = a.mo1741b(C3102j.MenuView_android_itemBackground);
        this.f423p = a.mo1750g(C3102j.MenuView_android_itemTextAppearance, -1);
        this.f425r = a.mo1738a(C3102j.MenuView_preserveIconSpacing, false);
        this.f424q = context;
        this.f426s = a.mo1741b(C3102j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C3093a.dropDownListViewStyle, 0);
        this.f427t = obtainStyledAttributes.hasValue(0);
        a.mo1737a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m528a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C3099g.abc_list_menu_item_checkbox, this, false);
        this.f417j = checkBox;
        m529a(checkBox);
    }

    /* renamed from: a */
    private void m529a(View view) {
        m530a(view, -1);
    }

    /* renamed from: a */
    private void m530a(View view, int i) {
        LinearLayout linearLayout = this.f421n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m531c() {
        ImageView imageView = (ImageView) getInflater().inflate(C3099g.abc_list_menu_item_icon, this, false);
        this.f414g = imageView;
        m530a((View) imageView, 0);
    }

    /* renamed from: d */
    private void m532d() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C3099g.abc_list_menu_item_radio, this, false);
        this.f415h = radioButton;
        m529a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f428u == null) {
            this.f428u = LayoutInflater.from(getContext());
        }
        return this.f428u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f419l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo416a(C0126i iVar, int i) {
        this.f413f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo656a((C0140a) this));
        setCheckable(iVar.isCheckable());
        mo443a(iVar.mo692m(), iVar.mo664d());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo443a(boolean z, char c) {
        int i = (!z || !this.f413f.mo692m()) ? 8 : 0;
        if (i == 0) {
            this.f418k.setText(this.f413f.mo666e());
        }
        if (this.f418k.getVisibility() != i) {
            this.f418k.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f420m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f420m.getLayoutParams();
            rect.top += this.f420m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public boolean mo418b() {
        return false;
    }

    public C0126i getItemData() {
        return this.f413f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C3379v.m13787a((View) this, this.f422o);
        TextView textView = (TextView) findViewById(C3098f.title);
        this.f416i = textView;
        int i = this.f423p;
        if (i != -1) {
            textView.setTextAppearance(this.f424q, i);
        }
        this.f418k = (TextView) findViewById(C3098f.shortcut);
        ImageView imageView = (ImageView) findViewById(C3098f.submenuarrow);
        this.f419l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f426s);
        }
        this.f420m = (ImageView) findViewById(C3098f.group_divider);
        this.f421n = (LinearLayout) findViewById(C3098f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f414g != null && this.f425r) {
            LayoutParams layoutParams = (LayoutParams) this.f414g.getLayoutParams();
            int i3 = getLayoutParams().height;
            if (i3 > 0 && layoutParams.width <= 0) {
                layoutParams.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f415h != null || this.f417j != null) {
            if (this.f413f.mo684i()) {
                if (this.f415h == null) {
                    m532d();
                }
                compoundButton2 = this.f415h;
                compoundButton = this.f417j;
            } else {
                if (this.f417j == null) {
                    m528a();
                }
                compoundButton2 = this.f417j;
                compoundButton = this.f415h;
            }
            if (z) {
                compoundButton2.setChecked(this.f413f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f417j;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f415h;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f413f.mo684i()) {
            if (this.f415h == null) {
                m532d();
            }
            compoundButton = this.f415h;
        } else {
            if (this.f417j == null) {
                m528a();
            }
            compoundButton = this.f417j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f429v = z;
        this.f425r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f420m;
        if (imageView != null) {
            imageView.setVisibility((this.f427t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f413f.mo691l() || this.f429v;
        if (!z && !this.f425r) {
            return;
        }
        if (this.f414g != null || drawable != null || this.f425r) {
            if (this.f414g == null) {
                m531c();
            }
            if (drawable != null || this.f425r) {
                ImageView imageView = this.f414g;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f414g.getVisibility() != 0) {
                    this.f414g.setVisibility(0);
                }
            } else {
                this.f414g.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f416i.setText(charSequence);
            if (this.f416i.getVisibility() != 0) {
                textView = this.f416i;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f416i.getVisibility() != 8) {
                textView = this.f416i;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
