import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyInjector {
    private Map<Class, Object> container = new HashMap<>();

    public void scanForBeans() {
        // search
        Reflections reflections = new Reflections("org.example");
        System.out.println("Hello>>>>>>>>>>>>.");
        // put to map
    }

    public void scanForAutowired() {

    }

    public Set<Class> findAllClassesUsingReflectionsLibrary(String packageName) {
        Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
        return reflections.getSubTypesOf(Object.class)
                .stream()
                .collect(Collectors.toSet());
    }
}
