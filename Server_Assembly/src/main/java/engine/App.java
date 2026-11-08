package engine;

import java.io.IOException;

public class App
{
    private static Algorithms stat_CLASS_Algorithms;
    private static Data stat_CLASS_Data;
    private static Execute stat_CLASS_Execute;
// public.
    public App(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered CONSTRUCTOR App()" + ".%n");
        stat_CLASS_boot0_DECLAIRE_App();
        stat_CLASS_boot1_DEFINE_App();
        stat_CLASS_boot3_INITIALISE_App(obj);

         System.out.printf("thread " + sysThreadId + "exiting CONSTRUCTOR App()" + ".%n");
    }
    public Algorithms dyn_CLASS_get_Algorithms()
    {
        return stat_CLASS_get_Algorithms();
    }
    public Data dyn_CLASS_get_Data()
    {
        return stat_CLASS_get_Data();
    }
    public Execute dyn_CLASS_get_Execute()
    {
        return stat_CLASS_get_Execute();
    }
    public void dyn_REG_boot1_DEFINE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_boot1_REG_DEFINE_App()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_boot1_REG_DEFINE_App()" + ".%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_boot2_REG_SUBSTANTIATE_App()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_boot2_REG_SUBSTANTIATE_App()" + ".%n");
    }
    public void dyn_REG_boot3_INITIALISE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_boot3_REG_INITIALISE_App()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_boot3_REG_INITIALISE_App()" + ".%n");
    }
    public void dyn_PGM_boot4_INSTANTIATE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered dyn_boot4_PGM_INSTANTIATE_App()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_boot4_PGM_INSTANTIATE_App()" + ".%n");
    }
    private static void stat_CLASS_boot0_DECLAIRE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot0_DECLAIRE_App()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot0_DECLAIRE_App()" + ".%n");
    }
    private static void stat_CLASS_boot1_DEFINE_App()
    {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DEFINE_App()" + ".%n");
        boot1_CLASS_DEFINE_Algorithms();
        boot1_CLASS_DEFINE_Data();
        boot1_CLASS_DEFINE_Execute();
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DEFINE_App()" + ".%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot3_INITIALISE_App()" + ".%n");
        boot3_CLASS_INITIALISE_Algorithms();
        boot3_CLASS_INITIALISE_Data();
        boot3_CLASS_INITIALISE_Execute(obj);
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot3_INITIALISE_App()" + ".%n");
    }
// private.
    private static void boot1_CLASS_DEFINE_Algorithms()
    {
         System.out.printf("thread " + sysThreadId + "entered boot1_CLASS_DEFINE_Algorithms()" + ".%n");
        stat_CLASS_Algorithms = null;
         System.out.printf("thread " + sysThreadId + "exiting boot1_CLASS_DEFINE_Algorithms()" + ".%n");
    }
    private static void boot1_CLASS_DEFINE_Data()
    {
         System.out.printf("thread " + sysThreadId + "entered boot1_CLASS_DEFINE_Data()" + ".%n");
        stat_CLASS_Data = null;
         System.out.printf("thread " + sysThreadId + "exiting boot1_CLASS_DEFINE_Data()" + ".%n");
    }
    private static void boot1_CLASS_DEFINE_Execute()
    {
         System.out.printf("thread " + sysThreadId + "entered boot1_CLASS_DEFINE_Execute()" + ".%n");
        stat_CLASS_Execute = null;
         System.out.printf("thread " + sysThreadId + "exiting boot1_CLASS_DEFINE_Execute()" + ".%n");
    }
    private static void boot3_CLASS_INITIALISE_Algorithms()
    {
         System.out.printf("thread " + sysThreadId + "entered boot3_CLASS_INITIALISE_Algorithms()" + ".%n");
        stat_CLASS_Algorithms = new Algorithms();
        try {
                stat_CLASS_get_Algorithms();
        } 
        catch (NullPointerException e) {
                 System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
        }
         System.out.printf("thread " + sysThreadId + "exiting boot3_CLASS_INITIALISE_Algorithms()" + ".%n");
    }
    private static void boot3_CLASS_INITIALISE_Data()
    {
         System.out.printf("thread " + sysThreadId + "entered boot3_CLASS_INITIALISE_Data()" + ".%n");
        stat_CLASS_Data = new Data();
        try {
                stat_CLASS_get_Data();
        } 
        catch (NullPointerException e) {
                 System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
        }
         System.out.printf("thread " + sysThreadId + "exiting boot3_CLASS_INITIALISE_Data()" + ".%n");
    }
    private static void boot3_CLASS_INITIALISE_Execute(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered boot3_CLASS_INITIALISE_Execute()" + ".%n");
        stat_CLASS_Execute = new Execute(obj);
        try {
                stat_CLASS_get_Execute();
        } 
        catch (NullPointerException e) {
                 System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
        }
         System.out.printf("thread " + sysThreadId + "exiting boot3_CLASS_INITIALISE_Execute()" + ".%n");
    }
    private static Algorithms stat_CLASS_get_Algorithms()
    {
        return stat_CLASS_Algorithms;
    }
    private static Data stat_CLASS_get_Data()
    {
        return stat_CLASS_Data;
    }
    private static Execute stat_CLASS_get_Execute()
    {
        return stat_CLASS_Execute;
    }
}