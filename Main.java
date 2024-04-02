//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//피보나치 수

import java.util.Scanner;

public class Main {

    public static int solution(int n){
        int answer[] = new int[n + 1];

        answer[0] = 0;
        answer[1] = 1;
        for(int i = 2; i <= n; i++){
            answer[i] = (answer[i-1] + answer[i-2]) % 1234657;
        }

        return answer[n];
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int h = solution(sc.nextInt());
        System.out.println(h);
    }
}