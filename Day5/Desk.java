public class Desk {
    private boolean isChair;
    private String material;
    private boolean isStorage;
    private double withered;
    private String yourbody;
    private double height;

    public Desk() {
        isChair = true;
        material = "wood";
        isStorage = true;
        withered = 100;
        yourbody = "Tired";
    }

    public double sit(double Howlongtosit){
        isChair = true;
        String yourBody = "rested";
        withered = withered - Howlongtosit;
        if (Howlongtosit >= 100){
            isChair = false;
        }
        return withered;
        
    }

    public boolean sittable(double height){
        boolean sittable;
            if (height > 48){
                sittable = false;
            }
            else{
                sittable = true;
            }    
        return sittable;

    }

    public void setmMaterial(String newMaterial) {
        material = newMaterial;
    }
    public String material(){
        return material;
    }
}
