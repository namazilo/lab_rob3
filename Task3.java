public class Task3 {
    public static void main(String[] args) {

        int start = 9; // Початковий поверх - 1

        int v = 2;

             if (v > start) {
                 if(v==2){
                     System.out.println("Ліфт піднімається на 3 поверх");
                 }
                 else {
                     System.out.println("Ліфт піднімається на " + v + " поверх");
                 }
            } else if (v < start) {
                 if(v==2){
                     System.out.println("Ліфт спускається на 1 поверх");
                 }
                 else {
                     System.out.println("Ліфт спускається на " + v + " поверх");
                 }
            } else {
                System.out.println("Ви уже знаходитесь на цьому поверсі");
            }
        }
    }


