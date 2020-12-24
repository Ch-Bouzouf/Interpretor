package intrepreteur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Interpreteur {
	int C1;
    Memoire memoire = new Memoire();
 
    Pile<String> pile = new Pile<>();
    
    static ArrayList<Instruction> vis = new ArrayList<>();
    
    public Interpreteur(String text) {
        init(text);
        executer();
    }
    
    private static void init(String text){
        String[] insts = text.split("\n");
        for(String inst : insts){
            String[] ops = inst.split(" ");
            String operation = ops[0];
            String operant = (ops.length == 2) ? ops[1] : "";
            if(operation.equals("load")){
                vis.add(new Instruction(Instruction.Type.LOAD, operant));
            }else if(operation.equals("loadc")){
                vis.add(new Instruction(Instruction.Type.LOADC, operant));
            }else if(operation.equals("add")){
                vis.add(new Instruction(Instruction.Type.ADD));
            }else if(operation.equals("end")){
                vis.add(new Instruction(Instruction.Type.END));
            }else if(operation.equals("store")){
                vis.add(new Instruction(Instruction.Type.STORE, operant));
            }else if(operation.equals("write")){
                vis.add(new Instruction(Instruction.Type.WRITE, operant));
            }else if(operation.equals("writec")){
                vis.add(new Instruction(Instruction.Type.WRITEC, operant));
            }else if(operation.equals("jump")){
                vis.add(new Instruction(Instruction.Type.JUMP, operant));
            }else if(operation.equals("sub")){
                vis.add(new Instruction(Instruction.Type.SUB));
            }else if(operation.equals("mul")){
                vis.add(new Instruction(Instruction.Type.MUL));
            }else if(operation.equals("div")){
                vis.add(new Instruction(Instruction.Type.DIV));
            }else if(operation.equals("sup")){
                vis.add(new Instruction(Instruction.Type.SUP));
            }else if(operation.equals("inf")){
                vis.add(new Instruction(Instruction.Type.INF));
            }else if(operation.equals("equal")){
                vis.add(new Instruction(Instruction.Type.EQUAL));
            }else if(operation.equals("jzero")){
                vis.add(new Instruction(Instruction.Type.JZERO, operant));
            }else if(operation.equals("supe")){
                vis.add(new Instruction(Instruction.Type.SUPE));
            }else if(operation.equals("infe")){
                vis.add(new Instruction(Instruction.Type.INFE));
            }
           
        }
         

    }
    
    
      private void executer(){
        Instruction instructionCorant ;
        for (int CO=0; CO<vis.size(); CO++) {	
         if (!vis.get(CO).getOperation().equals(Instruction.Type.END))	{
            instructionCorant = vis.get(CO) ;         
            switch(instructionCorant.getOperation()){
                case LOAD : 
                    pile.empiler(memoire.getObject(Integer.valueOf(instructionCorant.getOperant())));   
                    break;
                case LOADC :
                    int operant = Integer.parseInt(instructionCorant.getOperant());
                    pile.empiler(Integer.toHexString(operant));
                    break;
                case ADD :
                    Integer o1 = Integer.parseInt(pile.getElement());
                   
                    Integer o2 = Integer.parseInt(pile.getElement());
                     o1 +=o2;
                    String tempString = "" + o1;
                    pile.empiler(tempString);
                    break;
                case STORE :
                    memoire.addObject(pile.depiler(),Integer.valueOf(instructionCorant.getOperant()));
                    break;
                case WRITE :
                    int address = Integer.parseInt(instructionCorant.getOperant());
                    System.out.println(memoire.getObject(address));
                    break;
                case WRITEC :
                    System.out.println(instructionCorant.getOperant());
                    break;
                case JUMP :
                    CO = Integer.parseInt(instructionCorant.getOperant());
                    break;
                case EQUAL :
                    int x1 = Integer.decode(pile.depiler());
                    int x2 = Integer.decode(pile.depiler());
                    if(x1 == x2){
                        pile.empiler(Integer.toHexString(1));
                    }else {
                        pile.empiler(Integer.toHexString(0));
                    }
                    break;
                case JZERO :
                    int i = Integer.decode(pile.depiler());
                    if(i==0){
                        CO = Integer.parseInt(instructionCorant.getOperant());
                    }
                    break;
			
            }
         
         System.out.println(vis); 
         System.out.println(pile.getElement()); 
         System.out.println(CO); 

         }
        }
        }
      public static void main(String[] args)  {
          
          
          
          File f = new File("source.text");
          try {
  			Scanner scanner = new Scanner(f);
  			while ( scanner.hasNext()) {
  				String text= scanner.nextLine() ;
  			    System.out.println(text); 
  			    
  			}	
  			
  			
  		} catch (FileNotFoundException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
          
        
      }
}
