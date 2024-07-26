// Program to pass the value in parameters in a function call @vinaypandey0001

public class Function_2 {
    public static void MyMathod(String fname , int age){ // here we declare the parameters 
        System.out.println(fname + " pandey "+ age +" years old");
    }
    public static void main(String[] args) {
        MyMathod("Vinay", 51); // passing the value in parameters 
        MyMathod("Shivani", 52);
    }

}
