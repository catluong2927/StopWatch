import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime,endTime;

    public StopWatch(){
        this.startTime = LocalTime.now();
    };
    public LocalTime start(){
        this.startTime = LocalTime.now();
        return startTime;
    }
//    public LocalTime StopWatch (){
//        this.startTime = LocalTime.now();
//        return startTime;
//    }
    public LocalTime stop(){
        this.endTime = LocalTime.now();
        return endTime;
    }
    public long getElapsedTime(){
        long getElap = endTime.getSecond() - startTime.getSecond();
        return getElap;
    }
}
