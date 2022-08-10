public class AttackFactory {
    
    public Attack getAttack(String attackType) {
        if (attackType == null) {
            return null;
        }
        if (attackType.equalsIgnoreCase("Brut Force")) {
            return new ForceBrute();
        } else if (attackType.equalsIgnoreCase("Dictionary")) {
            return new Dictionary();
        }
        return null;
    }
}