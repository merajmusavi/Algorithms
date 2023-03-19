public class Main {
    public static void main(String[] args) {
     int[] number = {1,2,3,4,-1,-2,-3,0,0};
     int nn = 0;
     int pn = 0;
     int zn = 0;
        for (int i : number) {
            if (i>0){
                pn++;
            }else if (i<0){
                nn++;
            }else {
                zn++;
            }
        }

        System.out.println("n=>"+nn+"p=>"+pn+"z=>"+zn);
    }

}