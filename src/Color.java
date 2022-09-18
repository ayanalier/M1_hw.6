public enum Color {
    LIFE( "\u001B[33m"),
    DAMAGE("\u001B[34m");
private String name;


    protected String getName() {
        return name;
    }

    Color(String name) {
        this.name=name;

    }


    }



