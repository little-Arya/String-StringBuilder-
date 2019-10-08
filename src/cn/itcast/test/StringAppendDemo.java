package cn.itcast.test;

public class StringAppendDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String demoString = "";
        int execTimes = 10000;
        if (args != null && args.length > 0) {
            execTimes = Integer.parseInt(args[0]);
        }
        System.out.println("execTimes=" + execTimes);
        long starMs = System.currentTimeMillis();
        for (int i = 0; i < execTimes; i++) {
            demoString = demoString + i;
        }
        long endMs = System.currentTimeMillis();
        System.out.println("+ exec millis=" + (endMs - starMs));
    }
}
