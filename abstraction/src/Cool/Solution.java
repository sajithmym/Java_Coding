package Cool;

public class Solution extends abstraction_class{

    @Override
    public void calculate() {
        System.out.println("create by Solution class");
    }

    @Override
    public void calculate2(int s){
        int a = s*s;
        System.out.println("Value is "+a);
    }
}
