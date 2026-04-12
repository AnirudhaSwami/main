
class Information{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
}


//Main class
public class J006_GetterSetter {

    public static void main(String[] args){

        Information Info = new Information();
        Info.setName("Anirudha");

        System.out.println(Info.getName());
    }
    
}
