package tictactoe;

public enum Players {
    PLAYER("user"),
    EASY_COMPUTER("easy"),
    MEDIUM_COMPUTER("medium");

    private final String text;

    Players(String text) {
        this.text = text;
    }

    public static boolean fromString(String text) {
        for (Players option : Players.values()) {
            if (option.text.equalsIgnoreCase(text)) {
                return true;
            }
        }

        return false;
    }
}
