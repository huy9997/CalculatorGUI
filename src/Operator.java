import java.util.HashMap;

public abstract class Operator {
 
    private static HashMap operators = new HashMap();
    static{
    operators.put("+", new AdditionOperator());
    operators.put("-", new SubtractionOperator());
    operators.put("*", new MultiplicationOperator());
    operators.put("/", new DivisionOperator());
    operators.put("#", new HashOperator());
    operators.put("(", new OpenParentheses());
    operators.put(")", new ClosedParentheses());
    operators.put("^", new PowerOperator());
    }
    public static Operator getFunction(String token){
 
        return (Operator) operators.get(token);
    }
    
  public abstract int priority();
  public abstract Operand execute( Operand op1, Operand op2 );

  public static boolean check( String token ) {
      return operators.containsKey(token);
  }
}