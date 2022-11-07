import java.util.Vector;
import java.util.ArrayList;
import java.util.*;

public class PackagesinJava { // class name must match the file name
    // Java program to demonstrate accessing of members when
// corresponding classes are imported and not imported.
        public PackagesinJava() // constructor
        {
            System.out.println("Inside ImportDemo constructor");
        }

        {
            // java.util.Vector is imported, hence we are
            // able to access directly in our code.
            Vector newVector = new Vector();

            // java.util.ArrayList is not imported, hence
            // we were referring to it using the complete
            // package.
            java.util.ArrayList newList = new java.util.ArrayList();
        }

        public static void main(String arg[]) {
            new ImportDemo();
        }

    private static class ImportDemo {
    }
}


