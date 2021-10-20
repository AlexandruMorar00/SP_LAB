package ro.uvt.sablab3;

public class Image implements Element {
    private String url;

    @Override
    public String toString()
    {
        return url;
    }

    @Override
    public void print()
    {
        System.out.print(this);
    }

    @Override
    public void add(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public void remove(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public Element get(int index)
    {
        throw new UnsupportedOperationException();
    };
}
