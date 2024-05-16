package Ouroboros;

public class Sking {

    private String skin;

    public Sking(String initialSking) {
       this.skin = initialSking;
    }

    public void grow() {
       System.out.println("grow\n");
    }

    public String getSkin() {
        return skin;
    }

    public String shed(){
        
        return skin.substring(3);
    }

    public int getSkize(){
    
        return skin.length();
    }

}
