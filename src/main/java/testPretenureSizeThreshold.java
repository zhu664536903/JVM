/**
 * 测试进入老年代新建对象阈值
 * 该参数只对serial和ParNew有效
 * -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails  -XX:SurvivorRatio=8 -XX:+UseSerialGC
 *  -XX:PretenureSizeThreshold=3145728(3MB)
 */
public class testPretenureSizeThreshold {
    public static void main(String[] args) {
        byte[] var1,var2,var3,var4;
        var1 = new byte[2 * 1024 * 1024];
        var3 = new byte[3 * 1024 * 1024];
        var4 = new byte[4 * 1024 * 1024];
    }
}
