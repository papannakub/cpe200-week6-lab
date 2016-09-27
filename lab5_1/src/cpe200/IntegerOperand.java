package cpe200;

import sun.jvm.hotspot.asm.Operand;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private  String operand;
    public IntegerOperand(int i) {
        this.operand = Integer.toString(i);
    }

    @Override
    public String getOperand() {
        return this.operand;
    }
}
