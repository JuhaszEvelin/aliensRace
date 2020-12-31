package creature;

public class Stepper extends Creature{
    public Stepper(String name, Integer startWater){
        super(name, startWater, 12);
    }
    @Override
    public void oneDay(String weather){
        if (isAlive()){
            if (weather.equals("n")){
                this.water -= 2;
            }else if (weather.equals("f")){
                this.water--;
            }else{
                this.water += 3;
            }

            checkMaxWater();
            checkIsAlive();

            if (isAlive()){
                if (weather.equals("f")){
                    this.distance += 2;
                }else{
                    this.distance++;
                }
            }
        }
    }
}
