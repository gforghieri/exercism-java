class RaindropConverter {

    String convert(int number) {
        String res = "";
        if (number % 3 == 0) {
            System.out.println("Pling");
            res += "Pling";
        }
        if (number % 5 == 0) {
            System.out.println("Plang");
            res += "Plang";
        }
        if (number % 7 == 0) {
            System.out.println("Plong");
            res += "Plong";
        }
        else if (res.equals("")) {
            return Integer.toString(number);
        }
        return res;
    }
}
