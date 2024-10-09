package lab2;
/**
 * The {@code lab2.Cl1} class extends the {@link Cl2} class and implement the {@link If1} interface
 * <p>
 * This class provides an implementation of the {@link #meth1()}, {@link #meth2()}, {@link #meth3()} methods to preform a specific operations defined in {@link If1#meth1()} {@link If1#meth2()} {@link If1#meth3()}
 * </p>
 */
public class Cl1 extends Cl2 implements If1{
    /**
     * The {@code cl1} field is a reference to an object that implements {@link Cl1}.
     * This field can be used to store and interact with a {@link Cl1} instance.
     */
    Cl1 cl1;
    /**
     * Implementation of the {@link If1#meth1()} {@link If1#meth2()} {@link If1#meth3()} methods.
     * <p>
     * This methods print a message to the console.
     * </p>
     */
    @Override
    public void meth1() {
        System.out.println("Class1.meth1");
    }
    public void meth2() {
        System.out.println("Class1.meth2");
    }
    public void meth3() {
        System.out.println("Class1.meth3");
    }
}
