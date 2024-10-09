import lab2.Cl1;
import lab2.Cl2;
import lab2.Cl3;
/**
 * {@code Main} class. Makes everything work.
 */
public class Main {
    public static void main(String[] args) {

        Cl1 cl1 = new Cl1();
        Cl2 cl2 = new Cl2();
        Cl3 cl3 = new Cl3();

        cl1.meth1();
        cl1.meth2();
        cl1.meth3();

        cl2.meth2();
        cl2.meth3();

        cl3.meth3();
    }
}