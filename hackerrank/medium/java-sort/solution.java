

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b ) {
        if (b.score != a.score) {
            return b.score - a.score; // Descending order of score
        } else {
            return a.name.compareTo(b.name); // Alphabetical order of name
        }
    }
}
