package main.com.processor;

public abstract class Processor {
    int frequency;
    int cache;
    int bitCapacity;
    ProcessorArchitecture processorArchitecture;

    public ProcessorArchitecture getProcessorArchitecture() {
        return processorArchitecture;
    }

    public Processor(int frequency, int cache, int bitCapacity) {
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCache() {
        return cache;
    }

    public int getBitCapacity() {
        return bitCapacity;
    }

    public String getDetails(){
        return "Frequency: " + getFrequency() +
                "\nCache: " + getCache() +
                "\nbitCapacity: " + getBitCapacity();
    }

    public abstract String dataProcess(String data);

    public abstract String dataProcess(long data);


}
