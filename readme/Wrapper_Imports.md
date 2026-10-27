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
            static unsigned char* generateHandle(uint8_t* sysThreadId);
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
    unsigned char* zinc::LaunchQue::generateHandle(uint8_t* sysThreadId) {
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
        return CLIB_LaunchQue_Framework_Global::stat_CONVERT_CLIB_LaunchQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, result);
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

### Native C++ Libraries.
---
#### zinc::Epicentre:
##### Header.
````
#ifndef CLIB_LEFTHEMISPHORE_H
#define CLIB_LEFTHEMISPHORE_H
#include <array>
#include <cstdint>
#include <list>
#include "../../include/engine/CLIB_LeftHemishpore_Framework.h"
extern "C" {
	namespace zinc {
		class Epicentre {
		public:
			static unsigned char* gernerateHandle(uint8_t* sysThreadId);
			static void generateProgram(uint8_t* sysThreadId);
			static unsigned char* get_Output(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_praiseId);
			static unsigned char* get_FLAG_isINITIALISED(uint8_t* sysThreadId, unsigned char* handleId);
			static unsigned char* get_FLAG_isINSTANTIATED(uint8_t* sysThreadId);
			static unsigned char* get_FLAG_isStackLoaded_ServerInputReceive(uint8_t* sysThreadId, unsigned char* handleId);
			static unsigned char* get_FLAG_isStackLoaded_ServerOutputSend(uint8_t* sysThreadId, unsigned char* handleId);
			static unsigned char* get_MetaData_PraiseEventId(uint8_t* sysThreadId, unsigned char* handleId);
			static void set_InputItemsFor_praise0(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B);
			static void set_InputItemsFor_praise1(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B);
			static void set_InputItemsFor_praise2(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B);
			static void set_InputItemsFor_praise3(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B);
			static void set_MetaData_PraiseEventId(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId);
			static void reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, uint8_t* NUMBER_OF_TASK_THREADS);
			static void terminateProgram(uint8_t* sysThreadId);
		private:
			static void stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* obj, unsigned char* handleId, unsigned char* bytesPraiseId);
			static void stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* obj, unsigned char* handleId, unsigned char* bytesPraiseId);
			static void CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId);
			static void CLIB_LeftHemishpore_stat_CLASS_boot1_DEFINE_Framework(uint8_t* sysThreadId);
			static void CLIB_LeftHemishpore_stat_CLASS_boot3_INITIALISE_Framework(uint8_t* sysThreadId);
			static class CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(uint8_t* sysThreadId, int* handleId);
			static std::list<zinc::CLIB_LeftHemishpore_Framework*>* CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(uint8_t* sysThreadId);
			static void CLIB_LeftHemishpore_stat_REG_boot1_DEFINE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId);
			static void CLIB_LeftHemishpore_stat_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId);
			static void CLIB_LeftHemishpore_stat_REG_boot3_INITIALISE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId);
			static std::array<bool, 15>* CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(uint8_t* sysThreadId);
		};
	}
}
#endif
````
##### source.
````
#include "../include/CLIB_LeftHemishpore.h"
#include "../../../Control/libs/CLIB_MutexQue/io/include/CLIB_MutexQue.h"
#include "../../include/engine/CLIB_LeftHemishpore_Framework_App.h"
#include "../../include/engine/CLIB_LeftHemishpore_Framework_Global.h"
#include "../../include/independent/CLIB_LeftHemishpore_STRUCT_Input.h"
#include "../../include/independent/CLIB_LeftHemishpore_STRUCT_Output.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Input_praise0.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Input_praise1.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Input_praise2.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Input_praise3.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Output_praise0.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Output_praise1.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Output_praise2.h"
#include "../../include/independent/praise_sets/CLIB_LeftHemishpore_STRUCT_Output_praise3.h"
#include <string>
#include <iostream>
	static std::list<zinc::CLIB_LeftHemishpore_Framework*>* stat_CLASS_CLIB_LeftHemishpore_Framework = nullptr;
	static std::array<bool, 15>* stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Input_praise0* objInputSUBSET_praise0 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Input_praise1* objInputSUBSET_praise1 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Input_praise2* objInputSUBSET_praise2 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Input_praise3* objInputSUBSET_praise3 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Output_praise0* objOutputSUBSET_praise0 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Output_praise1* objOutputSUBSET_praise1 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Output_praise2* objOutputSUBSET_praise2 = nullptr;
	static struct zinc::CLIB_LeftHemishpore_STRUCT_Output_praise3* objOutputSUBSET_praise3 = nullptr;
	static uint8_t* threadAccessId_Of_injection = new uint8_t(0);
	static uint8_t* threadAccessId_Of_extraction = new uint8_t(0);
// public
	unsigned char* zinc::Epicentre::gernerateHandle(uint8_t* sysThreadId) {
		for ( int* index_handleId = new int(1); *index_handleId < CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size(); index_handleId++) {
			zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
			zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc :  : gernerateHandle(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))." << std::endl;
		auto handleId = new int();
		auto adjustSize = new int(1);
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			auto newSize = CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size() + *adjustSize;
			auto defaultPGM = CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->begin();
			CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->resize(static_cast<uint8_t>(newSize));
			CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->assign(newSize, *defaultPGM);
			*handleId = static_cast<int>(CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size() - *adjustSize);
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : generateHandle(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))" << std::endl;
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(1) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		for ( int* index_handleId = new int(1); *index_handleId < CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size(); index_handleId++) {
			zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
			zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
		}
		return CLIB_MutexQue_Framework_Global::stat_CONVERT_CLIB_MutexQue_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, handleId);
	}
	void zinc::Epicentre::generateProgram(uint8_t* sysThreadId) {
		auto handleId = new unsigned char();
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : generateProgram(uint8_t* sysThreadId)." << std::endl;
			handleId = CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, new int(0));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Framework CLASS - DECLARE DEFINE INITIALISE." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_boot1_DEFINE_Framework(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_boot3_INITIALISE_Framework(sysThreadId);
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Framework CLASS - DECLARE DEFINE INITIALISE." << std::endl;

			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started CLIB_LeftHemishpore_Framework_Global Meta-Data and Settings." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_create_CLIB_LeftHemishpore_Framework_Global_and_Settings(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_Global(sysThreadId)->stat_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_Global(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_Global(sysThreadId)->stat_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_Global(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_Global(sysThreadId)->stat_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_Global(sysThreadId);
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done CLIB_LeftHemishpore_Framework_Global Meta-Data and Settings." << std::endl;

			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started independent Generate." << std::endl;
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Independent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot1_DEFINE_CLIB_LeftHemishpore_Framework_User_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_User_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Input(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_STRUCT_UserInput(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Input(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_STRUCT_UserInput(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Input(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_STRUCT_UserInput(sysThreadId);

			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot1_DEFINE_CLIB_LeftHemishpore_Framework_User_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_User_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Output(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_STRUCT_UserOutput(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Output(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_STRUCT_UserOutput(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Output(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_STRUCT_UserOutput(sysThreadId);

			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_User_Algorithm(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_User_Algorithm(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Algorithm(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_STRUCT_UserAlgorithm(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Algorithm(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_STRUCT_UserAlgorithm(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_User_Algorithm(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_STRUCT_UserAlgorithm(sysThreadId);

			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot1_DEFINE_CLIB_LeftHemishpore_Framework_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Input(sysThreadId)->dyn_REG_boot1_DEFINE_LeftHemishpore_STRUCT_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Input(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_LeftHemishpore_STRUCT_Input(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Input(sysThreadId)->dyn_REG_boot3_INITIALISE_LeftHemishpore_STRUCT_Input(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));

			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot1_DEFINE_CLIB_LeftHemishpore_Framework_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Output(sysThreadId)->dyn_REG_boot1_DEFINE_LeftHemishpore_STRUCT_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Output(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_LeftHemishpore_STRUCT_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Output(sysThreadId)->dyn_REG_boot3_INITIALISE_LeftHemishpore_STRUCT_Output(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));

			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot1_DEFINE_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId)->dyn_REG_boot1_DEFINE_Concurrent(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_Concurrent(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId)->dyn_REG_boot3_INITIALISE_Concurrent(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Independent STRUCT(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE." << std::endl;

			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_create_CLIB_LeftHemishpore_Framework_Architecture(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Registers - DEFINE" << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_App(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Algorithms(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Algorithm(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_App_Data(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_App_Execute(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId)->dyn_REG_boot1_DEFINE_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture Registers - DEFINE." << std::endl;
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Registers - SUBSTANTIATE." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_App(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Algorithms(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Algorithm(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_App_Data(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_App_Execute(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId)->dyn_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture Registers - SUBSTANTIATE." << std::endl;
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Architecture Registers - INITIALISE." << std::endl;
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_App(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Algorithms(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Algorithm(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Concurrent(sysThreadId));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_App_Data(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Input(sysThreadId), CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Output(sysThreadId));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_App_Execute(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId)->dyn_REG_boot3_INITIALISE_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture Registers - INITIALISE." << std::endl;
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Architecture Application CLASS(s) - DECLARE DEFINE INITIALISE, Registers - DECLARE SUBSTANTIATE INITIALISE." << std::endl;

			std::cout << "thread " << std::to_string(*sysThreadId) << " :: started Program - INSTANTIATE." << std::endl;
			CLIB_LeftHemishpore_stat_REG_boot1_DEFINE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(sysThreadId);
			CLIB_LeftHemishpore_stat_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(sysThreadId);
			CLIB_LeftHemishpore_stat_REG_boot3_INITIALISE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(sysThreadId);
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: done Program - INSTANTIATE." << std::endl;

		std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "        ,     \\      /      ," << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "       / \\    )\\ __ /(     / \\ " << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|              |\\../|               |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|               \\VV/                |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|         MIT Epicentre .dll         |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|___________________________________|" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|  /    V          ))        V   \\  |" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "|/                //               \\|"  << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "`                 V                 '" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << "" << std::endl;
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : CLIB_LeftHemishpore_Framework_App_FUNCT_generate_Program(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))" << std::endl;
	}
	unsigned char* zinc::Epicentre::get_Output(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytes_praiseId) {
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction)));
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : generateProgram(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* bytes_praiseId)." << std::endl;
		auto sampleOutput = new std::list<zinc::Object*>;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			sampleOutput->resize(2);
			auto tempDEFAULT_Output = *sampleOutput->begin();
			auto tempSTRUCT_Output = CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, 0)->dyn_STRUCT_get_CLIB_LeftHemishpore_Framework_Output(sysThreadId);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->app_FUNCT_pop_CLIB_LeftHemishpore_Framework_App_Data_Control_STACK_Of_Output(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			tempSTRUCT_Output = CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Output_at_ItemSideToREAD_For_doubleBufferOutput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			sampleOutput->assign(0, reinterpret_cast<class zinc::Object*>(zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbunsignedLongLong(sysThreadId, bytes_praiseId)));
			switch (*zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, bytes_praiseId)) {
			case 0: {
				objOutputSUBSET_praise0 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Output_praise0*>(*tempSTRUCT_Output->dyn_REG_get_ptr_Item_Of_ptr_CLIB_LeftHemishpore_STRUCT_Output_Subset(sysThreadId)->begin());
				sampleOutput->assign(1, reinterpret_cast<class zinc::Object*>(zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbDouble_To_MsbByteArray(sysThreadId, objOutputSUBSET_praise0->dyn_REG_get_CLIB_LeftHemishpore_STRUCT_Output_praise0_Value(sysThreadId))));
				break;
			}
			case 1: {
				objOutputSUBSET_praise1 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Output_praise1*>(*tempSTRUCT_Output->dyn_REG_get_ptr_Item_Of_ptr_CLIB_LeftHemishpore_STRUCT_Output_Subset(sysThreadId)->begin());
				sampleOutput->assign(1, reinterpret_cast<class zinc::Object*>(zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbDouble_To_MsbByteArray(sysThreadId, objOutputSUBSET_praise1->dyn_REG_get_CLIB_LeftHemishpore_STRUCT_Output_praise1_Value(sysThreadId))));
				break;
			}
			case 2: {
				objOutputSUBSET_praise2 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Output_praise2*>(*tempSTRUCT_Output->dyn_REG_get_ptr_Item_Of_ptr_CLIB_LeftHemishpore_STRUCT_Output_Subset(sysThreadId)->begin());
				sampleOutput->assign(1, reinterpret_cast<class zinc::Object*>(zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbDouble_To_MsbByteArray(sysThreadId, objOutputSUBSET_praise2->dyn_REG_get_CLIB_LeftHemishpore_STRUCT_Output_praise2_Value(sysThreadId))));
				break;
			}
			case 3: {
				objOutputSUBSET_praise3 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Output_praise3*>(*tempSTRUCT_Output->dyn_REG_get_ptr_Item_Of_ptr_CLIB_LeftHemishpore_STRUCT_Output_Subset(sysThreadId)->begin());
				sampleOutput->assign(1, reinterpret_cast<class zinc::Object*>(zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbDouble_To_MsbByteArray(sysThreadId, objOutputSUBSET_praise3->dyn_REG_get_CLIB_LeftHemishpore_STRUCT_Output_praise3_Value(sysThreadId))));
				break;
			}
			}
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(2) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : generateProgram(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* bytes_praiseId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction)));
		return CLIB_LeftHemishpore_Framework_Global::stat_APP_CONVERT_CLIB_SystemBus_Framework_Global_DATA_To_MsbByteArray(sysThreadId, reinterpret_cast<zinc::Object*>(sampleOutput));
	}
	unsigned char* zinc::Epicentre::get_FLAG_isINITIALISED(uint8_t* sysThreadId, unsigned char* handleId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : get_FLAG_isINITIALISED(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		bool* temp = nullptr;
		temp = new bool(sysThreadId);
		*temp = true;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			*temp = CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Execute_Control(sysThreadId)->dyn_REG_get_FLAG_CLIB_LeftHemishpore_Framework_App_Execute_Control_isSystemInitialised(sysThreadId);
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(3) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : get_FLAG_isINITIALISED(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		return zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *temp);
	}
	unsigned char* zinc::Epicentre::get_FLAG_isINSTANTIATED(uint8_t* sysThreadId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : get_FLAG_isINSTANTIATED(sysThreadId)" << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, 0))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, 0))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		bool* temp = nullptr;
		temp = new bool(sysThreadId);
		*temp = true;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: <= zinc : CLIB_LeftHemishpore : CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId) = PRIMED" << std::endl;
			*temp = CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
		}
		else {
			std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: <= zinc : CLIB_LeftHemishpore : CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId) = PRIMING" << std::endl;
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(4) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : get_FLAG_isINSTANTIATED(sysThreadId)" << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, 0))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, 0))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		return zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *temp);
	}
	unsigned char* zinc::Epicentre::get_FLAG_isStackLoaded_ServerInputReceive(uint8_t* sysThreadId, unsigned char* handleId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : get_FLAG_isStackLoaded_ServerInputReceive(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		bool* temp = nullptr;
		temp = new bool(sysThreadId);
		*temp = true;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			*temp = CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->dyn_REG_get_Item_FLAG_isLoaded_Stack_InputAction(sysThreadId);
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(5) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : get_FLAG_isStackLoaded_ServerInputReceive(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		return zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *temp);
	}
	unsigned char* zinc::Epicentre::get_FLAG_isStackLoaded_ServerOutputSend(uint8_t* sysThreadId, unsigned char* handleId)	{
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : get_FLAG_isStackLoaded_ServerOutputSend(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		bool* temp = nullptr;
		temp = new bool(sysThreadId);
		*temp = true;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			*temp = CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->dyn_REG_get_Item_FLAG_isLoaded_Stack_OutputSend(sysThreadId);
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(6) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : get_FLAG_isStackLoaded_ServerOutputSend(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		return zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbBool_to_MsbByteArray(sysThreadId, *temp);
	}
	unsigned char* zinc::Epicentre::get_MetaData_PraiseEventId(uint8_t* sysThreadId, unsigned char* handleId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : get_MetaData_PraiseEventId(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		unsigned long long* temp = nullptr;
		temp = new unsigned long long ();
		*temp = ULLONG_MAX;
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			*temp = *CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Output_at_ItemSideToREAD_For_doubleBufferOutput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))->dyn_REG_get_ptr_CLIB_LeftHemishpore_STRUCT_Output_praiseEventId(sysThreadId);
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(7) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : get_MetaData_PraiseEventId(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		return zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbUnsignedLongLong_to_ByteArray(sysThreadId, temp);
	}
	void zinc::Epicentre::set_InputItemsFor_praise0(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : set_InputItemsFor_praise0(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			objInputSUBSET_praise0 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Input_praise0*>(CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))));
			objInputSUBSET_praise0->dyn_REG_set_Item_Input_praise0_valueA(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_A));
			objInputSUBSET_praise0->dyn_REG_set_Item_Input_praise0_valueB(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_B));
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(8) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : set_InputItemsFor_praise0(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
	}
	void zinc::Epicentre::set_InputItemsFor_praise1(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : set_InputItemsFor_praise1(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			objInputSUBSET_praise1 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Input_praise1*>(CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))));
			objInputSUBSET_praise1->dyn_REG_set_Item_Input_praise1_valueA(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_A));
			objInputSUBSET_praise1->dyn_REG_set_Item_Input_praise1_valueB(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_B));
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(9) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(1) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : set_InputItemsFor_praise1(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
	}
	void zinc::Epicentre::set_InputItemsFor_praise2(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : set_InputItemsFor_praise2(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			objInputSUBSET_praise2 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Input_praise2*>(CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))));
			objInputSUBSET_praise2->dyn_REG_set_Item_Input_praise2_valueA(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_A));
			objInputSUBSET_praise2->dyn_REG_set_Item_Input_praise2_valueB(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_B));
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(10) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(2) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : set_InputItemsFor_praise2(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
	}
	void zinc::Epicentre::set_InputItemsFor_praise3(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : set_InputItemsFor_praise3(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			objInputSUBSET_praise3 = reinterpret_cast<zinc::CLIB_LeftHemishpore_STRUCT_Input_praise3*>(CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))));
			objInputSUBSET_praise3->dyn_REG_set_Item_Input_praise3_valueA(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_A));
			objInputSUBSET_praise3->dyn_REG_set_Item_Input_praise3_valueB(sysThreadId, zinc::CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbDouble(sysThreadId, bytesValue_B));
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(11) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(3) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : set_InputItemsFor_praise3(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), unsigned char* handleId, unsigned char* threadId, unsigned char* bytesPraiseId, unsigned char* bytesValue_A, unsigned char* bytesValue_B)" << std::endl;
		stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), handleId, bytesPraiseId);
	}
	void zinc::Epicentre::set_MetaData_PraiseEventId(uint8_t* sysThreadId, unsigned char* handleId, unsigned char* bytesPraiseId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : set_MetaData_PraiseEventId(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId));
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(12) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : set_MetaData_PraiseEventId(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
	}
	void zinc::Epicentre::reInitialiseHandle(uint8_t* sysThreadId, unsigned char* handleId, uint8_t* NUMBER_OF_TASK_THREADS) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : reInitialiseHandle(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			CLIB_LeftHemishpore_Framework_Global::stat_REG_set_CLIB_LeftHemishpore_Framework_Global_MAX_NUMBER_OF_THREADS(sysThreadId, NUMBER_OF_TASK_THREADS);
			CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Algorithms(sysThreadId)->dyn_REG_boot3_REINITIALISE_CLIB_LeftHemishpore_Algorithm(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
			//todo
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(13) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : reInitialiseHandle(sysThreadId)." << std::endl;
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_extraction));
	}
	void zinc::Epicentre::terminateProgram(uint8_t* sysThreadId) {
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: entered LIB :: zinc : Epicentre : terminateProgram(sysThreadId)." << std::endl;
		for ( int* index_handleId = new int(1); *index_handleId < CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size(); index_handleId++) {
			zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
			zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
		}
		if (!CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0)) {
			delete stat_CLASS_CLIB_LeftHemishpore_Framework;
			delete stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED;
			delete objInputSUBSET_praise0;
			delete objInputSUBSET_praise1;
			delete objInputSUBSET_praise2;
			delete objInputSUBSET_praise3;
			delete objOutputSUBSET_praise0;
			delete objOutputSUBSET_praise1;
			delete objOutputSUBSET_praise2;
			delete objOutputSUBSET_praise3;
		}
		else {
			CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(14) = !CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) ;
			CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(sysThreadId);
		}
		std::cout << "thread " << std::to_string(*sysThreadId) << " :: exiting LIB :: zinc : Epicentre : terminateProgram(sysThreadId)." << std::endl;
		for ( int* index_handleId = new int(1); *index_handleId < CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(sysThreadId)->size(); index_handleId++) {
			zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
			zinc::MutexQue::endByUnlock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, index_handleId)->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Output_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, sysThreadId));
		}
	}
// private.
	void zinc::Epicentre::stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_MetaData(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* obj, unsigned char* handleId, unsigned char* bytesPraiseId) {
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
		CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))->dyn_REG_set_ptr_CLIB_LeftHemishpore_STRUCT_Input_praiseEventId(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbunsignedLongLong(sysThreadId, bytesPraiseId));
		CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_REG_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Input_at_ItemSideToWRITE_For_doubleBufferInput(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)))->dyn_APP_select_And_Set_LeftHemishpore_STRUCT_Input_Subset(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbunsignedLongLong(sysThreadId, bytesPraiseId));
	}
	void zinc::Epicentre::stat_app_do_CLIB_LeftHemishpore_STRUCT_Input_DataControl(uint8_t* sysThreadId, CLIB_LeftHemishpore_Framework* obj, unsigned char* handleId, unsigned char* bytesPraiseId) {
		CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->app_FUNCT_flip_CLIB_LeftHemishpore_Framework_App_Data_Control_REG_Input_DoubleBuffer(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
		CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Data(sysThreadId)->dyn_CLASS_get_ptr_dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App_Data_Control(sysThreadId)->app_FUNCT_push_CLIB_LeftHemishpore_Framework_App_Data_Control_STACK_Of_Input(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId)));
		zinc::MutexQue::startByLock(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbInt_To_MsbByteArray(sysThreadId, CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(sysThreadId, CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_MsbByteArray_To_VUALUEofMsbInt(sysThreadId, handleId))->dyn_CLASS_get_ptr_CLIB_LeftHemishpore_Framework_App(sysThreadId)->dyn_CLASS_get_ptr_Execute(sysThreadId)->dyn_PGM_get_HandleId_For_CLIB_MutexQue_Input_LaunchQue_Server(sysThreadId)), CLIB_LeftHemishpore_Framework_Global::stat_CONVERT_CLIB_LeftHemishpore_Framework_Global_VUALUEofMsbuint8_t_To_MsbByteArray(sysThreadId, threadAccessId_Of_injection));
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_app_FUNCT_Calc_IsAllINSTANTIATED(uint8_t* sysThreadId) {
		CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) = false;
		for (int memberFunctionId = 1; memberFunctionId < sizeof(*CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)); memberFunctionId++) {
			if (CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(memberFunctionId)) {
				CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(0) = CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(memberFunctionId);
				break;
			}
		}
		for (int index = 0; index < sizeof(*CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)); index++) {
			std::cout << CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->at(index);
		}
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_CLASS_boot1_DEFINE_Framework(uint8_t* sysThreadId)
	{
		stat_CLASS_CLIB_LeftHemishpore_Framework = nullptr;
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_CLASS_boot3_INITIALISE_Framework(uint8_t* sysThreadId) {
		stat_CLASS_CLIB_LeftHemishpore_Framework = new std::list<zinc::CLIB_LeftHemishpore_Framework*>();
		while (stat_CLASS_CLIB_LeftHemishpore_Framework == nullptr) {}
	}
	zinc::CLIB_LeftHemishpore_Framework* zinc::Epicentre::CLIB_LeftHemishpore_stat_CLASS_get_ptr_CLIB_LeftHemishpore_Framework(uint8_t* sysThreadId, int* handleId) {
		auto temp = stat_CLASS_CLIB_LeftHemishpore_Framework->begin();
		std::advance(temp, *handleId);
		return *temp;
	}
	std::list<zinc::CLIB_LeftHemishpore_Framework*>* zinc::Epicentre::CLIB_LeftHemishpore_stat_CLASS_get_List_Of_ptr_CLIB_LeftHemishpore_Framework(uint8_t* sysThreadId) {
		return stat_CLASS_CLIB_LeftHemishpore_Framework;
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_REG_boot1_DEFINE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId)
	{
		stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED = nullptr;
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_REG_boot2_SUBSTANTIATE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId) {
		stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED = new std::array<bool, 15>();
		for (int index = 0; index < sizeof(*CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)); index++) {
			auto temp = CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->begin();
			std::advance(temp, index);
			*temp = true;
		}
	}
	void zinc::Epicentre::CLIB_LeftHemishpore_stat_REG_boot3_INITIALISE_CLIB_LeftHemishpore_isFLAG_INSTANTIATED(uint8_t* sysThreadId) {
		for (int index = 0; index < sizeof(*CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)); index++) {
			auto temp = CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(sysThreadId)->begin();
			std::advance(temp, index);
			*temp = true;
		}
	}
	std::array<bool, 15>* zinc::Epicentre::CLIB_LeftHemishpore_stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED(uint8_t* sysThreadId) {
		return stat_REG_flag_CLIB_LeftHemishpore_array_isINSTANTIATED;
	}
````

---
### Java
#### Imports.
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

##### Java_zinc_epicentre.java.
````
package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
public interface Java_zinc_epicentre extends Library {
    Java_zinc_epicentre INSTANCE = (Java_zinc_epicentre) Native.load("libzinc_epicentre", Java_zinc_epicentre.class);
    byte[] gernerateHandle(byte sysThreadId);
    void generateProgram(byte sysThreadId);
    byte[] get_Output(byte sysThreadId, byte[] handleId, byte[] bytes_praiseId);
    byte[] get_FLAG_isINITIALISED(byte sysThreadId, byte[] handleId);
    byte[] get_FLAG_isINSTANTIATED(byte sysThreadId);
    byte[] get_FLAG_isStackLoaded_ServerInputReceive(byte sysThreadId, byte[] handleId);
    byte[] get_FLAG_isStackLoaded_ServerOutputSend(byte sysThreadId, byte[] handleId);
    byte[] get_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId);
    void set_InputItemsFor_praise0(byte sysThreadId, byte[] handleId, byte[] bytesPraiseId, byte[] bytesValue_A, byte[] bytesValue_B);
    void set_InputItemsFor_praise1(byte sysThreadId, byte[] handleId, byte[] bytesPraiseId, byte[] bytesValue_A, byte[] bytesValue_B);
    void set_InputItemsFor_praise2(byte sysThreadId, byte[] handleId, byte[] bytesPraiseId, byte[] bytesValue_A, byte[] bytesValue_B);
    void set_InputItemsFor_praise3(byte sysThreadId, byte[] handleId, byte[] bytesPraiseId, byte[] bytesValue_A, byte[] bytesValue_B);
    void set_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId, byte[] bytesPraiseId);
    void reInitialiseHandle(byte sysThreadId, byte[] handleId, byte NUMBER_OF_TASK_THREADS);
    void terminateProgram(byte sysThreadId);
}
````


#### Library IO.
##### MutexQue.
````
package main.IO;
import libs.Java_zinc_control_mutex_que;
public class MutexQue {
    public static void endByUnlock(byte sysThreadId, long handleId, byte[] bytes_ACCESS_ID) {
        try {
            public static byte[] stat_CONVERT_Long_To_ByteArray(long value) {
                return ByteBuffer.allocate(Long.BYTES).putLong(value).array();
            }
            result = Java_zinc_control_launch_que.INSTANCE.endByUnlock(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.endByUnlock(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.endByUnlock(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
            result = null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.endByUnlock(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
        }
    }
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
    public void reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS) {
        try {
            Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId, MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        }
    }
    public void startByLock(byte sysThreadId, long handleId, byte ACCESS_ID) {
        try {
            Java_zinc_control_launch_que.INSTANCE.startByLock(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), ACCESS_ID);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_ACCESS_ID)%n");
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
}
````

##### LaunchQue.
````
package main.IO;
import libs.Java_zinc_control_launch_que;
import engine.Global;
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
    public static byte[] get_coreIdTolaunch(byte sysThreadId, long handleId, byte concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
             throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_coreIdTolaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEisActive(byte sysThreadId, long handleId, byte concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEisActive(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagisIdle(byte sysThreadId, long handleId, byte concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagisIdle(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
        return result;
    }
    public static byte[] get_FlagSTATEofThreadToLaunch(byte sysThreadId, long handleId, byte concurrentThreadId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FlagSTATEofThreadToLaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
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
    public void reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS) {
        try {
            Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId, MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        }
    }
    public void set_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId, byte[] byteBool) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), concurrentThreadId, byteBool);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId, byte[] byteBool)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId, byte[] byteBool)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_FlagSTATEofConcurrentCore(byte sysThreadId, long handleId, byte concurrentThreadId, byte[] byteBool)%n");
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
    public void threadRequestlaunch(byte sysThreadId, long handleId, byte concurrentThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadRequestlaunch(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
    }
    public void threadEnd(byte sysThreadId, long handleId, byte concurrentThreadId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.threadEnd(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), bytes_concurrentThreadId);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.threadEnd(byte sysThreadId, long handleId, byte concurrentThreadId)%n");
        }
    }
}
````

##### Epircentre.
````
package main.IO;
import libs.Java_zinc_epicentre;
import engine.Global;
public class Epicentre {
    public static long generateHandle(byte sysThreadId) {
        long result;
        try {
            result = stat_CONVERT_ByteArray_To_Long(Java_zinc_control_launch_que.INSTANCE.generateHandle(sysThreadId));
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
    public static byte[] get_Output(byte sysThreadId, long handleId, long bytes_praiseId) {
        byte[] result;
        try {
            result = Java_zinc_control_launch_que.INSTANCE.get_Output(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(bytes_praiseId));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_Output(byte sysThreadId, byte[] handleId, byte[] bytes_praiseId)%n");
            result = null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_Output(byte sysThreadId, byte[] handleId, byte[] bytes_praiseId)%n");
            result = null;
        } catch (NullPointerException e) {
            result = null;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_Output(byte sysThreadId, byte[] handleId, byte[] bytes_praiseId)%n");
        }
        return result;
    }
    public static boolean get_FLAG_isINITIALISED(byte sysThreadId, long handleId) {
        boolean result;
        try {
            result = Global.stat_CONVERT_ByteArray_To_Boolean(Java_zinc_control_launch_que.INSTANCE.get_FLAG_isINITIALISED(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isINITIALISED(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isINITIALISED(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (NullPointerException e) {
            result = true;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isINITIALISED(byte sysThreadId, byte[] handleId)%n");
        }
        return result;
    }
    public static boolean isINSTANTIATED(byte sysThreadId) {
        boolean result;
        try {
            result = Global.stat_CONVERT_ByteArray_To_Boolean(Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(sysThreadId));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
            result = true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
            result = true;
        } catch (NullPointerException e) {
            result = true;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.isINSTANTIATED(byte sysThreadId)%n");
        }
        return result;
    }
    public static boolean get_FLAG_isStackLoaded_ServerInputReceive(byte sysThreadId, long handleId) {
        boolean result;
        try {
            result = Global.stat_CONVERT_ByteArray_To_Boolean(Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerInputReceive(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerInputReceive(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerInputReceive(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (NullPointerException e) {
            result = true;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerInputReceive(byte sysThreadId, byte[] handleId)%n");
        }
        return result;
    }
    public static boolean get_FLAG_isStackLoaded_ServerOutputSend(byte sysThreadId, long handleId) {
        boolean result;
        try {
            result = Global.stat_CONVERT_ByteArray_To_Boolean(Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerOutputSend(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerOutputSend(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerOutputSend(byte sysThreadId, byte[] handleId)%n");
            result = true;
        } catch (NullPointerException e) {
            result = true;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_FLAG_isStackLoaded_ServerOutputSend(byte sysThreadId, byte[] handleId)%n");
        }
        return result;
    }
    public static long get_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId) {
        long result;
        try {
            result = Global.stat_CONVERT_ByteArray_To_Long(Java_zinc_control_launch_que.INSTANCE.get_MetaData_PraiseEventId(sysThreadId, handleId));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.get_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId)%n");
            result = Long.MAX_VALUE;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId)%n");
            result = Long.MAX_VALUE;
        } catch (NullPointerException e) {
            result = Long.MAX_VALUE;
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.get_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId)%n");
        }
        return result;
    }
    public void set_InputItemsFor_praise0(byte sysThreadId, long handleId, long longPraiseId, double doubleValue_A, double doubleValue_B) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise0(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(longPraiseId), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_A), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_B));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise0(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise0(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise0(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        }
    }
    public void set_InputItemsFor_praise1(byte sysThreadId, long handleId, long longPraiseId, double doubleValue_A, double doubleValue_B) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise1(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(longPraiseId), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_A), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_B));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise1(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise1(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise1(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        }
    }
    public void set_InputItemsFor_praise2(byte sysThreadId, long handleId, long longPraiseId, double doubleValue_A, double doubleValue_B) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise2(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(longPraiseId), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_A), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_B));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise2(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise2(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise2(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        }
    }
    public void set_InputItemsFor_praise3(byte sysThreadId, long handleId, long longPraiseId, double doubleValue_A, double doubleValue_B) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise3(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(longPraiseId), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_A), Global.stat_CONVERT_Double_To_ByteArray(doubleValue_B));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise3(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise3(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_InputItemsFor_praise3(byte sysThreadId, byte[] handleId, byte[] longPraiseId, byte[] doubleValue_A, byte[] doubleValue_B)%n");
        }
    }
    public void set_MetaData_PraiseEventId(byte sysThreadId, long handleId, long longPraiseId) {
        try {
            Java_zinc_control_launch_que.INSTANCE.set_MetaData_PraiseEventId(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), Global.stat_CONVERT_Long_To_ByteArray(longPraiseId));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.set_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId, byte[] longPraiseId)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId, byte[] longPraiseId)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.set_MetaData_PraiseEventId(byte sysThreadId, byte[] handleId, byte[] longPraiseId)%n");
        }
    }
    public void reInitialiseHandle(byte sysThreadId, long handleId, byte concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS) {
        try {
            Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(sysThreadId, Global.stat_CONVERT_Long_To_ByteArray(handleId), bytes_concurrentThreadId, MAX_NUMBER_OF_CONCURRENT_TASK_THREADS);
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : Java_zinc_control_launch_que.INSTANCE.reInitialiseHandle(byte sysThreadId, byte[] handleId, byte[] bytes_concurrentThreadId, byte MAX_NUMBER_OF_CONCURRENT_TASK_THREADS)%n");
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
}
````
