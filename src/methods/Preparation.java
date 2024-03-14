package methods;

import java.util.Arrays;

public class Preparation {

    public static int hosts(String ip){
        String[] parts = ip.split("/");
        System.out.println(Arrays.toString(parts));
        int prefix = Integer.parseInt(parts[1]);
//        return (int) Math.pow(2, 32 - prefix);
        return powerOf(2, 32 - prefix);
    }

    public static int powerOf(int base, int exponent){
        int result = 1;
        if (exponent == 0){
            return 1;
        }
        for (int i = 0; i < exponent; i++) {
            result = result*base;
        }
        return result;
    }

    public static void main(String[] args) {
        hosts("192.168.1.15/24");
    }
}
