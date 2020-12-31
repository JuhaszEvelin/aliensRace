package creature;

public class Sponge extends Creature{

    public Sponge(String name, Integer startWater){
        super(name, startWater, 20);

    }

    @Override
    public void oneDay(String weather){
        if (isAlive()){
            if (weather.equals("n")){
                this.water -= 4;
            }else if (weather.equals("f")){
                this.water--;
            }else{
                this.water += 6;
            }

            checkMaxWater();
            checkIsAlive();

            if (isAlive()){
                if (weather.equals("f")){
                    this.distance++;
                }else if (weather.equals("e")){
                    this.distance += 3;
                }
            }
        }
    }
}
