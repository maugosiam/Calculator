public class Substracter extends CalculateBase{


    public Substracter(double x, double y) {
        super(x, y);
    }


    @Override
    public void calculateExecutor(){
        double result = getX()-getY();
        setResult(result);
    }

    


}
