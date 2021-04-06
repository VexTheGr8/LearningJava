public class classes {
    public static void main(String[] args) {
        //classes

        String cpu;
        String pc_case;
        boolean DoesWork;

        Computer mypc = new Computer(cpu = "Intel i7",
         pc_case = "Glass PC Case",
         DoesWork = true);
         System.out.println(mypc);
    }

    static class Computer { //class that declares what variables somethings needs to be a variable
        
        String cpu;
        String pc_case; 
        boolean DoesWork;

        Computer(String brand, 
        String pc_case, 
        boolean DoesWork){

            this.cpu = cpu;
            this.pc_case = pc_case;
            this.DoesWork = DoesWork;


        }

    }
    
}
