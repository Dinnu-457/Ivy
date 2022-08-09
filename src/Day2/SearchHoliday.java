package Day2;

class Holiday {
    private String name;
    private int day;
    private String month;
// your code goes here
    Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static Boolean inSameMonth(Holiday h1,Holiday h2){
        if(h1.month.equals(h2.month)){
            return true;
        }
        return false;
    }
    public Double avgDate(Holiday h[]){
        double avg=0;
        for(int i=0;i<h.length;i++){
            this.day=h[i].day;
            avg+=this.day;
        }
        return (double) avg/h.length;
    }
}
public class SearchHoliday{
    public static void main(String[] args) {
        Holiday h=new Holiday("Independence Day",4,"July");
        Holiday hOne=new Holiday("BDay",11,"August");
        System.out.println(Holiday.inSameMonth(h,hOne));

    }
}