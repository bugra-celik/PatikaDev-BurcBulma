import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün:");
        day = input.nextInt();

       if(month == 1) {
           if (day >= 1 && day <= 31) {
               if (day < 22) {
                   burc = "Oğlak";
               } else {
                   burc = "Kova";
               }
           } else {
               isError = true;
           }
       }else if( month == 2){
           if(day >= 1 && day <=28){
               if(day < 20){
                   burc = "kova";
               }else{
                   burc = "balık";
               }
           }
           else{
               isError = true;
           }
       }else if( month == 3){
           if(day >= 1 && day <= 31){
               if(day < 21){
                   burc = "balık";
               }else{
                   burc = "koç";
               }
           }else{
               isError = true;
           }
       }else if( month == 4){
           if(day >= 1 && day <= 30){
               if(day < 21){
                   burc = "koç";
               }else{
                   burc = "boğa";
               }
           }else{
               isError = true;
           }
       }else if( month == 5){
           if(day >= 1 && day <= 31){
               if(day < 22){
                   burc = "boğa";
               }else{
                   burc = "ikizler";
               }
           }else{
               isError = true;
           }
       }else if( month == 6){
           if(day >= 1 && day <= 30){
               if(day < 23){
                   burc = "ikizler";
               }else{
                   burc = "yengeç";
               }
           }else{
               isError = true;
           }
       }else if( month == 7){
           if(day >= 1 && day <= 31){
               if(day < 23){
                   burc = "yengeç";
               }else{
                   burc = "aslan";
               }
           }else{
               isError = true;
           }
       }else if( month == 8){
           if(day >= 1 && day <= 31){
               if(day < 23){
                   burc = "aslan";
               }else{
                   burc = "başak";
               }
           }else{
               isError = true;
           }
       }else if( month == 9){
           if(day >= 1 && day <= 30){
               if(day < 23){
                   burc = "başak";
               }else{
                   burc = "terazi";
               }
           }else{
               isError = true;
           }
       }else if( month == 10){
           if(day >= 1 && day <= 31){
               if(day < 23){
                   burc = "terazi";
               }else{
                   burc = "akrep";
               }
           }else{
               isError = true;
           }
       }else if( month == 11){
           if(day >= 1 && day <= 30){
               if(day < 22){
                   burc = "akrep";
               }else{
                   burc = "yay";
               }
           }else{
               isError = true;
           }
       }else {
           if(day >= 1 && day <= 31){
               if(day < 22){
                   burc = "yay";
               }else{
                   burc = "oğlak";
               }
           }else{
               isError = true;
           }
       }


        if(isError){
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz");
        }
        else{
            System.out.println("Burcunuz: " +burc);
        }
    }
}
