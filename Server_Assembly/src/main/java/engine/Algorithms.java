package engine;
public class Algorithms 
{
// public.
    public Algorithms() 
    {
         System.out.printf("thread " + sysThreadId + "entered CLASS Algorithms()%n");
        stat_CLASS_boot0_DECLAIRE_Algorithms();
        stat_CLASS_boot1_DEFINE_Algorithms();
        stat_CLASS_boot3_INITIALISE_Algorithms();
        stat_REG_boot0_DECLAIRE_Algorithms();
         System.out.printf("thread " + sysThreadId + "exiting CLASS Algorithms()%n");
    }
    public void dyn_REG_boot1_DEFINE_Algorithms(Framework obj)
    {
             System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot1_DEFINE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot1_DEFINE_Algorithms()" + ".%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithms(Framework obj)
    {
             System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot2_SUBSTANTIATE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot2_SUBSTANTIATE_Algorithms()" + ".%n");
    }
    public void dyn_REG_boot3_INITIALISE_Algorithms(Framework obj)
    {
             System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot3_INITIALISE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot3_INITIALISE_Algorithms()" + ".%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithms(Framework obj)
    {
             System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot4_INSTANTIATE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot4_INSTANTIATE_Algorithms()" + ".%n");
    }
    public static void stat_CLASS_boot0_DECLAIRE_Algorithms()
    {
             System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot0_DECLAIRE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot0_DECLAIRE_Algorithms()" + ".%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithms()
    {
             System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DEFINE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DEFINE_Algorithms()" + ".%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithms()
    {
             System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot3_INITIALISE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot3_INITIALISE_Algorithms()" + ".%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithms()
    {
             System.out.printf("thread " + sysThreadId + "entered stat_REG_boot0_DECLAIRE_Algorithms()" + ".%n");

             System.out.printf("thread " + sysThreadId + "exiting stat_REG_boot0_DECLAIRE_Algorithms()" + ".%n");
    }
// private.
}