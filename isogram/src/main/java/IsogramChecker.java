import java.lang.reflect.Array;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase.equals("")) return true;
        for (int i = 0; i < phrase.length(); i++) {
            int finalI = i;
            long count = phrase.chars().map(Character::toLowerCase).filter(ch -> ch == phrase.charAt(finalI) && ch != '-' && ch != ' ').count();
            if (count >= 2 ) return false;
        }
        return true;
    }
}
