class Detector {
    private int value;
    private int count = 0;
    private Detector next;

    Detector(int value, Detector next) {
        this.value = value;
        this.next = next;
    }

    void detect(int value) {
        count = value / this.value;
        if (next != null) {
            next.detect(value % this.value);
        }
    }

    int getCount() {
        return count;
    }
}
