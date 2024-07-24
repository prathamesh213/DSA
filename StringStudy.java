import java.util.ArrayList;

public class StringStudy {
    
    public static void main(String[] args) {
     System.out.println("a" + "b"); // this double quotes define string thus it is concatenated
     System.out.println('a' + 'b'); //calls to ascii value and gives a interger value   
     System.out.println('a' + '1'); //its calling ascii value of 1 and a and then adding to give 146 
     System.out.println('a' + 1);//its calling ascii value of a and adding to integer 1
     System.out.println("1" + new ArrayList<>() );// + can be used with only primitive operators and if not then one the objects has to be String
     } 
}
