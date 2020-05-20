package p071f.p097h.p106k;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p071f.p097h.p107l.C3316c;

/* renamed from: f.h.k.d */
public class C3302d implements Spannable {

    /* renamed from: f */
    private final Spannable f9469f;

    /* renamed from: g */
    private final C3303a f9470g;

    /* renamed from: h */
    private final PrecomputedText f9471h;

    /* renamed from: f.h.k.d$a */
    public static final class C3303a {

        /* renamed from: a */
        private final TextPaint f9472a;

        /* renamed from: b */
        private final TextDirectionHeuristic f9473b;

        /* renamed from: c */
        private final int f9474c;

        /* renamed from: d */
        private final int f9475d;

        /* renamed from: f.h.k.d$a$a */
        public static class C3304a {

            /* renamed from: a */
            private final TextPaint f9476a;

            /* renamed from: b */
            private TextDirectionHeuristic f9477b;

            /* renamed from: c */
            private int f9478c;

            /* renamed from: d */
            private int f9479d;

            public C3304a(TextPaint textPaint) {
                this.f9476a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f9478c = 1;
                    this.f9479d = 1;
                } else {
                    this.f9479d = 0;
                    this.f9478c = 0;
                }
                this.f9477b = VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C3304a mo10685a(int i) {
                this.f9478c = i;
                return this;
            }

            /* renamed from: a */
            public C3304a mo10686a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f9477b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C3303a mo10687a() {
                return new C3303a(this.f9476a, this.f9477b, this.f9478c, this.f9479d);
            }

            /* renamed from: b */
            public C3304a mo10688b(int i) {
                this.f9479d = i;
                return this;
            }
        }

        public C3303a(Params params) {
            this.f9472a = params.getTextPaint();
            this.f9473b = params.getTextDirection();
            this.f9474c = params.getBreakStrategy();
            this.f9475d = params.getHyphenationFrequency();
            int i = VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        C3303a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 29) {
                new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f9472a = textPaint;
            this.f9473b = textDirectionHeuristic;
            this.f9474c = i;
            this.f9475d = i2;
        }

        /* renamed from: a */
        public int mo10677a() {
            return this.f9474c;
        }

        /* renamed from: a */
        public boolean mo10678a(C3303a aVar) {
            if ((VERSION.SDK_INT >= 23 && (this.f9474c != aVar.mo10677a() || this.f9475d != aVar.mo10679b())) || this.f9472a.getTextSize() != aVar.mo10681d().getTextSize() || this.f9472a.getTextScaleX() != aVar.mo10681d().getTextScaleX() || this.f9472a.getTextSkewX() != aVar.mo10681d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f9472a.getLetterSpacing() != aVar.mo10681d().getLetterSpacing() || !TextUtils.equals(this.f9472a.getFontFeatureSettings(), aVar.mo10681d().getFontFeatureSettings()))) || this.f9472a.getFlags() != aVar.mo10681d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f9472a.getTextLocales().equals(aVar.mo10681d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f9472a.getTextLocale().equals(aVar.mo10681d().getTextLocale())) {
                return false;
            }
            if (this.f9472a.getTypeface() == null) {
                if (aVar.mo10681d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f9472a.getTypeface().equals(aVar.mo10681d().getTypeface())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public int mo10679b() {
            return this.f9475d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo10680c() {
            return this.f9473b;
        }

        /* renamed from: d */
        public TextPaint mo10681d() {
            return this.f9472a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3303a)) {
                return false;
            }
            C3303a aVar = (C3303a) obj;
            if (!mo10678a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.f9473b == aVar.mo10680c();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return C3316c.m13531a(Float.valueOf(this.f9472a.getTextSize()), Float.valueOf(this.f9472a.getTextScaleX()), Float.valueOf(this.f9472a.getTextSkewX()), Float.valueOf(this.f9472a.getLetterSpacing()), Integer.valueOf(this.f9472a.getFlags()), this.f9472a.getTextLocales(), this.f9472a.getTypeface(), Boolean.valueOf(this.f9472a.isElegantTextHeight()), this.f9473b, Integer.valueOf(this.f9474c), Integer.valueOf(this.f9475d));
            } else if (i >= 21) {
                return C3316c.m13531a(Float.valueOf(this.f9472a.getTextSize()), Float.valueOf(this.f9472a.getTextScaleX()), Float.valueOf(this.f9472a.getTextSkewX()), Float.valueOf(this.f9472a.getLetterSpacing()), Integer.valueOf(this.f9472a.getFlags()), this.f9472a.getTextLocale(), this.f9472a.getTypeface(), Boolean.valueOf(this.f9472a.isElegantTextHeight()), this.f9473b, Integer.valueOf(this.f9474c), Integer.valueOf(this.f9475d));
            } else if (i >= 18) {
                return C3316c.m13531a(Float.valueOf(this.f9472a.getTextSize()), Float.valueOf(this.f9472a.getTextScaleX()), Float.valueOf(this.f9472a.getTextSkewX()), Integer.valueOf(this.f9472a.getFlags()), this.f9472a.getTextLocale(), this.f9472a.getTypeface(), this.f9473b, Integer.valueOf(this.f9474c), Integer.valueOf(this.f9475d));
            } else if (i >= 17) {
                return C3316c.m13531a(Float.valueOf(this.f9472a.getTextSize()), Float.valueOf(this.f9472a.getTextScaleX()), Float.valueOf(this.f9472a.getTextSkewX()), Integer.valueOf(this.f9472a.getFlags()), this.f9472a.getTextLocale(), this.f9472a.getTypeface(), this.f9473b, Integer.valueOf(this.f9474c), Integer.valueOf(this.f9475d));
            } else {
                return C3316c.m13531a(Float.valueOf(this.f9472a.getTextSize()), Float.valueOf(this.f9472a.getTextScaleX()), Float.valueOf(this.f9472a.getTextSkewX()), Integer.valueOf(this.f9472a.getFlags()), this.f9472a.getTypeface(), this.f9473b, Integer.valueOf(this.f9474c), Integer.valueOf(this.f9475d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f9472a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f9472a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f9472a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f9473b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f9474c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f9475d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p106k.C3302d.C3303a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C3303a mo10664a() {
        return this.f9470g;
    }

    /* renamed from: b */
    public PrecomputedText mo10665b() {
        Spannable spannable = this.f9469f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f9469f.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f9469f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f9469f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f9469f.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return VERSION.SDK_INT >= 29 ? this.f9471h.getSpans(i, i2, cls) : this.f9469f.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f9469f.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f9469f.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 29) {
            this.f9471h.removeSpan(obj);
        } else {
            this.f9469f.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 29) {
            this.f9471h.setSpan(obj, i, i2, i3);
        } else {
            this.f9469f.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f9469f.subSequence(i, i2);
    }

    public String toString() {
        return this.f9469f.toString();
    }
}
