package ss4_LopVaDoiTuong;

public class StopWatch {


    private long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
    }



    public void stop() {
        this.endTime = System.currentTimeMillis();
    }


    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {


        StopWatch stopWatch = new StopWatch();


        stopWatch.start();


        for (int i = 0; i < 100000000; i++) {
            // vòng lặp giả
        }


        stopWatch.stop();


        System.out.println("Thời gian đã trôi qua (ms): "
                + stopWatch.getElapsedTime());
    }
}
