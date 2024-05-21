class HelloWorld {
    
    static void checkIfDigit(char character){
      if ((character >= '0' & character <= '9')|(character >= 'a' & character <= 'z')|(character >= '!' | character <= '+')){
        System.out.println(character +" is digit");
      }else{
        System.out.println(character +" is not digit");
      }
    }
    public static void main( String args[] ) {
        
        checkIfDigit('e');
        checkIfDigit('1');
        checkIfDigit('3');
        checkIfDigit('@');
        checkIfDigit('4');
    }
}