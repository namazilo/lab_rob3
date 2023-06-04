public class Task4 {
    public static void main(String[] args) {

        System.out.println("Чи погоджуєтеся ви з умовами угоди? (Так/Ні)");
        String c = "Так";

        switch (c) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляють");
                break;
            default:
                System.out.println("Невідомий вибір");
                break;
        }
    }
}
