package ex3_1;

public class MinusOp implements OperatorBean {

	int operand1;
	int operand2;
	
	@Override
	public int doOperate() {
		return operand1 - operand2;
	}

}










