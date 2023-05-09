package OOP_DAY4;
import java.util.Date;

public class Xay_dung_class_1_StopWatch_Day_4 {
    private  long startTime, endTime;
    public Xay_dung_class_1_StopWatch_Day_4(){
        startTime = new Date().getTime();
    }

    public Xay_dung_class_1_StopWatch_Day_4(int startTime, int endtime){
        this.startTime = startTime;
        this.endTime = endtime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndtime() {
        return endTime;
    }
    public void start(){
        startTime = new Date().getTime();
    }
    public void stop(){
        endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
