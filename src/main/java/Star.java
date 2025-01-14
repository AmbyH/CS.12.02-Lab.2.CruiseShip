public class Star {
    private String actorName;
    private String characterName;
    public Star(String actorName, String characterName) {
        this.actorName = actorName;
        this.characterName = characterName;
    }
    //Returns the name of the actor.
    public String getActorName() {
        return actorName;
    }
    //Returns the name of the character.
    public String getCharacterName() {
        return characterName;
    }
    //Sets the name of the actor.
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    //Sets the name of the character.
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    @Override
    public String toString() {
        return actorName + " as " + characterName;
    }
}
