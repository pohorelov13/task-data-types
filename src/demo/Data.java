package demo;

public class Data {

    static void handleData() {
        Tasks task = new Tasks();

        task.printThreeWords();
        task.checkSumSign(); //5, 7 - ��������� "Sum is positive"
        task.printColor(); //65 - ��������� "YELLOW"
        task.compareNumbers(); //3, 12 - ��������� "a < b"
        System.out.println(task.checkSum(5, 12)); //��������� - true
        task.checkSign(-15);//��������� - "-15 is negative"
        System.out.println(task.checkPositive(33));//��������� - false
        task.printInfo("Better call Saul!", 5);
        System.out.println(task.checkYear(2022));//��������� - false
    }
}
