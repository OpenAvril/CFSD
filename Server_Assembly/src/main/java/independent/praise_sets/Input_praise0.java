package independent.praise_sets;
import engine.Framework;
public class Input_praise0
{
    private static double _input_praise0_valueA;
    private static double _input_praise0_valueB;
    // public.
    public void dyn_REG_boot1_DEFINE_Input_praise0(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input_praise0().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input_praise0().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input_praise0(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input_praise0().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_valueA();
        stat_REG_boot2_SUBSTANTIATE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input_praise0().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input_praise0(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input_praise0().%n");
        stat_REG_boot3_INITIALISE_Input_valueA();
        stat_REG_boot3_INITIALISE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input_praise0().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input_praise0(byte sysThreadId, Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input_praise0().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input_praise0().%n");
    }
    public double dyn_REG_get_input_praise0_valueA()
    {
        return stat_REG_get_input_praise0_valueA();
    }
    public double dyn_REG_get_input_praise0_valueB()
    {
        return stat_REG_get_input_praise0_valueB();
    }
    public void dyn_REG_set_input_praise0_valueA(double newDouble)
    {
        stat_REG_set_input_praise0_valueA(newDouble);
    }
    public void dyn_REG_set_input_praise0_valueB(double newDouble)
    {
        stat_REG_set_input_praise0_valueB(newDouble);
    }
    public static void stat_CLASS_boot0_DECLAIRE_Input_praise0()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Input_praise0().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Input_praise0().%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Input_praise0()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_praise0().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_praise0().%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Input_praise0()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input_praise0().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input_praise0().%n");
    }
    public static void stat_REG_boot0_DECLAIRE_Input_praise0()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Input_praise0().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Input_praise0().%n");
    }
    // private.
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise0_valueA = (double)(Double.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise0_valueB = (double)(Double.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise0_valueA = (double)(1.2);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise0_valueB = (double)(2.6);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static double stat_REG_get_input_praise0_valueA()
    {
        return _input_praise0_valueA;
    }
    private static double stat_REG_get_input_praise0_valueB()
    {
        return _input_praise0_valueB;
    }
    private static void stat_REG_set_input_praise0_valueA(double newDouble)
    {
        _input_praise0_valueA = newDouble;
    }
    private static void stat_REG_set_input_praise0_valueB(double newDouble)
    {
        _input_praise0_valueB = newDouble;
    }
}
