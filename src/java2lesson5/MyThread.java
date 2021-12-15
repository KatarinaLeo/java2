package java2lesson5;

public class MyThread extends Thread {
    private float[] array;

    MyThread(String name, float[] array) {
        super(name);
        this.array = array;
    }

    float[] getArray() {
        return array;
    }

    @Override
    public void run(){
        calculate();
    }
    private void calculate() {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("End: " + Thread.currentThread().getName());
    }
}
