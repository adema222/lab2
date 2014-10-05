package model;

public class MenuItem {

    private String label;

    private String url;

    public MenuItem() {
        this.label = "Link";
        this.url = "#";
    }

    public MenuItem(String label, String url) {
        this.label = label;
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
