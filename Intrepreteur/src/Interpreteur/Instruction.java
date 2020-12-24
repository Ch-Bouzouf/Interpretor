package Interpreteur;


public class Instruction {
	//Liste des instructions cibles
	 public enum Type{
	        LOAD , LOADC , STORE ,ADD , SUB ,MUL ,DIV ,EQUAL, INF,SUP, INFE
	        ,SUPE ,JZERO,JUMP ,READ ,WRITEC , WRITE  , END
	    }
	
    public String oper;
    public String operd;

    public  Instruction(){
        this.operd = null;
        this.oper = null;
    }

    public Instruction(String oper, String operd ){
        this.operd = operd;
        this.oper = oper;
    }
}