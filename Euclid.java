class Euclid {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        while (n > 0){
            int nc = n;
            n = m % n;
            m = nc;
        }
        System.out.println(m);
    }
}