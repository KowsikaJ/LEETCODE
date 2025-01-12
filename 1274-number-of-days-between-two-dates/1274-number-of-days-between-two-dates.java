class Solution {
    int[] month=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(cal(date1)-cal(date2));
    }
    public int cal(String date){
        String[] dat=date.split("-");
        int year=Integer.parseInt(dat[0]),mon=Integer.parseInt(dat[1]),day=Integer.parseInt(dat[2]);
        int count=day;

        for(int i=1971;i<year;i++)count+=isleap(i)?366:365;
        for(int i=0;i<mon-1;i++)count+=month[i];
        if(mon>2 && isleap(year))count+=1;
        return count;

    }
    public boolean isleap(Integer y){
        return y%400==0 || (y%4==0 && y%100!=0);
    }
}