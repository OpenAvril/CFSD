package independent.praise_sets;
import engine.Framework;
public class Input_praise1
{
    private static double _input_praise1_valueA;
    private static double _input_praise1_valueB;
    // public.
    public void dyn_REG_boot1_DEFINE_Input_praise1(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input_praise1().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input_praise1().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input_praise1(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input_praise1().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_valueA();
        stat_REG_boot2_SUBSTANTIATE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input_praise1().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input_praise1(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input_praise1().%n");
        stat_REG_boot3_INITIALISE_Input_valueA();
        stat_REG_boot3_INITIALISE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input_praise1().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input_praise1(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input_praise1().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input_praise1().%n");
    }
    public double dyn_REG_get_input_praise1_valueA()
    {
        return stat_REG_get_input_praise1_valueA();
    }
    public double dyn_REG_get_input_praise1_valueB()
    {
        return stat_REG_get_input_praise1_valueB();
    }
    public void dyn_REG_set_input_praise1_valueA(double newDouble)
    {
        stat_REG_set_input_praise1_valueA(newDouble);
    }
    public void dyn_REG_set_input_praise1_valueB(double newDouble)
    {
        stat_REG_set_input_praise1_valueB(newDouble);
    }
    public static void stat_CLASS_boot1_DECLAIRE_Input_praise1()
    {
        System.out.printf("entered stat_CLASS_boot1_DECLAIRE_Input_praise1().%n");

        System.out.printf("exiting stat_CLASS_boot1_DECLAIRE_Input_praise1().%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Input_praise1()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_praise1().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_praise1().%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Input_praise1()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input_praise1().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input_praise1().%n");
    }
    public static void stat_REG_boot1_DECLAIRE_Input_praise1()
    {
        System.out.printf("entered stat_REG_boot1_DECLAIRE_Input_praise1().%n");

        System.out.printf("exiting stat_REG_boot1_DECLAIRE_Input_praise1().%n");
    }
    // private.
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise1_valueA = (double)(Double.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise1_valueB = (double)(Double.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise1_valueA = (double)(1.2);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise1_valueB = (double)(2.6);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static double stat_REG_get_input_praise1_valueA()
    {
        return _input_praise1_valueA;
    }
    private static double stat_REG_get_input_praise1_valueB()
    {
        return _input_praise1_valueB;
    }
    private static void stat_REG_set_input_praise1_valueA(double newDouble)
    {
        _input_praise1_valueA = newDouble;
    }
    private static void stat_REG_set_input_praise1_valueB(double newDouble)
    {
        _input_praise1_valueB = newDouble;
    }
}
