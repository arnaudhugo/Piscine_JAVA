public interface Reaction {
    
    ReactionType getTypeReaction();

    String getTextOfReaction();

    void action(Player player);
}