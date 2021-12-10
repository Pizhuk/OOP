package main.com;

import main.com.device.Device;
import main.com.device.Filter;
import main.com.memory.Memory;
import main.com.processor.ProcessorArm;
import main.com.processor.ProcessorX86;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProcessorArm processorArmVers1 = new ProcessorArm(500,
                64000, 64);
        ProcessorArm processorArmVers2 = new ProcessorArm(2300,
                8000, 32);
        ProcessorArm processorArmVers3 = new ProcessorArm(3000,
                32000, 64);

        ProcessorX86 processorX86Vers1 = new ProcessorX86(750,
                4000, 32);
        ProcessorX86 processorX86Vers2 = new ProcessorX86(2900,
                16000, 64);
        ProcessorX86 processorX86Vers3 = new ProcessorX86(500,
                16000, 32);

        Memory memoryVers1 = new Memory();
        Memory memoryVers2 = new Memory(new String[] {"hello", "hay",
        "wow wow", null, "qwer", "tyui", "kdk", null});
        Memory memoryVers3 = new Memory(new String[] {"bye", "end"});

        Device device1 = new Device(processorArmVers1, memoryVers1);
        Device device2 = new Device(processorX86Vers1, memoryVers2);
        Device device3 = new Device(processorArmVers2, memoryVers3);
        Device device4 = new Device(processorX86Vers2, memoryVers3);
        Device device5 = new Device(processorArmVers3, memoryVers2);
        Device device6 = new Device(processorX86Vers3, memoryVers1);
        Device device7 = new Device(processorArmVers1, memoryVers2);
        Device device8 = new Device(processorX86Vers2, memoryVers3);
        Device device9 = new Device(processorArmVers3, memoryVers1);
        Device device10 = new Device(processorX86Vers3, memoryVers1);

        Device[] devices = new Device[] {device1, device2, device3,device4,device5,
                device6,device7,device8,device9,device10};

        Filter filter = new Filter();
        Device[] devicesWithFreqMoreThan3000 = filter.filterParameterOfCPU(devices);
        Device[] devicesWithMemoryMoreThan10 = filter.filterMemoryOfDevice(devices);
        Device[] devicesWithUsedMemoryMoreThan60percent = filter.filterUsedMemoryOfDevice(devices);
        Device[] devicesWithProcessorARM = filter.filterArchitecture(devices);
//        System.out.println(Arrays.toString(devicesWithFreqMoreThan3000));
        System.out.println(Arrays.toString(devicesWithProcessorARM));
        System.out.println(device1.getSystemInfo());

    }
}
