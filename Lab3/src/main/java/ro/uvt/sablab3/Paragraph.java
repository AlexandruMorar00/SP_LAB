package ro.uvt.sablab3;

public class Paragraph implements Element{
    private String text_;

    public Paragraph(String text)
    {
        text_ = text;
    }

    @Override
    public String toString()
    {
        return text_;
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
