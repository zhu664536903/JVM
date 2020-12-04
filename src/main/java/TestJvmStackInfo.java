import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
*  根据Thread方法追踪线程的堆栈信息
* */
public class TestJvmStackInfo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {

                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = Thread.getAllStackTraces().entrySet();
        for (Map.Entry<Thread, StackTraceElement[]> e: entries) {
            System.out.println("Name:"+e.getKey().getName());
            for (StackTraceElement ele:e.getValue()) {
                System.out.printf("\t"+ele+"\n");
            }
        }

    }
}
