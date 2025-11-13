import java.util.Scanner; // 【基础】需要用到Scanner来读取输入

public class q01ai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // 【对应规则】读取查询数量q

        // 【对应思路2】外层循环：处理q组查询
        for (int i = 0; i < q; i++) {
            // 【对应规则】读取一组查询的a, b, n
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // 【对应思路2-b】内层循环：生成长度为n的序列
            // 循环变量j从0开始，到n-1结束。条件`j < n`保证了循环会执行n次。
            // 为什么j从0开始？因为公式中的指数i是从0开始的。
            for (int j = 0; j < n; j++) {
                // 【对应规则2】核心计算：a + b * (2的j次方)
                // 使用Math.pow(2, j)来计算2的j次方。
                // (int) 是强制类型转换，因为Math.pow返回的是double，我们需要int。
                int term = a + b * (int) Math.pow(2, j);

                // 输出计算出的数字和一个空格
                System.out.print(term + " ");
            }
            // 【对应思路2-e】一组序列输出完毕，换行
            System.out.println();
        }
        sc.close();
    }
}