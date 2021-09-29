public class Dog {
    private int drinkingTime;

    public Dog(int drinkdrank){
        this.drinkingTime = drinkdrank;
    }

    public void setDrinkTime(int drink){
    this.drinkingTime = drink;

    }

    public int getDrinkingTime() {

        return this.drinkingTime;
    }

    public boolean needsToGo(){
        if (drinkingTime < 4){
            return false;
        }
        else{
            return true;
        }
    }
}
