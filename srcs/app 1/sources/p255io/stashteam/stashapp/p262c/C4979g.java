package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.g */
public final class C4979g implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13052a;

    /* renamed from: b */
    public final MaterialButton f13053b;

    /* renamed from: c */
    public final VideoView f13054c;

    private C4979g(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatTextView appCompatTextView, VideoView videoView) {
        this.f13052a = constraintLayout;
        this.f13053b = materialButton;
        this.f13054c = videoView;
    }

    /* renamed from: a */
    public static C4979g m19938a(LayoutInflater layoutInflater) {
        return m19939a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4979g m19939a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_onboarding_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19940a(inflate);
    }

    /* renamed from: a */
    public static C4979g m19940a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_start);
        if (materialButton != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_header);
            if (appCompatTextView != null) {
                VideoView videoView = (VideoView) view.findViewById(R.id.video_view);
                if (videoView != null) {
                    return new C4979g((ConstraintLayout) view, materialButton, appCompatTextView, videoView);
                }
                str = "videoView";
            } else {
                str = "textHeader";
            }
        } else {
            str = "btnStart";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19942b() {
        return this.f13052a;
    }
}
