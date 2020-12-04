/**
 * 测试对象进入老年代的年龄阈值，每minorGc年龄+1
 * 该参数只对serial和ParNew有效
 * -Xmx20M -Xms20M -Xmn13M -XX:+PrintGCDetails  -XX:SurvivorRatio=6 -XX:+UseSerialGC
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 */
public class testMaxTenuringThreshold {
    public static void main(String[] args) {
        byte[] var1,var2,var3,var4;
        var1 = new byte[256 * 1024];
        var2 = new byte[4 * 1024 * 1024];
        var3 = new byte[4 * 1024 * 1024];
        var3 = null;
        System.out.println(11);
        var3 = new byte[4 * 1024 * 1024];
        var3 = null;
        var3 = new byte[4 * 1024 * 1024];

        //var4 = new byte[4 * 1024 * 1024];
    }
}
