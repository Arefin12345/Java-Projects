public class FloatTest {
    public static void main(String[] args) {
        float velocity = 0.1f;
        float gravity = 0.8f;

        if(gravity>velocity){
            System.out.println(gravity+" is bigger than "+velocity);
        }
        else{
            System.out.println(velocity+" is bigger than "+gravity);
        }

//        System.out.println(velocity+gravity);
    }
}
