import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测量程序运行时间的工具类
 */
public class TimeTool {


    private static final SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

    public interface Task{
        void execute();
    }

    /**
     *
     * @param title 测试的任务标题，自定义
     * @param task 测试的任务
     */
    public static void check(String title,Task task){
        if (task==null){
            return;
        }
        title = (title == null)?"":("［"+title+"]");
        System.out.println(title);
        System.out.println("开始: "+fmt.format(new Date()));
        long begin = System.currentTimeMillis();
        task.execute();
        long end = System.currentTimeMillis();
        System.out.println("结束: "+fmt.format(new Date()));
        double delta = (end - begin) / 1000.0;

        System.out.println("耗时： "+ delta + "秒");
        System.out.println("-------------------------------------------");

    }
}
