
import java.util.Scanner;

public class EvaluatorTester {
  public static void main(String[] args) {
    Evaluator evaluator = new Evaluator();
   
    for ( String arg : args ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );
      System.out.println( arg + " = " + evaluator.eval( arg ) );
    }
    /*
    This is was used for test cases. 
    
    Scanner test = new Scanner(System.in); 
    String testcases = test.next();
    System.out.println("please enter customInput if you would like to run through all the test cases given");
    System.out.println("If you would like to test custom input please press any key");
    if(testcases == "customInput"){
        
    }else{
    while(test.hasNext()){
        
        System.out.println(evaluator.eval(testcases));
        
        }
    }*/
  }
}
