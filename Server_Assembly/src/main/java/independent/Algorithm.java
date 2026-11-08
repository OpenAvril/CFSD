package independent;
import independent.praise_sets.Algorithm_praise0;
import independent.praise_sets.Algorithm_praise1;
import independent.praise_sets.Algorithm_praise2;
import independent.praise_sets.Algorithm_praise3;
public class Algorithm
{
    private static Object stat_REG_Algorithm_Subset;
    // public.
    public Algorithm(byte sysThreadId)  {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        stat_CLASS_boot0_DECLAIRE_Algorithm(sysThreadId);
        stat_CLASS_boot1_DEFINE_Algorithm(sysThreadId);
        stat_CLASS_boot3_INITIALISE_Algorithm(sysThreadId);
        stat_REG_boot0_DECLAIRE_Algorithm(sysThreadId);
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    public void select_Set_Algorithm_Subset(byte sysThreadId, Algorithm objAlgorithm, User_Algorithm objUserAlgorithm, long praiseId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        switch((int) praiseId)
        {
            case 0:
                Algorithm_praise0 inputPraise0 = (Algorithm_praise0)objAlgorithm.dyn_REG_get_Algorithmsubset(sysThreadId);
                objAlgorithm.dyn_REG_set_Algorithmsubset(sysThreadId, inputPraise0);
                break;

            case 1:
                Algorithm_praise1 inputPraise1 = (Algorithm_praise1)objAlgorithm.dyn_REG_get_Algorithmsubset(sysThreadId);
                objAlgorithm.dyn_REG_set_Algorithmsubset(sysThreadId, inputPraise1);
                break;

            case 2:
                Algorithm_praise2 inputPraise2 = (Algorithm_praise2)objAlgorithm.dyn_REG_get_Algorithmsubset(sysThreadId);
                objAlgorithm.dyn_REG_set_Algorithmsubset(sysThreadId, inputPraise2);
                break;

            case 3:
                Algorithm_praise3 inputPraise3 = (Algorithm_praise3)objAlgorithm.dyn_REG_get_Algorithmsubset(sysThreadId);
                objAlgorithm.dyn_REG_set_Algorithmsubset(sysThreadId, inputPraise3);
                break;
        }
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    public void dyn_REG_boot1_DEFINE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        stat_REG_boot2_SUBSTANTIATE_Algorithmsubset(sysThreadId);
    }
    public void dyn_REG_boot3_INITIALISE_Algorithm(byte sysThreadId, User_Algorithm objUserAlgorithm) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        stat_REG_boot3_INITIALISE_Algorithmsubset(sysThreadId, objUserAlgorithm);
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    public Object dyn_REG_get_Algorithmsubset(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: <= Object : dyn_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        return stat_REG_get_Algorithmsubset(sysThreadId);
    }
    public void dyn_REG_set_Algorithmsubset(byte sysThreadId, Algorithm_praise0 objAlgorithmPraise0) {
        System.out.printf("thread " + sysThreadId + " :: => Object : stat_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        stat_REG_set_Algorithmsubset(sysThreadId, (Object)objAlgorithmPraise0);
    }
    public void dyn_REG_set_Algorithmsubset(byte sysThreadId, Algorithm_praise1 objAlgorithmPraise1) {
        System.out.printf("thread " + sysThreadId + " :: => Object : stat_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        stat_REG_set_Algorithmsubset(sysThreadId, (Object)objAlgorithmPraise1);
    }
    public void dyn_REG_set_Algorithmsubset(byte sysThreadId, Algorithm_praise2 objAlgorithmPraise2) {
        System.out.printf("thread " + sysThreadId + " :: => Object : stat_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        stat_REG_set_Algorithmsubset(sysThreadId, (Object)objAlgorithmPraise2);
    }
    public void dyn_REG_set_Algorithmsubset(byte sysThreadId, Algorithm_praise3 objAlgorithmPraise3) {
        System.out.printf("thread " + sysThreadId + " :: => Object : stat_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        stat_REG_set_Algorithmsubset(sysThreadId, (Object)objAlgorithmPraise3);
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithm(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Algorithmsubset(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        stat_REG_Algorithm_Subset = new Object();
        while(stat_REG_get_Algorithmsubset(sysThreadId) == null) { }
    }
    private static void stat_REG_boot3_INITIALISE_Algorithmsubset(byte sysThreadId, User_Algorithm objUserAlgorithm) {
        System.out.printf("thread " + sysThreadId + " :: entered : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        System.out.printf("thread " + sysThreadId + " :: exiting : Global : dyn_REG_boot1_DEFINE_Global(sysThreadId)" + ".%n");
        stat_REG_Algorithm_Subset = objUserAlgorithm.dyn_REG_get_Item_On_List_Of_Algorithmsubsets(0);
    }
    private static Object stat_REG_get_Algorithmsubset(byte sysThreadId) {
        System.out.printf("thread " + sysThreadId + " :: <= Object : stat_REG_get_Algorithmsubset(sysThreadId)" + ".%n");
        return stat_REG_Algorithm_Subset;
    }
    private static void stat_REG_set_Algorithmsubset(byte sysThreadId, Object objSubset) {
        System.out.printf("thread " + sysThreadId + " :: => Object : stat_REG_set_Algorithmsubset(sysThreadId)" + ".%n");
        stat_REG_Algorithm_Subset = objSubset;
    }
}