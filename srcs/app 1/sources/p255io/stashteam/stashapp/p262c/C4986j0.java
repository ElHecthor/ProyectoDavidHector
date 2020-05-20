package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.j0 */
public final class C4986j0 implements C3657a {

    /* renamed from: a */
    private final View f13091a;

    /* renamed from: b */
    public final MaterialTextView f13092b;

    /* renamed from: c */
    public final EmojiAppCompatTextView f13093c;

    /* renamed from: d */
    public final MaterialTextView f13094d;

    private C4986j0(View view, MaterialTextView materialTextView, EmojiAppCompatTextView emojiAppCompatTextView, MaterialTextView materialTextView2) {
        this.f13091a = view;
        this.f13092b = materialTextView;
        this.f13093c = emojiAppCompatTextView;
        this.f13094d = materialTextView2;
    }

    /* renamed from: a */
    public static C4986j0 m19969a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_empty, viewGroup);
            return m19970a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4986j0 m19970a(View view) {
        String str;
        MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_desc);
        if (materialTextView != null) {
            EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) view.findViewById(R.id.text_emoji);
            if (emojiAppCompatTextView != null) {
                MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_title);
                if (materialTextView2 != null) {
                    return new C4986j0(view, materialTextView, emojiAppCompatTextView, materialTextView2);
                }
                str = "textTitle";
            } else {
                str = "textEmoji";
            }
        } else {
            str = "textDesc";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13091a;
    }
}
