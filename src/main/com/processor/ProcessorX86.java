package main.com.processor;


public class ProcessorX86 extends Processor{
    private static final String ARCHITECTURE = "X86";

    public ProcessorX86(int frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
        this.processorArchitecture = ProcessorArchitecture.X86;
    }

    @Override
    public String dataProcess(String data) {
        return data.toLowerCase();
    }

    @Override
    public String dataProcess(long data) {
        return "X86:"+data;
    }
}
