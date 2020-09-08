public class Hannoi {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        hanoi(2,a,b,c);         //n：盘子数量
    }
    static void hanoi(int n, char a, char b, char c)
    {
        if (1 == n)/* 如果剩下一个盘子，直接从a-->c */
        {
            System.out.println(n+":"+a+"-->"+c);
        }
        else
        {
            /* 把n-1个盘子从a移动到b借助于c */
            hanoi(n - 1, a, c, b);
            System.out.println(n + ":" + a + "-->" + c );
           /* 把第n和盘子从a移动c */
            hanoi(n - 1, b, a, c);/* 把n-1个盘子从b移动到c借助于a */
        }
    }
    }

