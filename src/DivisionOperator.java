/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DivisionOperator extends Operator{

    @Override
    public int priority() {
        return 3; 
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        int value1 = op1.getValue();
        int value2 = op2.getValue();
        Operand result = new Operand(value1/value2);
        return result;
    }
    
}
