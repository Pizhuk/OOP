package main.com.device;


import main.com.processor.ProcessorArchitecture;

public class Filter {
    public Device[] filterArchitecture(Device[] devices){
        int arrayLength = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].processor.getProcessorArchitecture() == ProcessorArchitecture.ARM){
                arrayLength++;
            }
        }
        Device[] DevicesWithFreeOfProcessorMoreThan300 = new Device[arrayLength];

        int count = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].processor.getProcessorArchitecture() == ProcessorArchitecture.ARM){
                DevicesWithFreeOfProcessorMoreThan300[count] = devices[i];
                count++;
            }
        }
        return DevicesWithFreeOfProcessorMoreThan300;
    }

    public Device[] filterParameterOfCPU(Device[] devices){
        int arrayLength = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].processor.getFrequency() >= 3000){
                arrayLength++;
            }
        }
        Device[] DevicesWithFreeOfProcessorMoreThan300 = new Device[arrayLength];

        int count = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].processor.getFrequency() >= 3000){
                DevicesWithFreeOfProcessorMoreThan300[count] = devices[i];
                count++;
            }
        }
        return DevicesWithFreeOfProcessorMoreThan300;
    }

    public Device[] filterMemoryOfDevice(Device[] devices){
        int arrayLength = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].memory.getMemoryCell().length > 10){
                arrayLength++;
            }
        }
        Device[] DevicesWithMemoryMoreThan10 = new Device[arrayLength];

        int count = 0;
        for (int i = 0; i < devices.length; i++){
            if(devices[i].memory.getMemoryCell().length > 10){
                DevicesWithMemoryMoreThan10[count] = devices[i];
                count++;
            }
        }
        return DevicesWithMemoryMoreThan10;
    }

    public Device[] filterUsedMemoryOfDevice(Device[] devices){
        int arrayLength = 0;
        for (int i = 0; i < devices.length; i++){
            if(100 - ((devices[i].amountOfFreeMem()/devices[i].memory.getMemoryCell().length)*100) > 60){
                arrayLength++;
            }
        }
        Device[] DevicesWithUsedMemoryMoreThan60 = new Device[arrayLength];

        int count = 0;
        for (int i = 0; i < devices.length; i++){
            if(100 - ((devices[i].amountOfFreeMem()/devices[i].memory.getMemoryCell().length)*100) > 60){
                DevicesWithUsedMemoryMoreThan60[count] = devices[i];
                count++;
            }
        }
        return DevicesWithUsedMemoryMoreThan60;
    }
}
