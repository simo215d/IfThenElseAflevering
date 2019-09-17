public class Month {

    public static void main(String[] args) {
        //Math.random() genererer en randowm mellem 0 og 1. eksluderende 1.
        //(int) foran betyder, at den runder tallene ned til nermeste integer
        //*12, så loftet løftes til 12, men vi får tal mellem 0 og 11
        //så vi lægger 1 til så vi får tal mellem 1 og 12
        int month = (int)(Math.random()*12+1);
        switch (month){
            case 1:
                System.out.println("It is january");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
        }
        //Hvis det er en måned som er mellem [4:9] så er det sommer.
        // Hvis måneden er december(12), så er det jul, eller er det normal vinter.
        if(month > 3 && month < 10){
            System.out.println("It is summer and the sun is warm");
        } else if(month == 12){
            System.out.println("Santa Claus is coming to town");
        } else{
            System.out.println("It is currently winter and is snowing outside");
        }
    }
}
