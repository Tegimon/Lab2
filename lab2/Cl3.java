package lab2;
/**
 * The {@code lab2.Cl3} class implement the {@link If3} interface
 * <p>
 * This class provides an implementation of the {@link #meth3()} method to preform a specific operations defined in {@link If3#meth3()}
 * </p>
 */
public class Cl3 implements If3 {
    /**
     * The {@code if1} field is a reference to an object that implements {@link If1}.
     * This field can be used to store and interact with a {@link If1} instance.
     */
    If1 if1;
    /**
     * Implementation of the {@link If3#meth3()} methods.
     * <p>
     * This method prints a message to the console.
     * </p>
     */
    @Override
    public void meth3() {
        System.out.println("Class3.meth3");
    }
}
