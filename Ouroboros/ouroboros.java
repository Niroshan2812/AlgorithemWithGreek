package Ouroboros;

class ouroboros {
    private Sking sking;
    private String core;

    public ouroboros(String initialSking, String core) {
        this.sking = new Sking(initialSking);
        this.core = core;
    }

    public void iterate() {
        // life: add element
        sking.grow();

        // deth
        if (sking.getSkize() > 10) {
            System.out.println("die");
            String newSking = sking.shed();
            newSking += core.substring(0, 3);
            
            sking = new Sking(newSking);
        }
        
    }

    public static void main(String[] args) {
        ouroboros oroboro =  new ouroboros("0","0");

         // nirwana - Let's decide How much life you have to live 
        // So this i represent the how much life you spend all over the world In this senario I = 10 so he/she have only 10 life to spend 
        for (int i =0; i<10;i++){
            oroboro.iterate();
            System.out.println("Life counting: "+ i);
        }
    }
}