package independent;
import engine.Framework;
import independent.praise_sets.*;
public class Output
{
    private static long stat_REG_Output_paiseId;
    private static Object stat_REG_OutputSubset;
    // public.
    public Output()
    {
        System.out.printf("entered STRUCT_CLASS Output()%n");
        stat_CLASS_boot0_DECLAIRE_Output();
        stat_CLASS_boot1_DEFINE_Output();
        stat_CLASS_boot3_INITIALISE_Output();
        stat_REG_boot0_DECLAIRE_Output();
        System.out.printf("exiting STRUCT_CLASS Output()%n");
    }
    public void dyn_REG_boot1_DEFINE_Output()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Output().%n");
        stat_REG_boot1_DEFINE_Output_paiseId();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Output().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Output()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Output().%n");
        stat_REG_boot2_SUBSTANTIATE_Output_paiseId();
        stat_REG_boot2_SUBSTANTIATE_OutputSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Output().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Output(User_Output objUserOutput)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Output().%n");
        stat_REG_boot3_INITIALISE_Output_paiseId();
        stat_REG_boot3_INITIALISE_OutputSubset(objUserOutput);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Output().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Output()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Output().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Output().%n");
    }
    public long dyn_REG_get_Output_praiseId()
    {
        return stat_REG_get_Output_praiseId();
    }
    public Object dyn_REG_get_OutputSubset()
    {
        return stat_REG_get_OutputSubset();
    }
    public void dyn_REG_set_Output_praiseId(long valuePraiseEventId)
    {
        stat_REG_set_Output_praiseId(valuePraiseEventId);
    }
    public void dyn_REG_set_OutputSubset(byte sysThreadId, Framework obj, long praiseId)
    {
        User_Output userOutput = obj.dyn_STRUCT_get_User_Output();
        switch((int) praiseId)
        {
            case 0:
                stat_REG_set_OutputSubset((Output_praise0)userOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(praiseId));
                break;

            case 1:
                stat_REG_set_OutputSubset((Output_praise1)userOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(praiseId));
                break;

            case 2:
                stat_REG_set_OutputSubset((Output_praise2)userOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(praiseId));
                break;

            case 3:
                stat_REG_set_OutputSubset((Output_praise3)userOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(praiseId));
                break;

        }
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Output()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Output().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Output().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Output()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Output()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Output().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Output().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Output()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Output().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Output().%n");
    }
    private static void stat_REG_boot1_DEFINE_Output_paiseId()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output_paiseId().%n");
        stat_REG_OutputSubset = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Output_paiseId()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Output_paiseId().%n");
        stat_REG_Output_paiseId = Long.MAX_VALUE;
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Output_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_OutputSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_OutputSubset().%n");
        try {
            stat_REG_OutputSubset = new Object();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_OutputSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Output_paiseId()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Output_paiseId().%n");
        stat_REG_Output_paiseId = (long)(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Output_paiseId().%n");
    }
    private static void stat_REG_boot3_INITIALISE_OutputSubset(User_Output objUserOutput)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_OutputSubset().%n");
        stat_REG_OutputSubset = objUserOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_OutputSubset().%n");
    }
    private static long stat_REG_get_Output_praiseId()
    {
        return stat_REG_Output_paiseId;
    }
    private static Object stat_REG_get_OutputSubset()
    {
        return stat_REG_OutputSubset;
    }
    public static void stat_REG_set_Output_praiseId(long valuePraiseEventId)
    {
        stat_REG_Output_paiseId = valuePraiseEventId;
    }
    private static void stat_REG_set_OutputSubset(Object objSubset)
    {
        stat_REG_OutputSubset = objSubset;
    }
}