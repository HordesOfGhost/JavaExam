class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}

public class CustomException{
    static public void checkAge(int age) throws InvalidAgeException{
        if (age < 0){
            throw new InvalidAgeException(age + " Age is Invalid");
        }
        else{
            System.out.println("Valid Age");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(-10);
            checkAge(90);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }   
    }
}