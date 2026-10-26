# Import / Export Wrapper(s).
---
---
---
## Client.
---
---
### Native C++ Libraries.
---
#### zinc::MutexQue:
##### Header.
````
#ifndef CLIB_CLIB_PACKAGE_MUTEXQUE_H
#define CLIB_CLIB_PACKAGE_MUTEXQUE_H
#include "../../include/CLIB_MutexQue_Framework.h"
#include <array>
#include <cstdint>
#include <list>
extern "C" {
    namespace zinc {
        class MutexQue {
        public:
            static void endByUnlock(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_ACCESS_ID);
            static unsigned char* generateHandle(uint8_t* sysThreadId);
            static void generateProgram(uint8_t* sysThreadId);
            static unsigned char* isINSTANTIATED(uint8_t* sysThreadId);
            static void reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_MAX_NUMBER_OF_THREADS_FOR_ACCESS);
            static void startByLock(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_ACCESS_ID);
            static void terminateProgram(uint8_t* sysThreadId, unsigned char* handleId);
        private:
            static void CLIB_MutexQue_App_FUNCT_generate_Program(uint8_t* sysThreadId);
            static bool CLIB_MutexQue_stat_APP_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_MutexQue_stat_PGM_boot1_DEFINE_array_of_ptr_Framework(uint8_t* sysThreadId);
            static void CLIB_MutexQue_stat_PGM_boot3_INITIALISE_array_of_ptr_Framework(uint8_t* sysThreadId);
            static void CLIB_MutexQue_stat_boot1_DEFINE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_MutexQue_stat_REG_boot2_SUBSTANTIATE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_MutexQue_stat_REG_boot3_INITIALISE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static std::array<bool, 5>* CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static std::list<void*>* CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(uint8_t* sysThreadId);
            static CLIB_MutexQue_Framework* CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(uint8_t* sysThreadId, int* handleId);
        };
    }
}
#endif
````
##### source.
````
#include "../../../CLIB_MutexQue/io/include/CLIB_MutexQue.h"
#include "../../include/CLIB_MutexQue_Framework.h"
#include "../../include/CLIB_MutexQue_Framework_App.h"
#include "../../include/CLIB_MutexQue_Framework_App_Control.h"
#include "../../include/CLIB_MutexQue_Framework_Global.h"
#include <iostream>
#include <thread>
	static std::list<void*>* stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue;//todo number of data clusters.
	static std::array<bool, 5>* stat_REG_ptr_CLIB_MutexQue_array_of_array_of_isMemberFunctionINSTANTIATED;//todo number of data clusters.
// public.
	void zinc::MutexQue::endByUnlock(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_ACCESS_ID) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : unlock(sysThreadId)" << std::endl;
		if (!CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
			CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_APP_FUNCT_write_End(sysThreadId, zinc::MutexQue::CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), bytes_ACCESS_ID);
			CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_set_FLAG_CLIB_MutexQue_Framework_App_Control_isWriteEndThreadRELASE_REMAINING(sysThreadId, true);
			CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_set_FLAG_CLIB_MutexQue_Framework_App_Control_isWriteStartThreadRELASE_REMAINING(sysThreadId, true);
		}
		else {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(3) = !CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : unlock(sysThreadId)" << std::endl;
	}
	unsigned char* zinc::MutexQue::generateHandle(uint8_t* sysThreadId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : generateHandle(sysThreadId)" << std::endl;
		auto handleId = new int();
		CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->resize(static_cast<uint8_t>(CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->size()+1));
		CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->assign(CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->size(), *CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->begin());
		*handleId = static_cast<int>(CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->size() - 1);
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : generateHandle(sysThreadId)" << std::endl;
		return CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, handleId);
	}
	 void zinc::MutexQue::generateProgram(uint8_t* sysThreadId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : generateProgram(sysThreadId)" << std::endl;
		CLIB_MutexQue_stat_REG_boot2_SUBSTANTIATE_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
	 	CLIB_MutexQue_stat_REG_boot3_INITIALISE_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
	 	CLIB_MutexQue_stat_PGM_boot1_DEFINE_array_of_ptr_Framework(sysThreadId);
		CLIB_MutexQue_stat_PGM_boot3_INITIALISE_array_of_ptr_Framework(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : generateProgram(sysThreadId)" << std::endl;

	}
	unsigned char* zinc::MutexQue::isINSTANTIATED(uint8_t* sysThreadId)	{
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : isINSTANTIATED(sysThreadId)" << std::endl;
		bool* result = nullptr;
		result = new bool(sysThreadId);
		*result = true;
		if (!CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
			*result = CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
		}
		else {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(1) = !CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : isINSTANTIATED(sysThreadId)" << std::endl;
		return zinc::CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
	}
	void zinc::MutexQue::reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_MAX_NUMBER_OF_THREADS_FOR_ACCESS) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : reInitialiseHandle(sysThreadId)" << std::endl;
		auto temp = CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->begin();
		std::advance(temp, *handleId);
		const auto tempObj = static_cast<CLIB_MutexQue_Framework*>(*temp);
		tempObj->dyn_CLASS_get_ptr_CLIB_MutexQue_Global(sysThreadId)->stat_REG_set_ptr_CLIB_MutexQue_number_Of_Implemented_Threads(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_MAX_NUMBER_OF_THREADS_FOR_ACCESS));
		tempObj->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_boot3_REINITIALISE_CLIB_MutexQue_Framework_App_Control_For_New_Access_Count(sysThreadId, tempObj);
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : reInitialiseHandle(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::startByLock(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_ACCESS_ID) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : lock(sysThreadId)" << std::endl;
		if (!CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
			CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_APP_FUNCT_write_Start(sysThreadId, zinc::MutexQue::CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), bytes_ACCESS_ID);
		}
		else {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(4) = !CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : lock(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::terminateProgram(uint8_t* sysThreadId, unsigned char* handleId)	{
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : terminateProgram(sysThreadId)" << std::endl;
		if (!CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
			delete stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue;
			delete stat_REG_ptr_CLIB_MutexQue_array_of_array_of_isMemberFunctionINSTANTIATED;
		}
		else {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(2) = !CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : terminateProgram(sysThreadId)" << std::endl;
	}
// private.
	void zinc::MutexQue::CLIB_MutexQue_App_FUNCT_generate_Program(uint8_t* sysThreadId) {
		auto handleId = new int(0);
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_App_FUNCT_generate_Program(sysThreadId)" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started CLIB_OpenEpiCentre_Global Meta-Data and Settings" << std::endl;
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_create_CLIB_MutexQue_Global_and_Settings(sysThreadId);
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_Global(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_MutexQue_Global(sysThreadId);
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_Global(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_MutexQue_Global(sysThreadId);
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_Global(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_MutexQue_Global(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done CLIB_OpenEpiCentre_Global Meta-Data and Settings" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Independent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Independent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_create_CLIB_MutexQue_Architecture(sysThreadId);

		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Registers - DEFINE" << std::endl;
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_MutexQue_Framework_App_Control(sysThreadId, CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId));
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Registers - DEFINE" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Registers - SUBSTANTIATE" << std::endl;
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_MutexQue_Framework_App_Control(sysThreadId,CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId));
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Registers - SUBSTANTIATE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Registers - INITIALISE" << std::endl;
		CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App(sysThreadId)->dyn_CLASS_get_ptr_CLIB_MutexQue_App_Control(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_MutexQue_Framework_App_Control(sysThreadId,CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId, handleId));
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Registers - INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture array_of_array_of_isMemberFunctionINSTANTIATED REG - DECLARE DEFINE INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture array_of_array_of_isMemberFunctionINSTANTIATED REG - DECLARE DEFINE INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "        ,     \\      /      ," << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "       / \\    )\\ __ /(     / \\ " << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|              |\\../|               |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|               \\VV/                |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|     MIT Custom Mutex Que .dll      |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|___________________________________|" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|  /    V          ))        V   \\  |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|/                //               \\|"  << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "`                 V                 '" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_App_FUNCT_generate_Program(sysThreadId)" << std::endl;
	}
	bool zinc::MutexQue::CLIB_MutexQue_stat_APP_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId) {
		CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0) = false;
		for(int index = 1; index < 5; index++) {
			if (CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(index)) {
				CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0) = CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(index);
				break;
			}
		}
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: <= bool : CLIB_MutexQue_stat_APP_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId)" << std::endl;
		return CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
	}
	void zinc::MutexQue::CLIB_MutexQue_stat_PGM_boot1_DEFINE_array_of_ptr_Framework(uint8_t* sysThreadId) {
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_PGM_boot1_DEFINE_array_of_ptr_Framework(sysThreadId)" << std::endl;
		stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue = nullptr;
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_PGM_boot1_DEFINE_array_of_ptr_Framework(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::CLIB_MutexQue_stat_PGM_boot3_INITIALISE_array_of_ptr_Framework(uint8_t* sysThreadId) {
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_PGM_boot3_INITIALISE_array_of_ptr_Framework(sysThreadId)" << std::endl;
		auto handleId = new int(0);
		stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue = new std::list<void*>();
		CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->resize(1);
		CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(sysThreadId)->assign(*handleId, new class zinc::CLIB_MutexQue_Framework(sysThreadId));
		CLIB_MutexQue_App_FUNCT_generate_Program(sysThreadId);
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_PGM_boot3_INITIALISE_array_of_ptr_Framework(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::CLIB_MutexQue_stat_boot1_DEFINE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_boot1_DEFINE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
		stat_REG_ptr_CLIB_MutexQue_array_of_array_of_isMemberFunctionINSTANTIATED = nullptr;
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_boot1_DEFINE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::CLIB_MutexQue_stat_REG_boot2_SUBSTANTIATE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_REG_boot2_SUBSTANTIATE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
		stat_REG_ptr_CLIB_MutexQue_array_of_array_of_isMemberFunctionINSTANTIATED = new std::array<bool, 5>();
		for (uint8_t memberFunctionId = 0; memberFunctionId < static_cast<uint8_t>(CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->size()); memberFunctionId++) {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(memberFunctionId) = true;
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_REG_boot2_SUBSTANTIATE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
	}
	void zinc::MutexQue::CLIB_MutexQue_stat_REG_boot3_INITIALISE_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_REG_boot3_INITIALISE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
		for (uint8_t memberFunctionId = 0; memberFunctionId < static_cast<uint8_t>(CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->size()); memberFunctionId++) {
			CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(sysThreadId)->at(memberFunctionId) = true;
		}
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_stat_REG_boot3_INITIALISE_array_of_isMemberFunctionINSTANTIATED(sysThreadId)" << std::endl;
	}
	std::array<bool, 5>* zinc::MutexQue::CLIB_MutexQue_stat_REG_get_array_of_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
		return stat_REG_ptr_CLIB_MutexQue_array_of_array_of_isMemberFunctionINSTANTIATED;
	}
	std::list<void*>* zinc::MutexQue::CLIB_MutexQue_stat_PGM_get_array_of_ptr_CLIB_MutexQue(uint8_t* sysThreadId) {
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: <= std::list<void*>* : CLIB_MutexQue_stat_PGM_get_array_of_ptr_MutexQue(sysThreadId)." << std::endl;
		return stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue;
	}
	zinc::CLIB_MutexQue_Framework* zinc::MutexQue::CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(uint8_t* sysThreadId, int* handleId)	{
		auto temp = stat_REG_ptr_CLIB_MutexQue_array_of_ptr_MutexQue->begin();
		std::advance(temp, *handleId);
	 	std::cout << "thread " << std::to_string(*sysThreadId) << " :: <= class : CLIB_MutexQue_stat_PGM_get_ptr_CLIB_MutexQue(sysThreadId)." << std::endl;
		return static_cast<zinc::CLIB_MutexQue_Framework*>(*temp);
	}
````

### Native C++ Libraries.
---
#### zinc::LaunchQue:
##### Header.
````
#ifndef CLIB_LAUNCHQUEENDS_LAUNCHENABLEFORCONCURRENTTHREADSAT_ENDS_H
#define CLIB_LAUNCHQUEENDS_LAUNCHENABLEFORCONCURRENTTHREADSAT_ENDS_H
#include "../../include/CLIB_LaunchQue_Framework.h"
#include <array>
#include <cstdint>
extern "C" {
    namespace zinc {
        class LaunchQue {
        public:
            static int* generateHandle(uint8_t* sysThreadId);
            static void generateProgram(uint8_t* sysThreadId);
            static unsigned char* get_coreIdTolaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static unsigned char* get_FlagSTATEisActive(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static unsigned char* get_FlagSTATEofConcurrentCore(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static unsigned char* get_FlagisIdle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static unsigned char* get_FlagSTATEofThreadToLaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static unsigned char* isINSTANTIATED(uint8_t* sysThreadId);
            static void reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId, uint8_t* MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
            static void set_FlagSTATEofConcurrentCore(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId, unsigned char* byteBool);
            static void terminateProgaram(uint8_t* sysThreadId);
            static void threadRequestlaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
            static void threadEnd(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId);
        private:
            static int* stat_REG_HandleId_For_PGM_CLIBMutexQue;
            static void CLIB_LaunchQue_generateProgram(uint8_t* sysThreadId);
            static void CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_LaunchQue_stat_boot1_CLASS_DEFINE_List_Of_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId);
            static void CLIB_LaunchQue_stat_boot3_CLASS_INITIALISE_List_Of_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId);
            static std::list<class zinc::CLIB_LaunchQue_Framework*>* CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(uint8_t* sysThreadId);
            static class zinc::CLIB_LaunchQue_Framework* CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId, int* handleId);
            static void CLIB_LaunchQue_stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_LaunchQue_stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static void CLIB_LaunchQue_stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
            static std::array<bool, 12>* CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId);
        };
    }
}
#endif
````
##### source.
````
#include "../include/CLIB_LaunchQue.h"
#include "../../../CLIB_ThreadsLog/io/include/CLIB_ThreadLogs.h"
#include "../../../CLIB_MutexQue/io/include/CLIB_MutexQue.h"
#include "../../include/CLIB_LaunchQue_Framework_App.h"
#include "../../include/CLIB_LaunchQue_Framework_App_Control.h"
#include "../../include/CLIB_LaunchQue_Framework_Execute.h"
#include "../../include/CLIB_LaunchQue_Framework_Global.h"
#include <thread>
static std::list<zinc::CLIB_LaunchQue_Framework*>* stat_REG_List_Of_PGM_CLIB_LaunchQue;
    static std::array<bool, 12>* stat_REG_Flag_CLIB_LaunchQue_isMemberFunctionINSTANTIATED;
    uint8_t* accessId = new uint8_t(0);
// public.
    int* zinc::LaunchQue::generateHandle(uint8_t* sysThreadId) {
        auto result = new int();
        for (auto accessThreadId_launchQue = new int(0); *accessThreadId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); accessThreadId_launchQue++) {
            zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, accessThreadId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, accessThreadId_launchQue));
        }
        std::cout << "thread " << std::to_string(*sysThreadId) << "  :: entered LIB :: CLIB : LaunchQue : generateHandle(sysThreadId)" << std::endl;
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->resize(static_cast<uint8_t>(CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->size()+1));
            CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->assign(CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->size(), *CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->begin());
            *result = static_cast<int>(static_cast<int>(CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->size() - 1));
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(1) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        std::cout << "thread " << std::to_string(*sysThreadId) << "  :: exiting LIB :: CLIB : LaunchQue : generateHandle(sysThreadId)" << std::endl;
        for (auto accessThreadId_launchQue = new int(0); *accessThreadId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); accessThreadId_launchQue++) {
            zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, accessThreadId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, accessThreadId_launchQue));
        }
        return result;
    }
    void zinc::LaunchQue::generateProgram(uint8_t* sysThreadId) {
        CLIB_LaunchQue_stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
        CLIB_LaunchQue_stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
        CLIB_LaunchQue_stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
        CLIB_LaunchQue_stat_boot1_CLASS_DEFINE_List_Of_PGM_CLIB_LaunchQue_Framework(sysThreadId);
        CLIB_LaunchQue_stat_boot3_CLASS_INITIALISE_List_Of_PGM_CLIB_LaunchQue_Framework(sysThreadId);
    }
    unsigned char* zinc::LaunchQue::get_coreIdTolaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        uint8_t* result = nullptr;
        result = new uint8_t(UINT8_MAX);
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            result = CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_for_Que_Of_CoreTolaunch(sysThreadId, 0);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(2) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, result);
    }
    unsigned char* zinc::LaunchQue::get_FlagSTATEisActive(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        bool* result = nullptr;
        result = new bool(true);
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            *result = CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_Global(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Framework_Global_ptr_FLAG_thread_2STATE_ACTIVE(sysThreadId);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(3) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
    }
    unsigned char* zinc::LaunchQue::get_FlagSTATEofConcurrentCore(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        bool* result = nullptr;
        result = new bool(true);
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            *result = CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_Of_STATE_For_ConcurrentCore(sysThreadId, zinc::CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(4) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
    }
    unsigned char* zinc::LaunchQue::get_FlagisIdle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        bool* result = nullptr;
        result = new bool(true);
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            *result = CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_Of_STATE_For_ConcurrentCore(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_for_Que_Of_CoreTolaunch(sysThreadId, 0)));
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(6) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
    }
    unsigned char* zinc::LaunchQue::get_FlagSTATEofThreadToLaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        bool* result = nullptr;
        result = new bool(true);
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            *result = CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_Of_STATE_For_ConcurrentCore(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_get_CLIB_LaunchQue_Item_On_list_for_Que_Of_CoreTolaunch(sysThreadId, 0));
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(6) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
    }
    unsigned char* zinc::LaunchQue::isINSTANTIATED(uint8_t* sysThreadId)	{
        for (auto handleId_launchQue = new int(0); *handleId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); handleId_launchQue++) {
            zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, 0));
        }
        std::cout << "thread " << std::to_string(*sysThreadId) << "  :: entered LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_App_FUNCT_get_FLAG_isPGM_INSTANTIATED(sysThreadId)" << std::endl;
        bool* result = nullptr;
        result = new bool(sysThreadId);
        *result = true;
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            *result = CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(7) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId);
        }
        std::cout << "thread " << std::to_string(*sysThreadId) << "  :: exiting LIB :: CLIB : CLIB_MutexQue : CLIB_MutexQue_App_FUNCT_get_FLAG_isPGM_INSTANTIATED(sysThreadId)" << std::endl;
        for (auto handleId_launchQue = new int(0); *handleId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); handleId_launchQue++) {
            zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, 0));
        }
        return zinc::CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *result);
    }
    void zinc::LaunchQue::reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId, uint8_t* MAX_NUMBER_OF_CONCURRENT_TASK_THREADS) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            auto temp = CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->begin();
            std::advance(temp, *handleId);
            auto tempObj = *temp;
            tempObj->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_Global(sysThreadId)->dyn_REG_set_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId, MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
            tempObj->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LaunchQue_Framework_App_Control_For_New_Count(sysThreadId);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(8) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
    }
    void zinc::LaunchQue::set_FlagSTATEofConcurrentCore(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytessysThreadId, unsigned char*  bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_set_CLIB_LaunchQue_Item_On_list_Of_STATE_For_ConcurrentCore(sysThreadId, zinc::CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytessysThreadId), bytes_concurrentThreadId);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(9) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
    }
    void zinc::LaunchQue::terminateProgaram(uint8_t* sysThreadId) {
        for (auto handleId_launchQue = new int(0); *handleId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); handleId_launchQue++) {
            zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, 0));
        }
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            delete stat_REG_List_Of_PGM_CLIB_LaunchQue;
            delete stat_REG_Flag_CLIB_LaunchQue_isMemberFunctionINSTANTIATED;
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(10) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        for (auto handleId_launchQue = new int(0); *handleId_launchQue < static_cast<int>(*CLIB_LaunchQue_Framework_Global::stat_REG_get_CLIB_LaunchQue_Framework_Global_number_Implemented_Threads(sysThreadId)); handleId_launchQue++) {
            zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId_launchQue)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, 0));
        }
    }
    void zinc::LaunchQue::threadRequestlaunch(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
            if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
                CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_APP_FUNCT_CLIB_LaunchQue_thread_Start(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), zinc::CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
            }
            else {
                CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(11) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
                CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
            }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        }
    void zinc::LaunchQue::threadEnd(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_concurrentThreadId) {
        zinc::MutexQue::startByLock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
        if (!CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0)) {
            CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_APP_FUNCT_CLIB_LaunchQue_thread_End(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), bytes_concurrentThreadId);
        }
        else {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(12) = !CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0);
            CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
        }
        zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_REG_get_HandleId_For_PGM_CLIBMutexQue(sysThreadId)), CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_MsbByteArray_To_VUALUEofMsbuint8_t(sysThreadId, bytes_concurrentThreadId));
    }
// private.
    void zinc::LaunchQue::CLIB_LaunchQue_generateProgram(uint8_t* sysThreadId) {
        auto handleId = new int(0);
		std::cout << "thread " << std::to_string(*sysThreadId) << " entered app_FUNCT_generate_Program(sysThreadId)" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " started CLIB_LaunchQue_Framework_Global Meta-Data and Settings" << std::endl;
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_create_CLIB_LaunchQue_Framework_Global_and_Settings(sysThreadId);
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_Global(sysThreadId)->boot1_REG_DEFINE_CLIB_LaunchQue_Framework_Global(sysThreadId);
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_Global(sysThreadId)->boot2_REG_SUBSTANTIATE_CLIB_LaunchQue_Framework_Global(sysThreadId);
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_Global(sysThreadId)->boot3_REG_INITIALISE_CLIB_LaunchQue_Framework_Global(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId));
		std::cout << "thread " << std::to_string(*sysThreadId) << " done CLIB_LaunchQue_Framework_Global Meta-Data and Settings" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " started IndepENDSent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " done IndepENDSent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " started Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;
        CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_create_Architecture(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " started Registers - DEFINE" << std::endl;

		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LaunchQue_Framework_App_Control(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " done Registers - DEFINE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " started Registers - SUBSTANTIATE" << std::endl;
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LaunchQue_Framework_App_Control(sysThreadId, CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId));
		std::cout << "thread " << std::to_string(*sysThreadId) << " done Registers - SUBSTANTIATE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " started Registers - INITIALISE" << std::endl;
		CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_App_Control(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LaunchQue_Framework_App_Control(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " done Registers - INITIALISE" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " done Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE" << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << " started Program - INSTANTIATION" << std::endl;
		CLIB_LaunchQue_stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
		CLIB_LaunchQue_stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
		CLIB_LaunchQue_stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED(sysThreadId);
        CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(sysThreadId, handleId)->dyn_CLASS_get_ptr_CLIB_LaunchQue_Framework_App(sysThreadId)->dyn_CLASS_get_CLIB_LaunchQue_Framework_Execute(sysThreadId)->dyn_PGM_boot4_INSTANTIATE_CLIB_LaunchQue_Framework_Execute(sysThreadId);
		std::cout << "thread " << std::to_string(*sysThreadId) << " done Program - INSTANTIATION" << std::endl;

        std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "        ,     \\      /      ," << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "       / \\    )\\ __ /(     / \\ " << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|              |\\../|               |" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|               \\VV/                |" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|        MIT Launch Que .dll        |" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|___________________________________|" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|  /    V          ))        V   \\  |" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "|/                //               \\|"  << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "`                 V                 '" << std::endl;
        std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_app_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId) {
        CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0) = false;
        for (int memberFunctionId = 1; memberFunctionId < sizeof(*CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)); memberFunctionId++) {
            if (CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(memberFunctionId)) {
                CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(0) = CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(memberFunctionId);
                break;
            }
        }
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_boot1_CLASS_DEFINE_List_Of_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId) {
        stat_REG_List_Of_PGM_CLIB_LaunchQue = nullptr;
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_boot3_CLASS_INITIALISE_List_Of_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId) {
        auto handleId = new int(0);
        stat_REG_List_Of_PGM_CLIB_LaunchQue = new std::list<zinc::CLIB_LaunchQue_Framework*>;
        while (CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId) == nullptr) {}
        CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->resize(1);
        CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(sysThreadId)->assign(*handleId, new class zinc::CLIB_LaunchQue_Framework(sysThreadId));
        CLIB_LaunchQue_generateProgram(sysThreadId);
    }
    std::list<zinc::CLIB_LaunchQue_Framework*>*  zinc::LaunchQue::CLIB_LaunchQue_stat_REG_get_ptr_List_Of_PGM_CLIB_LaunchQue(uint8_t* sysThreadId) {
        return stat_REG_List_Of_PGM_CLIB_LaunchQue;
    }
    zinc::CLIB_LaunchQue_Framework* zinc::LaunchQue::CLIB_LaunchQue_stat_CLASS_get_ptr_PGM_CLIB_LaunchQue_Framework(uint8_t* sysThreadId, int* handleId) {
        auto temp = stat_REG_List_Of_PGM_CLIB_LaunchQue->begin();
        std::advance(temp, *handleId);
        return *temp;
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
        stat_REG_Flag_CLIB_LaunchQue_isMemberFunctionINSTANTIATED = nullptr;
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
        stat_REG_Flag_CLIB_LaunchQue_isMemberFunctionINSTANTIATED = new std::array<bool, 12>();
        while (CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId) == nullptr) { }
        for (int index = 0; index < CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->size(); index++) {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(index) = true;
        }
    }
    void zinc::LaunchQue::CLIB_LaunchQue_stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
        for (int index = 0; index < CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->size(); index++) {
            CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(sysThreadId)->at(index) = true;
        }
    }
    std::array<bool, 12>* zinc::LaunchQue::CLIB_LaunchQue_stat_REG_get_ptr_FLAG_Array_isMemberFunctionINSTANTIATED(uint8_t* sysThreadId) {
        return stat_REG_Flag_CLIB_LaunchQue_isMemberFunctionINSTANTIATED;
    }

````

---
### Java
#### Imports.
##### Java_zinc_control_launch_que.java.
````
package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
public interface Java_zinc_control_launch_que extends Library {
    Java_zinc_control_launch_que INSTANCE = (Java_zinc_control_launch_que) Native.load("libzinc_control_launch_que", Java_zinc_control_launch_que.class);
    byte[] generateHandle(byte sysThreadId);
    void generateProgram(byte sysThreadId);
    byte[] get_coreIdTolaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    byte[] get_FlagSTATEisActive(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    byte[] get_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    byte[] get_FlagisIdle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    byte[] get_FlagSTATEofThreadToLaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    byte[] isINSTANTIATED(byte sysThreadId);
    void reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
    void set_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte[] byteBool);
    void terminateProgaram(byte sysThreadId);
    void threadRequestlaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
    void threadEnd(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId);
}
````

##### Java_zinc_control_mutex_que.java.
````
package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
public interface Java_zinc_control_mutex_que extends Library {
    Java_zinc_control_mutex_que INSTANCE = (Java_zinc_control_mutex_que) Native.load("libzinc_control_mutex_que", Java_zinc_control_mutex_que.class);
    void endByUnlock(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID);
    byte[] generateHandle(byte sysThreadId);
    void generateProgram(byte sysThreadId);
    byte[] isINSTANTIATED(byte sysThreadId);
    void reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_MAX_NUMBER_OF_THREADS_FOR_ACCESS);
    void startByLock(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID);
    void terminateProgram(byte sysThreadId, byte[] handleId);
}
````

#### Library IO.
##### MutexQue.
````

````

##### LaunchQue.
````
package main.IO;
import libs.Java_zinc_control_launch_que;
public class LaunchQue {
    public static byte[] generateHandle(byte sysThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.generateHandle(sysThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.generateHandle(sysThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.generateHandle(sysThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.generateHandle(sysThreadId)%n");
        }
        return result;
    }
    public void generateProgram(byte sysThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.generateProgram(sysThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.generateProgram(sysThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.generateProgram(sysThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.generateProgram(sysThreadId)%n");
        }
    }
    public static byte[] get_coreIdTolaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
             throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEisActive(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagisIdle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEofThreadToLaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] isINSTANTIATED(byte sysThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(sysThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
        }
        return result;
    }
    public void reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS) {
        try {
            Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(sysThreadId, handleId, bytes_concurrentThreadId, MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        }
    }
    public void set_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte[] byteBool) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(sysThreadId, handleId, bytes_concurrentThreadId, byteBool);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte[] byteBool)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte[] byteBool)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte[] byteBool)%n");
        }
    }
    public void terminateProgaram(byte sysThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.terminateProgaram(sysThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.terminateProgaram(byte sysThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.terminateProgaram(byte sysThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.terminateProgaram.generateProgram(byte sysThreadId)%n");
        }
    }
    public void threadRequestlaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
    }
    public void threadEnd(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.threadEnd(sysThreadId, handleId, bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId)%n");
        }
    }
}
````


