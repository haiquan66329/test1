import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] arryS = new int[]{10, 20, 30, 40, 50, 60};

        //利用面向过程的方法打印输出，每一步都需要自己写出来
        System.out.print("[");
        for (int i = 0; i < arryS.length; i++) {
            if (i == arryS.length - 1) {
                System.out.println(arryS[i] + "]");
            } else {
                System.out.print(arryS[i]+", ");
            }
        }
        System.out.println("========================");
        //采用面向对象过程的方法打印输出，直接利用JDK提供的现成的Arrays类
        //其中的toString方法，直接将数组转变成为想要的字符串
        //
        System.out.println(Arrays.toString(arryS));
    }
}

