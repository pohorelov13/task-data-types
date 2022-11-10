package demo;

public class Data {

    static void handleData() {
        Tasks task = new Tasks();

        task.printThreeWords();
        task.checkSumSign(); //5, 7 - ожидается "Sum is positive"
        task.printColor(); //65 - ожидается "YELLOW"
        task.compareNumbers(); //3, 12 - ожидается "a < b"
        System.out.println(task.checkSum(5, 12)); //ожидается - true
        task.checkSign(-15);//ожидается - "-15 is negative"
        System.out.println(task.checkPositive(33));//ожидается - false
        task.printInfo("Better call Saul!", 5);
        System.out.println(task.checkYear(2022));//ожидается - false
    }
}
