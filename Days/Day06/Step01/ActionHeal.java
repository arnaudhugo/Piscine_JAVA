public class ActionHeal implements Reaction {
    public ActionHeal() {
    }

    public ReactionType getTypeReaction() {
	return(ReactionType.Heal);
    }

    public String getTextOfReaction() {
	return("Player gets health");
    }
}