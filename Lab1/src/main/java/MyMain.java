import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("gjkl");
        MyInjector mi = new MyInjector();
        mi.scanForBeans();
       // Set<Class> s = mi.findAllClassesUsingReflectionsLibrary("MyPackage");
       // System.out.println(s);
    }
}
