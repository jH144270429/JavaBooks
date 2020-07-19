/**
 * @program JavaBooks
 * @description: 测试
 * @author: mf
 * @create: 2020/05/24 00:04
 */

package Test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

//        Pair
//        int[] a = new int[]{1,2, 3};

//        int[] b = new int[3];

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);

//        int[] c = list.stream().mapToInt(Integer::valueOf).toArray();
//        for (int i : c) {
//            System.out.println(i);
//        }

//        int[] c = a;
//        c[0] = 3;
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(c));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < n; k++) {
            String s = sc.nextLine();
            // 双指针
            boolean flag = true;
            int i = 0, j = s.length() - 1;
            while(i < j){
                if (s.charAt(i) != s.charAt(j)){
                    if(isVaild(s, i, j - 1)){
                        System.out.println(j);
                        flag = false;
                        break;
                    } else if(isVaild(s, i + 1, j)){
                        System.out.println(i);
                        flag = false;
                        break;
                    }
                }
                i++;
                j--;
            }
            if (flag)
                System.out.println(-1);
        }
    }
    public static boolean isVaild(String s, int i, int j){
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
