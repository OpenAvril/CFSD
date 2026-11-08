package engine;

public class Execute_Control
{
    private static boolean[][] stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn;
    private static boolean[][] stat_REG_FLAG_array_isNewDataReadyForInjection;
    private static boolean[][] stat_REG_FLAG_array_isNewDataReadyForExtraction;
    private static boolean[] stat_REG_ptr_Flag_array_ThreadInitialised;
    private static boolean stat_REG_ptr_Flag_isSystemInitialised;
    // public.
    public Execute_Control()
    {
        stat_CLASS_boot0_DECLAIRE_Execute_Control();
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_REG_boot0_DECLAIRE_Execute_Control();
    }
    public void app_Terminate_All_Threads(Framework obj)
    {
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++)
        {
            stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId,false);
        }
        stat_REG_set_Flag_is_SystemInitialised(false);
    }
    public void dyn_REG_boot1_DEFINE_Execute_Control()
    {

    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute_Control()
    {
        stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised();
        stat_REG_boot2_SUBSTANTIATE_Flag_isWaitingOnPraiseReturn();
        stat_REG_boot2_SUBSTANTIATE_Flag_isNewDataReadyForInjection();
        stat_REG_boot2_SUBSTANTIATE_Flag_isNewDataReadyForExtraction();
        stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised();
    }
    public void dyn_REG_boot3_INITIALISE_Execute_Control()
    {
        stat_REG_boot3_INITIALISE_Flag_isSystemInitialised();
        stat_REG_boot3_INITIALISE_Flag_isWaitingOnPraiseReturn();
        stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised();
    }
    public boolean dyn_REG_get_Flag_is_SystemInitialised()
    {
        return stat_REG_get_ptr_Flag_is_SystemInitialised();
    }
    public boolean dyn_REG_get_Flag_isWaitingOnPraiseReturn(long praiseId)
    {
        return stat_REG_get_ptr_Flag_isWaitingOnPraiseReturn(praiseId);
    }
    public boolean dyn_REG_get_Flag_isNewDataReadyForInjection(long praiseId)
    {
        return stat_REG_get_ptr_Flag_isNewDataReadyForInjection(praiseId);
    }
    public boolean dyn_REG_get_Flag_isNewDataReadyForExtraction(long praiseId)
    {
        return stat_REG_get_ptr_Flag_isNewDataReadyForExtraction(praiseId);
    }
    public boolean dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(byte threadId)
    {
        return stat_get_ptr_list_Of_flag_ThreadInitialised(threadId);
    }
    public void dyn_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {
        stat_REG_set_Flag_is_SystemInitialised(newFlag);
    }
    public void dyn_REG_set_Flag_isWaitingOnPraiseReturn(long praiseId, boolean newFlag)
    {
        stat_REG_set_Flag_isWaitingOnPraiseReturn(praiseId, newFlag);
    }
    public void dyn_REG_set_Flag_isNewDataReadyForInjection(long praiseId, boolean newFlag)
    {
        stat_REG_set_Flag_isNewDataReadyForInjection(praiseId, newFlag);
    }
    public void dyn_REG_set_Flag_isNewDataReadyForExtraction(long praiseId, boolean newFlag)
    {
        stat_REG_set_Flag_isNewDataReadyForExtraction(praiseId, newFlag);
    }
    public void dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(byte threadId, boolean newBoolValue)
    {
        stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, newBoolValue);
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control()
    {

    }
    private static void stat_REG_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised()
    {
        stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isWaitingOnPraiseReturn()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn = new boolean[temp[0]+1][temp[1]+1];
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn[indexA][indexB] = true;
            }
        }
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isNewDataReadyForInjection()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        stat_REG_FLAG_array_isNewDataReadyForInjection = new boolean[temp[0]+1][temp[1]+1];
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_REG_FLAG_array_isNewDataReadyForInjection[indexA][indexB] = true;
            }
        }
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isNewDataReadyForExtraction()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        stat_REG_FLAG_array_isNewDataReadyForExtraction = new boolean[temp[0]+1][temp[1]+1];
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_REG_FLAG_array_isNewDataReadyForExtraction[indexA][indexB] = true;
            }
        }
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised()
    {
        stat_REG_ptr_Flag_array_ThreadInitialised = new boolean[3];
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++) {
            stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = true;
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isSystemInitialised()
    {
        stat_REG_ptr_Flag_isSystemInitialised = false;
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isWaitingOnPraiseReturn()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn[indexA][indexB] = false;
            }
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isNewDataReadyForInjection()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_REG_FLAG_array_isNewDataReadyForInjection[indexA][indexB] = false;
            }
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isNewDataReadyForExtraction()
    {
        int[] temp = Global.stat_CONVERT_Long_To_twoInts((int)Global.dyn_REG_get_numberOfPraises());
        for(int indexA = 0; indexA < temp[0]; indexA++) {
            for (int indexB = 0; indexB < temp[1]; indexB++) {
                stat_REG_FLAG_array_isNewDataReadyForExtraction[indexA][indexB] = false;
            }
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised()
    {
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++) {
            stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = false;
        }
    }
    private static boolean stat_REG_get_ptr_Flag_is_SystemInitialised()
    {
        return stat_REG_ptr_Flag_isSystemInitialised;
    }
    private static boolean stat_REG_get_ptr_Flag_isWaitingOnPraiseReturn(long praiseId)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        return stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn[switching[0]][switching[1]];
    }
    private static boolean stat_REG_get_ptr_Flag_isNewDataReadyForInjection(long praiseId)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        return stat_REG_FLAG_array_isNewDataReadyForInjection[switching[0]][switching[1]];
    }
    private static boolean stat_REG_get_ptr_Flag_isNewDataReadyForExtraction(long praiseId)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        return stat_REG_FLAG_array_isNewDataReadyForExtraction[switching[0]][switching[1]];
    }
    private static boolean stat_get_ptr_list_Of_flag_ThreadInitialised(byte threadId)
    {
        return stat_REG_ptr_Flag_array_ThreadInitialised[threadId];
    }
    private static void stat_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {
        stat_REG_ptr_Flag_isSystemInitialised = newFlag;
    }
    private static void stat_REG_set_Flag_isWaitingOnPraiseReturn(long praiseId, boolean newFlag)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        stat_SIM_REG_FLAG_array_isWaitingOnPraiseReturn[switching[0]][switching[1]] = newFlag;
    }
    private static void stat_REG_set_Flag_isNewDataReadyForInjection(long praiseId, boolean newFlag)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        stat_REG_FLAG_array_isNewDataReadyForInjection[switching[0]][switching[1]] = newFlag;
    }
    private static void stat_REG_set_Flag_isNewDataReadyForExtraction(long praiseId, boolean newFlag)
    {
        int[] switching = Global.stat_CONVERT_Long_To_twoInts(praiseId);
        stat_REG_FLAG_array_isNewDataReadyForExtraction[switching[0]][switching[1]] = newFlag;
    }
    private static void stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(byte threadId, boolean newFlag)
    {
        stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = newFlag;
    }
}
