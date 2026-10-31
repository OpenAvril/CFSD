package independent;

import independent.praise_sets.Algorithm_praise0;
import independent.praise_sets.Algorithm_praise1;
import independent.praise_sets.Algorithm_praise2;
import independent.praise_sets.Algorithm_praise3;

public class User_Algorithm {
    private static Algorithm_praise0 stat_CLASS_Subest_praise0;
    private static Algorithm_praise1 stat_CLASS_Subest_praise1;
    private static Algorithm_praise2 stat_CLASS_Subest_praise2;
    private static Algorithm_praise3 stat_CLASS_Subest_praise3;
    private static Object[] stat_REG_List_Of_Algorithmsubsets;
    // public.
    public User_Algorithm()
    {
        System.out.printf("entered STRUCT_CLASS User_Algorithm()%n");
        stat_CLASS_boot0_DECLAIRE_User_Algorithm();
        stat_CLASS_boot1_DEFINE_User_Algorithm();
        stat_CLASS_boot3_INITIALISE_User_Algorithm();
        stat_REG_boot0_DECLAIRE_User_Algorithm();
        System.out.printf("exiting STRUCT_CLASS User_Algorithm()%n");
    }
    public void dyn_REG_boot1_DEFINE_User_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_User_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_User_Algorithm().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_User_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_User_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_User_Algorithm().%n");
    }
    public void dyn_REG_boot3_INITIALISE_User_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_User_Algorithm().%n");
        stat_REG_boot3_INITIALISE_List_Of_Algorithmsubsets();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_User_Algorithm().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_User_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_User_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_User_Algorithm().%n");
    }
    public Object dyn_REG_get_Item_On_List_Of_Algorithmsubsets(long praiseId)
    {
        return stat_REG_get_List_Of_Algorithmsubsets()[Math.toIntExact(praiseId)];
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_User_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_User_Algorithm().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_User_Algorithm().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_User_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_User_Algorithm().%n");
        stat_CLASS_boot1_DEFINE_Subest_praise0();
        stat_CLASS_boot1_DEFINE_Subest_praise1();
        stat_CLASS_boot1_DEFINE_Subest_praise2();
        stat_CLASS_boot1_DEFINE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_User_Algorithm().%n");
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
    private static void stat_CLASS_boot3_INITIALISE_User_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Algorithm().%n");
        stat_CLASS_boot3_INITIALISE_Subest_praise0();
        stat_CLASS_boot3_INITIALISE_Subest_praise1();
        stat_CLASS_boot3_INITIALISE_Subest_praise2();
        stat_CLASS_boot3_INITIALISE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Algorithm().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise0()
    {
        stat_CLASS_Subest_praise0 = new Algorithm_praise0();
        while(stat_CLASS_get_Subest_praise0() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise1()
    {
        stat_CLASS_Subest_praise1 = new Algorithm_praise1();
        while(stat_CLASS_get_Subest_praise1() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise2()
    {
        stat_CLASS_Subest_praise2 = new Algorithm_praise2();
        while(stat_CLASS_get_Subest_praise2() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise3()
    {
        stat_CLASS_Subest_praise3 = new Algorithm_praise3();
        while(stat_CLASS_get_Subest_praise3() == null) { }
    }
    private static Algorithm_praise0 stat_CLASS_get_Subest_praise0()
    {
        return stat_CLASS_Subest_praise0;
    }
    private static Algorithm_praise1 stat_CLASS_get_Subest_praise1()
    {
        return stat_CLASS_Subest_praise1;
    }
    private static Algorithm_praise2 stat_CLASS_get_Subest_praise2()
    {
        return stat_CLASS_Subest_praise2;
    }
    private static Algorithm_praise3 stat_CLASS_get_Subest_praise3()
    {
        return stat_CLASS_Subest_praise3;
    }
    private static void stat_REG_boot0_DECLAIRE_User_Algorithm()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_User_Algorithm().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_User_Algorithm().%n");
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Algorithmsubsets()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Algorithm_paiseId().%n");
        stat_REG_List_Of_Algorithmsubsets = new Object[4];//NUMBER OF PRAISES.
        while(stat_REG_get_List_Of_Algorithmsubsets() == null) { }
        stat_REG_List_Of_Algorithmsubsets[0] = stat_CLASS_get_Subest_praise0();
        stat_REG_List_Of_Algorithmsubsets[1] = stat_CLASS_get_Subest_praise1();
        stat_REG_List_Of_Algorithmsubsets[2] = stat_CLASS_get_Subest_praise2();
        stat_REG_List_Of_Algorithmsubsets[3] = stat_CLASS_get_Subest_praise3();

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Algorithm_paiseId().%n");
    }
    private static Object[] stat_REG_get_List_Of_Algorithmsubsets()
    {
        return stat_REG_List_Of_Algorithmsubsets;
    }
}
