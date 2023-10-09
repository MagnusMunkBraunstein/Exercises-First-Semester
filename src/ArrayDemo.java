public class ArrayDemo {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0]=3;
        num[1]=7;
        num[2]=0;
        num[3]=-3;
        num[4]=9;

        int[] num2 ={4,2,7,5,8,2,5,3,8,5,4};

        System.out.println(num);
        for (int i=0; i<num.length; i++)
        System.out.println(num[i]);

        int s=sum(num);
        System.out.println("sum"+s);

        for (int i=0; i< num2.length; i++)
            System.out.println();

        int s2 = sum(num2);
        System.out.println("sum af s2= "+s);
    }

    static int sum(int[] arr){
    int result = 0;
    for (int i=0; i< arr.length; i++)
        result=result+arr[i];
    arr[2]=100;
    return result;
    }
}
