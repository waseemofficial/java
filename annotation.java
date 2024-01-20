import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.text.Annotation;
import java.util.ArrayList;
import java.lang.annotation.RetentionPolicy;

//@note creating custom Annotation if it dosent have any Variable/value it is called Marker Annotation's If it has single value/Variable it is called Single Value Annotation If it has more then one value/Variable it is called Multi Value Annotation 
@Target(ElementType.TYPE) // Meta Annotations
@Retention(RetentionPolicy.RUNTIME) // Meta Annotations
@interface SmartPhone {
    String os() default "Symbian";

    int version() default 0;
}

@SmartPhone(os = "Android", version = 5) // custom Annotation
class NokiaASeries {
    // Demo class
    String model;
    int screenSize;

    public NokiaASeries(String model, int size) {
        super();
        this.model = model;
        this.screenSize = size;
    }
}

// @note this Functional Interface's can have only one method/function
@FunctionalInterface
interface ABC {
    void show();
}

class A {
    public void showDataFromLastYearDatabase() {
        System.out.println("from A");
    }
}

class B extends A {
    @Deprecated
    public void show() {
        // Old code
    }

    @Override
    @SuppressWarnings("unchecked")

    public void showDataFromLastYearDatabase() {
        ArrayList<Integer> obj = new ArrayList<>();
        System.out.println("from B");
    }
}

public class annotation {
    public static void main(String[] args) {
        // NOTE: Annotations
        int[] ar = { 1, 2, 3 };
        int[] ar1 = new int[4];
        NokiaASeries obj1A = new NokiaASeries("Fire", 5);
        // To access Os from Annotation create Class object
        Class c = obj1A.getClass();
        Annotation an = (Annotation) c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os());
        // Note:
        B obj = new B();
        obj.show();
        obj.showDataFromLastYearDatabase();
    }
}
