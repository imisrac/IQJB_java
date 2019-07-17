package builder1;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Disk disk;
    private Display display;

    private Computer() {
    }

    public Processor getProcessor() {
        return processor;
    }

    private Computer setProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Computer build() {
        return new Builder().build();
    }

    static class Builder {
        private Computer computer;

        public Builder() {
            computer = new Computer();
        }

        public Builder processor(Processor processor) {
            computer.setProcessor(processor);
            return this;
        }

        public Builder memory(Memory memory) {
            computer.setMemory(memory);
            return this;
        }

        public Builder disk(Disk disk) {
            computer.setDisk(disk);
            return this;
        }

        public Builder display(Display display) {
            computer.setDisplay(display);
            return this;
        }

        public Computer build() {
            return computer;
        }
    }
}
