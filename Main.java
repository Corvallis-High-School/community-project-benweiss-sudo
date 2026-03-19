public class Main {
    public static void main(String[] args)
    {
        ArrayList<Unemployment> list = new ArrayList<>();
        list.add(new UnemploymentGreater6mo("Alice", 450.0, 15, 120));
        list.add(new UnemploymentGreater6mo("Bob", 320.0, 8, 500));
        System.out.println("Unemployment");
        printAll(list);
        findAndPrint(list, "Alice");
    }
    public static void findAndPrint(ArrayList<Unemployment> list, String name) {
        for (Unemployment u : list) {
            if (u.claimantName.equalsIgnoreCase(name)) {
                u.print(1); 
                return;
            }
        }
        System.out.println("No record found for " + name);
    }
  }