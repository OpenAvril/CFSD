package OpenCFSD_Java_Assembly;
import engine.Framework;
import java.io.IOException;

public class Main
{
    private static Framework stat_PGM_ServerAssembly = null;
    // public.
    public static void main(String[] args) throws IOException {
        System.out.printf("entered first member function, main().%n");
        stat_PGM_ServerAssembly = ServerAssembly.dyn_App_Generate_Program();
        System.out.printf("==========%n");
        System.out.printf("declaration.%n");
        System.out.printf("definition.%n");
        System.out.printf("substantiation.%n");
        System.out.printf("initialisation.%n");
        System.out.printf("instantiation.%n");
        System.out.printf("running.%n");
        System.out.printf("==========%n");
        System.out.printf("SIMULATION%n");

    }
}