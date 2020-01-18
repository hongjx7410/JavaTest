public class test05 {
    public static void main(String[] args) {
        //System.out.println("-------------------");
        //double radius = 1.5 ;
        //double pi = 3.14159265354 ;
        //double area =  pi * radius * radius ;
        //System.out.println(area);

        //System.out.println("-------------------");
        // String title = "C++学习指南（语法篇）";
        // String press = "清华大学出版社";
        // String writer = "邵发";
        // double price = 49.0;
        // String ISBM = "9787302419891";
        // System.out.println("书名："+title);
        // System.out.println("出版社："+press);
        // System.out.println("作者："+writer);
        // System.out.println("定价："+price);
        // System.out.println("ISBN："+ISBM);

        //System.out.println("-------------------( 第5章 数组对象)");
        //1)给定一个数组，请遍历输出每一个数 (从头到尾顺序)
        // int[] abc = { 29, 90, 48, 92};
        // for ( int i=0; i<abc.length; i++)
        // {
        // int n = abc[i];
        // System.out.print( n + " "); // 空格分开
        // }

        // 2)给定一个数组，输出其中6的倍数
        // int[] abc = { 20, 90, 48, 92};
        // for(int i= 0; i <abc.length; i++)
        // {
        // int n = abc[i];
        // if ( n % 6 == 0)
        // {
        // System.out.println("第" + (i+1) + "个数: " + n);
        // }
        // }

//        //3)已知一个数组，将里面的负数变成正值。写代码把 arr 里面所有的负数改成正的。
//        double[] arr = { 90.0, -98.34,  -10, 199 };
//        for(int i=0; i<arr.length; i++)
//        {
//            double it = arr[i];
//            if( it < 0)
//            {
//                arr[i] = 0 - it;
//            }
//        }
//        System.out.print("结果为: ");
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print( arr[i] + "  ");
//        }

//        已经两个数组 src 和 dst，要求写代码把src的内容拷贝到dst里
//          double[] src = { 4, 5.5,  6, 7.7 };
//          double[] dst =  new double[4];
//        for(int i=0; i<src.length && i<dst.length; i++)
//        {
//            dst[i] = src[i];
//            System.out.println(dst[i] );
//        }

//        定义两个数组 String[]  和 int[] ，并按行打印出来
//        System.out.println("姓名" + "  " + "分数");
//        String[] names = {"邵", "王", "张", "李" };
//        int[] scores = { 97, 89, 94, 93 };
//        for(int i=0; i <names.length; i++)
//        {
//            System.out.println(names[i] + ",    " + scores[i]);
//        }
        // 找出1000以内的所有的质数, 存到数组里
        int[] result = new int[50]; // 最多存50个
        int count = 0;
        for(int i=2; i<1000; i++)
        {
            // 判断 i 是否为质数
            boolean isPrime = true;
            for(int k=2; k<i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
        // 如果是质数，则存到数组result里
        if( isPrime )
        {
            result[ count ] = i;
            count ++;
            if(count >= result.length)
            {
                break; // 已经存满50个，则退出查找
            }
        }
        }
        // 把找到的质数打印输出
        for(int i=0; i<count; i++)
        {
            System.out.println( result[i] );
        }































    }
}
