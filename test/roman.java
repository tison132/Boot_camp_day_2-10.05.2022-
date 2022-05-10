import java.util.*;

class roman {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        check(s);

    }

    public static void check(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                char ch = s.charAt(i);

                char ch2 = s.charAt(i + 1);

                if (ch == 'I') {
                    if (ch2 == 'V' || ch2 == 'X') {
                        ans = ans - 1;
                    } else {
                        ans = ans + 1;
                    }
                } else if (ch == 'V') {
                    ans = ans + 5;
                } else if (ch == 'X') {
                    if (ch2 == 'L') {
                        ans = ans - 10;
                    } else if (ch2 == 'C') {
                        ans = ans - 10;
                    } else {
                        ans = ans + 10;
                    }
                } else if (ch == 'L') {
                    ans = ans + 50;
                } else if (ch == 'C') {
                    if (ch2 == 'D') {
                        ans = ans - 100;
                    } else if (ch2 == 'M') {
                        ans = ans - 100;
                    } else {
                        ans = ans + 100;
                    }
                } else if (ch == 'D') {
                    ans = ans + 500;
                } else if (ch == 'M') {
                    ans = ans + 1000;
                }
            } else {
                char ch = s.charAt(i);
                if (ch == 'I') {
                    ans = ans + 1;
                }
                if (ch == 'V') {
                    ans = ans + 5;
                }
                if (ch == 'X') {
                    ans = ans + 10;
                }
                if (ch == 'L') {
                    ans = ans + 50;
                }
                if (ch == 'c') {
                    ans = ans + 100;
                }
                if (ch == 'D') {
                    ans = ans + 500;
                }
                if (ch == 'M') {
                    ans = ans + 1000;
                }
            }
        }
        System.out.println(ans);
    }
}