public class Driver {
    public static void main(String[] args) {
        HashMap hs=new HashMap();
        hs.put(12, "Dell");
        hs.put(24, "Hi");
        hs.put(13, "Lenovo");
        hs.put(1, "Asus");
        hs.put(5, "HP");
        hs.put(9, "HP");
        hs.put(8, "HP");
        hs.put(2, "HP");
        hs.put(10, "HP");
        hs.put(4, "HP");
        // hs.put(3, "HP");
        // System.out.println(hs.get(12));
        // System.out.println(hs.get(11));
        // System.out.println(hs.get(1));
        System.out.println(hs.remove(1));
        System.out.println(hs.get(1));
    }
}
