// Version 1.0
// Christopher Weightman 12/11/2020
// class simulating the main enigma machine function

import java.util.Scanner;

public class Machine
{
   
    private Scanner mainScanner = new Scanner(System.in); // scanner for input
    private Rotor r1 = new Rotor(0,0,1); // create rotors
    private Rotor r2 = new Rotor(0,0,2);
    private Rotor r3 = new Rotor(0,0,3);
    private Reflector ref1 = new Reflector(); // create reflector
    private Plugboard p1 = new Plugboard(); // create plugboard
    private char tempHolder;
    
    public Machine()
    {  
    }
    
    
    public void mainOperation(){
        
        int[] rotorConfig = new int[6]; // get rotor settings from user
        
        System.out.println("Welcome to the Enigma Machine");
        System.out.println("-----------------------------");
        System.out.println("Please enter configuration details");
        System.out.println();
        System.out.println("Rotor 1 Internal Displacement:");
        rotorConfig[0] =  Integer.parseInt(mainScanner.nextLine());
        System.out.println("Rotor 1 External Displacement:");
        rotorConfig[1] =  Integer.parseInt(mainScanner.nextLine());
        System.out.println("Rotor 2 Internal Displacement:");
        rotorConfig[2] =  Integer.parseInt(mainScanner.nextLine());
        System.out.println("Rotor 2 External Displacement:");
        rotorConfig[3] =  Integer.parseInt(mainScanner.nextLine());
        System.out.println("Rotor 3 Internal Displacement:");
        rotorConfig[4] =  Integer.parseInt(mainScanner.nextLine());
        System.out.println("Rotor 3 External Displacement:");
        rotorConfig[5] =  Integer.parseInt(mainScanner.nextLine());
 
        do 
            inputLoop();
        while (0==0);
        
        for (int i=0; i < i; i++){ // Encryption proccess
                
                tempHolder = p1.checkPluggedValue(tempHolder); // check plugboard
                tempHolder = r1.getRotoredValue(tempHolder); // through rotor
                tempHolder = r2.getRotoredValue(tempHolder); // through rotor
                tempHolder = r3.getRotoredValue(tempHolder); // through rotor
                tempHolder = ref1.getReflectedValue(tempHolder); // through reflector
                tempHolder = r3.getUnRotoredValue(tempHolder); // backwards through rotor
                tempHolder = r2.getUnRotoredValue(tempHolder); // backwards through rotor
                System.out.println(r1.getUnRotoredValue(tempHolder)); // backwards through rotor
            
        }
        
    }
    
    public void inputLoop(){
                
                tempHolder = mainScanner.nextLine().charAt(0);
                tempHolder = p1.checkPluggedValue(tempHolder); // check plugboard
                tempHolder = r1.getRotoredValue(tempHolder); // through rotor
                tempHolder = r2.getRotoredValue(tempHolder); // through rotor
                tempHolder = r3.getRotoredValue(tempHolder); // through rotor
                tempHolder = ref1.getReflectedValue(tempHolder); // through reflector
                tempHolder = r3.getUnRotoredValue(tempHolder); // backwards through rotor
                tempHolder = r2.getUnRotoredValue(tempHolder); // backwards through rotor
                System.out.println(r1.getUnRotoredValue(tempHolder)); // backwards through rotor
                
    }
}
