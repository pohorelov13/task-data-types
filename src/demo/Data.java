package demo;

public class Data {

    static void handleData() {
        Tasks task = new Tasks();

        task.printThreeWords();
        task.checkSumSign();
        task.printColor();
        task.compareNumbers();
        System.out.println(task.checkSum(5, 12));
        task.checkSign(-15);
        System.out.println(task.checkPositive(33));
        task.printInfo("Better call Saul!", 5);
        System.out.println(task.checkYear(2022));
    }
}
