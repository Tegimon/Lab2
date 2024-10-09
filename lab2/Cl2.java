package lab2;
/**
 * The {@code lab2.Cl2} class implement the {@link If2} interface
 * <p>
 * This class provides an implementation of the {@link #meth2()}, {@link #meth3()} methods to preform a specific operations defined in {@link If2#meth2()} {@link If2#meth3()}
 * </p>
 */
public class Cl2 implements If2{
    /**
     * The {@code cl1} field is a reference to an object that implements {@link Cl1}.
     * This field can be used to store and interact with a {@link Cl1} instance.
     */
    Cl1 cl1;
    /**
     * Implementation of the {@link If2#meth2()} {@link If2#meth3()} methods.
     * <p>
     * This methods print a message to the console.
     * </p>
     */
    @Override
    public void meth2() {
        System.out.println("Class2.meth2");
    }
    public void meth3() {
        System.out.println("Class2.meth3");
    }
}
