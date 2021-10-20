package ro.uvt.sablab3;

public class TableOfContents implements Element{
    private String title_;

    public TableOfContents(String title)
    {
        title_ = title;
    }

    @Override
    public String toString()
    {
        return title_;
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
