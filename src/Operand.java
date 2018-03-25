public class Operand {
    private int value;
    private String token;
  public Operand( String token ) {
      // +,-,/,* !,!, 
      //using a lisp operating system.
      value=Integer.parseInt(token);
  }

  public Operand( int value ) {
     this.value=value;
  }

  public int getValue() {
      return value;
  }
  public static boolean check( String token ) {
      for(int i=0; i<token.length();i++){
          if(Character.isDigit(token.charAt(i))){
              return true;
          }
      }
      return false; 
  }
}
