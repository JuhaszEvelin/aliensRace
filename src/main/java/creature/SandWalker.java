package creature;

public class SandWalker extends Creature{
    public SandWalker(String name, Integer startWater){
        super(name, startWater, 8);
    }

    @Override
    public void oneDay(String weather){
        if (isAlive()){
            if (weather.equals("n")){
                this.water--;
            }else if (weather.equals("e")){
                this.water += 3;
            }

            checkMaxWater();
            checkIsAlive();

            if (isAlive()){
                if (weather.equals("n")){
                    this.distance += 3;
                }else if (weather.equals("f")){
                    this.distance++;
                }
            }
        }
    }
}
