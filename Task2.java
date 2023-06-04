public class Task2 {
    public static void main(String[] args) {
        int n = 987;
        int f = n/100; // пкрша чифра
        int e = (f*100-n)/10;
        int i = (e-e-e); // друга цифра
        int t = n%10;// третя цифра

        if (f>i & f>t){
            System.out.println("Перша цифра найбільша: "+f);
        }
        else if (i>f & i>t){
            System.out.println("Друга цифна найбільша: "+i);
        }

        else {
            System.out.println("Третя цифра найбільша: "+t);
        }
        }
}

