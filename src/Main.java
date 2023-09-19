public class Main {
    public static void main(String args[]){
        int volume = 1600;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int pool = 0;
        int perSecond = 0;

        while(true){
            if(pool <= volume){
                pool = pool + fillingSpeed - devastationSpeed;
                perSecond ++;
            } else {
                System.out.print(perSecond + "seconds");
                break;
            }

        }




    }
}
