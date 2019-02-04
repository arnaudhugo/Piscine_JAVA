public class ActionInteraction implements Reaction {
    public ActionInteraction() {
    }

    public ReactionType getTypeReaction() {
	return(ReactionType.Talk);
    }

    public String getTextOfReaction() {
        return("Player talks to someone");
    }
}