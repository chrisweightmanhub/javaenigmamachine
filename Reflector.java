// Version 1.0
// Christopher Weightman 12/11/2020
// class simulating an enigma machine's reflector

public class Reflector implements RotorConstants // Class acts as a simple pre-set substitution cypher
{
    
    char[][] reflectionTable = new char[26][2];
    
    /**
     * Constructor for objects of class Reflector
     */
    public Reflector()
    {
        for (int i=0; i<26; i++){
            reflectionTable[i][0] = reflectorIData[i]; // first half of pairs
            reflectionTable[i][1] = reflectorIIData[i]; // second half of pairs
        } 
    }
    
        public char getReflectedValue(char valueToReflect)
    {
        for (int i = 0; i<26; i++){ // obtain value of reflected value
            if (reflectionTable[i][0] == valueToReflect){
                return reflectionTable[i][1];
            }
        }
    
        return 'F';
    }

}
