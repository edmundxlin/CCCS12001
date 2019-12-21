package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        int pC = 0, pD = 0, pH =0, pS = 0;
        int x = 0;
        System.out.println("Cards Dealt              Points");
            for(int t = 0; t<c.indexOf('D'); t++){
                if(c.charAt(t)=='C'){
                    System.out.print("Clubs ");
                }
                else{
                    System.out.print(c.charAt(t) + " ");
                    
                    x++; 
                    if(c.charAt(t)=='A'){
                        pC+=4;
                    }
                    if(c.charAt(t)=='K'){
                        pC+=3;
                    }
                    if(c.charAt(t)=='Q'){
                        pC+=2;
                    }
                    if(c.charAt(t)=='J'){
                        pC+=1;
                    }
                }
                
            }
            if(x == 0){
                pC+=3;

            }
            if(x == 1){
                pC+=2;

                
            }
            if(x == 2){
                pC+=1;

            }
           

                System.out.println("           " + pC);

        
            System.out.println("\n");
            x=0;
            for(int y = c.indexOf('D'); y>=c.indexOf('D')&& y<c.indexOf('H'); y++){
                if(c.charAt(y)=='D'){
                    System.out.print("Diamonds ");
                }
                else{
                    System.out.print(c.charAt(y) + " ");
                    x++;
                    if(c.charAt(y)=='A'){
                        pD+=4;
                    }
                    if(c.charAt(y)=='K'){
                        pD+=3;
                    }
                    if(c.charAt(y)=='Q'){
                        pD+=2;
                    }
                    if(c.charAt(y)=='J'){
                        pD+=1;
                    }
                }
                
            }

            if(x == 0){
                pD+=3;

            }
            if(x == 1){
                pD+=2;

                
            }
            if(x == 2){
                pD+=1;

            }


                System.out.println("           " + pD);
            System.out.println("\n");
            x=0;

            System.out.println("\n");
            for(int s = c.indexOf('H'); s>=c.indexOf('H')&&s<c.indexOf('S'); s++){
                if(c.charAt(s)=='H'){
                    System.out.print("Hearts ");
                }
                else{
                    System.out.print(c.charAt(s) + " ");
                    x++;
                    if(c.charAt(s)=='A'){
                        pH+=4;
                    }
                    if(c.charAt(s)=='K'){
                        pH+=3;
                    }
                    if(c.charAt(s)=='Q'){
                        pH+=2;
                    }
                    if(c.charAt(s)=='J'){
                        pH+=1;
                    }
                }
                
            }

            if(x == 0){
                pH+=3;

            }
            if(x == 1){
                pH+=2;

                
            }
            if(x == 2){
                pH+=1;

            }


                System.out.println("           " + pH);


            System.out.println("\n");
            x=0;

            System.out.println("\n");
            for(int o = c.indexOf('S'); o>=c.indexOf('S')&&o<c.length(); o++){
                if(c.charAt(o)=='S'){
                    System.out.print("Spades ");
                }
                else{
                    System.out.print(c.charAt(o) + " ");
                    x++;
                    if(c.charAt(o)=='A'){
                        pS+=4;
                    }
                    if(c.charAt(o)=='K'){
                        pS+=3;
                    }
                    if(c.charAt(o)=='Q'){
                        pS+=2;
                    }
                    if(c.charAt(o)=='J'){
                        pS+=1;
                    }
                }
                
            }

            if(x == 0){
                pS+=3;

            }
            if(x == 1){
                pS+=2;

                
            }
            if(x == 2){
                pS+=1;

            }
        

                System.out.println("           " + pS);

            
            
 
            x=0;
            int u = pC+pS+pH+pD;
            System.out.println("Total " + u) ;


            
    }
}