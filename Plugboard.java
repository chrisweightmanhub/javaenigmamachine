// Version 1.0
// Christopher Weightman 12/11/2020
// class simulating an enigma machine's plugboard

public class Plugboard
{

    private char[] alphabet = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[][] pairingTable = new char[26][2];
   
    public Plugboard()
    {
        for (int i=0; i<26; i++){
            pairingTable[i][0] = alphabet[i]; // fill pairing table with 13 pairs
            pairingTable[i][1] = alphabet[i];
        } 
    }
    
    public  String plugLetters(char l1, char l2){
        
        for (int i=0; i<26; i++){ // add pairs in table
            
            if (pairingTable[i][0] == l1){
                pairingTable[i][1] = l2;
            }
            
            if (pairingTable[i][0] == l2){
                pairingTable[i][1] = l1;
            }
            
        }
        
        return "Success. Letters plugged: " + l1 + " + " + l2;
    }
    
    public  String unplugLetters(char l1, char l2){
        
        for (int i=0; i<26; i++){ // remove pairs from table
            if (pairingTable[i][0] == l1){
                pairingTable[i][1] = pairingTable[i][0];
            }
            
            if (pairingTable[i][0] == l2){
                pairingTable[i][1] = pairingTable[i][0];
            }

        } 
        
        return "Success. Letters plugged: " + l1 + " + " + l2;
    }
    
    public char checkPluggedValue(char valueToCheck) // consult one side of table and find pair
    {
        
        for (int i = 0; i<26; i++){
            if (pairingTable[i][0] == valueToCheck){
                return pairingTable[i][1];
            }
        }
    
        return 'F';
    }

}
