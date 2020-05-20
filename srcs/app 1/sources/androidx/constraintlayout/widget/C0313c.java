package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0313c {

    /* renamed from: a */
    private SparseArray<C0314a> f1432a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<C0316d> f1433b = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    static class C0314a {

        /* renamed from: a */
        int f1434a;

        /* renamed from: b */
        ArrayList<C0315b> f1435b = new ArrayList<>();

        /* renamed from: c */
        int f1436c = -1;

        /* renamed from: d */
        C0316d f1437d;

        public C0314a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0328j.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.State_android_id) {
                    this.f1434a = obtainStyledAttributes.getResourceId(index, this.f1434a);
                } else if (index == C0328j.State_constraints) {
                    this.f1436c = obtainStyledAttributes.getResourceId(index, this.f1436c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1436c);
                    context.getResources().getResourceName(this.f1436c);
                    if ("layout".equals(resourceTypeName)) {
                        C0316d dVar = new C0316d();
                        this.f1437d = dVar;
                        dVar.mo2010a(context, this.f1436c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2009a(C0315b bVar) {
            this.f1435b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    static class C0315b {

        /* renamed from: a */
        float f1438a = Float.NaN;

        /* renamed from: b */
        float f1439b = Float.NaN;

        /* renamed from: c */
        float f1440c = Float.NaN;

        /* renamed from: d */
        float f1441d = Float.NaN;

        /* renamed from: e */
        int f1442e = -1;

        /* renamed from: f */
        C0316d f1443f;

        public C0315b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0328j.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.Variant_constraints) {
                    this.f1442e = obtainStyledAttributes.getResourceId(index, this.f1442e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1442e);
                    context.getResources().getResourceName(this.f1442e);
                    if ("layout".equals(resourceTypeName)) {
                        C0316d dVar = new C0316d();
                        this.f1443f = dVar;
                        dVar.mo2010a(context, this.f1442e);
                    }
                } else if (index == C0328j.Variant_region_heightLessThan) {
                    this.f1441d = obtainStyledAttributes.getDimension(index, this.f1441d);
                } else if (index == C0328j.Variant_region_heightMoreThan) {
                    this.f1439b = obtainStyledAttributes.getDimension(index, this.f1439b);
                } else if (index == C0328j.Variant_region_widthLessThan) {
                    this.f1440c = obtainStyledAttributes.getDimension(index, this.f1440c);
                } else if (index == C0328j.Variant_region_widthMoreThan) {
                    this.f1438a = obtainStyledAttributes.getDimension(index, this.f1438a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    C0313c(Context context, ConstraintLayout constraintLayout, int i) {
        m1627a(context, i);
    }

    /* renamed from: a */
    private void m1627a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0314a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0314a(context, xml);
                            this.f1432a.put(aVar.f1434a, aVar);
                        } else if (c == 3) {
                            C0315b bVar = new C0315b(context, xml);
                            if (aVar != null) {
                                aVar.mo2009a(bVar);
                            }
                        } else if (c != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown tag ");
                            sb.append(name);
                            Log.v("ConstraintLayoutStates", sb.toString());
                        } else {
                            m1628a(context, (XmlPullParser) xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1628a(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0316d dVar = new C0316d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String str = "id";
            if (str.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), str, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                dVar.mo2011a(context, xmlPullParser);
                this.f1433b.put(i, dVar);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo2008a(C0324f fVar) {
    }
}
