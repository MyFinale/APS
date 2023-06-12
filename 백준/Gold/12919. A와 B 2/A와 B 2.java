import java.util.Scanner;

// 시간 초과 예상
public class Main {

    static String S, T;
    static int ans = 0;
    static void DFS(String str) {

        if (ans == 1)
            return;

        if (str.length() == S.length()) {
            ans = str.equals(S) ? 1 : 0;
            return;
        }

        if (str.charAt(0) == 'B')
            DFS(new StringBuilder(str.substring(1)).reverse().toString());

        if (str.charAt(str.length() - 1) == 'A')
            DFS(str.substring(0, str.length() - 1));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        S = sc.next();
        T = sc.next();

        sc.close();

        DFS(T);

        System.out.println(ans);

    }
}