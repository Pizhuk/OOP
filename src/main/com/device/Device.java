package main.com.device;

import main.com.memory.Memory;
import main.com.processor.Processor;

import java.util.Arrays;

public class Device {
    Processor processor;
    Memory memory;

    public Device(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }
    public double amountOfFreeMem(){
        double amount = 0;
        for (int i = 0; i < memory.getMemoryCell().length; i++){
            if (memory.getMemoryCell()[i] == null){
                amount++;
            }
        }
        return amount;
    }

    public void save(String[] data){
        int count = 0;
        for (int i = 0; i < memory.getMemoryCell().length; i++){
            if (memory.getMemoryCell()[i] == null){
                count++;
            }
        }

        int[] helpArray = new int[count];
        int iteration = 0;
        for (int i = 0; i < memory.getMemoryCell().length; i++){
            if (memory.getMemoryCell()[i] == null){
                helpArray[iteration] = i;
                iteration++;
            }
        }
        if(data.length > count){
            System.out.println("В памяти нет столько места!");
        }
        else {
            for (int i = 0; i < data.length; i++){
                memory.getMemoryCell()[helpArray[i]] = data[i];
            }
            System.out.println("Сохранено");
        }
    }

    public String[] readAll(){
        String[] array = memory.getMemoryCell();
        for (int i = 0; i < memory.getMemoryCell().length; i++){
            memory.getMemoryCell()[i] = null;
        }
        return array;
    }

    public void dataProcessing(){
        String[] buffer = readAll();
        for(int i = 0; i < buffer.length; i++){
            buffer[i] = processor.dataProcess(buffer[i]);
        }
        save(buffer);
    }

    public String getSystemInfo(){
        return "Frequency: "+processor.getFrequency()
                +"; Cache: "+processor.getCache()
                +"; bitCapacity: "+processor.getBitCapacity()+"\n"
                +"Memory: "+ Arrays.toString(memory.getMemoryCell());
    }

    @Override
    public String toString() {
        return "Device{" +
                "Processor: Frequency: " + processor.getFrequency() + " Cache: "+processor.getCache()+" bitCapacity: "+processor.getBitCapacity()+
                ", memory=" + Arrays.toString(memory.getMemoryCell()) +
                '}';
    }
}
