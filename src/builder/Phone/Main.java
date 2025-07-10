package builder.Phone;

public class Main {

    public static void main(String[] args) {
        
        Phone p1 = new PhoneBuilder().setOs("iOS").setRam(2).getPhone(); 
        // no worry about the sequenece as we would have needed when we used a Constructor; 
        // we can set the parameter as and however we want

        System.out.println(p1);

    }

}
