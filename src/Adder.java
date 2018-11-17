public class Adder extends CalculateBase{


    public Adder(double x, double y) {
        super(x, y);
    }

    @Override
    public void calculateExecutor(){
        double result = getX()+getY();
        setResult(result);
       }




}
