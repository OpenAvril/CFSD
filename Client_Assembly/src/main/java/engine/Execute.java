package engine;

import com.sun.jna.Pointer;
import main.IO.WriteQue_ConditionCode;
import main.IO.WriteQue_SimulationIO;
import main.IO.WriteQue_Simulation_InputSamples;
import main.IO.WriteQue_Simulation_OutputSamples;

public class Execute
{
    private static Execute_Control _stat_CLASS_Execute_Control;
    private static Thread[] _stat_REG_List_Of_Threads;
    private static Pointer _stat_PGM_ConditionCode;
    private static Pointer _stat_PGM_SimulationIO;
    private static Pointer _stat_PGM_WriteQue_Simulation_InputSamples;
    private static Pointer _stat_PGM_WriteQue_Simulation_OutputSamples;//todo SIMULATION

    // public.
    public Execute(Framework obj)  {
        System.out.printf("entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute(obj);
        stat_REG_boot0_DECLAIRE_Execute();
        System.out.printf("exiting CLASS Execute()%n");
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
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");
        stat_REG_boot1_DEFINE_List_Of_Threads();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
        stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");
        stat_REG_boot3_INITIALISE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Execute() {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        long intPrimeDEFAULT = Integer.MAX_VALUE;
        double doublePRimeDEFAULT = Double.MAX_VALUE;

        System.out.printf("entered CHECK member function WriteQue_Simulation_InputSamples().%n");
        //WriteQue_Simulation_InputSamples.app_FUNCT_generate_Program();
        Boolean tempA0 = WriteQue_Simulation_InputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_Simulation_InputSamples.app_FUNCT_terminate_Program();
        WriteQue_Simulation_InputSamples.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_Simulation_InputSamples.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_Simulation_InputSamples().%n");

        System.out.printf("entered CHECK member functions in WriteQue_Simulation_OutputSamples.%n");
        //WriteQue_Simulation_OutputSamples.app_FUNCT_generate_Program();
        Boolean tempB0 = WriteQue_Simulation_OutputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_Simulation_OutputSamples.app_FUNCT_terminate_Program();
        WriteQue_Simulation_OutputSamples.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_Simulation_OutputSamples.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_Simulation_OutputSamples.%n");

        System.out.printf("entered CHECK member functions in WriteQue_SimulationIO.%n");
        //WriteQue_SimulationIO.app_FUNCT_generate_Program();
        Boolean tempC0 = WriteQue_SimulationIO.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_SimulationIO.app_FUNCT_terminate_Program();
        WriteQue_SimulationIO.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_SimulationIO.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_SimulationIO.%n");

        System.out.printf("entered CHECK member functions in WriteQue_ConditionCode.%n");
        //WriteQue_ConditionCode.app_FUNCT_generate_Program();
        Boolean tempD0 = WriteQue_ConditionCode.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ConditionCode.app_FUNCT_terminate_Program();
        WriteQue_ConditionCode.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ConditionCode.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_ConditionCode.%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_PGM_boot1_DEFINE_ConditionCode();
        stat_PGM_boot1_DEFINE_WriteQue_Simulation_InputSamples();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_WriteQue_Simulation_OutputSamples();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_SimulationIO();//TODO SIMULATION
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute(Framework obj) {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_PGM_boot3_INITIALISE_ConditionCode();
        stat_PGM_boot3_INITIALISE_WriteQue_Simulation_InputSamples();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_WriteQue_Simulation_OutputSamples();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_SimulationIO();//TODO SIMULATION
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute() {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
    // private.
    private static void stat_APP_Launch_Threads(Framework obj) {
        System.out.printf("entered *** Launch Threads ***.%n");
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++)
        {
            //_stat_REG_List_Of_Threads[threadId].start();//todo simulation 3d graphics
        }
        System.out.printf("exiting *** Launch Threads ***.%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = new Execute_Control();
        try {
            stat_CLASS_get_Execute_Control();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
    }
    private static Execute_Control stat_CLASS_get_Execute_Control()
    {
        return _stat_CLASS_Execute_Control;
    }
    private static void stat_REG_boot1_DEFINE_List_Of_Threads()
    {
        _stat_REG_List_Of_Threads = null;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(Framework obj) {
        try {
            _stat_REG_List_Of_Threads = new Thread[Global.dyn_REG_get_numberOfCores()];
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++)
        {
            _stat_REG_List_Of_Threads[threadId] = null;
        }
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Threads(Framework obj) {
        System.out.printf("entered Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
        _stat_REG_List_Of_Threads[0] = new Thread(() -> {
            obj.dyn_THREAD_get_IO_ListenRespond().dyn_App_Thread_IO_Listen_Respond(obj, (byte)0);
        });
        _stat_REG_List_Of_Threads[1] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Input_Peripheral_Scanner(obj, (byte)1);
        });
        _stat_REG_List_Of_Threads[2] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Output_Draw(obj, (byte)2);
        });
        System.out.printf("exiting Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
    }
    private static void stat_PGM_boot1_DEFINE_ConditionCode() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_ConditionCode().%n");
        _stat_PGM_ConditionCode = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_ConditionCode().%n");
    }
    private static void stat_PGM_boot1_DEFINE_SimulationIO() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_SimulationIO().%n");
        _stat_PGM_SimulationIO = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_SimulationIO().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Simulation_InputSamples() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
        _stat_PGM_WriteQue_Simulation_InputSamples = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Simulation_OutputSamples() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
        _stat_PGM_WriteQue_Simulation_OutputSamples = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConditionCode() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_ConditionCode().%n");
        try {
            _stat_PGM_ConditionCode = WriteQue_ConditionCode.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConditionCode().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_SimulationIO() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_SimulationIO().%n");
        try {
            _stat_PGM_SimulationIO = WriteQue_SimulationIO.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_SimulationIO().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Simulation_InputSamples() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
        try {
            _stat_PGM_WriteQue_Simulation_InputSamples = WriteQue_Simulation_InputSamples.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Simulation_OutputSamples() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
        try {
            _stat_PGM_WriteQue_Simulation_OutputSamples = WriteQue_Simulation_OutputSamples.app_FUNCT_generate_Program();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
    }
}