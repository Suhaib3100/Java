import java.util.*;
public class q14{
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        String[] playlist={"Bekhayali","Ashiqui","One Love","Khairiyat"};
        for(String element:playlist){
            System.out.println(element+"\n");
        }
        System.out.println("Enter the song to find out the position");
        String song= sc.nextLine();
            int taget=-1;
            for(int i=0;i<playlist.length;i++){
                if(playlist[i].equalsIgnoreCase(song)){
                    taget=i;
                    break;
                }
            }
                    System.out.println(taget);
}
}