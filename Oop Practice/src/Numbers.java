public class Numbers {
    public static void main(String[] args) {
        class Number{
            int number;
            public boolean isPositive(){

                if(number>0){
                    return true;
                }
                else{
                    return false;
                }
            }

        }
        Number myNumber = new Number();
        Number myNumber2 = new Number();

        myNumber.number = 7;
        myNumber2.number = -87;

        if(myNumber.isPositive()){
            System.out.println(myNumber.number+" is positive.");
        }
        else {
            System.out.println(myNumber.number+" is not positive.");
        }

        if(myNumber2.isPositive()){
            System.out.println(myNumber2.number+" is positive.");
        }
        else {
            System.out.println(myNumber2.number+" is not positive.");
        }
    }



}
