//Property of Devindra A. Ramcharan CSCI 212 111B
public class Appliance {
    private String serialNum;
    public Appliance(String serialNum){
        this.serialNum = serialNum;
    }
    public String getserialNum(){
        return serialNum;
    }
    public char getType(){
        return serialNum.charAt(0);
    }
    public String toString(){
        return serialNum;
    }
}

