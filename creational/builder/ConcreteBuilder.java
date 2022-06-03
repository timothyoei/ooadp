public class ConcreteBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("============================\n");
        buffer.append(title);
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append(str);
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("   ");
            buffer.append(item);
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}