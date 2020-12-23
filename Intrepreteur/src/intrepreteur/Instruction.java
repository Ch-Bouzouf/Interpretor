
package intrepreteur;


public class Instruction {

    public enum Type{
        LOAD , LOADC , STORE ,ADD , SUB ,MUL ,DIV ,EQUAL, INF,SUP, INFE
        ,SUPE ,JZERO,JUMP ,READ ,WRITEC , WRITE  , END
    }
    
    private Type operation ;
    private String operant ;

    public Instruction() {
    }

     public Instruction(Type operation) {
        this.operation = operation;
    }
    
    public Instruction(Type operation, String operant) {
        this.operation = operation;
        this.operant = operant;
    }

    public Type getOperation() {
        return operation;
    }

    public void setOperation(Type operation) {
        this.operation = operation;
    }

    

    public void setOperant(String operant) {
        this.operant = operant;
    }

    public String getOperant() {
        return operant;
    }
    
    
}
