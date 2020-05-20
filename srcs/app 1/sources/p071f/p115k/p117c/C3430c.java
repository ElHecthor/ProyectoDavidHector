package p071f.p115k.p117c;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import p071f.p097h.p100f.C3258e;

/* renamed from: f.k.c.c */
final class C3430c {

    /* renamed from: a */
    private final C3428h f9700a;

    /* renamed from: b */
    private final C3439f f9701b;

    /* renamed from: c */
    private C3432b f9702c = new C3432b();

    /* renamed from: d */
    private final boolean f9703d;

    /* renamed from: e */
    private final int[] f9704e;

    /* renamed from: f.k.c.c$a */
    private static final class C3431a {
        /* renamed from: a */
        static int m14073a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m14074b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: f.k.c.c$b */
    public static class C3432b {

        /* renamed from: b */
        private static final ThreadLocal<StringBuilder> f9705b = new ThreadLocal<>();

        /* renamed from: a */
        private final TextPaint f9706a;

        C3432b() {
            TextPaint textPaint = new TextPaint();
            this.f9706a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* renamed from: a */
        private static StringBuilder m14075a() {
            if (f9705b.get() == null) {
                f9705b.set(new StringBuilder());
            }
            return (StringBuilder) f9705b.get();
        }

        /* renamed from: a */
        public boolean mo10958a(CharSequence charSequence, int i, int i2) {
            StringBuilder a = m14075a();
            a.setLength(0);
            while (i < i2) {
                a.append(charSequence.charAt(i));
                i++;
            }
            return C3258e.m13348a(this.f9706a, a.toString());
        }
    }

    /* renamed from: f.k.c.c$c */
    static final class C3433c {

        /* renamed from: a */
        private int f9707a = 1;

        /* renamed from: b */
        private final C3440a f9708b;

        /* renamed from: c */
        private C3440a f9709c;

        /* renamed from: d */
        private C3440a f9710d;

        /* renamed from: e */
        private int f9711e;

        /* renamed from: f */
        private int f9712f;

        /* renamed from: g */
        private final boolean f9713g;

        /* renamed from: h */
        private final int[] f9714h;

        C3433c(C3440a aVar, boolean z, int[] iArr) {
            this.f9708b = aVar;
            this.f9709c = aVar;
            this.f9713g = z;
            this.f9714h = iArr;
        }

        /* renamed from: b */
        private static boolean m14077b(int i) {
            return i == 65039;
        }

        /* renamed from: c */
        private static boolean m14078c(int i) {
            return i == 65038;
        }

        /* renamed from: d */
        private int m14079d() {
            this.f9707a = 1;
            this.f9709c = this.f9708b;
            this.f9712f = 0;
            return 1;
        }

        /* renamed from: e */
        private boolean m14080e() {
            if (this.f9709c.mo10979a().mo10955g() || m14077b(this.f9711e)) {
                return true;
            }
            if (this.f9713g) {
                if (this.f9714h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f9714h, this.f9709c.mo10979a().mo10947a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo10959a(int i) {
            C3440a a = this.f9709c.mo10980a(i);
            int i2 = 3;
            if (this.f9707a == 2) {
                if (a != null) {
                    this.f9709c = a;
                    this.f9712f++;
                } else if (!m14078c(i)) {
                    if (!m14077b(i)) {
                        if (this.f9709c.mo10979a() != null && (this.f9712f != 1 || m14080e())) {
                            this.f9710d = this.f9709c;
                            m14079d();
                            this.f9711e = i;
                            return i2;
                        }
                    }
                }
                i2 = 2;
                this.f9711e = i;
                return i2;
            } else if (a != null) {
                this.f9707a = 2;
                this.f9709c = a;
                this.f9712f = 1;
                i2 = 2;
                this.f9711e = i;
                return i2;
            }
            i2 = m14079d();
            this.f9711e = i;
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3429b mo10960a() {
            return this.f9709c.mo10979a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3429b mo10961b() {
            return this.f9710d.mo10979a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo10962c() {
            return this.f9707a == 2 && this.f9709c.mo10979a() != null && (this.f9712f > 1 || m14080e());
        }
    }

    C3430c(C3439f fVar, C3428h hVar, boolean z, int[] iArr) {
        this.f9700a = hVar;
        this.f9701b = fVar;
        this.f9703d = z;
        this.f9704e = iArr;
    }

    /* renamed from: a */
    private void m14065a(Spannable spannable, C3429b bVar, int i, int i2) {
        spannable.setSpan(this.f9700a.mo10945a(bVar), i, i2, 33);
    }

    /* renamed from: a */
    private static boolean m14066a(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: a */
    static boolean m14067a(Editable editable, int i, KeyEvent keyEvent) {
        boolean z = i != 67 ? i != 112 ? false : m14068a(editable, keyEvent, true) : m14068a(editable, keyEvent, false);
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: a */
    private static boolean m14068a(Editable editable, KeyEvent keyEvent, boolean z) {
        if (m14069a(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (m14066a(selectionStart, selectionEnd)) {
            return false;
        }
        C3434d[] dVarArr = (C3434d[]) editable.getSpans(selectionStart, selectionEnd, C3434d.class);
        if (dVarArr != null && dVarArr.length > 0) {
            int length = dVarArr.length;
            int i = 0;
            while (i < length) {
                C3434d dVar = dVarArr[i];
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m14069a(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    static boolean m14070a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m14066a(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C3431a.m14073a(editable, selectionStart, Math.max(i, 0));
                i3 = C3431a.m14074b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C3434d[] dVarArr = (C3434d[]) editable.getSpans(i4, i3, C3434d.class);
            if (dVarArr != null && dVarArr.length > 0) {
                for (C3434d dVar : dVarArr) {
                    int spanStart = editable.getSpanStart(dVar);
                    int spanEnd = editable.getSpanEnd(dVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m14071a(CharSequence charSequence, int i, int i2, C3429b bVar) {
        boolean z = false;
        if (VERSION.SDK_INT < 23 && bVar.mo10953e() > VERSION.SDK_INT) {
            return false;
        }
        if (bVar.mo10950b() == 0) {
            bVar.mo10949a(this.f9702c.mo10958a(charSequence, i, i2));
        }
        if (bVar.mo10950b() == 2) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.CharSequence, code=null, for r10v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v8
      assigns: []
      uses: []
      mth insns count: 128
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo10957a(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji.widget.C0411j
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji.widget.j r1 = (androidx.emoji.widget.C0411j) r1
            r1.mo2434a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x002e
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0116 }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<f.k.c.d> r5 = p071f.p115k.p117c.C3434d.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x0116 }
            if (r2 > r12) goto L_0x002e
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r1.<init>(r10)     // Catch:{ all -> 0x0116 }
            goto L_0x002e
        L_0x002b:
            r1 = r10
            android.text.Spannable r1 = (android.text.Spannable) r1     // Catch:{ all -> 0x0116 }
        L_0x002e:
            r2 = 0
            if (r1 == 0) goto L_0x005c
            java.lang.Class<f.k.c.d> r3 = p071f.p115k.p117c.C3434d.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x0116 }
            f.k.c.d[] r3 = (p071f.p115k.p117c.C3434d[]) r3     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            if (r4 <= 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            r5 = 0
        L_0x0040:
            if (r5 >= r4) goto L_0x005c
            r6 = r3[r5]     // Catch:{ all -> 0x0116 }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x0116 }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x0116 }
            if (r7 == r12) goto L_0x0051
            r1.removeSpan(r6)     // Catch:{ all -> 0x0116 }
        L_0x0051:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x0116 }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x0116 }
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005c:
            if (r11 == r12) goto L_0x010d
            int r3 = r10.length()     // Catch:{ all -> 0x0116 }
            if (r11 < r3) goto L_0x0066
            goto L_0x010d
        L_0x0066:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            int r3 = r1.length()     // Catch:{ all -> 0x0116 }
            java.lang.Class<f.k.c.d> r4 = p071f.p115k.p117c.C3434d.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x0116 }
            f.k.c.d[] r3 = (p071f.p115k.p117c.C3434d[]) r3     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            int r13 = r13 - r3
        L_0x007b:
            f.k.c.c$c r3 = new f.k.c.c$c     // Catch:{ all -> 0x0116 }
            f.k.c.f r4 = r9.f9701b     // Catch:{ all -> 0x0116 }
            f.k.c.f$a r4 = r4.mo10977d()     // Catch:{ all -> 0x0116 }
            boolean r5 = r9.f9703d     // Catch:{ all -> 0x0116 }
            int[] r6 = r9.f9704e     // Catch:{ all -> 0x0116 }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x0116 }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0091:
            r1 = r11
        L_0x0092:
            if (r11 >= r12) goto L_0x00df
            if (r4 >= r13) goto L_0x00df
            int r6 = r3.mo10959a(r5)     // Catch:{ all -> 0x0116 }
            r7 = 1
            if (r6 == r7) goto L_0x00cd
            r7 = 2
            if (r6 == r7) goto L_0x00c1
            r7 = 3
            if (r6 == r7) goto L_0x00a4
            goto L_0x0092
        L_0x00a4:
            if (r14 != 0) goto L_0x00b0
            f.k.c.b r6 = r3.mo10961b()     // Catch:{ all -> 0x0116 }
            boolean r6 = r9.m14071a(r10, r1, r11, r6)     // Catch:{ all -> 0x0116 }
            if (r6 != 0) goto L_0x0091
        L_0x00b0:
            if (r2 != 0) goto L_0x00b7
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r2.<init>(r10)     // Catch:{ all -> 0x0116 }
        L_0x00b7:
            f.k.c.b r6 = r3.mo10961b()     // Catch:{ all -> 0x0116 }
            r9.m14065a(r2, r6, r1, r11)     // Catch:{ all -> 0x0116 }
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00c1:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x0116 }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0092
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            goto L_0x0092
        L_0x00cd:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0116 }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00dd
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            r5 = r11
        L_0x00dd:
            r11 = r1
            goto L_0x0092
        L_0x00df:
            boolean r12 = r3.mo10962c()     // Catch:{ all -> 0x0116 }
            if (r12 == 0) goto L_0x0102
            if (r4 >= r13) goto L_0x0102
            if (r14 != 0) goto L_0x00f3
            f.k.c.b r12 = r3.mo10960a()     // Catch:{ all -> 0x0116 }
            boolean r12 = r9.m14071a(r10, r1, r11, r12)     // Catch:{ all -> 0x0116 }
            if (r12 != 0) goto L_0x0102
        L_0x00f3:
            if (r2 != 0) goto L_0x00fb
            android.text.SpannableString r12 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r12.<init>(r10)     // Catch:{ all -> 0x0116 }
            r2 = r12
        L_0x00fb:
            f.k.c.b r12 = r3.mo10960a()     // Catch:{ all -> 0x0116 }
            r9.m14065a(r2, r12, r1, r11)     // Catch:{ all -> 0x0116 }
        L_0x0102:
            if (r2 != 0) goto L_0x0105
            r2 = r10
        L_0x0105:
            if (r0 == 0) goto L_0x010c
            androidx.emoji.widget.j r10 = (androidx.emoji.widget.C0411j) r10
            r10.mo2439b()
        L_0x010c:
            return r2
        L_0x010d:
            if (r0 == 0) goto L_0x0115
            r11 = r10
            androidx.emoji.widget.j r11 = (androidx.emoji.widget.C0411j) r11
            r11.mo2439b()
        L_0x0115:
            return r10
        L_0x0116:
            r11 = move-exception
            if (r0 == 0) goto L_0x011e
            androidx.emoji.widget.j r10 = (androidx.emoji.widget.C0411j) r10
            r10.mo2439b()
        L_0x011e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p115k.p117c.C3430c.mo10957a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
