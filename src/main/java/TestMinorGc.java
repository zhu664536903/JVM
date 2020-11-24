/**
 *  新建对象先放入eden区，如果eden区剩于内存不足以存放新对象，会触发minorGc，如果eden区无法清空，会将对象copy到老年代
 *  -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails  -XX:SurvivorRatio=8 -XX:+UseSerialGC
 */
public class TestMinorGc {
    public static void main(String[] args) {
        byte[] var1,var2,var3,var4;
        var1 = new byte[2 * 1024 * 1024];
        var2 = new byte[2 * 1024 * 1024];
        var3 = new byte[2 * 1024 * 1024];
        System.out.println(11111);
        var4 = new byte[4 * 1024 * 1024];
    }
}
