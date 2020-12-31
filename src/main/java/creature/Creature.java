package creature;

public abstract class Creature{
    private final String name;
    private final Integer maxWater;
    private boolean isAlive = true;
    protected Integer water = 0;
    protected int distance;

    public Creature(String name, Integer startWater, Integer maxWater){
        this.name = name;
        this.maxWater = maxWater;
        this.water = startWater > maxWater ? maxWater : startWater;
    }

    public boolean isAlive(){
        return this.isAlive;
    }

    public int getDistance(){
        return this.distance;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + ": " + (this.isAlive ? "is alive" : " is dead") + ", distance -> " + this.distance;
    }

    public abstract void oneDay(String weather);

    protected void checkMaxWater(){
        if (this.water > this.maxWater) this.water = this.maxWater;
    }

    protected void checkIsAlive(){
        this.isAlive = this.water > 0;
    }

}
