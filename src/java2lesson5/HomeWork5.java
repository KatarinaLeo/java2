package java2lesson5;

public class HomeWork5 {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args){
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        long singleTime = oneThread(array);
        long multiTime = twoThread(array);
    }

    public static long oneThread(float[] array){
        long start = System.currentTimeMillis();
        for(int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long singleTime = System.currentTimeMillis() - start;
        System.out.println("One thread method ends with: " + singleTime);
        return singleTime;
    }

    private static long twoThread(float[] array){
        float[] a = new float[h];
        float[] b = new float[h];
        long start = System.currentTimeMillis();

        System.arraycopy(array, 0, a, 0, h);
        System.arraycopy(array, h, b, 0, h);

        MyThread t1 = new MyThread("a", a);
        MyThread t2 = new MyThread("b", b);

        t1.start();
        t2.start();

        a = t1.getArray();
        b = t2.getArray();

        System.arraycopy(a, 0, array, 0, h);
        System.arraycopy(b, 0, array, a.length, b.length);

        long twoTime = System.currentTimeMillis() - start;
        System.out.println("Two thread time: " + twoTime + "\n");
        return twoTime;
    }
}
