public class Multiplyier extends CalculateBase{


    public Multiplyier(double x, double y) {
        super(x, y);
    }


    @Override
    public void calculateExecutor(){
        double result = getX()*getY();
        setResult(result);
    }

    


}
