public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String desc;
        switch(shirtNum){
            case 1:
                desc = "goalie";
                break;
            case 2:
                desc = "left back";
                break;
            case 3:
                desc = "center back";
                break;
            case 4:
                desc = "center back";
                break;
            case 5:
                desc = "right back";
                break;
            case 6:
                desc = "midfielder";
                break;
            case 7:
                desc = "midfielder";
                break;
            case 8:
                desc = "midfielder";
                break;
            case 9:
                desc = "left wing";
                break;
            case 10:
                desc = "striker";
                break;
            case 11:
                desc = "right wing";
                break;
            default:
                throw new IllegalArgumentException("IllegalArgumentException");
            
                
                
        }
        return desc;
    }
}
