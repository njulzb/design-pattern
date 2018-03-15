package others.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaLearning {
    public static void nonameClass(){
        new Thread(()->System.out.println("others/lambda")).start();
        new Thread(()->System.out.println("come on")).start();
    }

    public static void foreach(){
        List<String> list = (Arrays.asList("lzb","lyb","lzc","lyf"));
        list.forEach((x)->System.out.println(x));
    }


    public static void map(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().map(x->x+1).forEach(x->System.out.println(x));
    }

    public static void reduce(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int result = list.stream().reduce((sum,x)->sum+x).get();
        System.out.println(result);
    }
    public static void main(String[] args){
        LambdaLearning.nonameClass();
        LambdaLearning.foreach();
        LambdaLearning.map();
        LambdaLearning.reduce();


    }
}
