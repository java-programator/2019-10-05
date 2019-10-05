package pl.altkom.wrappers;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "123";

        int i1     = Integer.parseInt(s1);
        Integer i2 = Integer.valueOf(s1);

        Integer i3 = Integer.valueOf(i1);
        int i4     = i3.intValue();

        String s2  = String.valueOf(i4);
        String s3  = i3.toString();

        // =====================================

        Integer k1 = 1;
        int k2 = k1;

        byte b1 = 9;
        Byte b2 = b1;
        byte b3 = b2;

        Integer k3 = Integer.valueOf(b1);
    }
}
