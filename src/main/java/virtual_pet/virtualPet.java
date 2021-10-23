package virtual_pet;

public class virtualPet {


    //        Instant variables/attributes/fields
    private String name;
    private int fatigue = 25;
    private int hunger = 30;
    private int thirst = 45;
    private int happy = 34;

    public virtualPet(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappy() {
        return happy;
    }


    public void tick() {
        this.fatigue += 10;
        this.hunger += 5;
        this.thirst += 3;
        this.happy += 10;

//          Jordan suggestion for checking if pet has died
//        if(hunger<=0){
//        }

    }


    public void sleep() {
        fatigue -= 25;
    }

    public void feedChicken() {
        hunger -= 21;
        happy +=15;
    }

    public void giveWater() {
        thirst -= 18;
    }
    public void play() {
        happy-= 30;
        fatigue +=10;
    }

    public void statusReport(){
        System.out.println(name + " has a fatigue level of "+fatigue);
        System.out.println(name + " has a hunger level of "+hunger);
        System.out.println(name + " has a thirst level of "+thirst);
        System.out.println(name + " has a happy level of "+thirst);

    }









}



