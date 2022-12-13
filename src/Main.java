import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StopWatch watch = new StopWatch();
        System.out.println("thời điểm hiện tại: "+watch.start());
        System.out.println("hãy đếm thời gian nào: ");
        System.out.println("nhấn 1 để bắt đầu");
        int sta = sc.nextInt();

        if(sta==1){
            watch.start();
            System.out.println("time bat dau: "+watch.start());
        }

        System.out.println("nhấn 2 để kết thúc");
        int end = sc.nextInt();
        if(end ==2){
            watch.stop();
            System.out.println("time ket thuc: "+watch.stop());
        }


        System.out.println("đã trôi qua được: "+watch.getElapsedTime()*1000 +" ms");
    }
}