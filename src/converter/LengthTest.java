package converter;

public class LengthTest {
    private static Length[] lengths =  Length.values();

    public static void main(String[] args) {
        for(Length x : lengths){
            System.out.println(x.toString()+ " = "+x.getValue());
        }
    }

}
