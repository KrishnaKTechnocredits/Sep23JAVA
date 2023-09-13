package mahavijay;

public class TestClass {
    void DataProcess(String a){
        int count=0;
        for(int i=a.length()-1; i>=0;i--) {

            if (a.charAt(i)=='t')
            {
                count++;
            }

        }System.out.println("frequency of t is"+count);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        abcd obj = new abcd();
        obj.DataProcess("technocredit");

    }

}