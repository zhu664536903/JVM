import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 使用jconsole可视化监控工具
 */
public class TestJconsole {
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(30);
        //64k/50ms速度添加对象
        ArrayList<ByteObj> byteObjs = new ArrayList<ByteObj>();
        for (int i = 0; i < 2000; i++) {
            TimeUnit.MICROSECONDS.sleep(50);
            byteObjs.add(new ByteObj());
        }
        System.gc();
        while (true);
    }
}
class ByteObj{
    public byte[] var1= new byte[64 * 1024];
}
