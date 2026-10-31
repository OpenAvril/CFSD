package independent;
import independent.praise_sets.Algorithm_praise0;
import independent.praise_sets.Algorithm_praise1;
import independent.praise_sets.Algorithm_praise2;
import independent.praise_sets.Algorithm_praise3;
public class Algorithm
{
    private static Algorithm_Control stat_CLASS_Algorithm_Control;
    private static Object stat_REG_Algorithmsubset;
    // public.
    public Algorithm()
    {
        System.out.printf("entered STRUCT_CLASS Algorithm()%n");
        stat_CLASS_boot0_DECLAIRE_Algorithm();
        stat_CLASS_boot1_DEFINE_Algorithm();
        stat_CLASS_boot3_INITIALISE_Algorithm();
        stat_REG_boot0_DECLAIRE_Algorithm();
        System.out.printf("exiting STRUCT_CLASS Algorithm()%n");
    }
    public Algorithm_Control dyn_CLASS_get_Algorithm_Control()
    {
        return stat_CLASS_get_Algorithm_Control();
    }
    public void dyn_REG_boot1_DEFINE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Algorithm().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Algorithm().%n");
        stat_REG_boot2_SUBSTANTIATE_Algorithmsubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Algorithm().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Algorithm(User_Algorithm objUserAlgorithm)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Algorithm().%n");
        stat_REG_boot3_INITIALISE_Algorithmsubset(objUserAlgorithm);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Algorithm().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithm()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Algorithm().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Algorithm().%n");
    }
    public Object dyn_REG_get_Algorithmsubset()
    {
        return stat_REG_get_Algorithmsubset();
    }
    public void dyn_REG_set_Algorithmsubset(Algorithm_praise0 objAlgorithmPraise0)
    {
        stat_REG_set_Algorithmsubset((Object)objAlgorithmPraise0);
    }
    public void dyn_REG_set_Algorithmsubset(Algorithm_praise1 objAlgorithmPraise1)
    {
        stat_REG_set_Algorithmsubset((Object)objAlgorithmPraise1);
    }
    public void dyn_REG_set_Algorithmsubset(Algorithm_praise2 objAlgorithmPraise2)
    {
        stat_REG_set_Algorithmsubset((Object)objAlgorithmPraise2);
    }
    public void dyn_REG_set_Algorithmsubset(Algorithm_praise3 objAlgorithmPraise3)
    {
        stat_REG_set_Algorithmsubset((Object)objAlgorithmPraise3);
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Algorithm().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Algorithm().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithm().%n");
        stat_CLASS_boot1_DEFINE_Algorithm_Control();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithm().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithm_Control()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithm_Control().%n");
        stat_CLASS_Algorithm_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithm_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithm()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithm().%n");
        stat_CLASS_boot3_INITIALISE_Algorithm_Control();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithm().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithm_Control()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithm_Control().%n");
        stat_CLASS_Algorithm_Control = new Algorithm_Control();
        while(stat_CLASS_get_Algorithm_Control() == null) { }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithm_Control().%n");
    }
    private static Algorithm_Control stat_CLASS_get_Algorithm_Control()
    {
        return stat_CLASS_Algorithm_Control;
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithm()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Algorithm().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Algorithm().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Algorithmsubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Algorithmsubset().%n");
        stat_REG_Algorithmsubset = new Object();
        while(stat_REG_get_Algorithmsubset() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Algorithmsubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Algorithmsubset(User_Algorithm objUserAlgorithm)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Algorithmsubset().%n");
        stat_REG_Algorithmsubset = objUserAlgorithm.dyn_REG_get_Item_On_List_Of_Algorithmsubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Algorithmsubset().%n");
    }
    private static Object stat_REG_get_Algorithmsubset()
    {
        return stat_REG_Algorithmsubset;
    }
    private static void stat_REG_set_Algorithmsubset(Object objSubset)
    {
        stat_REG_Algorithmsubset = objSubset;
    }
}