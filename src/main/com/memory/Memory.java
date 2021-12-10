package main.com.memory;


public class Memory {
    String[] memoryCell;

    public Memory(String[] memoryCell) {
        this.memoryCell = memoryCell;
    }

    public Memory() {
        this.memoryCell = new String[20];
    }

    public String[] getMemoryCell() {
        return memoryCell;
    }

    public void setMemoryCell(String[] memoryCell) {
        this.memoryCell = memoryCell;
    }


    public String readLast(){
        String str = "";

        for (int i = memoryCell.length-1; i >= 0; i--){
            if (memoryCell[i] == null){
                str = "Память полностью свободна. В памяти ничего нет.";
                continue;
            }
            else{
                str = memoryCell[i];
                break;
            }
        }
        return str;
    }

    public String removeLast(){
        String str = "";
        for (int i = memoryCell.length-1; i >= 0; i--){
            if (memoryCell[i] == null){
                str = "Память полностью свободна. В памяти ничего нет.";
                continue;
            }
            else{
                str = "В значение(последнее) "+memoryCell[i]+"записано null";
                memoryCell[i] = null;
                break;
            }
        }
        return str;
    }

    public boolean save(String data){
        for (int i = memoryCell.length-1; i >= 0; i--){
            if(memoryCell[i] == null){
                memoryCell[i] = data;
                break;
            }
        }

        boolean bool = false;
        for (int i = memoryCell.length-1; i >= 0; i--){
            if (memoryCell[i] == null){
                bool = true;
                break;
            }
        }
        return bool;
    }

    public Object getMemoryInfo(){
        class MemoryInfo{
            int amountOfMemory ;
            double amountOfNull;

            public MemoryInfo(int amountOfMemory, int amountOfNull) {
                this.amountOfMemory = amountOfMemory;
                this.amountOfNull = amountOfNull;
            }

            @Override
            public String toString() {
                return "MemoryInfo{" +
                        "amountOfMemory=" + amountOfMemory +
                        ", amountOfNull=" + amountOfNull +
                        '}';
            }

        }
        MemoryInfo memoryInfo = new MemoryInfo(0,0);
        int amountOfMemory = 0;
        double amountOfNull = 0;
        for(int i = 0; i < memoryCell.length; i++){
            amountOfMemory++;
            if (memoryCell[i] == null){
                amountOfNull++;
            }
        }

        amountOfNull = (amountOfNull/amountOfMemory)*100;
        memoryInfo.amountOfMemory = amountOfMemory;
        memoryInfo.amountOfNull = amountOfNull;
        return memoryInfo;
    }


}
