package main.com.processor;

public class ProcessorArm extends Processor{
    private static final String ARCHITECTURE = "ARM";

    public ProcessorArm(int frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
        this.processorArchitecture = ProcessorArchitecture.ARM;
    }

    @Override
    public String dataProcess(String data) {
        return data.toUpperCase();
    }

    @Override
    public String dataProcess(long data) {
        return "ARM:"+data;
    }
}
