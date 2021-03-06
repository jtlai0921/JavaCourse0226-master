package day05;

public class Algorithm4 {
    public static void main(String[] args) {
        String myid = "A213541581";
        int[] id =  new int[11]; // {1,0,1,2,3,4,5,6,7,8,9}
        if(myid.charAt(0) == 'A') {
            id[0] = 1;
            id[1] = 0;
        }
        for(int i=1;i<myid.length();i++) {
            id[i+1] = myid.charAt(i) - 48;
        }
        
        int[] dx = {1,9,8,7,6,5,4,3,2,1,1};
        int sum = 0;
        for(int i=0;i<id.length;i++) {
            sum += id[i] * dx[i];
        }
        System.out.println(sum);
        System.out.println(sum % 10);
        
    }
}

