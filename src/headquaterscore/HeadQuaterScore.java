/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterscore;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class HeadQuaterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScore = new LiveScoreBean();
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        
        liveScore.addPropertyChangeListener(s1);
        liveScore.addPropertyChangeListener(s2);
        
        Scanner sc = new Scanner(System.in);
        String newScore = "";
        while(true){
        System.out.print("Enter Score Thai - UAE : ");
        newScore = sc.nextLine();
        if(newScore.equals("")) break;
        else liveScore.setScore(newScore);
        }
        System.out.print("------------End------------");
    }

    
}
