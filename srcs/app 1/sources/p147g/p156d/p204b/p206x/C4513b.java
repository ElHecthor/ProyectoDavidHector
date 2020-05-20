package p147g.p156d.p204b.p206x;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.d.b.x.b */
public @interface C4513b {
    boolean nullSafe() default true;

    Class<?> value();
}
