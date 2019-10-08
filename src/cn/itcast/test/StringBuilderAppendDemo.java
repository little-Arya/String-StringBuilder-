package cn.itcast.test;

public class StringBuilderAppendDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String demoString="";
        int execTimes=10000;
        if(args!=null&&args.length>0)
        {
            execTimes=Integer.parseInt(args[0]);
        }
        System.out.println("execTimes="+execTimes);
        long starMs=System.currentTimeMillis();
        StringBuilder strBuilder=new StringBuilder();
        for(int i=0;i<execTimes;i++)
        {
            strBuilder.append(i);
        }
        long endMs=System.currentTimeMillis();
        System.out.println("StringBuilder exec millis="+(endMs-starMs));
    }
}
