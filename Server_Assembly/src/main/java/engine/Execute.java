package engine;
import SIMULATION.Simulation;
import threads.IO_ListenRespond;
import com.sun.jna.Pointer;
import main.IO.*;

public class Execute
{
    private static Execute_Control stat_CLASS_Execute_Control;
    private static Thread[] stat_REG_List_Of_Threads;
    private static Pointer stat_PGM_ConditionCode;
    private static Pointer stat_PGM_OpenEPiCentre;
    private static Pointer stat_PGM_SimulationIO;
    private static Pointer stat_PGM_WriteQue_Simulation_InputSamples;
    private static Pointer stat_PGM_WriteQue_Simulation_OutputSamples;//SIMULATION
    // public.
    public Execute(Framework obj)  {
         System.out.printf("thread " + sysThreadId + "entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute(obj);
        stat_REG_boot0_DECLAIRE_Execute();
         System.out.printf("thread " + sysThreadId + "exiting CLASS Execute()%n");
    }
    public void dyn_APP_Launch_Threads(Framework obj)
    {
        stat_APP_Launch_Threads(obj);
    }
    public Execute_Control dyn_CLASS_get_Execute_Control()
    {
        return stat_CLASS_get_Execute_Control();
    }
    public void dyn_REG_boot1_DEFINE_Execute() {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot1_DEFINE_Execute()" + ".%n");
        stat_REG_boot1_DEFINE_List_Of_Threads();
         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot1_DEFINE_Execute()" + ".%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot2_SUBSTANTIATE_Execute()" + ".%n");
        stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(obj);
         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot2_SUBSTANTIATE_Execute()" + ".%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot3_INITIALISE_Execute()" + ".%n");
        stat_REG_boot3_INITIALISE_List_Of_Threads(obj);
         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot3_INITIALISE_Execute()" + ".%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Execute() {
         System.out.printf("thread " + sysThreadId + "entered dyn_REG_boot4_INSTANTIATE_Execute()" + ".%n");
        long intPrimeDEFAULT = Integer.MAX_VALUE;
        double doublePRimeDEFAULT = Double.MAX_VALUE;

         System.out.printf("thread " + sysThreadId + "entered CHECK member function WriteQue_Simulation_InputSamples()" + ".%n");
        //WriteQue_Simulation_InputSamples.app_FUNCT_generate_Program();
        Boolean tempA0 = WriteQue_Simulation_InputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_Simulation_InputSamples.app_FUNCT_terminate_Program();
        WriteQue_Simulation_InputSamples.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_Simulation_InputSamples.app_FUNCT_write_Start(intPrimeDEFAULT);
         System.out.printf("thread " + sysThreadId + "done CHECK member function WriteQue_Simulation_InputSamples()" + ".%n");

         System.out.printf("thread " + sysThreadId + "entered CHECK member functions in WriteQue_Simulation_OutputSamples" + ".%n");
        //WriteQue_Simulation_OutputSamples.app_FUNCT_generate_Program();
        Boolean tempB0 = WriteQue_Simulation_OutputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_Simulation_OutputSamples.app_FUNCT_terminate_Program();
        WriteQue_Simulation_OutputSamples.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_Simulation_OutputSamples.app_FUNCT_write_Start(intPrimeDEFAULT);
         System.out.printf("thread " + sysThreadId + "done CHECK member functions in WriteQue_Simulation_OutputSamples" + ".%n");

         System.out.printf("thread " + sysThreadId + "entered CHECK member functions in WriteQue_SimulationIO" + ".%n");
        //WriteQue_SimulationIO.app_FUNCT_generate_Program();
        Boolean tempC0 = WriteQue_SimulationIO.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_SimulationIO.app_FUNCT_terminate_Program();
        WriteQue_SimulationIO.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_SimulationIO.app_FUNCT_write_Start(intPrimeDEFAULT);
         System.out.printf("thread " + sysThreadId + "done CHECK member functions in WriteQue_SimulationIO" + ".%n");

         System.out.printf("thread " + sysThreadId + "entered CHECK member functions in WriteQue_ConditionCode" + ".%n");
        //WriteQue_ConditionCode.app_FUNCT_generate_Program();
        Boolean tempD0 = WriteQue_ConditionCode.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ConditionCode.app_FUNCT_terminate_Program();
        WriteQue_ConditionCode.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ConditionCode.app_FUNCT_write_Start(intPrimeDEFAULT);
         System.out.printf("thread " + sysThreadId + "done CHECK member functions in WriteQue_ConditionCode" + ".%n");

         System.out.printf("thread " + sysThreadId + "entered CHECK member functions in OpenEPiCentre" + ".%n");
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
        //Pointer tempE0 = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
        boolean tempE1 = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(intPrimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_terminate_Program();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerInputReceive_Injection__write_End();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerInputReceive_Injection__write_Start();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerOutputSend_Extraction__write_End();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerOutputSend_Extraction__write_Start();
        boolean tempE4 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerInputReceive();
        boolean tempE5 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend();
        boolean tempE6 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre();
        double tempE7 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value();
        double tempE8 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value();
        double tempE9 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise2_Value();
        double tempE10 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise3_Value();
        long tempE11 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId();
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(intPrimeDEFAULT);
         System.out.printf("thread " + sysThreadId + "entered CHECK member functions in OpenEPiCentre" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting dyn_REG_boot4_INSTANTIATE_Execute()" + ".%n");
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute() {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot0_DECLAIRE_Execute()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot0_DECLAIRE_Execute()" + ".%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute() {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DEFINE_Execute()" + ".%n");
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_PGM_boot1_DEFINE_ConditionCode();
        stat_PGM_boot1_DEFINE_WriteQue_Simulation_InputSamples();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_WriteQue_Simulation_OutputSamples();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_MyDLL();
        stat_PGM_boot1_DEFINE_SimulationIO();
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DEFINE_Execute()" + ".%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot3_INITIALISE_Execute()" + ".%n");
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_PGM_boot3_INITIALISE_ConditionCode();
        stat_PGM_boot3_INITIALISE_WriteQue_Simulation_InputSamples();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_WriteQue_Simulation_OutputSamples();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_MyDLL();
        stat_PGM_boot3_INITIALISE_SimulationIO();//TODO SIMULATION
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot3_INITIALISE_Execute()" + ".%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute() {
         System.out.printf("thread " + sysThreadId + "entered stat_REG_boot0_DECLAIRE_Execute()" + ".%n");

         System.out.printf("thread " + sysThreadId + "exiting stat_REG_boot0_DECLAIRE_Execute()" + ".%n");
    }
    // private.
    private static void stat_APP_Launch_Threads(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered *** Launch Threads ***" + ".%n");
        for (int threadId = 0; threadId < stat_REG_List_Of_Threads.length; threadId++)
        {
            stat_REG_List_Of_Threads[threadId].start();
        }
         System.out.printf("thread " + sysThreadId + "exiting *** Launch Threads ***" + ".%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control() {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot1_DEFINE_Execute_Control()" + ".%n");
        stat_CLASS_Execute_Control = null;
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot1_DEFINE_Execute_Control()" + ".%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control() {
         System.out.printf("thread " + sysThreadId + "entered stat_CLASS_boot3_INITIALISE_Execute_Control()" + ".%n");
        stat_CLASS_Execute_Control = new Execute_Control();
        try {
            stat_CLASS_get_Execute_Control();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_CLASS_boot3_INITIALISE_Execute_Control()" + ".%n");
    }
    private static Execute_Control stat_CLASS_get_Execute_Control()
    {
        return stat_CLASS_Execute_Control;
    }
    private static void stat_REG_boot1_DEFINE_List_Of_Threads()
    {
        stat_REG_List_Of_Threads = null;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(Framework obj) {
        try {
            stat_REG_List_Of_Threads = new Thread[Math.toIntExact(Global.dyn_REG_get_numberOfCores())];
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        for (int threadId = 0; threadId < stat_REG_List_Of_Threads.length; threadId++)
        {
            stat_REG_List_Of_Threads[threadId] = null;
        }
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Threads(Framework obj) {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_REG_boot3_INITIALISE_List_Of_Threads()" + ".%n");
        stat_REG_List_Of_Threads[0] = new Thread(() -> {
            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_App_Thread_IO(obj, (byte)0);
        });
        stat_REG_List_Of_Threads[1] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Input_Peripheral_Scanner(obj, (byte)1);
        });
        stat_REG_List_Of_Threads[2] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Output_Draw(obj, (byte)2);
        });
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_REG_boot3_INITIALISE_List_Of_Threads()" + ".%n");
    }
    private static void stat_PGM_boot1_DEFINE_MyDLL() {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_PGM_boot1_DEFINE_MyDLL()" + ".%n");
        stat_PGM_OpenEPiCentre = null;
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_PGM_boot1_DEFINE_MyDLL()" + ".%n");
    }
    private static void stat_PGM_boot1_DEFINE_ConditionCode() {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_PGM_boot1_DEFINE_ConditionCode()" + ".%n");
        stat_PGM_ConditionCode = null;
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_PGM_boot1_DEFINE_ConditionCode()" + ".%n");
    }
    private static void stat_PGM_boot1_DEFINE_SimulationIO() {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_PGM_boot1_DEFINE_SimulationIO()" + ".%n");
        stat_PGM_SimulationIO = null;
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_PGM_boot1_DEFINE_SimulationIO()" + ".%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Simulation_InputSamples() {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer()" + ".%n");
        stat_PGM_WriteQue_Simulation_InputSamples = null;
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer()" + ".%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Simulation_OutputSamples() {
         System.out.printf("thread " + sysThreadId + "entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer()" + ".%n");
        stat_PGM_WriteQue_Simulation_OutputSamples = null;
         System.out.printf("thread " + sysThreadId + "exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer()" + ".%n");
    }
    private static void stat_PGM_boot3_INITIALISE_MyDLL() {
         System.out.printf("thread " + sysThreadId + "entered stat_PGM_boot3_INITIALISE_MyDLL()" + ".%n");
        try {
            stat_PGM_OpenEPiCentre = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_PGM_boot3_INITIALISE_MyDLL()" + ".%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConditionCode() {
         System.out.printf("thread " + sysThreadId + "entered stat_PGM_boot3_INITIALISE_ConditionCode()" + ".%n");
        try {
            stat_PGM_ConditionCode = WriteQue_ConditionCode.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_PGM_boot3_INITIALISE_ConditionCode()" + ".%n");
    }
    private static void stat_PGM_boot3_INITIALISE_SimulationIO() {
         System.out.printf("thread " + sysThreadId + "entered stat_PGM_boot3_INITIALISE_SimulationIO()" + ".%n");
        try {
            stat_PGM_SimulationIO = WriteQue_SimulationIO.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_PGM_boot3_INITIALISE_SimulationIO()" + ".%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Simulation_InputSamples() {
         System.out.printf("thread " + sysThreadId + "entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()" + ".%n");
        try {
            stat_PGM_WriteQue_Simulation_InputSamples = WriteQue_Simulation_InputSamples.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()" + ".%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Simulation_OutputSamples() {
         System.out.printf("thread " + sysThreadId + "entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()" + ".%n");
        try {
            stat_PGM_WriteQue_Simulation_OutputSamples = WriteQue_Simulation_OutputSamples.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
             System.out.printf("thread " + sysThreadId + "NullPointerException" + ".%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
         System.out.printf("thread " + sysThreadId + "exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()" + ".%n");
    }
}