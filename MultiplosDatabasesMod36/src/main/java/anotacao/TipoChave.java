package anotacao;

import java.lang.annotation.*;

/**
 * @author jobson.oliveira
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

	String value();
}
