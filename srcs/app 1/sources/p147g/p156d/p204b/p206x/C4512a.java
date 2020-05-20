package p147g.p156d.p204b.p206x;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.d.b.x.a */
public @interface C4512a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
