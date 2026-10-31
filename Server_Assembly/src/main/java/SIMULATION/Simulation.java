package SIMULATION;
import engine.Framework;
import engine.Global;
import independent.Input;
import independent.Output;
import independent.praise_sets.Input_praise0;
import independent.praise_sets.Input_praise1;
import independent.praise_sets.Input_praise2;
import independent.praise_sets.Input_praise3;
import independent.praise_sets.Output_praise0;
import independent.praise_sets.Output_praise1;
import independent.praise_sets.Output_praise2;
import independent.praise_sets.Output_praise3;

import java.util.Scanner;

public class Simulation
{
    public static Input _SIMstat_REG_input_Sample;
    public static Output _SIMstat_REG_output_Sample;
    private static boolean[] _SIMstat_REG_PraiseStarted;
    private static boolean[] _SIMstat_REG_PraiseComplete;
    private static Scanner stat_REG_scanner;
    public Simulation(byte sysThreadId, Framework obj, Input _DEFAULT_inputSample, Output _DEFAULT_outputSample)
    {
        _SIMstat_REG_input_Sample = null;
        _SIMstat_REG_input_Sample = _DEFAULT_inputSample;
        _SIMstat_REG_input_Sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIMstat_REG_input_Sample.dyn_REG_boot3_INITIALISE_Input(obj.dyn_STRUCT_get_User_Input(sysThreadId));
        _SIMstat_REG_input_Sample = _DEFAULT_inputSample;
        _SIMstat_REG_output_Sample = null;
        _SIMstat_REG_output_Sample = _DEFAULT_outputSample;
        _SIMstat_REG_output_Sample.dyn_REG_boot2_SUBSTANTIATE_Output();
        _SIMstat_REG_output_Sample.dyn_REG_boot3_INITIALISE_Output(obj.dyn_STRUCT_get_User_Output(sysThreadId));
        _SIMstat_REG_output_Sample = _DEFAULT_outputSample;
        _SIMstat_REG_PraiseStarted = null;
        _SIMstat_REG_PraiseStarted = new boolean[4];
        _SIMstat_REG_PraiseComplete = null;
        _SIMstat_REG_PraiseComplete = new boolean[4];
        for(int i=0; i< Global.dyn_REG_get_numberOfPraises(sysThreadId); i++) {
            _SIMstat_REG_PraiseStarted[i] = true;
            _SIMstat_REG_PraiseComplete[i] = true;
        }
        for(int i=0; i< Global.dyn_REG_get_numberOfPraises(sysThreadId); i++) {
            _SIMstat_REG_PraiseStarted[i] = false;
            _SIMstat_REG_PraiseComplete[i] = false;
        }
        stat_REG_scanner = null;
        stat_REG_scanner = new Scanner(System.in);
    }
    public void Thread_Input_Peripheral_Scanner(byte sysThreadId, Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + " :: Entered THREAD member function.%n");
        boolean checkPass = false;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 1%n");//todo SIMULATION
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
            System.out.printf("thread " + threadId + " :: isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
            checkPass = true;
        }
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 1%n");//todo SIMULATION
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
                System.out.printf("thread " + threadId + " :: Starting THREAD.%n");//todo SIMULATION
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
        }
        checkPass = false;
        boolean doneOnce2 = false;//todo SIMULATION
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 1%n");//todo SIMULATION
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " :: dyn_REG_get_Flag_is_SystemInitialised() => " + true + ".%n");//todo SIMULATION
                if(!obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady()) {
                    System.out.printf("thread " + threadId + " :: dyn_REG_get_flag__isNewInputReady() => " + false + ".%n");//todo SIMULATION
                    WriteQue_ConditionCode.app_FUNCT_write_End(1);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
                    if(!doneOnce2) {
                        _SIMstat_REG_input_Sample = obj.dyn_STRUCT_get_Input();
                        for(long praiseIdIndex = 0; praiseIdIndex < 4; praiseIdIndex++) {
                            while (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady()) {

                            }
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            _SIMstat_REG_input_Sample.dyn_REG_set_Input_praiseId(praiseIdIndex);//todo process of input
                            System.out.printf("thread " + threadId + " :: <= : PraiseEventId: " + _SIMstat_REG_input_Sample.dyn_REG_get_Input_praiseId() + ".%n");//todo SIMULATION
                            _SIMstat_REG_input_Sample.dyn_REG_set_InputSubset(obj, _SIMstat_REG_input_Sample.dyn_REG_get_Input_praiseId());//todo process of input
                            Input_praise0 subset_of_SIM_input_for_praise0 = null;
                            Input_praise1 subset_of_SIM_input_for_praise1 = null;
                            Input_praise2 subset_of_SIM_input_for_praise2 = null;
                            Input_praise3 subset_of_SIM_input_for_praise3 = null;
                            int[] thread_Listen_switch_C = null;
                            thread_Listen_switch_C = new int[2];
                            thread_Listen_switch_C = Global.stat_CONVERT_Long_To_twoInts(_SIMstat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                            System.out.printf("thread " + threadId + " :: <= : switch(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                            switch (thread_Listen_switch_C[0]) {
                                case 0:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 0:
                                            try {
                                                subset_of_SIM_input_for_praise0 = (Input_praise0)_SIMstat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise0.dyn_REG_set_input_praise0_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise0.dyn_REG_set_input_praise0_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise0.dyn_REG_get_input_praise0_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise0.dyn_REG_get_input_praise0_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 1:
                                            try {
                                                subset_of_SIM_input_for_praise1 = (Input_praise1)_SIMstat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise1.dyn_REG_set_input_praise1_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise1.dyn_REG_set_input_praise1_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise1.dyn_REG_get_input_praise1_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise1.dyn_REG_get_input_praise1_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 2:
                                            try {
                                                subset_of_SIM_input_for_praise2 = (Input_praise2)_SIMstat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise2.dyn_REG_set_input_praise2_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise2.dyn_REG_set_input_praise2_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise2.dyn_REG_get_input_praise2_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise2.dyn_REG_get_input_praise2_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 3:
                                            try {
                                                subset_of_SIM_input_for_praise3 = (Input_praise3)_SIMstat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise3.dyn_REG_set_input_praise3_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise3.dyn_REG_set_input_praise3_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise3.dyn_REG_get_input_praise3_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise3.dyn_REG_get_input_praise3_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case Integer.MAX_VALUE:
                                            break;

                                        case -1:
                                            break;

                                        case Integer.MIN_VALUE:
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                case Integer.MAX_VALUE:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 0:
                                            break;

                                        case Integer.MAX_VALUE:
                                            break;

                                        case -1:
                                            break;

                                        case Integer.MIN_VALUE:
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                case -1:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 0:
                                            break;

                                        case Integer.MAX_VALUE:
                                            break;

                                        case -1:
                                            break;

                                        case Integer.MIN_VALUE:
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                case Integer.MIN_VALUE:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 0:
                                            break;

                                        case Integer.MAX_VALUE:
                                            break;

                                        case -1:
                                            break;

                                        case Integer.MIN_VALUE:
                                            System.out.printf("thread " + threadId + " :: is primed DEFAULT case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
                            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 1%n");//todo SIMULATION
                            //obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(_SIMstat_REG_input_Sample.dyn_REG_get_Input_praiseId(), true);
                            _SIMstat_REG_PraiseStarted[Math.toIntExact(_SIMstat_REG_input_Sample.dyn_REG_get_Input_praiseId())] = true;//todo SIMULATION
                            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewInputReady(true);
                            System.out.printf("thread " + threadId + " :: => CC : dyn_REG_set_flag__isNewInputReady(" + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady() + ")%n");//todo SIMULATION
                            WriteQue_ConditionCode.app_FUNCT_write_End(1);
                            System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        }
                        if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                            checkPass = true;
                        }
                        doneOnce2 = true;
                    }
                } else {
                    if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                        checkPass = true;
                    }
                    WriteQue_ConditionCode.app_FUNCT_write_End(1);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
                }
            } else {
                if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                    checkPass = true;
                }
                WriteQue_ConditionCode.app_FUNCT_write_End(1);
                System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 1%n");//todo SIMULATION
            }
        }
    }
    public void Thread_Output_Draw(byte sysThreadId, Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + " :: Entered THREAD member function.%n");
        boolean checkPass = false;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
            System.out.printf("thread " + threadId + " :: isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 2%n");//todo SIMULATION
            checkPass = true;
        }
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
                System.out.printf("thread " + threadId + " :: Starting THREAD.%n");//todo SIMULATION
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : close access @ 2%n");//todo SIMULATION
        }
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " :: <= CC : dyn_REG_get_Flag_is_SystemInitialised() = " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + "%n");//todo SIMULATION
                if (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady()) {
                    System.out.printf("thread " + threadId + " :: <= CC : stat_REG_get_flag__isNewInputReady() = " + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady() + "%n");//todo SIMULATION
                    WriteQue_ConditionCode.app_FUNCT_write_Start(2);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
                    _SIMstat_REG_output_Sample = obj.dyn_STRUCT_get_Output();
                    _SIMstat_REG_output_Sample = obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_Buffer__Ouput();
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                    System.out.printf("thread " + threadId + " :: <= : PraiseEventId: " + _SIMstat_REG_output_Sample.dyn_REG_get_Output_praiseId() + ".%n");
                    int[] thread_Listen_switch_D = null;
                    thread_Listen_switch_D = new int[2];
                    thread_Listen_switch_D = Global.stat_CONVERT_Long_To_twoInts(_SIMstat_REG_output_Sample.dyn_REG_get_Output_praiseId());
                    Output_praise0 output_subset0 = null;
                    Output_praise1 output_subset1 = null;
                    Output_praise2 output_subset2 = null;
                    Output_praise3 output_subset3 = null;
                    System.out.printf("thread " + threadId + " :: switch(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                    switch (thread_Listen_switch_D[0]) {
                        case 0:
                            switch (thread_Listen_switch_D[1]) {
                                case 0:
                                    double result0 = Double.MAX_VALUE;
                                    try {
                                        output_subset0 = (Output_praise0) _SIMstat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        result0 = output_subset0.dyn_REG_get_output_praise0_value();
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    System.out.printf("thread " + threadId + " :: <= : output subset0 value: " + result0 + ".%n");
                                    break;

                                case 1:
                                    double result1 = Double.MAX_VALUE;
                                    try {
                                        output_subset1 = (Output_praise1) _SIMstat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        result1 = output_subset1.dyn_REG_get_output_praise1_value();
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    System.out.printf("thread " + threadId + " :: <= : output subset1 value: " + result1 + ".%n");
                                    break;

                                case 2:
                                    double result2 = Double.MAX_VALUE;
                                    try {
                                        output_subset2 = (Output_praise2) _SIMstat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        result2 = output_subset2.dyn_REG_get_output_praise2_value();
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    System.out.printf("thread " + threadId + " :: <= : output subset2 value: " + result2 + ".%n");
                                    break;

                                case 3:
                                    double result3 = Double.MAX_VALUE;
                                    try {
                                        output_subset3 = (Output_praise3) _SIMstat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        result3 = output_subset3.dyn_REG_get_output_praise3_value();
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    System.out.printf("thread " + threadId + " :: <= : output subset3 value: " + result3 + ".%n");
                                    break;

                                case Integer.MAX_VALUE:
                                    break;

                                case -1:
                                    break;

                                case Integer.MIN_VALUE:
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        case Integer.MAX_VALUE:
                            switch (thread_Listen_switch_D[1]) {
                                case 0:
                                    break;

                                case Integer.MAX_VALUE:
                                    break;

                                case -1:
                                    break;

                                case Integer.MIN_VALUE:
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        case -1:
                            switch (thread_Listen_switch_D[1]) {
                                case 0:
                                    break;

                                case Integer.MAX_VALUE:
                                    break;

                                case -1:
                                    break;

                                case Integer.MIN_VALUE:
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        case Integer.MIN_VALUE:
                            switch (thread_Listen_switch_D[1]) {
                                case 0:
                                    break;

                                case Integer.MAX_VALUE:
                                    break;

                                case -1:
                                    break;

                                case Integer.MIN_VALUE:
                                    System.out.printf("thread " + threadId + " :: is primed DEFAULT case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        default:
                            System.out.printf("thread " + threadId + " :: close case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                            break;
                    }
                    WriteQue_ConditionCode.app_FUNCT_write_Start(2);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(_SIMstat_REG_output_Sample.dyn_REG_get_Output_praiseId(), false);
                    if(_SIMstat_REG_output_Sample.dyn_REG_get_Output_praiseId() != Integer.MIN_VALUE) {
                        _SIMstat_REG_PraiseComplete[(int)_SIMstat_REG_output_Sample.dyn_REG_get_Output_praiseId()] = true;
                        obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(false);
                        System.out.printf("thread " + threadId + " :: => CC : isNewOutputReady(" + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady() + ")%n");//todo SIMULATION
                    }
                    if(obj.dyn_CLASS_get_SIMULATION().dyn_REG_get_FLAG_isSimulationComplete()) {//TODO SIMULATION
                        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);//TODO SIMULATION
                    }//TODO SIMULATION
                    if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                        checkPass = true;
                    }
                    WriteQue_ConditionCode.app_FUNCT_write_Start(2);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION
                    System.out.printf("thread " + threadId + " :: SIM OUT =>%n");//TODO SIMULATION

                } else {
                    if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                        checkPass = true;
                    }
                    WriteQue_ConditionCode.app_FUNCT_write_Start(2);
                    System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
                }
            }
            else {
                if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                    checkPass = true;
                }
                WriteQue_ConditionCode.app_FUNCT_write_Start(2);
                System.out.printf("thread " + threadId + " :: WriteQue : CC : open access @ 2%n");//todo SIMULATION
                checkPass = true;
            }
        }
    }
    public static void Terminatestat_REG_scanner() {
        stat_REG_scanner.close();
    }
    public boolean dyn_REG_get_FLAG_isSimulationComplete()//todo SIMULATION
    {
        boolean result = true;
        for(int i=0; i < 4; i++) {
            if(!_SIMstat_REG_PraiseStarted[i]) {
                result = false;
                break;
            }
            if(!_SIMstat_REG_PraiseComplete[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public void dyn_REG_boot1_DEFINE__SIMULATION() {
        stat_REG_boot1_DEFINE__SIMULATION();
    }
    public void dyn_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION(sample);
    }
    public void dyn_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION(sample);
    }
    public void stat_REG_boot1_DEFINE__SIMULATION() {
        stat_CLASS_boot1_DEFINE_SIMULATION_stat_REG_input_Sample();
    }
    private static void stat_CLASS_boot1_DEFINE_SIMULATION_stat_REG_input_Sample() {
        _SIMstat_REG_input_Sample = null;
    }
    public void stat_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIMstat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIMstat_REG_input_Sample(Input sample) {
        sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIMstat_REG_input_Sample = sample;
    }
    public void stat_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION__SIMstat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot3_INITIALISE__SIMULATION__SIMstat_REG_input_Sample(Input sample) {
        _SIMstat_REG_input_Sample = sample;
    }
}