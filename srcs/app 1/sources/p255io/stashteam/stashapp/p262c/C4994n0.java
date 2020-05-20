package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.n0 */
public final class C4994n0 implements C3657a {

    /* renamed from: a */
    private final View f13128a;

    /* renamed from: b */
    public final AppCompatImageView f13129b;

    /* renamed from: c */
    public final RecyclerView f13130c;

    /* renamed from: d */
    public final EmojiAppCompatTextView f13131d;

    private C4994n0(View view, AppCompatImageView appCompatImageView, RecyclerView recyclerView, EmojiAppCompatTextView emojiAppCompatTextView) {
        this.f13128a = view;
        this.f13129b = appCompatImageView;
        this.f13130c = recyclerView;
        this.f13131d = emojiAppCompatTextView;
    }

    /* renamed from: a */
    public static C4994n0 m19999a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_rate, viewGroup);
            return m20000a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4994n0 m20000a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_emoji);
        if (appCompatImageView != null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            if (recyclerView != null) {
                EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) view.findViewById(R.id.text_emoji);
                if (emojiAppCompatTextView != null) {
                    return new C4994n0(view, appCompatImageView, recyclerView, emojiAppCompatTextView);
                }
                str = "textEmoji";
            } else {
                str = "recyclerView";
            }
        } else {
            str = "imageEmoji";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13128a;
    }
}
