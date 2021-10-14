package qgy.beans;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:57
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        String[] strings = {Role.class.getName(), User.class.getName()};
        return strings;
    }
}
