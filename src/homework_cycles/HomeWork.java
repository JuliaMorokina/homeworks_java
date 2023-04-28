package homework_cycles;

public class HomeWork {

    public void numbersLog(int number) {
        String log = "";
        for(int i = 0; i <= number; i++) {
            String defaultLog = String.format("%s ", i);

            if (i == 0) {
                log += defaultLog;
            } else if (i % 3 == 0 && i % 5 == 0) {
                log += "fizzbuzz ";
            } else if(i % 3 == 0) {
                log += "fizz ";
            } else if (i % 5 == 0) {
                log += "buzz ";
            } else {
                log += defaultLog;
            }
        }
        System.out.println(log);
    }
    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();

        homeWork.numbersLog(15);
        homeWork.numbersLog(20);
        homeWork.numbersLog(4);
        homeWork.numbersLog(7);
    }
}
