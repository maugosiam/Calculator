public class Program {
    public static void main(String args[]){

        CalculateBase calculators[] = {
                new Adder(5d, 6d),
                new Substracter(90d, 14d),
                new Multiplyier(3d, 7d)
        };


        for(CalculateBase i:calculators){
            i.calculateExecutor();
            System.out.println(i.getResult());
        }
    }
}
