package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0395l;
import p071f.p097h.p108m.C3378u;

public class AppCompatImageView extends ImageView implements C3378u, C0395l {

    /* renamed from: f */
    private final C0211e f705f;

    /* renamed from: g */
    private final C0247m f706g;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0211e eVar = new C0211e(this);
        this.f705f = eVar;
        eVar.mo1326a(attributeSet, i);
        C0247m mVar = new C0247m(this);
        this.f706g = mVar;
        mVar.mo1566a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f705f;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1562a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f705f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f705f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0247m mVar = this.f706g;
        if (mVar != null) {
            return mVar.mo1567b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C0247m mVar = this.f706g;
        if (mVar != null) {
            return mVar.mo1568c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f706g.mo1569d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f705f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f705f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1562a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1562a();
        }
    }

    public void setImageResource(int i) {
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1563a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1562a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f705f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f705f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1564a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C0247m mVar = this.f706g;
        if (mVar != null) {
            mVar.mo1565a(mode);
        }
    }
}