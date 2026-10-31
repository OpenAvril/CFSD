package independent;
import independent.praise_sets.Input_praise0;
import independent.praise_sets.Input_praise1;
import independent.praise_sets.Input_praise2;
import independent.praise_sets.Input_praise3;
public class User_Input
{
    private static Input_praise0 stat_CLASS_Subest_praise0;
    private static Input_praise1 stat_CLASS_Subest_praise1;
    private static Input_praise2 stat_CLASS_Subest_praise2;
    private static Input_praise3 stat_CLASS_Subest_praise3;
    private static Object[] stat_REG_List_Of_InputSubsets;
    // public.
    public User_Input()
    {
        System.out.printf("entered STRUCT_CLASS User_Input()%n");
        stat_CLASS_boot0_DECLAIRE_User_Input();
        stat_CLASS_boot1_DEFINE_User_Input();
        stat_CLASS_boot3_INITIALISE_User_Input();
        stat_REG_boot0_DECLAIRE_User_Input();
        System.out.printf("exiting STRUCT_CLASS User_Input()%n");
    }
    public void dyn_REG_boot1_DEFINE_User_Input()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_User_Input().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_User_Input().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_User_Input()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_User_Input().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_User_Input().%n");
    }
    public void dyn_REG_boot3_INITIALISE_User_Input()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_User_Input().%n");
        stat_REG_boot3_INITIALISE_List_Of_InputSubsets();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_User_Input().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_User_Input()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_User_Input().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_User_Input().%n");
    }
    public Object dyn_REG_get_Item_On_List_Of_InputSubsets(long praiseId)
    {
        return stat_REG_get_List_Of_InputSubsets()[Math.toIntExact(praiseId)];
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_User_Input()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_User_Input().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_User_Input().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_User_Input()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_User_Input().%n");
        stat_CLASS_boot1_DEFINE_Subest_praise0();
        stat_CLASS_boot1_DEFINE_Subest_praise1();
        stat_CLASS_boot1_DEFINE_Subest_praise2();
        stat_CLASS_boot1_DEFINE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_User_Input().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise0()
    {
        stat_CLASS_Subest_praise0 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise1()
    {
        stat_CLASS_Subest_praise1 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise2()
    {
        stat_CLASS_Subest_praise2 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise3()
    {
        stat_CLASS_Subest_praise3 = null;
    }
    private static void stat_CLASS_boot3_INITIALISE_User_Input()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Input().%n");
        stat_CLASS_boot3_INITIALISE_Subest_praise0();
        stat_CLASS_boot3_INITIALISE_Subest_praise1();
        stat_CLASS_boot3_INITIALISE_Subest_praise2();
        stat_CLASS_boot3_INITIALISE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Input().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise0()
    {
        stat_CLASS_Subest_praise0 = new Input_praise0();
        while(stat_CLASS_get_Subest_praise0() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise1()
    {
        stat_CLASS_Subest_praise1 = new Input_praise1();
        while(stat_CLASS_get_Subest_praise1() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise2()
    {
        stat_CLASS_Subest_praise2 = new Input_praise2();
        while(stat_CLASS_get_Subest_praise2() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise3()
    {
        stat_CLASS_Subest_praise3 = new Input_praise3();
        while(stat_CLASS_get_Subest_praise3() == null) { }
    }
    private static Input_praise0 stat_CLASS_get_Subest_praise0()
    {
        return stat_CLASS_Subest_praise0;
    }
    private static Input_praise1 stat_CLASS_get_Subest_praise1()
    {
        return stat_CLASS_Subest_praise1;
    }
    private static Input_praise2 stat_CLASS_get_Subest_praise2()
    {
        return stat_CLASS_Subest_praise2;
    }
    private static Input_praise3 stat_CLASS_get_Subest_praise3()
    {
        return stat_CLASS_Subest_praise3;
    }
    private static void stat_REG_boot0_DECLAIRE_User_Input()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_User_Input().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_User_Input().%n");
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_InputSubsets()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Input_paiseId().%n");
        stat_REG_List_Of_InputSubsets = new Object[4];//NUMBER OF PRAISES.
        while(stat_REG_get_List_Of_InputSubsets() == null) { }
        stat_REG_List_Of_InputSubsets[0] = stat_CLASS_get_Subest_praise0();
        stat_REG_List_Of_InputSubsets[1] = stat_CLASS_get_Subest_praise1();
        stat_REG_List_Of_InputSubsets[2] = stat_CLASS_get_Subest_praise2();
        stat_REG_List_Of_InputSubsets[3] = stat_CLASS_get_Subest_praise3();

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Input_paiseId().%n");
    }
    private static Object[] stat_REG_get_List_Of_InputSubsets()
    {
        return stat_REG_List_Of_InputSubsets;
    }
}