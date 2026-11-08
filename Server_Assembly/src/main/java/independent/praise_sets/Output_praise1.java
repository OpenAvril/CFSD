package independent.praise_sets;
import engine.Framework;
public class Output_praise1
{
    private static double output_praise1_value;
    // public.
    public void dyn_REG_boot1_DEFINE_Output_praise1(byte sysThreadId, Framework obj)
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot1_DEFINE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot1_DEFINE_Output_praise1()" + ".%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Output_praise1(byte sysThreadId, Framework obj)
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot2_SUBSTANTIATE_Output_praise1()" + ".%n");
        stat_REG_boot2_SUBSTANTIATE_Output_value();
         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot2_SUBSTANTIATE_Output_praise1()" + ".%n");
    }
    public void dyn_REG_boot3_INITIALISE_Output_praise1(byte sysThreadId, Framework obj)
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot3_INITIALISE_Output_praise1()" + ".%n");
        stat_REG_boot3_INITIALISE_Output_value();
         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot3_INITIALISE_Output_praise1()" + ".%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Output_praise1(byte sysThreadId, Framework obj)
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot4_INSTANTIATE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot4_INSTANTIATE_Output_praise1()" + ".%n");
    }
    public double dyn_REG_get_output_praise1_value()
    {
        return stat_REG_get_output_praise1_value();
    }
    public void dyn_REG_set_output_praise1_value(double newDouble)
    {
        stat_REG_set_output_praise1_value(newDouble);
    }

    public static void stat_CLASS_boot1_DECLAIRE_Output_praise1()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DECLAIRE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DECLAIRE_Output_praise1()" + ".%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Output_praise1()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DEFINE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DEFINE_Output_praise1()" + ".%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Output_praise1()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot3_INITIALISE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot3_INITIALISE_Output_praise1()" + ".%n");
    }
    public static void stat_REG_boot1_DECLAIRE_Output_praise1()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_REG_boot1_DECLAIRE_Output_praise1()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_REG_boot1_DECLAIRE_Output_praise1()" + ".%n");
    }
    // private.
    private static void stat_REG_boot2_SUBSTANTIATE_Output_value()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_REG_boot2_SUBSTANTIATE_Output_valueA()" + ".%n");
        output_praise1_value = (double)(Double.MAX_VALUE);
         System.out.printf("thread " + sysThreadId + "exiting stat_REG_boot2_SUBSTANTIATE_Output_valueA()" + ".%n");
    }
    private static void stat_REG_boot3_INITIALISE_Output_value()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_REG_boot3_INITIALISE_Output_valueA()" + ".%n");
        output_praise1_value = (double)(1.1);
         System.out.printf("thread " + sysThreadId + "exiting stat_REG_boot3_INITIALISE_Output_valueA()" + ".%n");
    }
    private static double stat_REG_get_output_praise1_value()
    {
        return output_praise1_value;
    }
    private static void stat_REG_set_output_praise1_value(double newDouble)
    {
        output_praise1_value = newDouble;
    }
}