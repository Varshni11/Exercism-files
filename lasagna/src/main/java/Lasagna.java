public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
    return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int previous){
     int remaining=expectedMinutesInOven()-previous;
     return remaining;
}
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int layer){
        return layer*2;
}

    // TODO: define the 'totalTimeInMinutes()' method
  public  int totalTimeInMinutes(int layer,int working_time){
        return (layer*2 + working_time);
    }
}
