public class SimpleException{
    static public void Vote(int age) throws ArithmeticException{
        try{
            if (age < 18){
                throw new ArithmeticException("Cannot Vote");
            }
            else{
                System.out.println("Can Vote");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Checked");
        }
    }
    public static void main(String[] args){
        Vote(10);
        Vote(100);
    }
}