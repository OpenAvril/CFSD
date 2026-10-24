package engine;
import SIMULATION.Simulation;
import structs.*;
import threads.IO_ListenRespond;

public class Framework
{
    private static App _stat_CLASS_App;
    private static Global _stat_CLASS_Global;
    private static Algorithm _stat_STRUCT_Algorithm;
    private static Input _stat_STRUCT_Input;
    private static Output _stat_STRUCT_Output;
    private static User_Algorithm _stat_STRUCT_User_Algorithms;
    private static User_Input _stat_STRUCT_User_Inputs;
    private static User_Output _stat_STRUCT_User_Outputs;
    private static IO_ListenRespond _stat_THREAD_IO_ListenRespond;
    private static Simulation SIMULATION;
    // public.
    public Framework() {
        System.out.printf("entered CONSTRUCTOR Framework()%n");
        stat_CLASS_boot0_DECLAIRE_Framework();
        stat_REG_boot0_DECLAIRE_Framework();

        System.out.printf("started Global Meta-Data and Settings.%n");
        this.dyn_CLASS_create_Global_and_Settings();
        this.dyn_CLASS_get_Global().dyn_REG_boot1_DEFINE_Global();
        this.dyn_CLASS_get_Global().dyn_REG_boot2_SUBSTANTIATE_Global();
        this.dyn_CLASS_get_Global().dyn_REG_boot3_INITIALISE_Global();
        System.out.printf("done Global Meta-Data and Settings.%n");

        System.out.printf("started independent STRUCT classes - DECLAIRE, DEFINE INITIALISE, Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        System.out.printf("started independent STRUCT User_Input().%n");
        stat_STRUCT_boot1_DEFINE_User_Input();
        stat_STRUCT_boot3_INITIALISE_User_Input();
        this.dyn_STRUCT_get_User_Input().dyn_REG_boot1_DEFINE_User_Input();
        this.dyn_STRUCT_get_User_Input().dyn_REG_boot2_SUBSTANTIATE_User_Input();
        this.dyn_STRUCT_get_User_Input().dyn_REG_boot3_INITIALISE_User_Input();
        System.out.printf("done independent STRUCT User_Input().%n");

        System.out.printf("started independent STRUCT User_Algorithm().%n");
        stat_STRUCT_boot1_DEFINE_User_Algorithm();
        stat_STRUCT_boot3_INITIALISE_User_Algorithm();
        this.dyn_STRUCT_get_User_Algorithm().dyn_REG_boot1_DEFINE_User_Algorithm();
        this.dyn_STRUCT_get_User_Algorithm().dyn_REG_boot2_SUBSTANTIATE_User_Algorithm();
        this.dyn_STRUCT_get_User_Algorithm().dyn_REG_boot3_INITIALISE_User_Algorithm();
        System.out.printf("done independent STRUCT User_Algorithm().%n");

        System.out.printf("started independent STRUCT User_Output().%n");
        stat_STRUCT_boot1_DEFINE_User_Output();
        stat_STRUCT_boot3_INITIALISE_User_Output();
        this.dyn_STRUCT_get_User_Output().dyn_REG_boot1_DEFINE_User_Output();
        this.dyn_STRUCT_get_User_Output().dyn_REG_boot2_SUBSTANTIATE_User_Output();
        this.dyn_STRUCT_get_User_Output().dyn_REG_boot3_INITIALISE_User_Output();
        System.out.printf("done independent STRUCT User_Output().%n");

        System.out.printf("started independent STRUCT Input().%n");
        stat_STRUCT_boot1_DEFINE_Input();
        stat_STRUCT_boot3_INITIALISE_Input();
        this.dyn_STRUCT_get_Input().dyn_REG_boot1_DEFINE_Input();
        this.dyn_STRUCT_get_Input().dyn_REG_boot2_SUBSTANTIATE_Input();
        this.dyn_STRUCT_get_Input().dyn_REG_boot3_INITIALISE_Input(this.dyn_STRUCT_get_User_Input());
        System.out.printf("done independent STRUCT Input().%n");

        System.out.printf("started independent STRUCT Algorithm().%n");
        stat_STRUCT_boot1_DEFINE_Algorithm();
        stat_STRUCT_boot3_INITIALISE_Algorithm();
        this.dyn_STRUCT_get_Algorithm().dyn_REG_boot1_DEFINE_Algorithm();
        this.dyn_STRUCT_get_Algorithm().dyn_REG_boot2_SUBSTANTIATE_Algorithm();
        this.dyn_STRUCT_get_Algorithm().dyn_REG_boot3_INITIALISE_Algorithm(this.dyn_STRUCT_get_User_Algorithm());
        System.out.printf("done independent STRUCT Algorithm().%n");

        System.out.printf("started independent STRUCT Output().%n");
        stat_STRUCT_boot1_DEFINE_Output();
        stat_STRUCT_boot3_INITIALISE_Output();
        this.dyn_STRUCT_get_Output().dyn_REG_boot1_DEFINE_Output();
        this.dyn_STRUCT_get_Output().dyn_REG_boot2_SUBSTANTIATE_Output();
        this.dyn_STRUCT_get_Output().dyn_REG_boot3_INITIALISE_Output(this.dyn_STRUCT_get_User_Output());
        System.out.printf("started independent STRUCT Output().%n");

        System.out.printf("started independent THREAD IO_ListenRespond().%n");
        stat_THREAD_boot1_DEFINE_IO_ListenRespond();
        stat_THREAD_boot3_INITIALISE_IO_ListenRespond();
        this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot1_DEFINE_IO_ListenRespond(this);
        this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot2_SUBSTANTIATE_IO_ListenRespond(this);
        this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot3_INITIALISE_IO_ListenRespond(this, this.dyn_STRUCT_get_Input(), this.dyn_STRUCT_get_Output());
        System.out.printf("done independent THREAD IO_ListenRespond().%n");

        System.out.printf("started independent THREAD GraphicsEngine().%n");
        //this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot1_DEFINE_IO_ListenRespond(this);
        //this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot2_SUBSTANTIATE_IO_ListenRespond(this);
        //this.dyn_THREAD_get_IO_ListenRespond().dyn_REG_boot3_INITIALISE_IO_ListenRespond(this, this.dyn_STRUCT_get_Input(), this.dyn_STRUCT_get_Output());
        System.out.printf("done independent THREAD GraphicsEngine().%n");

        System.out.printf("done independent STRUCT classes - DECLAIRE, DEFINE INITIALISE, RRegisters - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        stat_CLASS_boot1_DEFINE_SIMULATION();
        stat_CLASS_boot3_INITIALISE_SIMULATION(this);
        this.dyn_CLASS_get_SIMULATION().dyn_REG_boot1_DEFINE__SIMULATION();
        this.dyn_CLASS_get_SIMULATION().dyn_REG_boot2_SUBSTANTIATE__SIMULATION(this.dyn_STRUCT_get_Input());
        this.dyn_CLASS_get_SIMULATION().dyn_REG_boot3_INITIALISE__SIMULATION(this.dyn_STRUCT_get_Input());

        stat_CLASS_boot1_DEFINE_Framework();
        stat_CLASS_boot3_INITIALISE_Framework(this);

        System.out.printf("started ARCHITECTURE generate.%n");
        System.out.printf("started architectured classes - Registers - DEFINE.%n");
        this.dyn_REG_boot1_DEFINE_Framework(this);
        this.dyn_CLASS_get_App().dyn_REG_boot1_DEFINE_App();
        this.dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot1_DEFINE_Algorithms(this);
        //this.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_Data().dyn_REG_boot1_DEFINE_Data();
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot1_DEFINE_Execute();
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_boot1_DEFINE_Execute_Control();
        System.out.printf("done architectured classes -Registers - DEFINE.%n");

        System.out.printf("started architectured classes - Registers - SUBSTANTIATE.%n");
        this.dyn_REG_boot2_SUBSTANTIATE_Framework(this);
        this.dyn_CLASS_get_App().dyn_REG_boot2_SUBSTANTIATE_App();
        this.dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot2_SUBSTANTIATE_Algorithms(this);
        //this.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot2_SUBSTANTIATE_Data(this);
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot2_SUBSTANTIATE_Execute(this);
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_boot2_SUBSTANTIATE_Execute_Control();
        System.out.printf("done architectured classes -Registers - SUBSTANTIATE.%n");

        System.out.printf("started architectured classes - Registers - INITIALISE.%n");
        this.dyn_REG_boot3_INITIALISE_Framework(this, this.dyn_STRUCT_get_Input(), this.dyn_STRUCT_get_Output());
        this.dyn_CLASS_get_App().dyn_REG_boot3_INITIALISE_App();
        this.dyn_CLASS_get_App().dyn_CLASS_get_Algorithms().dyn_REG_boot3_INITIALISE_Algorithms(this);
        //this.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot3_INITIALISE_Data(this);
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot3_INITIALISE_Execute(this);
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_boot3_INITIALISE_Execute_Control();
        System.out.printf("done architectured classes - Registers - INITIALISE.%n");
        System.out.printf("done ARCHITECTURE generate.%n");

        System.out.printf("started PROGRAM - INSTANTIATE.%n");
        this.dyn_REG_boot4_INSTANTIATE_Framework(this);
        System.out.printf("done PROGRAM - INSTANTIATE.%n");

        System.out.printf("%n");
        System.out.printf("        ,     \\      /      ,%n");
        System.out.printf("       / \\    )\\ __ /(     / \\ %n");
        System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
        System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
        System.out.printf("|              |\\../|               |%n");
        System.out.printf("|               \\VV/                |%n");
        System.out.printf("|           Java TestBench.         |%n");
        System.out.printf("|          Open Source MIT.         |%n");
        System.out.printf("|         King Brenton James        |%n");
        System.out.printf("|       Maddocks BEng(CompSys).     |%n");
        System.out.printf("|___________________________________|%n");
        System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
        System.out.printf("|  /    V          ))        V   \\  |%n");
        System.out.printf("|/                //               \\|%n");
        System.out.printf("`                 V                 '%n");
        System.out.printf("%n");

        //this.dyn_THREAD_get_3d_Graphics().dyn_APP_boot3_INITIALISE_3dGraphics();

        System.out.printf("started PROGRAM - LAUNCH THREADS.%n");
        this.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_APP_Launch_Threads(this);
        System.out.printf("exiting PROGRAM - LAUNCH THREADS.%n");

        System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");
        System.out.printf("exiting CONSTRUCTOR Framework()%n");
    }
    public void dyn_CLASS_create_Global_and_Settings() {
        boot1_CLASS_DEFINE_Global();
        boot3_CLASS_INITIALISE_Global();
    }
    public App dyn_CLASS_get_App() {
        return stat_CLASS_get_App();
    }
    public Global dyn_CLASS_get_Global() {
        return stat_CLASS_get_Global();
    }
    public Simulation dyn_CLASS_get_SIMULATION() {
        return stat_CLASS_get_SIMULATION();
    }
    public void dyn_REG_boot1_DEFINE_Framework(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Framework().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Framework().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Framework(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Framework().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Framework().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Framework(Framework obj, Input structDEFAULT_Input, Output structDEFAULT_Output) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Framework().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Framework().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Framework(Framework obj) {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework().%n");
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot4_INSTANTIATE_Execute();
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework().%n");
    }
    public Algorithm dyn_STRUCT_get_Algorithm() {
        return stat_STRUCT_get_Algorithm();
    }
    public Input dyn_STRUCT_get_Input() {
        return stat_STRUCT_get_Input();
    }
    public Output dyn_STRUCT_get_Output() {
        return stat_STRUCT_get_Output();
    }
    public User_Algorithm dyn_STRUCT_get_User_Algorithm() {
        return stat_STRUCT_get_User_Algorithm();
    }
    public User_Input dyn_STRUCT_get_User_Input() {
        return stat_STRUCT_get_User_Input();
    }
    public User_Output dyn_STRUCT_get_User_Output() {
        return stat_STRUCT_get_User_Output();
    }
    public IO_ListenRespond dyn_THREAD_get_IO_ListenRespond() {
        return stat_THREAD_get_IO_ListenRespond();
    }
    public void dyn_STRUCT_boot0_DECLAIRE()
    {
        System.out.printf("entered stat_STRUCT_boot0_DECLAIRE().%n");

        System.out.printf("exiting stat_STRUCT_boot0_DECLAIRE().%n");
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Framework()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_App().%n");
        _stat_CLASS_App = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework().%n");
        stat_CLASS_boot1_DEFINE_App();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework().%n");
    }
    private static void boot1_CLASS_DEFINE_Global()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Global().%n");
        _stat_CLASS_Global = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Global().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App(Framework obj) {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_App().%n");
        _stat_CLASS_App = new App(obj);
        try {
            stat_CLASS_get_App();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework(Framework obj)  {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework().%n");
        stat_CLASS_boot3_INITIALISE_App(obj);
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework().%n");
    }
    private static void boot3_CLASS_INITIALISE_Global()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Global().%n");
        _stat_CLASS_Global = new Global();
        try {
            stat_CLASS_get_Global();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Global().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_SIMULATION() {
        SIMULATION = null;
    }
    private static void stat_CLASS_boot3_INITIALISE_SIMULATION(Framework obj) {
        SIMULATION = new Simulation(obj, obj.dyn_STRUCT_get_Input(), obj.dyn_STRUCT_get_Output());
        while(stat_CLASS_get_SIMULATION() == null) { }
    }
    private static Global stat_CLASS_get_Global()
    {
        return _stat_CLASS_Global;
    }
    private static Simulation stat_CLASS_get_SIMULATION() {
        return SIMULATION;
    }
    private static App stat_CLASS_get_App()
    {
        return _stat_CLASS_App;
    }
    private static void stat_REG_boot0_DECLAIRE_Framework() {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Framework().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Framework().%n");
    }
    private static void stat_STRUCT_boot1_DEFINE_Algorithm()
    {
        _stat_STRUCT_Algorithm = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Input()
    {
        _stat_STRUCT_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Output()
    {
        _stat_STRUCT_Output = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Algorithm()
    {
        _stat_STRUCT_User_Algorithms = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Input()
    {
        _stat_STRUCT_User_Inputs = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Output()
    {
        _stat_STRUCT_User_Outputs = null;
    }

    private static void stat_STRUCT_boot3_INITIALISE_Algorithm() {
        _stat_STRUCT_Algorithm = new Algorithm();
        try {
            stat_STRUCT_get_Algorithm();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Input() {
        _stat_STRUCT_Input = new Input();
        try {
            stat_STRUCT_get_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Output() {
        _stat_STRUCT_Output = new Output();
        try {
            stat_STRUCT_get_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Algorithm() {
        _stat_STRUCT_User_Algorithms = new User_Algorithm();
        try {
            stat_STRUCT_get_User_Algorithm();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Input() {
        _stat_STRUCT_User_Inputs = new User_Input();
        try {
            stat_STRUCT_get_User_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Output() {
        _stat_STRUCT_User_Outputs = new User_Output();
        try {
            stat_STRUCT_get_User_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
   private static Algorithm stat_STRUCT_get_Algorithm()
    {
        return _stat_STRUCT_Algorithm;
    }
    private static Input stat_STRUCT_get_Input()
    {
        return _stat_STRUCT_Input;
    }
    private static Output stat_STRUCT_get_Output()
    {
        return _stat_STRUCT_Output;
    }
    private static User_Input stat_STRUCT_get_User_Input()
    {
        return _stat_STRUCT_User_Inputs;
    }
    private static User_Output stat_STRUCT_get_User_Output()
    {
        return _stat_STRUCT_User_Outputs;
    }
    private static User_Algorithm stat_STRUCT_get_User_Algorithm()
    {
        return _stat_STRUCT_User_Algorithms;
    }
    private static void stat_THREAD_boot1_DEFINE_IO_ListenRespond()
    {
        _stat_THREAD_IO_ListenRespond = null;
    }
    private static void stat_THREAD_boot3_INITIALISE_IO_ListenRespond() {

    }
    private static IO_ListenRespond stat_THREAD_get_IO_ListenRespond() {
        return _stat_THREAD_IO_ListenRespond;
    }
}